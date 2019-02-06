public class petClient{
  public static void main(String[] args){
    Pet mypet = new Pet("Flubber", "fish", 3);
    Pet otherpet = new Pet("incomplete", "incomplete", 0);
    System.out.println("My pet is " + mypet.getName() + " the " + mypet.getAnimal() + " and they are " + mypet.getAge() + " years old.");
    otherpet.setName("Lucy");
    otherpet.setAge(9);
    otherpet.setAnimal("dog");
    System.out.println("My pet is " + otherpet.getName() + " the " + otherpet.getAnimal() + " and they are " + otherpet.getAge() + " years old.");
  }
}
