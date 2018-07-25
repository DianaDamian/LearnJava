package Encapsulation;

public class Main {

    public static void main(String[] args) {
//        Player player= new Player();
//        player.name="Tim";
//        player.health=20;
//        player.weapon="Sword";
//
//        int damage=10;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());
//
//        damage=11;
//        player.health=200;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());



        //---------------------------------------------------------------------------------- the better and safer method for inheriting a class
        EnhancedPlayer player= new EnhancedPlayer("Diana", 50, "Sulita");
        System.out.println("Initial health is " + player.getHitpoints());

    }
}
