import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(find_lcm(a,b));
    }

    public static int find_lcm(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }

    public static int gcd(int a, int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
