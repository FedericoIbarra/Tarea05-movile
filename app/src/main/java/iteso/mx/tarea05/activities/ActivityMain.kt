package iteso.mx.tarea05.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import iteso.mx.tarea05.R
import iteso.mx.tarea05.fragments.FragmentHome
import iteso.mx.tarea05.fragments.FragmentRecipies
import iteso.mx.tarea05.fragments.FragmentTutorial1
import iteso.mx.tarea05.presenters.HomePresenter
import org.jetbrains.anko.find
import java.nio.file.Files.find

class ActivityMain : AppCompatActivity() {

    lateinit var menu: BottomNavigationView
    val presenter = HomePresenter()

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

        menu = findViewById(R.id.bmn)
        menu.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        menu.setSelectedItemId(R.id.home)


    }



    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.home -> {
                Log.d("home", "Home")

                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_main, FragmentHome())
                    .commit()
            }

            R.id.profile -> {
                Log.d("home", "profile")
            }
            R.id.recipies -> {
                Log.d("home", "recipies")

                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_main, FragmentRecipies())
                    .commit()
            }
        }
        false
    }

    fun refreshFun (view: View) {
        presenter.fetchInfo()
    }


}
