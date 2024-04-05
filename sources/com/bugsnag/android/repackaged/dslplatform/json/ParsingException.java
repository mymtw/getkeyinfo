package com.bugsnag.android.repackaged.dslplatform.json;

import java.io.IOException;

public class ParsingException extends IOException {

    public static class ParsingStacklessException extends ParsingException {
        public ParsingStacklessException(String str, C5835a aVar) {
            super(str, (C5835a) null);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        public ParsingStacklessException(String str, Throwable th, C5835a aVar) {
            super(str, th, (C5835a) null);
        }
    }

    public ParsingException(String str) {
        super(str);
    }

    public static ParsingException create(String str, boolean z) {
        if (z) {
            return new ParsingException(str);
        }
        return new ParsingStacklessException(str, (C5835a) null);
    }

    public ParsingException(String str, C5835a aVar) {
        super(str);
    }

    public ParsingException(String str, Throwable th) {
        super(str, th);
    }

    public static ParsingException create(String str, Throwable th, boolean z) {
        if (z) {
            return new ParsingException(str, th);
        }
        return new ParsingStacklessException(str, th, (C5835a) null);
    }

    public ParsingException(String str, Throwable th, C5835a aVar) {
        super(str, th);
    }
}
