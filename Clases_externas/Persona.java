package Clases_externas;
public class Persona{
    public String nombre;
    public String cedula;
    public String superheroe;
    public String sidekick;
    public String mascota;
    public String pareja;
  
    public String toString(){
        return "Datos: "+this.nombre+" "+this.cedula+" y su superhéroe favorito es "+this.superheroe+", mientras que su sidekick preferido es "+this.sidekick;  
  }
}
