package com.example.reclientes1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listaproductos: MutableList<dtproductos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    listaproductos.add(
        dtproductos("123","Ropa americana","$124","$100"))

    listaproductos.add(
        dtproductos("124","Ropa suiza","$130","$120"))

        listaproductos.add(
            dtproductos("125","Ropa china","$135","$140"))

        listaproductos.add(
            dtproductos("126","Ropa coreana","$140","$150"))

        listaproductos.add(
            dtproductos("127","Ropa rusa","$145","$150"))

        listaproductos.add(
            dtproductos("128","Ropa griega","$150","$160"))

        listaproductos.add(
            dtproductos("129","Ropa alemana","$155","$170"))

        listaproductos.add(
            dtproductos("130","Ropa romana","$160","$180"))

        listaproductos.add(
            dtproductos("131","Ropa canadiensa","$165","$190"))

        listaproductos.add(
            dtproductos("132","Ropa alaska","$170","$175"))

        listaproductos.add(
            dtproductos("133","Ropa barata","$175","$180"))


        listaproductos.add(
            dtproductos("134","Ropa Gusshi","$180","$185"))

        listaproductos.add(
            dtproductos("135","Ropa costosa","$185","$190"))

        listaproductos.add(
            dtproductos("136","Ropa judia","$190","$200"))

        listaproductos.add(
            dtproductos("137","Ropa española","$195","$205"))

        listaproductos.add(
            dtproductos("138","Ropa italiana","$200","$210"))

        listaproductos.add(
            dtproductos("139","Ropa africana","$205","$215"))

        listaproductos.add(
            dtproductos("140","Ropa negra","$210","$220"))

        listaproductos.add(
            dtproductos("141","Ropa clara","$215","$230"))

        listaproductos.add(
            dtproductos("142","Ropa colores","$220","$250"))

       var tabla = findViewById<RecyclerView>(R.id.tablaProductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=ProductosAdapter(this,listaproductos)

    }
}