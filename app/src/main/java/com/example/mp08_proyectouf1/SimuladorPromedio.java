package com.example.mp08_proyectouf1;

public class SimuladorPromedio {

    public static class Solicitud {
        public int minutosJugados;
        public int golesMarcados;

        public Solicitud(int minutosJugados, int golesMarcados) {
            this.minutosJugados = minutosJugados;
            this.golesMarcados = golesMarcados;
        }
    }

    interface Callback {
        void promedios(Double promedios);
        void errorMinutosJugadosInferioresAlMinimo(int precioDeCompraMinimo);
        void errorGolesMarcadosInferioresAlMinimo(int precioDeVentaMinimo);
        void cuandoEmpieceElCalculo();
        void cuandoFinaliceElCalculo();
    }


    public void calcularGolesPorMinuto(Solicitud solicitud, Callback callback) {
        int minutosPorGol = 0;
        int minutosJugadosMinimos = 100;
        int golesMarcadosMinimos = 1;

        callback.cuandoEmpieceElCalculo();

        try {
            Thread.sleep(0);   // simular operacion de larga duracion (10s)
            minutosPorGol = solicitud.minutosJugados / solicitud.golesMarcados;

        } catch (InterruptedException e) {}

        boolean error = false;
        if (solicitud.minutosJugados < minutosJugadosMinimos) {
            callback.errorMinutosJugadosInferioresAlMinimo(minutosJugadosMinimos);
            error = true;
        }

        if (solicitud.golesMarcados < golesMarcadosMinimos) {
            callback.errorGolesMarcadosInferioresAlMinimo(golesMarcadosMinimos);
            error = true;
        }

        if(!error) {
            callback.promedios((double) (minutosPorGol));
        }

        callback.cuandoFinaliceElCalculo();

    }



}
