
public class Entrenador  extends Seleccion
{
    private String federacion;
    
    public Entrenador(Integer id, String nombre, Integer edad, String federacion)
    {
        super(id,nombre,edad);
        this.federacion=federacion;
    }
    
    public String getfederacion(){
    return this.federacion;
    }
    
    public void setFederacion(String federacion){
    this.federacion=federacion;
    }

}
