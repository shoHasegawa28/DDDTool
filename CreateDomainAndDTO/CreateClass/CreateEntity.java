package CreateClass;

import Models.*;
import java.util.*;

public class CreateEntity extends AbstractCreateClass{
	public CreateEntity(ArrayList<ClassSheed> sheeds){
		super(sheeds);
	}

	public void Create(){
		for(ClassSheed sheed : Sheeds){
			System.out.println(sheed.GetValiableName());
		}
	}
}
