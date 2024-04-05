package p040c9;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.dagger.AppInjector;
import com.etsy.android.lib.logger.C8694h;
import java.util.HashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p440s9.C13366a;
import p753kq.C19857l;

/* renamed from: c9.b */
public final class C4465b extends FragmentManager.C2723k {
    /* renamed from: h */
    public final void mo10421h(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        if (fragment instanceof C13366a) {
            C8694h.f19097a.mo21308c();
            C19382n.m32755k0(fragment);
            HashMap<Object, C19857l<Object, C19394m>> hashMap = AppInjector.f14261b;
            C19857l lVar = hashMap.get(fragment.getClass());
            if (lVar != null) {
                lVar.invoke(fragment);
            }
            hashMap.remove(fragment.getClass());
        }
    }
}
