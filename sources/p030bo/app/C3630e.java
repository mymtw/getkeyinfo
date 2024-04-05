package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.C0761x;
import com.braze.coroutine.BrazeCoroutineScope;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import java.util.Set;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19861p;

/* renamed from: bo.app.e */
public final class C3630e implements SharedPreferences {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f8352a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f8353b;

    /* renamed from: c */
    private SharedPreferences f8354c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C19699g1 f8355d = C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C3631a(this, (C19340c<? super C3631a>) null), 3);

    @C19060c(mo70540c = "com.braze.storage.AsyncPrefs$storageInitJob$1", mo70541f = "AsyncPrefs.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.e$a */
    public static final class C3631a extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f8356b;

        /* renamed from: c */
        public final /* synthetic */ C3630e f8357c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3631a(C3630e eVar, C19340c<? super C3631a> cVar) {
            super(2, cVar);
            this.f8357c = eVar;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C3631a) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C3631a(this.f8357c, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f8356b == 0) {
                C0761x.m1684O0(obj);
                this.f8357c.f8352a.getSharedPreferences(this.f8357c.f8353b, 0);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C19060c(mo70540c = "com.braze.storage.AsyncPrefs$waitUntilReady$1", mo70541f = "AsyncPrefs.kt", mo70542l = {83}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.e$b */
    public static final class C3632b extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f8358b;

        /* renamed from: c */
        public final /* synthetic */ C3630e f8359c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3632b(C3630e eVar, C19340c<? super C3632b> cVar) {
            super(2, cVar);
            this.f8359c = eVar;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C3632b) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C3632b(this.f8359c, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f8358b;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19699g1 c = this.f8359c.f8355d;
                this.f8358b = 1;
                if (c.mo72394c0(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C19394m.f43287a;
        }
    }

    public C3630e(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "name");
        this.f8352a = context;
        this.f8353b = str;
    }

    public boolean contains(String str) {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            return sharedPreferences.contains(str);
        }
        C19383o.m32805o("prefs");
        throw null;
    }

    public SharedPreferences.Editor edit() {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            C19383o.m32796f(edit, "prefs.edit()");
            return edit;
        }
        C19383o.m32805o("prefs");
        throw null;
    }

    public Map<String, ?> getAll() {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            Map<String, ?> all = sharedPreferences.getAll();
            C19383o.m32796f(all, "prefs.all");
            return all;
        }
        C19383o.m32805o("prefs");
        throw null;
    }

    public boolean getBoolean(String str, boolean z) {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(str, z);
        }
        C19383o.m32805o("prefs");
        throw null;
    }

    public float getFloat(String str, float f) {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            return sharedPreferences.getFloat(str, f);
        }
        C19383o.m32805o("prefs");
        throw null;
    }

    public int getInt(String str, int i) {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, i);
        }
        C19383o.m32805o("prefs");
        throw null;
    }

    public long getLong(String str, long j) {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, j);
        }
        C19383o.m32805o("prefs");
        throw null;
    }

    public String getString(String str, String str2) {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, str2);
        }
        C19383o.m32805o("prefs");
        throw null;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            return sharedPreferences.getStringSet(str, set);
        }
        C19383o.m32805o("prefs");
        throw null;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } else {
            C19383o.m32805o("prefs");
            throw null;
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        m8566a();
        SharedPreferences sharedPreferences = this.f8354c;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } else {
            C19383o.m32805o("prefs");
            throw null;
        }
    }

    /* renamed from: a */
    private final void m8566a() {
        if (!this.f8355d.mo72395f()) {
            Object unused = C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new C3632b(this, (C19340c<? super C3632b>) null));
        }
        SharedPreferences sharedPreferences = this.f8352a.getSharedPreferences(this.f8353b, 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.f8354c = sharedPreferences;
    }
}
