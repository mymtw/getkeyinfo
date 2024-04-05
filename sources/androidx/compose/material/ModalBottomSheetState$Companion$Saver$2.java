package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class ModalBottomSheetState$Companion$Saver$2 extends Lambda implements C19857l<ModalBottomSheetValue, C1177d1> {
    public final /* synthetic */ C0422e<Float> $animationSpec;
    public final /* synthetic */ C19857l<ModalBottomSheetValue, Boolean> $confirmStateChange;
    public final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$Companion$Saver$2(C0422e<Float> eVar, boolean z, C19857l<? super ModalBottomSheetValue, Boolean> lVar) {
        super(1);
        this.$animationSpec = eVar;
        this.$skipHalfExpanded = z;
        this.$confirmStateChange = lVar;
    }

    public final C1177d1 invoke(ModalBottomSheetValue modalBottomSheetValue) {
        C19383o.m32797g(modalBottomSheetValue, "it");
        return new C1177d1(modalBottomSheetValue, this.$animationSpec, this.$skipHalfExpanded, this.$confirmStateChange);
    }
}
