
public class Masajista extends Seleccion
{
    private String titulacion;
    private Integer tiempoExperiencia;
    
    public Masajista(Integer id, String nombre, Integer edad,String titulacion, Integer tiempoExperiencia)
    { 
        super(id, nombre, edad);
        this.titulacion=titulacion;
        this.tiempoExperiencia=tiempoExperiencia;
    }

    public String getTitulacion(){
    return this.titulacion;
    }

    public Integer getTiempoExperiencia(){
    return this.tiempoExperiencia;
    }
    
    public void setTitulacion(String titulacion){
    this.titulacion=titulacion;
    }
   
    public void setTiempoExperiencia(Integer tiempoExperiencia){
    this.tiempoExperiencia=tiempoExperiencia;
    }
    
    //Metodos analizadores
    
    public void realizarMasaje(){
        System.out.println("El masajista "+getNombre()+" realizo un masaje"); 
    }
}
