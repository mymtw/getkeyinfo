package androidx.compose.runtime;

import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 extends Lambda implements C19857l<Object, C19394m> {
    public final /* synthetic */ Set<Object> $readSet;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1(Set<Object> set) {
        super(1);
        this.$readSet = set;
    }

    public final void invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        this.$readSet.add(obj);
    }
}
