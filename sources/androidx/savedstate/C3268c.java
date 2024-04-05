package androidx.savedstate;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C3265b;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p133i.C6971b;

/* renamed from: androidx.savedstate.c */
public final class C3268c {

    /* renamed from: a */
    public final C3269d f7590a;

    /* renamed from: b */
    public final C3265b f7591b = new C3265b();

    /* renamed from: c */
    public boolean f7592c;

    public C3268c(C3269d dVar) {
        this.f7590a = dVar;
    }

    /* renamed from: a */
    public final void mo12063a(Bundle bundle) {
        if (!this.f7592c) {
            Lifecycle lifecycle = this.f7590a.getLifecycle();
            C19383o.m32796f(lifecycle, "owner.lifecycle");
            if (lifecycle.mo10734b() == Lifecycle.State.INITIALIZED) {
                lifecycle.mo10733a(new Recreator(this.f7590a));
                C3265b bVar = this.f7591b;
                bVar.getClass();
                if (!bVar.f7585b) {
                    lifecycle.mo10733a(new C3264a(bVar));
                    bVar.f7585b = true;
                    this.f7592c = true;
                } else {
                    throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
                }
            } else {
                throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
            }
        }
        Lifecycle lifecycle2 = this.f7590a.getLifecycle();
        C19383o.m32796f(lifecycle2, "owner.lifecycle");
        if (!lifecycle2.mo10734b().isAtLeast(Lifecycle.State.STARTED)) {
            C3265b bVar2 = this.f7591b;
            if (!bVar2.f7585b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!bVar2.f7587d) {
                bVar2.f7586c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                bVar2.f7587d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            StringBuilder h = C0072d.m201h("performRestore cannot be called when owner is ");
            h.append(lifecycle2.mo10734b());
            throw new IllegalStateException(h.toString().toString());
        }
    }

    /* renamed from: b */
    public final void mo12064b(Bundle bundle) {
        C19383o.m32797g(bundle, "outBundle");
        C3265b bVar = this.f7591b;
        bVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bVar.f7586c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C6971b<String, C3265b.C3267b> bVar2 = bVar.f7584a;
        bVar2.getClass();
        C6971b.C6975d dVar = new C6971b.C6975d();
        bVar2.f15454d.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((C3265b.C3267b) entry.getValue()).mo1115a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
