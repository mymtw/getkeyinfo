package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0069a;
import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ float $maxHeight$inlined;
    public final /* synthetic */ float $maxWidth$inlined;
    public final /* synthetic */ float $minHeight$inlined;
    public final /* synthetic */ float $minWidth$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(float f, float f2, float f3, float f4) {
        super(1);
        this.$minWidth$inlined = f;
        this.$minHeight$inlined = f2;
        this.$maxWidth$inlined = f3;
        this.$maxHeight$inlined = f4;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        C0069a.m179j(this.$minWidth$inlined, o0Var.f4114b, "minWidth");
        C0069a.m179j(this.$minHeight$inlined, o0Var.f4114b, "minHeight");
        C0069a.m179j(this.$maxWidth$inlined, o0Var.f4114b, "maxWidth");
        C0069a.m179j(this.$maxHeight$inlined, o0Var.f4114b, "maxHeight");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
