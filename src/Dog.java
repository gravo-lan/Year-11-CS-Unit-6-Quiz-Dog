public class Dog {

    private int age;
    private String name, color;
    private Owner owner;

    public Dog(int age, String name, String color, Owner owner) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }

    public int birthday() {
        addOneAge();
        return age;
    }

    private void addOneAge() {
        age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "The dog is named " + name + " and is " + age + " years old. This dog is " + color + ".";
    }
}
