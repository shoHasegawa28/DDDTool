package CreateClass;

import Models.*;
import java.util.*;

public class CreateEntity extends AbstractCreateClass{
	
	private String EntityName;

	public CreateEntity(ArrayList<ClassSheed> sheeds,String entiyName){
		super(sheeds);
		EntityName = entiyName;
	}

	public void Create(){
		System.out.println("public class "+ EntityName +" {");
		System.out.println("");
		for(ClassSheed sheed : Sheeds){
			System.out.println("	public " + sheed.GetTypeNames() + " " + sheed.GetValiableName() + "{ get; private set;}");
			System.out.println("");
		}
		System.out.println("}");
	}
}
