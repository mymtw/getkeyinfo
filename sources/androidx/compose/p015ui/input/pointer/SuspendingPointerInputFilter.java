package androidx.compose.p015ui.input.pointer;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.platform.C1843j1;
import com.google.android.play.core.appupdate.C15562d;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19343e;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.C19840y0;
import p174m0.C7282b;
import p174m0.C7290i;
import p219r.C7734e;
import p288y.C8343c;
import p288y.C8347f;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter */
public final class SuspendingPointerInputFilter extends C1650u implements C1651v, C1652w, C7282b {

    /* renamed from: d */
    public final C1843j1 f3607d;

    /* renamed from: e */
    public final /* synthetic */ C7282b f3608e;

    /* renamed from: f */
    public C1640l f3609f = SuspendingPointerInputFilterKt.f3623a;

    /* renamed from: g */
    public final C7734e<PointerEventHandlerCoroutine<?>> f3610g = new C7734e<>(new PointerEventHandlerCoroutine[16]);

    /* renamed from: h */
    public final C7734e<PointerEventHandlerCoroutine<?>> f3611h = new C7734e<>(new PointerEventHandlerCoroutine[16]);

    /* renamed from: i */
    public C1640l f3612i;

    /* renamed from: j */
    public long f3613j = 0;

    /* renamed from: k */
    public C19525d0 f3614k = C19840y0.f43848b;

    /* renamed from: l */
    public boolean f3615l;

    /* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine */
    public final class PointerEventHandlerCoroutine<R> implements C1631c, C7282b, C19340c<R> {

        /* renamed from: b */
        public final C19340c<R> f3616b;

        /* renamed from: c */
        public final /* synthetic */ SuspendingPointerInputFilter f3617c;

        /* renamed from: d */
        public C19747k<? super C1640l> f3618d;

        /* renamed from: e */
        public PointerEventPass f3619e = PointerEventPass.Main;

        /* renamed from: f */
        public final EmptyCoroutineContext f3620f = EmptyCoroutineContext.INSTANCE;

        public PointerEventHandlerCoroutine(C19753l lVar) {
            this.f3616b = lVar;
            this.f3617c = SuspendingPointerInputFilter.this;
        }

        /* renamed from: A */
        public final long mo3788A(long j) {
            return this.f3617c.mo3788A(j);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* renamed from: B */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object mo6564B(long r8, p753kq.C19861p<? super androidx.compose.p015ui.input.pointer.C1631c, ? super kotlin.coroutines.C19340c<? super T>, ? extends java.lang.Object> r10, kotlin.coroutines.C19340c<? super T> r11) {
            /*
                r7 = this;
                boolean r0 = r11 instanceof androidx.compose.p015ui.input.pointer.C1623xffebe5e8
                if (r0 == 0) goto L_0x0013
                r0 = r11
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.p015ui.input.pointer.C1623xffebe5e8) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r7, r11)
            L_0x0018:
                java.lang.Object r11 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                java.lang.Object r8 = r0.L$0
                kotlinx.coroutines.g1 r8 = (kotlinx.coroutines.C19699g1) r8
                androidx.compose.foundation.layout.C0761x.m1684O0(r11)     // Catch:{ all -> 0x006e }
                goto L_0x006a
            L_0x002c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0034:
                androidx.compose.foundation.layout.C0761x.m1684O0(r11)
                r5 = 0
                int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r11 > 0) goto L_0x0051
                kotlinx.coroutines.k<? super androidx.compose.ui.input.pointer.l> r11 = r7.f3618d
                if (r11 == 0) goto L_0x0051
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r8)
                kotlin.Result$Failure r2 = androidx.compose.foundation.layout.C0761x.m1673J(r2)
                java.lang.Object r2 = kotlin.Result.m35480constructorimpl(r2)
                r11.resumeWith(r2)
            L_0x0051:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r11 = androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilter.this
                kotlinx.coroutines.d0 r11 = r11.f3614k
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 r2 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1
                r2.<init>(r8, r7, r4)
                r8 = 3
                kotlinx.coroutines.w1 r8 = kotlinx.coroutines.C19697g.m33468f(r11, r4, r4, r2, r8)
                r0.L$0 = r8     // Catch:{ all -> 0x006e }
                r0.label = r3     // Catch:{ all -> 0x006e }
                java.lang.Object r11 = r10.invoke(r7, r0)     // Catch:{ all -> 0x006e }
                if (r11 != r1) goto L_0x006a
                return r1
            L_0x006a:
                r8.mo72134a(r4)
                return r11
            L_0x006e:
                r9 = move-exception
                r8.mo72134a(r4)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.mo6564B(long, kq.p, kotlin.coroutines.c):java.lang.Object");
        }

        /* renamed from: B0 */
        public final float mo3789B0(float f) {
            return this.f3617c.mo3789B0(f);
        }

        /* renamed from: E0 */
        public final int mo3790E0(long j) {
            return this.f3617c.mo3790E0(j);
        }

        /* renamed from: R */
        public final long mo6565R() {
            SuspendingPointerInputFilter suspendingPointerInputFilter = SuspendingPointerInputFilter.this;
            long w = suspendingPointerInputFilter.mo3799w(suspendingPointerInputFilter.f3607d.mo6772d());
            C1689j jVar = suspendingPointerInputFilter.f3687b;
            long a = jVar != null ? jVar.mo6684a() : 0;
            return C0114h.m319t(Math.max(0.0f, C8347f.m16656d(w) - ((float) ((int) (a >> 32)))) / 2.0f, Math.max(0.0f, C8347f.m16654b(w) - ((float) C7290i.m13995b(a))) / 2.0f);
        }

        /* renamed from: V */
        public final int mo3791V(float f) {
            return this.f3617c.mo3791V(f);
        }

        /* renamed from: a */
        public final long mo6566a() {
            return SuspendingPointerInputFilter.this.f3613j;
        }

        /* renamed from: b0 */
        public final float mo3793b0(long j) {
            return this.f3617c.mo3793b0(j);
        }

        /* renamed from: c */
        public final void mo6567c(C1640l lVar, PointerEventPass pointerEventPass) {
            C19747k<? super C1640l> kVar;
            C19383o.m32797g(pointerEventPass, "pass");
            if (pointerEventPass == this.f3619e && (kVar = this.f3618d) != null) {
                this.f3618d = null;
                kVar.resumeWith(Result.m35480constructorimpl(lVar));
            }
        }

        /* renamed from: e */
        public final float mo3794e(long j) {
            return this.f3617c.mo3794e(j);
        }

        /* renamed from: f0 */
        public final Object mo6568f0(PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
            C19753l lVar = new C19753l(1, C19388s.m32873m0(baseContinuationImpl));
            lVar.mo72548n();
            this.f3619e = pointerEventPass;
            this.f3618d = lVar;
            Object l = lVar.mo72547l();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return l;
        }

        /* renamed from: g0 */
        public final C1640l mo6569g0() {
            return SuspendingPointerInputFilter.this.f3609f;
        }

        public final CoroutineContext getContext() {
            return this.f3620f;
        }

        public final float getDensity() {
            return this.f3617c.getDensity();
        }

        public final C1843j1 getViewConfiguration() {
            return SuspendingPointerInputFilter.this.f3607d;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: m0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object mo6572m0(long r5, p753kq.C19861p<? super androidx.compose.p015ui.input.pointer.C1631c, ? super kotlin.coroutines.C19340c<? super T>, ? extends java.lang.Object> r7, kotlin.coroutines.C19340c<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.p015ui.input.pointer.C1625x7456dd52
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.p015ui.input.pointer.C1625x7456dd52) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003b }
                goto L_0x003c
            L_0x0027:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002f:
                androidx.compose.foundation.layout.C0761x.m1684O0(r8)
                r0.label = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x003b }
                java.lang.Object r8 = r4.mo6564B(r5, r7, r0)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003b }
                if (r8 != r1) goto L_0x003c
                return r1
            L_0x003b:
                r8 = 0
            L_0x003c:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.mo6572m0(long, kq.p, kotlin.coroutines.c):java.lang.Object");
        }

        /* renamed from: p */
        public final float mo3797p(int i) {
            return this.f3617c.mo3797p(i);
        }

        /* renamed from: q */
        public final float mo3798q(float f) {
            return this.f3617c.mo3798q(f);
        }

        public final void resumeWith(Object obj) {
            SuspendingPointerInputFilter suspendingPointerInputFilter = SuspendingPointerInputFilter.this;
            synchronized (suspendingPointerInputFilter.f3610g) {
                suspendingPointerInputFilter.f3610g.mo20241o(this);
                C19394m mVar = C19394m.f43287a;
            }
            this.f3616b.resumeWith(obj);
        }

        /* renamed from: w */
        public final long mo3799w(long j) {
            return this.f3617c.mo3799w(j);
        }

        /* renamed from: w0 */
        public final float mo3800w0() {
            return this.f3617c.mo3800w0();
        }
    }

    /* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$a */
    public /* synthetic */ class C1622a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3622a;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            iArr[PointerEventPass.Initial.ordinal()] = 1;
            iArr[PointerEventPass.Final.ordinal()] = 2;
            iArr[PointerEventPass.Main.ordinal()] = 3;
            f3622a = iArr;
        }
    }

    public SuspendingPointerInputFilter(C1843j1 j1Var, C7282b bVar) {
        C19383o.m32797g(j1Var, "viewConfiguration");
        C19383o.m32797g(bVar, "density");
        this.f3607d = j1Var;
        this.f3608e = bVar;
    }

    /* renamed from: A */
    public final long mo3788A(long j) {
        return this.f3608e.mo3788A(j);
    }

    /* renamed from: B0 */
    public final float mo3789B0(float f) {
        return this.f3608e.mo3789B0(f);
    }

    /* renamed from: E0 */
    public final int mo3790E0(long j) {
        return this.f3608e.mo3790E0(j);
    }

    /* renamed from: G */
    public final void mo6559G() {
        this.f3615l = true;
    }

    /* renamed from: R0 */
    public final boolean mo6560R0() {
        return this.f3615l;
    }

    /* renamed from: S0 */
    public final void mo6548S0() {
        boolean z;
        C1640l lVar = this.f3612i;
        if (lVar != null) {
            List<C1644p> list = lVar.f3651a;
            int size = list.size();
            int i = 0;
            while (true) {
                z = true;
                if (i >= size) {
                    break;
                } else if (!(true ^ list.get(i).f3659d)) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                List<C1644p> list2 = lVar.f3651a;
                ArrayList arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C1644p pVar = list2.get(i2);
                    long j = pVar.f3656a;
                    long j2 = pVar.f3658c;
                    long j3 = j2;
                    long j4 = j2;
                    long j5 = pVar.f3657b;
                    boolean z2 = pVar.f3659d;
                    arrayList.add(new C1644p(j, j5, j3, false, j5, j4, z2, z2, 1, C8343c.f18295b));
                }
                C1640l lVar2 = new C1640l(arrayList);
                this.f3609f = lVar2;
                mo6561U0(lVar2, PointerEventPass.Initial);
                mo6561U0(lVar2, PointerEventPass.Main);
                mo6561U0(lVar2, PointerEventPass.Final);
                this.f3612i = null;
            }
        }
    }

    /* renamed from: T0 */
    public final void mo6549T0(C1640l lVar, PointerEventPass pointerEventPass, long j) {
        C19383o.m32797g(pointerEventPass, "pass");
        this.f3613j = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.f3609f = lVar;
        }
        mo6561U0(lVar, pointerEventPass);
        List<C1644p> list = lVar.f3651a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!C15562d.m25206v(list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (!(!z)) {
            lVar = null;
        }
        this.f3612i = lVar;
    }

    /* renamed from: U0 */
    public final void mo6561U0(C1640l lVar, PointerEventPass pointerEventPass) {
        synchronized (this.f3610g) {
            C7734e<PointerEventHandlerCoroutine<?>> eVar = this.f3611h;
            eVar.mo20233e(eVar.f17157d, this.f3610g);
        }
        try {
            int i = C1622a.f3622a[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                C7734e<PointerEventHandlerCoroutine<?>> eVar2 = this.f3611h;
                int i2 = eVar2.f17157d;
                if (i2 > 0) {
                    int i3 = 0;
                    T[] tArr = eVar2.f17155b;
                    do {
                        ((PointerEventHandlerCoroutine) tArr[i3]).mo6567c(lVar, pointerEventPass);
                        i3++;
                    } while (i3 < i2);
                }
            } else if (i == 3) {
                C7734e<PointerEventHandlerCoroutine<?>> eVar3 = this.f3611h;
                int i4 = eVar3.f17157d;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    T[] tArr2 = eVar3.f17155b;
                    do {
                        ((PointerEventHandlerCoroutine) tArr2[i5]).mo6567c(lVar, pointerEventPass);
                        i5--;
                    } while (i5 >= 0);
                }
            }
        } finally {
            this.f3611h.mo20235g();
        }
    }

    /* renamed from: V */
    public final int mo3791V(float f) {
        return this.f3608e.mo3791V(f);
    }

    /* renamed from: b0 */
    public final float mo3793b0(long j) {
        return this.f3608e.mo3793b0(j);
    }

    /* renamed from: e */
    public final float mo3794e(long j) {
        return this.f3608e.mo3794e(j);
    }

    public final float getDensity() {
        return this.f3608e.getDensity();
    }

    public final C1843j1 getViewConfiguration() {
        return this.f3607d;
    }

    /* renamed from: p */
    public final float mo3797p(int i) {
        return this.f3608e.mo3797p(i);
    }

    /* renamed from: q */
    public final float mo3798q(float f) {
        return this.f3608e.mo3798q(f);
    }

    /* renamed from: q0 */
    public final C1650u mo6547q0() {
        return this;
    }

    /* renamed from: s0 */
    public final <R> Object mo6563s0(C19861p<? super C1631c, ? super C19340c<? super R>, ? extends Object> pVar, C19340c<? super R> cVar) {
        C19753l lVar = new C19753l(1, C19388s.m32873m0(cVar));
        lVar.mo72548n();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(lVar);
        synchronized (this.f3610g) {
            this.f3610g.mo20232c(pointerEventHandlerCoroutine);
            new C19343e(CoroutineSingletons.COROUTINE_SUSPENDED, C19388s.m32873m0(C19388s.m32843R(pVar, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine))).resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
        }
        lVar.mo72497O(new SuspendingPointerInputFilter$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        return lVar.mo72547l();
    }

    /* renamed from: w */
    public final long mo3799w(long j) {
        return this.f3608e.mo3799w(j);
    }

    /* renamed from: w0 */
    public final float mo3800w0() {
        return this.f3608e.mo3800w0();
    }
}
