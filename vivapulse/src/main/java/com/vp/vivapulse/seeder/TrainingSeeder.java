package com.vp.vivapulse.seeder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

import com.vp.vivapulse.model.Training;
import com.vp.vivapulse.repository.TrainingRepository;
import org.springframework.stereotype.Component;




@Component
@Order(3)
public class TrainingSeeder implements CommandLineRunner {

    private final TrainingRepository trainingRepository;

    public TrainingSeeder(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (trainingRepository.count() == 0) {
            trainingRepository.save(new Training("Correr",  250, 2, "correr.jpg", "Cardio"));
            trainingRepository.save(new Training("Natación",  400, 3, "natacion.jpg", "Cardio"));
            trainingRepository.save(new Training("Ciclismo",  500, 3, "ciclismo.jpg", "Cardio"));
            trainingRepository.save(new Training("Yoga",  150, 1, "yoga.jpg", "Flexibilidad"));
            trainingRepository.save(new Training("Fútbol",  700, 4, "futbol.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Baloncesto", 600, 4, "baloncesto.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Senderismo", 800, 3, "senderismo.jpg", "Cardio"));
            trainingRepository.save(new Training("Boxeo", 350, 5, "boxeo.jpg", "Fuerza"));
            trainingRepository.save(new Training("Pilates", 200, 2, "pilates.jpg", "Flexibilidad"));
            trainingRepository.save(new Training("Crossfit", 450, 5, "crossfit.jpg", "Fuerza"));
            trainingRepository.save(new Training("Escalada", 600, 5, "escalada.jpg", "Fuerza"));
            trainingRepository.save(new Training("Remo", 350, 3, "remo.jpg", "Cardio"));
            trainingRepository.save(new Training("Patinaje", 300, 2, "patinaje.jpg", "Cardio"));
            trainingRepository.save(new Training("Golf", 400, 1, "golf.jpg", "Deporte de precisión"));
            trainingRepository.save(new Training("Tenis", 500, 4, "tenis.jpg", "Deporte de raqueta"));
            trainingRepository.save(new Training("Pádel", 480, 3, "padel.jpg", "Deporte de raqueta"));
            trainingRepository.save(new Training("Voleibol", 420, 3, "voleibol.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Bádminton", 350, 2, "badminton.jpg", "Deporte de raqueta"));
            trainingRepository.save(new Training("Esquí", 700, 5, "esqui.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Snowboard", 750, 5, "snowboard.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Surf", 400, 4, "surf.jpg", "Deporte de agua"));
            trainingRepository.save(new Training("Windsurf", 420, 4, "windsurf.jpg", "Deporte de agua"));
            trainingRepository.save(new Training("Kitesurf", 450, 5, "kitesurf.jpg", "Deporte de agua"));
            trainingRepository.save(new Training("Kayak", 350, 3, "kayak.jpg", "Deporte de agua"));
            trainingRepository.save(new Training("SUP", 320, 2, "sup.jpg", "Deporte de agua"));
            trainingRepository.save(new Training("Esgrima", 300, 3, "esgrima.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Judo", 500, 4, "judo.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Karate", 480, 4, "karate.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Taekwondo", 470, 4, "taekwondo.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Jiu-jitsu", 460, 4, "jiu_jitsu.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Aikido", 400, 3, "aikido.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Capoeira", 500, 4, "capoeira.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Parkour", 600, 5, "parkour.jpg", "Aventura"));
            trainingRepository.save(new Training("Breakdance", 550, 5, "breakdance.jpg", "Baile"));
            trainingRepository.save(new Training("Baile moderno", 400, 3, "baile_moderno.jpg", "Baile"));
            trainingRepository.save(new Training("Ballet", 350, 3, "ballet.jpg", "Baile"));
            trainingRepository.save(new Training("Zumba", 450, 3, "zumba.jpg", "Baile"));
            trainingRepository.save(new Training("Aeróbic", 420, 3, "aerobic.jpg", "Aeróbic"));
            trainingRepository.save(new Training("Step", 350, 2, "step.jpg", "Aeróbic"));
            trainingRepository.save(new Training("Spinning", 500, 4, "spinning.jpg", "Aeróbic"));
            trainingRepository.save(new Training("Body Pump", 550, 4, "body_pump.jpg", "Fuerza"));
            trainingRepository.save(new Training("TRX", 400, 4, "trx.jpg", "Fuerza"));
            trainingRepository.save(new Training("HIIT", 350, 5, "hiit.jpg", "Cardio"));
            trainingRepository.save(new Training("Tabata", 250, 5, "tabata.jpg", "Cardio"));
            trainingRepository.save(new Training("Calistenia", 500, 4, "calistenia.jpg", "Fuerza"));
            trainingRepository.save(new Training("Musculación", 400, 3, "musculacion.jpg", "Fuerza"));
            trainingRepository.save(new Training("Powerlifting", 450, 5, "powerlifting.jpg", "Fuerza"));
            trainingRepository.save(new Training("Halterofilia", 500, 5, "halterofilia.jpg", "Fuerza"));
            trainingRepository.save(new Training("Gimnasia artística", 400, 4, "gimnasia_artistica.jpg", "Gimnasia"));
            trainingRepository.save(new Training("Gimnasia rítmica", 350, 3, "gimnasia_ritmica.jpg", "Gimnasia"));
            trainingRepository.save(new Training("Marcha", 350, 2, "marcha.jpg", "Cardio"));
            trainingRepository.save(new Training("Senderismo de montaña", 1200, 5, "senderismo_montana.jpg", "Aventura"));
            trainingRepository.save(new Training("Trail running", 900, 5, "trail_running.jpg", "Cardio"));
            trainingRepository.save(new Training("Orientación", 400, 3, "orientacion.jpg", "Aventura"));
            trainingRepository.save(new Training("Escalada en roca", 700, 5, "escalada_roca.jpg", "Fuerza"));
            trainingRepository.save(new Training("Equitación", 350, 3, "equitacion.jpg", "Aventura"));
            trainingRepository.save(new Training("Tiro con arco", 250, 2, "tiro_con_arco.jpg", "Precisión"));
            trainingRepository.save(new Training("Paintball", 400, 3, "paintball.jpg", "Aventura"));
            trainingRepository.save(new Training("Airsoft", 350, 3, "airsoft.jpg", "Aventura"));
            trainingRepository.save(new Training("Espeleología", 900, 5, "espeleologia.jpg", "Aventura"));
            trainingRepository.save(new Training("Barranquismo", 1000, 5, "barranquismo.jpg", "Aventura"));
            trainingRepository.save(new Training("Rafting", 700, 5, "rafting.jpg", "Aventura"));
            trainingRepository.save(new Training("Pesca deportiva", 300, 1, "pesca_deportiva.jpg", "Deporte de precisión"));
            trainingRepository.save(new Training("Caza", 600, 2, "caza.jpg", "Caza"));
            trainingRepository.save(new Training("Patinaje sobre hielo", 400, 3, "patinaje_hielo.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Hockey sobre hielo", 600, 5, "hockey_hielo.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Rugby", 800, 5, "rugby.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Cricket", 600, 2, "cricket.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Béisbol", 500, 2, "beisbol.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Softbol", 480, 2, "softbol.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Squash", 500, 4, "squash.jpg", "Deporte de raqueta"));
            trainingRepository.save(new Training("Raquetbol", 480, 4, "raquetbol.jpg", "Deporte de raqueta"));
            trainingRepository.save(new Training("Polo", 600, 5, "polo.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Motocross", 400, 4, "motocross.jpg", "Motorsport"));
            trainingRepository.save(new Training("Karting", 350, 3, "karting.jpg", "Motorsport"));
            trainingRepository.save(new Training("Automovilismo", 500, 4, "automovilismo.jpg", "Motorsport"));
            trainingRepository.save(new Training("Motociclismo", 500, 4, "motociclismo.jpg", "Motorsport"));
            trainingRepository.save(new Training("Lucha libre", 600, 5, "lucha_libre.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Sumo", 400, 5, "sumo.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Kickboxing", 550, 5, "kickboxing.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Muay Thai", 600, 5, "muay_thai.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Snowboard freestyle", 700, 5, "snowboard_freestyle.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Snowboard alpino", 750, 5, "snowboard_alpino.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Patinaje artístico", 400, 4, "patinaje_artistico.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Patinaje de velocidad", 600, 5, "patinaje_velocidad.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Triatlón", 1200, 5, "triatlon.jpg", "Multideporte"));
            trainingRepository.save(new Training("Duatlón", 900, 5, "duatlon.jpg", "Multideporte"));
            trainingRepository.save(new Training("Marcha atlética", 350, 2, "marcha_atletica.jpg", "Marcha"));
            trainingRepository.save(new Training("Salto de longitud", 200, 3, "salto_longitud.jpg", "Atletismo"));
            trainingRepository.save(new Training("Salto de altura", 200, 3, "salto_altura.jpg", "Atletismo"));
            trainingRepository.save(new Training("Lanzamiento de peso", 250, 4, "lanzamiento_peso.jpg", "Atletismo"));
            trainingRepository.save(new Training("Lanzamiento de disco", 250, 4, "lanzamiento_disco.jpg", "Atletismo"));
            trainingRepository.save(new Training("Lanzamiento de martillo", 250, 4, "lanzamiento_martillo.jpg", "Atletismo"));
            trainingRepository.save(new Training("Lanzamiento de jabalina", 250, 4, "lanzamiento_jabalina.jpg", "Atletismo"));
            trainingRepository.save(new Training("Carrera de velocidad", 150, 4, "carrera_velocidad.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de fondo", 600, 5, "carrera_fondo.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de maratón", 2500, 5, "carrera_maraton.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de ultramaratón", 5000, 5, "carrera_ultramaraton.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de montaña", 1200, 5, "carrera_montana.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de orientación", 400, 3, "carrera_orientacion.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de trail", 900, 5, "carrera_trail.jpg", "Carrera"));
          

        } else {
            System.out.println("Aliments already seeded.");
        }
    }
}



