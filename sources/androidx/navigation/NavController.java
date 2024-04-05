package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.C0112f;
import androidx.lifecycle.C2878l0;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2886r;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.C2953d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavController {

    /* renamed from: a */
    public final Context f6663a;

    /* renamed from: b */
    public Activity f6664b;

    /* renamed from: c */
    public C2970l f6665c;

    /* renamed from: d */
    public C2966i f6666d;

    /* renamed from: e */
    public Bundle f6667e;

    /* renamed from: f */
    public Parcelable[] f6668f;

    /* renamed from: g */
    public boolean f6669g;

    /* renamed from: h */
    public final ArrayDeque f6670h = new ArrayDeque();

    /* renamed from: i */
    public C2887s f6671i;

    /* renamed from: j */
    public C2955e f6672j;

    /* renamed from: k */
    public C2992q f6673k = new C2992q();

    /* renamed from: l */
    public final CopyOnWriteArrayList<C2948b> f6674l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    public final C2886r f6675m = new C2885q() {
        public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
            Lifecycle.State state;
            NavController navController = NavController.this;
            if (navController.f6666d != null) {
                Iterator it = navController.f6670h.iterator();
                while (it.hasNext()) {
                    C2953d dVar = (C2953d) it.next();
                    dVar.getClass();
                    switch (C2953d.C2954a.f6698a[event.ordinal()]) {
                        case 1:
                        case 2:
                            state = Lifecycle.State.CREATED;
                            break;
                        case 3:
                        case 4:
                            state = Lifecycle.State.STARTED;
                            break;
                        case 5:
                            state = Lifecycle.State.RESUMED;
                            break;
                        case 6:
                            state = Lifecycle.State.DESTROYED;
                            break;
                        default:
                            throw new IllegalArgumentException("Unexpected event value " + event);
                    }
                    dVar.f6694h = state;
                    dVar.mo10958a();
                }
            }
        }
    };

    /* renamed from: n */
    public final C2947a f6676n = new C2947a();

    /* renamed from: o */
    public boolean f6677o = true;

    /* renamed from: androidx.navigation.NavController$a */
    public class C2947a extends C0112f {
        public C2947a() {
            super(false);
        }

        /* renamed from: a */
        public final void mo1121a() {
            NavController.this.mo10945e();
        }
    }

    /* renamed from: androidx.navigation.NavController$b */
    public interface C2948b {
        /* renamed from: a */
        void mo10950a();
    }

    public NavController(Context context) {
        this.f6663a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f6664b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        C2992q qVar = this.f6673k;
        qVar.mo10997a(new C2968j(qVar));
        this.f6673k.mo10997a(new C2949a(this.f6663a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:5:0x0027, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10941a() {
        /*
            r10 = this;
        L_0x0000:
            java.util.ArrayDeque r0 = r10.f6670h
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x002a
            java.util.ArrayDeque r0 = r10.f6670h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.d r0 = (androidx.navigation.C2953d) r0
            androidx.navigation.h r0 = r0.f6689c
            boolean r0 = r0 instanceof androidx.navigation.C2966i
            if (r0 == 0) goto L_0x002a
            java.util.ArrayDeque r0 = r10.f6670h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.d r0 = (androidx.navigation.C2953d) r0
            androidx.navigation.h r0 = r0.f6689c
            int r0 = r0.f6728d
            boolean r0 = r10.mo10946f(r0, r1)
            if (r0 == 0) goto L_0x002a
            goto L_0x0000
        L_0x002a:
            java.util.ArrayDeque r0 = r10.f6670h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f6
            java.util.ArrayDeque r0 = r10.f6670h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.d r0 = (androidx.navigation.C2953d) r0
            androidx.navigation.h r0 = r0.f6689c
            r2 = 0
            boolean r3 = r0 instanceof androidx.navigation.C2951b
            if (r3 == 0) goto L_0x005e
            java.util.ArrayDeque r3 = r10.f6670h
            java.util.Iterator r3 = r3.descendingIterator()
        L_0x0047:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005e
            java.lang.Object r4 = r3.next()
            androidx.navigation.d r4 = (androidx.navigation.C2953d) r4
            androidx.navigation.h r4 = r4.f6689c
            boolean r5 = r4 instanceof androidx.navigation.C2966i
            if (r5 != 0) goto L_0x0047
            boolean r5 = r4 instanceof androidx.navigation.C2951b
            if (r5 != 0) goto L_0x0047
            r2 = r4
        L_0x005e:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.ArrayDeque r4 = r10.f6670h
            java.util.Iterator r4 = r4.descendingIterator()
        L_0x0069:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r4.next()
            androidx.navigation.d r5 = (androidx.navigation.C2953d) r5
            androidx.lifecycle.Lifecycle$State r6 = r5.f6695i
            androidx.navigation.h r7 = r5.f6689c
            if (r0 == 0) goto L_0x008b
            int r8 = r7.f6728d
            int r9 = r0.f6728d
            if (r8 != r9) goto L_0x008b
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 == r7) goto L_0x0088
            r3.put(r5, r7)
        L_0x0088:
            androidx.navigation.i r0 = r0.f6727c
            goto L_0x0069
        L_0x008b:
            if (r2 == 0) goto L_0x00a9
            int r7 = r7.f6728d
            int r8 = r2.f6728d
            if (r7 != r8) goto L_0x00a9
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 != r7) goto L_0x009f
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED
            r5.f6695i = r6
            r5.mo10958a()
            goto L_0x00a6
        L_0x009f:
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED
            if (r6 == r7) goto L_0x00a6
            r3.put(r5, r7)
        L_0x00a6:
            androidx.navigation.i r2 = r2.f6727c
            goto L_0x0069
        L_0x00a9:
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.CREATED
            r5.f6695i = r6
            r5.mo10958a()
            goto L_0x0069
        L_0x00b1:
            java.util.ArrayDeque r0 = r10.f6670h
            java.util.Iterator r0 = r0.iterator()
        L_0x00b7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00d5
            java.lang.Object r2 = r0.next()
            androidx.navigation.d r2 = (androidx.navigation.C2953d) r2
            java.lang.Object r4 = r3.get(r2)
            androidx.lifecycle.Lifecycle$State r4 = (androidx.lifecycle.Lifecycle.State) r4
            if (r4 == 0) goto L_0x00d1
            r2.f6695i = r4
            r2.mo10958a()
            goto L_0x00b7
        L_0x00d1:
            r2.mo10958a()
            goto L_0x00b7
        L_0x00d5:
            java.util.ArrayDeque r0 = r10.f6670h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.d r0 = (androidx.navigation.C2953d) r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$b> r2 = r10.f6674l
            java.util.Iterator r2 = r2.iterator()
        L_0x00e3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r3 = r2.next()
            androidx.navigation.NavController$b r3 = (androidx.navigation.NavController.C2948b) r3
            androidx.navigation.h r4 = r0.f6689c
            r3.mo10950a()
            goto L_0x00e3
        L_0x00f5:
            return r1
        L_0x00f6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo10941a():boolean");
    }

    /* renamed from: b */
    public final C2964h mo10942b(int i) {
        C2966i iVar = this.f6666d;
        if (iVar == null) {
            return null;
        }
        if (iVar.f6728d == i) {
            return iVar;
        }
        C2964h hVar = this.f6670h.isEmpty() ? this.f6666d : ((C2953d) this.f6670h.getLast()).f6689c;
        return (hVar instanceof C2966i ? (C2966i) hVar : hVar.f6727c).mo10973m(i, true);
    }

    /* renamed from: c */
    public final C2964h mo10943c() {
        C2953d dVar = this.f6670h.isEmpty() ? null : (C2953d) this.f6670h.getLast();
        if (dVar != null) {
            return dVar.f6689c;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r15.f6750b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[LOOP:0: B:10:0x0027->B:15:0x004d, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cf A[LOOP:3: B:43:0x00cf->B:50:0x0109, LOOP_START] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10944d(androidx.navigation.C2964h r13, android.os.Bundle r14, androidx.navigation.C2971m r15) {
        /*
            r12 = this;
            r0 = 0
            if (r15 == 0) goto L_0x000f
            int r1 = r15.f6750b
            r2 = -1
            if (r1 == r2) goto L_0x000f
            boolean r2 = r15.f6751c
            boolean r1 = r12.mo10946f(r1, r2)
            goto L_0x0010
        L_0x000f:
            r1 = r0
        L_0x0010:
            androidx.navigation.q r2 = r12.f6673k
            java.lang.String r3 = r13.f6726b
            androidx.navigation.p r2 = r2.mo10998c(r3)
            android.os.Bundle r14 = r13.mo10967a(r14)
            androidx.navigation.h r2 = r2.mo10952b(r13, r14, r15)
            r9 = 1
            if (r2 == 0) goto L_0x0152
            boolean r15 = r2 instanceof androidx.navigation.C2951b
            if (r15 != 0) goto L_0x0050
        L_0x0027:
            java.util.ArrayDeque r15 = r12.f6670h
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x0050
            java.util.ArrayDeque r15 = r12.f6670h
            java.lang.Object r15 = r15.peekLast()
            androidx.navigation.d r15 = (androidx.navigation.C2953d) r15
            androidx.navigation.h r15 = r15.f6689c
            boolean r15 = r15 instanceof androidx.navigation.C2951b
            if (r15 == 0) goto L_0x0050
            java.util.ArrayDeque r15 = r12.f6670h
            java.lang.Object r15 = r15.peekLast()
            androidx.navigation.d r15 = (androidx.navigation.C2953d) r15
            androidx.navigation.h r15 = r15.f6689c
            int r15 = r15.f6728d
            boolean r15 = r12.mo10946f(r15, r9)
            if (r15 == 0) goto L_0x0050
            goto L_0x0027
        L_0x0050:
            java.util.ArrayDeque r15 = new java.util.ArrayDeque
            r15.<init>()
            boolean r3 = r13 instanceof androidx.navigation.C2966i
            if (r3 == 0) goto L_0x008f
            r3 = r2
        L_0x005a:
            androidx.navigation.i r10 = r3.f6727c
            if (r10 == 0) goto L_0x0088
            androidx.navigation.d r11 = new androidx.navigation.d
            android.content.Context r4 = r12.f6663a
            androidx.lifecycle.s r7 = r12.f6671i
            androidx.navigation.e r8 = r12.f6672j
            r3 = r11
            r5 = r10
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            r15.addFirst(r11)
            java.util.ArrayDeque r3 = r12.f6670h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0088
            java.util.ArrayDeque r3 = r12.f6670h
            java.lang.Object r3 = r3.getLast()
            androidx.navigation.d r3 = (androidx.navigation.C2953d) r3
            androidx.navigation.h r3 = r3.f6689c
            if (r3 != r10) goto L_0x0088
            int r3 = r10.f6728d
            r12.mo10946f(r3, r9)
        L_0x0088:
            if (r10 == 0) goto L_0x008f
            if (r10 != r13) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r3 = r10
            goto L_0x005a
        L_0x008f:
            boolean r13 = r15.isEmpty()
            if (r13 == 0) goto L_0x0097
            r13 = r2
            goto L_0x009f
        L_0x0097:
            java.lang.Object r13 = r15.getFirst()
            androidx.navigation.d r13 = (androidx.navigation.C2953d) r13
            androidx.navigation.h r13 = r13.f6689c
        L_0x009f:
            if (r13 == 0) goto L_0x00bf
            int r3 = r13.f6728d
            androidx.navigation.h r3 = r12.mo10942b(r3)
            if (r3 != 0) goto L_0x00bf
            androidx.navigation.i r13 = r13.f6727c
            if (r13 == 0) goto L_0x009f
            androidx.navigation.d r10 = new androidx.navigation.d
            android.content.Context r4 = r12.f6663a
            androidx.lifecycle.s r7 = r12.f6671i
            androidx.navigation.e r8 = r12.f6672j
            r3 = r10
            r5 = r13
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            r15.addFirst(r10)
            goto L_0x009f
        L_0x00bf:
            boolean r13 = r15.isEmpty()
            if (r13 == 0) goto L_0x00c7
            r13 = r2
            goto L_0x00cf
        L_0x00c7:
            java.lang.Object r13 = r15.getLast()
            androidx.navigation.d r13 = (androidx.navigation.C2953d) r13
            androidx.navigation.h r13 = r13.f6689c
        L_0x00cf:
            java.util.ArrayDeque r3 = r12.f6670h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x010c
            java.util.ArrayDeque r3 = r12.f6670h
            java.lang.Object r3 = r3.getLast()
            androidx.navigation.d r3 = (androidx.navigation.C2953d) r3
            androidx.navigation.h r3 = r3.f6689c
            boolean r3 = r3 instanceof androidx.navigation.C2966i
            if (r3 == 0) goto L_0x010c
            java.util.ArrayDeque r3 = r12.f6670h
            java.lang.Object r3 = r3.getLast()
            androidx.navigation.d r3 = (androidx.navigation.C2953d) r3
            androidx.navigation.h r3 = r3.f6689c
            androidx.navigation.i r3 = (androidx.navigation.C2966i) r3
            int r4 = r13.f6728d
            androidx.navigation.h r3 = r3.mo10973m(r4, r0)
            if (r3 != 0) goto L_0x010c
            java.util.ArrayDeque r3 = r12.f6670h
            java.lang.Object r3 = r3.getLast()
            androidx.navigation.d r3 = (androidx.navigation.C2953d) r3
            androidx.navigation.h r3 = r3.f6689c
            int r3 = r3.f6728d
            boolean r3 = r12.mo10946f(r3, r9)
            if (r3 == 0) goto L_0x010c
            goto L_0x00cf
        L_0x010c:
            java.util.ArrayDeque r13 = r12.f6670h
            r13.addAll(r15)
            java.util.ArrayDeque r13 = r12.f6670h
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x0127
            java.util.ArrayDeque r13 = r12.f6670h
            java.lang.Object r13 = r13.getFirst()
            androidx.navigation.d r13 = (androidx.navigation.C2953d) r13
            androidx.navigation.h r13 = r13.f6689c
            androidx.navigation.i r15 = r12.f6666d
            if (r13 == r15) goto L_0x013b
        L_0x0127:
            androidx.navigation.d r13 = new androidx.navigation.d
            android.content.Context r4 = r12.f6663a
            androidx.navigation.i r5 = r12.f6666d
            androidx.lifecycle.s r7 = r12.f6671i
            androidx.navigation.e r8 = r12.f6672j
            r3 = r13
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.ArrayDeque r15 = r12.f6670h
            r15.addFirst(r13)
        L_0x013b:
            androidx.navigation.d r13 = new androidx.navigation.d
            android.content.Context r4 = r12.f6663a
            android.os.Bundle r6 = r2.mo10967a(r14)
            androidx.lifecycle.s r7 = r12.f6671i
            androidx.navigation.e r8 = r12.f6672j
            r3 = r13
            r5 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.ArrayDeque r14 = r12.f6670h
            r14.add(r13)
            goto L_0x0165
        L_0x0152:
            if (r15 == 0) goto L_0x0165
            boolean r13 = r15.f6749a
            if (r13 == 0) goto L_0x0165
            java.util.ArrayDeque r13 = r12.f6670h
            java.lang.Object r13 = r13.peekLast()
            androidx.navigation.d r13 = (androidx.navigation.C2953d) r13
            if (r13 == 0) goto L_0x0164
            r13.f6690d = r14
        L_0x0164:
            r0 = r9
        L_0x0165:
            r12.mo10949i()
            if (r1 != 0) goto L_0x016e
            if (r2 != 0) goto L_0x016e
            if (r0 == 0) goto L_0x0171
        L_0x016e:
            r12.mo10941a()
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo10944d(androidx.navigation.h, android.os.Bundle, androidx.navigation.m):void");
    }

    /* renamed from: e */
    public final void mo10945e() {
        if (!this.f6670h.isEmpty() && mo10946f(mo10943c().f6728d, true)) {
            mo10941a();
        }
    }

    /* renamed from: f */
    public final boolean mo10946f(int i, boolean z) {
        boolean z2;
        C2878l0 remove;
        boolean z3 = false;
        if (this.f6670h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator descendingIterator = this.f6670h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            C2964h hVar = ((C2953d) descendingIterator.next()).f6689c;
            C2990p c = this.f6673k.mo10998c(hVar.f6726b);
            if (z || hVar.f6728d != i) {
                arrayList.add(c);
            }
            if (hVar.f6728d == i) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            Log.i("NavController", "Ignoring popBackStack to destination " + C2964h.m6910c(this.f6663a, i) + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((C2990p) it.next()).mo10953e()) {
            C2953d dVar = (C2953d) this.f6670h.removeLast();
            if (dVar.f6691e.f6517c.isAtLeast(Lifecycle.State.CREATED)) {
                dVar.f6695i = Lifecycle.State.DESTROYED;
                dVar.mo10958a();
            }
            C2955e eVar = this.f6672j;
            if (!(eVar == null || (remove = eVar.f6700b.remove(dVar.f6693g)) == null)) {
                remove.mo10831a();
            }
            z3 = true;
        }
        mo10949i();
        return z3;
    }

    /* renamed from: g */
    public final Bundle mo10947g() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry next : this.f6673k.f6774a.entrySet()) {
            String str = (String) next.getKey();
            Bundle d = ((C2990p) next.getValue()).mo10962d();
            if (d != null) {
                arrayList.add(str);
                bundle2.putBundle(str, d);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f6670h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f6670h.size()];
            int i = 0;
            Iterator it = this.f6670h.iterator();
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState((C2953d) it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f6669g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f6669g);
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c7, code lost:
        if (r5 != 0) goto L_0x02cb;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10948h(int r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r0 = r18
            androidx.navigation.l r1 = r0.f6665c
            if (r1 != 0) goto L_0x0011
            androidx.navigation.l r1 = new androidx.navigation.l
            android.content.Context r2 = r0.f6663a
            androidx.navigation.q r3 = r0.f6673k
            r1.<init>(r2, r3)
            r0.f6665c = r1
        L_0x0011:
            androidx.navigation.l r1 = r0.f6665c
            r2 = r19
            androidx.navigation.i r1 = r1.mo10978c(r2)
            androidx.navigation.i r2 = r0.f6666d
            r3 = 1
            if (r2 == 0) goto L_0x0023
            int r2 = r2.f6728d
            r0.mo10946f(r2, r3)
        L_0x0023:
            r0.f6666d = r1
            android.os.Bundle r1 = r0.f6667e
            if (r1 == 0) goto L_0x0053
            java.lang.String r2 = "android-support-nav:controller:navigatorState:names"
            java.util.ArrayList r1 = r1.getStringArrayList(r2)
            if (r1 == 0) goto L_0x0053
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0053
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.navigation.q r4 = r0.f6673k
            androidx.navigation.p r4 = r4.mo10998c(r2)
            android.os.Bundle r5 = r0.f6667e
            android.os.Bundle r2 = r5.getBundle(r2)
            if (r2 == 0) goto L_0x0035
            r4.mo10961c(r2)
            goto L_0x0035
        L_0x0053:
            android.os.Parcelable[] r1 = r0.f6668f
            java.lang.String r2 = " cannot be found from the current destination "
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x00b8
            int r6 = r1.length
            r7 = r5
        L_0x005d:
            if (r7 >= r6) goto L_0x00b3
            r8 = r1[r7]
            androidx.navigation.NavBackStackEntryState r8 = (androidx.navigation.NavBackStackEntryState) r8
            int r9 = r8.f6660c
            androidx.navigation.h r12 = r0.mo10942b(r9)
            if (r12 == 0) goto L_0x0094
            android.os.Bundle r13 = r8.f6661d
            if (r13 == 0) goto L_0x0078
            android.content.Context r9 = r0.f6663a
            java.lang.ClassLoader r9 = r9.getClassLoader()
            r13.setClassLoader(r9)
        L_0x0078:
            androidx.navigation.d r9 = new androidx.navigation.d
            android.content.Context r11 = r0.f6663a
            androidx.lifecycle.s r14 = r0.f6671i
            androidx.navigation.e r15 = r0.f6672j
            java.util.UUID r10 = r8.f6659b
            android.os.Bundle r8 = r8.f6662e
            r16 = r10
            r10 = r9
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.ArrayDeque r8 = r0.f6670h
            r8.add(r9)
            int r7 = r7 + 1
            goto L_0x005d
        L_0x0094:
            android.content.Context r1 = r0.f6663a
            int r3 = r8.f6660c
            java.lang.String r1 = androidx.navigation.C2964h.m6910c(r1, r3)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Restoring the Navigation back stack failed: destination "
            java.lang.StringBuilder r1 = p003a2.C0023f.m111l(r4, r1, r2)
            androidx.navigation.h r2 = r18.mo10943c()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.<init>(r1)
            throw r3
        L_0x00b3:
            r18.mo10949i()
            r0.f6668f = r4
        L_0x00b8:
            androidx.navigation.i r1 = r0.f6666d
            if (r1 == 0) goto L_0x02d6
            java.util.ArrayDeque r1 = r0.f6670h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02d6
            boolean r1 = r0.f6669g
            if (r1 != 0) goto L_0x02ca
            android.app.Activity r1 = r0.f6664b
            if (r1 == 0) goto L_0x02ca
            android.content.Intent r1 = r1.getIntent()
            if (r1 != 0) goto L_0x00d4
            goto L_0x02c7
        L_0x00d4:
            android.os.Bundle r6 = r1.getExtras()
            if (r6 == 0) goto L_0x00e1
            java.lang.String r7 = "android-support-nav:controller:deepLinkIds"
            int[] r7 = r6.getIntArray(r7)
            goto L_0x00e2
        L_0x00e1:
            r7 = r4
        L_0x00e2:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            if (r6 == 0) goto L_0x00f0
            java.lang.String r9 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r6 = r6.getBundle(r9)
            goto L_0x00f1
        L_0x00f0:
            r6 = r4
        L_0x00f1:
            if (r6 == 0) goto L_0x00f6
            r8.putAll(r6)
        L_0x00f6:
            if (r7 == 0) goto L_0x00fb
            int r6 = r7.length
            if (r6 != 0) goto L_0x0153
        L_0x00fb:
            android.net.Uri r6 = r1.getData()
            if (r6 == 0) goto L_0x0153
            androidx.navigation.i r6 = r0.f6666d
            androidx.navigation.g r9 = new androidx.navigation.g
            r9.<init>(r1)
            androidx.navigation.h$a r6 = r6.mo10968e(r9)
            if (r6 == 0) goto L_0x0153
            androidx.navigation.h r9 = r6.f6734b
            r9.getClass()
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>()
            r7 = r9
        L_0x0119:
            androidx.navigation.i r11 = r7.f6727c
            if (r11 == 0) goto L_0x0123
            int r12 = r11.f6740k
            int r13 = r7.f6728d
            if (r12 == r13) goto L_0x0126
        L_0x0123:
            r10.addFirst(r7)
        L_0x0126:
            if (r11 != 0) goto L_0x0151
            int r7 = r10.size()
            int[] r7 = new int[r7]
            java.util.Iterator r10 = r10.iterator()
            r11 = r5
        L_0x0133:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0147
            java.lang.Object r12 = r10.next()
            androidx.navigation.h r12 = (androidx.navigation.C2964h) r12
            int r13 = r11 + 1
            int r12 = r12.f6728d
            r7[r11] = r12
            r11 = r13
            goto L_0x0133
        L_0x0147:
            android.os.Bundle r6 = r6.f6735c
            android.os.Bundle r6 = r9.mo10967a(r6)
            r8.putAll(r6)
            goto L_0x0153
        L_0x0151:
            r7 = r11
            goto L_0x0119
        L_0x0153:
            if (r7 == 0) goto L_0x02c6
            int r6 = r7.length
            if (r6 != 0) goto L_0x015a
            goto L_0x02c6
        L_0x015a:
            androidx.navigation.i r6 = r0.f6666d
            r9 = r5
        L_0x015d:
            int r10 = r7.length
            if (r9 >= r10) goto L_0x0198
            r10 = r7[r9]
            if (r9 != 0) goto L_0x016d
            androidx.navigation.i r11 = r0.f6666d
            int r12 = r11.f6728d
            if (r12 != r10) goto L_0x016b
            goto L_0x0171
        L_0x016b:
            r11 = r4
            goto L_0x0171
        L_0x016d:
            androidx.navigation.h r11 = r6.mo10973m(r10, r3)
        L_0x0171:
            if (r11 != 0) goto L_0x017a
            android.content.Context r6 = r0.f6663a
            java.lang.String r6 = androidx.navigation.C2964h.m6910c(r6, r10)
            goto L_0x0199
        L_0x017a:
            int r10 = r7.length
            int r10 = r10 - r3
            if (r9 == r10) goto L_0x0195
            androidx.navigation.i r11 = (androidx.navigation.C2966i) r11
        L_0x0180:
            int r6 = r11.f6740k
            androidx.navigation.h r6 = r11.mo10973m(r6, r3)
            boolean r6 = r6 instanceof androidx.navigation.C2966i
            if (r6 == 0) goto L_0x0194
            int r6 = r11.f6740k
            androidx.navigation.h r6 = r11.mo10973m(r6, r3)
            r11 = r6
            androidx.navigation.i r11 = (androidx.navigation.C2966i) r11
            goto L_0x0180
        L_0x0194:
            r6 = r11
        L_0x0195:
            int r9 = r9 + 1
            goto L_0x015d
        L_0x0198:
            r6 = r4
        L_0x0199:
            if (r6 == 0) goto L_0x01bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "Could not find destination "
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = " in the navigation graph, ignoring the deep link from "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "NavController"
            android.util.Log.i(r2, r1)
            goto L_0x02c7
        L_0x01bb:
            java.lang.String r6 = "android-support-nav:controller:deepLinkIntent"
            r8.putParcelable(r6, r1)
            int r6 = r1.getFlags()
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r9 = r9 & r6
            if (r9 == 0) goto L_0x0204
            r10 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 & r10
            if (r6 != 0) goto L_0x0204
            r1.addFlags(r10)
            android.content.Context r2 = r0.f6663a
            u0.x r6 = new u0.x
            r6.<init>(r2)
            android.content.ComponentName r2 = r1.getComponent()
            if (r2 != 0) goto L_0x01e9
            android.content.Context r2 = r6.f17712c
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.ComponentName r2 = r1.resolveActivity(r2)
        L_0x01e9:
            if (r2 == 0) goto L_0x01ee
            r6.mo20705a(r2)
        L_0x01ee:
            java.util.ArrayList<android.content.Intent> r2 = r6.f17711b
            r2.add(r1)
            r6.mo20706c()
            android.app.Activity r1 = r0.f6664b
            if (r1 == 0) goto L_0x02c4
            r1.finish()
            android.app.Activity r1 = r0.f6664b
            r1.overridePendingTransition(r5, r5)
            goto L_0x02c4
        L_0x0204:
            java.lang.String r1 = "Deep Linking failed: destination "
            if (r9 == 0) goto L_0x0253
            java.util.ArrayDeque r6 = r0.f6670h
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0217
            androidx.navigation.i r6 = r0.f6666d
            int r6 = r6.f6728d
            r0.mo10946f(r6, r3)
        L_0x0217:
            int r6 = r7.length
            if (r5 >= r6) goto L_0x02c4
            int r6 = r5 + 1
            r5 = r7[r5]
            androidx.navigation.h r9 = r0.mo10942b(r5)
            if (r9 == 0) goto L_0x0238
            r17 = 0
            r16 = 0
            r15 = -1
            r12 = 0
            r13 = 0
            androidx.navigation.m r5 = new androidx.navigation.m
            r10 = r5
            r11 = r15
            r14 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r0.mo10944d(r9, r8, r5)
            r5 = r6
            goto L_0x0217
        L_0x0238:
            android.content.Context r3 = r0.f6663a
            java.lang.String r3 = androidx.navigation.C2964h.m6910c(r3, r5)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = p003a2.C0023f.m111l(r1, r3, r2)
            androidx.navigation.h r2 = r18.mo10943c()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.<init>(r1)
            throw r4
        L_0x0253:
            androidx.navigation.i r2 = r0.f6666d
        L_0x0255:
            int r6 = r7.length
            if (r5 >= r6) goto L_0x02c2
            r6 = r7[r5]
            if (r5 != 0) goto L_0x025f
            androidx.navigation.i r9 = r0.f6666d
            goto L_0x0263
        L_0x025f:
            androidx.navigation.h r9 = r2.mo10973m(r6, r3)
        L_0x0263:
            if (r9 == 0) goto L_0x029f
            int r6 = r7.length
            int r6 = r6 - r3
            if (r5 == r6) goto L_0x0281
            androidx.navigation.i r9 = (androidx.navigation.C2966i) r9
        L_0x026b:
            int r2 = r9.f6740k
            androidx.navigation.h r2 = r9.mo10973m(r2, r3)
            boolean r2 = r2 instanceof androidx.navigation.C2966i
            if (r2 == 0) goto L_0x027f
            int r2 = r9.f6740k
            androidx.navigation.h r2 = r9.mo10973m(r2, r3)
            r9 = r2
            androidx.navigation.i r9 = (androidx.navigation.C2966i) r9
            goto L_0x026b
        L_0x027f:
            r2 = r9
            goto L_0x029b
        L_0x0281:
            android.os.Bundle r6 = r9.mo10967a(r8)
            r16 = 0
            r15 = -1
            androidx.navigation.i r10 = r0.f6666d
            int r11 = r10.f6728d
            r17 = 1
            r12 = 0
            r13 = 0
            androidx.navigation.m r14 = new androidx.navigation.m
            r10 = r14
            r4 = r14
            r14 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r0.mo10944d(r9, r6, r4)
        L_0x029b:
            int r5 = r5 + 1
            r4 = 0
            goto L_0x0255
        L_0x029f:
            android.content.Context r3 = r0.f6663a
            java.lang.String r3 = androidx.navigation.C2964h.m6910c(r3, r6)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = " cannot be found in graph "
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            r4.<init>(r1)
            throw r4
        L_0x02c2:
            r0.f6669g = r3
        L_0x02c4:
            r5 = r3
            goto L_0x02c7
        L_0x02c6:
            r5 = 0
        L_0x02c7:
            if (r5 == 0) goto L_0x02ca
            goto L_0x02cb
        L_0x02ca:
            r3 = 0
        L_0x02cb:
            if (r3 != 0) goto L_0x02d9
            androidx.navigation.i r1 = r0.f6666d
            r2 = r20
            r3 = 0
            r0.mo10944d(r1, r2, r3)
            goto L_0x02d9
        L_0x02d6:
            r18.mo10941a()
        L_0x02d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo10948h(int, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r4 > 1) goto L_0x0028;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10949i() {
        /*
            r6 = this;
            androidx.navigation.NavController$a r0 = r6.f6676n
            boolean r1 = r6.f6677o
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0027
            java.util.ArrayDeque r1 = r6.f6670h
            java.util.Iterator r1 = r1.iterator()
            r4 = r3
        L_0x000f:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0024
            java.lang.Object r5 = r1.next()
            androidx.navigation.d r5 = (androidx.navigation.C2953d) r5
            androidx.navigation.h r5 = r5.f6689c
            boolean r5 = r5 instanceof androidx.navigation.C2966i
            if (r5 != 0) goto L_0x000f
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0024:
            if (r4 <= r2) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = r3
        L_0x0028:
            r0.f163a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo10949i():void");
    }
}
