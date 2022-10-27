package com.hfad.greetings_lc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.crypto.EncryptedPrivateKeyInfo;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LanguageFragment} factory method to
 * create an instance of this fragment.
 */
public class LanguageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_language, container, false);

        TextView txtOutput = view.findViewById(R.id.txt_output); //Get the textview object
        String msg = LanguageFragmentArgs.fromBundle(requireArguments()).getLanguage(); //get the selected language

        //Display selected language's version for "Hello"
        switch (msg) {
            case "English":
                txtOutput.setText(R.string.hello);
                break;
            case "French":
                txtOutput.setText(R.string.bonjour);
                break;
            case "Italian":
                txtOutput.setText(R.string.ciao);
                break;
        }

        return view;
    }
}