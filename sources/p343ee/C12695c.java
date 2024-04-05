package p343ee;

import android.os.Bundle;
import com.etsy.android.R;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.YouKey;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ee.c */
public final class C12695c implements C12693a {

    /* renamed from: b */
    public final boolean f27967b;

    public C12695c(boolean z) {
        this.f27967b = z;
    }

    /* renamed from: k */
    public final ArrayList<FragmentNavigationKey> mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        ArrayList<FragmentNavigationKey> arrayList = new ArrayList<>();
        if (this.f27967b || !z) {
            arrayList.add(new YouKey(fragmentNavigationKey.getReferrer(), (Bundle) null, (String) null, 6, (DefaultConstructorMarker) null));
        }
        arrayList.add(fragmentNavigationKey);
        return arrayList;
    }

    /* renamed from: o */
    public final int mo21o() {
        return R.id.menu_bottom_nav_you;
    }
}
