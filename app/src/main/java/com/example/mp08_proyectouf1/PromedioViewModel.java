package com.example.mp08_proyectouf1;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PromedioViewModel extends AndroidViewModel {


    Executor executor;

    SimuladorPromedio simulador;

    MutableLiveData<Double> promedioGoles = new MutableLiveData<Double>();
    MutableLiveData<Double> golesPorMinuto = new MutableLiveData<>();
    MutableLiveData<Integer> errorMinutosJugados = new MutableLiveData<>();
    MutableLiveData<Integer> errorGolesMarcados = new MutableLiveData<>();
    MutableLiveData<Boolean> calculando = new MutableLiveData<>();


    public PromedioViewModel(@NonNull Application application) {
        super(application);

        executor = Executors.newSingleThreadExecutor();
        simulador = new SimuladorPromedio();
    }


    public void calcular(int minutosJugados, int golesMarcados) {

        final SimuladorPromedio.Solicitud solicitud = new SimuladorPromedio.Solicitud(minutosJugados, golesMarcados);

        executor.execute(new Runnable() {
            @Override
            public void run() {


                simulador.calcularGolesPorMinuto(solicitud, new SimuladorPromedio.Callback() {
                    @Override
                    public void promedios(Double promedios) {
                        errorMinutosJugados.postValue(null);
                        errorGolesMarcados.postValue(null);
                        golesPorMinuto.postValue(promedios);
                    }

                    @Override
                    public void errorMinutosJugadosInferioresAlMinimo(int minutosJugadosMinimos) {
                        errorMinutosJugados.postValue(minutosJugadosMinimos);
                    }

                    @Override
                    public void errorGolesMarcadosInferioresAlMinimo(int golesMarcadosMinimos) {
                        errorGolesMarcados.postValue(golesMarcadosMinimos);
                    }
                    @Override
                    public void cuandoEmpieceElCalculo() {
                        calculando.postValue(true);
                    }

                    @Override
                    public void cuandoFinaliceElCalculo() {
                        calculando.postValue(false);
                    }
                });


            }
        });
    }

}
