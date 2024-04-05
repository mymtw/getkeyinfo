package com.etsy.android.p327ui.cardview.clickhandlers;

import android.content.Context;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.widget.ImageView;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.fragment.app.Fragment;
import com.etsy.android.R;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ShopLike;
import com.etsy.android.p327ui.favorites.C9853h;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.p327ui.util.C11782j;
import com.etsy.android.uikit.util.AnimationUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p356ge.C12790b;
import p370ie.C12948h;
import p370ie.C12949i;
import p415of.C13171a;
import p456ua.C13461f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.ShopCardClickHandler */
public final class ShopCardClickHandler extends C13171a<ShopLike> {

    /* renamed from: d */
    public final C11780h f20042d;

    /* renamed from: e */
    public final C13461f f20043e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopCardClickHandler(Fragment fragment, C8703p pVar, C11780h hVar, C13461f fVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewTracker");
        C19383o.m32797g(hVar, "favoriteRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        this.f20042d = hVar;
        this.f20043e = fVar;
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        ShopLike shopLike = (ShopLike) obj;
        C19383o.m32797g(shopLike, "data");
        mo31338e(shopLike, (String) null);
    }

    /* renamed from: d */
    public final void mo31337d(ShopCard shopCard, ImageView imageView, boolean z) {
        C19383o.m32797g(shopCard, ShopCard.SHOP_CARD);
        EtsyId shopId = shopCard.getShopId();
        if (!C18263b.f40057V.mo45960e()) {
            Fragment a = mo45889a();
            C12790b.m20430b(mo45889a(), new C12949i(new C12948h(C19421p.m32935c0(a != null ? a.getActivity() : null), EtsyAction.FAVORITE, (Bundle) null, shopId.getId(), (String) null, (String) null, 52), (ShopHomeFragment) null, 6));
            return;
        }
        boolean z2 = !z;
        new C9853h();
        C19383o.m32794d(imageView);
        if (z2) {
            AnimationUtil.m19605a(imageView, R.drawable.clg_icon_favorited);
            Context context = imageView.getContext();
            C19383o.m32796f(context, "favIcon.context");
            C1948d.m4270b(context, 10);
        } else {
            imageView.setImageResource(R.drawable.clg_icon_unfavorited);
        }
        EtsyId userId = shopCard.getUserId();
        C19383o.m32796f(userId, "shopCard.userId");
        String shopName = shopCard.getShopName();
        C19383o.m32796f(shopName, "shopCard.shopName");
        SubscribersKt.m32500e(C0391c.m1056b(this.f20043e, C0072d.m199f(this.f20043e, this.f20042d.mo38047a(new C11782j(userId, shopName, z2), this.f28980b))), ShopCardClickHandler$onFavoriteClicked$1.INSTANCE, ShopCardClickHandler$onFavoriteClicked$2.INSTANCE);
        shopCard.setIsFavorite(z2);
    }

    /* renamed from: e */
    public final void mo31338e(ShopLike shopLike, String str) {
        String str2 = str;
        C19383o.m32797g(shopLike, ShopCard.SHOP_CARD);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PredefinedAnalyticsProperty.SHOP_ID, shopLike.getShopId().getId());
        if (str2 != null) {
            linkedHashMap.put(PredefinedAnalyticsProperty.CONTENT_SOURCE, str2);
        }
        C8703p pVar = this.f28980b;
        pVar.mo21333d(this.f28980b.f19060b + "_tapped_shop", linkedHashMap);
        C12790b.m20430b(mo45889a(), new ShopHomeKey(C12790b.m20432d(mo45889a()), shopLike.getShopId(), (ShopHomeConfig) null, (Map) null, (String) null, (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 256, (DefaultConstructorMarker) null));
    }
}
