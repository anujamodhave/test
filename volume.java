import java.util.*;
interface Shape
{	
	void volume();

} 
class Cone implements Shape
{
	final float pi=3.14f;
	float r,h;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter r and h");
		r=sc.nextFloat();
		h=sc.nextFloat();
        }
	public void volume()
        {
		float v=0.33f*pi*r*r*h;
		System.out.println("volume of cone="+v);
       }


}
class Cylinder implements Shape
{
	final float pi=3.14f;
	float r,h;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter r and h");
		r=sc.nextFloat();
		h=sc.nextFloat();
        }
	
	public void volume()
	{
		float c=pi*r*r*h;
		System.out.println("volume of cylinder="+c);
		
       }
}
class Sample
{
	public static void main(String args[])
        {
		Cone x=new Cone();
		x.accept();
		x.volume();
		Cylinder y=new Cylinder();
		y.accept();
		y.volume();
		
		



       }



}



