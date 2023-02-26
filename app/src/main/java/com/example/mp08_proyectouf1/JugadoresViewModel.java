package com.example.mp08_proyectouf1;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class JugadoresViewModel extends AndroidViewModel {

    ListaJugadores listaJugadores;

    MutableLiveData<List<Jugador>> listJugadoresMutableLiveData = new MutableLiveData<>();

    public JugadoresViewModel(@NonNull Application application){
        super(application);

        listaJugadores = new ListaJugadores();

        listJugadoresMutableLiveData.setValue(listaJugadores.obtener());

    }

    MutableLiveData<List<Jugador>> obtener(){
        return listJugadoresMutableLiveData;
    }

    void actualizar(Jugador jugador, float valoracion){
        listaJugadores.actualizar(jugador, valoracion, new ListaJugadores.Callback() {
            @Override
            public void terminar(List<Jugador> elementos) {
                listJugadoresMutableLiveData.setValue(elementos);
            }
        });
    }

    MutableLiveData<Jugador> jugadorSeleccionado = new MutableLiveData<>();

    void seleccionar(Jugador jugador){
        jugadorSeleccionado.setValue(jugador);
    }

    MutableLiveData<Jugador> seleccionado(){
        return jugadorSeleccionado;
    }


}
