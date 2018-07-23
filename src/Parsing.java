public class Parsing {

    public static void main (String[] args){
        String numberAsString= "2018.123";
        System.out.println("numberAsString= "+ numberAsString);

        double x= Double.parseDouble(numberAsString);

        numberAsString +=1;
        x +=1;

        System.out.println(numberAsString);
        System.out.println(x);

    }

}
