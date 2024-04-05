package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C3265b;
import androidx.savedstate.C3269d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

final class SavedStateHandleController implements C2885q {

    /* renamed from: b */
    public final String f6452b;

    /* renamed from: c */
    public boolean f6453c = false;

    /* renamed from: d */
    public final C2858f0 f6454d;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    public static final class C2839a implements C3265b.C3266a {
        /* renamed from: a */
        public final void mo10797a(C3269d dVar) {
            if (dVar instanceof C2880m0) {
                C2878l0 viewModelStore = ((C2880m0) dVar).getViewModelStore();
                C3265b savedStateRegistry = dVar.getSavedStateRegistry();
                viewModelStore.getClass();
                Iterator it = new HashSet(viewModelStore.f6514a.keySet()).iterator();
                while (it.hasNext()) {
                    HashMap<String, C2866i0> hashMap = viewModelStore.f6514a;
                    Lifecycle lifecycle = dVar.getLifecycle();
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) hashMap.get((String) it.next()).getTag("androidx.lifecycle.savedstate.vm.tag");
                    if (savedStateHandleController != null && !savedStateHandleController.f6453c) {
                        savedStateHandleController.mo10796a(lifecycle, savedStateRegistry);
                        SavedStateHandleController.m6784b(lifecycle, savedStateRegistry);
                    }
                }
                if (!new HashSet(viewModelStore.f6514a.keySet()).isEmpty()) {
                    savedStateRegistry.mo12062c();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, C2858f0 f0Var) {
        this.f6452b = str;
        this.f6454d = f0Var;
    }

    /* renamed from: b */
    public static void m6784b(final Lifecycle lifecycle, final C3265b bVar) {
        Lifecycle.State b = lifecycle.mo10734b();
        if (b == Lifecycle.State.INITIALIZED || b.isAtLeast(Lifecycle.State.STARTED)) {
            bVar.mo12062c();
        } else {
            lifecycle.mo10733a(new C2885q() {
                public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        Lifecycle.this.mo10735c(this);
                        bVar.mo12062c();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo10796a(Lifecycle lifecycle, C3265b bVar) {
        if (!this.f6453c) {
            this.f6453c = true;
            lifecycle.mo10733a(this);
            bVar.mo12061b(this.f6452b, this.f6454d.f6485d);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f6453c = false;
            sVar.getLifecycle().mo10735c(this);
        }
    }
}
