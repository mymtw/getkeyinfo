package androidx.compose.foundation.selection;

import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.semantics.C1900g;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ C19857l $onValueChange$inlined;
    public final /* synthetic */ C1900g $role$inlined;
    public final /* synthetic */ boolean $value$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(boolean z, boolean z2, C1900g gVar, C19857l lVar) {
        super(1);
        this.$value$inlined = z;
        this.$enabled$inlined = z2;
        this.$role$inlined = gVar;
        this.$onValueChange$inlined = lVar;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$value$inlined), "value");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$enabled$inlined), ResponseConstants.ENABLED);
        o0Var.f4114b.mo7222b(this.$role$inlined, ResponseConstants.ROLE);
        o0Var.f4114b.mo7222b(this.$onValueChange$inlined, "onValueChange");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
