package Repository;

import java.io.*;
import java.util.*;

public class OperateJavaFile{
	
	public void Write(String className, List<String> lines) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Output\\" + className + ".java")));
		for(String text : lines){
			bw.write(text);
			bw.newLine();
		}
		bw.close();
	}
}
