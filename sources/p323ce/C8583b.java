package p323ce;

import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;

/* renamed from: ce.b */
public final class C8583b {

    /* renamed from: a */
    public final FragmentNavigationKey f18677a;

    /* renamed from: b */
    public final ArrayList<FragmentNavigationKey> f18678b;

    /* renamed from: c */
    public int f18679c;

    public C8583b(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        this.f18677a = fragmentNavigationKey;
        this.f18678b = fragmentNavigationKey.getBackstackGenerator().mo19k(fragmentNavigationKey, z);
        this.f18679c = fragmentNavigationKey.getBackstackGenerator().mo21o();
    }
}
