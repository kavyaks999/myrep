package samplemaven;

public class Bufferbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("hello");
		System.out.println(a);
		StringBuilder b=new StringBuilder("Hi");
		System.out.println(b);
		//append add string at last
		System.out.println(a.append("kavya"));
		//insert
		//System.out.println(a.insert(1, " welcome "));
		//replace
		System.out.println(a.replace(0, 1, "jj"));
		//reverse
		//System.out.println(a.reverse());
		//delete
		System.out.println(a.delete(0, 1));

	}

}
