package com.medac.eschef.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.medac.eschef.R;
import com.medac.eschef.databinding.FragmentPastaBinding;
import com.medac.eschef.databinding.FragmentPescadoBinding;
import com.medac.eschef.databinding.FragmentPostreBinding;
import com.medac.eschef.ui.pescado.PescadoViewModel;

public class PostreFragment extends Fragment {

    private FragmentPostreBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PescadoViewModel pescadoViewModel =
                new ViewModelProvider(this).get(PescadoViewModel.class);

        binding = FragmentPostreBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        int cambio = R.id.action_nav_postre_to_recetaFragmentBombones;

        CardView tarjeta = root.findViewById(R.id.tarjetaReceta1);

        // funcion del boton para llegar a la receta
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(cambio);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta2);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(cambio);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta3);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(cambio);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta4);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(cambio);
            }
        });


        tarjeta = root.findViewById(R.id.tarjetaReceta5);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(cambio);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta6);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(cambio);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta7);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(cambio);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta8);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(cambio);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}