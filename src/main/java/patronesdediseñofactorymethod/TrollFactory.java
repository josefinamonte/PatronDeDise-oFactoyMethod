
package patronesdediseñofactorymethod;

/**
 *
 * Fabrica que crea troll implementainterfaz enemigoFactory
 */

public class TrollFactory implements EnemigoFactory {
   @Override
   public Enemigo crearEnemigo() {     
       return new Troll();
   }
}
