package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.u */
public final class C2794u {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C2795a> f6347a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final FragmentManager f6348b;

    /* renamed from: androidx.fragment.app.u$a */
    public static final class C2795a {

        /* renamed from: a */
        public final FragmentManager.C2723k f6349a;

        /* renamed from: b */
        public final boolean f6350b;

        public C2795a(FragmentManager.C2723k kVar, boolean z) {
            this.f6349a = kVar;
            this.f6350b = z;
        }
    }

    public C2794u(FragmentManager fragmentManager) {
        this.f6348b = fragmentManager;
    }

    /* renamed from: a */
    public final void mo10602a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10602a(fragment, bundle, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10414a(this.f6348b, fragment);
            }
        }
    }

    /* renamed from: b */
    public final void mo10603b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6348b;
        Context context = fragmentManager.f6147q.f6334c;
        Fragment fragment2 = fragmentManager.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10603b(fragment, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10415b(this.f6348b, fragment, context);
            }
        }
    }

    /* renamed from: c */
    public final void mo10604c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10604c(fragment, bundle, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10416c(this.f6348b, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    public final void mo10605d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10605d(fragment, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10417d(this.f6348b, fragment);
            }
        }
    }

    /* renamed from: e */
    public final void mo10606e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10606e(fragment, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10418e(this.f6348b, fragment);
            }
        }
    }

    /* renamed from: f */
    public final void mo10607f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10607f(fragment, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10419f(this.f6348b, fragment);
            }
        }
    }

    /* renamed from: g */
    public final void mo10608g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6348b;
        Context context = fragmentManager.f6147q.f6334c;
        Fragment fragment2 = fragmentManager.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10608g(fragment, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10420g(this.f6348b, fragment, context);
            }
        }
    }

    /* renamed from: h */
    public final void mo10609h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10609h(fragment, bundle, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10421h(this.f6348b, fragment);
            }
        }
    }

    /* renamed from: i */
    public final void mo10610i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10610i(fragment, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10422i(this.f6348b, fragment);
            }
        }
    }

    /* renamed from: j */
    public final void mo10611j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10611j(fragment, bundle, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10423j(this.f6348b, fragment, bundle);
            }
        }
    }

    /* renamed from: k */
    public final void mo10612k(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10612k(fragment, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10424k(this.f6348b, fragment);
            }
        }
    }

    /* renamed from: l */
    public final void mo10613l(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10613l(fragment, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10425l(this.f6348b, fragment);
            }
        }
    }

    /* renamed from: m */
    public final void mo10614m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10614m(fragment, view, bundle, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10426m(this.f6348b, fragment, view);
            }
        }
    }

    /* renamed from: n */
    public final void mo10615n(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f6348b.f6149s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6144n.mo10615n(fragment, true);
        }
        Iterator<C2795a> it = this.f6347a.iterator();
        while (it.hasNext()) {
            C2795a next = it.next();
            if (!z || next.f6350b) {
                next.f6349a.mo10427n(this.f6348b, fragment);
            }
        }
    }
}
