package C202308;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class C230817 {
	//거꾸로 된 문자열 출력
	 public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

	 //Java Reflection API를 사용하여 클래스 정보 출력
		private int id;
	    public String name;
	    protected double score;
	
	    public C230817() {
	    }
	
	    public C230817(int id, String name, double score) {
	        this.id = id;
	        this.name = name;
	        this.score = score;
	    }
	
	    private void privateMethod() {
	    }
	
	    protected void protectedMethod() {
	    }
	
	    public void publicMethod() {
	    }
	    
	public static void main(String[] args) {
		//거꾸로 된 문자열 출력
	    String input = "Hello, Java!";
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
        
        //Java Reflection API를 사용하여 클래스 정보 출력
        Class<?> newClass = C230817.class;

        // class name 출력
        System.out.println("Class: " + newClass.getName());

        // constructors 출력
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : newClass.getDeclaredConstructors()) {
            System.out.println("  " + constructor);
        }

        // fields 출력
        System.out.println("\nFields:");
        for (Field field : newClass.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            System.out.println("  " + Modifier.toString(modifiers) + " " + field.getType().getSimpleName() + " " + field.getName());
        }

        // methods 출력
        System.out.println("\nMethods:");
        for (Method method : newClass.getDeclaredMethods()) {
            int modifiers = method.getModifiers();
            System.out.println("  " + Modifier.toString(modifiers) + " " + method.getReturnType().getSimpleName() + " " + method.getName());
        }

	}

}
