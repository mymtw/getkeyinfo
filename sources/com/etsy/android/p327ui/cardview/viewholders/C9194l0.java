package com.etsy.android.p327ui.cardview.viewholders;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.lib.models.apiv3.DeepLink;
import com.etsy.android.lib.models.apiv3.ListReminder;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CollectionContainerKey;
import com.etsy.android.p327ui.navigation.specs.CollectionWithRecsSpec;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p356ge.C12790b;
import p363he.C12821d;
import p415of.C13171a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.l0 */
public final class C9194l0 extends C13171a<ListReminder> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9194l0(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewTracker");
    }

    /* renamed from: d */
    public final void mo31328c(ListReminder listReminder) {
        C19383o.m32797g(listReminder, "data");
        this.f28980b.mo21333d("homescreen_tapped_list", C19388s.m32882r0(listReminder));
        EtsyId c = C18263b.f40057V.mo45958c();
        DeepLink deepLink = listReminder.getDeepLink();
        FragmentActivity fragmentActivity = null;
        List<String> pathSegments = Uri.parse(deepLink != null ? deepLink.getUrl() : null).getPathSegments();
        C19383o.m32796f(pathSegments, "parse(data.deepLink?.url).pathSegments");
        String str = (String) C19327t.m32645a1(pathSegments);
        if (c.getIdAsLongDeprecated() == listReminder.getUserId()) {
            C19383o.m32796f(str, "collectionKey");
            CollectionWithRecsSpec collectionWithRecsSpec = new CollectionWithRecsSpec(str, listReminder.getUserId(), listReminder.getSlug(), listReminder.getCount(), listReminder.getId(), false);
            Fragment a = mo45889a();
            Fragment a2 = mo45889a();
            if (a2 != null) {
                fragmentActivity = a2.getActivity();
            }
            C12790b.m20430b(a, new CollectionContainerKey(C19421p.m32935c0(fragmentActivity), (UserCollection) null, collectionWithRecsSpec, (Boolean) null, (String) null, (String) null, (Bundle) null, 122, (DefaultConstructorMarker) null));
            return;
        }
        Fragment a3 = mo45889a();
        DeepLink deepLink2 = listReminder.getDeepLink();
        C19383o.m32794d(deepLink2);
        String url = deepLink2.getUrl();
        C19383o.m32794d(url);
        C12790b.m20430b(a3, new C12821d(url));
    }
}
