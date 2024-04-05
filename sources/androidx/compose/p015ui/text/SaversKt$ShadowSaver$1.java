package androidx.compose.p015ui.text;

import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p568fn.C17782b;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.SaversKt$ShadowSaver$1 */
public final class SaversKt$ShadowSaver$1 extends Lambda implements C19861p<C1375i, C1528j0, Object> {
    public static final SaversKt$ShadowSaver$1 INSTANCE = new SaversKt$ShadowSaver$1();

    public SaversKt$ShadowSaver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, C1528j0 j0Var) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(j0Var, "it");
        return C17782b.m29888u(SaversKt.m4209a(new C1545s(j0Var.f3323a), SaversKt.f4289n, iVar), SaversKt.m4209a(new C8343c(j0Var.f3324b), SaversKt.f4291p, iVar), Float.valueOf(j0Var.f3325c));
    }
}
