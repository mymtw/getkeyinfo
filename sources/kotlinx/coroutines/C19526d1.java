package kotlinx.coroutines;

import android.support.p013v4.media.C0072d;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.d1 */
public final class C19526d1 extends C19705i {

    /* renamed from: b */
    public final C19857l<Throwable, C19394m> f43458b;

    public C19526d1(C19857l<? super Throwable, C19394m> lVar) {
        this.f43458b = lVar;
    }

    /* renamed from: a */
    public final void mo72155a(Throwable th) {
        this.f43458b.invoke(th);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72155a((Throwable) obj);
        return C19394m.f43287a;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("InvokeOnCancel[");
        h.append(this.f43458b.getClass().getSimpleName());
        h.append('@');
        h.append(C19543e0.m33300R(this));
        h.append(']');
        return h.toString();
    }
}
