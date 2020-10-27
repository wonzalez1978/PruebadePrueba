package cl.desafiolatam.pruebadeprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadApi()
    }

    private fun loadApi(){
        val service = RetrofitClient.retrofitInstance()
        val call = service.getProductos()
        call.enqueue(object : Callback<List<Producto>>{
            override fun onResponse(
                call: Call<List<Producto>>,
                response: Response<List<Producto>>
            ) {
                Log.d("Main", "${response.body()!!}")

            }

            override fun onFailure(call: Call<List<Producto>>, t: Throwable) {
                Log.d("Main", "$t")
            }

        })
    }
}