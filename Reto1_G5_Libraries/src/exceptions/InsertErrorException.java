
package exceptions;

/**
 * Excepción de inserción de datos en la base de datos.
 * @author Ian.
 */
public class InsertErrorException extends Exception {

    /**
     * Creates a new instance of <code>InsertErrorException</code> without
     * detail message.
     */
    public InsertErrorException() {
    }

    /**
     * Constructs an instance of <code>InsertErrorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InsertErrorException(String msg) {
        super(msg);
    }
}
