package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.C19394m;
import p753kq.C19861p;

/* renamed from: androidx.compose.runtime.snapshots.e */
public final class C1384e implements C1382c {

    /* renamed from: a */
    public final /* synthetic */ C19861p<Set<? extends Object>, C1385f, C19394m> f3025a;

    public C1384e(C19861p<? super Set<? extends Object>, ? super C1385f, C19394m> pVar) {
        this.f3025a = pVar;
    }

    public final void dispose() {
        C19861p<Set<? extends Object>, C1385f, C19394m> pVar = this.f3025a;
        synchronized (SnapshotKt.f2989c) {
            SnapshotKt.f2993g.remove(pVar);
            C19394m mVar = C19394m.f43287a;
        }
    }
}
