import java.lang.*;
public class Constructor {
	String name;
	int no;
Constructor(){
name="abc";
no=123;
}
Constructor(String str,int n){
name=str;
no=n;
}
	public static void main(String[]args) {
		Constructor s1=new Constructor();
          Constructor s2=new Constructor("def",456);
System.out.println(s2.name);
System.out.print(s2.no);
		System.out.println(s1.name);
		System.out.println(s1.no);
	}
	

}
