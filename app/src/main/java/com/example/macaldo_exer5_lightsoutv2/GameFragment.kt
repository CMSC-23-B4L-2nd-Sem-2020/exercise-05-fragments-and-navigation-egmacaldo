package com.example.macaldo_exer5_lightsoutv2

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.example.macaldo_exer5_lightsoutv2.databinding.FragmentGameBinding

/**
 * A simple [Fragment] subclass.
 */
class GameFragment : Fragment() {
    private lateinit var idList : List<Int>
    private lateinit var binding: FragmentGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater,
            R.layout.fragment_game, container, false
        )

        // store the created list and the hash map for the indices of the boxes
        idList = createIdList()


        // set the click listeners for the boxes
        setListeners()

        return binding.root
    }
    // store the created list and the hash map for the indices of the boxes

    // function to create a list of the ids of the boxes then returns it
    private fun createIdList() :List<Int>{
        return listOf(
            R.id.box_1,
            R.id.box_2,
            R.id.box_3,
            R.id.box_4,
            R.id.box_5,
            R.id.box_6,
            R.id.box_7,
            R.id.box_8,
            R.id.box_9,
            R.id.box_10,
            R.id.box_11,
            R.id.box_12,
            R.id.box_13,
            R.id.box_14,
            R.id.box_15,
            R.id.box_16,
            R.id.box_17,
            R.id.box_18,
            R.id.box_19,
            R.id.box_20,
            R.id.box_21,
            R.id.box_22,
            R.id.box_23,
            R.id.box_24,
            R.id.box_25
        )
    }

    // function that returns the id with the specific index
    private fun getId(int: Int) : Int = idList[int]

    // function to set the listeners for the boxes
    private fun setListeners() {
        for(index in (0..24)){
            binding.root.findViewById<TextView>(getId(index)).setOnClickListener {
                changeColor(it)
            }
        }
    }

    // function that changes the color of the box
    private fun flipColor(view: View){
        // obtain the bg color then flip its bg color
        val color:Int = (view.background as ColorDrawable).color
        if(color == Color.DKGRAY) view.setBackgroundColor(Color.rgb(255,211,0))
        else view.setBackgroundColor(Color.DKGRAY)
    }

    // function to change the color of the boxes
    private fun changeColor(view: View) {
        // get the layout parameters of the clicked box
        val params = view.layoutParams as ConstraintLayout.LayoutParams

        // check if the id in the constraint of the clicked box is in the list of id's then change its color
        if(params.startToEnd in idList){
            flipColor(binding.root.findViewById<TextView>(params.startToEnd))
        }

        if(params.endToStart in idList){
            flipColor(binding.root.findViewById<TextView>(params.endToStart))
        }
        if(params.topToBottom in idList){
            flipColor(binding.root.findViewById<TextView>(params.topToBottom))
        }
        if(params.bottomToTop in idList){
            flipColor(binding.root.findViewById<TextView>(params.bottomToTop))
        }

        // change the color of the clicked box
        flipColor(view)
    }
}





