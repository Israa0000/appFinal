package com.example.appfinal.ViewModel.sampledata

import com.example.appfinal.Model.Categoria
import com.example.appfinal.Model.Producto
import com.example.appfinal.R

object Categorias {
    private val productosLacteos = listOf(
        Producto(R.drawable.ic_launcher_background, "Leche", "$10", "$12"),
        Producto(R.drawable.ic_launcher_background, "Queso", "$50", "$60")
    )

    private val productosPanaderia = listOf(
        Producto(R.drawable.ic_launcher_background, "Pan Integral", "$20", "$25")
    )

    var categorias = listOf(
        Categoria(R.drawable.ic_launcher_background, "Lácteos", productosLacteos),
        Categoria(R.drawable.ic_launcher_background, "Panadería", productosPanaderia),
        Categoria(R.drawable.ic_launcher_background, "Otros", Productos.productos)
    )
}