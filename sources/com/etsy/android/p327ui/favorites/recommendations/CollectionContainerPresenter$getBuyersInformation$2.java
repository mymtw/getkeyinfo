package com.etsy.android.p327ui.favorites.recommendations;

import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.apiv3.UserProfileV3;
import com.etsy.android.p327ui.user.profile.C11623a;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.recommendations.CollectionContainerPresenter$getBuyersInformation$2 */
final class CollectionContainerPresenter$getBuyersInformation$2 extends Lambda implements C19857l<C11623a, C19394m> {
    public final /* synthetic */ C9871a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionContainerPresenter$getBuyersInformation$2(C9871a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11623a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11623a aVar) {
        if (aVar instanceof C11623a.C11625b) {
            UserProfileV3 userProfile = ((C11623a.C11625b) aVar).f25733a.getUserProfile();
            C9872b bVar = this.this$0.f21785e;
            if (bVar != null) {
                String displayName = userProfile.getDisplayName();
                bVar.setUpBuyersInformation(C9871a.m18104a(this.this$0, userProfile.getAvatarUrl(), displayName), userProfile.getAvatarUrl());
            }
        } else if (aVar instanceof C11623a.C11624a) {
            LogCatKt.m17045a().mo21306a(((C11623a.C11624a) aVar).f25730a);
        }
    }
}
