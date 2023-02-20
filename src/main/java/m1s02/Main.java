package m1s02;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

        // Criando instâncias do objeto Pet
            Pet pet1 = new Pet(" Buudy", " Shitzu", " Cachorro");
            Pet pet2 = new Pet(" Tyna", " Vira-lata", " Cachorro");
            Pet pet3 = new Pet(" Shiva", " Pitbull", " Cachorro");

        // Criando instâncias do objeto Tutor
            Tutor tutor1 = new Tutor(" Ericsson", 32);
            Tutor tutor2 = new Tutor(" Maria", 52);
            Tutor tutor3 = new Tutor(" Bruno", 30);

        // Adotando os Pets

            pet1.adotar(tutor1);
            pet2.adotar(tutor2);
            pet3.adotar(tutor3);

        // Pets método toString

            List<Pet> pets = new ArrayList<>();
            pets.add(pet1);
            pets.add(pet2);
            pets.add(pet3);

        //Tutores método toString

            List<Tutor> tutores = new ArrayList<>();
            tutores.add(tutor1);
            tutores.add(tutor2);
            tutores.add(tutor3);

            System.out.println("Lista dos Pets:");
            for (Pet pet : pets) {
                System.out.println(pet);
            }

            System.out.println("Lista dos Tutores:");
            for (Tutor tutor : tutores) {
                System.out.println(tutor);
            }
        }
    }
