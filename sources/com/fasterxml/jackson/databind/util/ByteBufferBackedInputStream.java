package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ByteBufferBackedInputStream extends InputStream {

    /* renamed from: _b */
    public final ByteBuffer f27777_b;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this.f27777_b = byteBuffer;
    }

    public int available() {
        return this.f27777_b.remaining();
    }

    public int read() throws IOException {
        if (this.f27777_b.hasRemaining()) {
            return this.f27777_b.get() & 255;
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f27777_b.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, this.f27777_b.remaining());
        this.f27777_b.get(bArr, i, min);
        return min;
    }
}
