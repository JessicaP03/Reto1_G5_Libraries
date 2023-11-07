package model;

import java.io.Serializable;

/**
 * Esta clase permite encapsular un usuario y un tipo de mensaje.
 *
 * @author Jessica
 */
public class Message implements Serializable {

    //Atributos
    private MessageType messageType;
    private User user;

    //Constructores
    public Message() {
    }

    public Message(MessageType messageType, User user) {
        this.messageType = messageType;
        this.user = user;
    }

    //Getters y Setters
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
