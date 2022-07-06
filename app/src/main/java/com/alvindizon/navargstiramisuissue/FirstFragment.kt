package com.alvindizon.navargstiramisuissue

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.alvindizon.navargstiramisuissue.databinding.FragmentFirstBinding
import kotlin.random.Random.Default.nextLong

class FirstFragment: Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        FragmentFirstBinding.bind(view).apply {
            firstScreenLabel.setOnClickListener {
                findNavController().navigate(
                    FirstFragmentDirections.navigateToSecondScreen(
                        nextLong().toString(),
                        SerializableParams(title = "Hello world", someRandomLong = nextLong())
                    )
                )
            }
        }
    }
}
