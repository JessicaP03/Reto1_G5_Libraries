
package model;

/**
 * Esta clase es una enumeración para asignar todos los tipos de mensaje que pueden llegar a salir.
 *
 * @author Jessica
 */
public enum MessageType {
    SIGNIN_REQUEST,
    SIGNUP_REQUEST,
    OK_RESPONSE,
    USER_ALREADY_EXISTS_RESPONSE,
    USER_NOT_FOUND_RESPONSE,
    PASSWORD_ERROR_RESPONSE,
    ERROR_RESPONSE,
    MAX_USERS_CONECTED,
    SERVER_ERROR,
    CREDENTIAL_ERROR;
}
