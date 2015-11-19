import java.util.ArrayList;
import java.util.HashSet;


public class Program {

	
	public static void main(String args[]){
		
		ArrayList<View> myArray = new ArrayList<View>();
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(10);
		
		myArray.add(intBox);
		
		Box<Double> doubleBox = new Box<Double>();
		doubleBox.set(25.90);
		
		myArray.add(doubleBox);
		
		
		for(View v : myArray){
			v.print();
		}
		
		//HashSet
		HashSet<View> set = new HashSet<View>();
		set.add(intBox);
		set.add(doubleBox);
		set.add(intBox);
		set.add(doubleBox);
		set.add(intBox);
		set.add(doubleBox);
		set.add(intBox);
		set.add(doubleBox);
		set.add(intBox);
		set.add(doubleBox);
		set.add(intBox);
		set.add(doubleBox);
		
		System.out.println("HashSet");
		for(View v: set){
			v.print();
		}
		
		
	}
}
