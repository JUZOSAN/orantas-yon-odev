import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("ilk sayi gir: ");
        int x = in.nextInt();
        System.out.print("ikinci sayi gir: ");
        int y = in.nextInt();
        System.out.print("ucuncu sayi gir: ");
        int z = in.nextInt();
        if (test(x, y, z,true))
        System.out.print("sonuc: helal beeee ");
        else
        System.out.print("sonuc: bidaha dene ");
        System.out.print("\n");
    }

    public static boolean test(int p, int q, int r, boolean xyz)
    {
        if(xyz)

        return (q > p && r > q);
        return xyz;
    }
}