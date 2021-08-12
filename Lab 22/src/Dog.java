
public class Dog 
{
   private String name;
   private int age;

   public Dog(String name, int age)
   {
      this.name = name;
	  this.age = age;
   }
   public void setName(String name)
   {
	  this.name = name;
   }
   public String toString()
   {
	  String Dogs;
	  Dogs = name + " " + age;
	  return Dogs;
   }
}
