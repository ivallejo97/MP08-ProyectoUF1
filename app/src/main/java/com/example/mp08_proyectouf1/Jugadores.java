package com.example.mp08_proyectouf1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mp08_proyectouf1.databinding.FragmentJugadoresBinding;
import com.example.mp08_proyectouf1.databinding.ViewholderJugadorBinding;

import java.util.List;


public class Jugadores extends Fragment {

    private FragmentJugadoresBinding binding;
    private JugadoresViewModel jugadoresViewModel;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentJugadoresBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        jugadoresViewModel = new ViewModelProvider(requireActivity()).get(JugadoresViewModel.class);
        navController = Navigation.findNavController(view);

        JugadoresAdapter jugadoresAdapter = new JugadoresAdapter();
        binding.recyclerView.setAdapter(jugadoresAdapter);

        jugadoresViewModel.obtener().observe(getViewLifecycleOwner(), new Observer<List<Jugador>>() {
                    @Override
                    public void onChanged(List<Jugador> jugadores) {
                        jugadoresAdapter.establecerLista(jugadores);
                    }
                });
/*
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(
                ItemTouchHelper.UP | ItemTouchHelper.DOWN,
                ItemTouchHelper.RIGHT  | ItemTouchHelper.LEFT) {

            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return true;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                int posicion = viewHolder.getAdapterPosition();
                Jugador jugador = jugadoresAdapter.obtenerElemento(posicion);

            }
        }).attachToRecyclerView(binding.recyclerView);
*/
    }

    class JugadorViewHolder extends RecyclerView.ViewHolder {
        private final ViewholderJugadorBinding binding;

        public JugadorViewHolder(ViewholderJugadorBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    class JugadoresAdapter extends RecyclerView.Adapter<JugadorViewHolder> {

        List<Jugador> jugadores;

        @NonNull
        @Override
        public JugadorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new JugadorViewHolder(ViewholderJugadorBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull JugadorViewHolder holder, int position) {

            Jugador jugador = jugadores.get(position);

            holder.binding.fotoJugador.setImageResource(jugador.fotoJugador1);
            holder.binding.nombreJugador.setText(jugador.nombre);
            holder.binding.precioJugador.setText(jugador.valorMercado);


            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jugadoresViewModel.seleccionar(jugador);
                    navController.navigate(R.id.action_jugadores_to_mostrarJugadores);
                }
            });


        }

        @Override
        public int getItemCount() {
            return jugadores != null ? jugadores.size() : 0;
        }

        public void establecerLista(List<Jugador> jugadores){
            this.jugadores = jugadores;
            notifyDataSetChanged();
        }

        public Jugador obtenerElemento(int posicion){
            return jugadores.get(posicion);
        }
    }


}