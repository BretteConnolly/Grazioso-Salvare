import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  private static ArrayList<Dog> dogList = new ArrayList<Dog>(); //list of all Dog objects
  private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>(); // list of all Monkey objects
  

  public static void main(String[] args)
  {
    Scanner scnr = new Scanner(System.in);
    String option = "";
    initializeDogList();
    initializeMonkeyList();

      //loop that displays the menu, accepts the user's input
      // and takes the appropriate action.
    displayMenu();
    option = scnr.nextLine();
    while (!option.equals("q"))
    {
      // responses to each menu option
      if (option.equals("1"))
      {
        intakeNewDog(scnr);
        System.out.println(dogList);
      }
      else if (option.equals("2"))
      {
        intakeNewMonkey(scnr);
        System.out.println(monkeyList);
      }
      else if (option.equals("3"))
        reserveAnimal(scnr);
      else if (option.equals("4"))
        printAnimals("dog");
      else if (option.equals("5"))
        printAnimals("monkey");
      else if (option.equals("6"))
        printAnimals("not reserved");
      else
      {
        System.out.println("Invalid input. Please try again.");
      }
      displayMenu();
      option = scnr.next();
    }
  }

  //prints the menu options
  public static void displayMenu() 
  {
      System.out.println("\n\n");
      System.out.println("\t\t\t\tRescue Animal System Menu");
      System.out.println("[1] Intake a new dog");
      System.out.println("[2] Intake a new monkey");
      System.out.println("[3] Reserve an animal");
      System.out.println("[4] Print a list of all dogs");
      System.out.println("[5] Print a list of all monkeys");
      System.out.println("[6] Print a list of all animals that are not reserved");
      System.out.println("[q] Quit application");
      System.out.println();
      System.out.println("Enter a menu selection");
  }


  //Add Dogs to a list for testing
  public static void initializeDogList() 
  {
    Dog dog1 = new Dog("Spot", "dog", "male", "1", "25.6", "05-12-2019", "United States", "intake", "available", "United States", "German Shepherd");
    Dog dog2 = new Dog("Rex", "dog", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", "available", "United States", "Great Dane");
    Dog dog3 = new Dog("Bella", "dog", "female", "4", "25.6", "12-12-2019", "Canada", "in service", "true", "Canada", "Chihuahua");

    dogList.add(dog1);
    dogList.add(dog2);
    dogList.add(dog3);
  }


  //Add monkeys to a list for testing
  public static void initializeMonkeyList() 
  {
    Monkey monkey1 = new Monkey("Brette", "monkey", "female", "1", "3", "05-12-2019", "Costa Rica", "intake", "available", "United States", "12", "12", "12", "capuchin");
    Monkey monkey2 = new Monkey("Darin", "monkey", "female", "3", "26 oz.", "02-03-2020", "Costa Rica", "Phase I", "available", "United States", "14", "10", "10", "squirrel_monkey");
    Monkey monkey3 = new Monkey("Dawn", "monkey", "female", "4", "12 oz.", "12-12-2019", "Colombia", "in service", "false", "Canada", "10", "5", "5", "tamarin");

    monkeyList.add(monkey1);
    monkeyList.add(monkey2);
    monkeyList.add(monkey3);
  }

  public static void intakeNewDog(Scanner scanner) 
  {
    System.out.println("What is the dog's name?");
    String name = scanner.next();
    for(Dog dog: dogList) 
    {
      if(dog.getName().equalsIgnoreCase(name)) //check that the Dog is not already in the system
      {
        System.out.println("\n\nThis dog is already in our system\n\n");
        return; //returns to menu
      }
    }
    //instantiate a new Dog and add it to the appropriate list
    System.out.println("Enter: sex, age, weight, acquisition date, acquisition country, training status, reserved status, service country, and breed");
    String animalType = "dog";
    String sex = scanner.next();
    String age = scanner.next();
    String weight = scanner.next();
    String acquisitionDate = scanner.next();
    String acquisitionCountry = scanner.next();
    String trainingStatus = scanner.next();
    String reserved = scanner.next();
    String inServiceCountry = scanner.next();
    String breed = scanner.next();
    Dog newDog = new Dog(name, animalType, sex, age, weight, acquisitionDate,  acquisitionCountry, trainingStatus, reserved, inServiceCountry, breed); 
    dogList.add(newDog);
  }
  
  public static void intakeNewMonkey(Scanner scanner) 
  {
    System.out.println("What is the monkey's name?");
    String name = scanner.next();
    for(Monkey monkey: monkeyList) 
    {
      if(monkey.getName().equalsIgnoreCase(name)) //check that the Monkey is not already in the system
      {
        System.out.println("\n\nThis monkey is already in our system\n\n");
          return; //returns to menu
      }
    }
    //instantiate a new Monkey and add it to the list of Monkeys
    System.out.println("Enter: sex, age, weight, acquisition date, acquisition country, training status, reserved status, service country, tail length, height, body length, and species");
    String animalType = "monkey";
    String sex = scanner.next();
    String age = scanner.next();
    String weight = scanner.next();
    String acquisitionDate = scanner.next();
    String acquisitionCountry = scanner.next();
    String trainingStatus = scanner.next();
    String reserved = scanner.next();
    String inServiceCountry = scanner.next();
    String tailLength = scanner.next();
    String height = scanner.next();
    String bodyLength = scanner.next();
    String species = scanner.next();
    int i;

    Monkey newMonkey = new Monkey(name, animalType, sex, age, weight, 
 acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength, species);

    
  //acceptable Monkey species
    if (newMonkey.species.equalsIgnoreCase("capuchin") || newMonkey.species.equalsIgnoreCase("guenon") || newMonkey.species.equalsIgnoreCase("macaque") || newMonkey.species.equalsIgnoreCase("marmoset") || newMonkey.species.equalsIgnoreCase("squirrel monkey") || newMonkey.species.equalsIgnoreCase("tamarin"))
      monkeyList.add(newMonkey);
    else
      System.out.println("Invalid species.");
  }

        
  //find an animal to reserve by type and service country
  public static void reserveAnimal(Scanner scanner) 
  {
    int i;
    String animalType;
    String country;
    System.out.println("Which type of animal do you need? (Dog or monkey.)");
    animalType = scanner.next();
    if (animalType.equalsIgnoreCase("dog"))
    {
      while (true)
      {
        //iterate through list of Dogs
        for (Dog dog : dogList)
        {
          //Dog is not reserved
          if (dog.getReserved().equalsIgnoreCase("available"))
          {
            System.out.println("In which country?");
            country = scanner.next();
            if (dog.getInServiceCountry().equalsIgnoreCase(country))
            //reserve the Dog
            {
              dog.setReserved("true");
              System.out.println("Your dog is reserved.");
              break;
            }
          }
        }
        System.out.println("We're sorry, there are no rescue dogs available in your country at this time. Please check back later.");
        break;
      }
    }
      if (animalType.equalsIgnoreCase("monkey"))
      {
        for (Monkey monkey : monkeyList)
          {
          //Monkey is not reserved
            if (monkey.getReserved().equalsIgnoreCase("available"))
            {
              System.out.println("In which country?");
              country = scanner.next();
              if (monkey.getInServiceCountry().equalsIgnoreCase(country))
              {
            //reserve the Monkey
                monkey.setReserved("true");
                System.out.println("Your monkey is reserved.");
                break;
              }
            }
          }
          System.out.println("We're sorry, there are no rescue monkeys available in your country at this time. Please check back later.");
      }    
  }

  public static void printAnimals(String printAnimalType) 
  {
    //String header = "Name | Type | Training Status | In Service Country";
    //System.out.println(header);
    if(printAnimalType.equals("dog"))
    {
      for(Dog dog: dogList) //prints list of Dogs
        System.out.println(dog.getName() + " | " + dog.getBreed() + " | " + dog.getTrainingStatus() + " | " + dog.getInServiceCountry());
    }
    if(printAnimalType.equals("monkey"))
    {
      for(Monkey monkey: monkeyList) //prints list of Monkeys
System.out.println(monkey.getName() + " | " + monkey.getSpecies() + " | " + monkey.getTrainingStatus() + " | " + monkey.getInServiceCountry());
    }
    if(printAnimalType.equals("available")) //prints a list of all animals that are fully trained ("in service") but not reserved
    {
      for(Dog dog: dogList) 
      {
        if(dog.getReserved().equalsIgnoreCase("false"))
          System.out.println(dog.getName() + " | " + dog.getBreed() + " | " + dog.getTrainingStatus() + " | " + dog.getInServiceCountry());
      }
      for(Monkey monkey: monkeyList) 
      {
        if(monkey.getReserved().equalsIgnoreCase("false"))
System.out.println(monkey.getName() + " | " + monkey.getSpecies() + " | " + monkey.getTrainingStatus() + " | " + monkey.getInServiceCountry());
      }
    }
  }
}
