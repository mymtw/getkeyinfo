package p365hg;

import java.io.File;
import p401mg.C13080a;

/* renamed from: hg.p */
public final class C12900p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ File[] f28445b;

    public C12900p(File[] fileArr) {
        this.f28445b = fileArr;
    }

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                for (File delete : this.f28445b) {
                    delete.delete();
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
