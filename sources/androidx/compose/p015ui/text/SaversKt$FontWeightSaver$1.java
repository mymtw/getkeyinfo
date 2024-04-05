package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.SaversKt$FontWeightSaver$1 */
public final class SaversKt$FontWeightSaver$1 extends Lambda implements C19861p<C1375i, C1959m, Object> {
    public static final SaversKt$FontWeightSaver$1 INSTANCE = new SaversKt$FontWeightSaver$1();

    public SaversKt$FontWeightSaver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, C1959m mVar) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(mVar, "it");
        return Integer.valueOf(mVar.f4417b);
    }
}
