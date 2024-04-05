package androidx.fragment.app;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.C2751c0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: androidx.fragment.app.a */
public final class C2740a extends C2751c0 implements FragmentManager.C2721i, FragmentManager.C2726n {

    /* renamed from: s */
    public final FragmentManager f6218s;

    /* renamed from: t */
    public boolean f6219t;

    /* renamed from: u */
    public int f6220u;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2740a(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            androidx.fragment.app.q r0 = r3.mo10357G()
            androidx.fragment.app.r<?> r1 = r3.f6147q
            if (r1 == 0) goto L_0x000f
            android.content.Context r1 = r1.f6334c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f6220u = r0
            r2.f6218s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2740a.<init>(androidx.fragment.app.FragmentManager):void");
    }

    /* renamed from: a */
    public final boolean mo10430a(ArrayList<C2740a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m6465J(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f6252i) {
            return true;
        }
        FragmentManager fragmentManager = this.f6218s;
        if (fragmentManager.f6134d == null) {
            fragmentManager.f6134d = new ArrayList<>();
        }
        fragmentManager.f6134d.add(this);
        return true;
    }

    /* renamed from: d */
    public final int mo10483d() {
        return mo10488l(false);
    }

    /* renamed from: f */
    public final C2740a mo10484f(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f6218s) {
            mo10528b(new C2751c0.C2752a(fragment, 6));
            return this;
        }
        StringBuilder h = C0072d.m201h("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        h.append(fragment.toString());
        h.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(h.toString());
    }

    /* renamed from: g */
    public final void mo10485g(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.m6675d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder h = C0072d.m201h("Fragment ");
            h.append(cls.getCanonicalName());
            h.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(h.toString());
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 == null || str.equals(str3)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(C0070b.m184f(sb, fragment.mTag, " now ", str));
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo10528b(new C2751c0.C2752a(fragment, i2));
        fragment.mFragmentManager = this.f6218s;
    }

    public final String getName() {
        return this.f6254k;
    }

    /* renamed from: j */
    public final void mo10486j(int i) {
        if (this.f6252i) {
            if (FragmentManager.m6465J(2)) {
                toString();
            }
            int size = this.f6246c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2751c0.C2752a aVar = this.f6246c.get(i2);
                Fragment fragment = aVar.f6263b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m6465J(2)) {
                        Objects.toString(aVar.f6263b);
                        int i3 = aVar.f6263b.mBackStackNesting;
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final int mo10487k() {
        return mo10488l(true);
    }

    /* renamed from: l */
    public final int mo10488l(boolean z) {
        if (!this.f6219t) {
            if (FragmentManager.m6465J(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new C2773l0());
                mo10489m("  ", printWriter, true);
                printWriter.close();
            }
            this.f6219t = true;
            if (this.f6252i) {
                this.f6220u = this.f6218s.f6139i.getAndIncrement();
            } else {
                this.f6220u = -1;
            }
            this.f6218s.mo10402v(this, z);
            return this.f6220u;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: m */
    public final void mo10489m(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f6254k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f6220u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f6219t);
            if (this.f6251h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f6251h));
            }
            if (!(this.f6247d == 0 && this.f6248e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6247d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6248e));
            }
            if (!(this.f6249f == 0 && this.f6250g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6249f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6250g));
            }
            if (!(this.f6255l == 0 && this.f6256m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6255l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f6256m);
            }
            if (!(this.f6257n == 0 && this.f6258o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6257n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f6258o);
            }
        }
        if (!this.f6246c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f6246c.size();
            for (int i = 0; i < size; i++) {
                C2751c0.C2752a aVar = this.f6246c.get(i);
                switch (aVar.f6262a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder h = C0072d.m201h("cmd=");
                        h.append(aVar.f6262a);
                        str2 = h.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f6263b);
                if (z) {
                    if (!(aVar.f6265d == 0 && aVar.f6266e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f6265d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f6266e));
                    }
                    if (aVar.f6267f != 0 || aVar.f6268g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f6267f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f6268g));
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public final C2740a mo10490n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f6218s) {
            mo10528b(new C2751c0.C2752a(fragment, 3));
            return this;
        }
        StringBuilder h = C0072d.m201h("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        h.append(fragment.toString());
        h.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(h.toString());
    }

    /* renamed from: o */
    public final C2740a mo10491o(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f6218s) {
            StringBuilder h = C0072d.m201h("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            h.append(this.f6218s);
            throw new IllegalArgumentException(h.toString());
        } else if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        } else if (state != Lifecycle.State.DESTROYED) {
            mo10528b(new C2751c0.C2752a(fragment, state));
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    /* renamed from: p */
    public final C2740a mo10492p(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f6218s) {
            mo10528b(new C2751c0.C2752a(fragment, 8));
            return this;
        }
        StringBuilder h = C0072d.m201h("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        h.append(fragment.toString());
        h.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(h.toString());
    }

    public final String toString() {
        StringBuilder g = C0069a.m176g(128, "BackStackEntry{");
        g.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f6220u >= 0) {
            g.append(" #");
            g.append(this.f6220u);
        }
        if (this.f6254k != null) {
            g.append(" ");
            g.append(this.f6254k);
        }
        g.append("}");
        return g.toString();
    }
}
