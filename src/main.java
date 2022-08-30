import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int i = 1;
        int toplam = 0;

        System.out.print("Sayiyi giriniz : ");
        n = input.nextInt();

        for (i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                toplam += i;
            }
            if (toplam == n) {

                System.out.println("Sayinizi mukemmel sayidir.");
            } else {
                System.out.println("Sayi mukemmel degildir.");

            }

        }
    }
}
