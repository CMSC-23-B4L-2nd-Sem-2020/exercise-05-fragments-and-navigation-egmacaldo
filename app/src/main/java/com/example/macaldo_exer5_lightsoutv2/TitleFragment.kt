package com.example.macaldo_exer5_lightsoutv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.macaldo_exer5_lightsoutv2.databinding.FragmentTitleBinding


/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    // reference the data class
    private val values: Values = Values()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(
            inflater,
            R.layout.fragment_title, container, false
        )
        binding.values = values


        return binding.root
    }
}
