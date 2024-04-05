package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SnapshotStateList$retainAll$1 extends Lambda implements C19857l<List<T>, Boolean> {
    public final /* synthetic */ Collection<T> $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateList$retainAll$1(Collection<? extends T> collection) {
        super(1);
        this.$elements = collection;
    }

    public final Boolean invoke(List<T> list) {
        C19383o.m32797g(list, "it");
        return Boolean.valueOf(list.retainAll(this.$elements));
    }
}
