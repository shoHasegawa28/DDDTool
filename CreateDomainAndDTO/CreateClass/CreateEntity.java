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
		// プロパティ設定
		for(ClassSheed sheed : Sheeds){
			output.add("	public " + sheed.GetTypeName() + " " + sheed.GetValiableName() + "{ get; private set;}");
			output.add("");
		}

		// コンストラクタ作成
		output.add("	" + EntityName+"(");
		for(ClassSheed sheed : Sheeds){
			output.add("		"+sheed.GetTypeName() + " _" +sheed.GetValiableName().toLowerCase());
		}
		output.add("	){");
		for(ClassSheed sheed : Sheeds){
			output.add("		"+sheed.GetValiableName() + " = _" +sheed.GetValiableName().toLowerCase() + ";");
		}
		output.add("	}");
		output.add("}");
		
		return output;
	}
}
