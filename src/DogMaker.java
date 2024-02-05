public class DogMaker {
  
  public static void main(String[] args) {
    Owner owner = new Owner("John","Wick","0800322520");
    Dog dog = new Dog(2, "Jill","black and tan", owner);
    dog.setName("Jessie");
    System.out.println(dog.getAge());
    int age = dog.birthday();
    System.out.println(age);
    System.out.println(dog);
  }
  
}
