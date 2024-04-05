package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19857l;

public final class BroadcastFrameClock$withFrameNanos$2$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Ref$ObjectRef<BroadcastFrameClock.C1275a<R>> $awaiter;
    public final /* synthetic */ BroadcastFrameClock this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastFrameClock$withFrameNanos$2$1(BroadcastFrameClock broadcastFrameClock, Ref$ObjectRef<BroadcastFrameClock.C1275a<R>> ref$ObjectRef) {
        super(1);
        this.this$0 = broadcastFrameClock;
        this.$awaiter = ref$ObjectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        BroadcastFrameClock broadcastFrameClock = this.this$0;
        Object obj = broadcastFrameClock.f2683c;
        Ref$ObjectRef<BroadcastFrameClock.C1275a<R>> ref$ObjectRef = this.$awaiter;
        synchronized (obj) {
            List<BroadcastFrameClock.C1275a<?>> list = broadcastFrameClock.f2685e;
            T t = ref$ObjectRef.element;
            if (t != null) {
                list.remove((BroadcastFrameClock.C1275a) t);
                C19394m mVar = C19394m.f43287a;
            } else {
                C19383o.m32805o("awaiter");
                throw null;
            }
        }
    }
}
