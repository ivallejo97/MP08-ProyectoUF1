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

import com.example.mp08_proyectouf1.databinding.FragmentMostrarJugadoresBinding;


public class MostrarJugadores extends Fragment {

    private FragmentMostrarJugadoresBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentMostrarJugadoresBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        

        JugadoresViewModel jugadoresViewModel = new ViewModelProvider(requireActivity()).get(JugadoresViewModel.class);
        jugadoresViewModel.seleccionado().observe(getViewLifecycleOwner(), new Observer<Jugador>() {
            @Override
            public void onChanged(Jugador jugador) {

                binding.fondoJugador.setImageResource(jugador.fondoJugador);
                binding.fotoJugador.setImageResource(jugador.fotoJugador2);
                binding.nombreJugador.setText(jugador.nombre);
                binding.fondoEquipo.setBackgroundColor(jugador.colorFondoEquipo);
                binding.escudo.setImageResource(jugador.fotoEquipo);
                binding.nombreEquipo.setText(jugador.equipo);
                binding.numSeguidores.setText(jugador.numSeguidores);
                binding.numEdad.setText(jugador.edad);
                binding.nombrePais.setText(jugador.pais);
                binding.nPosicion.setText(jugador.posicion);
                binding.numeroCamiseta.setText(jugador.numCamiseta);
                binding.nEstatura.setText(jugador.altura);
                binding.nPeso.setText(jugador.peso);
                binding.estadistica1.setText(jugador.nombreEstadistica1);
                binding.estadistica2.setText(jugador.nombreEstadistica2);
                binding.estadistica3.setText(jugador.nombreEstadistica3);
                binding.estadistica4.setText(jugador.nombreEstadistica4);
                binding.numEstadistica1.setText(jugador.estadistica1);
                binding.numEstadistica2.setText(jugador.estadistica2);
                binding.numEstadistica3.setText(jugador.estadistica3);
                binding.numEstadistica4.setText(jugador.estadistica4);
                binding.escudoCompeticion.setImageResource(jugador.fotoCompeticion);
                binding.escudoEquipoLocal.setImageResource(jugador.fotoEquipoLocal);
                binding.escudoEquipoVisitante.setImageResource(jugador.fotoEquipoVisitante);
                binding.nombreCompeticion.setText(jugador.nombreCompeticion);
                binding.nombreEquipoLocal.setText(jugador.nombreEquipoLocal);
                binding.nombreEquipoVisitante.setText(jugador.nombreEquipoVisitante);
                binding.diaPartido.setText(jugador.fechaPartido);
                binding.horaPartido.setText(jugador.horaPartido);
                binding.equipo.setImageResource(jugador.fotoEquipoActual);
                binding.seleccion.setImageResource(jugador.fotoSeleccion);
                binding.nombreEquipo2.setText(jugador.nombreEquipoActual);
                binding.nombreSeleccion.setText(jugador.nombreSeleccion);

               // binding.valoracion.setRating(jugador.valoracion);

/*
                binding.valoracion.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    if (fromUser){
                        jugadoresViewModel.actualizar(jugador, rating);
                    }

                    }
                });*/
            }
        });

    }

}