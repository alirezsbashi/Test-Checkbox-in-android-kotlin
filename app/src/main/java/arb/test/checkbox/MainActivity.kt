package arb.test.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_main_result.setOnClickListener {

            var name = ""

            if (chk_main_java.isChecked) name += "Java "

            if (chk_main_kotlin.isChecked) name += "Kotlin "

            if(name.equals("")) Toast.makeText(applicationContext,"No Specialization",Toast.LENGTH_SHORT).show()
            else Toast.makeText(applicationContext,"$name Programmer",Toast.LENGTH_SHORT).show()
        }
    }
}
