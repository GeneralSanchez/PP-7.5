public abstract class Animal
{
  private String type;//this states the variable
  private String sound;//this states the variable
//overloaded constructor
  public Animal (String type,String sound)
  {
    this.type = type;
    this.sound = sound;
  }
  public String getAnimal()//getsAnimal
  {
    return type;//return this to user
  }
  public void setAnimal(String type)//sets the Animal
  {
    this.type = type;//sets this sound
  }
  public String getSound()//gets the Sound
  {
    return sound;//returns the sound
  }
  public void setSound (String sound)//sets the sound
  {
    this.sound = sound;//sets this sound
  }
}