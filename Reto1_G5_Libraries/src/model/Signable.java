package model;

import exceptions.CredentialErrorException;
import exceptions.InsertErrorException;
import exceptions.ServerErrorException;
import exceptions.UserAlreadyExistsException;
import exceptions.UserNotFoundException;

/**
 * Esta interfaz se utiliza para instanciar los parámetros que se obtienen en
 * nuestras ventanas de inicio de sesión y registro.
 *
 * @author Jessica.
 */
public interface Signable {

    /**
     * Guarda un usuario en la base de datos de odoo.
     *
     * @param user un objeto con los datos que queremos insertar.
     * @return un objeto usuario
     * @throws UserAlreadyExistsException una excepción que gestiona si un
     * usuario ya existe en la base de datos.
     * @throws UserNotFoundException una excepción que gestiona si un usuario no
     * se encuentra en la base de datos.
     * @throws ServerErrorException una excepción que gestiona si hay un error
     * en el servidor.
     * @throws InsertErrorException
     */
    public User getExecuteSignUp(User user) throws UserAlreadyExistsException, UserNotFoundException, ServerErrorException, InsertErrorException;

    /**
     * Busca un usuario en la base de datos de odoo que tenga el email y
     * contraseeña que tenga.
     *
     * @param user un objeto donde esta el email y la contraseña.
     * @return devuelve todos los datos del usuario si los datos coinciden y
     * null si no lo hacen.
     * @throws ServerErrorException gestiona una excepción por si hay un error
     * en el servidor.
     * @throws CredentialErrorException gestiona una excepción por si el email y
     * la contraseña no coinciden.
     */
    public User getExecuteSignIn(User user) throws ServerErrorException, CredentialErrorException;
}
