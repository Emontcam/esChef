package com.medac.eschef.ui.todo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.medac.eschef.R;
import com.medac.eschef.databinding.FragmentTodoBinding;

public class TodoFragment extends Fragment {

    private FragmentTodoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TodoViewModel todoViewModel =
                new ViewModelProvider(this).get(TodoViewModel.class);

        binding = FragmentTodoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        CardView tarjeta = root.findViewById(R.id.tarjetaReceta1);

        // funcion del boton para llegar a la receta
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(R.id.action_nav_todo_to_recetaFragment);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta2);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(R.id.action_nav_todo_to_recetaFragmentEspaguetis);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta3);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(R.id.action_nav_todo_to_recetaFragmentBombones);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta4);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(R.id.action_nav_todo_to_recetaFragmentAngulas);
            }
        });


        tarjeta = root.findViewById(R.id.tarjetaReceta5);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(R.id.action_nav_todo_to_recetaFragment);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta6);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(R.id.action_nav_todo_to_recetaFragmentEspaguetis);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta7);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(R.id.action_nav_todo_to_recetaFragment);
            }
        });

        tarjeta = root.findViewById(R.id.tarjetaReceta8);
        tarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragment receta
                Navigation.findNavController(root).navigate(R.id.action_nav_todo_to_recetaFragment);
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