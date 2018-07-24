package Animal;

public class Main extends Object {

    public static void main(String[] args) {
        Animal animal= new Animal("A",1, 1, 1,1);

        Dog dog= new Dog("B", 1,1,1,1,2,4,1,20,"Luscious");
        dog.eat();

        Dog doggie=dog;


    }


}
