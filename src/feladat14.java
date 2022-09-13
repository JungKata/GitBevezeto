import java.util.Scanner;

public class feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy szöveget: ");
        String szoveg = sc.nextLine();
        String manuPont = "";
        while (!manuPont.equals("f"))
        {
            System.out.println("Adja meg mit szedretne csinálni a szöveggel: ");
            System.out.println("\t a- Nagybetűsé alakítani");
            System.out.println("\t b- Kisbetűssé alakítani");
            System.out.println("\t c- Lekérdezni a hosszát");
            System.out.println("\t d- Össze hasonlítani a másikkal");
            System.out.println("\t e- A szöveg egy részét kiiratni");
            System.out.println("\t f- Kilépés");
            manuPont = sc.nextLine().toLowerCase();

        }
    }
}
