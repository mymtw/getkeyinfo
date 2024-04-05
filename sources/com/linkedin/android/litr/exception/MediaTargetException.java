package com.linkedin.android.litr.exception;

import android.net.Uri;

public class MediaTargetException extends MediaTransformationException {
    private final Error error;
    private final String outputFilePath;
    private final int outputFormat;

    public enum Error {
        INVALID_PARAMS("Invalid parameters"),
        IO_FAILUE("Failed to open the media target for write."),
        UNSUPPORTED_URI_TYPE("URI type not supported at API level below 26");
        
        /* access modifiers changed from: private */
        public final String text;

        private Error(String str) {
            this.text = str;
        }
    }

    public MediaTargetException(Error error2, Uri uri, int i, Throwable th) {
        this(error2, uri.toString(), i, th);
    }

    public Error getError() {
        return this.error;
    }

    public String toString() {
        return super.toString() + 10 + this.error.text + 10 + "Output file path or Uri encoded string: " + this.outputFilePath + 10 + "MediaMuxer output format: " + this.outputFormat;
    }

    public MediaTargetException(Error error2, String str, int i, Throwable th) {
        super(th);
        this.error = error2;
        this.outputFilePath = str;
        this.outputFormat = i;
    }
}
