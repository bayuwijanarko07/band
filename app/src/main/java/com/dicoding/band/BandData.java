package com.dicoding.band;

import java.util.ArrayList;

public class BandData {
    private static String[] bandNames = {
            "Andra And The Backbone",
            "Boomerang",
            "Burgerkill",
            "Dewa 19",
            "Endank Soekamti",
            "Gigi",
            "Gugun Blues Shelter",
            "JKT48",
            "J-Rock",
            "Killing Me Inside",
            "Koil"
    };

    private static String[] bandDetails = {
            "Andra and the BackBone merupakan salah satu grup musik dari Indonesia. Anggotanya berjumlah tiga orang yaitu Dedy, Stevie, dan Andra Junaidi. Grup musik ini dibentuk pada tahun 2007. Lagu utamanya ialah Musnah yang dipopulerkan ulang oleh Mulan Jameela. Album pertamanya ialah Andra and the BackBone, dirilis tahun 2007. Hits lain dari album ini adalah Sempurna yang dipopulerkan ulang oleh Gita Gutawa, serta hits lainnya adalah Lagi Dan Lagi, Dan Tidurlah, Terdalam, Perih, serta Dengarkan Aku.\n" +
                    "Salah satu anggotanya, Andra Junaidi, adalah salah satu pendiri dan mantan anggota dari grup band Dewa 19.",
            "Boomerang adalah sebuah kelompok musik rock papan atas Indonesia dari Surabaya. Resmi berdiri pada 8 Mei 1994 dengan nama Lost Angels, tetapi sudah mulai berkiprah sejak tahun 1991.\n" +
                    "\n" +
                    "Mereka konsisten tampil di jalur rock, meskipun demikian mereka tidak membatasi pengaruh berbagai macam aliran/style musik. Itu semua menjadi semacam trade mark atau ciri musik yang berbeda dari kelompok ini..",
            "Burgerkill adalah sebuah band metalcore yang berasal dari kota Bandung, Jawa Barat. Nama band ini diambil dari sebuah nama restaurant makanan siap saji asal Amerika, yaitu Burger King, yang kemudian oleh mereka di parodikan menjadi \"Burgerkill\".",
            "Dewa 19 adalah sebuah grup musik yang dibentuk pada tahun 1986 di Surabaya, Indonesia. Grup ini telah beberapa kali mengalami pergantian personel dan formasi terakhirnya sebelum dibubarkan pada tahun 2011 adalah Ahmad Dhani (kibor), Andra Junaidi (gitar), Once Mekel (vokal utama), Yuke Sampurna (bass) dan Agung Yudha (drum). Setelah merajai panggung-panggung festival di akhir era 1980-an, Dewa 19 kemudian hijrah ke Jakarta dan merilis album pertamanya pada tahun 1992 di bawah label Team Records",
            "Endank Soekamti adalah grup musik rock Indonesia yang berasal dari Yogyakarta.\n" +
                    "\n" +
                    "Nama \"Soekamti\" diambil dari nama seorang guru Erix saat menuntut ilmu di Sekolah Menengah Musik (SMM) Yogyakarta. Makna dari nama Soekamti diuraikan sebagai berikut Soe artinya \"indah\", kam artinya \"datang\", ti itu karena perempuan. Jadi arti Soekamti adalah \"kehadiran yang membawa kebaikan atau keindahan\".[1] Sementara Endank tidak memiliki makna khusus, hanya sekadar untuk mempercantik nama saja.",
            "Gigi adalah nama sebuah band asal Indonesia. Gigi dibentuk oleh Dewa Budjana[1]. Pada awalnya Grup Band ini terdiri atas Armand Maulana sebagai vokalis, Thomas Ramdhan sebagai bassis, Dewa Budjana sebagai gitaris, Ronald Fristianto sebagai drummer, dan Baron Arafat sebagai gitaris.",
            "Gugun Blues Shelter (seringkali disingkat GBS) adalah sebuah grup musik asal Indonesia ber-aliran blues, yang dibentuk di Jakarta, Indonesia pada tahun 2004. Para anggotanya saat ini antara lain Gugun (gitar), Fajar (bass) dan Bowie (drum). Mereka telah merilis delapan album, Get The Bug (2004), Turn It On (2007), Gugun Blues Shelter (2010), \"Satu Untuk Berbagi\" (2011), \"Far East Blues Experience\" (2011 - album kompilasi), \"Solid Ground\" (2011), \"Soul Shaker\" (2013) dan \"High Life\" (2015) serta \"Hitam Membiru\" (2016)",
            "JKT48 (dibaca [ˈd͡ʒeɪˈkeɪˈtiːˈfɔɹtiˈeɪt]) adalah grup idola asal Indonesia. Dibentuk pada tahun 2011, JKT48 adalah idol group saudari bentukan 48Group (AKS Co., Ltd./Kabushiki-gaisha AKS) bermitra dengan PT. Dentsu Inter Admark Media Group Indonesia (sebagai agensi dan manajemen penaung) yang pertama di Asia Tenggara, dan JKT48 adalah Idol Group pertama di Indonesia. JKT48 secara tidak langsung diproduseri oleh Yasushi Akimoto.",
            "J-Rocks adalah band dari Jakarta yang berdiri pada 9 November 2003 dengan personel Iman Taufik Rachman (vokal dan gitar), Sony Ismail Robayani (gitar), Swara Wimayoga (bass), dan Anton Rudi Kelces (drum). Aliran band ini adalah Japanese pop/rock, pop, rock, dan rock alternatif.",
            "Killing Me Inside (juga dikenal sebagai Killms) merupakan sebuah grup musik asal Jakarta Selatan, Indonesia dibentuk pada Juni 2005. Saat ini mereka beranggotakan 5 orang yaitu vokalis Vira Razak, gitaris Josaphat Klemens, keyboardist Rudye Nugraha Putra, bassist Angga Tetsuya Wibisana dan drummer Putra Pra Ramadhan. Sejak terbentuk, mereka telah mengeluarkan 4 album yaitu \"A Fresh Start for Something New\", \"Killing Me Inside\", \"One Reason\" dan \"\"Rebirth: A New Beginning\"\".",
            "Koil adalah band rock yang berasal dari Bandung, berdiri pada tahun 1993 dengan formasi awal Raden Mas Julius Aryo Verdijantoro (Vokal), Raden Mas Donnijantoro (Gitar), Ibrahim Nasution (Gitar/Bass), Leon Ray Legoh (Drum). Sejak awal berdiri Koil memutuskan untuk membuat dan memainkan lagu-lagu ciptaan sendiri. Keputusan ini merupakan hal yang kurang lazim saat itu, karena kebanyakan band saat itu lebih sering membawakan lagu orang lain. Pada tahun 2007  Fransiskus Xaverius Adam Joswara dari Kubik bergabung sebagai pemain bass, dan pada tahun 2009 Ibrahim Nasution memutuskan keluar dari band."
    };
    private static int[] bandImages = {
            R.drawable.andra_and_the_backbone,
            R.drawable.boomerang_band,
            R.drawable.burgerkill,
            R.drawable.dewa_19,
            R.drawable.endank_soekamti,
            R.drawable.gigi,
            R.drawable.gugun_blues_shelter,
            R.drawable.jkt48,
            R.drawable.j_rock,
            R.drawable.killing_me_inside,
            R.drawable.koil,
    };
    static ArrayList<Band> getListData() {
        ArrayList<Band> list = new ArrayList<>();
        for (int position = 0; position < bandNames.length; position++) {
            Band band = new Band();
            band.setName(bandNames[position]);
            band.setDetail(bandDetails[position]);
            band.setPhoto(bandImages[position]);
            list.add(band);
        }
        return list;
    }

}
