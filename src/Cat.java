public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void describe() {
        System.out.println(this.name + " says meow! He is " + this.age + " years old.");
    }
}