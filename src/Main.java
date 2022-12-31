import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int pajamosCount = 0;
        PajamuIrasas pi1 = new PajamuIrasas();
        IslaiduIrasas ii1 = new IslaiduIrasas();
        Biudzetas b1 = new Biudzetas();
        Scanner sc = new Scanner(System.in);
        boolean runProgram = true;

        komandos();
        while(runProgram){
            String command = sc.nextLine().toLowerCase();
            switch (command) {
                case "pajamos" -> {
                    System.out.println("Įveskite pajamų kiekį:");
                    pi1.setSuma(Integer.parseInt(sc.nextLine()));
                    System.out.println("Pajamų kategoriją:");
                    pi1.setKategorija(sc.nextLine());
                    System.out.println("Ar į banką (true/false)");
                    pi1.setPozymisArIBanka(Boolean.parseBoolean(sc.nextLine()));
                    System.out.println("Papildoma informacija:");
                    pi1.setPapildomaInfo(sc.nextLine());
                    pi1.setData();
                    b1.pridetiPajamuIrasa(pajamosCount, pi1);
                    pajamosCount++;
                }
                case "islaidos" -> {
                    System.out.println("Įveskite išlaidų kiekį:");
                    ii1.setSuma(Integer.parseInt(sc.nextLine()));
                    System.out.println("Išlaidų kategorija:");
                    ii1.setKategorija(sc.nextLine());
                    System.out.println("Atsiskaitymo būdas:");
                    ii1.setAtsiskaitymoBudas(sc.nextLine());
                    System.out.println("Papildoma informacija:");
                    ii1.setPapildomaInfo(sc.nextLine());
                    ii1.setDataSuLaiku();
                    b1.pridetiIslaiduIrasa(ii1);
                }
                case "isvesti pajamas" -> {
                    System.out.println("Kurią pajamų operaciją norėtumėte matyti? (1 - 100)");
                    int w = Integer.parseInt(sc.nextLine());
                    b1.gautiPajamuIrasa(w - 1);
                }
                case "isvesti islaidas" -> {
                    System.out.println("Kurią išlaidų operaciją norėtumėte matyti? (1 - 100)");
                    int q = Integer.parseInt(sc.nextLine());
                    b1.gautiIslaiduIsrasa(q - 1);
                }
                case "balansas" -> System.out.printf("Dabartinis balansas: %.2f EUR\n", b1.balansas());
                case "komandos" -> komandos();
                case "stop" -> {
                    System.out.println("Programa baigiama.");
                    runProgram = false;
                }
                default -> System.out.println("Netinkama įvestis.");
            }
        }
        sc.close();
    }

    static void komandos(){
        System.out.print("""
                pajamos - įvesti naujas pajamas
                islaidos - įvesti naujas išlaidas
                isvesti pajamas
                isvesti išlaidas
                balansas - patikrinti balansą
                komandos - komandų sąrašas
                stop - nutraukia programos veikimą
                """);
    }
}