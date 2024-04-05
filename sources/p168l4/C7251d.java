package p168l4;

import java.io.File;
import p168l4.C7245a;

/* renamed from: l4.d */
public class C7251d implements C7245a.C7246a {

    /* renamed from: a */
    public final long f16098a;

    /* renamed from: b */
    public final C7252a f16099b;

    /* renamed from: l4.d$a */
    public interface C7252a {
    }

    public C7251d(C7254f fVar, long j) {
        this.f16098a = j;
        this.f16099b = fVar;
    }

    public final C7253e build() {
        C7254f fVar = (C7254f) this.f16099b;
        File cacheDir = fVar.f16105a.getCacheDir();
        if (cacheDir == null) {
            cacheDir = null;
        } else if (fVar.f16106b != null) {
            cacheDir = new File(cacheDir, fVar.f16106b);
        }
        if (cacheDir == null) {
            return null;
        }
        if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
            return new C7253e(cacheDir, this.f16098a);
        }
        return null;
    }
}
