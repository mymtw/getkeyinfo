package com.bugsnag.android;

import android.support.p013v4.media.C0072d;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.m */
public final class C5805m {

    /* renamed from: a */
    public final Collection<C5934x1> f12415a;

    /* renamed from: b */
    public final Collection<C5930w1> f12416b;

    /* renamed from: c */
    public final Collection<C5940z1> f12417c;

    /* renamed from: d */
    public final Collection<C5937y1> f12418d;

    public C5805m() {
        this(0);
    }

    public C5805m(Collection<C5934x1> collection, Collection<C5930w1> collection2, Collection<C5940z1> collection3, Collection<C5937y1> collection4) {
        C19383o.m32798h(collection, "onErrorTasks");
        C19383o.m32798h(collection2, "onBreadcrumbTasks");
        C19383o.m32798h(collection3, "onSessionTasks");
        C19383o.m32798h(collection4, "onSendTasks");
        this.f12415a = collection;
        this.f12416b = collection2;
        this.f12417c = collection3;
        this.f12418d = collection4;
    }

    /* renamed from: a */
    public final boolean mo16570a(C5908s0 s0Var, C5816o1 o1Var) {
        C19383o.m32798h(s0Var, "event");
        C19383o.m32798h(o1Var, "logger");
        for (C5937y1 a : this.f12418d) {
            try {
                if (!a.mo16704a()) {
                    return false;
                }
            } catch (Throwable th) {
                o1Var.mo16602b("OnSendCallback threw an Exception", th);
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5805m)) {
            return false;
        }
        C5805m mVar = (C5805m) obj;
        return C19383o.m32792b(this.f12415a, mVar.f12415a) && C19383o.m32792b(this.f12416b, mVar.f12416b) && C19383o.m32792b(this.f12417c, mVar.f12417c) && C19383o.m32792b(this.f12418d, mVar.f12418d);
    }

    public final int hashCode() {
        Collection<C5934x1> collection = this.f12415a;
        int i = 0;
        int hashCode = (collection != null ? collection.hashCode() : 0) * 31;
        Collection<C5930w1> collection2 = this.f12416b;
        int hashCode2 = (hashCode + (collection2 != null ? collection2.hashCode() : 0)) * 31;
        Collection<C5940z1> collection3 = this.f12417c;
        int hashCode3 = (hashCode2 + (collection3 != null ? collection3.hashCode() : 0)) * 31;
        Collection<C5937y1> collection4 = this.f12418d;
        if (collection4 != null) {
            i = collection4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CallbackState(onErrorTasks=");
        h.append(this.f12415a);
        h.append(", onBreadcrumbTasks=");
        h.append(this.f12416b);
        h.append(", onSessionTasks=");
        h.append(this.f12417c);
        h.append(", onSendTasks=");
        h.append(this.f12418d);
        h.append(")");
        return h.toString();
    }

    public /* synthetic */ C5805m(int i) {
        this(new CopyOnWriteArrayList(), new CopyOnWriteArrayList(), new CopyOnWriteArrayList(), new CopyOnWriteArrayList());
    }
}
