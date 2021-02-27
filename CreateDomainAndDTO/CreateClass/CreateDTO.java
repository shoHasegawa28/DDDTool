package CreateClass;

import Models.*;
import java.util.*;
import Repository.*;
import java.io.*;

public class CreateDTO extends AbstractCreateClass{
	
	private String EntityName;

	public CreateDTO(ArrayList<ClassSheed> sheeds,String entiyName){
		super(sheeds);
		EntityName = entiyName + "DTO";
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
			String type = sheed.GetTypeName();
			if(sheed.GetValueObjectFlg()){
				type = sheed.GetValueObjectType(); 
			}

			output.add("	public " + type + " " + sheed.GetValiableName() + "{ get; set;}");
			output.add("");
		}
		output.add("}");
		
		return output;
	}
}
