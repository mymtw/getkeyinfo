package androidx.compose.p015ui.node;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1 */
public final class OwnerSnapshotObserver$clearInvalidObservations$1 extends Lambda implements C19857l<Object, Boolean> {
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 INSTANCE = new OwnerSnapshotObserver$clearInvalidObservations$1();

    public OwnerSnapshotObserver$clearInvalidObservations$1() {
        super(1);
    }

    public final Boolean invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        return Boolean.valueOf(!((C1752q) obj).isValid());
    }
}
