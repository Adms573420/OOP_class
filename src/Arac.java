public class Arac {
    private String marka;
    private String renk;
    private int model;
    private int fiyat;

    public Arac() {
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Arac(String marka, String renk, int model, int fiyat) {
        this.marka = marka;
        this.renk = renk;
        this.model = model;
        this.fiyat = fiyat;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public String getRenk() {
        return renk;
    }

    public int getModel() {
        return model;
    }

    public int getFiyat() {
        return fiyat;
    }
}
