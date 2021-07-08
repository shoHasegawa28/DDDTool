package Models;

public class ClassSheed{
	private String ValiableName;
	private String TypeName;
	private boolean ValueObjectFlg;
	private String ValueObjectType;

	public String GetValiableName(){
		return ValiableName;
	}
	
	public String GetTypeName(){
		return TypeName;
	}
	public boolean GetValueObjectFlg(){
		return ValueObjectFlg;
	}
	public String GetValueObjectType(){
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
			TypeName = typeNames;
			ValueObjectFlg = (Integer.parseInt(valueObjectFlg) == 1);
			ValueObjectType = valueObjectType;
	}

	public void Print(){
		System.out.println("型 = " + TypeName);
		System.out.println("変数名 = " + ValiableName);
		System.out.println("フラグ = " + ValueObjectFlg);
		System.out.println("プリミティブ型 = " + ValueObjectType);
	}
}
