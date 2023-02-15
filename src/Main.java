import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //sekcja wprowadzenia danych
        Double zmiennaP, zmiennaA, zmiennaK, zmiennaW;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Programik oblicza, czy Jan Kowalki jest ma promile!");
        System.out.println("Podaj ilość wypitego czystego alkoholu w gramach.");
        zmiennaA = Double.parseDouble(br.readLine());
        System.out.println("Podaj -> stały współczynnik 0,7 dla mężczyzn i 0,6 dla kobiet.");
        zmiennaK = Double.parseDouble(br.readLine());
        System.out.println("Podaj masę ciała w kg");
        zmiennaW = Double.parseDouble(br.readLine());

        zmiennaP = (zmiennaA / (zmiennaK * zmiennaW));
        System.out.print("Wynik: " + zmiennaP + "\n");

        //sekcja promili
        double Inf1 = 0.2;
        double nazwisko, imie;
        if (Inf1 < zmiennaP){
            System.out.println("Kierowca jest do .... i nie ma prawa prowadzic pojazdu na terenie Polski");
            System.out.println("Kierowca może spbie tylko pomarzyć wirtualnie \n");
        }
        if (Inf1 > zmiennaP){
            System.out.println("Kierowca musi uważać ... i basta");
        }

    }
}