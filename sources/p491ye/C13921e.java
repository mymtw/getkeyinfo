package p491ye;

import com.etsy.android.lib.util.C8890e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p496za.C13943a;
import p568fn.C17782b;

/* renamed from: ye.e */
public final class C13921e {

    /* renamed from: a */
    public final C13943a f30588a;

    /* renamed from: b */
    public final C8890e0 f30589b;

    public C13921e(C13943a aVar, C8890e0 e0Var) {
        C19383o.m32797g(aVar, "sharedPrefsProvider");
        C19383o.m32797g(e0Var, "systemTime");
        this.f30588a = aVar;
        this.f30589b = e0Var;
    }

    /* renamed from: a */
    public final ArrayList<String> mo46730a() {
        Set<String> stringSet = this.f30588a.mo46761a().getStringSet("tooltip_types", (Set) null);
        if (!C19543e0.m33306Y(stringSet)) {
            return null;
        }
        Object[] array = stringSet.toArray(new String[0]);
        C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        return C17782b.m29888u(Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: b */
    public final void mo46731b() {
        this.f30588a.mo46761a().edit().putInt("tooltip_displayed_updates_viewed", this.f30588a.mo46761a().getInt("tooltip_displayed_updates_viewed", 0) + 1).apply();
    }
}
