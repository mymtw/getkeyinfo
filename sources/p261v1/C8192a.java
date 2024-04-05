package p261v1;

import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.os.Build;

/* renamed from: v1.a */
public final class C8192a {

    /* renamed from: a */
    public C8194c f17969a;

    public C8192a(String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17969a = new C8193b(str, i, i2);
        } else {
            this.f17969a = new C8194c(str, i, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8192a)) {
            return false;
        }
        return this.f17969a.equals(((C8192a) obj).f17969a);
    }

    public final int hashCode() {
        return this.f17969a.hashCode();
    }

    public C8192a(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        this.f17969a = new C8193b(mediaSessionManager$RemoteUserInfo);
    }
}
