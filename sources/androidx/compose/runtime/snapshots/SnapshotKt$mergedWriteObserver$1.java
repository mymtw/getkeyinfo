package androidx.compose.runtime.snapshots;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SnapshotKt$mergedWriteObserver$1 extends Lambda implements C19857l<Object, C19394m> {
    public final /* synthetic */ C19857l<Object, C19394m> $parentObserver;
    public final /* synthetic */ C19857l<Object, C19394m> $writeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotKt$mergedWriteObserver$1(C19857l<Object, C19394m> lVar, C19857l<Object, C19394m> lVar2) {
        super(1);
        this.$writeObserver = lVar;
        this.$parentObserver = lVar2;
    }

    public final void invoke(Object obj) {
        C19383o.m32797g(obj, "state");
        this.$writeObserver.invoke(obj);
        this.$parentObserver.invoke(obj);
    }
}
