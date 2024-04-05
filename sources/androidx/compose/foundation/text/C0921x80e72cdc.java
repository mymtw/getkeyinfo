package androidx.compose.foundation.text;

import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.text.C2023s;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.text.MaxLinesHeightModifierKt$maxLinesHeight$$inlined$debugInspectorInfo$1 */
public final class C0921x80e72cdc extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ int $maxLines$inlined;
    public final /* synthetic */ C2023s $textStyle$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0921x80e72cdc(int i, C2023s sVar) {
        super(1);
        this.$maxLines$inlined = i;
        this.$textStyle$inlined = sVar;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(Integer.valueOf(this.$maxLines$inlined), "maxLines");
        o0Var.f4114b.mo7222b(this.$textStyle$inlined, "textStyle");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
