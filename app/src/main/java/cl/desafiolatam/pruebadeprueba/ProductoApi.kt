package cl.desafiolatam.pruebadeprueba

import retrofit2.Call
import retrofit2.http.GET

interface ProductoApi {

    @GET("products")
    fun getProductos(): Call<List<Producto>>
}