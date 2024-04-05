package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import p644ph.C18368v;

public abstract class TagPayloadReader {

    /* renamed from: a */
    public final C18368v f31584a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    public TagPayloadReader(C18368v vVar) {
        this.f31584a = vVar;
    }
}
