package com.fasterxml.jackson.core.format;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.JsonFactory;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public interface InputAccessor {
    boolean hasMoreBytes() throws IOException;

    byte nextByte() throws IOException;

    void reset();

    public static class Std implements InputAccessor {
        public final byte[] _buffer;
        public int _bufferedEnd;
        public final int _bufferedStart;
        public final InputStream _in;
        public int _ptr;

        public Std(InputStream inputStream, byte[] bArr) {
            this._in = inputStream;
            this._buffer = bArr;
            this._bufferedStart = 0;
            this._ptr = 0;
            this._bufferedEnd = 0;
        }

        public DataFormatMatcher createMatcher(JsonFactory jsonFactory, MatchStrength matchStrength) {
            InputStream inputStream = this._in;
            byte[] bArr = this._buffer;
            int i = this._bufferedStart;
            return new DataFormatMatcher(inputStream, bArr, i, this._bufferedEnd - i, jsonFactory, matchStrength);
        }

        public boolean hasMoreBytes() throws IOException {
            int read;
            int i = this._ptr;
            if (i < this._bufferedEnd) {
                return true;
            }
            InputStream inputStream = this._in;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this._buffer;
            int length = bArr.length - i;
            if (length < 1 || (read = inputStream.read(bArr, i, length)) <= 0) {
                return false;
            }
            this._bufferedEnd += read;
            return true;
        }

        public byte nextByte() throws IOException {
            if (this._ptr < this._bufferedEnd || hasMoreBytes()) {
                byte[] bArr = this._buffer;
                int i = this._ptr;
                this._ptr = i + 1;
                return bArr[i];
            }
            StringBuilder h = C0072d.m201h("Failed auto-detect: could not read more than ");
            h.append(this._ptr);
            h.append(" bytes (max buffer size: ");
            throw new EOFException(C0071c.m191c(h, this._buffer.length, ")"));
        }

        public void reset() {
            this._ptr = this._bufferedStart;
        }

        public Std(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        public Std(byte[] bArr, int i, int i2) {
            this._in = null;
            this._buffer = bArr;
            this._ptr = i;
            this._bufferedStart = i;
            this._bufferedEnd = i + i2;
        }
    }
}
