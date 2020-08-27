package com.ideta.laptimer

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

class MainActivity() : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dateAndtime: LocalDateTime = LocalDateTime.now()
        val onlyDate: LocalDate = LocalDate.now()
        //val strt: Array<Date?> = arrayOfNulls(15)
        //val stop: Array<Date?> = arrayOfNulls(15)
        var s00 :Long = 0
        var s01 = Date()
        var s02 = Date()
        var s03 = Date()
        var s04 = Date()
        var s05 = Date()
        var s06 = Date()
        var s07 = Date()
        var s08 = Date()
        var s09 = Date()
        var s10 = Date()
        var s11 = Date()
        var s12 = Date()
        var s13 = Date()
        var s14 = Date()
        var s15 = Date()

        var e01 = Date()
        var e02 = Date()
        var e03 = Date()
        var e04 = Date()
        var e05 = Date()
        var e06 = Date()
        var e07 = Date()
        var e08 = Date()
        var e09 = Date()
        var e10 = Date()
        var e11 = Date()
        var e12 = Date()
        var e13 = Date()
        var e14 = Date()
        var e15 = Date()
        var tmp:Long = 0
        //val elapstime: Array<String?> = arrayOfNulls(15)
        val startbtn01: Button = findViewById(R.id.startbtn01)
        val stopbtn01: Button = findViewById(R.id.stopbtn01)
        val startbtn02: Button = findViewById(R.id.startbtn02)
        val stopbtn02: Button = findViewById(R.id.stopbtn02)
        val startbtn03: Button = findViewById(R.id.startbtn03)
        val stopbtn03: Button = findViewById(R.id.stopbtn03)
        val startbtn04: Button = findViewById(R.id.startbtn04)
        val stopbtn04: Button = findViewById(R.id.stopbtn04)
        val startbtn05: Button = findViewById(R.id.startbtn05)
        val stopbtn05: Button = findViewById(R.id.stopbtn05)
        val startbtn06: Button = findViewById(R.id.startbtn06)
        val stopbtn06: Button = findViewById(R.id.stopbtn06)
        val startbtn07: Button = findViewById(R.id.startbtn07)
        val stopbtn07: Button = findViewById(R.id.stopbtn07)
        val startbtn08: Button = findViewById(R.id.startbtn08)
        val stopbtn08: Button = findViewById(R.id.stopbtn08)
        val startbtn09: Button = findViewById(R.id.startbtn09)
        val stopbtn09: Button = findViewById(R.id.stopbtn09)
        val startbtn10: Button = findViewById(R.id.startbtn10)
        val stopbtn10: Button = findViewById(R.id.stopbtn10)
        val startbtn11: Button = findViewById(R.id.startbtn11)
        val stopbtn11: Button = findViewById(R.id.stopbtn11)
        val startbtn12: Button = findViewById(R.id.startbtn12)
        val stopbtn12: Button = findViewById(R.id.stopbtn12)
        val startbtn13: Button = findViewById(R.id.startbtn13)
        val stopbtn13: Button = findViewById(R.id.stopbtn13)
        val startbtn14: Button = findViewById(R.id.startbtn14)
        val stopbtn14: Button = findViewById(R.id.stopbtn14)
        val startbtn15: Button = findViewById(R.id.startbtn15)
        val stopbtn15: Button = findViewById(R.id.stopbtn15)

        //val stoptime =  LocalDateTime.now()
        //val elapstime =  LocalDateTime.now()
        var sdf = SimpleDateFormat("kk:mm:ss", Locale.getDefault())
        var sdf2 = SimpleDateFormat("mm:ss")
        var lap = SimpleDateFormat("s")
      //  val calendar1: Calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN).also { it.clear() }
      //  startbtn01.setOnClickListener(this)
      //  stopbtn01.setOnClickListener(this)
        clear.setOnClickListener{
            starttime01.text = "開始"
            starttime02.text = "開始"
            starttime03.text = "開始"
            starttime04.text = "開始"
            starttime05.text = "開始"
            starttime06.text = "開始"
            starttime07.text = "開始"
            starttime08.text = "開始"
            starttime09.text = "開始"
            starttime10.text = "開始"
            starttime11.text = "開始"
            starttime12.text = "開始"
            starttime13.text = "開始"
            starttime14.text = "開始"
            starttime15.text = "開始"
            endtime01.text = "終了"
            endtime02.text = "終了"
            endtime03.text = "終了"
            endtime04.text = "終了"
            endtime05.text = "終了"
            endtime06.text = "終了"
            endtime07.text = "終了"
            endtime08.text = "終了"
            endtime09.text = "終了"
            endtime10.text = "終了"
            endtime11.text = "終了"
            endtime12.text = "終了"
            endtime13.text = "終了"
            endtime14.text = "終了"
            endtime15.text = "終了"
            elapstime01.text = ""
            elapstime02.text = ""
            elapstime03.text = ""
            elapstime04.text = ""
            elapstime05.text = ""
            elapstime06.text = ""
            elapstime07.text = ""
            elapstime08.text = ""
            elapstime09.text = ""
            elapstime10.text = ""
            elapstime11.text = ""
            elapstime12.text = ""
            elapstime13.text = ""
            elapstime14.text = ""
            elapstime15.text = ""
        }


        startbtn01.setOnClickListener{
            s01 = Date() // 現在時刻
            //s01 = System.currentTimeMillis()
            //var sdf = SimpleDateFormat("kk:mm:ssZ", Locale.getDefault())
            //val calendar1: Calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN).also { it.clear() }
        //    calendar1.set(System.currentTimeMillis())
            //sdf.setTimeZone(TimeZone.getDefault());
            starttime01.text = sdf.format(s01)
            endtime01.text = "終了"
            elapstime01.text = "計測中"
        }
        stopbtn01.setOnClickListener {
            e01 = Date() // 現在時刻
            val tzn = TimeZone.getTimeZone("Asia/Tokyo") //[1]

            //e01 = System.currentTimeMillis()
            //var sdf = SimpleDateFormat("kk:mm:ssZ", Locale.getDefault())
            sdf2.setTimeZone(tzn);
            endtime01.text = sdf.format(e01)
       //     val calendar2: Calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN).also { it.clear() }
       //     calendar2.set(System.currentTimeMillis())
       //     val diff1: Int = ((calendar2.timeInMillis - calendar1.timeInMillis) / 1000).toInt()
        //    if(starttime02.text=="開始"){ s02 = s01 }
            tmp = e01.time - s01.time
            elapstime01.text = sdf2.format(tmp)
        }
        startbtn02.setOnClickListener{
            s02 = Date() // 現在時刻
            starttime02.text = sdf.format(s02)
            endtime02.text = "終了"
            elapstime02.text = "計測中"
        }
        stopbtn02.setOnClickListener {
            e02 = Date() // 現在時刻
            endtime02.text = sdf.format(e02)
            if(starttime02.text=="開始"){ s02 = s01 }
            tmp = e02.time - s02.time
            elapstime02.text = sdf2.format(tmp)
        }
        startbtn03.setOnClickListener{
            s03 = Date() // 現在時刻
            starttime03.text = sdf.format(s03)
            endtime03.text = "終了"
            elapstime03.text = "計測中"
        }
        stopbtn03.setOnClickListener {
            e03 = Date() // 現在時刻
            endtime03.text = sdf.format(e03)
            if(starttime03.text=="開始"){ s03 = s01 }
            tmp = e03.time - s03.time
            elapstime03.text = sdf2.format(tmp)
        }
        startbtn04.setOnClickListener{
            s04 = Date() // 現在時刻
            starttime04.text = sdf.format(s04)
            endtime04.text = "終了"
            elapstime04.text = "計測中"
        }
        stopbtn04.setOnClickListener {
            e04 = Date() // 現在時刻
            endtime04.text = sdf.format(e04)
            if(starttime04.text=="開始"){ s04 = s01 }
            tmp = e04.time - s04.time
            elapstime04.text = sdf2.format(tmp)
        }
        startbtn05.setOnClickListener{
            s05 = Date() // 現在時刻
            starttime05.text = sdf.format(s05)
            endtime05.text = "終了"
            elapstime05.text = "計測中"
        }
        stopbtn05.setOnClickListener {
            e05 = Date() // 現在時刻
           endtime05.text = sdf.format(e05)
            if(starttime05.text=="開始"){ s05 = s01 }
            tmp = e05.time - s05.time
            elapstime05.text = sdf2.format(tmp)
        }
        startbtn06.setOnClickListener{
            s06 = Date() // 現在時刻
            starttime06.text = sdf.format(s06)
            endtime06.text = "終了"
            elapstime06.text = "計測中"
        }
        stopbtn06.setOnClickListener {
            e06 = Date() // 現在時刻
            endtime06.text = sdf.format(e06)
            if(starttime06.text=="開始"){ s06 = s01 }
            tmp = e06.time - s06.time
            elapstime06.text = sdf2.format(tmp)
        }
        startbtn07.setOnClickListener{
            s07 = Date() // 現在時刻
            starttime07.text = sdf.format(s07)
            endtime07.text = "終了"
            elapstime07.text = "計測中"
        }
        stopbtn07.setOnClickListener {
            e07 = Date() // 現在時刻
            endtime07.text = sdf.format(e07)
            if(starttime07.text=="開始"){ s07 = s01 }
            tmp = e07.time - s07.time
            elapstime07.text = sdf2.format(tmp)
        }
        startbtn08.setOnClickListener{
            s08 = Date() // 現在時刻
            starttime08.text = sdf.format(s08)
            endtime08.text = "終了"
            elapstime08.text = "計測中"
        }
        stopbtn08.setOnClickListener {
            e08 = Date() // 現在時刻
            endtime08.text = sdf.format(e08)
            if(starttime08.text=="開始"){ s08 = s01 }
            tmp = e08.time - s08.time
            elapstime08.text = sdf2.format(tmp)
        }
        startbtn09.setOnClickListener{
            s09 = Date() // 現在時刻
            starttime09.text = sdf.format(s09)
            endtime09.text = "終了"
            elapstime09.text = "計測中"
        }
        stopbtn09.setOnClickListener {
            e09 = Date() // 現在時刻
            endtime09.text = sdf.format(e09)
            if(starttime09.text=="開始"){ s09 = s01 }
            tmp = e09.time - s09.time
            elapstime09.text = sdf2.format(tmp)
        }
        startbtn10.setOnClickListener{
            s10 = Date() // 現在時刻
            starttime10.text = sdf.format(s10)
            endtime10.text = "終了"
            elapstime10.text = "計測中"
        }
        stopbtn10.setOnClickListener {
            e10 = Date() // 現在時刻
            endtime10.text = sdf.format(e10)
            if(starttime10.text=="開始"){ s10 = s01 }
            tmp = e10.time - s10.time
            elapstime10.text = sdf2.format(tmp)
        }
        startbtn11.setOnClickListener{
            s11 = Date() // 現在時刻
            starttime11.text = sdf.format(s11)
            endtime11.text = "終了"
            elapstime11.text = "計測中"
        }
        stopbtn11.setOnClickListener {
            e11 = Date() // 現在時刻
            endtime11.text = sdf.format(e11)
            if(starttime11.text=="開始"){ s11 = s01 }
            tmp = e11.time - s11.time
            elapstime11.text = sdf2.format(tmp)
        }
        startbtn12.setOnClickListener{
            s12 = Date() // 現在時刻
            starttime12.text = sdf.format(s12)
            endtime12.text = "終了"
            elapstime12.text = "計測中"
        }
        stopbtn12.setOnClickListener {
            e12 = Date() // 現在時刻
            endtime12.text = sdf.format(e12)
            if(starttime12.text=="開始"){ s12 = s01 }
            tmp = e12.time - s12.time
            elapstime12.text = sdf2.format(tmp)
        }
        startbtn13.setOnClickListener{
            s13 = Date() // 現在時刻
            starttime13.text = sdf.format(s13)
            endtime13.text = "終了"
            elapstime13.text = "計測中"
        }
        stopbtn13.setOnClickListener {
            e13 = Date() // 現在時刻
            endtime13.text = sdf.format(e13)
            if(starttime13.text=="開始"){ s13 = s01 }
            tmp = e13.time - s13.time
            elapstime13.text = sdf.format(tmp)
        }
        startbtn14.setOnClickListener{
            s14 = Date() // 現在時刻
            starttime14.text = sdf.format(s14)
            endtime14.text = "終了"
            elapstime14.text = "計測中"
        }
        stopbtn14.setOnClickListener {
            e14 = Date() // 現在時刻
            endtime14.text = sdf.format(e14)
            if(starttime14.text=="開始"){ s14 = s01 }
            tmp = e14.time - s14.time
            elapstime14.text = sdf2.format(tmp)
        }
        startbtn15.setOnClickListener{
            s15 = Date() // 現在時刻
            starttime15.text = sdf.format(s15)
            endtime15.text = "終了"
            elapstime15.text = "計測中"
        }
        stopbtn15.setOnClickListener {
            e15 = Date() // 現在時刻
            endtime15.text = sdf.format(e15)
            if(starttime15.text=="開始"){ s15 = s01 }
            tmp = e15.time - s15.time
            elapstime15.text = sdf2.format(tmp)
        }

    }

    fun String.toDate(pattern: String = "HH:mm:ss"): Date? {
        val sdFormat = try {
            SimpleDateFormat(pattern)
        } catch (e: IllegalArgumentException) {
            null
        }
        val date = sdFormat?.let {
            try {
                it.parse(this)
            } catch (e: ParseException){
                null
            }
        }
        return date
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}