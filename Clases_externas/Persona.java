package Clases_externas;
public class Persona{
    public String nombre;
    public int cedula;
    public String superheroe;
    public String villano;
  
    public String toString(){
        return "Datos: "+this.nombre+" "+this.cedula+" y su superhéroe favorito es "+this.superheroe+", mientras que su villano preferido es "+this.villano;  
  }
}
