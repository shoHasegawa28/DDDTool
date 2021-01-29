package Repository;

import Models.*;
import java.io.*;
import java.util.*;

public class OperateCsvFile{
	public ArrayList<ClassSheed> Read(){
		ArrayList<ClassSheed> result = new ArrayList<ClassSheed>();
		try{
			File file = new File("test.csv");
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String str;
			while((str = br.readLine()) != null){
				String[] datas = str.split(",",0);
				ClassSheed cs = new ClassSheed(datas[0],datas[1],datas[2],datas[3]);
				//cs.Print();
				result.add(cs);
			}
			br.close();
			
		}catch(Exception ex){
			System.out.println(ex);
		}
		System.out.println(result.size());
		return result;
	}
}
