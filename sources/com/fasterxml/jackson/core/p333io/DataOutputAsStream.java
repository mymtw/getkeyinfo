package com.fasterxml.jackson.core.p333io;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fasterxml.jackson.core.io.DataOutputAsStream */
public class DataOutputAsStream extends OutputStream {
    public final DataOutput _output;

    public DataOutputAsStream(DataOutput dataOutput) {
        this._output = dataOutput;
    }

    public void write(int i) throws IOException {
        this._output.write(i);
    }

    public void write(byte[] bArr) throws IOException {
        this._output.write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this._output.write(bArr, i, i2);
    }
}
