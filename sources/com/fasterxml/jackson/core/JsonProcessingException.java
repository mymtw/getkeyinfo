package com.fasterxml.jackson.core;

import android.support.p013v4.media.C0069a;
import java.io.IOException;

public class JsonProcessingException extends IOException {
    public static final long serialVersionUID = 123;
    public JsonLocation _location;

    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this._location = jsonLocation;
    }

    public void clearLocation() {
        this._location = null;
    }

    public JsonLocation getLocation() {
        return this._location;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location == null && messageSuffix == null) {
            return message;
        }
        StringBuilder g = C0069a.m176g(100, message);
        if (messageSuffix != null) {
            g.append(messageSuffix);
        }
        if (location != null) {
            g.append(10);
            g.append(" at ");
            g.append(location.toString());
        }
        return g.toString();
    }

    public String getMessageSuffix() {
        return null;
    }

    public String getOriginalMessage() {
        return super.getMessage();
    }

    public Object getProcessor() {
        return null;
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonProcessingException(String str) {
        super(str);
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, (Throwable) null);
    }

    public JsonProcessingException(String str, Throwable th) {
        this(str, (JsonLocation) null, th);
    }

    public JsonProcessingException(Throwable th) {
        this((String) null, (JsonLocation) null, th);
    }
}
