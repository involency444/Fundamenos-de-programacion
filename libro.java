package estudiante; // Indica el paquete al que pertenece la clase.

public class Libro { // Crea la clase llamada Libro.

    String titulo; // Declara el atributo titulo de tipo String.
    String autor; // Declara el atributo autor de tipo String.
    int numeroPaginas; // Declara el atributo numeroPaginas de tipo entero.

    // Este es el CONSTRUCTOR de la clase Libro
    public Libro(String titulo, String autor, int numeroPaginas) {

        this.titulo = titulo; // Guarda el título recibido en el atributo titulo.
        this.autor = autor; // Guarda el autor recibido en el atributo autor.
        this.numeroPaginas = numeroPaginas; // Guarda el número de páginas recibido.
    }

    // METODO que muestra la información del libro.
    public void mostrarInfo() {

        System.out.println("Título: " + titulo); // Muestra el título del libro.
        System.out.println("Autor: " + autor); // Muestra el autor del libro.
        System.out.println("Número de páginas: " + numeroPaginas); // Muestra las páginas.
    }
}

    // MAIN 

// Crear el primer objeto de la clase Libro.
Libro libro1 = new Libro("Drácula", "Bram Stoker", 418);

// Mostrar la información del primer libro.
libro1.mostrarInfo();

// Acceder directamente al atributo titulo.
System.out.println(libro1.titulo);


// Crear el segundo objeto de la clase Libro.
Libro libro2 = new Libro("Déjame entrar", "John Ajvide Lindqvist", 496)

// Mostrar la información del segundo libro.
libro2.mostrarInfo();

// Acceder directamente al atributo titulo.
System.out.println(libro2.titulo);
