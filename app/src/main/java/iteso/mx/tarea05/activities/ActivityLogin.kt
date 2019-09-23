package iteso.mx.tarea05.activities

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import iteso.mx.tarea05.R

class ActivityLogin : AppCompatActivity() {
    /* TODO Declare EditText and Button variables */
    private lateinit var textEmail: EditText
    private lateinit var textPass: EditText
    private lateinit var textName: EditText
    private lateinit var btnButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /* TODO Authenticate User with Parse */
    }
}
