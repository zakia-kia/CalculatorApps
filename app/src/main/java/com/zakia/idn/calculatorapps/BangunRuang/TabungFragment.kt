package com.zakia.idn.calculatorapps.BangunRuang


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zakia.idn.calculatorapps.R
import kotlinx.android.synthetic.main.fragment_tabung.*

/**
 * A simple [Fragment] subclass.
 */
class TabungFragment : Fragment() {

    private lateinit var valueone: String
    private lateinit var value2: String
    private var result: Double? = null
    private var fieldEmpty: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tabung, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_tabung.setOnClickListener {
            valueone = et_tabung1.text.toString().trim()
            value2 = et_tabung2.text.toString().trim()

            if (valueone.isEmpty()) {
                fieldEmpty = true
                et_tabung1.error = resources.getString(R.string.error_empty_field)
            }
            if (value2.isEmpty()) {
                fieldEmpty = true
                et_tabung2.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (3.14 * (valueone.toDouble() * valueone.toDouble() * value2.toDouble()))
                tv_result_tabung.text = result.toString()

            }
        }
    }
}
