import java.util.Scanner;

public class Main {
    static int usAlma(int us,int taban){
        if (us==0){
            return 1;
        }
        return usAlma(us-1,taban)*taban;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tabandaki sayiyi giriniz: ");
        int y = input.nextInt();
        System.out.println("Usteki sayiyi giriniz: ");
        int x = input.nextInt();

        System.out.println(usAlma(x,y));
    }
}
