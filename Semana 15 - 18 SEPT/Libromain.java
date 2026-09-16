package sesion7;

public class Sesion7 {


    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("Dracula");
        libro1.setAutor("Hamlet");
        libro1.setGenero("Terror");
        libro1.setNumPaginas(458);
        
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getClass());
        System.out.println(libro1.getGenero());
        System.out.println(libro1.getNumPaginas());
        libro1.setAutor("Titulo modificado");
        System.out.println(libro1.getTitulo());
        
        System.out.println(" /n Detalle del libro");
        System.out.println(libro1.verDetalle());
        
        System.out.println(" /n Libro prestado a");
        System.out.println(libro1.prestar("Santiago"));
        
        System.out.println("/n Libro prestado y devuelto");
        System.out.println(libro1.prestarYDevolver("Santiago"));
        
        System.out.println(libro1.calcularTiempoLectura(30, 2.5f));
        
        
    }
    
}
