
package patronesdediseñofactorymethod;

/**
 *
 Luego, implementaremos la clase `DuendeFactory` y `TrollFactory` 
como fábricas concretas que implementan la interfaz `EnenigoFactory`:
 */

public class DuendeFactory implements EnemigoFactory {
   @Override
   public Enemigo crearEnemigo() {    
       return new Duende();
   }
}