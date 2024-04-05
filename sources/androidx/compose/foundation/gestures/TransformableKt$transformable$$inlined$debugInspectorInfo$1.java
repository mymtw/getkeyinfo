package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class TransformableKt$transformable$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ boolean $lockRotationOnZoomPan$inlined;
    public final /* synthetic */ C0619q $state$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableKt$transformable$$inlined$debugInspectorInfo$1(C0619q qVar, boolean z, boolean z2) {
        super(1);
        this.$state$inlined = qVar;
        this.$enabled$inlined = z;
        this.$lockRotationOnZoomPan$inlined = z2;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$state$inlined, "state");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$enabled$inlined), ResponseConstants.ENABLED);
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$lockRotationOnZoomPan$inlined), "lockRotationOnZoomPan");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
