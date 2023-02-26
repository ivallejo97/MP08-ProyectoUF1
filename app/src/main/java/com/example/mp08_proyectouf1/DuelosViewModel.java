package com.example.mp08_proyectouf1;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class DuelosViewModel extends AndroidViewModel {

    ListaDuelos listaDuelos;

    MutableLiveData<List<Duelo>> listaDuelosMutableLiveData = new MutableLiveData<>();


    public DuelosViewModel(@NonNull Application application) {
        super(application);

        listaDuelos = new ListaDuelos();

        listaDuelosMutableLiveData.setValue(listaDuelos.obtener());
    }

    MutableLiveData<List<Duelo>> obtener(){
        return listaDuelosMutableLiveData;
    }

    MutableLiveData<Duelo> dueloSeleccionado = new MutableLiveData<>();

    void seleccionarDuelo(Duelo duelo){
        dueloSeleccionado.setValue(duelo);
    }

    MutableLiveData<Duelo> seleccionado(){
        return dueloSeleccionado;
    }



}
