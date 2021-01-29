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
		ArrayList<String> output = new ArrayList<String>();

		output.add("public class "+ EntityName +" {");
		output.add("");
		for(ClassSheed sheed : Sheeds){
			output.add("	public " + sheed.GetTypeNames() + " " + sheed.GetValiableName() + "{ get; private set;}");
			output.add("");
		}
		output.add("}");

		for(String text:output){
			System.out.println(text);
		}
	}
}
