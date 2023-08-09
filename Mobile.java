interface Features
{
void dialing();
void messaging();
}
interface Addons
{
void vcalling();
void mms();
}
class FeaturedPhone implements Features
{
public void dialing()
{
System.out.println("Featured phone is Dialing...");
}
public void messaging()
{
System.out.println("Featured phone is messaging...");
}
}
class Smartphone implements Features,Addons
{
public void dialing()
{
System.out.println("Smart phone is Dialing...");
}
public void messaging()
{
System.out.println("Smart phone is messaging...");
}
public void vcalling()
{
System.out.println("Smart phone is video calling...");
}
public void mms()
{
System.out.println("Smart phone is video Mms...");
}
}
class Mobile
{
public static void main(String[]args)
{
Smartphone sp=new Smartphone();
sp.dialing();
sp.messaging();
sp.vcalling();
sp.mms();
FeaturedPhone fp=new FeaturedPhone();
fp.dialing();
fp.messaging();
}
}







