import static java.lang.Integer.valueOf;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(12345));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(5059191));

    }

    public static Integer sumDigits(Integer number)
    {
        //@TODO: write code here
        int sum = 0;
        for (int i = 0; i < number.toString().length(); i++) {
            char c = number.toString().charAt(i);
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
