package com.example.mp08_proyectouf1;

import java.util.ArrayList;
import java.util.List;

public class ListaDuelos {

    List<Duelo> duelos = new ArrayList<>();

    interface Callback {
        void terminar(List<Duelo> duelos);
    }

    ListaDuelos(){
        duelos.add(new Duelo("Maximos Goleadores", R.drawable.haaland, R.drawable.premier, "Erling Haaland", "32","32", "4","2493","3","6","67","2","2","1,03", "62%", "62%", R.drawable.mbappe, R.drawable.league1,"Kylian Mbáppe", "28","27","6","2214","9","3","72","2","3","0,98", "73%", "80%", R.drawable.goles,R.drawable.goles));
        duelos.add(new Duelo("Maximos Asistentes", R.drawable.kevin_de_bruyne, R.drawable.premier, "Kevin de Bruyne", "31","4", "18","2417","5","8","71","5","9","0,12", "47%", "70%", R.drawable.neymar, R.drawable.league1,"Neymar Jr", "29","18","17","2362","9","1","126","4","14","0,62", "66%", "83%", R.drawable.asistencias,R.drawable.asistencias));
        duelos.add(new Duelo("Maximos \nRegateadores", R.drawable.vinicius, R.drawable.liga_santander, "Vinicius Jr", "35","18", "9","3069","11","3","169","6","17","0,51", "66%", "86%", R.drawable.kvaratskhelia, R.drawable.serie_a,"Kvicha Kvaratskhelia", "25","12","15","1861","9","4","88","2","12","0,48", "55%", "85%", R.drawable.regates,R.drawable.regates));
        duelos.add(new Duelo("Jugadores En Mejor Forma", R.drawable.rashford, R.drawable.premier, "Marcus Rashford", "36","24", "9","2700","7","5","85","5","8","0,66", "63%", "75%", R.drawable.osimhen, R.drawable.serie_a,"Victor Osimhen", "24","20","4","1854","3","11","80","2","3","0,83", "51%", "65%", R.drawable.faltas,R.drawable.faltas));
        duelos.add(new Duelo("Mejores Defensores", R.drawable.militao, R.drawable.liga_santander, "Éder Militão", "29","5", "0","2296","1","51","96","19","27","0,17", "40%", "60%", R.drawable.araujo, R.drawable.liga_santander,"Ronald Araújo", "17","1","1","1487","1","25","47","9","16","0,05", "30%", "55%", R.drawable.escudo,R.drawable.escudo));
        duelos.add(new Duelo("Mejor \nTodocampista", R.drawable.valverde, R.drawable.liga_santander, "Fede Valverde", "36","12", "4","2863","4","10","70","9","12","0,33", "45%", "70%", R.drawable.bellingham, R.drawable.bundesliga,"Jude Bellingham", "29","10","6","2463","7","19","178","26","28","0,34", "46%", "71%", R.drawable.todocampistas,R.drawable.todocampistas));
        duelos.add(new Duelo("Mejores \nDistribuidores", R.drawable.odegard, R.drawable.premier, "Martin Ødegaard", "29","8", "7","2113","6","7","73","3","13","0,27", "56%", "77%", R.drawable.kroos, R.drawable.liga_santander,"Toni Kroos", "31","2","4","2229","2","3","54","14","18","0,06", "42%", "70%", R.drawable.distribuidores,R.drawable.distribuidores));
        duelos.add(new Duelo("Mejor Balon Parado", R.drawable.ward_prowse, R.drawable.premier, "James Ward Prowse", "29","8", "2","2640","1","24","91","31","21","0,27", "57%", "61%", R.drawable.reece_james, R.drawable.premier,"Reece James", "15","2","2","1183","2","11","51","8","11","0,13", "66%", "60%", R.drawable.faltas,R.drawable.faltas));
        duelos.add(new Duelo("Mejores Laterales", R.drawable.hakimi, R.drawable.league1, "Achraf Hakimi", "31","4", "5","2194","3","15","76","9","40","0,12", "58%", "68%", R.drawable.cancelo, R.drawable.bundesliga,"Joao Cancelo", "31","2","7","2194","3","5","54","10","38","0,06", "56%", "68%", R.drawable.laterales,R.drawable.laterales));
        duelos.add(new Duelo("Mejores Promesas", R.drawable.garnacho, R.drawable.premier, "Alejandro Garnacho", "28","4", "6","1144","4","3","20","4","1","0,14", "64%", "74%", R.drawable.cherki, R.drawable.league1,"Ryan Cherki", "24","4","4","1128","6","2","60","3","5","0,16", "50%", "81%", R.drawable.promesas,R.drawable.promesas));

    }

    List<Duelo> obtener(){
        return duelos;
    }



}
