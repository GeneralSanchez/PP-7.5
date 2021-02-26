public class Pig extends Animal
{
  //the constructor that is used
  public Pig (String animal,String sound)
  {
    super(animal,sound);//this acces the Animal
  }
  public String toString()//the toString
  {
    String output = super.toString();//acces to string by using the super
    return output;//returns this output
  }
}