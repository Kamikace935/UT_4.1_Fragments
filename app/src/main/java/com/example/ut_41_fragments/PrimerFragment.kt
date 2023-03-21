package com.example.ut_41_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class PrimerFragment : Fragment() {
    private lateinit var tv1: TextView
    private lateinit var bt1: Button
    private lateinit var vista: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vista = inflater.inflate(R.layout.fragment_primer, container, false)

        tv1 = vista.findViewById(R.id.tv1)
        bt1 = vista.findViewById(R.id.bt1)

        bt1.setOnClickListener {
            val mensaje = "Mi primer Fragmento"
            tv1.text = mensaje
        }

        return vista
    }
}