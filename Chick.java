public class Chick extends Animal
{
  private int age;//sets the variable
//this is the constructor  that is used
  public Chick (String animal,String sound,int age)
   {
     super (animal,sound);//gets the information using super
     this.age = age;
   }
   public String getSound()//gets the Sounf from Animal
   {
     if (this.age <= 5)//this is logic
     {
       return "peep";//returns this based on logic
     }
     else
     {
       return "peep-cheep";//returns if else is need
     }
   }

  public String toString()//toString
  {
    String output = super.toString();//gets the supertoString
    return output;//returns the output
  }

   
}