package com.example.tommy.tommysyamranata_1202153368_modul3;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Daftarmainmenu extends AppCompatActivity {
    RecyclerView recv;
    Adapterformenu adptr;
    List<menulist> daftarmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftarmenu);
        //set title bar menjadi Dafter Air Mineral
        setTitle("Daftar Air Mineral");

        //membuat array list baru dengan nama daftarmenu
        daftarmenu = new ArrayList<>();
        //mendapat penanganan recycler view
        recv = findViewById(R.id.rvmenu);
        recv.setHasFixedSize(true);
        //kondisi ketika orientasi menjadi landscape
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            //maka akan menampilkan 2 grid
            recv.setLayoutManager(new GridLayoutManager(Daftarmainmenu.this, 2));
            //jika orientasi menjadi portrait
        }else {
            //maka akan menampilkan satu grid saja
            recv.setLayoutManager(new GridLayoutManager(Daftarmainmenu.this, 1));
        }
        //menjalankan fungsi input data
        inputdata();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            recv.setLayoutManager(new GridLayoutManager(Daftarmainmenu.this, 2));
        }else {
            recv.setLayoutManager(new GridLayoutManager(Daftarmainmenu.this, 1));
        }
    }

    public void inputdata(){
        //memasukkan data ke dalam array
        daftarmenu.add(new menulist(R.drawable.ades, "Ades", "This is Ades brand mineral water. \nAdes (previously once called AdeS) is a brand of mineral water or bottled water (AMDK) manufactured by PT. Coca-Cola Bottling Indonesia, Bekasi. The mineral water is also known as I-Lohas in Japan."));
        daftarmenu.add(new menulist(R.drawable.amidis,"Amidis", "This is Amidis brand mineral water. \nAMIDIS is a health drinking water processed through a distillation or distillation or evaporation system, through a heating process of up to 180 degrees Celsius resulting in pure drinking water (NON-MINERAL) without the content of pollutants, inorganic minerals or other contaminants such as chemicals or pesticides."));
        daftarmenu.add(new menulist(R.drawable.aqua, "Aqua", "This is Aqua mineral water. \nAqua is a brand of bottled drinking water (AMDK) produced by PT Aqua Golden Mississippi Tbk in Indonesia since 1973. In addition to Indonesia, Aqua is also sold in Malaysia, Singapore and Brunei."));
        daftarmenu.add(new menulist(R.drawable.cleo, "Cleo", "This is the Cleo mineral water. \nCleo Pure Water is taken from mountain springs and processed via a 0.0001 micron hyper membrane filter so it does not contain inorganic microorganisms and minerals, such as chlorine and sodium fluoride."));
        daftarmenu.add(new menulist(R.drawable.club, "Club", "This is the Club's mineral water. \nClub is a brand of bottled water or mineral water in Indonesia. This brand comes from Surabaya and Pandaan, Pasuruan, East Java. Club was produced by PT Tirta Sukses Perkasa (formerly PT Tirta Bahagia) since 1986. In November 2013, Club brand was acquired by PT Indofood CBP Sukses Makmur Tbk."));
        daftarmenu.add(new menulist(R.drawable.equil, "Equil", "This is the mineral water of the Equil brand. \nEquil is an inorganic mineral water produced by PT Equilindo Asri. The owner of PT Equilindo Asri is Morgen Sutanto. For its industrial location located in Vila D'Equilibrium, and Equil packaging factory is located at the foot of Mount Salak, Sukabumi, West Java."));
        daftarmenu.add(new menulist(R.drawable.evian, "Evian", "This is Evian brand mineral water. \nEvian is a natural mineral water derived from a source at the top of the Alps, France. Each drop goes through the journey and natural process for 15 years before it appears in the spring. Mineral formation occurs during the natural process, passing through the ice and rocks, in a unique composition. "));
        daftarmenu.add(new menulist(R.drawable.leminerale, "leMinerale", "This is the mineral water of leMinerale brand. \nLe Minerale is a new mineral water from Mayora, a mountainous mineral water that contains natural minerals that the body needs everyday. Le Minerale, processed from the source of selected mountain springs, so it has a distinctive freshness characterized by a little sweetness."));
        daftarmenu.add(new menulist(R.drawable.nestle, "Nestle", "This is the Nestle brand mineral water. \nThe irreplaceable freshness of the Nestlé Pure Life Mineral Water derived from all purity of choice springs and hygienically processed. Product Specifications. Product Type: Mineral Water. Content: 1500ml."));
        daftarmenu.add(new menulist(R.drawable.pristine, "Pristine", "This is a Pristine brand mineral water. \nClean drinking water is ionized drinking water, pristine drinking water is alkaline water with ph 8 which is beneficial for health, practical and economical drinking water."));
        daftarmenu.add(new menulist(R.drawable.vit, "Vit", "This is Vit brand mineral water. \nVIT is a brand of bottled drinking water (AMDK) manufactured by PT Tirta Investama in Indonesia. Started production since November 16, 1982 and originally owned by PT Varia Industrial Tirta."));
        //membuat adapter baru yang menghubungkan kelas ini dengan data yang ingin ditampilkan
        adptr = new Adapterformenu(this,daftarmenu);
        //menguhubungkan recycler view dengan adapter
        recv.setAdapter(adptr);
    }
}
