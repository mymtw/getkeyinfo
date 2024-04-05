package p476wf;

import com.facebook.AccessToken;
import kotlin.jvm.internal.C19383o;
import p365hg.C12869i0;
import p401mg.C13080a;
import p453tf.C13418j;
import p476wf.C13841f;

/* renamed from: wf.g */
public final class C13846g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13841f f30474b;

    /* renamed from: c */
    public final /* synthetic */ String f30475c;

    public C13846g(C13841f fVar, String str) {
        this.f30474b = fVar;
        this.f30475c = str;
    }

    public final void run() {
        String I;
        AccessToken d;
        Class<C13841f> cls;
        if (!C13080a.m20762b(this)) {
            try {
                I = C12869i0.m20553I(this.f30475c);
                AccessToken.Companion.getClass();
                d = AccessToken.C12174c.m19981d();
                if (I != null) {
                    C13841f fVar = this.f30474b;
                    cls = C13841f.class;
                    String str = null;
                    if (!C13080a.m20762b(cls)) {
                        str = fVar.f30469d;
                    }
                    if (C19383o.m32792b(I, str)) {
                        return;
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return;
            }
            String str2 = C13841f.f30465e;
            this.f30474b.mo46677b(C13841f.C13842a.m21383a(this.f30475c, d, C13418j.m21107c()), I);
        }
    }
}
