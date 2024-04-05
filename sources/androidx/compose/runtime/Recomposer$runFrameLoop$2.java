package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.snapshots.C1406w;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19747k;
import p219r.C7731c;
import p753kq.C19857l;

final class Recomposer$runFrameLoop$2 extends Lambda implements C19857l<Long, C19747k<? super C19394m>> {
    public final /* synthetic */ C1355p0 $frameSignal;
    public final /* synthetic */ List<C1349n> $toApply;
    public final /* synthetic */ List<C1349n> $toRecompose;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$2(Recomposer recomposer, List<C1349n> list, List<C1349n> list2, C1355p0 p0Var) {
        super(1);
        this.this$0 = recomposer;
        this.$toRecompose = list;
        this.$toApply = list2;
        this.$frameSignal = p0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final C19747k<C19394m> invoke(long j) {
        C19747k<C19394m> z;
        boolean z2;
        if (this.this$0.f2772a.mo5382c()) {
            Recomposer recomposer = this.this$0;
            Trace.beginSection("Recomposer:animation");
            try {
                recomposer.f2772a.mo5385i(j);
                synchronized (SnapshotKt.f2989c) {
                    Set<C1406w> set = SnapshotKt.f2995i.get().f3012g;
                    z2 = set != null && (set.isEmpty() ^ true);
                }
                if (z2) {
                    SnapshotKt.m2902a();
                }
                C19394m mVar = C19394m.f43287a;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        Recomposer recomposer2 = this.this$0;
        List<C1349n> list = this.$toRecompose;
        List<C1349n> list2 = this.$toApply;
        C1355p0 p0Var = this.$frameSignal;
        Trace.beginSection("Recomposer:recompose");
        try {
            synchronized (recomposer2.f2775d) {
                Recomposer.m2546v(recomposer2);
                ArrayList arrayList = recomposer2.f2781j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list2.add((C1349n) arrayList.get(i));
                }
                recomposer2.f2781j.clear();
                ArrayList arrayList2 = recomposer2.f2780i;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    list.add((C1349n) arrayList2.get(i2));
                }
                recomposer2.f2780i.clear();
                if (p0Var.f2953a == C1420w0.f3088b) {
                    p0Var.f2953a = null;
                    C19394m mVar2 = C19394m.f43287a;
                } else {
                    throw new IllegalStateException("frame not pending".toString());
                }
            }
            C7731c cVar = new C7731c();
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C1349n u = Recomposer.m2545u(recomposer2, list.get(i3), cVar);
                if (u != null) {
                    list2.add(u);
                }
            }
            list.clear();
            boolean z3 = !list2.isEmpty();
            int size4 = list2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                list2.get(i4).mo5810k();
            }
            list2.clear();
            synchronized (recomposer2.f2775d) {
                z = recomposer2.mo5576z();
            }
            Trace.endSection();
            return z;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
