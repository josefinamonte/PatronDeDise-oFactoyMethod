
package patronesdediseñofactorymethod;

/**
 *
 Luego, crearemos clases concretas que implementen la interfaz `Enemigo`, por ejemplo:
 */

public class Duende implements Enemigo {
    @Override
    public void ataque() {
        System.out.println("Duende esta atacando!");
    }
}

