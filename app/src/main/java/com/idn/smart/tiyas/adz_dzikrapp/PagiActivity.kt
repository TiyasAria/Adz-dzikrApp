package com.idn.smart.tiyas.adz_dzikrapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idn.smart.tiyas.adz_dzikrapp.Adapter.ViewPagerAdapterPG
import com.idn.smart.tiyas.adz_dzikrapp.Model.DataPagi
import kotlinx.android.synthetic.main.activity_pagi.*


class PagiActivity : AppCompatActivity() {
    private val pagiAdapterPG = ViewPagerAdapterPG(
        listOf(
            DataPagi(
                "Membaca ayat Kursi",
                "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ\n",
                """
            “Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. 
            Kepunyaan-Nya apa yang di langit dan di bumi. 
            Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. 
            Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. 
            Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya.
             Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. 
             Dan Dia Maha Tinggi lagi Maha besar.” (QS. Al Baqarah: 255) (Dibaca 1 x)
        """.trimIndent()
            ),
            DataPagi(
                "Membaca surat Al Ikhlas, Al Falaq, An Naas",
                """بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ
            
            قُلْ هُوَ اللَّهُ أَحَدٌ, اللَّهُ الصَّمَدُ, لَمْ يَلِدْ وَلَمْ يُولَدْ, وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ
            
            بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ       

            قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ, مِن شَرِّ مَا خَلَقَ ,وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ ,وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ , وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ

                   بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ

قُلْ أَعُوذُ بِرَبِّ النَّاسِ, مَلِكِ النَّاسِ ,إِلَهِ النَّاسِ ,مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ ,الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ, مِنَ الْجِنَّةِ وَ النَّاسِ
    
        """.trimIndent(),
                """
            “Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.” (QS. Al Ikhlas: 1-4) (Dibaca 3 x)
            
            “Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb yang menguasai Shubuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dan dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki”. (QS. Al Falaq: 1-5) (Dibaca 3 x)
            
            “Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia.” (QS. An Naas: 1-6) (Dibaca 3 x)
            
        """.trimIndent()
            ),
            DataPagi(
                "Membaca Do'a ketika pagi",
                """ 
            أَصْبَحْنَا وَأَصْبَحَ الْمُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ، لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. رَبِّ أَسْأَلُكَ خَيْرَ مَا فِيْ هَذَا الْيَوْمِ وَخَيْرَ مَا بَعْدَهُ، وَأَعُوْذُ بِكَ مِنْ شَرِّ مَا فِيْ هَذَا الْيَوْمِ وَشَرِّ مَا بَعْدَهُ، رَبِّ أَعُوْذُ بِكَ مِنَ الْكَسَلِ وَسُوْءِ الْكِبَرِ، رَبِّ أَعُوْذُ بِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ

        """.trimIndent(),
                """
            “Kami telah memasuki waktu pagi dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu. Wahai Rabbku, aku mohon kepada-Mu kebaikan di hari ini dan kebaikan sesudahnya. Aku berlindung kepada-Mu dari kejahatan hari ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepada-Mu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di alam kubur.” (Dibaca 1 x)

        """.trimIndent()
            ),
            DataPagi(
                "Membaca Do'a ketika pagi & petang",
                """
            اَللَّهُمَّ بِكَ أَصْبَحْنَا، وَبِكَ أَمْسَيْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوْتُ وَإِلَيْكَ النُّشُوْرُ

        """.trimIndent(),

                """
            “Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu petang. Dengan rahmat dan pertolongan-Mu kami hidup dan dengan kehendak-Mu kami mati. Dan kepada-Mu kebangkitan (bagi semua makhluk).” (Dibaca 1 x)
        """.trimIndent(),
            ),
            DataPagi(
                "Membaca sayyidul istighfar",
                """
            اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ

        """.trimIndent(),
                """
            “Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.” (Dibaca 1 x)

        """.trimIndent(),
            ),
            DataPagi(
                "Membaca Do'a pilihan pagi/petang",
                """
            اَللَّهُمَّ إِنِّيْ أَصْبَحْتُ أُشْهِدُكَ وَأُشْهِدُ حَمَلَةَ عَرْشِكَ، وَمَلاَئِكَتَكَ وَجَمِيْعَ خَلْقِكَ، أَنَّكَ أَنْتَ اللهُ لاَ إِلَـهَ إِلاَّ أَنْتَ وَحْدَكَ لاَ شَرِيْكَ لَكَ، وَأَنَّ مُحَمَّدًا عَبْدُكَ وَرَسُوْلُكَ

        """.trimIndent(),
                """
            “Ya Allah, sesungguhnya aku di waktu pagi ini mempersaksikan Engkau, malaikat yang memikul ‘Arys-Mu, malaikat-malaikat dan seluruh makhluk-Mu, bahwa sesungguhnya Engkau adalah Allah, tiada ilah yang berhak disembah kecuali Engkau semata, tiada sekutu bagi-Mu dan sesungguhnya Muhammad adalah hamba dan utusan-Mu.” (Dibaca 4 x)

        """.trimIndent()
            ),
            DataPagi(
                "Membaca Do'a pilihan pagi/petang",
                """
            اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ

        """.trimIndent(),
                """
            “Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).” (Dibaca 1 x)
        """.trimIndent()
            ),
            DataPagi(
                "Membaca Do'a pilihan pagi/petang",
                """
            اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرَّهُ إِلَى مُسْلِمٍ

        """.trimIndent(),
                """
            “Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya (godaan untuk berbuat syirik pada Allah), dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.” (Dibaca 1 x)
        """.trimIndent()
            ),

            DataPagi(
                "Membaca Do'a pilihan pagi/petang",

                """
            بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ

        """.trimIndent(),

                """
            “Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.” (Dibaca 3 x)

        """.trimIndent()
            ),

            DataPagi(
                "Membaca Do'a pilihan pagi/petang",
                """
            رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا

        """.trimIndent(),
                """
            “Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.” (Dibaca 3 x)
        """.trimIndent()
            ),

            DataPagi(
                "Membaca Do'a pilihan pagi/petang",
                """
            يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، وَأَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ أَبَدًا

        """.trimIndent(),
                """
            “Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).” (Dibaca 1 x)
        """.trimIndent(),
            ),

            DataPagi(
                "Membaca Do'a pilihan pagi/petang",

                """
            أَصْبَحْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْنَ

        """.trimIndent(),
                """
            “Di waktu pagi kami memegang agama Islam, kalimat ikhlas (kalimat syahadat), agama Nabi kami Muhammad shallallahu ‘alaihi wa sallam, dan agama bapak kami Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik.” (Dibaca 1 x di pagi hari saja)
        """.trimIndent(),
            ),
            DataPagi(
                "Membaca Do'a pilihan pagi/petang",

                """
            سُبْحَانَ اللهِ وَبِحَمْدِهِ

        """.trimIndent(),
                """
            “Maha suci Allah, aku memuji-Nya.(Dibaca 100 x)
        """.trimIndent(),
            ),
            DataPagi(
                "Membaca Do'a pilihan pagi/petang",
                """
            لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ

        """.trimIndent(),
                """
            “Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Milik Allah kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.” (Dibaca 100 x / 10 x dalam sehari)
        """.trimIndent(),
            ),
            DataPagi(
                "Membaca Do'a pilihan pagi/petang",
                """
            سُبْحَانَ اللهِ وَبِحَمْدِهِ: عَدَدَ خَلْقِهِ، وَرِضَا نَفْسِهِ، وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ

        """.trimIndent(),
                """
            “Maha Suci Allah, aku memujiNya sebanyak makhluk-Nya, sejauh kerelaan-Nya, seberat timbangan ‘Arsy-Nya dan sebanyak tinta tulisan kalimat-Nya.” (Dibaca 3 x di waktu pagi saja)
        """.trimIndent()
            ),

            DataPagi(
                "Membaca Do'a pilihan pagi/petang",
                """
            اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً

        """.trimIndent(),

                """
            “Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat (bagi diriku dan orang lain), rizki yang halal dan amal yang diterima (di sisi-Mu dan mendapatkan ganjaran yang baik).” (Dibaca 1 x setelah salam dari shalat Shubuh)
        """.trimIndent()
            ),

            DataPagi(
                "Membaca Do'a istighfar 100x",
                """
        أَسْتَغْفِرُ اللهَ وَأَتُوْبُ إِلَيْهِ

    """.trimIndent(),
                """
            “Aku memohon ampun kepada Allah dan bertobat kepada-Nya.” (Dibaca 100 x dalam sehari)
        """.trimIndent()
            )

        )
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagi)

        pagi.adapter = pagiAdapterPG


    }
}