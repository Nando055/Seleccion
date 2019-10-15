
public class Futbolista extends Seleccion
{
    private Integer dorsal;
    private String posicion;
    
    public Futbolista(Integer id, String nombre, Integer edad,Integer dorsal, String posicion)
    {
        super(id, nombre, edad);
        this.dorsal=dorsal;
        this.posicion=posicion;
    }
    
    public Integer getDorsal(){
    return this.dorsal;
    }
    
    public String getPosicion(){
    return this.posicion;
    }
    
    public void setDorsal(Integer dorsal){
    this.dorsal=dorsal;
    }
    
    public void setPosicion(String posicion){
    this.posicion=posicion;
    }
    
    //Metodos analizadores
    
    public void jugarPartido(){
        System.out.println("El jugador "+getNombre()+"jugo un partido");
    }
    
    public void entrenar(Entrenador entrenador){
        System.out.println("El jugador "+getNombre()+"hizo su entrenamiento diario a cargo de "+entrenador.getNombre());
    }
}
