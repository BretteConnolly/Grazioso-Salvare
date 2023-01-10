public class Dog extends RescueAnimal //inherit from RescueAnimal class
{
    //instance variable
    private String breed;

    //constructor
    public Dog(String name, String animalType, String sex, String age,
    String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, String reserved, String inServiceCountry, String breed)
  {
        super(name, animalType, sex, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        setBreed(breed);
    }

    //accessor and mutator methods
    public String getBreed() {return breed;}
  
    public void setBreed(String dogBreed) {breed = dogBreed;}
}