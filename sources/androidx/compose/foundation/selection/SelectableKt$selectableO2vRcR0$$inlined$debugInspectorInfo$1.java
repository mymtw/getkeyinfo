package androidx.compose.foundation.selection;

import androidx.compose.foundation.C0871p;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.semantics.C1900g;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SelectableKt$selectableO2vRcR0$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ C0871p $indication$inlined;
    public final /* synthetic */ C0640j $interactionSource$inlined;
    public final /* synthetic */ C19846a $onClick$inlined;
    public final /* synthetic */ C1900g $role$inlined;
    public final /* synthetic */ boolean $selected$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectableKt$selectableO2vRcR0$$inlined$debugInspectorInfo$1(boolean z, C0640j jVar, C0871p pVar, boolean z2, C1900g gVar, C19846a aVar) {
        super(1);
        this.$selected$inlined = z;
        this.$interactionSource$inlined = jVar;
        this.$indication$inlined = pVar;
        this.$enabled$inlined = z2;
        this.$role$inlined = gVar;
        this.$onClick$inlined = aVar;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$selected$inlined), ResponseConstants.SELECTED);
        o0Var.f4114b.mo7222b(this.$interactionSource$inlined, "interactionSource");
        o0Var.f4114b.mo7222b(this.$indication$inlined, "indication");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$enabled$inlined), ResponseConstants.ENABLED);
        o0Var.f4114b.mo7222b(this.$role$inlined, ResponseConstants.ROLE);
        o0Var.f4114b.mo7222b(this.$onClick$inlined, "onClick");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
