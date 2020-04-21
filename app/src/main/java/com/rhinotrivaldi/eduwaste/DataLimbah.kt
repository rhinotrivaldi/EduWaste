package com.rhinotrivaldi.eduwaste

object DataLimbah {
    private val namaLimbahs = arrayOf(
        "Pelumas Bekas",
        "Aki Bekas",
        "Lampu TL Bekas/Limbah Elektronik",
        "Slugde IPAL",
        "Glasswool Bekas",
        "B3 Kadaluarsa",
        "Kemasan Bekas B3",
        "Majun Terkontaminasi B3",
        "Limbah Klinis",
        "Fly Ash",
        "Bottom Ash")

    private val detailLimbahs = arrayOf(
        "Minyak pelumas bekas atau yang dalam keseharianya disebut juga dengan oli bekas pada dasarnya adalah minyak pelumas yang dalam pemakaianya telah mengalami berbagai macam gesekan dan tercampur dengan kotoran dari komponen-komponen mesin, sisa pembakaran maupun debu, hal ini menyebabkan efektifitas minyak pelumas menurun dan kontaminan yang didalamnya bila dibiarkan terlalu lama akan menjadi partikel yang abrasive dan merugikan, Jika ditinjau dari segi tersebut maka dengan menghilangkan sejumlah kontaminan dan mengembalikan sifat pelumasan yang dimilikinya minyak pelumas sangat berpotensi jika didaur ulang kembali.",
        "Aki bekas merupakan alat penyimpanan energi untuk kendaraan bermotor. Komponen utama penyusun accu alias aki (baterai) kendaraan bermotor sampai saat ini masih terbuat dari timbal (timah hitam/Pb) dan asam sulfat (H2SO4) yang merupakan zat berbahaya bagi lingkungan. Sampai saat ini, belum ada alternatif sebagai penggantinya.",
        "Lampu TL Bekas atau Limbah Elektronik merupakan sisa dari pemakaian alat-alat elektronik yang didalam nya memiliki zat kimia berbahaya bagi manusia serta lingkungan. Didalam lampu tl terdapat merkuri dalam bentuk bubuk maupun uap, merkuri dapat meracuni metabolisme tubuh manusia yang berdampak jika kepada anak - anak dapat menurunkan IQ.",
        "Sludge IPAL atau Lumpur sisa dari Instalasi Pengelolaan Air Limbah adalah residu dari pengolahan limbah yang masih mengandung banyak komponen berharga. Sludge pada setiap perusahaan berbeda - beda, salah satunya di pembangkit. Sludge IPAL nya merupakan residu dari Batubara yang tidak masuk kedalam sistem namun ke tempat penampungan atau di sebut settlement pond.",
        "Glasswool bekas adalah material penahan panas yang biasa di gunakan dalam PLTU yaitu untuk melindungi pipa steam agar panas tetap terjaga. Glasswool dapat menyebabkan iritasi jika terkena kulit.",
        "B3 Kadaluarsa merupakan Zat B3 yang sudah melewati masa simpan atau expired. Zat tersebut sudah tidak bisa di gunakan kembali maka masuk kedalam limbah B3 dan perlu pengelolaan lebih lanjut untuk pemusnahan nya.",
        "Kemasan Bekas B3 merupakan tempat/wadah dari zat b3 yang telah digunakan, kemasan tersebut dalam mengkontaminasi lingkungan sekitar jika tidak dilakukan penanganan dengan baik. Salah satu nya yaitu kemasan bekas pelumas jika tidak ditangani dengan baik pelumas sisa yang terdapat pada kemasan dapat mengkontaminasi tanah jika diletakan pada tanah. Dapat mengkontaminasi air jika kemasan dibuang ke sungai ataupun laut. Maka dari itu perlu dilakukan pengelolaan lebih lanjut terkait limbah kemasan",
        "Majun terkontaminasi B3 merupakan alat pembantu pembersihan suatu barang atau lainnya. Majun sendiri bukan jenis Limbah B3, namun setelah terkontaminasi bahan - bahan atau zat B3 majun tersebut dapat dikategorikan sebagai limbah B3 dan perlu penanganan lebih lanjut untuk pengelolaan nya.",
        "Limbah Klinis merupakan limbah atau sisa dari proses yang dilakukan oleh rumah sakit, klinik, ataupun tempat kesehatan lain nya. Limbah klinis terdapat banyak macamnya, yaitu sisa hasil operasi yang dilakukan atau pembedahan, jaruk suntik, kapas terkontaminasi darah, bagian tubuh dan sebagai nya, masker pasien dengan virus mematikan dan lain - lain. Oleh karena itu limbah klinis harus dilakukan pengelolaan lebih lanjut.",
        "Fly Ash merupakan abu terbang dari sisa hasil pembakaran batubara pada unit pembangkit listrik. Sifat nya yang karsinogenik jika masuk kedalam tubuh, hal ini diperlukan penanganan khusus terkait abu terbang.",
        "Bottom Ash merupakan abu bawah dari sisa hasil pembakaran batubara pada unit pembangkit, perbedaan terhadap abu terbang adalah dari ukuran nya abu bawah memiliki ukuran yang lebih besar. Bottom ash sama - sama dikategorikan limbah B3 seperti Fly ash dan butuh pengangan lebih lanjut untuk pengelolaan nya.")


    private val advancedManagements = arrayOf(
        "Pelumas Bekas dapat dilakukan penyulingan kembali atau dijadikan bahan bakar.",
        "Aki bekas dapat dilakukan peleburan kembali untuk mendapatkan bagian - bagian penting lain nya.",
        "Lampu TL dapat dilakukan pemusnahan dengan incenerator dengan suhu yang tinggi.",
        "Sludge IPAL dapat dikelola dan dijadikan bahan baku atau campuran beton.",
        "Glasswool bekas dapat dilakukan pemusnahan dengan incenerator dengan suhu yang tinggi.",
        "B3 Kadaluarsa dapat dilakukan pemusnahan dengan incenerator dengan suhu yang tinggi.",
        "Kemasan Bekas B3 dapat dilakukan pemusnahan dengan incenerator dengan suhu yang tinggi.",
        "Majun terkontaminasi B3 dapat dilakukan pemusnahan dengan incenerator dengan suhu yang tinggi.",
        "Limbah klinis dapat dilakukan pemusnahan dengan incenerator dengan suhu yang tinggi.",
        "Fly Ash dapat dikelola dan dijadikan bahan baku atau campuran beton.",
        "Bottom Ash dapat dikelola dan dijadikan bahan baku atau campuran beton.")

    private val hazardCodes = arrayOf(
        "B105d",
        "A102d",
        "B107d",
        "B333-3",
        "B354-4",
        "A338-1",
        "B104d",
        "B110d",
        "A337-1",
        "B409",
        "B410")

    private val imageLimbahs = intArrayOf(
        R.drawable.asset_pelumas_bekas,
        R.drawable.asset_aki_bekas,
        R.drawable.asset_lampu_tl_bekas,
        R.drawable.asset_sludge_ipal,
        R.drawable.asset_glasswool_bekas,
        R.drawable.asset_b3_kadaluarsa,
        R.drawable.asset_kemasan_bekas_b3,
        R.drawable.asset_majun_bekas,
        R.drawable.asset_limbah_klinis,
        R.drawable.asset_fly_ash,
        R.drawable.asset_bottom_ash)

    val listData: ArrayList<Limbah>
    get() {
        val list = arrayListOf<Limbah>()
        for (position in namaLimbahs.indices) {
            val limbah = Limbah()
            limbah.name = namaLimbahs[position]
            limbah.detail = detailLimbahs[position]
            limbah.photo = imageLimbahs[position]
            limbah.advancedManagement = advancedManagements[position]
            limbah.hazardCode = hazardCodes[position]
            list.add(limbah)
        }
        return list

    }

}