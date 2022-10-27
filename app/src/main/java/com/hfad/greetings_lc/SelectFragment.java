package com.hfad.greetings_lc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SelectFragment} factory method to
 * create an instance of this fragment.
 */
public class SelectFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_select, container, false);

        //Get the GUI components
        Button btnNext = view.findViewById(R.id.btn_next);
        Spinner spnLanguage = view.findViewById(R.id.spn_languages);

        //Add button logic
        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String msg = spnLanguage.getSelectedItem().toString(); //get the selected language

                //add selected language to the navigation
                SelectFragmentDirections.ActionSelectFragmentToLanguageFragment action =
                        SelectFragmentDirections.actionSelectFragmentToLanguageFragment(msg);

                //Navigate to the next fragment
                Navigation.findNavController(view).navigate(action);
            }
        });

        return view;
    }
}