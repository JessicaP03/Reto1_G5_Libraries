package grupo5.reto1.exceptions;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian.
 */
public class ServerErrorException extends Exception {

    /**
     * Creates a new instance of <code>ErrorDeServidor</code> without detail
     * message.
     */
    public ServerErrorException() {
    }

    /**
     * Constructs an instance of <code>ErrorDeServidor</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ServerErrorException(String msg) {
        super(msg);
    }
}
