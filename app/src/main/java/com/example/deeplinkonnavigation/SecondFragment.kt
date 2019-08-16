package com.example.deeplinkonnavigation


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs


class SecondFragment : Fragment() {
    private lateinit var rootView: ViewGroup

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_second, container, false) as ViewGroup
        val id = arguments?.getInt("direction")
        if(id == 2){
            Log.d("Second Fragment",id.toString())
        }
        return rootView
    }

    private fun initPageData(bundle: Bundle?) {
        bundle?.let {

        }
    }
}
