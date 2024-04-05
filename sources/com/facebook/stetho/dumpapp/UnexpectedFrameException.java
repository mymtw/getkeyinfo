package com.facebook.stetho.dumpapp;

import android.support.p013v4.media.C0070b;

class UnexpectedFrameException extends DumpappFramingException {
    public UnexpectedFrameException(byte b, byte b2) {
        super(C0070b.m183e("Expected '", b, "', got: '", b2, "'"));
    }
}
