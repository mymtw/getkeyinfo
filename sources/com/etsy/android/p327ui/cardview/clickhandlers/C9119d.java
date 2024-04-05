package com.etsy.android.p327ui.cardview.clickhandlers;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.FindsCard;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.EditorsPicksKey;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12790b;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.d */
public final class C9119d extends C13171a<FindsCard> {
    public C9119d(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
    }

    /* renamed from: d */
    public final void mo31328c(FindsCard findsCard) {
        if (findsCard != null && !TextUtils.isEmpty(findsCard.getSlug())) {
            HashMap hashMap = new HashMap();
            hashMap.put(PredefinedAnalyticsProperty.CONTENT_SOURCE, findsCard.getContentSource());
            hashMap.put(PredefinedAnalyticsProperty.POSITION, Integer.valueOf(C19388s.m32880q0(findsCard)));
            C8703p pVar = this.f28980b;
            pVar.mo21333d(this.f28980b.f19060b + "_editors_picks", hashMap);
            String d = C12790b.m20432d(mo45889a());
            String slug = findsCard.getSlug();
            C19383o.m32797g(slug, "slug");
            C12790b.m20430b(mo45889a(), new EditorsPicksKey(d, slug, !findsCard.isPublic(), (String) null, (String) null, (Bundle) null, (String) null, 64, (DefaultConstructorMarker) null));
        }
    }
}
