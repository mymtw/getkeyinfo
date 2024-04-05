package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c0 */
public abstract class C2751c0 {

    /* renamed from: a */
    public final C2781q f6244a;

    /* renamed from: b */
    public final ClassLoader f6245b;

    /* renamed from: c */
    public ArrayList<C2752a> f6246c = new ArrayList<>();

    /* renamed from: d */
    public int f6247d;

    /* renamed from: e */
    public int f6248e;

    /* renamed from: f */
    public int f6249f;

    /* renamed from: g */
    public int f6250g;

    /* renamed from: h */
    public int f6251h;

    /* renamed from: i */
    public boolean f6252i;

    /* renamed from: j */
    public boolean f6253j = true;

    /* renamed from: k */
    public String f6254k;

    /* renamed from: l */
    public int f6255l;

    /* renamed from: m */
    public CharSequence f6256m;

    /* renamed from: n */
    public int f6257n;

    /* renamed from: o */
    public CharSequence f6258o;

    /* renamed from: p */
    public ArrayList<String> f6259p;

    /* renamed from: q */
    public ArrayList<String> f6260q;

    /* renamed from: r */
    public boolean f6261r = false;

    /* renamed from: androidx.fragment.app.c0$a */
    public static final class C2752a {

        /* renamed from: a */
        public int f6262a;

        /* renamed from: b */
        public Fragment f6263b;

        /* renamed from: c */
        public boolean f6264c;

        /* renamed from: d */
        public int f6265d;

        /* renamed from: e */
        public int f6266e;

        /* renamed from: f */
        public int f6267f;

        /* renamed from: g */
        public int f6268g;

        /* renamed from: h */
        public Lifecycle.State f6269h;

        /* renamed from: i */
        public Lifecycle.State f6270i;

        public C2752a() {
        }

        public C2752a(Fragment fragment, int i) {
            this.f6262a = i;
            this.f6263b = fragment;
            this.f6264c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f6269h = state;
            this.f6270i = state;
        }

        public C2752a(int i, Fragment fragment) {
            this.f6262a = i;
            this.f6263b = fragment;
            this.f6264c = true;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f6269h = state;
            this.f6270i = state;
        }

        public C2752a(Fragment fragment, Lifecycle.State state) {
            this.f6262a = 10;
            this.f6263b = fragment;
            this.f6264c = false;
            this.f6269h = fragment.mMaxState;
            this.f6270i = state;
        }
    }

    public C2751c0(C2781q qVar, ClassLoader classLoader) {
        this.f6244a = qVar;
        this.f6245b = classLoader;
    }

    /* renamed from: b */
    public final void mo10528b(C2752a aVar) {
        this.f6246c.add(aVar);
        aVar.f6265d = this.f6247d;
        aVar.f6266e = this.f6248e;
        aVar.f6267f = this.f6249f;
        aVar.f6268g = this.f6250g;
    }

    /* renamed from: c */
    public final void mo10529c(String str) {
        if (this.f6253j) {
            this.f6252i = true;
            this.f6254k = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: d */
    public abstract int mo10483d();

    /* renamed from: e */
    public final Fragment mo10530e(Bundle bundle, Class cls) {
        C2781q qVar = this.f6244a;
        if (qVar != null) {
            ClassLoader classLoader = this.f6245b;
            if (classLoader != null) {
                Fragment a = qVar.mo10411a(classLoader, cls.getName());
                if (bundle != null) {
                    a.setArguments(bundle);
                }
                return a;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    /* renamed from: f */
    public abstract C2740a mo10484f(Fragment fragment);

    /* renamed from: g */
    public abstract void mo10485g(int i, Fragment fragment, String str, int i2);

    /* renamed from: h */
    public final void mo10531h(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo10485g(i, fragment, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: i */
    public final void mo10532i(int i, int i2, int i3, int i4) {
        this.f6247d = i;
        this.f6248e = i2;
        this.f6249f = i3;
        this.f6250g = i4;
    }
}
