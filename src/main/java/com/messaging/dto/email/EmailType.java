package com.messaging.dto.email;

public enum EmailType {
    ERROR("error_email"),
    USER_REGISTRATION("user_registration_email"),
    CONTACT_MESSAGE_REPLY("contact_message_reply_email"),
    REQUESTED_FRIENDSHIP("requested_friendship_email"),
    CONTACT_MESSAGE("contact_message_email");

    String type;
    EmailType(String type){
        this.type = type;
    }

    @Override
    public String toString(){
        return type;
    }

    public static EmailType fromString(String value){
        if(value.equals(ERROR.type))
            return ERROR;
        else if(value.equals(USER_REGISTRATION.type))
            return USER_REGISTRATION;
        else if(value.equals(CONTACT_MESSAGE_REPLY.type))
            return CONTACT_MESSAGE_REPLY;
        else if(value.equals(REQUESTED_FRIENDSHIP.type))
            return REQUESTED_FRIENDSHIP;
        else if(value.equals(CONTACT_MESSAGE.type))
            return CONTACT_MESSAGE;
        else return null;
    }
}