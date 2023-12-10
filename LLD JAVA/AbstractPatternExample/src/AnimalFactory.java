
public class AnimalFactory {
  public Product getAnimal(String animalType){
      if(animalType==null) return null;
      else if(animalType.equalsIgnoreCase("DUCK"))
          return new Duck();
      else if(animalType.equalsIgnoreCase("TIGER")){
          return new Tiger();
      }
      return  null;
  }
}
