package androidx.compose.animation.core;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.C1400q;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ListIterator;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class Transition<S> {

    /* renamed from: a */
    public final C0418c0<S> f1035a;

    /* renamed from: b */
    public final String f1036b;

    /* renamed from: c */
    public final ParcelableSnapshotMutableState f1037c;

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f1038d;

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f1039e;

    /* renamed from: f */
    public final ParcelableSnapshotMutableState f1040f;

    /* renamed from: g */
    public final ParcelableSnapshotMutableState f1041g;

    /* renamed from: h */
    public final SnapshotStateList<Transition<S>.d<?, ?>> f1042h;

    /* renamed from: i */
    public final SnapshotStateList<Transition<?>> f1043i;

    /* renamed from: j */
    public final ParcelableSnapshotMutableState f1044j;

    /* renamed from: k */
    public long f1045k;

    /* renamed from: l */
    public final DerivedSnapshotState f1046l;

    /* renamed from: androidx.compose.animation.core.Transition$a */
    public final class C0400a<T, V extends C0432j> {

        /* renamed from: a */
        public final C0435k0<T, V> f1047a;

        /* renamed from: b */
        public final String f1048b;

        /* renamed from: c */
        public Transition<S>.a<T, V>.a<T, V> f1049c;

        /* renamed from: d */
        public final /* synthetic */ Transition<S> f1050d;

        /* renamed from: androidx.compose.animation.core.Transition$a$a */
        public final class C0401a<T, V extends C0432j> implements C1342k1<T> {

            /* renamed from: b */
            public final Transition<S>.d<T, V> f1051b;

            /* renamed from: c */
            public C19857l<? super C0402b<S>, ? extends C0454t<T>> f1052c;

            /* renamed from: d */
            public C19857l<? super S, ? extends T> f1053d;

            /* renamed from: e */
            public final /* synthetic */ Transition<S>.a<T, V> f1054e;

            public C0401a(C0400a aVar, Transition<S>.d<T, V> dVar, C19857l<? super C0402b<S>, ? extends C0454t<T>> lVar, C19857l<? super S, ? extends T> lVar2) {
                C19383o.m32797g(lVar, "transitionSpec");
                this.f1054e = aVar;
                this.f1051b = dVar;
                this.f1052c = lVar;
                this.f1053d = lVar2;
            }

            /* renamed from: d */
            public final void mo3419d(C0402b<S> bVar) {
                C19383o.m32797g(bVar, "segment");
                Object invoke = this.f1053d.invoke(bVar.mo3269a());
                if (this.f1054e.f1050d.mo3413e()) {
                    this.f1051b.mo3425g(this.f1053d.invoke(bVar.mo3270b()), invoke, (C0454t) this.f1052c.invoke(bVar));
                    return;
                }
                this.f1051b.mo3426h(invoke, (C0454t) this.f1052c.invoke(bVar));
            }

            public final T getValue() {
                mo3419d(this.f1054e.f1050d.mo3411c());
                return this.f1051b.getValue();
            }
        }

        public C0400a(Transition transition, C0437l0 l0Var, String str) {
            C19383o.m32797g(l0Var, "typeConverter");
            C19383o.m32797g(str, ResponseConstants.LABEL);
            this.f1050d = transition;
            this.f1047a = l0Var;
            this.f1048b = str;
        }

        /* renamed from: a */
        public final C0401a mo3418a(C19857l lVar, C19857l lVar2) {
            C19383o.m32797g(lVar, "transitionSpec");
            Transition<S>.a<T, V>.a<T, V> aVar = this.f1049c;
            if (aVar == null) {
                Transition<S> transition = this.f1050d;
                aVar = new C0401a<>(this, new C0404d(transition, lVar2.invoke(transition.mo3410b()), C0114h.m290U(this.f1047a, lVar2.invoke(this.f1050d.mo3410b())), this.f1047a, this.f1048b), lVar, lVar2);
                Transition<S> transition2 = this.f1050d;
                this.f1049c = aVar;
                Transition<S>.d<T, V> dVar = aVar.f1051b;
                transition2.getClass();
                C19383o.m32797g(dVar, ResponseConstants.ANIMATION);
                transition2.f1042h.add(dVar);
            }
            Transition<S> transition3 = this.f1050d;
            aVar.f1053d = lVar2;
            aVar.f1052c = lVar;
            aVar.mo3419d(transition3.mo3411c());
            return aVar;
        }
    }

    /* renamed from: androidx.compose.animation.core.Transition$b */
    public interface C0402b<S> {
        /* renamed from: a */
        S mo3269a();

        /* renamed from: b */
        S mo3270b();

        /* renamed from: c */
        boolean mo3420c(S s, S s2) {
            return C19383o.m32792b(s, mo3270b()) && C19383o.m32792b(s2, mo3269a());
        }
    }

    /* renamed from: androidx.compose.animation.core.Transition$c */
    public static final class C0403c<S> implements C0402b<S> {

        /* renamed from: a */
        public final S f1055a;

        /* renamed from: b */
        public final S f1056b;

        public C0403c(S s, S s2) {
            this.f1055a = s;
            this.f1056b = s2;
        }

        /* renamed from: a */
        public final S mo3269a() {
            return this.f1056b;
        }

        /* renamed from: b */
        public final S mo3270b() {
            return this.f1055a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0402b) {
                C0402b bVar = (C0402b) obj;
                return C19383o.m32792b(this.f1055a, bVar.mo3270b()) && C19383o.m32792b(this.f1056b, bVar.mo3269a());
            }
        }

        public final int hashCode() {
            S s = this.f1055a;
            int i = 0;
            int hashCode = (s != null ? s.hashCode() : 0) * 31;
            S s2 = this.f1056b;
            if (s2 != null) {
                i = s2.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: androidx.compose.animation.core.Transition$d */
    public final class C0404d<T, V extends C0432j> implements C1342k1<T> {

        /* renamed from: b */
        public final C0435k0<T, V> f1057b;

        /* renamed from: c */
        public final ParcelableSnapshotMutableState f1058c;

        /* renamed from: d */
        public final ParcelableSnapshotMutableState f1059d = C0761x.m1751w0(C0761x.m1678L0(0.0f, 0.0f, (Object) null, 7), C1351n1.f2948a);

        /* renamed from: e */
        public final ParcelableSnapshotMutableState f1060e;

        /* renamed from: f */
        public final ParcelableSnapshotMutableState f1061f;

        /* renamed from: g */
        public final ParcelableSnapshotMutableState f1062g;

        /* renamed from: h */
        public final ParcelableSnapshotMutableState f1063h;

        /* renamed from: i */
        public final ParcelableSnapshotMutableState f1064i;

        /* renamed from: j */
        public V f1065j;

        /* renamed from: k */
        public final C0429h0 f1066k;

        /* renamed from: l */
        public final /* synthetic */ Transition<S> f1067l;

        public C0404d(Transition transition, T t, V v, C0435k0<T, V> k0Var, String str) {
            C19383o.m32797g(v, "initialVelocityVector");
            C19383o.m32797g(k0Var, "typeConverter");
            C19383o.m32797g(str, ResponseConstants.LABEL);
            this.f1067l = transition;
            this.f1057b = k0Var;
            ParcelableSnapshotMutableState x0 = C0761x.m1751w0(t, C1351n1.f2948a);
            this.f1058c = x0;
            T t2 = null;
            this.f1060e = C0761x.m1751w0(new C0431i0(mo3424e(), k0Var, t, x0.getValue(), v), C1351n1.f2948a);
            this.f1061f = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
            this.f1062g = C0761x.m1751w0(0L, C1351n1.f2948a);
            this.f1063h = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
            this.f1064i = C0761x.m1751w0(t, C1351n1.f2948a);
            this.f1065j = v;
            Float f = (Float) C0467z0.f1204b.get(k0Var);
            if (f != null) {
                float floatValue = f.floatValue();
                C0432j jVar = (C0432j) k0Var.mo3509a().invoke(t);
                int b = jVar.mo3489b();
                for (int i = 0; i < b; i++) {
                    jVar.mo3492e(floatValue, i);
                }
                t2 = this.f1057b.mo3510b().invoke(jVar);
            }
            this.f1066k = C0761x.m1678L0(0.0f, 0.0f, t2, 3);
        }

        /* renamed from: f */
        public static void m1094f(C0404d dVar, Object obj, boolean z, int i) {
            if ((i & 1) != 0) {
                obj = dVar.getValue();
            }
            Object obj2 = obj;
            if ((i & 2) != 0) {
                z = false;
            }
            dVar.f1060e.setValue(new C0431i0(z ? dVar.mo3424e() instanceof C0429h0 ? dVar.mo3424e() : dVar.f1066k : dVar.mo3424e(), dVar.f1057b, obj2, dVar.f1058c.getValue(), dVar.f1065j));
            Transition<S> transition = dVar.f1067l;
            transition.f1041g.setValue(Boolean.TRUE);
            if (transition.mo3413e()) {
                long j = 0;
                ListIterator<Transition<S>.d<?, ?>> listIterator = transition.f1042h.listIterator();
                while (true) {
                    C1400q qVar = (C1400q) listIterator;
                    if (qVar.hasNext()) {
                        C0404d dVar2 = (C0404d) qVar.next();
                        j = Math.max(j, dVar2.mo3423d().f1143h);
                        long j2 = transition.f1045k;
                        dVar2.f1064i.setValue(dVar2.mo3423d().mo3468f(j2));
                        dVar2.f1065j = dVar2.mo3423d().mo3464b(j2);
                    } else {
                        transition.f1041g.setValue(Boolean.FALSE);
                        return;
                    }
                }
            }
        }

        /* renamed from: d */
        public final C0431i0<T, V> mo3423d() {
            return (C0431i0) this.f1060e.getValue();
        }

        /* renamed from: e */
        public final C0454t<T> mo3424e() {
            return (C0454t) this.f1059d.getValue();
        }

        /* renamed from: g */
        public final void mo3425g(T t, T t2, C0454t<T> tVar) {
            C19383o.m32797g(tVar, "animationSpec");
            this.f1058c.setValue(t2);
            this.f1059d.setValue(tVar);
            if (!C19383o.m32792b(mo3423d().f1138c, t) || !C19383o.m32792b(mo3423d().f1139d, t2)) {
                m1094f(this, t, false, 2);
            }
        }

        public final T getValue() {
            return this.f1064i.getValue();
        }

        /* renamed from: h */
        public final void mo3426h(T t, C0454t<T> tVar) {
            C19383o.m32797g(tVar, "animationSpec");
            if (!C19383o.m32792b(this.f1058c.getValue(), t) || ((Boolean) this.f1063h.getValue()).booleanValue()) {
                this.f1058c.setValue(t);
                this.f1059d.setValue(tVar);
                m1094f(this, (Object) null, !((Boolean) this.f1061f.getValue()).booleanValue(), 1);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f1061f;
                Boolean bool = Boolean.FALSE;
                parcelableSnapshotMutableState.setValue(bool);
                this.f1062g.setValue(Long.valueOf(((Number) this.f1067l.f1039e.getValue()).longValue()));
                this.f1063h.setValue(bool);
            }
        }
    }

    public Transition() {
        throw null;
    }

    public Transition(C0418c0<S> c0Var, String str) {
        C19383o.m32797g(c0Var, "transitionState");
        this.f1035a = c0Var;
        this.f1036b = str;
        this.f1037c = C0761x.m1751w0(mo3410b(), C1351n1.f2948a);
        this.f1038d = C0761x.m1751w0(new C0403c(mo3410b(), mo3410b()), C1351n1.f2948a);
        this.f1039e = C0761x.m1751w0(0L, C1351n1.f2948a);
        this.f1040f = C0761x.m1751w0(Long.MIN_VALUE, C1351n1.f2948a);
        this.f1041g = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
        this.f1042h = new SnapshotStateList<>();
        this.f1043i = new SnapshotStateList<>();
        this.f1044j = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
        this.f1046l = C0761x.m1687Q(new Transition$totalDurationNanos$2(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (((java.lang.Boolean) r6.f1041g.getValue()).booleanValue() == false) goto L_0x009b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3409a(S r7, androidx.compose.runtime.C1302d r8, int r9) {
        /*
            r6 = this;
            r0 = -1493585151(0xffffffffa6f9b301, float:-1.7326365E-15)
            androidx.compose.runtime.ComposerImpl r8 = r8.mo5440h(r0)
            r0 = r9 & 14
            if (r0 != 0) goto L_0x0016
            boolean r0 = r8.mo5408I(r7)
            if (r0 == 0) goto L_0x0013
            r0 = 4
            goto L_0x0014
        L_0x0013:
            r0 = 2
        L_0x0014:
            r0 = r0 | r9
            goto L_0x0017
        L_0x0016:
            r0 = r9
        L_0x0017:
            r1 = r9 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0027
            boolean r1 = r8.mo5408I(r6)
            if (r1 == 0) goto L_0x0024
            r1 = 32
            goto L_0x0026
        L_0x0024:
            r1 = 16
        L_0x0026:
            r0 = r0 | r1
        L_0x0027:
            r1 = r0 & 91
            r2 = 18
            if (r1 != r2) goto L_0x0038
            boolean r1 = r8.mo5442i()
            if (r1 != 0) goto L_0x0034
            goto L_0x0038
        L_0x0034:
            r8.mo5396C()
            goto L_0x009b
        L_0x0038:
            boolean r1 = r6.mo3413e()
            if (r1 != 0) goto L_0x009b
            r1 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r6.mo3417i(r7, r8, r0)
            java.lang.Object r0 = r6.mo3410b()
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r7, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0076
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r6.f1040f
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = r1
        L_0x0066:
            if (r0 != 0) goto L_0x0076
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r6.f1041g
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009b
        L_0x0076:
            r0 = 1157296644(0x44faf204, float:2007.563)
            r8.mo5465u(r0)
            boolean r0 = r8.mo5408I(r6)
            java.lang.Object r2 = r8.mo5431c0()
            if (r0 != 0) goto L_0x008a
            androidx.compose.runtime.d$a$a r0 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r0) goto L_0x0093
        L_0x008a:
            androidx.compose.animation.core.Transition$animateTo$1$1 r2 = new androidx.compose.animation.core.Transition$animateTo$1$1
            r0 = 0
            r2.<init>(r6, r0)
            r8.mo5407H0(r2)
        L_0x0093:
            r8.mo5418R(r1)
            kq.p r2 = (p753kq.C19861p) r2
            androidx.compose.runtime.C1415u.m3031e(r6, r2, r8)
        L_0x009b:
            androidx.compose.runtime.v0 r8 = r8.mo5421U()
            if (r8 != 0) goto L_0x00a2
            goto L_0x00a9
        L_0x00a2:
            androidx.compose.animation.core.Transition$animateTo$2 r0 = new androidx.compose.animation.core.Transition$animateTo$2
            r0.<init>(r6, r7, r9)
            r8.f3081d = r0
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.Transition.mo3409a(java.lang.Object, androidx.compose.runtime.d, int):void");
    }

    /* renamed from: b */
    public final S mo3410b() {
        return this.f1035a.f1093a.getValue();
    }

    /* renamed from: c */
    public final C0402b<S> mo3411c() {
        return (C0402b) this.f1038d.getValue();
    }

    /* renamed from: d */
    public final S mo3412d() {
        return this.f1037c.getValue();
    }

    /* renamed from: e */
    public final boolean mo3413e() {
        return ((Boolean) this.f1044j.getValue()).booleanValue();
    }

    /* renamed from: f */
    public final void mo3414f(long j, float f) {
        if (((Number) this.f1040f.getValue()).longValue() == Long.MIN_VALUE) {
            this.f1040f.setValue(Long.valueOf(j));
            this.f1035a.f1095c.setValue(Boolean.TRUE);
        }
        this.f1041g.setValue(Boolean.FALSE);
        this.f1039e.setValue(Long.valueOf(j - ((Number) this.f1040f.getValue()).longValue()));
        ListIterator<Transition<S>.d<?, ?>> listIterator = this.f1042h.listIterator();
        boolean z = true;
        while (true) {
            C1400q qVar = (C1400q) listIterator;
            if (!qVar.hasNext()) {
                break;
            }
            C0404d dVar = (C0404d) qVar.next();
            if (!((Boolean) dVar.f1061f.getValue()).booleanValue()) {
                long longValue = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? dVar.mo3423d().f1143h : (long) (((float) (((Number) this.f1039e.getValue()).longValue() - ((Number) dVar.f1062g.getValue()).longValue())) / f);
                dVar.f1064i.setValue(dVar.mo3423d().mo3468f(longValue));
                dVar.f1065j = dVar.mo3423d().mo3464b(longValue);
                if (dVar.mo3423d().mo3465c(longValue)) {
                    dVar.f1061f.setValue(Boolean.TRUE);
                    dVar.f1062g.setValue(0L);
                }
            }
            if (!((Boolean) dVar.f1061f.getValue()).booleanValue()) {
                z = false;
            }
        }
        ListIterator<Transition<?>> listIterator2 = this.f1043i.listIterator();
        while (true) {
            C1400q qVar2 = (C1400q) listIterator2;
            if (!qVar2.hasNext()) {
                break;
            }
            Transition transition = (Transition) qVar2.next();
            if (!C19383o.m32792b(transition.mo3412d(), transition.mo3410b())) {
                transition.mo3414f(((Number) this.f1039e.getValue()).longValue(), f);
            }
            if (!C19383o.m32792b(transition.mo3412d(), transition.mo3410b())) {
                z = false;
            }
        }
        if (z) {
            mo3415g();
        }
    }

    /* renamed from: g */
    public final void mo3415g() {
        this.f1040f.setValue(Long.MIN_VALUE);
        this.f1035a.f1093a.setValue(mo3412d());
        this.f1039e.setValue(0L);
        this.f1035a.f1095c.setValue(Boolean.FALSE);
    }

    /* renamed from: h */
    public final void mo3416h(long j, Object obj, Object obj2) {
        this.f1040f.setValue(Long.MIN_VALUE);
        this.f1035a.f1095c.setValue(Boolean.FALSE);
        if (!mo3413e() || !C19383o.m32792b(mo3410b(), obj) || !C19383o.m32792b(mo3412d(), obj2)) {
            this.f1035a.f1093a.setValue(obj);
            this.f1037c.setValue(obj2);
            this.f1044j.setValue(Boolean.TRUE);
            this.f1038d.setValue(new C0403c(obj, obj2));
        }
        ListIterator<Transition<?>> listIterator = this.f1043i.listIterator();
        while (true) {
            C1400q qVar = (C1400q) listIterator;
            if (!qVar.hasNext()) {
                break;
            }
            Transition transition = (Transition) qVar.next();
            if (transition.mo3413e()) {
                transition.mo3416h(j, transition.mo3410b(), transition.mo3412d());
            }
        }
        ListIterator<Transition<S>.d<?, ?>> listIterator2 = this.f1042h.listIterator();
        while (true) {
            C1400q qVar2 = (C1400q) listIterator2;
            if (qVar2.hasNext()) {
                C0404d dVar = (C0404d) qVar2.next();
                dVar.f1064i.setValue(dVar.mo3423d().mo3468f(j));
                dVar.f1065j = dVar.mo3423d().mo3464b(j);
            } else {
                this.f1045k = j;
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo3417i(S s, C1302d dVar, int i) {
        int i2;
        ComposerImpl h = dVar.mo5440h(-583974681);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(this) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.mo5442i()) {
            h.mo5396C();
        } else if (!mo3413e() && !C19383o.m32792b(mo3412d(), s)) {
            this.f1038d.setValue(new C0403c(mo3412d(), s));
            this.f1035a.f1093a.setValue(mo3412d());
            this.f1037c.setValue(s);
            if (!(((Number) this.f1040f.getValue()).longValue() != Long.MIN_VALUE)) {
                this.f1041g.setValue(Boolean.TRUE);
            }
            ListIterator<Transition<S>.d<?, ?>> listIterator = this.f1042h.listIterator();
            while (true) {
                C1400q qVar = (C1400q) listIterator;
                if (!qVar.hasNext()) {
                    break;
                }
                ((C0404d) qVar.next()).f1063h.setValue(Boolean.TRUE);
            }
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new Transition$updateTarget$2(this, s, i);
        }
    }
}
