package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.material.d */
public final class C1175d extends SwipeableState<BackdropValue> {

    /* renamed from: q */
    public final C1254t1 f2389q;

    /* renamed from: r */
    public final SwipeableKt$PreUpPostDownNestedScrollConnection$1 f2390r = new SwipeableKt$PreUpPostDownNestedScrollConnection$1(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1175d(BackdropValue backdropValue, C0422e<Float> eVar, C19857l<? super BackdropValue, Boolean> lVar, C1254t1 t1Var) {
        super(backdropValue, eVar, lVar);
        C19383o.m32797g(backdropValue, "initialValue");
        C19383o.m32797g(eVar, "animationSpec");
        C19383o.m32797g(lVar, "confirmStateChange");
        C19383o.m32797g(t1Var, "snackbarHostState");
        this.f2389q = t1Var;
    }
}
