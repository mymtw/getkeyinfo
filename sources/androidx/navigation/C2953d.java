package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C2861g0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2878l0;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.C2881n;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2888t;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C3265b;
import androidx.savedstate.C3268c;
import androidx.savedstate.C3269d;
import java.util.UUID;

/* renamed from: androidx.navigation.d */
public final class C2953d implements C2887s, C2880m0, C2881n, C3269d {

    /* renamed from: b */
    public final Context f6688b;

    /* renamed from: c */
    public final C2964h f6689c;

    /* renamed from: d */
    public Bundle f6690d;

    /* renamed from: e */
    public final C2888t f6691e;

    /* renamed from: f */
    public final C3268c f6692f;

    /* renamed from: g */
    public final UUID f6693g;

    /* renamed from: h */
    public Lifecycle.State f6694h;

    /* renamed from: i */
    public Lifecycle.State f6695i;

    /* renamed from: j */
    public C2955e f6696j;

    /* renamed from: k */
    public C2861g0 f6697k;

    /* renamed from: androidx.navigation.d$a */
    public static /* synthetic */ class C2954a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6698a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6698a = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6698a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6698a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6698a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6698a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6698a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f6698a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C2953d.C2954a.<clinit>():void");
        }
    }

    public C2953d(Context context, C2964h hVar, Bundle bundle, C2887s sVar, C2955e eVar) {
        this(context, hVar, bundle, sVar, eVar, UUID.randomUUID(), (Bundle) null);
    }

    /* renamed from: a */
    public final void mo10958a() {
        if (this.f6694h.ordinal() < this.f6695i.ordinal()) {
            this.f6691e.mo10839h(this.f6694h);
        } else {
            this.f6691e.mo10839h(this.f6695i);
        }
    }

    public final C2870k0.C2872b getDefaultViewModelProviderFactory() {
        if (this.f6697k == null) {
            this.f6697k = new C2861g0((Application) this.f6688b.getApplicationContext(), this, this.f6690d);
        }
        return this.f6697k;
    }

    public final Lifecycle getLifecycle() {
        return this.f6691e;
    }

    public final C3265b getSavedStateRegistry() {
        return this.f6692f.f7591b;
    }

    public final C2878l0 getViewModelStore() {
        C2955e eVar = this.f6696j;
        if (eVar != null) {
            UUID uuid = this.f6693g;
            C2878l0 l0Var = eVar.f6700b.get(uuid);
            if (l0Var != null) {
                return l0Var;
            }
            C2878l0 l0Var2 = new C2878l0();
            eVar.f6700b.put(uuid, l0Var2);
            return l0Var2;
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public C2953d(Context context, C2964h hVar, Bundle bundle, C2887s sVar, C2955e eVar, UUID uuid, Bundle bundle2) {
        this.f6691e = new C2888t(this, true);
        C3268c cVar = new C3268c(this);
        this.f6692f = cVar;
        this.f6694h = Lifecycle.State.CREATED;
        this.f6695i = Lifecycle.State.RESUMED;
        this.f6688b = context;
        this.f6693g = uuid;
        this.f6689c = hVar;
        this.f6690d = bundle;
        this.f6696j = eVar;
        cVar.mo12063a(bundle2);
        if (sVar != null) {
            this.f6694h = sVar.getLifecycle().mo10734b();
        }
    }
}
