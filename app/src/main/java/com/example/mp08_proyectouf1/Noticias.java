package com.example.mp08_proyectouf1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mp08_proyectouf1.databinding.FragmentJugadoresBinding;
import com.example.mp08_proyectouf1.databinding.FragmentNoticiasBinding;
import com.example.mp08_proyectouf1.databinding.ViewholderJugadorBinding;
import com.example.mp08_proyectouf1.databinding.ViewholderNoticiaBinding;

import java.util.List;


public class Noticias extends Fragment {

    private FragmentNoticiasBinding binding;
    private NoticiasViewModel noticiasViewModel;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentNoticiasBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        noticiasViewModel = new ViewModelProvider(requireActivity()).get(NoticiasViewModel.class);
        navController = Navigation.findNavController(view);

        NoticiasAdapter noticiasAdapter = new NoticiasAdapter();
        binding.recyclerNoticias.setAdapter(noticiasAdapter);

        noticiasViewModel.obtener().observe(getViewLifecycleOwner(), new Observer<List<Noticia>>() {
            @Override
            public void onChanged(List<Noticia> noticias) {
                noticiasAdapter.establecerLista(noticias);
            }
        });
    }

    class NoticiaViewHolder extends RecyclerView.ViewHolder {
        private final ViewholderNoticiaBinding binding;

        public NoticiaViewHolder(ViewholderNoticiaBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    class NoticiasAdapter extends RecyclerView.Adapter<NoticiaViewHolder> {

        List<Noticia> noticias;

        @NonNull
        @Override
        public NoticiaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new NoticiaViewHolder(ViewholderNoticiaBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull NoticiaViewHolder holder, int position) {

            Noticia noticia = noticias.get(position);

            holder.binding.tituloNoticia.setText(noticia.titulo);
            holder.binding.fotoNoticia.setImageResource(noticia.fotoNoticia);
            holder.binding.fotoWebNoticia.setImageResource(noticia.fotoWeb);
            holder.binding.nombreWebNoticia.setText(noticia.webNoticia);
            holder.binding.tiempoNoticia.setText(noticia.tiempoNoticia);


            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    noticiasViewModel.seleccionar(noticia);
                    navController.navigate(R.id.action_noticias_to_mostrarNoticias);
                }
            });


        }

        @Override
        public int getItemCount() {
            return noticias != null ? noticias.size() : 0;
        }

        public void establecerLista(List<Noticia> noticias){
            this.noticias = noticias;
            notifyDataSetChanged();
        }

        public Noticia obtenerElemento(int posicion){
            return noticias.get(posicion);
        }
    }



}