package iteso.mx.tarea05.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import iteso.mx.tarea05.R
import org.jetbrains.anko.find
import java.nio.file.Files.find

class ActivityMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* TODO Add BottomNavigationView with three options
        1.- List of recipes
        Use FragmentRecipes
        2.- Actual recipe
        Create FragmentRecipe
        Use MVP Pattern
        FragmentRecipe (View)
        Recipe (Model)
        PresenterRecipe (Presenter)
        Use ViewAnimator
            FIRST_VIEW
            Button with Refresh text
            SECOND_VIEW
            MaterialCard
            THIRD_VIEW
            Image with text
        3.- Profile
        Create FragmentProfile
         */

        var menu = find<View>(R.id.bmn)

    }

    fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
           /*
            R.id.home -> supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_main_fl_main_content, )
            */
        }

        return true
    }
}
