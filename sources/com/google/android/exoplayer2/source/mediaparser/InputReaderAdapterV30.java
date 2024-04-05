package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser$SeekableInputReader;
import java.io.IOException;
import p505aj.C13997e;
import p513bj.C14049b0;

@SuppressLint({"Override"})
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {
    private long currentPosition;
    private C13997e dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
        long j = this.lastSeekPosition;
        this.lastSeekPosition = -1;
        return j;
    }

    public long getLength() {
        return this.resourceLength;
    }

    public long getPosition() {
        return this.currentPosition;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        C13997e eVar = this.dataReader;
        int i3 = C14049b0.f30913a;
        int read = eVar.read(bArr, i, i2);
        this.currentPosition += (long) read;
        return read;
    }

    public void seekToPosition(long j) {
        this.lastSeekPosition = j;
    }

    public void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public void setDataReader(C13997e eVar, long j) {
        this.dataReader = eVar;
        this.resourceLength = j;
        this.lastSeekPosition = -1;
    }
}
