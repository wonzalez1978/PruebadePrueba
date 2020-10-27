package cl.desafiolatam.pruebadeprueba

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://my-json-server.typicode.com/Himuravidal/FakeAPIdata/"

class RetrofitClient {

    companion object {
        fun retrofitInstance(): ProductoApi {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ProductoApi::class.java)
        }
    }
}