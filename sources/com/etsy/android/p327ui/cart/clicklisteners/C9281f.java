package com.etsy.android.p327ui.cart.clicklisteners;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.p327ui.cart.C9330p;
import com.etsy.android.p327ui.cart.OnCartPageChangedListener;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import com.etsy.android.vespa.VespaBaseFragment;
import kotlin.jvm.internal.C19383o;
import p478x9.C13851a;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.f */
public final class C9281f {

    /* renamed from: a */
    public final VespaBaseFragment<?> f20498a;

    public C9281f(VespaBaseFragment<?> vespaBaseFragment) {
        C19383o.m32797g(vespaBaseFragment, "fragment");
        this.f20498a = vespaBaseFragment;
    }

    /* renamed from: a */
    public final boolean mo31623a(MessageCard messageCard, C9330p pVar) {
        C19383o.m32797g(messageCard, MessageCard.ITEM_TYPE);
        C19383o.m32797g(pVar, "cartUriParser");
        String deepLinkUrl = messageCard.getDeepLinkUrl();
        C19383o.m32796f(deepLinkUrl, "messageCard.deepLinkUrl");
        C13851a aVar = pVar.f20602b;
        Uri parse = Uri.parse(deepLinkUrl);
        C19383o.m32796f(parse, "parse(url)");
        if (!(aVar.mo46683a(parse) == DeepLinkEntity.CART)) {
            return false;
        }
        String deepLinkUrl2 = messageCard.getDeepLinkUrl();
        C19383o.m32796f(deepLinkUrl2, "messageCard.deepLinkUrl");
        Uri parse2 = Uri.parse(deepLinkUrl2);
        C19383o.m32796f(parse2, "parse(url)");
        OnCartPageChangedListener.Page page = pVar.f20601a.mo45509b(parse2, CartWithSavedKey.SAVED_TAB) ? OnCartPageChangedListener.Page.SAVED : OnCartPageChangedListener.Page.CART;
        Fragment parentFragment = this.f20498a.getParentFragment();
        if (parentFragment instanceof OnCartPageChangedListener) {
            ((OnCartPageChangedListener) parentFragment).onCartPageChanged(page);
        }
        return true;
    }
}
