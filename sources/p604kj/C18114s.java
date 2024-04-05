package p604kj;

import android.util.Log;
import java.io.IOException;
import p605kk.C18124h;

/* renamed from: kj.s */
public final /* synthetic */ class C18114s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C18124h f39558b;

    public /* synthetic */ C18114s(C18124h hVar) {
        this.f39558b = hVar;
    }

    public final void run() {
        if (this.f39558b.mo69679c(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
