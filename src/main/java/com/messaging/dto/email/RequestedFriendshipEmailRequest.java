package com.messaging.dto.email;

public class RequestedFriendshipEmailRequest {
    private String requestedUserName;
    private String userRequestingName;

    public String getRequestedUserName() {
        return requestedUserName;
    }

    public void setRequestedUserName(String requestedUserName) {
        this.requestedUserName = requestedUserName;
    }

    public String getUserRequestingName() {
        return userRequestingName;
    }

    public void setUserRequestingName(String userRequestingName) {
        this.userRequestingName = userRequestingName;
    }
}
