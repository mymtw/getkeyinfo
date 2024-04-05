package androidx.compose.material;

import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.material.k0 */
public final class C1206k0 {

    /* renamed from: a */
    public final SwipeableState<DrawerValue> f2507a;

    public C1206k0(DrawerValue drawerValue, C19857l<? super DrawerValue, Boolean> lVar) {
        C19383o.m32797g(drawerValue, "initialValue");
        C19383o.m32797g(lVar, "confirmStateChange");
        this.f2507a = new SwipeableState<>(drawerValue, DrawerKt.f2205c, lVar);
    }
}
