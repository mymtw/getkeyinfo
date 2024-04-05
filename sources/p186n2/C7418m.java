package p186n2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.support.p013v4.media.session.C0087d;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.appcompat.widget.C0326j;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.preference.C3039b;
import com.google.protobuf.C16910l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p173m.C7279a;
import p193o.C7494b;
import p193o.C7498f;

/* renamed from: n2.m */
public abstract class C7418m implements Cloneable {

    /* renamed from: w */
    public static final int[] f16557w = {2, 1, 3, 4};

    /* renamed from: x */
    public static final C7419a f16558x = new C7419a();

    /* renamed from: y */
    public static ThreadLocal<C7494b<Animator, C7420b>> f16559y = new ThreadLocal<>();

    /* renamed from: b */
    public String f16560b = getClass().getName();

    /* renamed from: c */
    public long f16561c = -1;

    /* renamed from: d */
    public long f16562d = -1;

    /* renamed from: e */
    public TimeInterpolator f16563e = null;

    /* renamed from: f */
    public ArrayList<Integer> f16564f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f16565g = new ArrayList<>();

    /* renamed from: h */
    public C7434u f16566h = new C7434u();

    /* renamed from: i */
    public C7434u f16567i = new C7434u();

    /* renamed from: j */
    public C7429r f16568j = null;

    /* renamed from: k */
    public int[] f16569k = f16557w;

    /* renamed from: l */
    public ArrayList<C7433t> f16570l;

    /* renamed from: m */
    public ArrayList<C7433t> f16571m;

    /* renamed from: n */
    public ArrayList<Animator> f16572n = new ArrayList<>();

    /* renamed from: o */
    public int f16573o = 0;

    /* renamed from: p */
    public boolean f16574p = false;

    /* renamed from: q */
    public boolean f16575q = false;

    /* renamed from: r */
    public ArrayList<C7422d> f16576r = null;

    /* renamed from: s */
    public ArrayList<Animator> f16577s = new ArrayList<>();

    /* renamed from: t */
    public C3039b f16578t;

    /* renamed from: u */
    public C7421c f16579u;

    /* renamed from: v */
    public C16910l f16580v = f16558x;

    /* renamed from: n2.m$a */
    public static class C7419a extends C16910l {
        /* renamed from: g */
        public final Path mo19794g(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: n2.m$b */
    public static class C7420b {

        /* renamed from: a */
        public View f16581a;

        /* renamed from: b */
        public String f16582b;

        /* renamed from: c */
        public C7433t f16583c;

        /* renamed from: d */
        public C7404h0 f16584d;

        /* renamed from: e */
        public C7418m f16585e;

        public C7420b(View view, String str, C7418m mVar, C7402g0 g0Var, C7433t tVar) {
            this.f16581a = view;
            this.f16582b = str;
            this.f16583c = tVar;
            this.f16584d = g0Var;
            this.f16585e = mVar;
        }
    }

    /* renamed from: n2.m$c */
    public static abstract class C7421c {
        /* renamed from: a */
        public abstract Rect mo19748a();
    }

    /* renamed from: n2.m$d */
    public interface C7422d {
        void onTransitionCancel(C7418m mVar);

        void onTransitionEnd(C7418m mVar);

        void onTransitionPause(C7418m mVar);

        void onTransitionResume(C7418m mVar);

        void onTransitionStart(C7418m mVar);
    }

    /* renamed from: c */
    public static void m14306c(C7434u uVar, View view, C7433t tVar) {
        uVar.f16609a.put(view, tVar);
        int id = view.getId();
        if (id >= 0) {
            if (uVar.f16610b.indexOfKey(id) >= 0) {
                uVar.f16610b.put(id, (Object) null);
            } else {
                uVar.f16610b.put(id, view);
            }
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        String k = C2364y.C2373i.m5264k(view);
        if (k != null) {
            if (uVar.f16612d.containsKey(k)) {
                uVar.f16612d.put(k, null);
            } else {
                uVar.f16612d.put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C7498f<View> fVar = uVar.f16611c;
                if (fVar.f16720b) {
                    fVar.mo19888d();
                }
                if (C7279a.m13947e(fVar.f16721c, fVar.f16723e, itemIdAtPosition) >= 0) {
                    View view2 = (View) uVar.f16611c.mo19889f(itemIdAtPosition, (Long) null);
                    if (view2 != null) {
                        C2364y.C2368d.m5228r(view2, false);
                        uVar.f16611c.mo19890h(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C2364y.C2368d.m5228r(view, true);
                uVar.f16611c.mo19890h(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: s */
    public static C7494b<Animator, C7420b> m14307s() {
        C7494b<Animator, C7420b> bVar = f16559y.get();
        if (bVar != null) {
            return bVar;
        }
        C7494b<Animator, C7420b> bVar2 = new C7494b<>();
        f16559y.set(bVar2);
        return bVar2;
    }

    /* renamed from: x */
    public static boolean m14308x(C7433t tVar, C7433t tVar2, String str) {
        Object obj = tVar.f16606a.get(str);
        Object obj2 = tVar2.f16606a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo19765A(View view) {
        this.f16565g.remove(view);
    }

    /* renamed from: B */
    public void mo19766B(ViewGroup viewGroup) {
        if (this.f16574p) {
            if (!this.f16575q) {
                C7494b<Animator, C7420b> s = m14307s();
                int i = s.f16745d;
                C7389c0 c0Var = C7439y.f16624a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C7420b n = s.mo19980n(i2);
                    if (n.f16581a != null) {
                        C7404h0 h0Var = n.f16584d;
                        if ((h0Var instanceof C7402g0) && ((C7402g0) h0Var).f16543a.equals(windowId)) {
                            s.mo19978h(i2).resume();
                        }
                    }
                }
                ArrayList<C7422d> arrayList = this.f16576r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f16576r.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((C7422d) arrayList2.get(i3)).onTransitionResume(this);
                    }
                }
            }
            this.f16574p = false;
        }
    }

    /* renamed from: C */
    public void mo19767C() {
        mo19774K();
        C7494b<Animator, C7420b> s = m14307s();
        Iterator<Animator> it = this.f16577s.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (s.containsKey(next)) {
                mo19774K();
                if (next != null) {
                    next.addListener(new C7423n(this, s));
                    long j = this.f16562d;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f16561c;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f16563e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new C7424o(this));
                    next.start();
                }
            }
        }
        this.f16577s.clear();
        mo19786p();
    }

    /* renamed from: D */
    public void mo19768D(long j) {
        this.f16562d = j;
    }

    /* renamed from: E */
    public void mo19769E(C7421c cVar) {
        this.f16579u = cVar;
    }

    /* renamed from: F */
    public void mo19770F(TimeInterpolator timeInterpolator) {
        this.f16563e = timeInterpolator;
    }

    /* renamed from: H */
    public void mo19771H(C16910l lVar) {
        if (lVar == null) {
            this.f16580v = f16558x;
        } else {
            this.f16580v = lVar;
        }
    }

    /* renamed from: I */
    public void mo19772I(C3039b bVar) {
        this.f16578t = bVar;
    }

    /* renamed from: J */
    public void mo19773J(long j) {
        this.f16561c = j;
    }

    /* renamed from: K */
    public final void mo19774K() {
        if (this.f16573o == 0) {
            ArrayList<C7422d> arrayList = this.f16576r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f16576r.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C7422d) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.f16575q = false;
        }
        this.f16573o++;
    }

    /* renamed from: L */
    public String mo19775L(String str) {
        StringBuilder h = C0072d.m201h(str);
        h.append(getClass().getSimpleName());
        h.append("@");
        h.append(Integer.toHexString(hashCode()));
        h.append(": ");
        String sb = h.toString();
        if (this.f16562d != -1) {
            sb = C0087d.m236f(C0073e.m211k(sb, "dur("), this.f16562d, ") ");
        }
        if (this.f16561c != -1) {
            sb = C0087d.m236f(C0073e.m211k(sb, "dly("), this.f16561c, ") ");
        }
        if (this.f16563e != null) {
            StringBuilder k = C0073e.m211k(sb, "interp(");
            k.append(this.f16563e);
            k.append(") ");
            sb = k.toString();
        }
        if (this.f16564f.size() <= 0 && this.f16565g.size() <= 0) {
            return sb;
        }
        String i = C0326j.m864i(sb, "tgts(");
        if (this.f16564f.size() > 0) {
            for (int i2 = 0; i2 < this.f16564f.size(); i2++) {
                if (i2 > 0) {
                    i = C0326j.m864i(i, ", ");
                }
                StringBuilder h2 = C0072d.m201h(i);
                h2.append(this.f16564f.get(i2));
                i = h2.toString();
            }
        }
        if (this.f16565g.size() > 0) {
            for (int i3 = 0; i3 < this.f16565g.size(); i3++) {
                if (i3 > 0) {
                    i = C0326j.m864i(i, ", ");
                }
                StringBuilder h3 = C0072d.m201h(i);
                h3.append(this.f16565g.get(i3));
                i = h3.toString();
            }
        }
        return C0326j.m864i(i, ")");
    }

    /* renamed from: a */
    public void mo19776a(C7422d dVar) {
        if (this.f16576r == null) {
            this.f16576r = new ArrayList<>();
        }
        this.f16576r.add(dVar);
    }

    /* renamed from: b */
    public void mo19777b(View view) {
        this.f16565g.add(view);
    }

    public void cancel() {
        for (int size = this.f16572n.size() - 1; size >= 0; size--) {
            this.f16572n.get(size).cancel();
        }
        ArrayList<C7422d> arrayList = this.f16576r;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f16576r.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C7422d) arrayList2.get(i)).onTransitionCancel(this);
            }
        }
    }

    /* renamed from: d */
    public abstract void mo19719d(C7433t tVar);

    /* renamed from: f */
    public final void mo19780f(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C7433t tVar = new C7433t(view);
                if (z) {
                    mo19720i(tVar);
                } else {
                    mo19719d(tVar);
                }
                tVar.f16608c.add(this);
                mo19781h(tVar);
                if (z) {
                    m14306c(this.f16566h, view, tVar);
                } else {
                    m14306c(this.f16567i, view, tVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    mo19780f(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo19781h(C7433t tVar) {
        if (this.f16578t != null && !tVar.f16606a.isEmpty()) {
            this.f16578t.mo11185q0();
            String[] strArr = C7407k.f16546d;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    z = true;
                    break;
                } else if (!tVar.f16606a.containsKey(strArr[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f16578t.mo11183h0(tVar);
            }
        }
    }

    /* renamed from: i */
    public abstract void mo19720i(C7433t tVar);

    /* renamed from: j */
    public final void mo19782j(ViewGroup viewGroup, boolean z) {
        mo19783k(z);
        if (this.f16564f.size() > 0 || this.f16565g.size() > 0) {
            for (int i = 0; i < this.f16564f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f16564f.get(i).intValue());
                if (findViewById != null) {
                    C7433t tVar = new C7433t(findViewById);
                    if (z) {
                        mo19720i(tVar);
                    } else {
                        mo19719d(tVar);
                    }
                    tVar.f16608c.add(this);
                    mo19781h(tVar);
                    if (z) {
                        m14306c(this.f16566h, findViewById, tVar);
                    } else {
                        m14306c(this.f16567i, findViewById, tVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f16565g.size(); i2++) {
                View view = this.f16565g.get(i2);
                C7433t tVar2 = new C7433t(view);
                if (z) {
                    mo19720i(tVar2);
                } else {
                    mo19719d(tVar2);
                }
                tVar2.f16608c.add(this);
                mo19781h(tVar2);
                if (z) {
                    m14306c(this.f16566h, view, tVar2);
                } else {
                    m14306c(this.f16567i, view, tVar2);
                }
            }
            return;
        }
        mo19780f(viewGroup, z);
    }

    /* renamed from: k */
    public final void mo19783k(boolean z) {
        if (z) {
            this.f16566h.f16609a.clear();
            this.f16566h.f16610b.clear();
            this.f16566h.f16611c.mo19885b();
            return;
        }
        this.f16567i.f16609a.clear();
        this.f16567i.f16610b.clear();
        this.f16567i.f16611c.mo19885b();
    }

    /* renamed from: l */
    public C7418m clone() {
        try {
            C7418m mVar = (C7418m) super.clone();
            mVar.f16577s = new ArrayList<>();
            mVar.f16566h = new C7434u();
            mVar.f16567i = new C7434u();
            mVar.f16570l = null;
            mVar.f16571m = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public Animator mo19721m(ViewGroup viewGroup, C7433t tVar, C7433t tVar2) {
        return null;
    }

    /* renamed from: o */
    public void mo19785o(ViewGroup viewGroup, C7434u uVar, C7434u uVar2, ArrayList<C7433t> arrayList, ArrayList<C7433t> arrayList2) {
        int i;
        Animator m;
        View view;
        Animator animator;
        C7433t tVar;
        C7433t tVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C7494b<Animator, C7420b> s = m14307s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            C7433t tVar3 = arrayList.get(i2);
            C7433t tVar4 = arrayList2.get(i2);
            if (tVar3 != null && !tVar3.f16608c.contains(this)) {
                tVar3 = null;
            }
            if (tVar4 != null && !tVar4.f16608c.contains(this)) {
                tVar4 = null;
            }
            if (!(tVar3 == null && tVar4 == null)) {
                if ((tVar3 == null || tVar4 == null || mo19752v(tVar3, tVar4)) && (m = mo19721m(viewGroup2, tVar3, tVar4)) != null) {
                    if (tVar4 != null) {
                        view = tVar4.f16607b;
                        String[] t = mo19722t();
                        if (t != null && t.length > 0) {
                            C7433t tVar5 = new C7433t(view);
                            Animator animator3 = m;
                            i = size;
                            C7433t orDefault = uVar2.f16609a.getOrDefault(view, null);
                            if (orDefault != null) {
                                int i3 = 0;
                                while (i3 < t.length) {
                                    HashMap hashMap = tVar5.f16606a;
                                    String str = t[i3];
                                    hashMap.put(str, orDefault.f16606a.get(str));
                                    i3++;
                                    ArrayList<C7433t> arrayList3 = arrayList2;
                                    t = t;
                                }
                            }
                            int i4 = s.f16745d;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    tVar2 = tVar5;
                                    animator2 = animator3;
                                    break;
                                }
                                C7420b orDefault2 = s.getOrDefault(s.mo19978h(i5), null);
                                if (orDefault2.f16583c != null && orDefault2.f16581a == view && orDefault2.f16582b.equals(this.f16560b) && orDefault2.f16583c.equals(tVar5)) {
                                    tVar2 = tVar5;
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator2 = m;
                            tVar2 = null;
                        }
                        animator = animator2;
                        tVar = tVar2;
                    } else {
                        i = size;
                        view = tVar3.f16607b;
                        animator = m;
                        tVar = null;
                    }
                    if (animator != null) {
                        C3039b bVar = this.f16578t;
                        if (bVar != null) {
                            long r0 = bVar.mo11186r0(viewGroup2, this, tVar3, tVar4);
                            sparseIntArray.put(this.f16577s.size(), (int) r0);
                            j = Math.min(r0, j);
                        }
                        long j2 = j;
                        String str2 = this.f16560b;
                        C7389c0 c0Var = C7439y.f16624a;
                        s.put(animator, new C7420b(view, str2, this, new C7402g0(viewGroup2), tVar));
                        this.f16577s.add(animator);
                        j = j2;
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f16577s.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay(animator4.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - j));
            }
        }
    }

    /* renamed from: p */
    public final void mo19786p() {
        int i = this.f16573o - 1;
        this.f16573o = i;
        if (i == 0) {
            ArrayList<C7422d> arrayList = this.f16576r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f16576r.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C7422d) arrayList2.get(i2)).onTransitionEnd(this);
                }
            }
            for (int i3 = 0; i3 < this.f16566h.f16611c.mo19891i(); i3++) {
                View j = this.f16566h.f16611c.mo19892j(i3);
                if (j != null) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2368d.m5228r(j, false);
                }
            }
            for (int i4 = 0; i4 < this.f16567i.f16611c.mo19891i(); i4++) {
                View j2 = this.f16567i.f16611c.mo19892j(i4);
                if (j2 != null) {
                    WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                    C2364y.C2368d.m5228r(j2, false);
                }
            }
            this.f16575q = true;
        }
    }

    /* renamed from: q */
    public void mo19787q(ViewGroup viewGroup) {
        C7494b<Animator, C7420b> s = m14307s();
        int i = s.f16745d;
        if (viewGroup != null && i != 0) {
            C7389c0 c0Var = C7439y.f16624a;
            WindowId windowId = viewGroup.getWindowId();
            C7494b bVar = new C7494b((C7494b) s);
            s.clear();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                C7420b bVar2 = (C7420b) bVar.mo19980n(i2);
                if (bVar2.f16581a != null) {
                    C7404h0 h0Var = bVar2.f16584d;
                    if ((h0Var instanceof C7402g0) && ((C7402g0) h0Var).f16543a.equals(windowId)) {
                        ((Animator) bVar.mo19978h(i2)).end();
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public final C7433t mo19788r(View view, boolean z) {
        C7429r rVar = this.f16568j;
        if (rVar != null) {
            return rVar.mo19788r(view, z);
        }
        ArrayList<C7433t> arrayList = z ? this.f16570l : this.f16571m;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C7433t tVar = arrayList.get(i2);
            if (tVar == null) {
                return null;
            }
            if (tVar.f16607b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f16571m : this.f16570l).get(i);
    }

    /* renamed from: t */
    public String[] mo19722t() {
        return null;
    }

    public final String toString() {
        return mo19775L("");
    }

    /* renamed from: u */
    public final C7433t mo19790u(View view, boolean z) {
        C7429r rVar = this.f16568j;
        if (rVar != null) {
            return rVar.mo19790u(view, z);
        }
        return (z ? this.f16566h : this.f16567i).f16609a.getOrDefault(view, null);
    }

    /* renamed from: v */
    public boolean mo19752v(C7433t tVar, C7433t tVar2) {
        if (tVar == null || tVar2 == null) {
            return false;
        }
        String[] t = mo19722t();
        if (t != null) {
            int length = t.length;
            int i = 0;
            while (i < length) {
                if (!m14308x(tVar, tVar2, t[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String x : tVar.f16606a.keySet()) {
            if (m14308x(tVar, tVar2, x)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: w */
    public final boolean mo19791w(View view) {
        return (this.f16564f.size() == 0 && this.f16565g.size() == 0) || this.f16564f.contains(Integer.valueOf(view.getId())) || this.f16565g.contains(view);
    }

    /* renamed from: y */
    public void mo19792y(View view) {
        int i;
        if (!this.f16575q) {
            C7494b<Animator, C7420b> s = m14307s();
            int i2 = s.f16745d;
            C7389c0 c0Var = C7439y.f16624a;
            WindowId windowId = view.getWindowId();
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                C7420b n = s.mo19980n(i3);
                if (n.f16581a != null) {
                    C7404h0 h0Var = n.f16584d;
                    if ((h0Var instanceof C7402g0) && ((C7402g0) h0Var).f16543a.equals(windowId)) {
                        i = 1;
                    }
                    if (i != 0) {
                        s.mo19978h(i3).pause();
                    }
                }
                i3--;
            }
            ArrayList<C7422d> arrayList = this.f16576r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f16576r.clone();
                int size = arrayList2.size();
                while (i < size) {
                    ((C7422d) arrayList2.get(i)).onTransitionPause(this);
                    i++;
                }
            }
            this.f16574p = true;
        }
    }

    /* renamed from: z */
    public void mo19793z(C7422d dVar) {
        ArrayList<C7422d> arrayList = this.f16576r;
        if (arrayList != null) {
            arrayList.remove(dVar);
            if (this.f16576r.size() == 0) {
                this.f16576r = null;
            }
        }
    }
}
