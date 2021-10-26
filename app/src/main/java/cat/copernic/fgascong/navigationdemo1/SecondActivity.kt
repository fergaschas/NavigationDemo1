package cat.copernic.fgascong.navigationdemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle = intent.extras
        Toast.makeText(this, bundle?.getString("nom_client"), Toast.LENGTH_LONG).show()
        val button:Button = findViewById(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(applicationContext, ThirdActivity::class.java).apply {
                putExtra("nom_client", "Joan Martinez Perez")
            }
            startActivity(intent)
        }

    }
}