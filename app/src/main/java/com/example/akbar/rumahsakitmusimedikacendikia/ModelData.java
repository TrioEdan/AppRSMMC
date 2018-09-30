package com.example.akbar.rumahsakitmusimedikacendikia;

public class ModelData {
    private String id, no_medrec, nomed, tgllhr, nama, alamat, nohp, bayar, poli, dokter, tglbook, namadaftar, norujuk, tglnow;

    public ModelData(String id, String no_medrec, String nomed, String tgllhr, String nama, String alamat, String nohp, String bayar, String poli, String dokter, String tglbook, String namadaftar, String norujuk, String tglnow) {
        this.id = id;
        this.no_medrec = no_medrec;
        this.nomed = nomed;
        this.tgllhr = tgllhr;
        this.nama = nama;
        this.alamat = alamat;
        this.nohp = nohp;
        this.bayar = bayar;
        this.poli = poli;
        this.dokter = dokter;
        this.tglbook = tglbook;
        this.namadaftar = namadaftar;
        this.norujuk = norujuk;
        this.tglnow = tglnow;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo_medrec() {
        return no_medrec;
    }

    public void setNo_medrec(String no_medrec) {
        this.no_medrec = no_medrec;
    }

    public String getNomed() {
        return nomed;
    }

    public void setNomed(String nomed) {
        this.nomed = nomed;
    }

    public String getTgllhr() {
        return tgllhr;
    }

    public void setTgllhr(String tgllhr) {
        this.tgllhr = tgllhr;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getBayar() {
        return bayar;
    }

    public void setBayar(String bayar) {
        this.bayar = bayar;
    }

    public String getPoli() {
        return poli;
    }

    public void setPoli(String poli) {
        this.poli = poli;
    }

    public String getDokter() {
        return dokter;
    }

    public void setDokter(String dokter) {
        this.dokter = dokter;
    }

    public String getTglbook() {
        return tglbook;
    }

    public void setTglbook(String tglbook) {
        this.tglbook = tglbook;
    }

    public String getNamadaftar() {
        return namadaftar;
    }

    public void setNamadaftar(String namadaftar) {
        this.namadaftar = namadaftar;
    }

    public String getNorujuk() {
        return norujuk;
    }

    public void setNorujuk(String norujuk) {
        this.norujuk = norujuk;
    }

    public String getTglnow() {
        return tglnow;
    }

    public void setTglnow(String tglnow) {
        this.tglnow = tglnow;
    }

    public ModelData(){

    }
}
