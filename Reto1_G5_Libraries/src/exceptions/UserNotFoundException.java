package exceptions;

/**
 *
 * @author Ian.
 */
public class UserNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>UsuarioNoEncontrado</code> without detail
     * message.
     */
    public UserNotFoundException() {
    }

    /**
     * Constructs an instance of <code>UsuarioNoEncontrado</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
