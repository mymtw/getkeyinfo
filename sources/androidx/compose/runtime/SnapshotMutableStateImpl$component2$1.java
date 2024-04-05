package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SnapshotMutableStateImpl$component2$1 extends Lambda implements C19857l<T, C19394m> {
    public final /* synthetic */ SnapshotMutableStateImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotMutableStateImpl$component2$1(SnapshotMutableStateImpl<T> snapshotMutableStateImpl) {
        super(1);
        this.this$0 = snapshotMutableStateImpl;
    }

    public final void invoke(T t) {
        this.this$0.setValue(t);
    }
}
