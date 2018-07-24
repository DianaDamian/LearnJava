package Composition;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions= new Dimensions(20,20,5);
        Case theCase= new Case("A", "B","240", dimensions);

        Monitor theMonitor= new Monitor("20","Acer", 27, new Resolution(2,2));

        Motherboard theMotherboard= new Motherboard("B-200","Asus", 4,6,"v2.44");

        PC thePC= new PC(theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(1,1,"A");
//        thePC.getMotherboard().loadProgram("X");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();



    }
}
