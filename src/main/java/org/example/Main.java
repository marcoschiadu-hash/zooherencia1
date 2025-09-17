package org.example;
public class Main {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria();
        Perro perro = new Perro("Ares", new Collar("Rojo"));
        Gato gato = new Gato("VI");
        vet.atender(perro);  // poliformismo
        vet.atender(gato); // poliformismo
        Animal a = new Perro("Rocky", new Collar("Amarillo"));
        if (a instanceof Perro) {
            Perro p = (Perro) a; //dowcasting
        }

        Caja<Animal> caja = new Caja<>();
        caja.guardar(gato);
        Animal guardado = caja.obtener();
        vet.atender(guardado);


    }
}