package androidx.compose.p015ui.semantics;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19410j;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.semantics.p */
public final class C1909p<T> {

    /* renamed from: a */
    public final String f4268a;

    /* renamed from: b */
    public final C19861p<T, T, T> f4269b;

    public C1909p(String str, C19861p<? super T, ? super T, ? extends T> pVar) {
        C19383o.m32797g(pVar, "mergePolicy");
        this.f4268a = str;
        this.f4269b = pVar;
    }

    /* renamed from: a */
    public final void mo7356a(C1910q qVar, C19410j<?> jVar, T t) {
        C19383o.m32797g(qVar, "thisRef");
        C19383o.m32797g(jVar, "property");
        qVar.mo7342a(this, t);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SemanticsPropertyKey: ");
        h.append(this.f4268a);
        return h.toString();
    }

    public /* synthetic */ C1909p(String str) {
        this(str, SemanticsPropertyKey$1.INSTANCE);
    }
}
