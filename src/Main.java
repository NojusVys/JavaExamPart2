import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        PajamuIrasas pi1 = new PajamuIrasas();
        IslaiduIrasas ii1 = new IslaiduIrasas();
        Biudzetas b1 = new Biudzetas();
        Scanner sc = new Scanner(System.in);
        boolean runProgram = true;
        int pajamosId = 1;
        int islaidosId = 1;

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
                    pi1.setId(pajamosId);
                    b1.pridetiPajamuIrasa(pi1);
                    pi1 = new PajamuIrasas();
                    pajamosId++;
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
                    ii1.setId(islaidosId);
                    b1.pridetiIslaiduIrasa(ii1);
                    islaidosId++;
                    ii1 = new IslaiduIrasas();
                }
                case "isvesti pajamas" -> {
                    b1.gautiPajamuIrasa();
                }
                case "isvesti islaidas" -> {
                    b1.gautiIslaiduIsrasa();
                }
                case "balansas" -> System.out.printf("Dabartinis balansas: %.2f EUR\n", b1.balansas());
                case "remove p" -> {
                    System.out.println("Kurią operaciją norite pašalinti?");
                    int i = Integer.parseInt(sc.nextLine());
                    b1.removeP(i - 1);
                }
                case "remove i" -> {
                    System.out.println("Kurią operaciją norite pašalinti?");
                    int i = Integer.parseInt(sc.nextLine());
                    b1.removeI(i - 1);
                }
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
                remove p - pašalinti pajamų operaciją iš sąrašo
                remove i - pašalinti išlaidų operaciją iš sąrašo
                komandos - komandų sąrašas
                stop - nutraukia programos veikimą
                """);
    }
}