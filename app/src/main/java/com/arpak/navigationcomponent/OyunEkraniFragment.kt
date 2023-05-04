package com.arpak.navigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.arpak.navigationcomponent.databinding.FragmentAnaEkranBinding
import com.arpak.navigationcomponent.databinding.FragmentOyunEkraniBinding


class OyunEkraniFragment : Fragment() {

    private lateinit var tasarim: FragmentOyunEkraniBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentOyunEkraniBinding.inflate(inflater,container,false)
        val view = tasarim.root

        val bundle : OyunEkraniFragmentArgs  by navArgs()

        val gelenAd = bundle.name
        val gelenYas = bundle.age
        val gelenBoy = bundle.height
        val gelenMedeniHal = bundle.isSingle
        val gelenNumara = bundle.nesne



        Log.e("Gelen İsim:",gelenAd)
        Log.e("Gelen Yas: ",gelenYas.toString())
        Log.e("Gelen Boy:",gelenBoy.toString())
        Log.e("Gelen Medeni Hali:", gelenMedeniHal.toString())
        Log.e("Gelen Numara:", gelenNumara.toString())
        Log.e("Gelen Soyisim:", gelenNumara.toString())



        tasarim.buttonBitir.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.sonucEkranaGecis)

        }
        return view
    }


}