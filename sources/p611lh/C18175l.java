package p611lh;

import com.google.android.exoplayer2.audio.C14189a;
import p513bj.C14049b0;

/* renamed from: lh.l */
public final /* synthetic */ class C18175l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14189a.C14190a f39763b;

    /* renamed from: c */
    public final /* synthetic */ boolean f39764c;

    public /* synthetic */ C18175l(C14189a.C14190a aVar, boolean z) {
        this.f39763b = aVar;
        this.f39764c = z;
    }

    public final void run() {
        C14189a.C14190a aVar = this.f39763b;
        boolean z = this.f39764c;
        C14189a aVar2 = aVar.f31403b;
        int i = C14049b0.f30913a;
        aVar2.onSkipSilenceEnabledChanged(z);
    }
}
