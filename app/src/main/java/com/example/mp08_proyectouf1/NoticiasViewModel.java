package com.example.mp08_proyectouf1;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class NoticiasViewModel extends AndroidViewModel {

    ListaNoticias listaNoticias;

    MutableLiveData<List<Noticia>> listaNoticiasMutableLiveData = new MutableLiveData<>();


    public NoticiasViewModel(@NonNull Application application){
        super(application);

        listaNoticias = new ListaNoticias();

        listaNoticiasMutableLiveData.setValue(listaNoticias.obtener());

    }

    MutableLiveData<List<Noticia>> obtener(){
        return listaNoticiasMutableLiveData;
    }

    MutableLiveData<Noticia> noticiaSeleccionada = new MutableLiveData<>();

    void seleccionar(Noticia noticia){
        noticiaSeleccionada.setValue(noticia);
    }

    MutableLiveData<Noticia> seleccionado(){
        return noticiaSeleccionada;
    }


}
