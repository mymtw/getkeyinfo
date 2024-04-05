package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class DraggableKt$draggable$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C19857l $canDrag$inlined;
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ C0640j $interactionSource$inlined;
    public final /* synthetic */ C19862q $onDragStarted$inlined;
    public final /* synthetic */ C19862q $onDragStopped$inlined;
    public final /* synthetic */ Orientation $orientation$inlined;
    public final /* synthetic */ boolean $reverseDirection$inlined;
    public final /* synthetic */ C19846a $startDragImmediately$inlined;
    public final /* synthetic */ C19861p $stateFactory$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$$inlined$debugInspectorInfo$1(C19857l lVar, Orientation orientation, boolean z, boolean z2, C0640j jVar, C19846a aVar, C19862q qVar, C19862q qVar2, C19861p pVar) {
        super(1);
        this.$canDrag$inlined = lVar;
        this.$orientation$inlined = orientation;
        this.$enabled$inlined = z;
        this.$reverseDirection$inlined = z2;
        this.$interactionSource$inlined = jVar;
        this.$startDragImmediately$inlined = aVar;
        this.$onDragStarted$inlined = qVar;
        this.$onDragStopped$inlined = qVar2;
        this.$stateFactory$inlined = pVar;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$canDrag$inlined, "canDrag");
        o0Var.f4114b.mo7222b(this.$orientation$inlined, "orientation");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$enabled$inlined), ResponseConstants.ENABLED);
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$reverseDirection$inlined), "reverseDirection");
        o0Var.f4114b.mo7222b(this.$interactionSource$inlined, "interactionSource");
        o0Var.f4114b.mo7222b(this.$startDragImmediately$inlined, "startDragImmediately");
        o0Var.f4114b.mo7222b(this.$onDragStarted$inlined, "onDragStarted");
        o0Var.f4114b.mo7222b(this.$onDragStopped$inlined, "onDragStopped");
        o0Var.f4114b.mo7222b(this.$stateFactory$inlined, "stateFactory");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
