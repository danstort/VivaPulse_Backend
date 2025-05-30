package com.vp.vivapulse.seeder;
import org.springframework.boot.CommandLineRunner;
import com.vp.vivapulse.model.Training;
import com.vp.vivapulse.repository.TrainingRepository;
import org.springframework.stereotype.Component;




@Component
public class TrainingSeeder implements CommandLineRunner {

    private final TrainingRepository trainingRepository;

    public TrainingSeeder(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (trainingRepository.count() == 0) {
            trainingRepository.save(new Training("Correr", 30, 250, 2, "correr.jpg", "Cardio"));
            trainingRepository.save(new Training("Natación", 45, 400, 3, "natacion.jpg", "Cardio"));
            trainingRepository.save(new Training("Ciclismo", 60, 500, 3, "ciclismo.jpg", "Cardio"));
            trainingRepository.save(new Training("Yoga", 40, 150, 1, "yoga.jpg", "Flexibilidad"));
            trainingRepository.save(new Training("Fútbol", 90, 700, 4, "futbol.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Baloncesto", 60, 600, 4, "baloncesto.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Senderismo", 120, 800, 3, "senderismo.jpg", "Cardio"));
            trainingRepository.save(new Training("Boxeo", 30, 350, 5, "boxeo.jpg", "Fuerza"));
            trainingRepository.save(new Training("Pilates", 50, 200, 2, "pilates.jpg", "Flexibilidad"));
            trainingRepository.save(new Training("Crossfit", 40, 450, 5, "crossfit.jpg", "Fuerza"));
            trainingRepository.save(new Training("Escalada", 60, 600, 5, "escalada.jpg", "Fuerza"));
            trainingRepository.save(new Training("Remo", 45, 350, 3, "remo.jpg", "Cardio"));
            trainingRepository.save(new Training("Patinaje", 50, 300, 2, "patinaje.jpg", "Cardio"));
            trainingRepository.save(new Training("Golf", 120, 400, 1, "golf.jpg", "Deporte de precisión"));
            trainingRepository.save(new Training("Tenis", 60, 500, 4, "tenis.jpg", "Deporte de raqueta"));
            trainingRepository.save(new Training("Pádel", 60, 480, 3, "padel.jpg", "Deporte de raqueta"));
            trainingRepository.save(new Training("Voleibol", 60, 420, 3, "voleibol.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Bádminton", 45, 350, 2, "badminton.jpg", "Deporte de raqueta"));
            trainingRepository.save(new Training("Esquí", 90, 700, 5, "esqui.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Snowboard", 90, 750, 5, "snowboard.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Surf", 60, 400, 4, "surf.jpg", "Deporte de agua"));
            trainingRepository.save(new Training("Windsurf", 60, 420, 4, "windsurf.jpg", "Deporte de agua"));
            trainingRepository.save(new Training("Kitesurf", 60, 450, 5, "kitesurf.jpg", "Deporte de agua"));
            trainingRepository.save(new Training("Kayak", 60, 350, 3, "kayak.jpg", "Deporte de agua"));
            trainingRepository.save(new Training("SUP", 60, 320, 2, "sup.jpg", "Deporte de agua"));
            trainingRepository.save(new Training("Esgrima", 45, 300, 3, "esgrima.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Judo", 60, 500, 4, "judo.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Karate", 60, 480, 4, "karate.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Taekwondo", 60, 470, 4, "taekwondo.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Jiu-jitsu", 60, 460, 4, "jiu_jitsu.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Aikido", 60, 400, 3, "aikido.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Capoeira", 60, 500, 4, "capoeira.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Parkour", 60, 600, 5, "parkour.jpg", "Aventura"));
            trainingRepository.save(new Training("Breakdance", 60, 550, 5, "breakdance.jpg", "Baile"));
            trainingRepository.save(new Training("Baile moderno", 60, 400, 3, "baile_moderno.jpg", "Baile"));
            trainingRepository.save(new Training("Ballet", 60, 350, 3, "ballet.jpg", "Baile"));
            trainingRepository.save(new Training("Zumba", 60, 450, 3, "zumba.jpg", "Baile"));
            trainingRepository.save(new Training("Aeróbic", 60, 420, 3, "aerobic.jpg", "Aeróbic"));
            trainingRepository.save(new Training("Step", 45, 350, 2, "step.jpg", "Aeróbic"));
            trainingRepository.save(new Training("Spinning", 45, 500, 4, "spinning.jpg", "Aeróbic"));
            trainingRepository.save(new Training("Body Pump", 60, 550, 4, "body_pump.jpg", "Fuerza"));
            trainingRepository.save(new Training("TRX", 45, 400, 4, "trx.jpg", "Fuerza"));
            trainingRepository.save(new Training("HIIT", 30, 350, 5, "hiit.jpg", "Cardio"));
            trainingRepository.save(new Training("Tabata", 20, 250, 5, "tabata.jpg", "Cardio"));
            trainingRepository.save(new Training("Calistenia", 60, 500, 4, "calistenia.jpg", "Fuerza"));
            trainingRepository.save(new Training("Musculación", 60, 400, 3, "musculacion.jpg", "Fuerza"));
            trainingRepository.save(new Training("Powerlifting", 60, 450, 5, "powerlifting.jpg", "Fuerza"));
            trainingRepository.save(new Training("Halterofilia", 60, 500, 5, "halterofilia.jpg", "Fuerza"));
            trainingRepository.save(new Training("Gimnasia artística", 60, 400, 4, "gimnasia_artistica.jpg", "Gimnasia"));
            trainingRepository.save(new Training("Gimnasia rítmica", 60, 350, 3, "gimnasia_ritmica.jpg", "Gimnasia"));
            trainingRepository.save(new Training("Marcha", 60, 350, 2, "marcha.jpg", "Cardio"));
            trainingRepository.save(new Training("Senderismo de montaña", 180, 1200, 5, "senderismo_montana.jpg", "Aventura"));
            trainingRepository.save(new Training("Trail running", 90, 900, 5, "trail_running.jpg", "Cardio"));
            trainingRepository.save(new Training("Orientación", 60, 400, 3, "orientacion.jpg", "Aventura"));
            trainingRepository.save(new Training("Escalada en roca", 90, 700, 5, "escalada_roca.jpg", "Fuerza"));
            trainingRepository.save(new Training("Equitación", 60, 350, 3, "equitacion.jpg", "Aventura"));
            trainingRepository.save(new Training("Tiro con arco", 60, 250, 2, "tiro_con_arco.jpg", "Precisión"));
            trainingRepository.save(new Training("Paintball", 60, 400, 3, "paintball.jpg", "Aventura"));
            trainingRepository.save(new Training("Airsoft", 60, 350, 3, "airsoft.jpg", "Aventura"));
            trainingRepository.save(new Training("Espeleología", 120, 900, 5, "espeleologia.jpg", "Aventura"));
            trainingRepository.save(new Training("Barranquismo", 120, 1000, 5, "barranquismo.jpg", "Aventura"));
            trainingRepository.save(new Training("Rafting", 90, 700, 5, "rafting.jpg", "Aventura"));
            trainingRepository.save(new Training("Pesca deportiva", 120, 300, 1, "pesca_deportiva.jpg", "Deporte de precisión"));
            trainingRepository.save(new Training("Caza", 180, 600, 2, "caza.jpg", "Caza"));
            trainingRepository.save(new Training("Patinaje sobre hielo", 60, 400, 3, "patinaje_hielo.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Hockey sobre hielo", 60, 600, 5, "hockey_hielo.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Rugby", 80, 800, 5, "rugby.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Cricket", 180, 600, 2, "cricket.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Béisbol", 120, 500, 2, "beisbol.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Softbol", 120, 480, 2, "softbol.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Squash", 45, 500, 4, "squash.jpg", "Deporte de raqueta"));
            trainingRepository.save(new Training("Raquetbol", 45, 480, 4, "raquetbol.jpg", "Deporte de raqueta"));
            trainingRepository.save(new Training("Polo", 60, 600, 5, "polo.jpg", "Deporte de equipo"));
            trainingRepository.save(new Training("Motocross", 60, 400, 4, "motocross.jpg", "Motorsport"));
            trainingRepository.save(new Training("Karting", 60, 350, 3, "karting.jpg", "Motorsport"));
            trainingRepository.save(new Training("Automovilismo", 90, 500, 4, "automovilismo.jpg", "Motorsport"));
            trainingRepository.save(new Training("Motociclismo", 90, 500, 4, "motociclismo.jpg", "Motorsport"));
            trainingRepository.save(new Training("Lucha libre", 60, 600, 5, "lucha_libre.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Sumo", 30, 400, 5, "sumo.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Kickboxing", 60, 550, 5, "kickboxing.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Muay Thai", 60, 600, 5, "muay_thai.jpg", "Deporte de combate"));
            trainingRepository.save(new Training("Snowboard freestyle", 60, 700, 5, "snowboard_freestyle.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Snowboard alpino", 60, 750, 5, "snowboard_alpino.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Patinaje artístico", 60, 400, 4, "patinaje_artistico.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Patinaje de velocidad", 60, 600, 5, "patinaje_velocidad.jpg", "Deporte de invierno"));
            trainingRepository.save(new Training("Triatlón", 120, 1200, 5, "triatlon.jpg", "Multideporte"));
            trainingRepository.save(new Training("Duatlón", 90, 900, 5, "duatlon.jpg", "Multideporte"));
            trainingRepository.save(new Training("Marcha atlética", 60, 350, 2, "marcha_atletica.jpg", "Marcha"));
            trainingRepository.save(new Training("Salto de longitud", 30, 200, 3, "salto_longitud.jpg", "Atletismo"));
            trainingRepository.save(new Training("Salto de altura", 30, 200, 3, "salto_altura.jpg", "Atletismo"));
            trainingRepository.save(new Training("Lanzamiento de peso", 30, 250, 4, "lanzamiento_peso.jpg", "Atletismo"));
            trainingRepository.save(new Training("Lanzamiento de disco", 30, 250, 4, "lanzamiento_disco.jpg", "Atletismo"));
            trainingRepository.save(new Training("Lanzamiento de martillo", 30, 250, 4, "lanzamiento_martillo.jpg", "Atletismo"));
            trainingRepository.save(new Training("Lanzamiento de jabalina", 30, 250, 4, "lanzamiento_jabalina.jpg", "Atletismo"));
            trainingRepository.save(new Training("Carrera de velocidad", 15, 150, 4, "carrera_velocidad.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de fondo", 60, 600, 5, "carrera_fondo.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de maratón", 240, 2500, 5, "carrera_maraton.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de ultramaratón", 480, 5000, 5, "carrera_ultramaraton.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de montaña", 120, 1200, 5, "carrera_montana.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de orientación", 60, 400, 3, "carrera_orientacion.jpg", "Carrera"));
            trainingRepository.save(new Training("Carrera de trail", 90, 900, 5, "carrera_trail.jpg", "Carrera"));
          

        } else {
            System.out.println("Aliments already seeded.");
        }
    }
}



