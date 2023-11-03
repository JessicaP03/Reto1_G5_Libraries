/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exceptions.CredentialErrorException;
import exceptions.InsertErrorException;
import exceptions.SelectErrorException;
import exceptions.ServerErrorException;
import exceptions.UserAlreadyExistsException;
import exceptions.UserNotFoundException;

/**
 * This interface is used to instance the parameters wich are get on our SignIn
 * and SignUp windows
 *
 * @author Jessica
 */
public interface Signable {

    public User getExecuteSignUp(User user) throws UserAlreadyExistsException, UserNotFoundException, ServerErrorException, InsertErrorException;

    public User getExecuteSignIn(User user) throws ServerErrorException, CredentialErrorException;
}
