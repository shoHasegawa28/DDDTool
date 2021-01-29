package CreateClass;

import Models.*;
import java.util.*;
import java.io.*;

public abstract class AbstractCreateClass{
	protected ArrayList<ClassSheed> Sheeds;
	
	public AbstractCreateClass(ArrayList<ClassSheed> sheeds){
		Sheeds = sheeds;
	}

	abstract public void Create() throws IOException;
}
