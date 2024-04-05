package com.linkedin.android.litr.exception;

import android.net.Uri;
import android.support.p013v4.media.C0072d;

public class MediaSourceException extends MediaTransformationException {
    private final Error error;
    private final Uri inputUri;

    public enum Error {
        DATA_SOURCE("data source error");
        
        /* access modifiers changed from: private */
        public final String text;

        private Error(String str) {
            this.text = str;
        }
    }

    public MediaSourceException(Error error2, Uri uri, Throwable th) {
        super(th);
        this.error = error2;
        this.inputUri = uri;
    }

    public Error getError() {
        return this.error;
    }

    public String getMessage() {
        StringBuilder h = C0072d.m201h("Failed to create media source due to a ");
        h.append(this.error.text);
        return h.toString();
    }

    public String toString() {
        return super.toString() + 10 + "Failed to create media source due to a " + this.error.text + 10 + "Uri: " + this.inputUri;
    }
}
