package com.example.mp08_proyectouf1;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mp08_proyectouf1.databinding.FragmentCalcularPromedioBinding;


public class Promedio extends Fragment {

    private FragmentCalcularPromedioBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentCalcularPromedioBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final PromedioViewModel promedioViewModel = new ViewModelProvider(this).get(PromedioViewModel.class);

        binding.calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean error = false;

                int minutosJugados = 0;
                int golesMarcados = 0;

                try {
                    minutosJugados = Integer.parseInt(binding.minutosJugados.getText().toString());
                } catch (Exception e){
                    binding.minutosJugados.setError("Introduce un numero");
                    error = true;
                }

                try {
                    golesMarcados = Integer.parseInt(binding.golesMarcados.getText().toString());
                } catch (Exception e){
                    binding.golesMarcados.setError("Introduce un numero");
                    error = true;
                }

                if (!error) {
                    promedioViewModel.calcular(minutosJugados, golesMarcados);
                }

            }
        });



        promedioViewModel.golesPorMinuto.observe(getViewLifecycleOwner(), new Observer<Double>() {
            @Override
            public void onChanged(Double impuestoFinal) {
                binding.golCadaXMinuto.setText(String.format("%.0f",impuestoFinal));
                binding.golCadaXMinuto.setTextSize(20);
                binding.golCadaXMinuto.setTextColor(Color.BLACK);
                binding.golCadaXMinuto.setGravity(Gravity.CENTER);
            }
        });



        promedioViewModel.calculando.observe(getViewLifecycleOwner(), new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean calculando) {
                binding.golCadaXMinuto.setVisibility(View.VISIBLE);
            }
        });

    }
}