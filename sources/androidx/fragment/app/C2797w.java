package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2878l0;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.w */
public final class C2797w extends C2866i0 {

    /* renamed from: h */
    public static final C2798a f6351h = new C2798a();

    /* renamed from: b */
    public final HashMap<String, Fragment> f6352b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, C2797w> f6353c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C2878l0> f6354d = new HashMap<>();

    /* renamed from: e */
    public final boolean f6355e;

    /* renamed from: f */
    public boolean f6356f = false;

    /* renamed from: g */
    public boolean f6357g = false;

    /* renamed from: androidx.fragment.app.w$a */
    public class C2798a implements C2870k0.C2872b {
        public final <T extends C2866i0> T create(Class<T> cls) {
            return new C2797w(true);
        }
    }

    public C2797w(boolean z) {
        this.f6355e = z;
    }

    /* renamed from: b */
    public final void mo10616b(Fragment fragment) {
        if (this.f6357g) {
            FragmentManager.m6465J(2);
        } else if (!this.f6352b.containsKey(fragment.mWho)) {
            this.f6352b.put(fragment.mWho, fragment);
            if (FragmentManager.m6465J(2)) {
                fragment.toString();
            }
        }
    }

    /* renamed from: c */
    public final void mo10617c(Fragment fragment) {
        if (FragmentManager.m6465J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        mo10618d(fragment.mWho);
    }

    /* renamed from: d */
    public final void mo10618d(String str) {
        C2797w wVar = this.f6353c.get(str);
        if (wVar != null) {
            wVar.onCleared();
            this.f6353c.remove(str);
        }
        C2878l0 l0Var = this.f6354d.get(str);
        if (l0Var != null) {
            l0Var.mo10831a();
            this.f6354d.remove(str);
        }
    }

    /* renamed from: e */
    public final void mo10619e(Fragment fragment) {
        if (this.f6357g) {
            FragmentManager.m6465J(2);
            return;
        }
        if ((this.f6352b.remove(fragment.mWho) != null) && FragmentManager.m6465J(2)) {
            fragment.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2797w.class != obj.getClass()) {
            return false;
        }
        C2797w wVar = (C2797w) obj;
        return this.f6352b.equals(wVar.f6352b) && this.f6353c.equals(wVar.f6353c) && this.f6354d.equals(wVar.f6354d);
    }

    public final int hashCode() {
        int hashCode = this.f6353c.hashCode();
        return this.f6354d.hashCode() + ((hashCode + (this.f6352b.hashCode() * 31)) * 31);
    }

    public final void onCleared() {
        if (FragmentManager.m6465J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f6356f = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f6352b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f6353c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f6354d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
