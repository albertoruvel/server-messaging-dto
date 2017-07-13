package com.messaging.dto.upload;

public enum DareuFileType{
    PROFILE("profile_image"), RESPONSE("response_video"), RESPONSE_THUMB("response_thumb_image");

    String type;
    DareuFileType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    public static DareuFileType fromString(String value){
        if(value.equalsIgnoreCase(PROFILE.toString()))
            return PROFILE;
        else if(value.equalsIgnoreCase(RESPONSE.toString()))
            return RESPONSE;
        else if(value.equalsIgnoreCase(RESPONSE_THUMB.toString()))
            return RESPONSE_THUMB;
        return null;
    }
}
