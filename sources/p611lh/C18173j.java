package p611lh;

import com.google.android.exoplayer2.audio.C14189a;
import p513bj.C14049b0;

/* renamed from: lh.j */
public final /* synthetic */ class C18173j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14189a.C14190a f39758b;

    /* renamed from: c */
    public final /* synthetic */ Exception f39759c;

    public /* synthetic */ C18173j(C14189a.C14190a aVar, Exception exc) {
        this.f39758b = aVar;
        this.f39759c = exc;
    }

    public final void run() {
        C14189a.C14190a aVar = this.f39758b;
        Exception exc = this.f39759c;
        C14189a aVar2 = aVar.f31403b;
        int i = C14049b0.f30913a;
        aVar2.mo47241e(exc);
    }
}
