package com.zakia.idn.calculatorapps.BangunDatar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zakia.idn.calculatorapps.R
import kotlinx.android.synthetic.main.fragment_jajar_genjang.*

/**
 * A simple [Fragment] subclass.
 */
class JajarGenjangFragment : Fragment() {

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
        return inflater.inflate(R.layout.fragment_jajar_genjang, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_jage_luas.setOnClickListener {
            valueluas1 = et_jage_luas_alas.text.toString().trim()
            valueluas2 = et_jage_luas_tinggi.text.toString().trim()

            if (valueluas1.isEmpty()) {
                fieldEmpty = true
                et_jage_luas_alas.error = resources.getString(R.string.error_empty_field)
            }
            if (valueluas2.isEmpty()) {
                fieldEmpty = true
                et_jage_luas_tinggi.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (valueluas1.toDouble() * valueluas2.toDouble())
                tv_result_jege_luas.text = result.toString()
            }
        }
        btn_jage_keliling.setOnClickListener {
            valuekeliling1 = et_jage_keliling.text.toString().trim()
            valuekeliling2 = et_jage_keliling2.text.toString().trim()

            if (valuekeliling1.isEmpty()) {
                fieldEmpty = true
                et_jage_keliling.error = resources.getString(R.string.error_empty_field)
            }
            if (valuekeliling2.isEmpty()) {
                fieldEmpty = true
                et_jage_keliling2.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (valuekeliling1.toDouble() + valuekeliling2.toDouble()) * 2
                tv_result_jage_keliling.text = result.toString()
            }
        }
    }
}
