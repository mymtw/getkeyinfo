package com.facebook.stetho.server;

import android.content.Context;
import android.net.Credentials;
import android.net.LocalSocket;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0472h;
import com.facebook.stetho.common.LogUtil;
import java.io.IOException;

public abstract class SecureSocketHandler implements SocketHandler {
    private final Context mContext;

    public SecureSocketHandler(Context context) {
        this.mContext = context;
    }

    private static void enforcePermission(Context context, LocalSocket localSocket) throws IOException, PeerAuthorizationException {
        Credentials peerCredentials = localSocket.getPeerCredentials();
        int uid = peerCredentials.getUid();
        int pid = peerCredentials.getPid();
        if (LogUtil.isLoggable(2)) {
            LogUtil.m20246v("Got request from uid=%d, pid=%d", Integer.valueOf(uid), Integer.valueOf(pid));
        }
        if (context.checkPermission("android.permission.DUMP", pid, uid) != 0) {
            StringBuilder g = C0472h.m1244g("Peer pid=", pid, ", uid=", uid, " does not have ");
            g.append("android.permission.DUMP");
            throw new PeerAuthorizationException(g.toString());
        }
    }

    public final void onAccepted(LocalSocket localSocket) throws IOException {
        try {
            enforcePermission(this.mContext, localSocket);
            onSecured(localSocket);
        } catch (PeerAuthorizationException e) {
            StringBuilder h = C0072d.m201h("Unauthorized request: ");
            h.append(e.getMessage());
            LogUtil.m20237e(h.toString());
        }
    }

    public abstract void onSecured(LocalSocket localSocket) throws IOException;
}
