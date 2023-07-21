package C202307;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.PreparedStatement;

public class C230721 {

	public static void main(String[] args) {
		//필요한 jar json, mysql 커넥터
		
		// API 키를 저장하는 변수
		String ServiceKey = "API KEY";
		// API 연결하는 기본 URL
		String aUrl = "https://api.themoviedb.org/3/discover/movie?";
		// API 요청의 구성 요소
		String list = "&include_adult=false&include_video=false&language=ko-KR&region=KR&sort_by=popularity.desc&year=2015&page=";

		// 첫 페이지의 총 페이지 수를 가져옴
		int totalPages = getTotalPages(aUrl + ServiceKey + list);
		System.out.println(totalPages);

		// 모든 페이지에 대해 영화 정보를 가져오고 데이터베이스에 저장
		// p는 페이지 수 증가 이를 통해 10초마다(해당 api 제한사항) 1~n페이지까지 데이터를 불러옴
		for (int p = 1; p <= 48; p++) {
		    System.out.println(p);
		    URL apiurl = new URL(aUrl + ServiceKey + list + p);
		    HttpURLConnection apiurlconn = (HttpURLConnection) apiurl.openConnection();
		    apiurlconn.setRequestMethod("GET");
		    
		    // 영화 정보를 읽어오는 코드   
		    BufferedReader br = new BufferedReader(new InputStreamReader(apiurlconn.getInputStream()));
		    StringBuilder sb = new StringBuilder();
		    String line;
		    while((line = br.readLine()) != null) {
		        sb.append(line);
		    }
		    String jsonStr = sb.toString();
		    br.close();
		    apiurlconn.disconnect();
		    
		    // 읽어온 데이터를 JSON 객체로 변환
		    //JSON 변환 후 파싱함
		    JSONObject jsonObj = new JSONObject(jsonStr);
		    JSONArray jsonArray = jsonObj.getJSONArray("results");
		    System.out.println(jsonArray);
		    // JSONArray로부터 영화 정보를 데이터베이스에 저장
		    for(int i = 0; i < jsonArray.length(); i++) {
		        JSONObject dataObj = jsonArray.getJSONObject(i);
		        int col1 = dataObj.getInt("id");
		        String col2 = dataObj.getString("title");
		        String col3 = dataObj.getString("release_date");
		        double col4 = dataObj.getDouble("vote_average");
		            
		        // 데이터베이스에 영화 정보를 저장하는 코드 존재하는 데이터를 삽입하지 않기 위해 IGNORE를 사용
		        PreparedStatement pstmt = conn.prepareStatement("insert IGNORE into tbl_movie values(?,?,?,?)");
		        pstmt.setInt(1, col1);
		        pstmt.setString(2, col2);
		        pstmt.setString(3, col3);
		        pstmt.setDouble(4, col4);
		        int rowsAd = pstmt.executeUpdate();
		        result += rowsAd;
		        pstmt.close();
		    }
		    // 10초 대기 후 다음 페이지에 대한 정보를 가져옴
		    if (p < totalPages) {
		        Thread.sleep(10000);
		    }
		}
		return result;

		// totalPages
		private static int getTotalPages(String firstPageUrl) throws Exception {
		    URL apiurl = new URL(firstPageUrl);
		    HttpURLConnection apiurlconn = (HttpURLConnection) apiurl.openConnection();
		    apiurlconn.setRequestMethod("GET");

		    // 첫 페이지 총 페이지 수 읽기
		    BufferedReader br = new BufferedReader(new InputStreamReader(apiurlconn.getInputStream()));
		    StringBuilder sb = new StringBuilder();
		    String line;
		    while((line = br.readLine()) != null) {
		        sb.append(line);
		    }
		    String jsonStr = sb.toString();
		    br.close();
		    apiurlconn.disconnect();

		    // JSON 객체로 변환하고 총 페이지 수 반환
		    JSONObject jsonObj = new JSONObject(jsonStr);
		    return jsonObj.getInt("total_pages");
		}

	}

}
