package com.zakia.idn.calculatorapps.BangunRuang


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zakia.idn.calculatorapps.R
import kotlinx.android.synthetic.main.fragment_balok.*

/**
 * A simple [Fragment] subclass.
 */
class BalokFragment : Fragment() {

    private lateinit var valueone: String
    private lateinit var value2: String
    private lateinit var value3: String
    private var result: Double? = null
    private var fieldEmpty: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_balok, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_balok.setOnClickListener {
            valueone = et_balok1.text.toString().trim()
            value2 = et_balok2.text.toString().trim()
            value3 = et_balok3.text.toString().trim()

            if (valueone.isEmpty()) {
                fieldEmpty = true
                et_balok1.error = resources.getString(R.string.error_empty_field)
            }
            if (value2.isEmpty()) {
                fieldEmpty = true
                et_balok2.error = resources.getString(R.string.error_empty_field)
            }
            if (value3.isEmpty()) {
                fieldEmpty = true
                et_balok3.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (valueone.toDouble() * value2.toDouble() * value3.toDouble())
                tv_result_balok.text = result.toString()
            }
        }
    }


}
