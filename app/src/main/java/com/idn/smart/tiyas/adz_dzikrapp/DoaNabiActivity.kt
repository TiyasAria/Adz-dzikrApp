package com.idn.smart.tiyas.adz_dzikrapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idn.smart.tiyas.adz_dzikrapp.Adapter.ViewPagerAdapterDoaNabi
import com.idn.smart.tiyas.adz_dzikrapp.Model.DataDoaNabi
import kotlinx.android.synthetic.main.activity_doa_nabi.*

class DoaNabiActivity : AppCompatActivity() {

    private val doaNabiAdapterDoaNabi = ViewPagerAdapterDoaNabi(
        listOf(
            DataDoaNabi("Doa Nabi Adam" ,
                "رَبَّنَا ظَلَمْنَا أَنْفُسَنَا وَإِنْ لَمْ تَغْفِرْ لَنَا وَتَرْحَمْنَا لَنَكُونَنَّ مِنَ الْخَاسِرِينَ (23)\n" ,
                "Artinya: “Ya Tuhan kami, kami telah menzalimi diri kami sendiri. Jika Engkau tidak mengampuni kami dan memberi rahmat kepada kami, niscaya kami termasuk orang-orang yang merugi” (QS Al-A’raf, 23)."
                   ),
            DataDoaNabi("Doa Nabi Nuh\n" ,
                "رَبِّ إِنِّي أَعُوذُ بِكَ أَنْ أَسْأَلَكَ مَا لَيْسَ لِي بِهِ عِلْمٌ وَإِلَّا تَغْفِرْ لِي وَتَرْحَمْنِي أَكُنْ مِنَ الْخَاسِرِينَ (47)\n" ,
                "Artinya: “Ya Tuhanku, sesungguhnya aku berlingdung kepada-Mu untuk memohon kepada -Mu sesuatu yang aku tidak mengetahui (hakikatnya). Kalau Engkau tidak mengampuniku, niscaya aku termasuk orang yang merugi” (QS Hud, 47).\n"
                ),
            DataDoaNabi("Doa Nabi Nuh\n" ,
                "رَبِّ أَنْزِلْنِي مُنْزَلًا مُبَارَكًا وَأَنْتَ خَيْرُ الْمُنْزِلِينَ (29)\n" ,
                "Artinya: “Ya Tuhanku, tempatkanlah aku pada tempat yang diberkahi dan Engkau adalah sebaik-baik pemberi tempat” (QS Al-Mu’minun, 29).\n"
            ),
            DataDoaNabi("Doa Nabi Nuh\n" ,
            "رَبِّ اغْفِرْ لِي وَلِوَالِدَيَّ وَلِمَنْ دَخَلَ بَيْتِيَ مُؤْمِنًا وَلِلْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ وَلَا تَزِدِ الظَّالِمِينَ إِلَّا تَبَارًا (28)\n" ,
                "Artinya: “Ya Tuhanku, ampunilah dosaku dan (dosa) kedua orang tuaku dan siapapun yang memasuki rumahku dengan beriman laki-laki dan perempuan. Dan jangan lah Engkau tambahkan bagi orang-orang yang zalim itu selain kehancuran” (QS Nuh, 28).\n"
        ),
            DataDoaNabi("Doa Nabi Ibrahim\n" ,
                "رَبَّنَا تَقَبَّلْ مِنَّا إِنَّكَ أَنْتَ السَّمِيعُ الْعَلِيمُ (127) رَبَّنَا وَاجْعَلْنَا مُسْلِمَيْنِ لَكَ وَمِنْ ذُرِّيَّتِنَا أُمَّةً مُسْلِمَةً لَكَ وَأَرِنَا مَنَاسِكَنَا وَتُبْ عَلَيْنَا إِنَّكَ أَنْتَ التَّوَّابُ الرَّحِيمُ (128)\n" ,
                "Artinya: “Ya Tuhan kami, terimalah (amal) dari kami. Sungguh, Engkaulah Yang Maha Mendengar, Maha Mengetahui” Ya Tuhan kami, jadikanlah kami orang yang berserah diri kepada-Mu, dan anak cucu kami, umat yang berserah diri kepada-Mu dan tunjukkanlah kepada kami cara-cara melakukan ibadah kami dan terimalah taubat kami. Sungguh, Engkaulah Yang Maha Penerima tobat, Maha Penyayang” (QS Al-Baqarah, 127-128).\n"
                 ),
            DataDoaNabi("Doa Nabi Ibrahim",
            "رَبِّ اجْعَلْنِي مُقِيمَ الصَّلَاةِ وَمِنْ ذُرِّيَّتِي رَبَّنَا وَتَقَبَّلْ دُعَاءِ (40) رَبَّنَا اغْفِرْ لِي وَلِوَالِدَيَّ وَلِلْمُؤْمِنِينَ يَوْمَ يَقُومُ الْحِسَابُ (41)\n" ,
                "Artinya: “Ya Tuhanku, jadikanlah aku dan anak cucuku orang yang tetap melaksanakan shalat, ya Tuhan kami, terimlah doaku. Ya Tuhan kami, ampunilah aku dan kedua orang tuaku dan orang-orang yang beriman pada hari diadakan perhitungan (hari kiamat)” (QS Ibrahim 40-41).\n"
                ),
            DataDoaNabi("Doa Nabi Ibrahim",
            "رَبِّ هَبْ لِي حُكْمًا وَأَلْحِقْنِي بِالصَّالِحِينَ (83) وَاجْعَلْ لِي لِسَانَ صِدْقٍ فِي الْآخِرِينَ (84) وَاجْعَلْنِي مِنْ وَرَثَةِ جَنَّةِ النَّعِيمِ (85)\n",
                "Artinya: “Ya Tuhaku, berikanlah kepadaku ilmu dan masukkanlah aku ke dalam golongan orang-orang yang shaleh” (QS Al-Syu’ara’, 83-85).\n"
                 ),
            DataDoaNabi("Doa Nabi Ibrahim",
            "رَبِّ هَبْ لِي مِنَ الصَّالِحِينَ (100)\n" ,
                "Artinya: “Ya Tuhanku, anugerahkanlah aku (keturunan) dari orang-orang yang shaleh” (QS al-Shaffat, 100).\n"
                 ),
            DataDoaNabi("Doa Nabi Ibrahim",
            " رَبَّنَا عَلَيْكَ تَوَكَّلْنَا وَإِلَيْكَ أَنَبْنَا وَإِلَيْكَ الْمَصِيرُ (4) رَبَّنَا لَا تَجْعَلْنَا فِتْنَةً لِلَّذِينَ كَفَرُوا وَاغْفِرْ لَنَا رَبَّنَا إِنَّكَ أَنْتَ الْعَزِيزُ الْحَكِيمُ (5)\n" ,
                "Artinya: “Ya Tuhan kami, hanya kepada-Mu kami berserah diri, dan kepada-Mu kami bertaubat dan hanya kepada-Mu kami kembali. Ya Tuhan kami, janganlah Engkau jadikan kami (sasaran) fitnah bagi orang-orang kafir. Dan ampunilah kami, Ya Tuhan kami, sesungguhnya Engkau Yang Maha Perkasa, Maha Bijaksana. (QS Al-Mumtahanah, 4-5).  \n"
                   ),
            DataDoaNabi("Doa Nabi Hud\n" ,
                "إِنِّي تَوَكَّلْتُ عَلَى اللَّهِ رَبِّي وَرَبِّكُمْ مَا مِنْ دَابَّةٍ إِلَّا هُوَ آخِذٌ بِنَاصِيَتِهَا إِنَّ رَبِّي عَلَى صِرَاطٍ مُسْتَقِيمٍ (56)",
            "   Artinya: “Sesungguhnya aku bertawakal kepada Allah Tuhanku Tuhanmu. Tidak satupun makhluk bergerak yang bernyawa melainkan Dialah yang memegang ubun-ubunnya (menguasainya). Sungguh, Tuhanku di jalan yang lurus” (QS Hud, 56)."
                   ),

            DataDoaNabi("Doa Nabi Luth",
            " رَبِّ نَجِّنِي وَأَهْلِي مِمَّا يَعْمَلُونَ (169)",
            "  Artinya: “Ya Tuhanku selamatkanlah aku dan keluargaku dari yang mereka perbuat” (QS Al-Syu’ara’ 169)"),

            DataDoaNabi("Doa Nabi Luth",
            " رَبِّ انْصُرْنِي عَلَى الْقَوْمِ الْمُفْسِدِينَ (30)",
            "  Artinya: “Ya Tuhanku, tolonglah aku (dengan menimpakan adzab) atas golongan yang berbuat kerusakan itu. (QS Al-Ankabut 30)"),

            DataDoaNabi("Doa Nabi Yusuf",
            "فَاطِرَ السَّمَاوَاتِ وَالْأَرْضِ أَنْتَ وَلِيِّي فِي الدُّنْيَا وَالْآخِرَةِ تَوَفَّنِي مُسْلِمًا وَأَلْحِقْنِي بِالصَّالِحِينَ (101)",
            " Artinya: “Wahai Tuhan, Pencipta langit dan bumi, Engkaulah pelindungku di dunia dan akhirat, wafatkanlah aku dalam keadaan muslim dan gabungkanlah aku dengan orang-orang shaleh” (QS Yusuf 101)."),

            DataDoaNabi("Doa Nabi Syuaib",
            "وَسِعَ رَبُّنَا كُلَّ شَيْءٍ عِلْمًا عَلَى اللَّهِ تَوَكَّلْنَا رَبَّنَا افْتَحْ بَيْنَنَا وَبَيْنَ قَوْمِنَا بِالْحَقِّ وَأَنْتَ خَيْرُ الْفَاتِحِينَ (89)",
            " Artinya: “Pengetahuan Tuhan kami meliputi segala sesuatu. Hanya kepada Allah kami bertawakal. Ya Tuhan kami, berilah keputusan antara kami dan kaum kami dengan hak. Engkaulah pemberi keputusan terbaik” (QS Al-A’raf, 89)."),

            DataDoaNabi(" Doa Nabi Musa",
                " رَبِّ اشْرَحْ لِي صَدْرِي (25) وَيَسِّرْ لِي أَمْرِي (26) وَاحْلُلْ عُقْدَةً مِنْ لِسَانِي (27) يَفْقَهُوا قَوْلِي (28)",
                "    Artinya: “Ya Tuhanku, lapangkanlah dadaku, dan mudahkanlah untukku urusanku, dan lepaskanlah kekakuanku dari lidahku, agar mereka mengerti perkataanku” (QS Thaha, 25-28)"
            ),

            DataDoaNabi("Doa Nabi Musa",
            " رَبِّ إِنِّي ظَلَمْتُ نَفْسِي فَاغْفِرْ لِي فَغَفَرَ لَهُ إِنَّهُ هُوَ الْغَفُورُ الرَّحِيمُ (16)  رَبِّ بِمَا أَنْعَمْتَ عَلَيَّ فَلَنْ أَكُونَ ظَهِيرًا لِلْمُجْرِمِينَ (17)",
            " Artinya: “Ya Tuhanku, sesungguhnya aku telah menzalimi diriku sendiri, maka ampunilah aku. Maka Dia (Allah) mengampuninya, sungguh, Dia, Allah, Yang Maha Pengampun, Maha Penyayang.  Ya Tuhanku,Demi nikmat yang telah Engkau anugerahkan kepadaku, maka aku tidak akan menjadi penolong bagi orang-orang yang berdosa” (QS Al-Qashash 16-17)"),

            DataDoaNabi("Doa Nabi Musa",
                " رَبِّ إِنِّي لِمَا أَنْزَلْتَ إِلَيَّ مِنْ خَيْرٍ فَقِيرٌ (24)",
                "  Artinya: “Ya Tuhanku, sesungguhnya aku sangat memerlukan sesuatu kebaikan (makanan) yang Engkau turunkan kepadaku” (QS Al-Qashash, 24)"
            ),
            DataDoaNabi(" Doa Nabi Ayyub",
                "أَنِّي مَسَّنِيَ الضُّرُّ وَأَنْتَ أَرْحَمُ الرَّاحِمِينَ (83)",
                "Artinya: “Ya Tuhanku, sesungguh, aku telah ditimpa penyakit, padahal Engkau Tuhan Yang Maha Penyayang dari semua yang penyayang” (QS Al-Anbiya’ 83).\n"
            ),
            DataDoaNabi("Doa Nabi Sulaiman",
            " رَبِّ أَوْزِعْنِي أَنْ أَشْكُرَ نِعْمَتَكَ الَّتِي أَنْعَمْتَ عَلَيَّ وَعَلَى وَالِدَيَّ وَأَنْ أَعْمَلَ صَالِحًا تَرْضَاهُ وَأَدْخِلْنِي بِرَحْمَتِكَ فِي عِبَادِكَ الصَّالِحِينَ (19)",
            " Artinya: “Ya Tuhanku, anugerahkanlah aku ilham untuk tetap mensyukuri nikmat-Mu yang telah Engkau anugerahkan kepadaku dan kepada kedua orang tuaku dan agar aku mengerjakan kebajikan yang Engkau ridhai; dan masukkanlah aku dengan rahmat-Mu ke dalam golongan hamba-hamba-Mu yang shaleh” (QS Al-Naml, 19)."),

            DataDoaNabi("Doa Nabi Yunus",
                "لَا إِلَهَ إِلَّا أَنْتَ سُبْحَانَكَ إِنِّي كُنْتُ مِنَ الظَّالِمِينَ (87)",
                "   Artinya: “Tidak ada tuhan selain Engkau, Maha Suci Engkau. Sungguh, aku termasuk orang-orang yang zalim” (QS Al-Anbiya’ 87)."
            ),
            DataDoaNabi("Doa Nabi Zakaria",
            "رَبِّ هَبْ لِي مِنْ لَدُنْكَ ذُرِّيَّةً طَيِّبَةً إِنَّكَ سَمِيعُ الدُّعَاءِ (38)",
            " Artinya: “Ya Tuhanku, berilah aku keturunan yang baik di sisi-Mu, sesungguhnya Engkau Maha Mendengar doa” (QS Ali Imran, 38)"),

            DataDoaNabi("Doa Nabi Zakaria",
            " رَبِّ لَا تَذَرْنِي فَرْدًا وَأَنْتَ خَيْرُ الْوَارِثِينَ (89)",
                " Artinya: “Ya Tuhanku, janganlah Engkau biarkan aku hidup seorang diri (tanpa keturunan) dan Engkaulah ahli waris yang terbaik” (QS Al-Anbiya’, 89)."
            ),

            DataDoaNabi("Doa Nabi Ya’qub",
            " أَشْكُو بَثِّي وَحُزْنِي إِلَى اللَّهِ وَأَعْلَمُ مِنَ اللَّهِ مَا لَا تَعْلَمُونَ (86)",
            " Artinya: “Hanya kepada Allah aku mengadukan kesusahan dan kesedihanku. Dan aku mengetahui dari Allah apa yang tidak kamu ketahui” (QS Yusuf, 86).")

    )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_nabi)

        doanabi.adapter = doaNabiAdapterDoaNabi
    }
}