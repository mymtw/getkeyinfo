package com.facebook.stetho.websocket;

import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class WriteHandler {
    private final BufferedOutputStream mBufferedOutput;

    public WriteHandler(OutputStream outputStream) {
        this.mBufferedOutput = new BufferedOutputStream(outputStream, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
    }

    public synchronized void write(Frame frame, WriteCallback writeCallback) {
        try {
            frame.writeTo(this.mBufferedOutput);
            this.mBufferedOutput.flush();
            writeCallback.onSuccess();
        } catch (IOException e) {
            writeCallback.onFailure(e);
        }
        return;
    }
}
