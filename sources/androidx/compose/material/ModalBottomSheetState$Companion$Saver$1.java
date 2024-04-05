package androidx.compose.material;

import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class ModalBottomSheetState$Companion$Saver$1 extends Lambda implements C19861p<C1375i, C1177d1, ModalBottomSheetValue> {
    public static final ModalBottomSheetState$Companion$Saver$1 INSTANCE = new ModalBottomSheetState$Companion$Saver$1();

    public ModalBottomSheetState$Companion$Saver$1() {
        super(2);
    }

    public final ModalBottomSheetValue invoke(C1375i iVar, C1177d1 d1Var) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(d1Var, "it");
        return (ModalBottomSheetValue) d1Var.mo5116d();
    }
}
