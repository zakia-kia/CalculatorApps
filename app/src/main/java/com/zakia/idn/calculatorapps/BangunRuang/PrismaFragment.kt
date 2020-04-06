package com.zakia.idn.calculatorapps.BangunRuang


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zakia.idn.calculatorapps.R
import kotlinx.android.synthetic.main.fragment_prisma.*

/**
 * A simple [Fragment] subclass.
 */
class PrismaFragment : Fragment() {

    private lateinit var valueone: String
    private lateinit var value2: String
    private var result: Double? = null
    private var fieldEmpty: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prisma, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_prisma.setOnClickListener {
            valueone = et_prisma1.text.toString().trim()
            value2 = et_prisma2.text.toString().trim()

            if (valueone.isEmpty()) {
                fieldEmpty = true
                et_prisma1.error = resources.getString(R.string.error_empty_field)
            }
            if (value2.isEmpty()) {
                fieldEmpty = true
                et_prisma2.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (valueone.toDouble() * value2.toDouble())
                tv_result_prisma.text = result.toString()

            }
        }
    }
}
