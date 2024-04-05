package p611lh;

import android.net.Uri;
import com.google.android.exoplayer2.audio.C14189a;
import com.google.android.exoplayer2.source.hls.playlist.C14333a;
import p513bj.C14049b0;

/* renamed from: lh.k */
public final /* synthetic */ class C18174k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f39760b;

    /* renamed from: c */
    public final /* synthetic */ Object f39761c;

    /* renamed from: d */
    public final /* synthetic */ Object f39762d;

    public /* synthetic */ C18174k(int i, Object obj, Object obj2) {
        this.f39760b = i;
        this.f39761c = obj;
        this.f39762d = obj2;
    }

    public final void run() {
        switch (this.f39760b) {
            case 0:
                C14189a aVar = ((C14189a.C14190a) this.f39761c).f31403b;
                int i = C14049b0.f30913a;
                aVar.mo47248x((Exception) this.f39762d);
                return;
            default:
                C14333a.C14334a aVar2 = (C14333a.C14334a) this.f39761c;
                aVar2.f32098j = false;
                aVar2.mo47780b((Uri) this.f39762d);
                return;
        }
    }
}
