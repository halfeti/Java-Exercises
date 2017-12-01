import java.util.Scanner;

public class PS {
    private int ts, ms;

    public PS (int ts, int ms){
        this.ts = ts;
        this.ms = ms;
    }
    public PS(){
    }

    public static PS add(PS ps1, PS ps2){
        PS sum = new PS();
        if (ps1.ms!=0 && ps2.ms!=0){
            sum.ts = ps1.ts*ps2.ms +ps2.ts*ps1.ms;
            sum.ms = ps1.ms*ps2.ms;
        }
        return sum;
    }
    public static PS subtract(PS ps1, PS ps2){
        PS sub = new PS();
        if(ps1.ms!=0 && ps2.ms!=0){
            sub.ts = ps1.ts*ps2.ms -ps2.ts*ps1.ms;
            sub.ms = ps1.ms*ps2.ms;
        }
        return sub;
    }
    public static PS multiply(PS ps1, PS ps2){
        PS tich = new PS();
        if(ps1.ms!=0 && ps2.ms!=0){
            tich.ts = ps1.ts*ps2.ts;
            tich.ms = ps1.ms*ps2.ms;
        }
        return tich;
    }
    public static PS divide(PS ps1, PS ps2){
        PS thuong = new PS();
        if(ps1.ms!=0 && ps2.ms!=0){
            thuong.ts = ps1.ts*ps2.ms;
            thuong.ms = ps1.ms*ps2.ts;
        }
        return thuong;
    }

    public static void rutgon(PS ps){
        PS psrg = new PS();
        psrg.ts = ps.ts/Ex1.UCLN(ps.ts, ps.ms);
        psrg.ms = ps.ms/Ex1.UCLN(ps.ts, ps.ms);
        System.out.println(psrg.ts + "/" +psrg.ms);
    }

    public static boolean equals(PS ps1, PS ps2){
        return subtract(ps1, ps2).ts == 0;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int ts1, ms1, ts2, ms2;

        System.out.println("Nhap phan so thu: 1 ");
        System.out.println("Tu so 1: ");
        ts1=input.nextInt();
        System.out.println("Mau so 1:");
        ms1=input.nextInt();

        System.out.println("Nhap phan so thu: 2 ");
        System.out.println("Tu so 2: ");
        ts2=input.nextInt();
        System.out.println("Mau so 2:");
        ms2=input.nextInt();

        PS ps1 = new PS(ts1, ms1);
        PS ps2 = new PS(ts2, ms2);

        System.out.println("Tong 2 phan so la: " );
        rutgon(add(ps1, ps2));

        System.out.println("Hieu 2 phan so la: " );
        rutgon(subtract(ps1, ps2));

        System.out.println("Tich 2 phan so la: " );
        rutgon(multiply(ps1, ps2));

        System.out.println("Thuong 2 phan so la: " );
        rutgon(divide(ps1, ps2));

        System.out.println("So sanh 2 phan so");
        System.out.println(equals(ps1, ps2));
    }

}
