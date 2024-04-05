package androidx.compose.runtime.snapshots;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class GlobalSnapshot$takeNestedSnapshot$1 extends Lambda implements C19857l<SnapshotIdSet, C1383d> {
    public final /* synthetic */ C19857l<Object, C19394m> $readObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedSnapshot$1(C19857l<Object, C19394m> lVar) {
        super(1);
        this.$readObserver = lVar;
    }

    public final C1383d invoke(SnapshotIdSet snapshotIdSet) {
        int i;
        C19383o.m32797g(snapshotIdSet, "invalid");
        synchronized (SnapshotKt.f2989c) {
            i = SnapshotKt.f2991e;
            SnapshotKt.f2991e = i + 1;
        }
        return new C1383d(i, snapshotIdSet, this.$readObserver);
    }
}
