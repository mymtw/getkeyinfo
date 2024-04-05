package androidx.compose.foundation;

import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.semantics.C1900g;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1 */
public final class C0496xb24c8e05 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ C19846a $onClick$inlined;
    public final /* synthetic */ String $onClickLabel$inlined;
    public final /* synthetic */ C19846a $onDoubleClick$inlined;
    public final /* synthetic */ C19846a $onLongClick$inlined;
    public final /* synthetic */ String $onLongClickLabel$inlined;
    public final /* synthetic */ C1900g $role$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0496xb24c8e05(boolean z, String str, C1900g gVar, C19846a aVar, C19846a aVar2, C19846a aVar3, String str2) {
        super(1);
        this.$enabled$inlined = z;
        this.$onClickLabel$inlined = str;
        this.$role$inlined = gVar;
        this.$onClick$inlined = aVar;
        this.$onDoubleClick$inlined = aVar2;
        this.$onLongClick$inlined = aVar3;
        this.$onLongClickLabel$inlined = str2;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$enabled$inlined), ResponseConstants.ENABLED);
        o0Var.f4114b.mo7222b(this.$onClickLabel$inlined, "onClickLabel");
        o0Var.f4114b.mo7222b(this.$role$inlined, ResponseConstants.ROLE);
        o0Var.f4114b.mo7222b(this.$onClick$inlined, "onClick");
        o0Var.f4114b.mo7222b(this.$onDoubleClick$inlined, "onDoubleClick");
        o0Var.f4114b.mo7222b(this.$onLongClick$inlined, "onLongClick");
        o0Var.f4114b.mo7222b(this.$onLongClickLabel$inlined, "onLongClickLabel");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
