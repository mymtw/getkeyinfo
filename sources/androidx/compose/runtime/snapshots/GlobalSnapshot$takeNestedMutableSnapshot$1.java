package androidx.compose.runtime.snapshots;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class GlobalSnapshot$takeNestedMutableSnapshot$1 extends Lambda implements C19857l<SnapshotIdSet, C1379a> {
    public final /* synthetic */ C19857l<Object, C19394m> $readObserver;
    public final /* synthetic */ C19857l<Object, C19394m> $writeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedMutableSnapshot$1(C19857l<Object, C19394m> lVar, C19857l<Object, C19394m> lVar2) {
        super(1);
        this.$readObserver = lVar;
        this.$writeObserver = lVar2;
    }

    public final C1379a invoke(SnapshotIdSet snapshotIdSet) {
        int i;
        C19383o.m32797g(snapshotIdSet, "invalid");
        synchronized (SnapshotKt.f2989c) {
            i = SnapshotKt.f2991e;
            SnapshotKt.f2991e = i + 1;
        }
        return new C1379a(i, snapshotIdSet, this.$readObserver, this.$writeObserver);
    }
}
