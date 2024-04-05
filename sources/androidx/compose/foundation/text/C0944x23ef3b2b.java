package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1 */
public final class C0944x23ef3b2b extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ C0640j $interactionSource$inlined;
    public final /* synthetic */ TextFieldScrollerPosition $scrollerPosition$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0944x23ef3b2b(TextFieldScrollerPosition textFieldScrollerPosition, C0640j jVar, boolean z) {
        super(1);
        this.$scrollerPosition$inlined = textFieldScrollerPosition;
        this.$interactionSource$inlined = jVar;
        this.$enabled$inlined = z;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$scrollerPosition$inlined, "scrollerPosition");
        o0Var.f4114b.mo7222b(this.$interactionSource$inlined, "interactionSource");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$enabled$inlined), ResponseConstants.ENABLED);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
