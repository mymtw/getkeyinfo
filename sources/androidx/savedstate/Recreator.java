package androidx.savedstate;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C3265b;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

public final class Recreator implements C2885q {

    /* renamed from: b */
    public final C3269d f7581b;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C3261a implements C3265b.C3267b {

        /* renamed from: a */
        public final LinkedHashSet f7582a = new LinkedHashSet();

        public C3261a(C3265b bVar) {
            C19383o.m32797g(bVar, "registry");
            bVar.mo12061b("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public final Bundle mo1115a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f7582a));
            return bundle;
        }
    }

    public Recreator(C3269d dVar) {
        C19383o.m32797g(dVar, ResponseConstants.OWNER);
        this.f7581b = dVar;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            sVar.getLifecycle().mo10735c(this);
            Bundle a = this.f7581b.getSavedStateRegistry().mo12060a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C3265b.C3266a.class);
                            C19383o.m32796f(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                    C19383o.m32796f(newInstance, "{\n                constr…wInstance()\n            }");
                                    ((C3265b.C3266a) newInstance).mo10797a(this.f7581b);
                                } catch (Exception e) {
                                    throw new RuntimeException(C0326j.m864i("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder h = C0072d.m201h("Class ");
                                h.append(asSubclass.getSimpleName());
                                h.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(h.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(C0048b.m163a("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
