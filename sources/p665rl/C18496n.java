package p665rl;

import android.util.Log;

/* renamed from: rl.n */
public final class C18496n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C18483a f40738b;

    public C18496n(C18483a aVar) {
        this.f40738b = aVar;
    }

    public final void run() {
        try {
            this.f40738b.f40714a.mo70000b();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
