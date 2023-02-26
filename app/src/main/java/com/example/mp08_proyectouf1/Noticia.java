package com.example.mp08_proyectouf1;

public class Noticia {

    int fotoNoticia;
    String titulo;
    String contenido;
    int fotoWeb;
    String webNoticia;
    String tiempoNoticia;
    int fotojugadorNoticia;
    String nombreJugador;
    int fotoClubNoticia;
    String clubNoticia;


    public Noticia(int fotoNoticia, String titulo, String contenido, int fotoWeb, String webNoticia, String tiempoNoticia, int fotojugadorNoticia, String nombreJugador, int fotoClubNoticia, String clubNoticia) {
        this.fotoNoticia = fotoNoticia;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fotoWeb = fotoWeb;
        this.webNoticia = webNoticia;
        this.tiempoNoticia = tiempoNoticia;
        this.fotojugadorNoticia = fotojugadorNoticia;
        this.nombreJugador = nombreJugador;
        this.fotoClubNoticia = fotoClubNoticia;
        this.clubNoticia = clubNoticia;
    }
}
