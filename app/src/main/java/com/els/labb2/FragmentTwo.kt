package com.els.labb2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


/** removed unwanted code */
class FragmentTwo : Fragment() {
    private lateinit var btnNavigateFragmentTwo: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_two, container, false)
        btnNavigateFragmentTwo = view.findViewById(R.id.btnNavigateFragmentTwo)

        /** use setOnClickListener to get button to navigate*/
        btnNavigateFragmentTwo.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentTwo_to_fragmentOne)
        }
        return view
    }


}