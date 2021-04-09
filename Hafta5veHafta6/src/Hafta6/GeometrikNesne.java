/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta6;

import java.util.Date;

/**
 *
 * @author Yaren Zengin
 */
public class GeometrikNesne {
    private String renk;
    private boolean doluMu;
    private  Date olusturulmaTarihi;

    public GeometrikNesne() {
        renk = "beyaz";
        olusturulmaTarihi = new Date();
    }

    public GeometrikNesne(String renk, boolean doluMu) {
        this.renk = renk;
        this.doluMu = doluMu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public boolean isDoluMu() {
        return doluMu;
    }

    public void setDoluMu(boolean doluMu) {
        this.doluMu = doluMu;
    }

    public Date getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }
    
}
