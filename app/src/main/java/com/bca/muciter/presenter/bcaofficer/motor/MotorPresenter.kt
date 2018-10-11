package com.bca.muciter.presenter.bcaofficer.motor

import android.text.TextUtils
import com.bca.muciter.model.Motor

class MotorPresenter(private val view: MotorContract.View) : MotorContract.Presenter {
    override fun loadData(brand: String){
        val motors = mutableListOf<Motor>()

        //TODO("Remove dummy data (get data from API db)")
        val motor1 = Motor(1,"", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//90/MTA-2208752/yamaha_yamaha-lexi-125-vva-sepeda-motor_full05.jpg", "Yamaha Lexi 125 VVA", 17998000.00,"Motor Matic" +
                "\nMesin generasi baru Blue Core 125cc" +
                "\nDilengkapi dengan Liquid Cooled sehingga Lebih efisien, bertenaga dan Handal" +
                "\nTeknologi VVA menjaga tenaga dan torsi maksimum di setiap putaran mesin" +
                "\nLampu depan menggunakan sistem pencahayaan LED sehingga lebih terang serta didesain dengan ukuran besar memberikan kesan mewah dan elegan","Yamaha","Liquid Cooled 4-stroke, SOHC, VVA, SMG","124.7 cc","4.2 L","V-belt automatic" )
        motors.add(motor1)
        val motor2 = Motor(2,"", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//83/MTA-2271116/honda_honda-all-new-beat-esp-fi-sporty-cbs-iss-sepeda-motor--vin-2018--otr-jabodetabek-_full12.jpg", "Honda All New BeAT eSP FI Sporty CBS ISS", 16215000.00,"Sepeda motor " +
                "\nDidesain sporty dan trendy" +
                "\nMenggunakan teknologi eSP (Enhanced Smart Power" +
                "\nRamah lingkungan dan hemat bahan bakar" +
                "\nDilengkapi dengan teknologi injeksi Honda PGM-FI, dan sistem braking Tromol yang membuat mesin menjadi lebih halus, aman, dan nyaman untuk aktivitas Anda sehari-hari.","Honda","4-Langkah, SOCH dengan Pendingin Udara, eSP, ISS","108,2 cc","3,7 Liter","Otomatis, V-Matik" )
        motors.add(motor2)
        val motor3 = Motor(3,"", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//935/yamaha_yamaha-aerox-155-vva-sepeda-motor---yellow_full02.jpg", "Yamaha Aerox 155 VVA", 22899000.00,"Sepeda motor yang mempunyai mesin 155 cc generasi baru yang dilengkapi dengan \"Variable Valve Actuation\" (VVA) untuk membuat performa tarikan mesin lebih bertenaga" +
                "\nDilengkapi dengan \"Forged Piston & DiAsil Cylinder\" yang kuat dan ringan sehingga performa mesin lebih maksimal, serta dilengkapi pula dengan \"Smart Motor Generator\" (SMG) yang membuat suara motor lebih halus saat dinyalakan" +
                "\nTeknologi VVA menjaga tenaga dan torsi maksimum di setiap putaran mesin, lampu depan LED dengan desain sporty, lebih terang dan lebih awet, lampu belakang LED dengan desain sporty, lebih terang dan lebih awet" +
                "\nUkuran ban depan 110/80-14 Inch dan ukuran ban belakang 140/70-14 Inch, menjadikan tampilan lebih sporty serta memberikan pengalaman berkendara yang lebih stabil saat bermanuver" +
                "\nSemakin praktis dengan \"Electric Power Socket\" untuk mengisi daya gadget pengendara","Yamaha","Liquid cooled 4-stroke, SOHC","155.1 cc","4.6 L","Automatic" )
        motors.add(motor3)
        val motor4 = Motor(4,"", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//79/MTA-2271121/honda_honda-all-new-vario-125-esp-cbs-sepeda-motor--vin-2018-otr-jabodetabek-_full12.jpg", "Honda All New Vario 125 eSP CBS", 18835000.00,"Generasi terbaru mesin matic honda\n" +
                "Lebih efisien irit bahan bakar dan ramah lingkungan\n" +
                "Dilengkapi dengan teknologi CBS (Combi Brake System)\n" +
                "Dengan menarik tuas rem kiri maka rem belakang dan depan dapat berfungsi dengan optimal","Honda","4 langkah, SOHC dengan pendinginan cairan, ISS, ACG","124,8 cc","5.5 L","Otomatis, V-Matik" )
        motors.add(motor4)
        val motor5 = Motor(5,"", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//87/MTA-1940206/honda_honda-all-new-scoopy-esp-stylish-sepeda-motor--vin-2018-otr-jabodetabek-_full05.jpg", "Honda All New Scoopy eSP Stylish", 19100000.00,"Motor matic Honda\n" +
                "Desain retro dengan nuansa klasik serta dikemas dalam sentuhan modern masa kini\n" +
                "Dilengkapi dengan teknologi eSP (Enhanced Smart Power) sehingga membuat motor semakin ramah lingkungan dan hemat bahan bakar\n" +
                "Fitur ACG Starter yang dapat menghidupkan mesin tanpa suara keras atau kasar\n" +
                "Honda Scoopy siap menjadi pilihan utama bagi Anda yang membutuhkan motor skutik yang fashionable dan nyaman dikendarai","Honda","4-Langkah, SOCH dengan Pendingin Udara, eSP","108.2 cm3","3.7 L","Otomatis, V-Matik" )
        motors.add(motor5)
        val motor6 = Motor(0,"", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//90/MTA-2208752/yamaha_yamaha-lexi-125-vva-sepeda-motor_full05.jpg", "Yamaha Lexi 125 VVA", 17998000.00,"Motor Matic\nMesin generasi baru Blue Core 125cc\nDilengkapi dengan Liquid Cooled sehingga Lebih efisien, bertenaga dan Handal\nTeknologi VVA menjaga tenaga dan torsi maksimum di setiap putaran mesin\nLampu depan menggunakan sistem pencahayaan LED sehingga lebih terang serta didesain dengan ukuran besar memberikan kesan mewah dan elegan","Yamaha","Liquid Cooled 4-stroke, SOHC, VVA, SMG","124.7 cc","4.2 L","V-belt automatic" )
        motors.add(motor6)
        val motor7 = Motor(0,"", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//90/MTA-2208752/yamaha_yamaha-lexi-125-vva-sepeda-motor_full05.jpg", "Yamaha Lexi 125 VVA", 17998000.00,"Motor Matic\nMesin generasi baru Blue Core 125cc\nDilengkapi dengan Liquid Cooled sehingga Lebih efisien, bertenaga dan Handal\nTeknologi VVA menjaga tenaga dan torsi maksimum di setiap putaran mesin\nLampu depan menggunakan sistem pencahayaan LED sehingga lebih terang serta didesain dengan ukuran besar memberikan kesan mewah dan elegan","Yamaha","Liquid Cooled 4-stroke, SOHC, VVA, SMG","124.7 cc","4.2 L","V-belt automatic" )
        motors.add(motor7)

        view.showSnackbar("Data Loaded!")
        view.loadData(motors)
    }

    override fun loadFilteredData(constraint: String, data: List<Motor>) {
        if(TextUtils.isEmpty(constraint)) {
            view.loadFilteredData(data)
        }else{
            val result = mutableListOf<Motor>()
            data.forEach{item ->
                if(item.motorName != null) {
                    if (item.motorName!!.toLowerCase().contains(constraint.toLowerCase())) {
                        result.add(item)
                    }
                }
            }
            view.loadFilteredData(result)
        }
    }
}