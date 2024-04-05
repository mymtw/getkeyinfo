package p756lr;

import android.support.p013v4.media.C0072d;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: lr.b0 */
public final class C19886b0 extends C19883b {

    /* renamed from: k */
    public final Socket f43866k;

    public C19886b0(Socket socket) {
        this.f43866k = socket;
    }

    /* renamed from: j */
    public final IOException mo70523j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* renamed from: k */
    public final void mo70524k() {
        try {
            this.f43866k.close();
        } catch (Exception e) {
            Logger logger = C19907s.f43901a;
            Level level = Level.WARNING;
            StringBuilder h = C0072d.m201h("Failed to close timed out socket ");
            h.append(this.f43866k);
            logger.log(level, h.toString(), e);
        } catch (AssertionError e2) {
            if (C19906r.m33999c(e2)) {
                Logger logger2 = C19907s.f43901a;
                Level level2 = Level.WARNING;
                StringBuilder h2 = C0072d.m201h("Failed to close timed out socket ");
                h2.append(this.f43866k);
                logger2.log(level2, h2.toString(), e2);
                return;
            }
            throw e2;
        }
    }
}
