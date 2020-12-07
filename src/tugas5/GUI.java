/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
     public class GUI extends JFrame implements ActionListener{
     JLabel judul            = new JLabel("Kalkulator Balok ");
     JLabel hasil            = new JLabel("Hasil    ");
     JTextField fpanjang     = new JTextField(10);
     JLabel lpanjang         = new JLabel("Panjang  ");
     JTextField flebar       = new JTextField(10);
     JLabel llebar           = new JLabel("Lebar ");
     JTextField ftinggi      = new JTextField(10);
     JLabel ltinggi          = new JLabel("Tinggi ");
     JLabel lluasPersegi     = new JLabel (" Luas Persegi          :");
     JLabel lkelilingPersegi = new JLabel (" Keliling Persegi      :");
     JLabel lvolumeBalok     = new JLabel (" Volume Balok          :");
     JLabel lluasBalok       = new JLabel (" Luas Permukaan Balok  :"); 
     JLabel lhasilLP         = new JLabel ();    
     JLabel lhasilKP         = new JLabel ();
     JLabel lhasilVB         = new JLabel ();    
     JLabel lhasilLB         = new JLabel ();
     JButton bReset          = new JButton("Reset");
     JButton bHitung         = new JButton("Hitung");
     
     public GUI(){
         setTitle ("Kalkulator Balok");
         setSize(500,500);
         
         setLayout(null);
         add(judul);
         add(lpanjang);
         add(fpanjang);
         add(llebar);
         add(flebar);
         add(ltinggi);
         add(ftinggi);
         add(hasil);
         add(bHitung);
         add(bReset);
         
         
         judul.setBounds(170, 10, 120, 20);
         lpanjang.setBounds(80, 50, 170, 20);
         fpanjang.setBounds(200, 50, 150, 20);
         llebar.setBounds(80, 110, 150, 20);
         flebar.setBounds(200, 110, 150, 20);
         ltinggi.setBounds(80, 170, 150, 20);
         ftinggi.setBounds(200, 170, 150, 20);
         hasil.setBounds(200, 230, 150, 20);
         lluasPersegi.setBounds(80, 270, 150, 20);
         lhasilLP.setBounds(230, 270, 150, 20);
         lkelilingPersegi.setBounds(80, 300, 150, 20);
         lhasilKP.setBounds(230, 300, 150, 20);
         lvolumeBalok.setBounds(80, 330, 150, 20);
         lhasilVB.setBounds(230, 330, 150, 20);
         lluasBalok.setBounds(80, 360, 150, 20);
         lhasilLB.setBounds(230, 360, 150, 20);
         bHitung.setBounds(120, 400, 100, 20);
         bReset.setBounds(240, 400, 100, 20);
         
         setVisible(true);
         bHitung.addActionListener(this); 
         bReset.addActionListener(this);
         setDefaultCloseOperation(EXIT_ON_CLOSE);//close frame maka aplikasiakan berhenti
         setLocationRelativeTo(null);//frame ditengah
  }  
     
     @Override
     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == bHitung) {
             
            if(getFpanjang().equals("")|| 
            getFlebar().equals("")||
            getFtinggi().equals("")){
            System.out.println("Data Masih Kosong\n");
            JOptionPane.showMessageDialog(null,"Data Tidak boleh kosong");
        }
        else {
                try{
//            float panjang = getFpanjang();
                 double panjang = Double.parseDouble(getFpanjang());
                 double lebar = Double.parseDouble(getFlebar());
                 double tinggi = Double.parseDouble(getFtinggi());
             
                 Balok balok    = new Balok(panjang, lebar, tinggi);
                 add(lluasPersegi);
                 add(lkelilingPersegi);
                 add(lvolumeBalok);
                 add(lluasBalok);
                 add(lhasilLP);
                 add(lhasilKP);
                 add(lhasilVB);
                 add(lhasilLB);
                 
                String hasilLP = String.valueOf(balok.luasBangunDatar());
                String hasilKP = String.valueOf(balok.kelilingBangunDatar());
                String hasilLB = String.valueOf(balok.luasBangunRuang());
                String hasilVB = String.valueOf(balok.volumeBangunRuang());
            
                lhasilLP.setText(hasilLP);
                lhasilKP.setText(hasilKP);
                lhasilLB.setText(hasilLB);
                lhasilVB.setText(hasilVB);
            
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"       Input salah");
                 }
             }
        
         }
          if (e.getSource() == bReset) {
              fpanjang.setText("");
              flebar.setText("");
              ftinggi.setText("");
              lluasPersegi.setText("");
              lkelilingPersegi.setText("");
              lluasBalok.setText("");
              lvolumeBalok.setText("");
              lhasilLP.setText("");
              lhasilKP.setText("");
              lhasilLB.setText("");
              lhasilVB.setText("");
              
          }
          
        }
     

    public String getFpanjang() {
        return fpanjang.getText();
    }

    public String getFlebar() {
        return flebar.getText();
    }

    public String getFtinggi() {
        return ftinggi.getText();
    }


 }
