
package model;

import exceptions.CredentialErrorException;
import exceptions.InsertErrorException;
import exceptions.ServerErrorException;
import exceptions.UserAlreadyExistsException;
import exceptions.UserNotFoundException;

/**
 * Esta interfaz se utiliza para instanciar los parámetros que se 
 * obtienen en nuestras ventanas de inicio de sesión y registro.
 *
 * @author Jessica
 */
public interface Signable {

    public User getExecuteSignUp(User user) throws UserAlreadyExistsException, UserNotFoundException, ServerErrorException, InsertErrorException;

    public User getExecuteSignIn(User user) throws ServerErrorException, CredentialErrorException;
}
