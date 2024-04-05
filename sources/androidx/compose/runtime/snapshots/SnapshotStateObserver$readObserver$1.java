package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p219r.C7733d;
import p753kq.C19857l;

public final class SnapshotStateObserver$readObserver$1 extends Lambda implements C19857l<Object, C19394m> {
    public final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$readObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(1);
        this.this$0 = snapshotStateObserver;
    }

    public final void invoke(Object obj) {
        C19383o.m32797g(obj, "state");
        SnapshotStateObserver snapshotStateObserver = this.this$0;
        if (!snapshotStateObserver.f3004f) {
            synchronized (snapshotStateObserver.f3002d) {
                SnapshotStateObserver.C1377a<?> aVar = snapshotStateObserver.f3005g;
                C19383o.m32794d(aVar);
                C7733d<T> dVar = aVar.f3007b;
                T t = aVar.f3009d;
                C19383o.m32794d(t);
                dVar.mo20225a(obj, t);
                C19394m mVar = C19394m.f43287a;
            }
        }
    }
}
