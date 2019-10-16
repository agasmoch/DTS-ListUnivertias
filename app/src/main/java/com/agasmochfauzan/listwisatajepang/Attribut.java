package com.agasmochfauzan.listwisatajepang;

public class Attribut {
    int unage;
    String namawisata;
    String deskripsiwisata;

    public int getUnage() {
        return unage;
    }

    public void setUnage(int unage) {
        this.unage = unage;
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

    public Attribut(int unage, String namawisata, String deskripsiwisata) {
        this.unage = unage;
        this.namawisata = namawisata;
        this.deskripsiwisata = deskripsiwisata;//Konstraktor Attribut

    }
}
