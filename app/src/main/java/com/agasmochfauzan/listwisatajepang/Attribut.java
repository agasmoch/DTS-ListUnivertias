package com.agasmochfauzan.listwisatajepang;

public class Attribut {
    int image;
    String namawisata;
    String deskripsiwisata;

    public Attribut () {

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNamawisata() {
        return namawisata;
    }

    public void setNamawisata(String namawisata) {
        this.namawisata = namawisata;
    }

    public String getDeskripsiwisata() {
        return deskripsiwisata;
    }

    public void setDeskripsiwisata(String deskripsiwisata) {
        this.deskripsiwisata = deskripsiwisata;
    }

    public Attribut(int image, String namawisata, String deskripsiwisata) {
        this.image = getImage();
        this.namawisata = namawisata;
        this.deskripsiwisata = deskripsiwisata;//Konstraktor Attribut

    }
}
