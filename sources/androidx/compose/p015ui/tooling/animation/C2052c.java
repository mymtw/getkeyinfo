package androidx.compose.p015ui.tooling.animation;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.core.Transition;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.tooling.animation.c */
public final class C2052c {

    /* renamed from: a */
    public final C19846a<C19394m> f4638a;

    /* renamed from: b */
    public final HashSet<C2054d> f4639b = new HashSet<>();

    /* renamed from: c */
    public final HashSet<C2050a> f4640c = new HashSet<>();

    /* renamed from: d */
    public final HashMap<Transition<Object>, C2053a> f4641d = new HashMap<>();

    /* renamed from: e */
    public final Object f4642e = new Object();

    /* renamed from: f */
    public final HashMap<Transition<Object>, C2051b> f4643f = new HashMap<>();

    /* renamed from: g */
    public final Object f4644g = new Object();

    /* renamed from: androidx.compose.ui.tooling.animation.c$a */
    public static final class C2053a {

        /* renamed from: a */
        public final Object f4645a;

        /* renamed from: b */
        public final Object f4646b;

        public C2053a(Object obj, Object obj2) {
            C19383o.m32797g(obj, "current");
            C19383o.m32797g(obj2, "target");
            this.f4645a = obj;
            this.f4646b = obj2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2053a)) {
                return false;
            }
            C2053a aVar = (C2053a) obj;
            return C19383o.m32792b(this.f4645a, aVar.f4645a) && C19383o.m32792b(this.f4646b, aVar.f4646b);
        }

        public final int hashCode() {
            return this.f4646b.hashCode() + (this.f4645a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("TransitionState(current=");
            h.append(this.f4645a);
            h.append(", target=");
            return C0073e.m209i(h, this.f4646b, ')');
        }
    }

    public C2052c(C19846a<C19394m> aVar) {
        this.f4638a = aVar;
    }

    /* renamed from: a */
    public final void mo7830a() {
        Iterator<C2054d> it = this.f4639b.iterator();
        while (it.hasNext()) {
            C19383o.m32797g((C2054d) it.next(), ResponseConstants.ANIMATION);
        }
        Iterator<C2050a> it2 = this.f4640c.iterator();
        while (it2.hasNext()) {
            C19383o.m32797g((C2050a) it2.next(), ResponseConstants.ANIMATION);
        }
        this.f4640c.clear();
        this.f4639b.clear();
        this.f4643f.clear();
        this.f4641d.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        android.util.Log.d("ComposeAnimationParser", "AnimatedVisibility transition subscribed");
        r0 = new androidx.compose.p015ui.tooling.animation.C2050a(r6);
        r1 = r5.f4643f.get(r6);
        kotlin.jvm.internal.C19383o.m32794d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (kotlin.jvm.internal.C19383o.m32792b(r1.f4637a, "Enter") == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r3 = new kotlin.Pair(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r3 = new kotlin.Pair(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r6.mo3416h(0, java.lang.Boolean.valueOf(((java.lang.Boolean) r3.component1()).booleanValue()), java.lang.Boolean.valueOf(((java.lang.Boolean) r3.component2()).booleanValue()));
        r7.invoke();
        r5.f4640c.add(r0);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7831b(androidx.compose.animation.core.Transition<java.lang.Object> r6, p753kq.C19846a<kotlin.C19394m> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            java.lang.Object r0 = r5.f4644g
            monitor-enter(r0)
            java.util.HashMap<androidx.compose.animation.core.Transition<java.lang.Object>, androidx.compose.ui.tooling.animation.b> r1 = r5.f4643f     // Catch:{ all -> 0x0090 }
            boolean r1 = r1.containsKey(r6)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)
            return
        L_0x0012:
            java.util.HashMap<androidx.compose.animation.core.Transition<java.lang.Object>, androidx.compose.ui.tooling.animation.b> r1 = r5.f4643f     // Catch:{ all -> 0x0090 }
            java.lang.Object r2 = r6.mo3410b()     // Catch:{ all -> 0x0090 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0090 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0090 }
            if (r2 == 0) goto L_0x0023
            java.lang.String r2 = "Exit"
            goto L_0x0025
        L_0x0023:
            java.lang.String r2 = "Enter"
        L_0x0025:
            androidx.compose.ui.tooling.animation.b r3 = new androidx.compose.ui.tooling.animation.b     // Catch:{ all -> 0x0090 }
            r3.<init>(r2)     // Catch:{ all -> 0x0090 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0090 }
            kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0090 }
            monitor-exit(r0)
            java.lang.String r0 = "ComposeAnimationParser"
            java.lang.String r1 = "AnimatedVisibility transition subscribed"
            android.util.Log.d(r0, r1)
            androidx.compose.ui.tooling.animation.a r0 = new androidx.compose.ui.tooling.animation.a
            r0.<init>(r6)
            java.util.HashMap<androidx.compose.animation.core.Transition<java.lang.Object>, androidx.compose.ui.tooling.animation.b> r1 = r5.f4643f
            java.lang.Object r1 = r1.get(r6)
            kotlin.jvm.internal.C19383o.m32794d(r1)
            androidx.compose.ui.tooling.animation.b r1 = (androidx.compose.p015ui.tooling.animation.C2051b) r1
            java.lang.String r1 = r1.f4637a
            java.lang.String r2 = "Enter"
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            if (r1 == 0) goto L_0x005b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r1, r2)
            goto L_0x0064
        L_0x005b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r1, r2)
        L_0x0064:
            java.lang.Object r1 = r3.component1()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r2 = r3.component2()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r6.mo3416h(r3, r1, r2)
            r7.invoke()
            java.util.HashSet<androidx.compose.ui.tooling.animation.a> r6 = r5.f4640c
            r6.add(r0)
            androidx.compose.animation.tooling.ComposeAnimation r0 = (androidx.compose.animation.tooling.ComposeAnimation) r0
            return
        L_0x0090:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.tooling.animation.C2052c.mo7831b(androidx.compose.animation.core.Transition, kq.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        android.util.Log.d("ComposeAnimationParser", "Transition subscribed");
        r0 = r6.mo3411c().mo3270b();
        r1 = r0.getClass().getEnumConstants();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r1 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r1 = kotlin.collections.C19318k.m32621m1(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r1 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r1 = kotlin.jvm.internal.C19382n.m32702C0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r6.f1036b != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        kotlin.jvm.internal.C19386q.m32807a(r0.getClass()).mo71919c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r2 = new androidx.compose.p015ui.tooling.animation.C2054d(r6, r1);
        r5.f4639b.add(r2);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7832c(androidx.compose.animation.core.Transition<java.lang.Object> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "transition"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            java.lang.Object r0 = r5.f4642e
            monitor-enter(r0)
            java.util.HashMap<androidx.compose.animation.core.Transition<java.lang.Object>, androidx.compose.ui.tooling.animation.c$a> r1 = r5.f4641d     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.containsKey(r6)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)
            return
        L_0x0012:
            java.util.HashMap<androidx.compose.animation.core.Transition<java.lang.Object>, androidx.compose.ui.tooling.animation.c$a> r1 = r5.f4641d     // Catch:{ all -> 0x0066 }
            androidx.compose.ui.tooling.animation.c$a r2 = new androidx.compose.ui.tooling.animation.c$a     // Catch:{ all -> 0x0066 }
            java.lang.Object r3 = r6.mo3410b()     // Catch:{ all -> 0x0066 }
            java.lang.Object r4 = r6.mo3412d()     // Catch:{ all -> 0x0066 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0066 }
            r1.put(r6, r2)     // Catch:{ all -> 0x0066 }
            kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0066 }
            monitor-exit(r0)
            java.lang.String r0 = "ComposeAnimationParser"
            java.lang.String r1 = "Transition subscribed"
            android.util.Log.d(r0, r1)
            androidx.compose.animation.core.Transition$b r0 = r6.mo3411c()
            java.lang.Object r0 = r0.mo3270b()
            java.lang.Class r1 = r0.getClass()
            java.lang.Object[] r1 = r1.getEnumConstants()
            if (r1 == 0) goto L_0x0046
            java.util.Set r1 = kotlin.collections.C19318k.m32621m1(r1)
            if (r1 != 0) goto L_0x004a
        L_0x0046:
            java.util.Set r1 = kotlin.jvm.internal.C19382n.m32702C0(r0)
        L_0x004a:
            androidx.compose.ui.tooling.animation.d r2 = new androidx.compose.ui.tooling.animation.d
            java.lang.String r3 = r6.f1036b
            if (r3 != 0) goto L_0x005b
            java.lang.Class r0 = r0.getClass()
            kotlin.jvm.internal.k r0 = kotlin.jvm.internal.C19386q.m32807a(r0)
            r0.mo71919c()
        L_0x005b:
            r2.<init>(r6, r1)
            java.util.HashSet<androidx.compose.ui.tooling.animation.d> r6 = r5.f4639b
            r6.add(r2)
            androidx.compose.animation.tooling.ComposeAnimation r2 = (androidx.compose.animation.tooling.ComposeAnimation) r2
            return
        L_0x0066:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.tooling.animation.C2052c.mo7832c(androidx.compose.animation.core.Transition):void");
    }
}
