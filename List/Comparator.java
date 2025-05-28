/*
import java.util.*;

class student {
	String name;
	int marks ;
	
	student(String name, int marks){
		this.name= name;
		this.marks= marks;
	}
	public String toString(){
		return name +" : "+ marks;
	}
}
public class Main4{
	public static void main(String[] args){
		List<student> list= new ArrayList<>();
		list.add(new student ("Arjita", 85));
		list.add(new student ("Anu ", 72));
		Collections.sort(list ,(s1,s2) -> s1.marks- s2.marks);
		for(student s: list){
			System.out.println(s);
		}
	}
}
*/
import java.util.*;

class student{
	String name;
	int marks;
	
	student(String name , int marks){
		this.name= name;
		this.marks= marks;
	}
	
	public String toString{
		return name +" : "+ marks;
	}
}
public class Main4{
	public static void main(String args[]){
		
		List<student> list= new ArrayList<>();
		Collections.sort(list,(s1,s2) -> s1.marks - s2.marks);
		for(student s: list){
			System.out.println(s);
		}
	}
	
