/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * This enum class is used to asign all the type of messages
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
