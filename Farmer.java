public class Farmer
{
  private String name;//the variable that is used

  public Farmer (String name)//this is to set the name
  {
    this.name = name;//sets it
  }
  
   public String Singing (Animal Farm)//this is the Singing
  {
    //this is the song that will get printed out
    return "And on his farm he had some "+ Farm.getAnimal()+","+"Ee i ee i o"+
           "\nWith a "+ Farm.getSound()+"-"+ Farm.getSound()+" here"+
           "\nAnd a "+ Farm.getSound()+"-"+ Farm.getSound()+" there"+
           "\nHere a "+ Farm.getSound()+ " there a "+ Farm.getSound()+
           "\nEverywhere a "+ Farm.getSound()+"-"+Farm.getSound();
  }
  public String toString()//used to get the toString
  {
    String output = name+ " had a farm Ee i ee i o";//this is what wil get outputeed
  return output;//returns the output
  }
}