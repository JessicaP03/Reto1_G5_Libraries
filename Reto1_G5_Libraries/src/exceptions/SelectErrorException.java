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
public class SelectErrorException extends Exception {

    /**
     * Creates a new instance of <code>SelectErrorException</code> without
     * detail message.
     */
    public SelectErrorException() {
    }

    /**
     * Constructs an instance of <code>SelectErrorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public SelectErrorException(String msg) {
        super(msg);
    }
}
