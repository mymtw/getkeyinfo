package com.etsy.android.p327ui.favorites;

import android.os.Bundle;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CollectionContainerKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CollectionKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.FavoritesTabKey;
import com.etsy.android.p327ui.navigation.specs.CollectionWithRecsSpec;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p425q9.C13265p;

/* renamed from: com.etsy.android.ui.favorites.d */
public final class C9833d {
    /* renamed from: a */
    public static FragmentNavigationKey m18091a(C9833d dVar, String str, C13265p pVar, UserCollection userCollection, Bundle bundle, String str2, String str3, boolean z, boolean z2, boolean z3, int i) {
        Collection collection;
        int i2 = i;
        Collection collection2 = null;
        C13265p pVar2 = (i2 & 2) != 0 ? null : pVar;
        UserCollection userCollection2 = (i2 & 4) != 0 ? null : userCollection;
        Bundle bundle2 = (i2 & 8) != 0 ? null : bundle;
        String str4 = (i2 & 16) != 0 ? null : str2;
        String str5 = (i2 & 32) != 0 ? null : str3;
        boolean z4 = false;
        boolean z5 = (i2 & 64) != 0 ? false : z;
        boolean z6 = (i2 & 128) != 0 ? false : z2;
        if ((i2 & 256) == 0) {
            z4 = z3;
        }
        dVar.getClass();
        C19383o.m32797g(str, "referrerString");
        EtsyId d = pVar2 != null ? pVar2.mo45959d() : null;
        boolean b = C19383o.m32792b((userCollection2 == null || (collection = userCollection2.getCollection()) == null) ? null : collection.getCreatorId(), d != null ? Long.valueOf(d.getIdAsLongDeprecated()) : null);
        if (z5 && z6) {
            return new CollectionContainerKey(str, (UserCollection) null, (CollectionWithRecsSpec) null, (Boolean) null, str4, str5, bundle2, 14, (DefaultConstructorMarker) null);
        }
        if ((userCollection2 != null ? userCollection2.getCollection() : null) != null && userCollection2.getCollection().getListingsCount() <= 0 && z4) {
            return new FavoritesTabKey(str, (String) null, (String) null, 0, false, (Bundle) null, 62, (DefaultConstructorMarker) null);
        }
        if (userCollection2 != null) {
            collection2 = userCollection2.getCollection();
        }
        if (collection2 == null) {
            return new CollectionKey(str, (Collection) null, (String) null, str4, str5, (String) null, false, bundle2, 102, (DefaultConstructorMarker) null);
        }
        return new CollectionContainerKey(str, userCollection2, (CollectionWithRecsSpec) null, Boolean.valueOf(b), (String) null, (String) null, bundle2, 52, (DefaultConstructorMarker) null);
    }
}
