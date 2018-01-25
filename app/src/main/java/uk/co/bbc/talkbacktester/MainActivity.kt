package uk.co.bbc.talkbacktester

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_content.*


class MainActivity : AppCompatActivity() {

    private val drawerToggle : ActionBarDrawerToggle by lazy {
        ActionBarDrawerToggle(this, drawer, R.string.drawer_open, R.string.drawer_close )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        navigation.setNavigationItemSelectedListener ({  menuItem: MenuItem ->
            when (menuItem.itemId) {
                R.id.item_list_view_example -> transitionTo("List View", ListViewExampleFragment())
                R.id.item_list_fragment_example -> transitionTo("List Fragment", ListFragmentExampleFragment())
                R.id.item_preference_fragment_example -> transitionTo("Preference Fragment", PreferenceFragmentExampleFragment())
                R.id.item_recycler_view_example -> transitionTo("Recycler View", RecyclerViewExampleFragment())
                else -> transitionTo("Error", ErrorFragment())
            }
        })

        drawerToggle.isDrawerIndicatorEnabled = true


    }

    private fun transitionTo(title: String, fragment: Fragment) : Boolean {
        supportActionBar?.setTitle(title)
        drawer.closeDrawer(GravityCompat.START)
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment )
                .commit()
        return true

    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        drawerToggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        drawerToggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean =
        if (drawerToggle.onOptionsItemSelected(item)) true
        else super.onOptionsItemSelected(item)

}

