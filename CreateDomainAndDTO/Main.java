
import Repository.*;
import Models.*;
import java.util.*;
import CreateClass.*;

public class Main {
	public static void main(String[] args){
		
		OperateCsvFile test = new OperateCsvFile();
		ArrayList<ClassSheed> sheeds =  test.Read();
		ArrayList<AbstractCreateClass> classes = new ArrayList<AbstractCreateClass>(){ 
			{
				add(new CreateEntity(sheeds));
			} 
		};
		
		for(AbstractCreateClass createClass : classes){
			createClass.Create();
		}

	}
}
