package com.medac.eschef;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecetaFragmentAngulas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecetaFragmentAngulas extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RecetaFragmentAngulas() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static RecetaFragmentAngulas newInstance(String param1, String param2) {
        RecetaFragmentAngulas fragment = new RecetaFragmentAngulas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_receta_angulas, container, false);
    }

    public void seleccionar(View v){
        ToggleButton boton = (ToggleButton) v;
        boton.setBackgroundColor(getResources().getColor(R.color.verde));
    }
}