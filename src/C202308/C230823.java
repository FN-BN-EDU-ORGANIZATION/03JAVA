package C202308;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//ArrayList와 HashMap을 사용하여 사람들의 이름과 나이를 저장하고 검색하는 프로그램을 작성
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class C230823 {
	
	public static void main(String[] args) {
		//주어진 정수 배열에서 최대값, 최소값, 평균값을 구하는 메서드를 작성
		int[] numbers = {5, 3, 8, 2, 10, 6};
        System.out.println("최대값: " + findMax(numbers));
        System.out.println("최소값: " + findMin(numbers));
        System.out.println("평균값: " + findAverage(numbers));
        
	    //ArrayList와 HashMap을 사용하여 사람들의 이름과 나이를 저장하고 검색하는 프로그램을 작성
	    List<Person> people = new ArrayList<>();
	    people.add(new Person("Alice", 30));
	    people.add(new Person("Bob", 25));
	    people.add(new Person("Cindy", 22));
	    people.add(new Person("David", 28));
	
	    HashMap<String, Integer> nameToAgeMap = new HashMap<>();
	    for (Person person : people) {
	        nameToAgeMap.put(person.getName(), person.getAge());
	    }
	
	    String searchName = "Cindy";
	    Integer age = nameToAgeMap.get(searchName);
	    if (age != null) {
	        System.out.println(searchName + "의 나이는 " + age + "세입니다.");
	    } else {
	        System.out.println(searchName + "의 정보를 찾을 수 없습니다.");
	    }
	    
	}
	
	//주어진 정수 배열에서 최대값, 최소값, 평균값을 구하는 메서드를 작성
    public static int findMax(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double findAverage(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;

	}
    
}
