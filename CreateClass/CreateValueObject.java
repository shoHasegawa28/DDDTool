package CreateClass;

import Models.*;
import java.util.*;
import Repository.*;
import java.io.*;

public class CreateValueObject extends AbstractCreateClass{
	
	private String EntityName;

	public CreateValueObject(ArrayList<ClassSheed> sheeds,String entiyName){
		super(sheeds);
		EntityName = entiyName + "DTO";
	}

	public void Create() throws IOException{
		
		// ValueObjectを抽出する
		OperateJavaFile writer = new OperateJavaFile();
		for(ClassSheed sheed : Sheeds){
			if(sheed.GetValueObjectFlg()){
				ArrayList<String> create =  CreateNewValueObject(sheed);
				writer.Write(sheed.GetTypeName(),create);
			}
		}
		// debug	
	}
	private ArrayList<String> CreateNewValueObject(ClassSheed sheed){
		ArrayList<String> output = new ArrayList<String>();
		output.add("public class " + sheed.GetTypeName() + " extends ValueObject");
		output.add("{");
		output.add("	private " + sheed.GetValueObjectType()+" Value{ get; }");
		output.add("");
		output.add("	public " + sheed.GetTypeName() + "(" + sheed.GetValueObjectType() + " _value)");
		output.add("	{");
		output.add("		Value = _value;");
		output.add("	}");
		output.add("}");

		for(String text:output){
			System.out.println(text);
		}

		return output;
	}
}
