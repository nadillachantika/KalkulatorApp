package com.nadillla.week2

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import com.nadillla.week2.Adapter.AdapterListWisata
import com.nadillla.week2.Model.Objek
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        val listObjekWisata = ArrayList<Objek>()
        listObjekWisata.add(Objek("Jam Gadang",R.drawable.jamgadang))
        listObjekWisata.add(Objek("Panorama Baru",R.drawable.panoramabaru))
        listObjekWisata.add(Objek("Ngarai Sianok",R.drawable.ngaraisianok))
        listObjekWisata.add(Objek("Lobang Jepang",R.drawable.lobangjepang))
        listObjekWisata.add(Objek("Jembatan Limpapeh",R.drawable.jembatanlimpapeh))


        recyclerView.adapter=AdapterListWisata(this,listObjekWisata,object :AdapterListWisata.OnClickListener{
            override fun detail(item: Objek?){
                Dialog(this@ListActivity).apply {
                    requestWindowFeature(Window.FEATURE_NO_TITLE)
                    setCancelable(true)
                    setContentView(R.layout.detail_item)

                    val image = this.findViewById<ImageView>(R.id.detailImage)
                    val nama = this.findViewById<TextView>(R.id.detailNama)
                    val close = this.findViewById<Button>(R.id.btnClose)

                    image.setImageResource(item?.img ?: 0)
                    nama.text =  "${item?.objek}"

                    close.setOnClickListener {
                        this.dismiss()
                    }
                }.show()

            }
        })

    }
}