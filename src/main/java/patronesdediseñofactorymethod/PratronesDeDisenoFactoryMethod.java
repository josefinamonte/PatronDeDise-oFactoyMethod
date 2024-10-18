

package patronesdediseñofactorymethod;

/**
 *
 * juego utilizando el patrón de diseño Factory Method en Java. 
En este caso, crearemos un juego que contenga diferentes tipos
de enemigos y utilizaremos el patrón Factory Method para 
crear instancias de estos enemigos.

Finalmente, creamos una clase principal donde utilizamos las fábricas 
para crear instancias de los enemigos sin tener que conocer su lógica interna.
* 
* El patrón Factory Method es útil cuando queremos delegar la lógica específica 
sobre cómo se crean las instancias a las subclases o fábricas especializadas. 
En este ejemplo, hemos utilizado este patrón para encapsular la lógica 
relacionada con la creación de instancias específicas dentro de las fábricas 
correspondientes (DuendeFacoty y TrollFacoty).
De esta manera, podemos agregar nuevos tipos de enemigos simplemente agregando 
una nueva clase factory correspondiente sin modificar el código existente.
 */
public class PratronesDeDisenoFactoryMethod {

    public static void main(String[] args) {
 
      // Usar la fabrica del Duendes para crear un duende y llamar al método atacar.
      // Esto crea una instancia del duende sin necesidad 
      //de conocer los detalles internos de cómo se crea.
      EnemigoFactory DuendeFactory = new DuendeFactory();  
      Enemigo enemigoDuende = DuendeFactory.crearEnemigo();  
      enemigoDuende.ataque();
      
      

      // Usar la fabrica del troll para crear un troll y llamar al método atacar.
      // Esto crea una instancia del troll sin necesidad 
      //de conocer los detalles internos de cómo se crea.
      EnemigoFactory TrollFactory = new TrollFactory();   
      Enemigo enemigoTroll = TrollFactory.crearEnemigo();  
      enemigoTroll.ataque();

    }
}


