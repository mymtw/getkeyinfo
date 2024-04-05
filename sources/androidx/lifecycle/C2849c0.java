package androidx.lifecycle;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19764o1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C19729m;
import p768rq.C20153b;

/* renamed from: androidx.lifecycle.c0 */
public final class C2849c0 extends CoroutineDispatcher {

    /* renamed from: c */
    public final C2862h f6467c = new C2862h();

    /* renamed from: A0 */
    public final void mo7108A0(CoroutineContext coroutineContext, Runnable runnable) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        C19383o.m32797g(runnable, "block");
        C2862h hVar = this.f6467c;
        hVar.getClass();
        C20153b bVar = C19760n0.f43719a;
        C19764o1 E0 = C19729m.f43681a.mo72111E0();
        if (!E0.mo10805C0(coroutineContext)) {
            if (!(hVar.f6497b || !hVar.f6496a)) {
                if (hVar.f6499d.offer(runnable)) {
                    hVar.mo10818a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            }
        }
        E0.mo7108A0(coroutineContext, new C2860g(hVar, runnable));
    }

    /* renamed from: C0 */
    public final boolean mo10805C0(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        C20153b bVar = C19760n0.f43719a;
        if (C19729m.f43681a.mo72111E0().mo10805C0(coroutineContext)) {
            return true;
        }
        C2862h hVar = this.f6467c;
        return !(hVar.f6497b || !hVar.f6496a);
    }
}
