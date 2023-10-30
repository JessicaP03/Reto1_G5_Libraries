/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 * This class is used to track the type of message and the user
 *
 * @author Jessica
 */
public class Message implements Serializable {

    /*
    atributes
     */
    private MessageType messageType;
    private User user;

    /*
    constructors
     */
    public Message() {
    }

    public Message(MessageType messageType, User user) {
        this.messageType = messageType;
        this.user = user;
    }

    /*
    getters and setters
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public User getUser() {
        return user;
    }
}
