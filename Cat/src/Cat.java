
public class Cat
{
    private static int count = 0;

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public final int EYES_COUNT = 2;
    public final double MIN_WEIGHT = 1000.0;
    public final double MAX_WEIGHT = 9000.0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count = count + 1;

    }
    public Cat(double weight)
    {
        this.weight =  weight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count = count + 1;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void pee()
    {
        weight = weight - 50;
        System.out.println("pee");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public Double getFeedWeight()
    {
        return weight - originWeight;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public static int getCount(){
        return count;}

    public String getStatus()
    {
        if(weight < minWeight) {
            count = count - 1;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count = count - 1;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}