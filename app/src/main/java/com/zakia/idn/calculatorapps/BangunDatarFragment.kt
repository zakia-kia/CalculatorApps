package com.zakia.idn.calculatorapps


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.zakia.idn.calculatorapps.Adapter.BangunDatarAdapter
import com.zakia.idn.calculatorapps.Adapter.BangunRuangAdapter
import kotlinx.android.synthetic.main.fragment_bangun_datar.*

/**
 * A simple [Fragment] subclass.
 */
class BangunDatarFragment : Fragment() {
    companion object {
        fun newInstance(): BangunDatarFragment {
            val fragment = BangunDatarFragment()
            val arg = Bundle()
            fragment.arguments = arg
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bangun_datar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view_pager_BD.adapter = BangunDatarAdapter(fragmentManager as FragmentManager)
        tabs_layout_BD.setupWithViewPager(view_pager_BD)
    }
}
