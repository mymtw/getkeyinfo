package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class BroadcastKt$broadcast$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C19515q<Object> $this_broadcast;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastKt$broadcast$1(C19515q<Object> qVar) {
        super(1);
        this.$this_broadcast = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19388s.m32827J(this.$this_broadcast, th);
    }
}
