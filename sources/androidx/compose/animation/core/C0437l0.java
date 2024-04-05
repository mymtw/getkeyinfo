package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.animation.core.l0 */
public final class C0437l0<T, V extends C0432j> implements C0435k0<T, V> {

    /* renamed from: a */
    public final C19857l<T, V> f1150a;

    /* renamed from: b */
    public final C19857l<V, T> f1151b;

    public C0437l0(C19857l<? super T, ? extends V> lVar, C19857l<? super V, ? extends T> lVar2) {
        C19383o.m32797g(lVar, "convertToVector");
        C19383o.m32797g(lVar2, "convertFromVector");
        this.f1150a = lVar;
        this.f1151b = lVar2;
    }

    /* renamed from: a */
    public final C19857l<T, V> mo3509a() {
        return this.f1150a;
    }

    /* renamed from: b */
    public final C19857l<V, T> mo3510b() {
        return this.f1151b;
    }
}
