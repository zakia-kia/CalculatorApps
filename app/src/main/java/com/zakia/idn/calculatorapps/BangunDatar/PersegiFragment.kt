package  com.zakia.idn.calculatorapps.BangunDatar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zakia.idn.calculatorapps.R
import kotlinx.android.synthetic.main.fragment_persegi.*

/**
 * A simple [Fragment] subclass.
 */
class PersegiFragment : Fragment() {

    private lateinit var valueone: String
    private lateinit var valuetwo: String
    private var result: Double? = null
    private var fieldEmpty: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_persegi_luas.setOnClickListener {
            valueone = et_persegi_luas.text.toString().trim()

            if (valueone.isEmpty()) {
                fieldEmpty = true
                et_persegi_luas.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (valueone.toDouble() * valueone.toDouble())
                tv_result_persegi_luas.text = result.toString()
            }
        }
        btn_persegi_keliling.setOnClickListener {
            valuetwo = et_persegi_keliling.text.toString().trim()

            if (valuetwo.isEmpty()) {
                fieldEmpty = true
                et_persegi_keliling.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (valuetwo.toDouble() * 4)
                tv_result_persegi_keliling.text = result.toString()
            }
        }
    }
}
