package androidx.compose.p015ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p219r.C7731c;
import p219r.C7733d;
import p219r.C7734e;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver */
public final class OwnerSnapshotObserver {

    /* renamed from: a */
    public final SnapshotStateObserver f3885a;

    /* renamed from: b */
    public final C19857l<LayoutNode, C19394m> f3886b = OwnerSnapshotObserver$onCommitAffectingMeasure$1.INSTANCE;

    /* renamed from: c */
    public final C19857l<LayoutNode, C19394m> f3887c = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;

    /* renamed from: d */
    public final C19857l<LayoutNode, C19394m> f3888d = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.INSTANCE;

    public OwnerSnapshotObserver(C19857l<? super C19846a<C19394m>, C19394m> lVar) {
        this.f3885a = new SnapshotStateObserver(lVar);
    }

    /* renamed from: a */
    public final void mo6823a() {
        T[] tArr;
        SnapshotStateObserver snapshotStateObserver = this.f3885a;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = OwnerSnapshotObserver$clearInvalidObservations$1.INSTANCE;
        snapshotStateObserver.getClass();
        C19383o.m32797g(ownerSnapshotObserver$clearInvalidObservations$1, "predicate");
        synchronized (snapshotStateObserver.f3002d) {
            C7734e<SnapshotStateObserver.C1377a<?>> eVar = snapshotStateObserver.f3002d;
            int i = eVar.f17157d;
            if (i > 0) {
                T[] tArr2 = eVar.f17155b;
                int i2 = 0;
                while (true) {
                    C7733d<T> dVar = ((SnapshotStateObserver.C1377a) tArr2[i2]).f3007b;
                    int i3 = dVar.f17154d;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < i3) {
                        int i6 = dVar.f17151a[i4];
                        C7731c<T> cVar = dVar.f17153c[i6];
                        C19383o.m32794d(cVar);
                        int i7 = cVar.f17147b;
                        int i8 = 0;
                        int i9 = 0;
                        while (i9 < i7) {
                            Object obj = cVar.f17148c[i9];
                            if (obj != null) {
                                if (!((Boolean) ownerSnapshotObserver$clearInvalidObservations$1.invoke(obj)).booleanValue()) {
                                    if (i8 != i9) {
                                        tArr = tArr2;
                                        cVar.f17148c[i8] = obj;
                                    } else {
                                        tArr = tArr2;
                                    }
                                    i8++;
                                } else {
                                    tArr = tArr2;
                                }
                                i9++;
                                tArr2 = tArr;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                        }
                        T[] tArr3 = tArr2;
                        int i10 = cVar.f17147b;
                        for (int i11 = i8; i11 < i10; i11++) {
                            cVar.f17148c[i11] = null;
                        }
                        cVar.f17147b = i8;
                        if (i8 > 0) {
                            if (i5 != i4) {
                                int[] iArr = dVar.f17151a;
                                int i12 = iArr[i5];
                                iArr[i5] = i6;
                                iArr[i4] = i12;
                            }
                            i5++;
                        }
                        i4++;
                        tArr2 = tArr3;
                    }
                    T[] tArr4 = tArr2;
                    int i13 = dVar.f17154d;
                    for (int i14 = i5; i14 < i13; i14++) {
                        dVar.f17152b[dVar.f17151a[i14]] = null;
                    }
                    dVar.f17154d = i5;
                    i2++;
                    if (i2 >= i) {
                        break;
                    }
                    tArr2 = tArr4;
                }
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: b */
    public final <T extends C1752q> void mo6824b(T t, C19857l<? super T, C19394m> lVar, C19846a<C19394m> aVar) {
        C19383o.m32797g(t, "target");
        C19383o.m32797g(lVar, "onChanged");
        C19383o.m32797g(aVar, "block");
        this.f3885a.mo5985b(t, lVar, aVar);
    }
}
