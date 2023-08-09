import java.lang.*;
public class stringdemo
{
    public static void main(String []args)
    {
        String str=new String("hello");
        System.out.println(str);
        str=str.concat("welcome");//we should again create instances which indicates wastege memomry//
        System.out.println(str);
        System.out.println(str.length());
System.out.println(str.indexOf("w"));
System.out.println("character at"+str.charAt(6));
    }
}