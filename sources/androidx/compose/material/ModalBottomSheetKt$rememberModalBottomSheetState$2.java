package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class ModalBottomSheetKt$rememberModalBottomSheetState$2 extends Lambda implements C19846a<C1177d1> {
    public final /* synthetic */ C0422e<Float> $animationSpec;
    public final /* synthetic */ C19857l<ModalBottomSheetValue, Boolean> $confirmStateChange;
    public final /* synthetic */ ModalBottomSheetValue $initialValue;
    public final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$rememberModalBottomSheetState$2(ModalBottomSheetValue modalBottomSheetValue, C0422e<Float> eVar, boolean z, C19857l<? super ModalBottomSheetValue, Boolean> lVar) {
        super(0);
        this.$initialValue = modalBottomSheetValue;
        this.$animationSpec = eVar;
        this.$skipHalfExpanded = z;
        this.$confirmStateChange = lVar;
    }

    public final C1177d1 invoke() {
        return new C1177d1(this.$initialValue, this.$animationSpec, this.$skipHalfExpanded, this.$confirmStateChange);
    }
}
