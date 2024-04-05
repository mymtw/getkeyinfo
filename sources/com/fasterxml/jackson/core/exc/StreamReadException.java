package com.fasterxml.jackson.core.exc;

import android.support.p013v4.media.C0073e;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.RequestPayload;

public abstract class StreamReadException extends JsonProcessingException {
    public static final long serialVersionUID = 1;
    public transient JsonParser _processor;
    public RequestPayload _requestPayload;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamReadException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation());
        this._processor = jsonParser;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (this._requestPayload == null) {
            return message;
        }
        StringBuilder k = C0073e.m211k(message, "\nRequest payload : ");
        k.append(this._requestPayload.toString());
        return k.toString();
    }

    public RequestPayload getRequestPayload() {
        return this._requestPayload;
    }

    public String getRequestPayloadAsString() {
        RequestPayload requestPayload = this._requestPayload;
        if (requestPayload != null) {
            return requestPayload.toString();
        }
        return null;
    }

    public abstract StreamReadException withParser(JsonParser jsonParser);

    public abstract StreamReadException withRequestPayload(RequestPayload requestPayload);

    public JsonParser getProcessor() {
        return this._processor;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamReadException(JsonParser jsonParser, String str, Throwable th) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation(), th);
        this._processor = jsonParser;
    }

    public StreamReadException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation, (Throwable) null);
        this._processor = jsonParser;
    }

    public StreamReadException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this._location = jsonLocation;
    }
}
