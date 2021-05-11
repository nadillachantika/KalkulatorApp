package com.nadillla.week2.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nadillla.week2.Model.Objek
import com.nadillla.week2.R


class AdapterListWisata(
    private val context: Context,
    private val data: ArrayList<Objek>?,
    private val itemClick: OnClickListener
): RecyclerView.Adapter<AdapterListWisata.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data?.size ?:0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data?.get(position)
        holder.imgobjek.setImageResource(item?.img ?: 0)
        holder.objek.text=item?.objek

        holder.view.setOnClickListener {
            itemClick.detail(item)
        }



    }


    inner class ViewHolder(val view: View): RecyclerView.ViewHolder(view){
        var objek = view.findViewById<TextView>(R.id.txtObjek)
        var imgobjek = view.findViewById<ImageView>(R.id.img)

    }

    interface OnClickListener{
        fun detail(item: Objek?)
    }
}