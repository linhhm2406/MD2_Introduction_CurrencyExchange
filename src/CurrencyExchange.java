import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner inputMoney = new Scanner(System.in);

        System.out.print("Nhap vao gia tri USD : ");
        int usd = inputMoney.nextInt();

        int rate = 23000;

        int vnd = usd * rate;

        Locale VNCountry = new Locale("vi","VN");
        NumberFormat VNCurrency = NumberFormat.getCurrencyInstance(VNCountry);
        String str = VNCurrency.format(vnd);

        System.out.print("Gia tri tien VND quy doi la : " + str);

    }
}
