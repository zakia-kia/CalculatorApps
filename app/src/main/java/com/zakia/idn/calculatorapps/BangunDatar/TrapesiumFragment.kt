package com.zakia.idn.calculatorapps.BangunDatar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zakia.idn.calculatorapps.R
import kotlinx.android.synthetic.main.fragment_trapesium.*

/**
 * A simple [Fragment] subclass.
 */
class TrapesiumFragment : Fragment() {

    private lateinit var valueluas1: String
    private lateinit var valueluas2: String
    private lateinit var valueluas3: String
    private lateinit var valuekeliling1: String
    private lateinit var valuekeliling2: String
    private lateinit var valuekeliling3: String
    private lateinit var valuekeliling4: String
    private var result: Double? = null
    private var fieldEmpty: Boolean = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trapesium, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_trapesium_luas.setOnClickListener {
            valueluas1 = et_tra_luas_a.text.toString().trim()
            valueluas2 = et_tra_luas_b.text.toString().trim()
            valueluas3 = et_tra_luas_tinggi.text.toString().trim()

            if (valueluas1.isEmpty()) {
                fieldEmpty = true
                et_tra_luas_a.error = resources.getString(R.string.error_empty_field)
            }
            if (valueluas2.isEmpty()) {
                fieldEmpty = true
                et_tra_luas_b.error = resources.getString(R.string.error_empty_field)
            }
            if (valueluas2.isEmpty()) {
                fieldEmpty = true
                et_tra_luas_tinggi.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result =
                    ((valueluas1.toDouble() + (valueluas2.toDouble()) * valueluas3.toDouble())) / 2
                tv_result_trapesium_luas.text = result.toString()
            }
        }
        btn_trapesium_keliling.setOnClickListener {
            valuekeliling1 = et_trapesium_keliling1.text.toString().trim()
            valuekeliling2 = et_trapesium_keliling_2.text.toString().trim()
            valuekeliling3 = et_trapesium_keliling3.text.toString().trim()
            valuekeliling4 = et_trapesium_keliling4.text.toString().trim()

            if (valuekeliling1.isEmpty()) {
                fieldEmpty = true
                et_trapesium_keliling1.error = resources.getString(R.string.error_empty_field)
            }
            if (valuekeliling2.isEmpty()) {
                fieldEmpty = true
                et_trapesium_keliling_2.error = resources.getString(R.string.error_empty_field)
            }
            if (valuekeliling3.isEmpty()) {
                fieldEmpty = true
                et_trapesium_keliling3.error = resources.getString(R.string.error_empty_field)
            }
            if (valuekeliling4.isEmpty()) {
                fieldEmpty = true
                et_trapesium_keliling4.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result =
                    (valuekeliling1.toDouble() + valuekeliling2.toDouble() + valuekeliling3.toDouble() + valuekeliling4.toDouble())
                tv_result_trapesium_keliling.text = result.toString()
            }
        }
    }
}
