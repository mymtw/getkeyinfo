package p030bo.app;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bo.app.i6 */
public final class C3784i6 {

    /* renamed from: b */
    public static final C3785a f8604b = new C3785a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final Comparator<C4275x2> f8605c = new C3607c7(0);

    /* renamed from: a */
    private final PriorityQueue<C4275x2> f8606a;

    /* renamed from: bo.app.i6$a */
    public static final class C3785a {
        private C3785a() {
        }

        public /* synthetic */ C3785a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3784i6(List<? extends C4275x2> list) {
        C19383o.m32797g(list, "fallbackActions");
        PriorityQueue<C4275x2> priorityQueue = new PriorityQueue<>(12, f8605c);
        this.f8606a = priorityQueue;
        priorityQueue.addAll(list);
    }

    /* renamed from: a */
    public final C4275x2 mo13443a() {
        return this.f8606a.poll();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final int m8830a(C4275x2 x2Var, C4275x2 x2Var2) {
        C19383o.m32797g(x2Var, "actionA");
        C19383o.m32797g(x2Var2, "actionB");
        int u = x2Var.mo13680f().mo13779u();
        int u2 = x2Var2.mo13680f().mo13779u();
        if (u > u2) {
            return -1;
        }
        if (u < u2) {
            return 1;
        }
        return x2Var.getId().compareTo(x2Var2.getId());
    }
}
