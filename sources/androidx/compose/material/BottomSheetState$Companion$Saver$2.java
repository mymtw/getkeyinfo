package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class BottomSheetState$Companion$Saver$2 extends Lambda implements C19857l<BottomSheetValue, C1211m> {
    public final /* synthetic */ C0422e<Float> $animationSpec;
    public final /* synthetic */ C19857l<BottomSheetValue, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetState$Companion$Saver$2(C0422e<Float> eVar, C19857l<? super BottomSheetValue, Boolean> lVar) {
        super(1);
        this.$animationSpec = eVar;
        this.$confirmStateChange = lVar;
    }

    public final C1211m invoke(BottomSheetValue bottomSheetValue) {
        C19383o.m32797g(bottomSheetValue, "it");
        return new C1211m(bottomSheetValue, this.$animationSpec, this.$confirmStateChange);
    }
}
