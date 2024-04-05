package androidx.compose.foundation;

import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.semantics.C1909p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19857l;

public final class MagnifierKt$magnifier$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C19857l $magnifierCenter$inlined;
    public final /* synthetic */ C19857l $sourceCenter$inlined;
    public final /* synthetic */ C0894t $style$inlined;
    public final /* synthetic */ float $zoom$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$$inlined$debugInspectorInfo$1(C19857l lVar, C19857l lVar2, float f, C0894t tVar) {
        super(1);
        this.$sourceCenter$inlined = lVar;
        this.$magnifierCenter$inlined = lVar2;
        this.$zoom$inlined = f;
        this.$style$inlined = tVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        C1909p<C19846a<C8343c>> pVar = C0885s.f1894a;
        o0Var.f4114b.mo7222b(this.$sourceCenter$inlined, "sourceCenter");
        o0Var.f4114b.mo7222b(this.$magnifierCenter$inlined, "magnifierCenter");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$zoom$inlined), "zoom");
        o0Var.f4114b.mo7222b(this.$style$inlined, "style");
    }
}
