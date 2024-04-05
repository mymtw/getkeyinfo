package androidx.compose.runtime;

import android.support.p013v4.media.C0072d;
import androidx.compose.runtime.snapshots.C1385f;
import androidx.compose.runtime.snapshots.C1395m;
import androidx.compose.runtime.snapshots.C1406w;
import androidx.compose.runtime.snapshots.C1407x;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public class SnapshotMutableStateImpl<T> implements C1406w, C1395m<T> {
    private C1288a<T> next;
    private final C1323f1<T> policy;

    /* renamed from: androidx.compose.runtime.SnapshotMutableStateImpl$a */
    public static final class C1288a<T> extends C1407x {

        /* renamed from: c */
        public T f2791c;

        public C1288a(T t) {
            this.f2791c = t;
        }

        /* renamed from: a */
        public final void mo5542a(C1407x xVar) {
            C19383o.m32797g(xVar, "value");
            this.f2791c = ((C1288a) xVar).f2791c;
        }

        /* renamed from: b */
        public final C1407x mo5543b() {
            return new C1288a(this.f2791c);
        }
    }

    public SnapshotMutableStateImpl(T t, C1323f1<T> f1Var) {
        C19383o.m32797g(f1Var, "policy");
        this.policy = f1Var;
        this.next = new C1288a<>(t);
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public T component1() {
        return getValue();
    }

    public C19857l<T, C19394m> component2() {
        return new SnapshotMutableStateImpl$component2$1(this);
    }

    public final T getDebuggerDisplayValue() {
        return ((C1288a) SnapshotKt.m2909h(this.next, SnapshotKt.m2910i())).f2791c;
    }

    public C1407x getFirstStateRecord() {
        return this.next;
    }

    public C1323f1<T> getPolicy() {
        return this.policy;
    }

    public T getValue() {
        return ((C1288a) SnapshotKt.m2918q(this.next, this)).f2791c;
    }

    public C1407x mergeRecords(C1407x xVar, C1407x xVar2, C1407x xVar3) {
        C19383o.m32797g(xVar, "previous");
        C19383o.m32797g(xVar2, "current");
        C19383o.m32797g(xVar3, "applied");
        C1288a aVar = (C1288a) xVar;
        if (getPolicy().mo5799a(((C1288a) xVar2).f2791c, ((C1288a) xVar3).f2791c)) {
            return xVar2;
        }
        getPolicy().getClass();
        return null;
    }

    public void prependStateRecord(C1407x xVar) {
        C19383o.m32797g(xVar, "value");
        this.next = (C1288a) xVar;
    }

    public void setValue(T t) {
        C1385f i;
        C1288a aVar = (C1288a) SnapshotKt.m2909h(this.next, SnapshotKt.m2910i());
        if (!getPolicy().mo5799a(aVar.f2791c, t)) {
            C1288a<T> aVar2 = this.next;
            synchronized (SnapshotKt.f2989c) {
                i = SnapshotKt.m2910i();
                ((C1288a) SnapshotKt.m2915n(aVar2, this, i, aVar)).f2791c = t;
                C19394m mVar = C19394m.f43287a;
            }
            SnapshotKt.m2914m(i, this);
        }
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("MutableState(value=");
        h.append(((C1288a) SnapshotKt.m2909h(this.next, SnapshotKt.m2910i())).f2791c);
        h.append(")@");
        h.append(hashCode());
        return h.toString();
    }
}
