package p611lh;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C14189a;
import com.google.android.gms.common.util.BiConsumer;
import java.io.IOException;
import java.util.regex.Pattern;
import p513bj.C14049b0;
import p619mh.C18224e;
import p641on.C18327e;
import p641on.C18330h;
import retrofit2.C20092d;
import retrofit2.C20102h;
import retrofit2.C20145v;

/* renamed from: lh.i */
public final /* synthetic */ class C18172i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f39754b;

    /* renamed from: c */
    public final /* synthetic */ Object f39755c;

    /* renamed from: d */
    public final /* synthetic */ Object f39756d;

    /* renamed from: e */
    public final /* synthetic */ Object f39757e;

    public /* synthetic */ C18172i(Object obj, int i, Object obj2, Object obj3) {
        this.f39754b = i;
        this.f39755c = obj;
        this.f39756d = obj2;
        this.f39757e = obj3;
    }

    public final void run() {
        switch (this.f39754b) {
            case 0:
                C14189a.C14190a aVar = (C14189a.C14190a) this.f39755c;
                C14189a aVar2 = aVar.f31403b;
                int i = C14049b0.f30913a;
                aVar2.getClass();
                aVar.f31403b.mo47243g((Format) this.f39756d, (C18224e) this.f39757e);
                return;
            case 1:
                Pattern pattern = C18330h.f40243e;
                ((BiConsumer) this.f39755c).accept((String) this.f39756d, (C18327e) this.f39757e);
                return;
            default:
                C20102h.C20103a.C20104a aVar3 = (C20102h.C20103a.C20104a) this.f39755c;
                C20092d dVar = (C20092d) this.f39756d;
                C20145v vVar = (C20145v) this.f39757e;
                if (C20102h.C20103a.this.f44485c.mo74367n()) {
                    dVar.mo1135j(C20102h.C20103a.this, new IOException("Canceled"));
                    return;
                } else {
                    dVar.mo1137m(C20102h.C20103a.this, vVar);
                    return;
                }
        }
    }
}
