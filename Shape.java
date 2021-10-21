package abstractPackage;

public abstract class Shape {
abstract void draw();
}
//in this scenario, i am extending two classes from a single class, mostly we don't know what to implement, and an object of the class can be implemented by factory method.
class Rectangle extends Shape
{
void draw()
{
System.out.println("drawing rectangle");	
}
}
class Circle extends Shape
{
void draw()
{
System.out.println("drawing circle");	
}
}
class TestAbstraction
{
public static void main(String[] args) {
	Shape s=new Rectangle();
	s.draw();
}	
}
