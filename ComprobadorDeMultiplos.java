
/**
 * Clase que comprueba si un numoer es multiplo de otro 
 * mediante diversos metodos.
 * 
 * @author Mauro Gutierrez Tormo 
 * @version     0.1
 */
public class ComprobadorDeMultiplos
{
    public boolean esMultiploDe2 (int a) {
        boolean multiploDe2;
        int resultado = a % 2;
        if (a >= 2) {
            if (resultado == 0) {
                multiploDe2 = true;
            }
            else{
                multiploDe2 = false;
            }
        }
        else{
            multiploDe2 = false;
        }
        return multiploDe2;
    }
    public boolean esMultiploDe5 (int a) {
         boolean multiploDe5;
        int resultado = a % 5;
        if (a >= 5) {
            if (resultado == 0) {
                multiploDe5 = true;
            }
            else{
                multiploDe5 = false;
            }
        }
        else{
            multiploDe5 = false;
        }
        return multiploDe5;
    }
    public boolean esMultiploDe (int a, int b) {
         boolean esMultiploDe;
        if (a < b || b == 0 || a < 0 || b < 0) {
            esMultiploDe = false;
        }
        else{
            if (a % b == 0) {
                esMultiploDe = true;
            }
            else {
                esMultiploDe = false;
            }
        }
        return esMultiploDe;
    }    
}
