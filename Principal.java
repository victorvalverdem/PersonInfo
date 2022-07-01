import Clases_externas.Persona;
public class Principal{
    public static void main(String[] args){
        Persona p1 = new Persona();
        p1.nombre = "Victor";
        p1.cedula = "567";
        p1.superheroe = "Daredevil";
        p1.villano = "Doom";
        System.out.println(p1);
        
    }
}
