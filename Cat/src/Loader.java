
public class Loader
{
    public static void main(String[] args)
    {
        //Cat cat = new Cat();

        //System.out.println(cat.getStatus());

        Cat vaska = new Cat();
        //vaska.feed(5000.0);
       /* int i = 0;
        while (!vaska.getStatus().equals("Dead")){
            vaska.meow();
            i++;
        }*/
        vaska.feed(1000.0);

        System.out.println(vaska.getFeedWeight());

        System.out.println(vaska.getStatus());
        //System.out.println("i = " + i);
//
//

    }
}