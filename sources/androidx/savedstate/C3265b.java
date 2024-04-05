package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.lifecycle.SavedStateHandleController;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.C19383o;
import p133i.C6971b;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.savedstate.b */
public final class C3265b {

    /* renamed from: a */
    public final C6971b<String, C3267b> f7584a = new C6971b<>();

    /* renamed from: b */
    public boolean f7585b;

    /* renamed from: c */
    public Bundle f7586c;

    /* renamed from: d */
    public boolean f7587d;

    /* renamed from: e */
    public Recreator.C3261a f7588e;

    /* renamed from: f */
    public boolean f7589f = true;

    /* renamed from: androidx.savedstate.b$a */
    public interface C3266a {
        /* renamed from: a */
        void mo10797a(C3269d dVar);
    }

    /* renamed from: androidx.savedstate.b$b */
    public interface C3267b {
        /* renamed from: a */
        Bundle mo1115a();
    }

    /* renamed from: a */
    public final Bundle mo12060a(String str) {
        C19383o.m32797g(str, "key");
        if (this.f7587d) {
            Bundle bundle = this.f7586c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f7586c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f7586c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f7586c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: b */
    public final void mo12061b(String str, C3267b bVar) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(bVar, "provider");
        if (!(this.f7584a.mo19126c(str, bVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: c */
    public final void mo12062c() {
        Class<SavedStateHandleController.C2839a> cls = SavedStateHandleController.C2839a.class;
        if (this.f7589f) {
            Recreator.C3261a aVar = this.f7588e;
            if (aVar == null) {
                aVar = new Recreator.C3261a(this);
            }
            this.f7588e = aVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C3261a aVar2 = this.f7588e;
                if (aVar2 != null) {
                    aVar2.f7582a.add(cls.getName());
                }
            } catch (NoSuchMethodException e) {
                StringBuilder h = C0072d.m201h("Class ");
                h.append(cls.getSimpleName());
                h.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(h.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
