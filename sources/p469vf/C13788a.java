package p469vf;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p365hg.C12831b;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: vf.a */
public final class C13788a implements Runnable {

    /* renamed from: b */
    public static final C13788a f30346b = new C13788a();

    public final void run() {
        Class<C13789b> cls;
        if (!C13080a.m20762b(this)) {
            try {
                Context b = C13418j.m21106b();
                C12831b.f28321h.getClass();
                C19383o.m32797g(b, ResponseConstants.CONTEXT);
                C12831b a = C12831b.C12832a.m20469a(b);
                if (!(a != null && a.f28326e)) {
                    C13789b.m21337a(C13789b.f30349c);
                    cls = C13789b.class;
                    if (!C13080a.m20762b(cls)) {
                        C13789b.f30348b = true;
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
