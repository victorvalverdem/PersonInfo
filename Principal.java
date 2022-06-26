public class Principal {
  public static void main(String[] args){
    Persona p1 = new Persona();
    p1.nombre = "Victor";
    p1.cedula = 123;
    System.out.println(p1);
    p1.superheroe = "Batman";
    System.out.println(p1.superheroe);
    System.out.println(p1);
  }
}
