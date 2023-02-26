package com.example.mp08_proyectouf1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import com.example.mp08_proyectouf1.databinding.FragmentMostrarDuelosBinding;
import com.example.mp08_proyectouf1.databinding.FragmentMostrarJugadoresBinding;


public class MostrarDuelos extends Fragment {

    private FragmentMostrarDuelosBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentMostrarDuelosBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DuelosViewModel duelosViewModel = new ViewModelProvider(requireActivity()).get(DuelosViewModel.class);
        duelosViewModel.seleccionado().observe(getViewLifecycleOwner(), new Observer<Duelo>() {
            @Override
            public void onChanged(Duelo duelo) {

                binding.jugador1.setImageResource(duelo.fotoJugador1);
                binding.fondoDuelosJ1.setImageResource(duelo.fondoJugador1);
                binding.nombreJ1Duelo.setText(duelo.nombreJugador1);
                binding.numPartidosJ1.setText(duelo.partidosJ1);
                binding.numGolesJ1.setText(duelo.golesJ1);
                binding.numAsistenciasJ1.setText(duelo.asistenciasJ1);
                binding.numMinutosJ1.setText(duelo.minutosJ1);
                binding.numPromedioJ1.setText(duelo.promedioJ1);
                binding.numPrecisionJ1.setText(duelo.precisionJ1);
                binding.numRegatesJ1.setText(duelo.regatesJ1);
                binding.numRegatesExitoJ1.setText(duelo.regateExitoJ1);
                binding.numRecuperacionesJ1.setText(duelo.balonesRecuperadosJ1);
                binding.numDuelosGanadosJ1.setText(duelo.duelosJ1);
                binding.numIntercepcionesJ1.setText(duelo.interceptadosJ1);
                binding.numEntradasExitoJ1.setText(duelo.entradasJ1);

                binding.jugador2.setImageResource(duelo.fotoJugador2);
                binding.fondoDuelosJ2.setImageResource(duelo.fondoJugador2);
                binding.nombreJ2Duelo.setText(duelo.nombreJugador2);
                binding.numPartidosJ2.setText(duelo.partidosJ2);
                binding.numGolesJ2.setText(duelo.golesJ2);
                binding.numAsistenciasJ2.setText(duelo.asistenciasJ2);
                binding.numMinutosJ2.setText(duelo.minutosJ2);
                binding.numPromedioJ2.setText(duelo.promedioJ2);
                binding.numPrecisionJ2.setText(duelo.precisionJ2);
                binding.numRegatesJ2.setText(duelo.regatesJ2);
                binding.numRegatesExitoJ2.setText(duelo.regateExitoJ2);
                binding.numRecuperacionesJ2.setText(duelo.balonesRecuperadosJ2);
                binding.numDuelosGanadosJ2.setText(duelo.duelosJ2);
                binding.numIntercepcionesJ2.setText(duelo.interceptadosJ2);
                binding.numEntradasExitoJ2.setText(duelo.entradasJ2);




            }
        });

    }

}