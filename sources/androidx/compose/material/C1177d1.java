package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.material.d1 */
public final class C1177d1 extends SwipeableState<ModalBottomSheetValue> {

    /* renamed from: q */
    public final boolean f2400q;

    /* renamed from: r */
    public final SwipeableKt$PreUpPostDownNestedScrollConnection$1 f2401r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1177d1(ModalBottomSheetValue modalBottomSheetValue, C0422e<Float> eVar, boolean z, C19857l<? super ModalBottomSheetValue, Boolean> lVar) {
        super(modalBottomSheetValue, eVar, lVar);
        C19383o.m32797g(modalBottomSheetValue, "initialValue");
        C19383o.m32797g(eVar, "animationSpec");
        C19383o.m32797g(lVar, "confirmStateChange");
        this.f2400q = z;
        if (z) {
            if (!(modalBottomSheetValue != ModalBottomSheetValue.HalfExpanded)) {
                throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
            }
        }
        this.f2401r = new SwipeableKt$PreUpPostDownNestedScrollConnection$1(this);
    }
}
