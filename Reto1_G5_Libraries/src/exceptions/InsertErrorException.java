/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
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
