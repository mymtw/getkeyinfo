package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.painter.Painter;
import androidx.compose.p015ui.layout.C1670c;
import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.draw.PainterModifierKt$paint$$inlined$debugInspectorInfo$1 */
public final class PainterModifierKt$paint$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C1428a $alignment$inlined;
    public final /* synthetic */ float $alpha$inlined;
    public final /* synthetic */ C1546t $colorFilter$inlined;
    public final /* synthetic */ C1670c $contentScale$inlined;
    public final /* synthetic */ Painter $painter$inlined;
    public final /* synthetic */ boolean $sizeToIntrinsics$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PainterModifierKt$paint$$inlined$debugInspectorInfo$1(Painter painter, boolean z, C1428a aVar, C1670c cVar, float f, C1546t tVar) {
        super(1);
        this.$painter$inlined = painter;
        this.$sizeToIntrinsics$inlined = z;
        this.$alignment$inlined = aVar;
        this.$contentScale$inlined = cVar;
        this.$alpha$inlined = f;
        this.$colorFilter$inlined = tVar;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$painter$inlined, "painter");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$sizeToIntrinsics$inlined), "sizeToIntrinsics");
        o0Var.f4114b.mo7222b(this.$alignment$inlined, ResponseConstants.ALIGNMENT);
        o0Var.f4114b.mo7222b(this.$contentScale$inlined, "contentScale");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$alpha$inlined), "alpha");
        o0Var.f4114b.mo7222b(this.$colorFilter$inlined, "colorFilter");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
