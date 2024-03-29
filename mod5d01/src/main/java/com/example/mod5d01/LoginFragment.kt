package com.example.mod5d01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener {

            val user = User(
                view.findViewById<EditText>(R.id.editTextLogin).text.toString(),
                view.findViewById<EditText>(R.id.editTextPassword).text.toString()
            )

            val direction = LoginFragmentDirections.actionLoginToHome(user)
            Navigation.findNavController(view).navigate(direction)
        }


    }


}