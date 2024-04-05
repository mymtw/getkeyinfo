package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.fragment.app.b0 */
public final class C2749b0 {

    /* renamed from: a */
    public final ArrayList<Fragment> f6237a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C2741a0> f6238b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, FragmentState> f6239c = new HashMap<>();

    /* renamed from: d */
    public C2797w f6240d;

    /* renamed from: a */
    public final void mo10518a(Fragment fragment) {
        if (!this.f6237a.contains(fragment)) {
            synchronized (this.f6237a) {
                this.f6237a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: b */
    public final Fragment mo10519b(String str) {
        C2741a0 a0Var = this.f6238b.get(str);
        if (a0Var != null) {
            return a0Var.f6223c;
        }
        return null;
    }

    /* renamed from: c */
    public final Fragment mo10520c(String str) {
        Fragment findFragmentByWho;
        for (C2741a0 next : this.f6238b.values()) {
            if (next != null && (findFragmentByWho = next.f6223c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final ArrayList mo10521d() {
        ArrayList arrayList = new ArrayList();
        for (C2741a0 next : this.f6238b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final ArrayList mo10522e() {
        ArrayList arrayList = new ArrayList();
        for (C2741a0 next : this.f6238b.values()) {
            if (next != null) {
                arrayList.add(next.f6223c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<Fragment> mo10523f() {
        ArrayList arrayList;
        if (this.f6237a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f6237a) {
            arrayList = new ArrayList(this.f6237a);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void mo10524g(C2741a0 a0Var) {
        Fragment fragment = a0Var.f6223c;
        if (!(this.f6238b.get(fragment.mWho) != null)) {
            this.f6238b.put(fragment.mWho, a0Var);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    this.f6240d.mo10616b(fragment);
                } else {
                    this.f6240d.mo10619e(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.m6465J(2)) {
                fragment.toString();
            }
        }
    }

    /* renamed from: h */
    public final void mo10525h(C2741a0 a0Var) {
        Fragment fragment = a0Var.f6223c;
        if (fragment.mRetainInstance) {
            this.f6240d.mo10619e(fragment);
        }
        if (this.f6238b.put(fragment.mWho, (Object) null) != null && FragmentManager.m6465J(2)) {
            fragment.toString();
        }
    }

    /* renamed from: i */
    public final FragmentState mo10526i(String str, FragmentState fragmentState) {
        return fragmentState != null ? this.f6239c.put(str, fragmentState) : this.f6239c.remove(str);
    }
}
