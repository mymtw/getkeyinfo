package p261v1;

import android.media.session.MediaSessionManager$RemoteUserInfo;

/* renamed from: v1.b */
public final class C8193b extends C8194c {
    public C8193b(String str, int i, int i2) {
        super(str, i, i2);
        new MediaSessionManager$RemoteUserInfo(str, i, i2);
    }

    public C8193b(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        super(mediaSessionManager$RemoteUserInfo.getPackageName(), mediaSessionManager$RemoteUserInfo.getPid(), mediaSessionManager$RemoteUserInfo.getUid());
    }
}
