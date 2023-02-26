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

import com.example.mp08_proyectouf1.databinding.FragmentDuelosBinding;
import com.example.mp08_proyectouf1.databinding.FragmentJugadoresBinding;
import com.example.mp08_proyectouf1.databinding.ViewholderDuelosBinding;
import com.example.mp08_proyectouf1.databinding.ViewholderJugadorBinding;

import java.util.List;


public class Duelos extends Fragment {

    private FragmentDuelosBinding binding;
    private DuelosViewModel duelosViewModel;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentDuelosBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        duelosViewModel = new ViewModelProvider(requireActivity()).get(DuelosViewModel.class);
        navController = Navigation.findNavController(view);

        Duelos.DuelosAdapter duelosAdapter = new Duelos.DuelosAdapter();
        binding.recyclerDuelos.setAdapter(duelosAdapter);

        duelosViewModel.obtener().observe(getViewLifecycleOwner(), new Observer<List<Duelo>>() {
            @Override
            public void onChanged(List<Duelo> duelos) {
                duelosAdapter.establecerLista(duelos);
            }
        });

       /* new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(
                ItemTouchHelper.UP | ItemTouchHelper.DOWN,
                ItemTouchHelper.RIGHT  | ItemTouchHelper.LEFT) {

            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return true;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                int posicion = viewHolder.getAdapterPosition();
                Duelo duelo = duelosAdapter.obtenerElemento(posicion);

            }
        }).attachToRecyclerView(binding.recyclerDuelos);*/


    }

    class DueloViewHolder extends RecyclerView.ViewHolder {
        private final ViewholderDuelosBinding binding;

        public DueloViewHolder(ViewholderDuelosBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    class DuelosAdapter extends RecyclerView.Adapter<DueloViewHolder> {

        List<Duelo> duelos;

        @NonNull
        @Override
        public DueloViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new DueloViewHolder(ViewholderDuelosBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull DueloViewHolder holder, int position) {

            Duelo duelo = duelos.get(position);

            holder.binding.jugador1Duelo.setImageResource(duelo.fotoJugador1);
            holder.binding.jugador2Duelo.setImageResource(duelo.fotoJugador2);
            holder.binding.tipo.setText(duelo.nombreDelDuelo);
            holder.binding.fotoEstadisticaJ1.setImageResource(duelo.fotoEstadisticaJ1);
            holder.binding.fotoEstadisticaJ2.setImageResource(duelo.fotoEstadisticaJ2);


            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duelosViewModel.seleccionarDuelo(duelo);
                    navController.navigate(R.id.action_duelos_to_mostrarDuelos);
                }
            });


        }

        @Override
        public int getItemCount() {
            return duelos != null ? duelos.size() : 0;
        }

        public void establecerLista(List<Duelo> duelos){
            this.duelos = duelos;
            notifyDataSetChanged();
        }

        public Duelo obtenerElemento(int posicion){
            return duelos.get(posicion);
        }
    }


}