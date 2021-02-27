
import Repository.*;
import Models.*;
import java.util.*;
import CreateClass.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
		
		OperateCsvFile test = new OperateCsvFile();
		ArrayList<ClassSheed> sheeds =  test.Read();

		System.out.print("エンティティ名を入力してください  ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();

		ArrayList<AbstractCreateClass> classes = new ArrayList<AbstractCreateClass>(){ 
			{
				add(new CreateEntity(sheeds,fileName));
				add(new CreateDTO(sheeds,fileName));
				add(new CreateValueObject(sheeds,fileName));
			} 
		};
		
		for(AbstractCreateClass createClass : classes){
			try{
				createClass.Create();
			}catch(IOException ex){
				System.out.println(ex);
			}
		}

	}
}
