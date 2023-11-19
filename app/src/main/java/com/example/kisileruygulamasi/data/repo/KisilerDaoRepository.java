package com.example.kisileruygulamasi.data.repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.kisileruygulamasi.data.entity.Kisiler;

import java.util.ArrayList;
import java.util.List;

public class KisilerDaoRepository {
    public MutableLiveData<List<Kisiler>> kisilerListesi = new MutableLiveData<>();

    public void kaydet(String kisi_ad,String kisi_tel){
        Log.e("Kişi Kaydet",kisi_ad+" - "+kisi_tel);
    }

    public void guncelle(int kisi_id,String kisi_ad,String kisi_tel){
        Log.e("Kişi Güncelle : ",kisi_id+" - "+kisi_ad+" - "+kisi_tel);
    }

    public void ara(String aramaKelimesi){
        Log.e("Kişi Ara",aramaKelimesi);
    }

    public void sil(int kisi_id){
        Log.e("Kişi Sil ",String.valueOf(kisi_id));
        kisileriYukle();
    }

    public void kisileriYukle(){
        ArrayList<Kisiler> liste = new ArrayList<>();
        Kisiler k1 = new Kisiler(1,"Ahmet","1111");
        Kisiler k2 = new Kisiler(2,"Zeynep","2222");
        Kisiler k3 = new Kisiler(3,"Beyza","3333");
        liste.add(k1);
        liste.add(k2);
        liste.add(k3);

        kisilerListesi.setValue(liste);
    }
}
