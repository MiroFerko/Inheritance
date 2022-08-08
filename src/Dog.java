public class Dog implements Pet {

    String name;
    int age;

    public Dog(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    @Override
    public void describe() {
        System.out.println(this.name + " says bark! He is " + this.age + " years old.");
    }
}