package com.zakia.idn.calculatorapps.BangunDatar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zakia.idn.calculatorapps.R
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*

/**
 * A simple [Fragment] subclass.
 */
class PersegiPanjangFragment : Fragment() {

    private lateinit var valueluas1: String
    private lateinit var valueluas2: String
    private lateinit var valuekeliling1: String
    private lateinit var valuekeliling2: String
    private var result: Double? = null
    private var fieldEmpty: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_persegi_panjang_luas.setOnClickListener {
            valueluas1 = et_perpa_luas_pnj.text.toString().trim()
            valueluas2 = et_perpa_luas_lbr.text.toString().trim()

            if (valueluas1.isEmpty()) {
                fieldEmpty = true
                et_perpa_luas_pnj.error = resources.getString(R.string.error_empty_field)
            }
            if (valueluas2.isEmpty()) {
                fieldEmpty = true
                et_perpa_luas_lbr.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (valueluas1.toDouble() * valueluas2.toDouble())
                tv_result_persegi_panjang_luas.text = result.toString()
            }
        }
        btn_persegi_panjang_keliling.setOnClickListener {
            valuekeliling1 = et_persegi_panjang_keliling.text.toString().trim()
            valuekeliling2 = et_persegi_panjang_lebar2.text.toString().trim()

            if (valuekeliling1.isEmpty()) {
                fieldEmpty = true
                et_persegi_panjang_keliling.error = resources.getString(R.string.error_empty_field)
            }
            if (valuekeliling2.isEmpty()) {
                fieldEmpty = true
                et_persegi_panjang_lebar2.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (valueluas1.toDouble() + valueluas2.toDouble()) * 2
                tv_result_persegi_pnjang_keliling.text = result.toString()
            }
        }
    }


}
