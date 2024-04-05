package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p219r.C7733d;
import p219r.C7734e;
import p753kq.C19846a;
import p753kq.C19861p;

public final class SnapshotStateObserver$applyObserver$1 extends Lambda implements C19861p<Set<? extends Object>, C1385f, C19394m> {
    public final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.this$0 = snapshotStateObserver;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) (Set) obj, (C1385f) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(Set<? extends Object> set, C1385f fVar) {
        int i;
        C19383o.m32797g(set, "applied");
        C19383o.m32797g(fVar, "<anonymous parameter 1>");
        SnapshotStateObserver snapshotStateObserver = this.this$0;
        synchronized (snapshotStateObserver.f3002d) {
            C7734e<SnapshotStateObserver.C1377a<?>> eVar = snapshotStateObserver.f3002d;
            int i2 = eVar.f17157d;
            i = 0;
            if (i2 > 0) {
                T[] tArr = eVar.f17155b;
                int i3 = 0;
                do {
                    SnapshotStateObserver.C1377a aVar = (SnapshotStateObserver.C1377a) tArr[i];
                    HashSet<Object> hashSet = aVar.f3008c;
                    C7733d<T> dVar = aVar.f3007b;
                    for (Object c : set) {
                        int c2 = dVar.mo20227c(c);
                        if (c2 >= 0) {
                            for (T add : dVar.mo20230f(c2)) {
                                hashSet.add(add);
                                i3 = 1;
                            }
                        }
                    }
                    i++;
                } while (i < i2);
                i = i3;
            }
            C19394m mVar = C19394m.f43287a;
        }
        if (i != 0) {
            final SnapshotStateObserver snapshotStateObserver2 = this.this$0;
            snapshotStateObserver2.f2999a.invoke(new C19846a<C19394m>() {
                public final void invoke() {
                    C7734e<SnapshotStateObserver.C1377a<?>> eVar = snapshotStateObserver2.f3002d;
                    int i = eVar.f17157d;
                    if (i > 0) {
                        int i2 = 0;
                        T[] tArr = eVar.f17155b;
                        do {
                            SnapshotStateObserver.C1377a aVar = (SnapshotStateObserver.C1377a) tArr[i2];
                            HashSet<Object> hashSet = aVar.f3008c;
                            if (!hashSet.isEmpty()) {
                                Iterator<Object> it = hashSet.iterator();
                                while (it.hasNext()) {
                                    aVar.f3006a.invoke(it.next());
                                }
                                hashSet.clear();
                            }
                            i2++;
                        } while (i2 < i);
                    }
                }
            });
        }
    }
}
