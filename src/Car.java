public class Car {

    private int wheels;
    private String name;


    public void setName(String name){
        String validName= name.toLowerCase();
        if(validName.equals("peugeot")||validName.equals("honda"))
        {this.name= name;}
        else {
            this.name="Unknown";
        }
    }

    public String getName(){
        return this.name;
    }
}
