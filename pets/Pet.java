public class Pet {
  private String name;
  private String animal;
  private int age;



  Pet(String n, String an, int ag) {
  name = n;
  animal = an;
  age = ag;
  }

  public void setName(String n){
    name = n;
  }

  public void setAnimal(String an){
    animal = an;
  }

  public void setAge(int ag){
    age = ag;
  }

  public String getName(){
    return name;
  }

  public String getAnimal(){
    return animal;
  }

  public int getAge(){
    return age;
  }
}
