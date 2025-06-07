package com.vp.vivapulse.seeder;

import com.vp.vivapulse.model.Aliment;
import com.vp.vivapulse.repository.AlimentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;




@Component
@Order(2)
public class AlimentSeeder implements CommandLineRunner {

    private final AlimentRepository alimentRepository;

    public AlimentSeeder(AlimentRepository alimentRepository) {
        this.alimentRepository = alimentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (alimentRepository.count() == 0) {
            alimentRepository.save(new Aliment("Manzana", 52, "manzana.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Banana", 89, "banana.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Naranja", 47, "naranja.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Pera", 57, "pera.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Sandía", 30, "sandia.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Melón", 34, "melon.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Uvas", 69, "uvas.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Fresa", 33, "fresa.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Piña", 50, "pina.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Mango", 60, "mango.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Kiwi", 41, "kiwi.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Cereza", 50, "cereza.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Limón", 29, "limon.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Mandarina", 53, "mandarina.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Papaya", 43, "papaya.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Melocotón", 39, "melocoton.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Ciruela", 46, "ciruela.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Albaricoque", 48, "albaricoque.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Higo", 74, "higo.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Granada", 83, "granada.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Arándano", 57, "arandano.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Mora", 43, "mora.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Frambuesa", 52, "frambuesa.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Pomelo", 42, "pomelo.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Coco", 354, "coco.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Aguacate", 160, "aguacate.jpg", "Fruta"));
            alimentRepository.save(new Aliment("Tomate", 18, "tomate.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Pepino", 16, "pepino.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Lechuga", 15, "lechuga.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Espinaca", 23, "espinaca.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Zanahoria", 41, "zanahoria.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Brócoli", 34, "brocoli.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Coliflor", 25, "coliflor.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Calabacín", 17, "calabacin.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Berenjena", 25, "berenjena.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Pimiento", 31, "pimiento.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Cebolla", 40, "cebolla.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Ajo", 149, "ajo.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Patata", 77, "patata.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Batata", 86, "batata.jpg", "Verdura"));
            alimentRepository.save(new Aliment("Maíz", 86, "maiz.jpg", "Cereal"));
            alimentRepository.save(new Aliment("Guisante", 81, "guisante.jpg", "Legumbre"));
            alimentRepository.save(new Aliment("Lenteja", 116, "lenteja.jpg", "Legumbre"));
            alimentRepository.save(new Aliment("Garbanzos", 164, "garbanzos.jpg", "Legumbre"));
            alimentRepository.save(new Aliment("Judía verde", 31, "judia_verde.jpg", "Legumbre"));
            alimentRepository.save(new Aliment("Arroz blanco", 130, "arroz_blanco.jpg", "Cereal"));
            alimentRepository.save(new Aliment("Arroz integral", 111, "arroz_integral.jpg", "Cereal"));
            alimentRepository.save(new Aliment("Pasta", 131, "pasta.jpg", "Cereal"));
            alimentRepository.save(new Aliment("Pan blanco", 265, "pan_blanco.jpg", "Panadería"));
            alimentRepository.save(new Aliment("Pan integral", 247, "pan_integral.jpg", "Panadería"));
            alimentRepository.save(new Aliment("Tortilla de trigo", 218, "tortilla_trigo.jpg", "Panadería"));
            alimentRepository.save(new Aliment("Pizza", 266, "pizza.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Hamburguesa", 295, "hamburguesa.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Hot Dog", 290, "hot_dog.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Pollo asado", 239, "pollo_asado.jpg", "Carne"));
            alimentRepository.save(new Aliment("Pavo", 189, "pavo.jpg", "Carne"));
            alimentRepository.save(new Aliment("Ternera", 250, "ternera.jpg", "Carne"));
            alimentRepository.save(new Aliment("Cerdo", 242, "cerdo.jpg", "Carne"));
            alimentRepository.save(new Aliment("Cordero", 294, "cordero.jpg", "Carne"));
            alimentRepository.save(new Aliment("Salmón", 208, "salmón.jpg", "Pescado"));
            alimentRepository.save(new Aliment("Atún", 132, "atun.jpg", "Pescado"));
            alimentRepository.save(new Aliment("Sardina", 208, "sardina.jpg", "Pescado"));
            alimentRepository.save(new Aliment("Bacalao", 82, "bacalao.jpg", "Pescado"));
            alimentRepository.save(new Aliment("Merluza", 72, "merluza.jpg", "Pescado"));
            alimentRepository.save(new Aliment("Gamba", 99, "gamba.jpg", "Marisco"));
            alimentRepository.save(new Aliment("Langostino", 106, "langostino.jpg", "Marisco"));
            alimentRepository.save(new Aliment("Calamar", 92, "calamar.jpg", "Marisco"));
            alimentRepository.save(new Aliment("Pulpo", 82, "pulpo.jpg", "Marisco"));
            alimentRepository.save(new Aliment("Huevo", 155, "huevo.jpg", "Huevo"));
            alimentRepository.save(new Aliment("Queso", 402, "queso.jpg", "Lácteo"));
            alimentRepository.save(new Aliment("Leche entera", 61, "leche_entera.jpg", "Lácteo"));
            alimentRepository.save(new Aliment("Leche desnatada", 35, "leche_desnatada.jpg", "Lácteo"));
            alimentRepository.save(new Aliment("Yogur natural", 59, "yogur_natural.jpg", "Lácteo"));
            alimentRepository.save(new Aliment("Mantequilla", 717, "mantequilla.jpg", "Lácteo"));
            alimentRepository.save(new Aliment("Aceite de oliva", 884, "aceite_oliva.jpg", "Aceite"));
            alimentRepository.save(new Aliment("Aceite de girasol", 884, "aceite_girasol.jpg", "Aceite"));
            alimentRepository.save(new Aliment("Margarina", 717, "margarina.jpg", "Lácteo"));
            alimentRepository.save(new Aliment("Nuez", 654, "nuez.jpg", "Fruto seco"));
            alimentRepository.save(new Aliment("Almendra", 579, "almendra.jpg", "Fruto seco"));
            alimentRepository.save(new Aliment("Avellana", 628, "avellana.jpg", "Fruto seco"));
            alimentRepository.save(new Aliment("Cacahuete", 567, "cacahuete.jpg", "Fruto seco"));
            alimentRepository.save(new Aliment("Pistacho", 562, "pistacho.jpg", "Fruto seco"));
            alimentRepository.save(new Aliment("Anacardo", 553, "anacardo.jpg", "Fruto seco"));
            alimentRepository.save(new Aliment("Semilla de girasol", 584, "semilla_girasol.jpg", "Semilla"));
            alimentRepository.save(new Aliment("Semilla de calabaza", 559, "semilla_calabaza.jpg", "Semilla"));
            alimentRepository.save(new Aliment("Chocolate negro", 546, "chocolate_negro.jpg", "Dulce"));
            alimentRepository.save(new Aliment("Chocolate con leche", 535, "chocolate_con_leche.jpg", "Dulce"));
            alimentRepository.save(new Aliment("Galleta", 502, "galleta.jpg", "Dulce"));
            alimentRepository.save(new Aliment("Croissant", 406, "croissant.jpg", "Panadería"));
            alimentRepository.save(new Aliment("Donut", 452, "donut.jpg", "Dulce"));
            alimentRepository.save(new Aliment("Helado de vainilla", 207, "helado_vainilla.jpg", "Dulce"));
            alimentRepository.save(new Aliment("Tarta de queso", 321, "tarta_queso.jpg", "Dulce"));
            alimentRepository.save(new Aliment("Bizcocho", 297, "bizcocho.jpg", "Dulce"));
            alimentRepository.save(new Aliment("Churro", 447, "churro.jpg", "Dulce"));
            alimentRepository.save(new Aliment("Tortilla española", 154, "tortilla_espanola.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Paella", 158, "paella.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Gazpacho", 44, "gazpacho.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Cocido", 150, "cocido.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Fabada", 168, "fabada.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Lasaña", 135, "lasana.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Sopa de pollo", 36, "sopa_pollo.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Sopa de verduras", 27, "sopa_verduras.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Ensalada mixta", 21, "ensalada_mixta.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Ensaladilla rusa", 197, "ensaladilla_rusa.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Empanada", 285, "empanada.jpg", "Panadería"));
            alimentRepository.save(new Aliment("Empanadilla", 267, "empanadilla.jpg", "Panadería"));
            alimentRepository.save(new Aliment("Tortilla francesa", 154, "tortilla_francesa.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Huevos revueltos", 148, "huevos_revueltos.jpg", "Plato preparado"));
            alimentRepository.save(new Aliment("Bacon", 541, "bacon.jpg", "Carne"));
            alimentRepository.save(new Aliment("Salchicha", 301, "salchicha.jpg", "Carne"));
            alimentRepository.save(new Aliment("Chorizo", 455, "chorizo.jpg", "Carne"));
            alimentRepository.save(new Aliment("Morcilla", 379, "morcilla.jpg", "Carne"));
            alimentRepository.save(new Aliment("Salami", 336, "salami.jpg", "Carne"));
            alimentRepository.save(new Aliment("Té", 1, "te.jpg", "Bebida"));
            alimentRepository.save(new Aliment("Infusión", 1, "infusion.jpg", "Bebida"));
            alimentRepository.save(new Aliment("Zumo de naranja", 45, "zumo_naranja.jpg", "Bebida"));
            alimentRepository.save(new Aliment("Zumo de manzana", 46, "zumo_manzana.jpg", "Bebida"));
            alimentRepository.save(new Aliment("Refresco de cola", 42, "refresco_cola.jpg", "Bebida"));
           
        } else {
            System.out.println("Aliments already seeded.");
        }
    }
}
