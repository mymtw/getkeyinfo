package kotlinx.coroutines.flow;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.foundation.layout.C0761x;
import kotlin.collections.C19327t;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p753kq.C19857l;

public final class StartedWhileSubscribed implements C19682v1 {

    /* renamed from: a */
    public final long f43557a;

    /* renamed from: b */
    public final long f43558b;

    public StartedWhileSubscribed(long j, long j2) {
        this.f43557a = j;
        this.f43558b = j2;
        boolean z = true;
        if (j >= 0) {
            if (!(j2 < 0 ? false : z)) {
                throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    /* renamed from: a */
    public final C19597d<SharingCommand> mo72322a(C19689x1<Integer> x1Var) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this, (C19340c<? super StartedWhileSubscribed$command$1>) null);
        int i = C19655n0.f43604a;
        return C0761x.m1689R(new C19607g0(new ChannelFlowTransformLatest(startedWhileSubscribed$command$1, x1Var, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND), new StartedWhileSubscribed$command$2((C19340c<? super StartedWhileSubscribed$command$2>) null)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            return this.f43557a == startedWhileSubscribed.f43557a && this.f43558b == startedWhileSubscribed.f43558b;
        }
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Long.hashCode(this.f43558b) + (Long.hashCode(this.f43557a) * 31);
    }

    public final String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        if (this.f43557a > 0) {
            StringBuilder h = C0072d.m201h("stopTimeout=");
            h.append(this.f43557a);
            h.append("ms");
            listBuilder.add(h.toString());
        }
        if (this.f43558b < Long.MAX_VALUE) {
            StringBuilder h2 = C0072d.m201h("replayExpiration=");
            h2.append(this.f43558b);
            h2.append("ms");
            listBuilder.add(h2.toString());
        }
        return C0391c.m1057c(C0072d.m201h("SharingStarted.WhileSubscribed("), C19327t.m32644Z0(listBuilder.build(), (String) null, (String) null, (String) null, (C19857l) null, 63), ')');
    }
}
