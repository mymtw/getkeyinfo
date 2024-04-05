package p476wf;

import com.facebook.appevents.codeless.CodelessMatcher;
import p401mg.C13080a;

/* renamed from: wf.d */
public final class C13839d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CodelessMatcher f30463b;

    public C13839d(CodelessMatcher codelessMatcher) {
        this.f30463b = codelessMatcher;
    }

    public final void run() {
        Class<CodelessMatcher> cls;
        if (!C13080a.m20762b(this)) {
            try {
                CodelessMatcher codelessMatcher = this.f30463b;
                cls = CodelessMatcher.class;
                if (!C13080a.m20762b(cls)) {
                    codelessMatcher.mo39302b();
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
