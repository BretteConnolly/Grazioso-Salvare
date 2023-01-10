import java.lang.String;

public class RescueAnimal 
{
    //instance variables
    private String name;
    private String animalType;
    private String sex;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	  private String trainingStatus;
    private String reserved;
	  private String inServiceCountry;

    //constructor
    public RescueAnimal(String name, String animalType, String sex, String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, String reserved, String inServiceCountry) 
    {
        setName(name);
        setAnimalType(animalType);
        setSex(sex);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    //accessor and mutator methods
	  public String getName() {return name;}

	  public void setName(String name) {this.name = name;}
  
	  public String getAnimalType() {return animalType;}
	
	  public void setAnimalType(String animalType) {this.animalType = animalType;}

	  public String getSex() {return sex;}

	  public void setSex(String sex) {this.sex = sex;}

	  public String getAge() {return age;}

	  public void setAge(String age) {this.age = age;}

	  public String getWeight() {return weight;}

	  public void setWeight(String weight) {this.weight = weight;}

	  public String getAcquisitionDate() {return acquisitionDate;}

	  public void setAcquisitionDate(String acquisitionDate)
    {
		  this.acquisitionDate = acquisitionDate;
	  }

	  public String getAcquisitionLocation() {return acquisitionCountry;}

	  public void setAcquisitionLocation(String acquisitionCountry) 
    {
		  this.acquisitionCountry = acquisitionCountry;
	  }
  
	  public String getReserved() {return reserved;}

	  public void setReserved(String reserved) {this.reserved = reserved;}

	  public String getInServiceCountry() {return inServiceCountry;}

	  public void setInServiceCountry(String inServiceCountry) 
    {
		  this.inServiceCountry = inServiceCountry;
	  }
  
	  public String getTrainingStatus() {return trainingStatus;}

	  public void setTrainingStatus(String trainingStatus) 
    {
		  this.trainingStatus = trainingStatus;
	  }
}