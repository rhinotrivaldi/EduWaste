package com.rhinotrivaldi.eduwaste.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rhinotrivaldi.eduwaste.R
import kotlinx.android.synthetic.main.fragment_peraturan.*

/**
 * A simple [Fragment] subclass.
 */
class PeraturanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_peraturan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvPeraturan.text = "COMING SOON"
    }

}
