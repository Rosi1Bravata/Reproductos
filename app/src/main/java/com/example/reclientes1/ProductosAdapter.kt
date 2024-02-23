package com.example.reclientes1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductosAdapter(var context: Context,
    var Listaproductos:MutableList<dtproductos>) :
    RecyclerView.Adapter<ProductosAdapter.vHolder>()

{
    inner class vHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    lateinit var txtid: TextView
    init {
        txtid=itemView.findViewById(R.id.txtID)
    }

        lateinit var txtDescripcion: TextView
        init {
            txtDescripcion=itemView.findViewById(R.id.txtDescripcion)
        }

        lateinit var txtPreciomenudeo: TextView
        init {
            txtPreciomenudeo=itemView.findViewById(R.id.txtPreciomenudeo)
        }
        lateinit var txtPreciomayoreo: TextView
        init {
            txtPreciomayoreo=itemView.findViewById(R.id.txtPreciomayoreo)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductosAdapter.vHolder {
        var itemView = LayoutInflater.from(context).inflate(
            R.layout.vistaclientes,parent,false)

        return vHolder(itemView)


    }

    override fun getItemCount(): Int {
        return Listaproductos.size


    }

    override fun onBindViewHolder(holder: ProductosAdapter.vHolder, position: Int) {
        var productos =Listaproductos[position]
        holder.txtid.text=productos.ID
        holder.txtDescripcion.text=productos.Descripcion
        holder.txtPreciomenudeo.text=productos.PrecioMenudeo
        holder.txtPreciomayoreo.text=productos.PrecioMayoreo

    }

}