package com.arpak.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.arpak.navigationcomponent.databinding.FragmentAnaEkranBinding


class AnaEkranFragment : Fragment() {

    private lateinit var tasarim: FragmentAnaEkranBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentAnaEkranBinding.inflate(inflater,container,false)

        val view = tasarim.root

        tasarim.buttonBasla.setOnClickListener {

            val kisi = Kisiler(1,"ARPAK")
            val gecis = AnaEkranFragmentDirections.oyunEkraniGecis(kisi)

            Navigation.findNavController(it).navigate(gecis)

        }

        return view

    }


}