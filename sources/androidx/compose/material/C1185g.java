package androidx.compose.material;

import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.material.g */
public final class C1185g extends SwipeableState<BottomDrawerValue> {

    /* renamed from: q */
    public final SwipeableKt$PreUpPostDownNestedScrollConnection$1 f2444q = new SwipeableKt$PreUpPostDownNestedScrollConnection$1(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1185g(BottomDrawerValue bottomDrawerValue, C19857l<? super BottomDrawerValue, Boolean> lVar) {
        super(bottomDrawerValue, DrawerKt.f2205c, lVar);
        C19383o.m32797g(bottomDrawerValue, "initialValue");
        C19383o.m32797g(lVar, "confirmStateChange");
    }
}
