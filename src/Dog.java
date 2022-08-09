public class Dog extends Pet {


    public Dog(String name, int age) {
        super(name, age);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public void describe() {
        System.out.println(this.name + " says bark! He is " + this.age + " years old.");
    }
}