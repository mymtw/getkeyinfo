package com.facebook.stetho.server;

import android.content.Context;
import android.net.LocalSocket;
import android.support.p013v4.media.C0072d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ProtocolDetectingSocketHandler extends SecureSocketHandler {
    private static final int SENSING_BUFFER_SIZE = 256;
    private final ArrayList<HandlerInfo> mHandlers = new ArrayList<>(2);

    public static class AlwaysMatchMatcher implements MagicMatcher {
        public boolean matches(InputStream inputStream) throws IOException {
            return true;
        }
    }

    public static class ExactMagicMatcher implements MagicMatcher {
        private final byte[] mMagic;

        public ExactMagicMatcher(byte[] bArr) {
            this.mMagic = bArr;
        }

        public boolean matches(InputStream inputStream) throws IOException {
            int length = this.mMagic.length;
            byte[] bArr = new byte[length];
            return inputStream.read(bArr) == length && Arrays.equals(bArr, this.mMagic);
        }
    }

    public static class HandlerInfo {
        public final SocketLikeHandler handler;
        public final MagicMatcher magicMatcher;

        private HandlerInfo(MagicMatcher magicMatcher2, SocketLikeHandler socketLikeHandler) {
            this.magicMatcher = magicMatcher2;
            this.handler = socketLikeHandler;
        }
    }

    public interface MagicMatcher {
        boolean matches(InputStream inputStream) throws IOException;
    }

    public ProtocolDetectingSocketHandler(Context context) {
        super(context);
    }

    public void addHandler(MagicMatcher magicMatcher, SocketLikeHandler socketLikeHandler) {
        this.mHandlers.add(new HandlerInfo(magicMatcher, socketLikeHandler));
    }

    public void onSecured(LocalSocket localSocket) throws IOException {
        LeakyBufferedInputStream leakyBufferedInputStream = new LeakyBufferedInputStream(localSocket.getInputStream(), 256);
        if (!this.mHandlers.isEmpty()) {
            int size = this.mHandlers.size();
            for (int i = 0; i < size; i++) {
                HandlerInfo handlerInfo = this.mHandlers.get(i);
                leakyBufferedInputStream.mark(256);
                boolean matches = handlerInfo.magicMatcher.matches(leakyBufferedInputStream);
                leakyBufferedInputStream.reset();
                if (matches) {
                    handlerInfo.handler.onAccepted(new SocketLike(localSocket, leakyBufferedInputStream));
                    return;
                }
            }
            StringBuilder h = C0072d.m201h("No matching handler, firstByte=");
            h.append(leakyBufferedInputStream.read());
            throw new IOException(h.toString());
        }
        throw new IllegalStateException("No handlers added");
    }
}
