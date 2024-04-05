package p517bn;

import android.util.Log;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import p605kk.C18117a0;
import p687uj.C18592h;

/* renamed from: bn.r */
public final class C14127r implements Closeable {

    /* renamed from: b */
    public final URL f31119b;

    /* renamed from: c */
    public C18117a0 f31120c;

    /* renamed from: d */
    public volatile InputStream f31121d;

    public C14127r(URL url) {
        this.f31119b = url;
    }

    public final void close() {
        try {
            InputStream inputStream = this.f31121d;
            Logger logger = C18592h.f41062a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    C18592h.f41062a.logp(Level.WARNING, "com.google.common.io.Closeables", ConstantsKt.CLOSE, "IOException thrown while closing Closeable.", e);
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        } catch (NullPointerException e3) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e3);
        }
    }
}
