import java.util.ArrayList;
class Main
 {
  public static void main(String[] args) 
  {
    System.out.println ("Andy Sanchez, PP 7.5  Old MacDonald");
//These are the ArrayLists used to get to store the information
    ArrayList<Farmer> Owner = new ArrayList<Farmer>();//for Farmer
    ArrayList<Animal> Farm = new ArrayList<Animal>();//for Animal
//this is how the information get put inside
    Chick cheep = new Chick ("Chicks",null,7);//one chick
    Chick peep = new Chick ("Chicks",null,5);//tow chick
    Cow cow = new Cow ("Cow","Moo","bessy");//for cow
    Pig pig = new Pig ("Pig", "Oink");//for pig
    Farmer farmer = new Farmer ("Old Darth Vader");//for farmer

    Owner.add(farmer);//this adds it to the Owner Arraylist
    Farm.add(cheep);//this adds to Farm Arraylist
    Farm.add(peep);//this adds to Farm Arraylist
    Farm.add(cow);//this adds to Farm Arraylist
    Farm.add(pig);//this adds to Farm Arraylist
    
    for (Farmer i: Owner)//makes coy for each
    {
      for(Animal j:Farm)//makes copy for each
      {
       System.out.println(i);//prints the Owner 
      System.out.println(farmer.Singing(j));//prints out the farmer song and Farm
      System.out.println (i);//prints the Ower
      System.out.println();//for space when prints out
      }
    }
  }
}