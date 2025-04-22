package samplemaven;

public class Stringmaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hrllo";
		System.out.println(s);
		String S=new String("welcome");
		System.out.println(S);
		char arr[]= {'a','b','c','d'};
		String st=new String(arr);
		System.out.println(st);
		//length
		int var=s.length();
		System.out.println(var);
		//concat
		System.out.println(s.concat(S));
		//uppercase
		System.out.println(s.toUpperCase());
		System.out.println(s.toUpperCase());
		String arr5="java";
		String arr2="java";
		String arr3="Java";
		String arr4="Selenium";
		//equals
		System.out.println(arr5.equals(arr2));
		System.out.println(arr5.equals(arr4));
		System.out.println(arr2.equals(arr3));
		//equals ignore case
		System.out.println(arr5.equalsIgnoreCase(arr3));
		//is empty
		String arr6="";
		System.out.println(arr6.isEmpty());
		//contents
		String ss="Hi kavya";
		System.out.println(ss.contains("k"));
		System.out.println(ss.contains("s"));
		//value of --convert int to string
		int bb=12;
		String dd="";
		String cc=String.valueOf(bb);
		System.out.println(cc);
		System.out.println(dd.valueOf(bb));
		String e=new String("java");
		System.out.println(e);
		//==
		System.out.println(cc==dd);
		
		
	}

}
