package com.patriciasoft.traductor.modelo;

public class Palabra {
    private String espaniol;
    private String ingles;
    private int foto;

    public Palabra(String espaniol, String ingles, int foto) {
        this.espaniol = espaniol;
        this.ingles = ingles;
        this.foto = foto;
    }

    public String getEspaniol() {
        return espaniol;
    }

    public void setEspaniol(String espaniol) {
        this.espaniol = espaniol;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
