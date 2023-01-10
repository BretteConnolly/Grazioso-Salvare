// Main is the file name for the Monkey class, as REPL will not submit the project under another name

public class Monkey extends RescueAnimal 
  {
    //instance variable
    public String tailLength;
    public String height;
    public String bodyLength;
    public String species;

    //constructor
    public Monkey(String name, String animalType, String sex, String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, String reserved, String inServiceCountry, String tailLength, String height, String bodyLength, String species) 
    {
        super(name, animalType, sex, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
    }

    //accessor and mutator methods
    public String getTailLength() {return tailLength;}

    public void setTailLength(String tailLength) {this.tailLength = tailLength;}

    public String getHeight() {return height;}
    
    public void setHeight(String height) {this.height = height;}

    public String getBodyLength() {return bodyLength;}

    public void setBodyLength(String bodyLength) {this.bodyLength = bodyLength;}

    public String getSpecies() {return species;}

    public void setSpecies(String species) {this.species = species;}
  }