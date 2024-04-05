package com.etsy.android.p327ui.user.circles;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.user.circles.C11512e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlowImpl;
import p425q9.C13265p;

/* renamed from: com.etsy.android.ui.user.circles.CirclesViewModel */
public final class CirclesViewModel extends C2866i0 {

    /* renamed from: b */
    public final CirclesRepository f25375b;

    /* renamed from: c */
    public final C13265p f25376c;

    /* renamed from: d */
    public final StateFlowImpl f25377d;

    /* renamed from: e */
    public final StateFlowImpl f25378e;

    /* renamed from: f */
    public EtsyId f25379f = new EtsyId((String) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: g */
    public boolean f25380g;

    /* renamed from: h */
    public EmptyList f25381h = EmptyList.INSTANCE;

    /* renamed from: com.etsy.android.ui.user.circles.CirclesViewModel$a */
    public static abstract class C11501a {

        /* renamed from: com.etsy.android.ui.user.circles.CirclesViewModel$a$a */
        public static final class C11502a extends C11501a {

            /* renamed from: a */
            public final Throwable f25382a;

            public C11502a(Throwable th) {
                this.f25382a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11502a) && C19383o.m32792b(this.f25382a, ((C11502a) obj).f25382a);
            }

            public final int hashCode() {
                Throwable th = this.f25382a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public final String toString() {
                return C0070b.m185h(C0072d.m201h("Error(error="), this.f25382a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.user.circles.CirclesViewModel$a$b */
        public static final class C11503b extends C11501a {

            /* renamed from: a */
            public final boolean f25383a;

            public C11503b(boolean z) {
                this.f25383a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11503b) && this.f25383a == ((C11503b) obj).f25383a;
            }

            public final int hashCode() {
                boolean z = this.f25383a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final String toString() {
                return C0391c.m1058d(C0072d.m201h("Loading(isRefreshing="), this.f25383a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.user.circles.CirclesViewModel$a$c */
        public static final class C11504c extends C11501a {

            /* renamed from: a */
            public static final C11504c f25384a = new C11504c();
        }

        /* renamed from: com.etsy.android.ui.user.circles.CirclesViewModel$a$d */
        public static final class C11505d extends C11501a {

            /* renamed from: a */
            public final List<C11506a> f25385a;

            public C11505d(ArrayList arrayList) {
                this.f25385a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11505d) && C19383o.m32792b(this.f25385a, ((C11505d) obj).f25385a);
            }

            public final int hashCode() {
                return this.f25385a.hashCode();
            }

            public final String toString() {
                return C0070b.m186i(C0072d.m201h("ShowingUsers(users="), this.f25385a, ')');
            }
        }
    }

    public CirclesViewModel(CirclesRepository circlesRepository, C13265p pVar) {
        C19383o.m32797g(circlesRepository, "circlesRepository");
        C19383o.m32797g(pVar, "session");
        this.f25375b = circlesRepository;
        this.f25376c = pVar;
        StateFlowImpl g = C19388s.m32862g(C11501a.C11504c.f25384a);
        this.f25377d = g;
        this.f25378e = g;
    }

    /* renamed from: b */
    public final void mo37371b(boolean z) {
        boolean z2 = true;
        if ((!this.f25381h.isEmpty()) && z) {
            this.f25381h = EmptyList.INSTANCE;
        }
        this.f25377d.setValue(new C11501a.C11503b(z));
        if (this.f25379f.hasId() && !C19383o.m32792b(this.f25376c.mo45959d(), this.f25379f)) {
            z2 = false;
        }
        int size = this.f25381h.size();
        boolean z3 = this.f25380g;
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new CirclesViewModel$loadMoreUsers$1(this, (!z3 || !z2) ? z3 ? new C11512e.C11516d(this.f25379f.getId(), size) : z2 ? new C11512e.C11513a(size) : new C11512e.C11514b(this.f25379f.getId(), size) : new C11512e.C11515c(size), (C19340c<? super CirclesViewModel$loadMoreUsers$1>) null), 3);
    }
}
