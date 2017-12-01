import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int a=0;
        int b=0;
        System.out.println("Nhap so thu 1: ");
        a = x.nextInt();
        System.out.println("Nhap so thu 2: ");
        b = x.nextInt();
        System.out.println("Uoc chung lon nhat cua 2 so " + a + " va " + b + " la: " + UCLN(a, b));

        System.out.println("Nhap n = ");
        int n = 0;
        n = x.nextInt();
        System.out.println("Fibonaxi cua so nguyen " + n + " la: " + Fibonaxi(n));
    }

    public static int UCLN (int a, int b){
        int gcd = 0;
        if (a==0 && b==0) System.out.println("Nhap khong hop le");
        else if (a==0 && b!=0) gcd=b;
        else if (a!=0 && b==0) gcd=a;
        else{
            while(a!=0 && b!=0){
                if(a>b) a = a%b;
                else b = b%a;
            }
            if(a==0) gcd=b;
            if(b==0) gcd=a;
        }
        return gcd;
    }

    public static int Fibonaxi(int n){
        int fi=0;
        if(n==0) fi=0;
        else if(n==1) fi=1;
        else if (n>1) fi= Fibonaxi(n-1) + Fibonaxi(n-2);
        return fi;
    }
}


