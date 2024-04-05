package p186n2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p193o.C7494b;

/* renamed from: n2.q */
public final class C7426q {

    /* renamed from: a */
    public static C7375a f16589a = new C7375a();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C7494b<ViewGroup, ArrayList<C7418m>>>> f16590b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f16591c = new ArrayList<>();

    /* renamed from: n2.q$a */
    public static class C7427a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public C7418m f16592b;

        /* renamed from: c */
        public ViewGroup f16593c;

        /* renamed from: n2.q$a$a */
        public class C7428a extends C7425p {

            /* renamed from: a */
            public final /* synthetic */ C7494b f16594a;

            public C7428a(C7494b bVar) {
                this.f16594a = bVar;
            }

            public final void onTransitionEnd(C7418m mVar) {
                ((ArrayList) this.f16594a.getOrDefault(C7427a.this.f16593c, null)).remove(mVar);
                mVar.mo19793z(this);
            }
        }

        public C7427a(ViewGroup viewGroup, C7418m mVar) {
            this.f16592b = mVar;
            this.f16593c = viewGroup;
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x0246  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x01f4 A[EDGE_INSN: B:143:0x01f4->B:91:0x01f4 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01f9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
                r18 = this;
                r0 = r18
                android.view.ViewGroup r1 = r0.f16593c
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f16593c
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = p186n2.C7426q.f16591c
                android.view.ViewGroup r2 = r0.f16593c
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                o.b r1 = p186n2.C7426q.m14344c()
                android.view.ViewGroup r3 = r0.f16593c
                r4 = 0
                java.lang.Object r3 = r1.getOrDefault(r3, r4)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f16593c
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                n2.m r6 = r0.f16592b
                r3.add(r6)
                n2.m r3 = r0.f16592b
                n2.q$a$a r6 = new n2.q$a$a
                r6.<init>(r1)
                r3.mo19776a(r6)
                n2.m r1 = r0.f16592b
                android.view.ViewGroup r3 = r0.f16593c
                r6 = 0
                r1.mo19782j(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                n2.m r3 = (p186n2.C7418m) r3
                android.view.ViewGroup r5 = r0.f16593c
                r3.mo19766B(r5)
                goto L_0x0060
            L_0x0072:
                n2.m r1 = r0.f16592b
                android.view.ViewGroup r8 = r0.f16593c
                r1.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f16570l = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f16571m = r3
                n2.u r3 = r1.f16566h
                n2.u r5 = r1.f16567i
                o.b r7 = new o.b
                o.b<android.view.View, n2.t> r9 = r3.f16609a
                r7.<init>((p193o.C7494b) r9)
                o.b r9 = new o.b
                o.b<android.view.View, n2.t> r10 = r5.f16609a
                r9.<init>((p193o.C7494b) r10)
                r10 = r6
            L_0x009a:
                int[] r11 = r1.f16569k
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01f4
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01b4
                r12 = 2
                if (r11 == r12) goto L_0x0166
                r12 = 3
                if (r11 == r12) goto L_0x0112
                r12 = 4
                if (r11 == r12) goto L_0x00af
            L_0x00ac:
                r17 = r3
                goto L_0x010e
            L_0x00af:
                o.f<android.view.View> r11 = r3.f16611c
                o.f<android.view.View> r12 = r5.f16611c
                int r13 = r11.mo19891i()
                r14 = r6
            L_0x00b8:
                if (r14 >= r13) goto L_0x00ac
                java.lang.Object r15 = r11.mo19892j(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x0104
                boolean r16 = r1.mo19791w(r15)
                if (r16 == 0) goto L_0x0104
                boolean r6 = r11.f16720b
                if (r6 == 0) goto L_0x00cf
                r11.mo19888d()
            L_0x00cf:
                long[] r6 = r11.f16721c
                r17 = r3
                r2 = r6[r14]
                java.lang.Object r2 = r12.mo19889f(r2, r4)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x0106
                boolean r3 = r1.mo19791w(r2)
                if (r3 == 0) goto L_0x0106
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                n2.t r3 = (p186n2.C7433t) r3
                java.lang.Object r6 = r9.getOrDefault(r2, r4)
                n2.t r6 = (p186n2.C7433t) r6
                if (r3 == 0) goto L_0x0106
                if (r6 == 0) goto L_0x0106
                java.util.ArrayList<n2.t> r4 = r1.f16570l
                r4.add(r3)
                java.util.ArrayList<n2.t> r3 = r1.f16571m
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x0106
            L_0x0104:
                r17 = r3
            L_0x0106:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00b8
            L_0x010e:
                r2 = r17
                goto L_0x01ea
            L_0x0112:
                r2 = r3
                android.util.SparseArray<android.view.View> r3 = r2.f16610b
                android.util.SparseArray<android.view.View> r4 = r5.f16610b
                int r6 = r3.size()
                r11 = 0
            L_0x011c:
                if (r11 >= r6) goto L_0x01ea
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x0161
                boolean r13 = r1.mo19791w(r12)
                if (r13 == 0) goto L_0x0161
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x0161
                boolean r14 = r1.mo19791w(r13)
                if (r14 == 0) goto L_0x0161
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                n2.t r15 = (p186n2.C7433t) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                n2.t r14 = (p186n2.C7433t) r14
                if (r15 == 0) goto L_0x0161
                if (r14 == 0) goto L_0x0161
                java.util.ArrayList<n2.t> r0 = r1.f16570l
                r0.add(r15)
                java.util.ArrayList<n2.t> r0 = r1.f16571m
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x0161:
                int r11 = r11 + 1
                r0 = r18
                goto L_0x011c
            L_0x0166:
                r2 = r3
                o.b<java.lang.String, android.view.View> r0 = r2.f16612d
                o.b<java.lang.String, android.view.View> r3 = r5.f16612d
                int r4 = r0.f16745d
                r6 = 0
            L_0x016e:
                if (r6 >= r4) goto L_0x01ea
                java.lang.Object r11 = r0.mo19980n(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01b1
                boolean r12 = r1.mo19791w(r11)
                if (r12 == 0) goto L_0x01b1
                java.lang.Object r12 = r0.mo19978h(r6)
                r13 = 0
                java.lang.Object r12 = r3.getOrDefault(r12, r13)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01b1
                boolean r14 = r1.mo19791w(r12)
                if (r14 == 0) goto L_0x01b1
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                n2.t r14 = (p186n2.C7433t) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                n2.t r15 = (p186n2.C7433t) r15
                if (r14 == 0) goto L_0x01b1
                if (r15 == 0) goto L_0x01b1
                java.util.ArrayList<n2.t> r13 = r1.f16570l
                r13.add(r14)
                java.util.ArrayList<n2.t> r13 = r1.f16571m
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01b1:
                int r6 = r6 + 1
                goto L_0x016e
            L_0x01b4:
                r2 = r3
                int r0 = r7.f16745d
            L_0x01b7:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01ea
                java.lang.Object r3 = r7.mo19978h(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01b7
                boolean r4 = r1.mo19791w(r3)
                if (r4 == 0) goto L_0x01b7
                java.lang.Object r3 = r9.remove(r3)
                n2.t r3 = (p186n2.C7433t) r3
                if (r3 == 0) goto L_0x01b7
                android.view.View r4 = r3.f16607b
                boolean r4 = r1.mo19791w(r4)
                if (r4 == 0) goto L_0x01b7
                java.lang.Object r4 = r7.mo14353j(r0)
                n2.t r4 = (p186n2.C7433t) r4
                java.util.ArrayList<n2.t> r6 = r1.f16570l
                r6.add(r4)
                java.util.ArrayList<n2.t> r4 = r1.f16571m
                r4.add(r3)
                goto L_0x01b7
            L_0x01ea:
                int r10 = r10 + 1
                r0 = r18
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009a
            L_0x01f4:
                r0 = 0
            L_0x01f5:
                int r2 = r7.f16745d
                if (r0 >= r2) goto L_0x0215
                java.lang.Object r2 = r7.mo19980n(r0)
                n2.t r2 = (p186n2.C7433t) r2
                android.view.View r3 = r2.f16607b
                boolean r3 = r1.mo19791w(r3)
                if (r3 == 0) goto L_0x0212
                java.util.ArrayList<n2.t> r3 = r1.f16570l
                r3.add(r2)
                java.util.ArrayList<n2.t> r2 = r1.f16571m
                r3 = 0
                r2.add(r3)
            L_0x0212:
                int r0 = r0 + 1
                goto L_0x01f5
            L_0x0215:
                r0 = 0
            L_0x0216:
                int r2 = r9.f16745d
                if (r0 >= r2) goto L_0x0236
                java.lang.Object r2 = r9.mo19980n(r0)
                n2.t r2 = (p186n2.C7433t) r2
                android.view.View r3 = r2.f16607b
                boolean r3 = r1.mo19791w(r3)
                if (r3 == 0) goto L_0x0233
                java.util.ArrayList<n2.t> r3 = r1.f16571m
                r3.add(r2)
                java.util.ArrayList<n2.t> r2 = r1.f16570l
                r3 = 0
                r2.add(r3)
            L_0x0233:
                int r0 = r0 + 1
                goto L_0x0216
            L_0x0236:
                o.b r0 = p186n2.C7418m.m14307s()
                int r2 = r0.f16745d
                n2.c0 r3 = p186n2.C7439y.f16624a
                android.view.WindowId r3 = r8.getWindowId()
                r4 = 1
                int r2 = r2 - r4
            L_0x0244:
                if (r2 < 0) goto L_0x02b9
                java.lang.Object r4 = r0.mo19978h(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                if (r4 == 0) goto L_0x02b5
                r5 = 0
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                n2.m$b r6 = (p186n2.C7418m.C7420b) r6
                if (r6 == 0) goto L_0x02b5
                android.view.View r5 = r6.f16581a
                if (r5 == 0) goto L_0x02b5
                n2.h0 r5 = r6.f16584d
                boolean r7 = r5 instanceof p186n2.C7402g0
                if (r7 == 0) goto L_0x026d
                n2.g0 r5 = (p186n2.C7402g0) r5
                android.view.WindowId r5 = r5.f16543a
                boolean r5 = r5.equals(r3)
                if (r5 == 0) goto L_0x026d
                r5 = 1
                goto L_0x026e
            L_0x026d:
                r5 = 0
            L_0x026e:
                if (r5 == 0) goto L_0x02b5
                n2.t r5 = r6.f16583c
                android.view.View r7 = r6.f16581a
                r9 = 1
                n2.t r10 = r1.mo19790u(r7, r9)
                n2.t r11 = r1.mo19788r(r7, r9)
                if (r10 != 0) goto L_0x028e
                if (r11 != 0) goto L_0x028e
                n2.u r9 = r1.f16567i
                o.b<android.view.View, n2.t> r9 = r9.f16609a
                r12 = 0
                java.lang.Object r7 = r9.getOrDefault(r7, r12)
                r11 = r7
                n2.t r11 = (p186n2.C7433t) r11
                goto L_0x028f
            L_0x028e:
                r12 = 0
            L_0x028f:
                if (r10 != 0) goto L_0x0293
                if (r11 == 0) goto L_0x029d
            L_0x0293:
                n2.m r6 = r6.f16585e
                boolean r5 = r6.mo19752v(r5, r11)
                if (r5 == 0) goto L_0x029d
                r5 = 1
                goto L_0x029e
            L_0x029d:
                r5 = 0
            L_0x029e:
                if (r5 == 0) goto L_0x02b6
                boolean r5 = r4.isRunning()
                if (r5 != 0) goto L_0x02b1
                boolean r5 = r4.isStarted()
                if (r5 == 0) goto L_0x02ad
                goto L_0x02b1
            L_0x02ad:
                r0.remove(r4)
                goto L_0x02b6
            L_0x02b1:
                r4.cancel()
                goto L_0x02b6
            L_0x02b5:
                r12 = 0
            L_0x02b6:
                int r2 = r2 + -1
                goto L_0x0244
            L_0x02b9:
                n2.u r9 = r1.f16566h
                n2.u r10 = r1.f16567i
                java.util.ArrayList<n2.t> r11 = r1.f16570l
                java.util.ArrayList<n2.t> r12 = r1.f16571m
                r7 = r1
                r7.mo19785o(r8, r9, r10, r11, r12)
                r1.mo19767C()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p186n2.C7426q.C7427a.onPreDraw():boolean");
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f16593c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f16593c.removeOnAttachStateChangeListener(this);
            C7426q.f16591c.remove(this.f16593c);
            ArrayList orDefault = C7426q.m14344c().getOrDefault(this.f16593c, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((C7418m) it.next()).mo19766B(this.f16593c);
                }
            }
            this.f16592b.mo19783k(true);
        }
    }

    /* renamed from: a */
    public static void m14342a(ViewGroup viewGroup, C7418m mVar) {
        if (!f16591c.contains(viewGroup)) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2371g.m5246c(viewGroup)) {
                f16591c.add(viewGroup);
                if (mVar == null) {
                    mVar = f16589a;
                }
                C7418m l = mVar.clone();
                ArrayList orDefault = m14344c().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator it = orDefault.iterator();
                    while (it.hasNext()) {
                        ((C7418m) it.next()).mo19792y(viewGroup);
                    }
                }
                if (l != null) {
                    l.mo19782j(viewGroup, true);
                }
                if (((C7406j) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                    if (l != null) {
                        C7427a aVar = new C7427a(viewGroup, l);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    /* renamed from: b */
    public static void m14343b(ViewGroup viewGroup) {
        f16591c.remove(viewGroup);
        ArrayList orDefault = m14344c().getOrDefault(viewGroup, null);
        if (orDefault != null && !orDefault.isEmpty()) {
            ArrayList arrayList = new ArrayList(orDefault);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C7418m) arrayList.get(size)).mo19787q(viewGroup);
            }
        }
    }

    /* renamed from: c */
    public static C7494b<ViewGroup, ArrayList<C7418m>> m14344c() {
        C7494b<ViewGroup, ArrayList<C7418m>> bVar;
        WeakReference weakReference = f16590b.get();
        if (weakReference != null && (bVar = (C7494b) weakReference.get()) != null) {
            return bVar;
        }
        C7494b<ViewGroup, ArrayList<C7418m>> bVar2 = new C7494b<>();
        f16590b.set(new WeakReference(bVar2));
        return bVar2;
    }
}
