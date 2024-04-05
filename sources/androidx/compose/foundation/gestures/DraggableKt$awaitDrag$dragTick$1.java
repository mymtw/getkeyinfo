package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C0601c;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1644p;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.C19519u;
import p087e0.C6687f;
import p288y.C8343c;
import p753kq.C19857l;

final class DraggableKt$awaitDrag$dragTick$1 extends Lambda implements C19857l<C1644p, C19394m> {
    public final /* synthetic */ C19519u<C0601c> $channel;
    public final /* synthetic */ Orientation $orientation;
    public final /* synthetic */ boolean $reverseDirection;
    public final /* synthetic */ C6687f $velocityTracker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDrag$dragTick$1(C6687f fVar, Orientation orientation, C19519u<? super C0601c> uVar, boolean z) {
        super(1);
        this.$velocityTracker = fVar;
        this.$orientation = orientation;
        this.$channel = uVar;
        this.$reverseDirection = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1644p) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1644p pVar) {
        C19383o.m32797g(pVar, "event");
        C0761x.m1748v(this.$velocityTracker, pVar);
        long U = C15562d.m25183U(pVar);
        float d = this.$orientation == Orientation.Vertical ? C8343c.m16643d(U) : C8343c.m16642c(U);
        pVar.mo6614a();
        C19519u<C0601c> uVar = this.$channel;
        if (this.$reverseDirection) {
            d *= (float) -1;
        }
        uVar.mo72199l(new C0601c.C0603b(d, pVar.f3658c));
    }
}
