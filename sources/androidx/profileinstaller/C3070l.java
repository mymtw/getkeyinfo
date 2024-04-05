package androidx.profileinstaller;

import android.view.Choreographer;

/* renamed from: androidx.profileinstaller.l */
public final /* synthetic */ class C3070l implements Choreographer.FrameCallback {

    /* renamed from: b */
    public final /* synthetic */ Runnable f6989b;

    public /* synthetic */ C3070l(Runnable runnable) {
        this.f6989b = runnable;
    }

    public final void doFrame(long j) {
        this.f6989b.run();
    }
}
