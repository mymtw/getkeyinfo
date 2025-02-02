package com.facebook.stetho.server.http;

public class LightHttpResponse extends LightHttpMessage {
    public LightHttpBody body;
    public int code;
    public String reasonPhrase;

    public void prepare() {
        LightHttpBody lightHttpBody = this.body;
        if (lightHttpBody != null) {
            addHeader("Content-Type", lightHttpBody.contentType());
            addHeader(HttpHeaders.CONTENT_LENGTH, String.valueOf(this.body.contentLength()));
        }
    }

    public void reset() {
        super.reset();
        this.code = -1;
        this.reasonPhrase = null;
        this.body = null;
    }
}
