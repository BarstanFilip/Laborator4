import java.util.Scanner;

class Persoana {
    public String nume;
    public String prenume;
    public String cnp;
    public int anNastere;
    public int lunaNastere;
    public int ziuaNastere;
    public String adresa;

    public Persoana(String nume, String prenume, String cnp, int anNastere, int lunaNastere, int ziuaNastere, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.anNastere = anNastere;
        this.lunaNastere = lunaNastere;
        this.ziuaNastere = ziuaNastere;
        this.adresa = adresa;
    }

    public int calculeazaVarsta(int anCurent) {
        anCurent = 2023;
        return anCurent - anNastere;
    
    }
     public int sumaVarste(int calculeazaVarsta){
        calculeazaVarsta = varsta * n;
     }


    public void afiseazaDetalii() {
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("CNP: " + cnp);
        System.out.println("Data nasterii: " + ziuaNastere + "/" + lunaNastere + "/" + anNastere);
        System.out.println("Adresa: " + adresa);
    }
}
