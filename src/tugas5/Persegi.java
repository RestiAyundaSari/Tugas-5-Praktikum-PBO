/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author DELL
 */
public class Persegi implements MenghitungBidang{
    private double panjang, lebar;

    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Persegi() {
        panjang = 0;
        lebar = 0;
    }
    
    @Override
    public double luasBangunDatar(){
        return panjang*lebar;
    }
    
    @Override
    public double kelilingBangunDatar(){
        return 2*panjang + 2*lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

}
