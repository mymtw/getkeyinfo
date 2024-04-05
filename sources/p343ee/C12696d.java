package p343ee;

import com.etsy.android.R;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UpdatesKey;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;

/* renamed from: ee.d */
public final class C12696d implements C12693a {
    /* renamed from: k */
    public final ArrayList<FragmentNavigationKey> mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        ArrayList<FragmentNavigationKey> arrayList = new ArrayList<>();
        if (fragmentNavigationKey instanceof UpdatesKey) {
            arrayList.add(fragmentNavigationKey);
            return arrayList;
        }
        throw new UnsupportedNavigationException("Invalid key " + fragmentNavigationKey + " provided to " + this);
    }

    /* renamed from: o */
    public final int mo21o() {
        return R.id.menu_bottom_nav_updates;
    }
}
