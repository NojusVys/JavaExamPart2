import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PajamuIrasas {
    private int suma;
    private String kategorija;
    private String data;
    private boolean pozymisArIBanka;
    private String papildomaInfo;


    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public boolean isPozymisArIBanka() {
        return pozymisArIBanka;
    }

    public void setPozymisArIBanka(boolean pozymisArIBanka) {
        this.pozymisArIBanka = pozymisArIBanka;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    public String getData(){
        return data;
    }

    public void setData(){
        LocalDate t = LocalDate.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.data = t.format(timeFormatter);
    }


}
