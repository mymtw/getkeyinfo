package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.C2861g0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2878l0;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.C2881n;
import androidx.lifecycle.C2888t;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C3265b;
import androidx.savedstate.C3268c;
import androidx.savedstate.C3269d;

/* renamed from: androidx.fragment.app.k0 */
public final class C2771k0 implements C2881n, C3269d, C2880m0 {

    /* renamed from: b */
    public final Fragment f6315b;

    /* renamed from: c */
    public final C2878l0 f6316c;

    /* renamed from: d */
    public C2870k0.C2872b f6317d;

    /* renamed from: e */
    public C2888t f6318e = null;

    /* renamed from: f */
    public C3268c f6319f = null;

    public C2771k0(Fragment fragment, C2878l0 l0Var) {
        this.f6315b = fragment;
        this.f6316c = l0Var;
    }

    /* renamed from: a */
    public final void mo10576a(Lifecycle.Event event) {
        this.f6318e.mo10837f(event);
    }

    /* renamed from: b */
    public final void mo10577b() {
        if (this.f6318e == null) {
            this.f6318e = new C2888t(this, true);
            this.f6319f = new C3268c(this);
        }
    }

    public final C2870k0.C2872b getDefaultViewModelProviderFactory() {
        C2870k0.C2872b defaultViewModelProviderFactory = this.f6315b.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f6315b.mDefaultFactory)) {
            this.f6317d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f6317d == null) {
            Application application = null;
            Context context = this.f6315b.requireContext().getApplicationContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Application) {
                    application = (Application) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            this.f6317d = new C2861g0(application, this, this.f6315b.getArguments());
        }
        return this.f6317d;
    }

    public final Lifecycle getLifecycle() {
        mo10577b();
        return this.f6318e;
    }

    public final C3265b getSavedStateRegistry() {
        mo10577b();
        return this.f6319f.f7591b;
    }

    public final C2878l0 getViewModelStore() {
        mo10577b();
        return this.f6316c;
    }
}
