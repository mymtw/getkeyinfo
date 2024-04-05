package androidx.compose.foundation;

import android.support.p013v4.media.C0069a;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1532l0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C1533m $brush$inlined;
    public final /* synthetic */ C1530k0 $shape$inlined;
    public final /* synthetic */ float $width$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1(float f, C1533m mVar, C1530k0 k0Var) {
        super(1);
        this.$width$inlined = f;
        this.$brush$inlined = mVar;
        this.$shape$inlined = k0Var;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        C0069a.m179j(this.$width$inlined, o0Var.f4114b, ResponseConstants.WIDTH);
        C1533m mVar = this.$brush$inlined;
        if (mVar instanceof C1532l0) {
            o0Var.f4114b.mo7222b(new C1545s(((C1532l0) mVar).f3331a), "color");
            long j = ((C1532l0) this.$brush$inlined).f3331a;
        } else {
            o0Var.f4114b.mo7222b(mVar, "brush");
        }
        o0Var.f4114b.mo7222b(this.$shape$inlined, "shape");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
