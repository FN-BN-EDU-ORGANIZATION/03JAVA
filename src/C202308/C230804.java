package C202308;

import java.time.LocalTime;
import java.util.ArrayList;

public class C230804 {
	//디지털 시계를 클래스로 구현하여 이전 시간, 다음 시간, 
	//그리고 지금 시간을 출력해 주는 메서드를 가지고 있도록 클래스를 작성
	private LocalTime currentTime;

    public C230804() {
        this.currentTime = LocalTime.now();
    }

    public void previousTime() {
        this.currentTime = this.currentTime.minusHours(1);
        System.out.println("Previous time: " + this.currentTime);
    }

    public void nextTime() {
        this.currentTime = this.currentTime.plusHours(1);
        System.out.println("Next time: " + this.currentTime);
    }

    public void currentTime() {
        System.out.println("Current time: " + this.currentTime);
    }
    
    public static String getMaxString(ArrayList<String> strings) {
        String maxString = "";

        for (String str : strings) {
            if (str.length() > maxString.length()) {
                maxString = str;
            }
        }

        return maxString;
    }

	public static void main(String[] args) {
		//디지털 시계를 클래스로 구현하여 이전 시간, 다음 시간, 
		//그리고 지금 시간을 출력해 주는 메서드를 가지고 있도록 클래스를 작성
		C230804 clock = new C230804();
	    clock.previousTime();
	    clock.nextTime();
	    clock.currentTime();
		
		//ArrayList에 사용된 문자열들 중 가장 긴 문자열을 반환하는 getMaxString() 메서드를 작성
	    ArrayList<String> strings = new ArrayList<String>();
	    strings.add("Java Programming");
	    strings.add("Python Programming");
	    strings.add("JavaScript");
	
	    String maxString = getMaxString(strings);
	    System.out.println("Max string is: " + maxString);
	}

}
