package com.mycompany.proyectopoo.repositorio;

import com.mycompany.proyectopoo.model.Pelicula;
import com.mycompany.proyectopoo.model.Serie;
import java.util.ArrayList;


public class Registros {
    
    private ArrayList<Pelicula> peliculas = new ArrayList<>();
    private ArrayList<Serie> series = new ArrayList<>();
    
    public Registros() {
        series.add(new Serie(0,
                "Woo, abogada extraordinaria",
                "Woo Young-woo, una brillante abogada con autismo, lidia con los retos que le plantean la vida cotidiana y los tribunales "
                        + "cuando se incorpora a un importante bufete.",
                70,
                "Drama",
                "src/main/java/imagenes/woo.jpg",
                1,
                16));
        series.add(new Serie(0,
                "Stranger Things 4",
                "La historia se retoma seis meses después de la batalla en el centro comercial Starcourt, que trajo terror y destrucción a Hawkins. "
                        + "Luchando contra las secuelas, nuestro grupo de amigos está separado por primera vez y tiene que afrontar las complejidades "
                        + "del instituto, lo que no les pone las cosas nada fáciles. ",
                75,
                "Aventura",
                "src/main/java/imagenes/stranger.jpg",
                5, 
                42));
        series.add(new Serie(0,
                "Pachinko ",
                "Narra la historia épica e íntima que comienza con un amor prohibido y va creciendo hasta convertirse en una saga que viaja "
                        + "entre Corea, Japón y Estados Unidos para contar un relato de guerra y paz, amor y pérdida, triunfo y ajuste de cuentas.",
                55,
                "Drama",
                "src/main/java/imagenes/pachinko.jpg",
                2, 
                8 ));
        
        series.add(new Serie(0,
                "Esterno notte ",
                "1978, Italia se encuentra desgarrada por una guerra: el primer gobierno respaldado por un partido comunista (PCI) de la historia"
                        + " de un país occidental está a punto de llegar al poder a través de una alianza histórica con el bastión tradicional del "
                        + "conservadurismo de la nación, la Democracia Cristiana (DC). Aldo Moro, presidente de la DC, es el principal partidario de este acuerdo. ",
                300,
                "Histórico",
                "src/main/java/imagenes/esterno.jpg",
                1, 
                6));
        series.add(new Serie(0,
                "The Walking Dead",
                "Tras un apocalipsis zombie, un grupo de supervivientes, dirigidos por el policía Rick Grimes, recorre los Estados Unidos para ponerse a salvo. ",
                45,
                "Ciencia ficción", 
                "src/main/java/imagenes/walking.jpg",
                11, 
                77));
        series.add(new Serie(0,
                "Separación",
                "Mark Scout (Adam Scott) dirige un equipo en Lumon Industries, cuyos empleados se han sometido a un procedimiento quirúrgico que separa"
                        + " sus recuerdos entre su ámbito laboral y su vida personal. ",
                45,
                "Thriller", 
                "src/main/java/imagenes/separacion.jpg",
               2, 
                9));
        /*series.add(new Serie(0,
                "Chainsaw Man ",
                "Denji es un joven pobre que haría cualquier cosa por dinero, incluso perseguir demonios con su perro diabólico Pochita. Es una persona "
                        + "simple, con sueños simples, que se está ahogando en una montaña de deudas. ",
                22,
                "Fantasia",
                "src/main/java/imagenes/chain.jpg",
                1, 
                12));*/
        
        peliculas.add(new Pelicula(
                0,
                "Verdens verste menneske",
                "Julie va a cumplir los treinta y su vida es un desastre existencial. Ya ha desperdiciado parte de su talento y su novio Aksel, "
                        + "un exitoso novelista gráfico mayor que ella, la presiona para que contenga su energía creativa y siente la cabeza. ",
                138,
                "Romance", 
            "src/main/java/imagenes/verdens.jpg"));
        
        peliculas.add(new Pelicula(
                0,
                "Drive My Car",
                "Pese a no ser capaz de recuperarse de un drama personal, Yusuke Kafuku, actor y director de teatro, acepta montar la obra \"Tío Vania\" "
                        + "en un festival de Hiroshima. Allí, conoce a Misaki, una joven reservada que le han asignado como chófer. A medida que pasan los "
                        + "trayectos, la sinceridad creciente de sus conversaciones les obliga a enfrentarse a su pasado.",
                179,
                "Drama",
                "src/main/java/imagenes/drivercar.jpg"));
        peliculas.add(new Pelicula(
                0,
                "Les choses humaines",
                "Los Farel son una pareja poderosa: Jean es un destacado experto francés y su esposa Claire una ensayista conocida por su feminismo radical. "
                        + "Juntos tienen un hijo ejemplar, Alexandre, que estudia en una prestigiosa universidad estadounidense.  ",
                138,
                "Drama",
                "src/main/java/imagenes/les.jpg"));
        peliculas.add(new Pelicula(
                0,
                "La ley de Teherán",
                "La ley de Teherán nos cuenta la feroz persecución de un policía para atrapar a un escurridizo narcotraficante. El aumento de toxicómanos"
                        + " y su deplorable situación es el motor que lleva al protagonista también a una encarnizada lucha con un sistema legal que ofrece muy pocas garantías.",
                139,
                "Thriller",
                "src/main/java/imagenes/teheran.jpg"));
        peliculas.add(new Pelicula(
                0,
                "París, Distrito 13",
                "París, distrito 13, barrio de Les Olympiades. Émilie conoce a Camille, que se siente atraído por Nora, que, a vez, se cruza en el camino "
                        + "de Amber. Tres chicas y un chico. Son amigos, a veces amantes, y a menudo las dos cosas. ",
                106,
                "Drama",
                "src/main/java/imagenes/paris13.jpg"));
        peliculas.add(new Pelicula(
                0,
                "¡Nop!",
                "Dos residentes de un solitario barranco en el interior de California realizan un descubrimiento tan insólito como escalofriante. ",
                130,
                "Terror",
                "src/main/java/imagenes/nop.jpg"));
        peliculas.add(new Pelicula(
                0,
                "Un monde",
                "Nora entra en primaria y poco después descubre el acoso que sufre su hermano mayor, Abel. Nora se debate entre la necesidad "
                        + "de integrarse y su hermano, que le pide que guarde silencio.",
                72,
                "Familia",
                "src/main/java/imagenes/monde.jpg"));
        /*peliculas.add(new Pelicula(
                0,
                "Toy Story 3",
                "Cuando su dueño Andy se prepara para ir a la universidad, el vaquero Woody, el astronauta Buzz y el resto de sus amigos juguetes "
                        + "comienzan a preocuparse por su incierto futuro. ",
                103,
                "Aventuras",
                "src/main/java/imagenes/toy.jpg"));
        peliculas.add(new Pelicula(
                0,
                "Top Gun: Maverick",
                "Después de más de treinta años de servicio como uno de los mejores aviadores de la Armada, Pete \"Mavericks\" Mitchel (Tom Cruise) "
                        + "se encuentra donde siempre quiso estar: superando los límites como un valiente piloto de pruebas y esquivando el ascenso de rango, "
                        + "que no le dejaría volar emplazándolo en tierra. ",
                131,
                "Acción",
                "src/main/java/imagenes/top.jpg"));
        peliculas.add(new Pelicula(
                0,
                "Black Panther",
                "Situada después de los eventos de Capitán América: Civil War, T'Challa, hijo del fallecido rey T'Chaka, asciende al trono de Wakanda y se "
                        + "convierte en Pantera Negra, pero descubre que reinar su nación será un desafío para él, ya que no solo debe gobernar y proteger su "
                        + "país, sino también derrotar a un viejo enemigo del pasado, que amenaza a todo el mundo. ",
                134,
                "Acción",
                "src/main/java/imagenes/panther.jpg"));*/
        
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    
    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setPeliculas(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void setSeries(Serie serie) {
        series.add(serie);
    }
}
