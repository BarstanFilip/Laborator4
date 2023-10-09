import java.util.Scanner;

public class Main1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti numarul de persoane: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Persoana[] persoane = new Persoana[n];

        for (int i = 0; i < n; i++) {
            System.out.print("numele persoanei " + (i + 1) + ": ");
            String nume = scanner.nextLine();

            System.out.print("prenumele persoanei " + (i + 1) + ": ");
            String prenume = scanner.nextLine();

            System.out.print("CNP-ul persoanei " + (i + 1) + ": ");
            String cnp = scanner.nextLine();

            System.out.print("anul nasterii  " + (i + 1) + ": ");
            int anNastere = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("luna nasterii  " + (i + 1) + ": ");
            int lunaNastere = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Introduceti ziua naterii persoanei " + (i + 1) + ": ");
            int ziuaNastere = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Introduceti adresa persoanei " + (i + 1) + ": ");
            String adresa = scanner.nextLine();

            persoane[i] = new Persoana(nume, prenume, cnp, anNastere, lunaNastere, ziuaNastere, adresa);
        }

       
        for (int i = 0; i < n; i++) {
            System.out.println("Detalii despre persoana " + (i + 1) + ":");
            persoane[i].afiseazaDetalii();
            int varsta = persoane[i].calculeazaVarsta(2023); 
            int sumaVarste = persoane[n].varsta;
            System.out.println("Suma varstei" +  sumaVarste);
            System.out.println("Varsta: " + varsta + " ani");
            System.out.println();
        } 
// medie varsta

      double mediaVarstelor = (double) sumaVarste / n;
        System.out.println("Media varstaelor" + mediaVarstelor);
        scanner.close();

    }
}