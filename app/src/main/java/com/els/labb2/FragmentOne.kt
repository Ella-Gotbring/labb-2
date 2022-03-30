package com.els.labb2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


/** removed unwanted code,
 * created nav by creating a new resource directory
 * added two blank fragments
 *  added button in xml,
 *  created action in my_nav to and from the fragments so they're linked
 * in activity_main added navhostfragment
 *  */
class FragmentOne : Fragment() {

    private lateinit var btnNavigateFragmentOne: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_one, container, false)
        btnNavigateFragmentOne = view.findViewById(R.id.btnNavigateFragmentOne)
        /** use setOnClickListener to get button to navigate
         between fragmentOne -> fragmentTwo */
        btnNavigateFragmentOne.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }
    return view
    }


}