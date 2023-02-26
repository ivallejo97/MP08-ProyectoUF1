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
import com.example.mp08_proyectouf1.databinding.FragmentMostrarNoticiasBinding;


public class MostrarNoticias extends Fragment {

    private FragmentMostrarNoticiasBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentMostrarNoticiasBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NoticiasViewModel noticiasViewModel = new ViewModelProvider(requireActivity()).get(NoticiasViewModel.class);
        noticiasViewModel.seleccionado().observe(getViewLifecycleOwner(), new Observer<Noticia>() {
            @Override
            public void onChanged(Noticia noticia) {

                binding.tituloNoticia1.setText(noticia.titulo);
                binding.fotoNoticia1.setImageResource(noticia.fotoNoticia);
                binding.contenidoNoticia.setText(noticia.contenido);
                binding.fotoWebNoticia1.setImageResource(noticia.fotoWeb);
                binding.webNoticia1.setText(noticia.webNoticia);
                binding.fotoJugadorNoticia.setImageResource(noticia.fotojugadorNoticia);
                binding.nombreJugadorNoticia.setText(noticia.nombreJugador);
                binding.fotoClubNoticia.setImageResource(noticia.fotoClubNoticia);
                binding.nombreClubNoticia.setText(noticia.clubNoticia);

            }
        });

    }
}