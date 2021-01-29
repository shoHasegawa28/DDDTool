package CreateClass;

import Models.*;
import java.util.*;
import Repository.*;
import java.io.*;

public class CreateEntity extends AbstractCreateClass{
	
	private String EntityName;

	public CreateEntity(ArrayList<ClassSheed> sheeds,String entiyName){
		super(sheeds);
		EntityName = entiyName;
	}

	public void Create() throws IOException{
		
		// クラスの作成
		ArrayList<String> output = CreateNewEntiryClass();

		// ファイル書き込み
		OperateJavaFile writer = new OperateJavaFile();
		writer.Write(EntityName,output);

		// debug
		for(String text:output){
			System.out.println(text);
		}
	}

	private ArrayList<String> CreateNewEntiryClass(){
		ArrayList<String> output = new ArrayList<String>();

		output.add("public class "+ EntityName +" {");
		output.add("");
		for(ClassSheed sheed : Sheeds){
			output.add("	public " + sheed.GetTypeNames() + " " + sheed.GetValiableName() + "{ get; private set;}");
			output.add("");
		}
		output.add("}");
		
		return output;
	}
}
