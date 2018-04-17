/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuc.hanh.pkg2;

/**
 *
 * @author asus
 */
public class arrylistclass
{
    private String ht, ns, gt;
    public arrylistclass(String ht, String ns, String gt) 
    {
        super();
        this.ht = ht;
        this.ns = ns;
        this.gt = gt;
    }
    public String getht() 
    {
        return ht;
    }
    public void setht(String ht) 
    {
        this.ht = ht;
    }
    public String getns() 
    {
        return ns;
    }
    public void setns(String ns) 
    {
        this.ns = ns;
    }
    public String getgt() 
    {
        return gt;
    }
    public void setgt(String ns) 
    {
        this.gt = gt;
    }
    public String xuat(String s) 
    {
        int ds, dht, dns, kcht, kcns, kcgt, i;
        String kht = "", kns = "", kgt = "";
        ds = s.length();
        dht = ht.length();
        dns = ns.length();
        kcht = 7 - ds;
        kcns = 11 - (dht);
        kcgt = 12 - (dns);
        for(i = 0; i < kcht; i++)
        {
            if(i == 0 || i < 3 - ds) kht += " ";
            else kht += "-";
        }
        for(i = 0; i < kcns; i++)
        {
            if(i == 0 || i < 6 - dht) kns += " ";
            else kns += "-";
        }
        for(i = 0; i < kcgt; i++)
        {
            if(i == 0 || i < 8 - dns) kgt += " ";
            else kgt += "-";
        }
        return s + kht + ht + kns + ns + kgt + gt ;
    }
}
