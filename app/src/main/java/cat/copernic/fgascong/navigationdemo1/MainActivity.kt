package cat.copernic.fgascong.navigationdemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        val bundle = Bundle()
        with(bundle){
            putString("nom_client", "Joan Martinez Perez")
        }
        button.setOnClickListener {
            val intent = Intent(applicationContext, SecondActivity::class.java).apply{
                        putExtra("nom_client", "Joan Martinez Perez")
            }
            startActivity(intent, bundle)
        }
    }

}