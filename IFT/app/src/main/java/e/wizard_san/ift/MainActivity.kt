package e.wizard_san.ift

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btnlogina) as Button

        btn1.setOnClickListener{
            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.btnloginc) as Button

        btn2.setOnClickListener{
            val intent2 = Intent(this@MainActivity,LoginActivity2::class.java)
            startActivity(intent2)
        }
    }
}
