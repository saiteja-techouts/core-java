package abstractPackage;

public abstract class Hero {
abstract void run();
}
class Splendor extends Hero
{
void run()
{
System.out.println("78 km/ltr");	
}
public static void main(String[] args) {
	Splendor s1=new Splendor();
	s1.run();
}
}
