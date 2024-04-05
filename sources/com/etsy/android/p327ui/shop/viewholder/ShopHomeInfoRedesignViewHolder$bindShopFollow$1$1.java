package com.etsy.android.p327ui.shop.viewholder;

import android.content.res.Resources;
import android.support.p013v4.media.C0072d;
import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ShopV3;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p438re.C13357c;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.shop.viewholder.ShopHomeInfoRedesignViewHolder$bindShopFollow$1$1 */
final class ShopHomeInfoRedesignViewHolder$bindShopFollow$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ Resources $res;
    public final /* synthetic */ ShopV3 $shop;
    public final /* synthetic */ C11283k $shopInfo;
    public final /* synthetic */ CollageButton $this_apply;
    public final /* synthetic */ C11288m this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopHomeInfoRedesignViewHolder$bindShopFollow$1$1(C11288m mVar, C11283k kVar, CollageButton collageButton, Resources resources, ShopV3 shopV3) {
        super(1);
        this.this$0 = mVar;
        this.$shopInfo = kVar;
        this.$this_apply = collageButton;
        this.$res = resources;
        this.$shop = shopV3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        String str;
        this.this$0.f24916c.mo31328c(new C13357c.C13359b(!this.$shopInfo.f24908b));
        C11283k kVar = this.$shopInfo;
        kVar.f24908b = !kVar.f24908b;
        CollageButton collageButton = this.$this_apply;
        StringBuilder sb = new StringBuilder();
        sb.append(this.$res.getString(R.string.favorite_shop));
        sb.append(' ');
        sb.append(this.$shop.getName());
        sb.append(' ');
        if (this.$shopInfo.f24908b) {
            StringBuilder h = C0072d.m201h(", ");
            h.append(this.$res.getString(R.string.selected_content_description));
            str = h.toString();
        } else {
            str = "";
        }
        sb.append(str);
        collageButton.setContentDescription(sb.toString());
    }
}
