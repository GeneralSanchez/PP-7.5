public class Cow extends Animal
{
  private String name;//this is the variable used
//constructor that is going to be used
  public Cow (String animal,String sound,String name)
  {
    super(animal, sound);//to get variables form Animal
    this.name = name;
  }
  
  public String GetName()//gets the Name
  {
    return name;//returns the name
  } 
  public String getAnimal()//gets the animal
  {
    return super.getAnimal()+","+name;//returns this
  }
  public void setName(String name)//sets the name
  {
    this.name = name;//sets it to this
  }
 
 public String toString ()// the toString
  {
    String output = super.toString();//gets the toString
   return output;//returns this output
  }
  
}