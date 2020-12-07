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
public class Balok extends Persegi implements MenghitungRuang{
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public Balok() {
        super();
        tinggi = 0;
    }

    @Override
    public double volumeBangunRuang(){
        return super.luasBangunDatar()*tinggi;
    }

    @Override
    public double luasBangunRuang(){
        return 2*super.luasBangunDatar() + 2*super.getLebar()*tinggi + 2*super.getPanjang()*tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
}

