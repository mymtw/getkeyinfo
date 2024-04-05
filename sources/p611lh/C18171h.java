package p611lh;

import com.google.android.exoplayer2.audio.C14189a;
import p513bj.C14049b0;

/* renamed from: lh.h */
public final /* synthetic */ class C18171h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14189a.C14190a f39750b;

    /* renamed from: c */
    public final /* synthetic */ String f39751c;

    /* renamed from: d */
    public final /* synthetic */ long f39752d;

    /* renamed from: e */
    public final /* synthetic */ long f39753e;

    public /* synthetic */ C18171h(C14189a.C14190a aVar, String str, long j, long j2) {
        this.f39750b = aVar;
        this.f39751c = str;
        this.f39752d = j;
        this.f39753e = j2;
    }

    public final void run() {
        C14189a.C14190a aVar = this.f39750b;
        String str = this.f39751c;
        long j = this.f39752d;
        long j2 = this.f39753e;
        C14189a aVar2 = aVar.f31403b;
        int i = C14049b0.f30913a;
        aVar2.mo47244k(j, j2, str);
    }
}
