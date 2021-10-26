package cat.copernic.fgascong.navigationdemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val bundle: Bundle? = intent.extras
        Toast.makeText(this, bundle?.getString("nom_client", ), Toast.LENGTH_SHORT).show()

        val button:Button = findViewById(R.id.button3)
        button.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}