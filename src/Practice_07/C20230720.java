package Practice_07;




public class C20230720 {
	public static void main(String[] args) {

		07/20

//		QnA Dao,Dto 수정 전에 복습



//		예제1)

	//  public QnADto select(String title) throws Exception{

//		title을 토대로 검색

//			

//			QnADto dto=null;

//			QNADto 초기값을 null로 설정

		

//			pstmt=conn.prepareStatement("select * from tbl_QnA where title=?");

//			tbl_QnA위치를 찾아서 SQL실행 준비

		

//			pstmt.setString(1, title);

//			위치설정

		

//			rs=pstmt.executeQuery();

//			SQL실행

		

//			if(rs!=null && rs.isBeforeFirst())

//			{

//			rs이 null이 아니거나 rs 초기값설정되면

		

//				rs.next();

//			다음으로 넘어감

		

//				dto=new QnADto();			

//				 dto.setNo(rs.getInt("no"));

//		            dto.setId(rs.getString("id"));

//		            dto.setQnadate(rs.getDate("qnadate"));

//		            dto.setContents(rs.getString("contents"));

//		            dto.setTitle(rs.getString("title"));

//		            rs.close();

//			}

//			no은 정수형으로받아서 dto.setNO에 설정

//			id는 문자로받아서 dto.setId에 설정

//			Qnadate 시간으로 받아서 dto.setQnadate에 설정

//			contents는 문자로 받아서 dto.setContents로 설정

//			title은 문자로 받아서 dto.setTitle에 설정

//			결과 닫음

			

//			pstmt.close();

//			실행문 닫음	

		

//			return dto;

//			dto return, 아무것도없으면 null로 리턴

//		}		

	//	



//		예제2)

//		MVC패턴 

//		M(Model) : 데이터 처리 관리

//		V(View) : 인터페이스 담당, 시각적으로 보여주는거

//		C(Controller) : model - view 중간에서 활동 사용자 입력한걸 처리



//		MVC를 쓰는 이유

//		1. 유지보수하기 쉬움

//		2. 독립적으로 쓰이기 때문에 하나만 수정하면된다

//		-> 인터페이스 수정해야되면 model, controller 수정할 필요없이 뷰만 수정

//		3. 분리해서 테스트 할 수 있음

//		4. 팀단위 프로젝트할때 역할분배

		

//		public class PostModel {

//		    private List<Post> posts;

//			post를 list에 저장 하는 posts 생성

		

//		    public PostModel() {

//		        posts = new ArrayList<>();

//		    }

//			posts에 새로운 리스트 생성

	//

//		    public void addPost(Post post) {

//		        posts.add(post);

//		    }

//			post를 추가한다

	//

//		    public List<Post> getAllPosts() {

//		        return posts;

//		    }

//		}

//			모든 포스트를 게시물에 공개한다
		
		
		
		
		
	}	
		
	
}
