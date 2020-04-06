package com.zakia.idn.calculatorapps.BangunRuang


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zakia.idn.calculatorapps.R
import kotlinx.android.synthetic.main.fragment_kubus.*

/**
 * A simple [Fragment] subclass.
 */
class KubusFragment : Fragment() {

    private lateinit var valueone: String
    private var result: Double? = null
    private var fieldEmpty: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kubus, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_kubus.setOnClickListener {
            valueone = et_kubus.text.toString().trim()

            if (valueone.isEmpty()) {
                fieldEmpty = true
                et_kubus.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (valueone.toDouble() * valueone.toDouble() * valueone.toDouble())
                tv_result_kubus.text = result.toString()
            }
        }
    }


}
