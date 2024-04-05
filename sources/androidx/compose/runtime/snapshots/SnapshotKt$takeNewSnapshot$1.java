package androidx.compose.runtime.snapshots;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SnapshotKt$takeNewSnapshot$1 extends Lambda implements C19857l<SnapshotIdSet, Object> {
    public final /* synthetic */ C19857l<SnapshotIdSet, Object> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotKt$takeNewSnapshot$1(C19857l<? super SnapshotIdSet, Object> lVar) {
        super(1);
        this.$block = lVar;
    }

    public final Object invoke(SnapshotIdSet snapshotIdSet) {
        C19383o.m32797g(snapshotIdSet, "invalid");
        C1385f fVar = (C1385f) this.$block.invoke(snapshotIdSet);
        synchronized (SnapshotKt.f2989c) {
            SnapshotKt.f2990d = SnapshotKt.f2990d.mo5949l(fVar.mo5996d());
            C19394m mVar = C19394m.f43287a;
        }
        return fVar;
    }
}
