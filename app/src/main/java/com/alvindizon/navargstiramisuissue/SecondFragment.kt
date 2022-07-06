package com.alvindizon.navargstiramisuissue

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.alvindizon.navargstiramisuissue.databinding.FragmentSecondBinding

class SecondFragment: Fragment(R.layout.fragment_second) {

    private val args by navArgs<SecondFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentSecondBinding.bind(view).apply {
            argsLabel.text = args.someArg
            val serializableText =
                String.format(
                    "from serializable: %s %d",
                    args.someSerializable.title,
                    args.someSerializable.someRandomLong
                )
            serializableLabel.text = serializableText
        }
    }
}
