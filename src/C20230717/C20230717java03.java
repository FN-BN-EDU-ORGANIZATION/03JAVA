package mystudy02_interface;

//추상클래스 //여기다가 메서드를 추가하면안되냐? //포유류의 고유 특징을 생각해보자 포유류의 틀을 벗어나면 안돼는경우가있다
//그니까 포유류의 특징을 홰손할수없다. 

public abstract class Mammal {
	private String name;
	private int age;
	private String species;
	
	
	//private // getter settrer //
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	
	public abstract void GiveBirthBaby(); //출산하다
	public abstract void NurtureBaby(); //키우다
	public abstract void FeedBaby(); //아기에게 음식을 먹이다
	
	
	
	
}	
