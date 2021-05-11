package com.nadillla.week2

import android.graphics.Interpolator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.media.MediaBrowserService
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kalkulator.*
//import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder
import org.w3c.dom.Text

class KalkulatorActivity : AppCompatActivity(),View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)


        btnBagi.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);

    }

    override fun onClick(v: View) {

        val FirstNumber: String = editBil1.text.toString().trim()
        val SecondNumber: String = editBil2.text.toString().trim()


        if(FirstNumber.isEmpty()||SecondNumber.isEmpty()){
            Toast.makeText(this,"Silahkan Masukkan Bilangan 1 dan 2", Toast.LENGTH_LONG).show()
        }else{
            if (v.id == R.id.btnTambah) {
                val tambah: Double = FirstNumber.toDouble() + SecondNumber.toDouble()
                textHasilAkhir.text = tambah.toString()
                textHasil.setText("Hasil Tambah : ")
            }
            if(v.id==R.id.btnKali){

                val kali: Double = FirstNumber.toDouble() * SecondNumber.toDouble()
                textHasilAkhir.text= kali.toString()
                textHasil.setText("Hasil Kali : ")

            }
            if(v.id==R.id.btnBagi){
                val bagi: Double = FirstNumber.toDouble() / SecondNumber.toDouble()
                textHasilAkhir.text= bagi.toString()
                textHasil.setText("Hasil Bagi : ")
            }
            if(v.id==R.id.btnKurang){
                val kurang: Double = FirstNumber.toDouble() - SecondNumber.toDouble()
                textHasilAkhir.text= kurang.toString()
                textHasil.setText("Hasil Kurang : ")
            }

        }



    }


}
