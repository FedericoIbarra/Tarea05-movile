package iteso.mx.tarea05.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import iteso.mx.tarea05.R
import iteso.mx.tarea05.fragments.FragmentTutorial1
import iteso.mx.tarea05.fragments.FragmentTutorial2
import iteso.mx.tarea05.fragments.FragmentTutorial3
import org.jetbrains.anko.startActivity

class ActivityTutorial : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        /* TODO Create three fragments for the tutorial and place them in activity_tutorial_fl_content
        *   First Fragment has a background image and a next button
        *   Second Fragment has a background image a next and previous button
        *   Third Fragment has a background image a finish and a previous button
        *  */

        this.firstFrg(null)
    }


    fun nextFrg(view: View?) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.activity_tutorial_fl_content, FragmentTutorial2())
            .commit()
    }

    fun lastFrg(view: View?) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.activity_tutorial_fl_content, FragmentTutorial3())
            .commit()
    }

    fun firstFrg(view: View?) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.activity_tutorial_fl_content, FragmentTutorial1())
            .commit()
    }

    fun startAct(view: View?) {
        startActivity<ActivityMain>()
    }
}
