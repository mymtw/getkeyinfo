package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.material.m */
public final class C1211m extends SwipeableState<BottomSheetValue> {

    /* renamed from: q */
    public final SwipeableKt$PreUpPostDownNestedScrollConnection$1 f2525q = new SwipeableKt$PreUpPostDownNestedScrollConnection$1(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1211m(BottomSheetValue bottomSheetValue, C0422e<Float> eVar, C19857l<? super BottomSheetValue, Boolean> lVar) {
        super(bottomSheetValue, eVar, lVar);
        C19383o.m32797g(bottomSheetValue, "initialValue");
        C19383o.m32797g(eVar, "animationSpec");
        C19383o.m32797g(lVar, "confirmStateChange");
    }
}
