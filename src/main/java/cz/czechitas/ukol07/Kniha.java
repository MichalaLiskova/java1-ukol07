package cz.czechitas.ukol07;

import java.beans.JavaBean;

@JavaBean
public class Kniha {

    private String autor;
    private String nazev;
    private Integer rokVydani;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public Integer getRokVydani() {
        return rokVydani;
    }

    public void setRokVydani(Integer rokVydani) {
        this.rokVydani = rokVydani;
    }
}
