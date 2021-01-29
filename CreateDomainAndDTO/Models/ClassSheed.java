package Models;

public class ClassSheed{
	private String ValiableName;
	private String TypeNames;
	private boolean ValueObjectFlg;
	private String ValueObjectType;

	public String GetValiableName(){
		return ValiableName;
	}
	
	public String GetTypeNames(){
		return TypeNames;
	}
	public boolean GetValueObject(){
		return ValueObjectFlg;
	}
	public String GetValueObjectTyp(){
		return ValueObjectType;
	}
	public ClassSheed(){
	}

	public ClassSheed(
				String valiableName,
				String typeNames,
				String valueObjectFlg,
				String valueObjectType
			){
			ValiableName = valiableName;
			TypeNames = typeNames;
			ValueObjectFlg = (Integer.parseInt(valueObjectFlg) == 1);
			ValueObjectType = valueObjectType;
	}

	public void Print(){
		System.out.println("型 = " + TypeNames);
		System.out.println("変数名 = " + ValiableName);
		System.out.println("フラグ = " + ValueObjectFlg);
		System.out.println("プリミティブ型 = " + ValueObjectType);
	}
}
