package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.snapshots.C1400q;
import java.util.ListIterator;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class Transition$totalDurationNanos$2 extends Lambda implements C19846a<Long> {
    public final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transition$totalDurationNanos$2(Transition<S> transition) {
        super(0);
        this.this$0 = transition;
    }

    public final Long invoke() {
        ListIterator<Transition<S>.d<?, ?>> listIterator = this.this$0.f1042h.listIterator();
        long j = 0;
        while (true) {
            C1400q qVar = (C1400q) listIterator;
            if (!qVar.hasNext()) {
                break;
            }
            j = Math.max(j, ((Transition.C0404d) qVar.next()).mo3423d().f1143h);
        }
        ListIterator<Transition<?>> listIterator2 = this.this$0.f1043i.listIterator();
        while (true) {
            C1400q qVar2 = (C1400q) listIterator2;
            if (!qVar2.hasNext()) {
                return Long.valueOf(j);
            }
            j = Math.max(j, ((Number) ((Transition) qVar2.next()).f1046l.getValue()).longValue());
        }
    }
}
