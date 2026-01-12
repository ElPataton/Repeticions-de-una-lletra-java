import java.util.Scanner;
public class fraseambrepeticionsunalletra {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        int comptador = -1;
        int newcontador = 0;
        String frase = "";
        char lletra = 'a';
        boolean fi = false;
        String mes = "";

        System.out.println("Escriu una lletra: ");
        lletra = lectura.nextLine().charAt(0);
        while (fi != true) { 
            System.out.println("Escriu una frase");
            frase = lectura.nextLine();
            if(frase == "fi"){
                fi = true;
            }
            else{
                comptador = numchars(frase, lletra, comptador);
                if(newcontador < comptador){
                    mes = frase;
                    newcontador = comptador;
                }
            }
            System.out.println("La frase amb més '" + lletra + "' és: " + mes + " Té " + comptador + " '" + lletra + "' .");
        }
    }

    public static int numchars(String frase, char lletra, int comptador){
        int comptadorprov = 0;
        char[] frasearray = frase.toCharArray();
        for (int i = 0; i < frasearray.length; i++) {
            if(frasearray[i] == lletra){
                comptadorprov++;
            }
        }
        if(comptadorprov > comptador){
            comptador = comptadorprov;
            System.out.println("Aquesta te més '" + lletra + "'");
        }
        else{
            System.out.println("Menys '" + lletra + "'");
        }
        return comptador;
    }


}
