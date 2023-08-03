package C202308;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class C230803 {

	public static void main(String[] args) {
		//ArrayList를 사용하여 학생들의 이름을 저장한 후 총 인원수를 출력하고, 이름을 알파벳 순서대로 정렬하여 출력
		 ArrayList<String> students = new ArrayList<>();

	        students.add("David");
	        students.add("Alice");
	        students.add("Michael");
	        students.add("Lucy");

	        System.out.println("Total Students: " + students.size());
	        Collections.sort(students);
	        for(String student : students) {
	            System.out.println(student);
	        }
	        
	    //HashMap을 사용하여 어떤 도시의 날짜별 최고 기온을 저장한 후 해당 도시의 기온을 출력
	        HashMap<String, Integer> temperature = new HashMap<>();

	        temperature.put("2023-02-01", 5);
	        temperature.put("2023-02-02", 8);
	        temperature.put("2023-02-03", 4);
	        temperature.put("2023-02-04", 6);

	        String city = "2023-02-03";
	        if(temperature.containsKey(city)) {
	            System.out.println("Temperature on " + city + " : " + temperature.get(city) + "°C");
	        } else {
	            System.out.println("No data for " + city);
	        }

	}

}
