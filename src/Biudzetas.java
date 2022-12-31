import java.util.ArrayList;

public class Biudzetas {
    ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
    ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();
    private int pajamosSum = 0;
    private int islaidosSum = 0;

    public void pridetiPajamuIrasa(int i, PajamuIrasas pi1){
        pajamos.set(i, pi1);
        pajamosSum += pajamos.get(pajamos.size() - 1).getSuma();
    }

    public void pridetiIslaiduIrasa(IslaiduIrasas ii1){
        islaidos.add(ii1);
        islaidosSum += islaidos.get(islaidos.size() - 1).getSuma();
    }

    public void gautiPajamuIrasa(int i){
        System.out.printf("""
                Suma: %d
                Kategorija: %s
                Data: %s
                Ar i banko saskaita: %b
                Papildoma informacija: %s
                """, pajamos.get(i).getSuma(), pajamos.get(i).getKategorija(), pajamos.get(i).getData(),
                pajamos.get(i).isPozymisArIBanka(), pajamos.get(i).getPapildomaInfo());
    }

    public void gautiIslaiduIsrasa(int i){
        System.out.printf("""
                Suma: %d
                Kategorija: %s
                Data ir laikas: %s
                Atsiskaitymo budas: %s
                Papildoma informacija: %s
                """, islaidos.get(i).getSuma(), islaidos.get(i).getKategorija(), islaidos.get(i).getDataSuLaiku(),
                islaidos.get(i).getAtsiskaitymoBudas(), islaidos.get(i).getPapildomaInfo());
    }

    public double balansas(){
        return pajamosSum - islaidosSum;
    }
}
