package androidx.compose.material;

import android.support.p013v4.media.C0069a;
import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1 */
public final class C1158x343b27c2 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C1166a2 $colors$inlined;
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ float $focusedIndicatorLineThickness$inlined;
    public final /* synthetic */ C0639i $interactionSource$inlined;
    public final /* synthetic */ boolean $isError$inlined;
    public final /* synthetic */ float $unfocusedIndicatorLineThickness$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1158x343b27c2(boolean z, boolean z2, C0639i iVar, C1166a2 a2Var, float f, float f2) {
        super(1);
        this.$enabled$inlined = z;
        this.$isError$inlined = z2;
        this.$interactionSource$inlined = iVar;
        this.$colors$inlined = a2Var;
        this.$focusedIndicatorLineThickness$inlined = f;
        this.$unfocusedIndicatorLineThickness$inlined = f2;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$enabled$inlined), ResponseConstants.ENABLED);
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$isError$inlined), "isError");
        o0Var.f4114b.mo7222b(this.$interactionSource$inlined, "interactionSource");
        o0Var.f4114b.mo7222b(this.$colors$inlined, "colors");
        C0069a.m179j(this.$focusedIndicatorLineThickness$inlined, o0Var.f4114b, "focusedIndicatorLineThickness");
        C0069a.m179j(this.$unfocusedIndicatorLineThickness$inlined, o0Var.f4114b, "unfocusedIndicatorLineThickness");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
