package com.facebook.stetho.websocket;

import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

class ReadHandler {
    private final BufferedInputStream mBufferedInput;
    private final ByteArrayOutputStream mCurrentPayload = new ByteArrayOutputStream();
    private final SimpleEndpoint mEndpoint;

    public ReadHandler(InputStream inputStream, SimpleEndpoint simpleEndpoint) {
        this.mBufferedInput = new BufferedInputStream(inputStream, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
        this.mEndpoint = simpleEndpoint;
    }

    public void readLoop(ReadCallback readCallback) throws IOException {
        Frame frame = new Frame();
        do {
            frame.readFrom(this.mBufferedInput);
            this.mCurrentPayload.write(frame.payloadData, 0, (int) frame.payloadLen);
            if (frame.fin) {
                byte[] byteArray = this.mCurrentPayload.toByteArray();
                readCallback.onCompleteFrame(frame.opcode, byteArray, byteArray.length);
                this.mCurrentPayload.reset();
            }
        } while (frame.opcode != 8);
    }
}
