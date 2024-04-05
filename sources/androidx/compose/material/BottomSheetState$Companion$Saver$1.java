package androidx.compose.material;

import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class BottomSheetState$Companion$Saver$1 extends Lambda implements C19861p<C1375i, C1211m, BottomSheetValue> {
    public static final BottomSheetState$Companion$Saver$1 INSTANCE = new BottomSheetState$Companion$Saver$1();

    public BottomSheetState$Companion$Saver$1() {
        super(2);
    }

    public final BottomSheetValue invoke(C1375i iVar, C1211m mVar) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(mVar, "it");
        return (BottomSheetValue) mVar.mo5116d();
    }
}
