/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.uts.npm284.barang;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */

@Entity
@Table (name = "Barang")
public class Barang {
    @Id
    @Column(name = "idbarang")
    private String IdBarang;
    
    @Column(name = "namabarang")
    private String NamaBarang;
    
    @Column(name = "jenisbarang")
    private String JenisBarang;
    
    @Column(name = "harga")
    private Integer Harga;
    
    @Column(name = "jumlah")
    private Integer Jumlah;

    public Barang() {
    }

    public Barang(String IdBarang, String NamaBarang, String JenisBarang, Integer Harga, Integer Jumlah) {
        this.IdBarang = IdBarang;
        this.NamaBarang = NamaBarang;
        this.JenisBarang = JenisBarang;
        this.Harga = Harga;
        this.Jumlah = Jumlah;
    }

    public String getIdBarang() {
        return IdBarang;
    }

    public void setIdBarang(String IdBarang) {
        this.IdBarang = IdBarang;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }

    public String getJenisBarang() {
        return JenisBarang;
    }

    public void setJenisBarang(String JenisBarang) {
        this.JenisBarang = JenisBarang;
    }

    public Integer getHarga() {
        return Harga;
    }

    public void setHarga(Integer Harga) {
        this.Harga = Harga;
    }

    public Integer getJumlah() {
        return Jumlah;
    }

    public void setJumlah(Integer Jumlah) {
        this.Jumlah = Jumlah;
    }
    
    
    
    
}
