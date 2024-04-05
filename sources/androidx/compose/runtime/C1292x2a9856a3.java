package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.C1385f;
import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.C19499d;
import p753kq.C19861p;

/* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 */
public final class C1292x2a9856a3 extends Lambda implements C19861p<Set<? extends Object>, C1385f, C19394m> {
    public final /* synthetic */ C19499d<Set<Object>> $appliedChanges;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1292x2a9856a3(C19499d<Set<Object>> dVar) {
        super(2);
        this.$appliedChanges = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) (Set) obj, (C1385f) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(Set<? extends Object> set, C1385f fVar) {
        C19383o.m32797g(set, "changed");
        C19383o.m32797g(fVar, "<anonymous parameter 1>");
        this.$appliedChanges.mo72199l(set);
    }
}
