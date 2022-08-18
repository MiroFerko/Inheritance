public class Composition {
    public static void main(String[] args) {
        Dog myDog = new Dog("Benny", 2);
        Cat myCat = new Cat("Gargfield", 3);

        myDog.describe();
        myCat.describe();
        System.out.println();

        Person per1 = new Person("Andrew");
        Person per2 = new Person("Max");

        per1.setPet(myDog);
        per2.setPet(myCat);

        System.out.println(per1.getName() + " has a pet named " + per1.getPet().getName());
        System.out.println(per2.getName() + " has a pet named " + per2.getPet().getName());

    }
}