package okhttp3.internal.cache;

import kotlin.C19394m;
import okhttp3.internal.cache.DiskLruCache;
import p756lr.C19888c0;
import p756lr.C19900l;

/* renamed from: okhttp3.internal.cache.e */
public final class C19962e extends C19900l {

    /* renamed from: c */
    public boolean f44115c;

    /* renamed from: d */
    public final /* synthetic */ DiskLruCache.C19954a f44116d;

    /* renamed from: e */
    public final /* synthetic */ C19888c0 f44117e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19962e(DiskLruCache.C19954a aVar, C19888c0 c0Var, C19888c0 c0Var2) {
        super(c0Var2);
        this.f44116d = aVar;
        this.f44117e = c0Var;
    }

    public final void close() {
        super.close();
        if (!this.f44115c) {
            this.f44115c = true;
            synchronized (this.f44116d.f44102j) {
                DiskLruCache.C19954a aVar = this.f44116d;
                int i = aVar.f44099g - 1;
                aVar.f44099g = i;
                if (i == 0 && aVar.f44097e) {
                    aVar.f44102j.mo72892n(aVar);
                }
                C19394m mVar = C19394m.f43287a;
            }
        }
    }
}
