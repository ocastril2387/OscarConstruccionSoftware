
/**
 * Write a description of class Cuerpo here.
 * 
 * @author (Oscar Castrillon) 
 * @version (a version number or a date)
 */
public class Cuerpo
{
    private Partes_del_Cuerpo[] extremidades;
    
    public Cuerpo()
    {
        extremidades = new Partes_del_Cuerpo[3];
        extremidades[0] = new Brazos();
        extremidades[1] = new Manos ();
    }   
    
}
