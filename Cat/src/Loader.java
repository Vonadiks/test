
public class Loader
{
    public static void main(String[] args)
    {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1.getWeight() + " , " + cat2.getWeight());
        Cat cat3 = Cat.copyCat(cat1);
        System.out.println(cat1.getWeight() + " , " + cat3.getWeight());
        Cat cat4 = Cat.copyCat(cat2);
        System.out.println(cat2.getWeight() + " , " + cat4.getWeight());

        /*Cat vaska = getKitten();
        Cat murka = getKitten();
        Cat luxor = getKitten();
        System.out.println(vaska.getWeight() + "," + murka.getWeight() +"," + luxor.getWeight());

         */

        /*double feedW;
        Cat vaska = new Cat();
        Cat murka = new Cat();
        Cat tishka = new Cat();
        Cat chernyshka = new Cat();
        Cat luxor = new Cat();
        System.out.println("vaska_weight = " + vaska.getWeight());
        System.out.println("murka_weight = " + murka.getWeight());
        System.out.println("tishka_weight = " + tishka.getWeight());
        System.out.println("chernyshka_weight = " + chernyshka.getWeight());
        System.out.println("luxor_weight = " + luxor.getWeight());
        System.out.println(Cat.getCount()); */



        /*vaska.feed(1000.0);
        System.out.println(vaska.getWeight());
        murka.feed(500.0);
        System.out.println(murka.getWeight()); */



        /*while (!tishka.getStatus().equals("Exploded")){
            tishka.feed(1000.0);
        }
        //System.out.println(tishka.getStatus());
        while (!luxor.getStatus().equals("Dead")){
            luxor.meow();
        } */

        //System.out.println(vaska.getStatus());

        //Cat vaska = new Cat();
        /*System.out.println(vaska.getWeight());
        vaska.feed(150.0);
        feedW = vaska.getFeedWeight();
        vaska.pee();
        vaska.pee();
        System.out.println(feedW);
        System.out.println(Cat.getCount()); */
    }

    private static Cat getKitten(){
        return new Cat(1100.0);
    }


}