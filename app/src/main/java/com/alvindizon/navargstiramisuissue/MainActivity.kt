package com.alvindizon.navargstiramisuissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.alvindizon.navargstiramisuissue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigation()
    }

    private fun setupNavigation() {
        // Since we're using FragmentContainerView,
        // use findFragmentById instead of findNavController(R.id.nav_host_fragment_txn)
        // See https://stackoverflow.com/a/59275182/4612653
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_txn) as NavHostFragment? ?: return

        navController = host.navController
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean = navController.navigateUp()
}
