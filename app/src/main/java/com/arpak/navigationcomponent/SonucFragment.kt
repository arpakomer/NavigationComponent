package com.arpak.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.arpak.navigationcomponent.databinding.FragmentSonucBinding


class SonucFragment : Fragment() {

private lateinit var  tasarim: FragmentSonucBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentSonucBinding.inflate(inflater,container,false)
        val view = tasarim.root

        val bundle: SonucFragmentArgs by navArgs()

        val gelenLinkVeri = bundle.deepLinkVeri
        tasarim.textViewResult.text = gelenLinkVeri

        return view

    }


}