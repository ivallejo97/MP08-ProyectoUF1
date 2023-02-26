package com.example.mp08_proyectouf1;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class ListaNoticias {

    List<Noticia> noticias = new ArrayList<>();

    interface Callback {
        void terminar(List<Noticia> noticias);
    }

    ListaNoticias(){
        noticias.add(new Noticia(R.drawable.fondo_dybala, "Dybala y Spinazzola lideran a la Roma hacia octavos", "Tenía que levantar la Roma el 1-0 del partido de ida ante el Salzburgo y los de Mourinho salieron desde el primer minuto a por ello. Como un rodillo empezaron los italianos, mientras que los austriacos no se enteraban de qué iba el tema. Dybala, que se recuperó a tiempo de la lesión muscular del partido de ida, estaba con la flechita para arriba.\n\nEl argentino, además, se encontró con un compañero que también estaba 'on fire'. Spinazzola se iba por su banda cómo y cuando quería. Así llegó el primer tanto, a los 33 minutos. El italiano arrancó la moto y en línea de fondo sacó un gran centro para que Belotti, en el área pequeña, rematase de cabeza el 1-0. Los jugadores del Salzburgo pedían mano en el remate, pero el colegiado concedió el tanto. Era justo que la Roma fuese ganando porque estaba siendo muy superior. No bajó el pistón el conjunto de Mourinho, apretando en cada jugada y robando en campo rival .El Salzburgo era una marioneta en manos de los italianos. Siete minutos después del 1-0 llegó la sentencia. Otra vez Spinazzola hizo una gran jugada por banda para poner una perfecta pelota a Dybala, que remató con mucha clase a la red. Era el minuto 40.\n" +
                "\n" +
                "Antes del descanso quedaba el partido sentenciado, pero no la eliminatoria puesto que con un gol el Salzburgo forzaba la prórroga. Hasta el descanso no pasó mucho más. Los austriacos estaban deseando irse a la caseta para frenar el tsunami de la Roma.\n" +
                "\n" +
                "En la segunda mitad hubo menos ocasiones. La Roma no apretó tanto como antes del entretiempo, consciente de que estaba por delante en el marcador y que tenía que limitarse a mantener el 2-0 para seguir en Europa League.\n Con Dybala y Spinazzola a los mandos, los de Mou controlaron el juego y pudieron hacer algún gol más. Pero no llegó el 3-0 y el Salzburgo confiaba en que llegase la jugada del 2-1. Apretaron de lo lindo los visitantes hasta el final, encerrando en ocasiones a la Roma. Pero llegó el pitido final sin que se moviese el electrónico. La Roma le dio la vuelta al 1-0 de la ida y se mete en octavos de Europa League.", R.drawable.logo_marca, "Marca", "Hace 35 minutos",  R.drawable.dybala_cara, "Paulo Dybala", R.drawable.roma, "Roma" ));

        noticias.add(new Noticia(R.drawable.fondo_camavinga, "Camavinga pide sitio en Anfield", "El Real Madrid piensa ya en el partido ante el Liverpool y una de las decisiones más comprometidas de Ancelotti está en el medio campo. Camavinga, ante la baja de Tchouaméni de última hora, volvió al mediocentro, donde mejor se siente, y con un partido más que notable se postuló para el encuentro de Champions del próximo martes\n\nY es que las señales no pudieron ser más positivas. Camavimga se hizo con el control del medio del campo en un escenario siempre hostil y ante un rival que aprieta de lo lindo. Y la verdad que en la faceta defensiva siempre estuvo en su sitio y a la hora de sacar la pelota jugada fue también una bendición para el equipo ante la presión alta del equipo de Arrasate.", R.drawable.logo_fa, "Football Analythics", "Hace 35 minutos",  R.drawable.camavinga_cara, "Eduardo Camavinga", R.drawable.real_madrid, "Real Madrid" ));
        noticias.add(new Noticia(R.drawable.noticia_joselu, "Joselu, cada dia mas cerca del trofeo Zarra", "Nadie más ha llegado a la decena de goles en las últimas cuatro Ligas. Es el más veloz en el Espanyol desde Marañón. Y la IA lo reafirma no solo como artillero, sino como el mejor delantero español.\n\nNo lo logró el insaciable Raúl Tamudo, acaso el futbolista más decisivo en la historia del Espanyol. Tampoco Sergio García. Ni Dani Osvaldo, Jordi Lardín, Luis García, Gerard Moreno o Michel Pineda. Nadie en Primera en la era RCDE Stadium, ni en Montjuïc, llevaba tantos goles a estas alturas en el Espanyol como los diez que suma Joselu Mato, indiscutible sostén de un conjunto perico que ha olvidado muchísimo más pronto de lo imaginado a su anterior artillero, Raúl de Tomás.", R.drawable.logo_as, "Diario AS", "Hace 1 hora",  R.drawable.joselu, "Joselu Mato", R.drawable.espanyol, "RCD Espanyol" ));
        noticias.add(new Noticia(R.drawable.noticia_haaland, "Haaland no para, otro hat trick y va a por el record de la premier", "La sequía de Erling Haaland ya es historia. El delantero noruego terminó con sus tres partidos sin ver puerta en el triunfo (4-2) frente al Tottenham y se desató ante el Wolverhampton. Firmó un 'hat-trick' en 54 minutos antes de ser sustituido por Pep Guardiola a la hora de encuentro que ganaron (3-0) a los 'Wolves'. Se fue con gesto serio. Quería más tras un triplete de cabeza, de penalti y aprovechando un 'regalo' de Mahrez con el que se disparó como 'pichichi' de la Liga inglesa con 25 goles en 19 partidos.", R.drawable.logo_fa, "Football Analythics", "Hace 20 horas", R.drawable.haaland_cara, "Erling Haaland", R.drawable.manchester_city, "Manchester City" ));
        noticias.add(new Noticia(R.drawable.noticia_rodrygo, "Rodrygo Goes, el chico de las remontadas en el Real Madrid lo ha vuelto ha hacer", "Está tocado por la varita. El hombre de las remontadas es, en realidad, tan solo un niño. Rodrygo Goes ha vuelto a salir al rescate del Real Madrid, con el equipo de Carlo Ancelotti perdiendo 0-1 el derbi de la capital española. Y apareció otra vez, como en las grandes noches de la Champions League 2021-22, para igualar el encuentro frente al Atlético de Madrid.\n\nNada más que 10 minutos le llevó al delantero de 22 años salvar los muebles. Saltó al campo en el minuto 69 reemplazando a Fede Valverde, y en el '79 se inventó un gol antológico para igualar una eliminatoria que el Madrid perdía desde la primera parte por el gol de Álvaro Morata.\n\nComo si estuviera jugando en las playas de Copacabana, el joven atacante blanco apareció por dentro sorteando a hasta cinco rivales del Atlético de Madrid y se metió dentro del área para batir a Jan Oblak por el palo corto y con el exterior de su bota derecha. Un terrible golazo que pasará a la historia de los derbis de Madrid.", R.drawable.logo_onefootball, "OneFootball", "Hace 10 horas", R.drawable.rodrygo_cara, "Rodrygo Goes", R.drawable.real_madrid, "Real Madrid" ));
        noticias.add(new Noticia(R.drawable.noticia_remiro, "Remiro estropea la mejoría", "Hay pinchazos que no merecen disculpas. Si acaso, el reproche menor por la falta de templanza en el momento de la verdad. El Madrid jugó a lo grande, para ganar, mucho mejor de lo que lo ha hecho en la mayoría de sus victorias de esta temporada, empequeñeció a la Real, puso nervio, velocidad a la circulación y precisión en el pase. No fue suficiente ante un portero acertadísimo, Remiro, que le sacó tres mano a mano a Vinicius. Partidos así se marchan sin más explicación que el acierto ajeno, que no es consuelo cuando el Barça, jugando peor, anda ya a cinco puntos. El equipo de Imanol, aun inferior, también tuvo respuesta (especialmente de Kubo, que dejó el mensaje de que quiere volver). La tiene en todos los campos y en todas las circunstancias, algunas adversas, y eso le hace candidato a todo.\n\nNo cuajó nada porque la Real también sabe actuar en defensa propia (es el equipo que más faltas comete en la Liga) y porque tiene un portero solvente, Remiro, siempre bien colocado, que le ganó por la mano a Vinicius un cara a cara. El Madrid no se llevó nada a la boca en la primera parte pero dejó una imagen de equipo recuperado del KO en la Supercopa.", R.drawable.logo_marca, "Marca", "Hace 10 horas", R.drawable.remiro_cara, "Aléx Remiro", R.drawable.real_sociedad, "Real Sociedad" ));
    }

    List<Noticia> obtener() {
        return noticias;
    }


}