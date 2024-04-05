package androidx.compose.p015ui.tooling.animation;

import androidx.compose.animation.core.C0414b0;
import androidx.compose.animation.core.C0423e0;
import androidx.compose.animation.core.C0425f0;
import androidx.compose.animation.core.C0432j;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0447q0;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.C0466z;
import androidx.compose.animation.core.Transition;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.tooling.animation.PreviewAnimationClock$createTransitionInfo$startTimeMs$2 */
final class PreviewAnimationClock$createTransitionInfo$startTimeMs$2 extends Lambda implements C19846a<Long> {
    public final /* synthetic */ Transition<Object>.d<Object, C0432j> $this_createTransitionInfo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewAnimationClock$createTransitionInfo$startTimeMs$2(Transition<Object>.d<Object, C0432j> dVar) {
        super(0);
        this.$this_createTransitionInfo = dVar;
    }

    public final Long invoke() {
        Number number;
        boolean z;
        C0454t<Object> e = this.$this_createTransitionInfo.mo3424e();
        if (e instanceof C0433j0) {
            number = Integer.valueOf(((C0433j0) e).f1146b);
        } else if (e instanceof C0425f0) {
            number = Integer.valueOf(((C0425f0) e).f1115a);
        } else {
            boolean z2 = false;
            if (e instanceof C0414b0) {
                ((C0414b0) e).f1086a.getClass();
                number = 0;
            } else if (e instanceof C0423e0) {
                ((C0423e0) e).getClass();
                number = Integer.valueOf(Math.abs((int) 0));
            } else if (e instanceof C0466z) {
                long j = ((C0466z) e).f1202c;
                boolean z3 = j > 0;
                if (z3) {
                    z = true;
                } else if (!z3) {
                    z = true;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (z) {
                    z2 = true;
                }
                if (z2) {
                    number = Integer.valueOf(Math.abs((int) j));
                } else {
                    number = 0L;
                }
            } else if (e instanceof C0447q0) {
                number = Integer.valueOf(((C0447q0) e).mo3526c());
            } else {
                number = 0L;
            }
        }
        return Long.valueOf(number.longValue());
    }
}
