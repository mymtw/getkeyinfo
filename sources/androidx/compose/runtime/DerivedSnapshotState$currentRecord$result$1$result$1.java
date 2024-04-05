package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.C1406w;
import java.util.HashSet;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class DerivedSnapshotState$currentRecord$result$1$result$1 extends Lambda implements C19857l<Object, C19394m> {
    public final /* synthetic */ HashSet<C1406w> $newDependencies;
    public final /* synthetic */ DerivedSnapshotState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DerivedSnapshotState$currentRecord$result$1$result$1(DerivedSnapshotState<T> derivedSnapshotState, HashSet<C1406w> hashSet) {
        super(1);
        this.this$0 = derivedSnapshotState;
        this.$newDependencies = hashSet;
    }

    public final void invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        if (obj == this.this$0) {
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        } else if (obj instanceof C1406w) {
            this.$newDependencies.add(obj);
        }
    }
}
