/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo5.reto1.model;

import grupo5.reto1.exceptions.CredentialErrorException;
import grupo5.reto1.exceptions.ServerErrorException;
import grupo5.reto1.exceptions.UserAlreadyExistsException;
import grupo5.reto1.exceptions.UserNotFoundException;



/**
 *This interface is used to instance the parameters wich are get on our SignIn and SignUp windows
 * @author Jessica
 */
public interface Signable {
    public User getExecuteSignUp(User user) throws UserAlreadyExistsException, UserNotFoundException, ServerErrorException;
    public User getExecuteSignIn(User user) throws ServerErrorException, CredentialErrorException;
}
