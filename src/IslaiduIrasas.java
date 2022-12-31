import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IslaiduIrasas {
    private int suma;
    private String kategorija;
    private String dataSuLaiku;
    private String atsiskaitymoBudas;
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

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    public String getDataSuLaiku(){
        return dataSuLaiku;
    }

    public void setDataSuLaiku(){
        LocalDateTime t = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.dataSuLaiku = t.format(timeFormatter);
    }
}
