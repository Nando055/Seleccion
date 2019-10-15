
public class Seleccion
{
    private Integer id;
    private String nombre;
    private Integer edad;
    
    public Seleccion(Integer id, String nombre, Integer edad)
    {
      this.id=id;
      this.nombre=nombre;
      this.edad=edad;
    }
    
    public Integer getId(){
    return this.id;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
    public Integer getEdad(){
    return this.edad;
    }
    
    public void setId(Integer id){
    this.id=id;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public void setEdad(Integer edad){
    this.edad=edad;
    }
    
    //Metodos analizadores
    
    public void realizarConcentracion(){
        System.out.println("La seleccion realizo un espacio de concentracion");
    }
    
    public void realizarViaje(String ciudadDestino){
        System.out.println("La seleccion realizo un viaje hasta "+ciudadDestino);
    }
}
