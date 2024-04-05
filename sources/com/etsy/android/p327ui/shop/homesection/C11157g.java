package com.etsy.android.p327ui.shop.homesection;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopRelatedLink;
import com.etsy.android.lib.models.ShopRelatedLinkExtensionsKt;
import com.etsy.android.lib.models.ShopRelatedLinkType;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p423pf.C13240j;

/* renamed from: com.etsy.android.ui.shop.homesection.g */
public final class C11157g extends C12086e<ShopRelatedLink> {

    /* renamed from: c */
    public final C13240j f24667c;

    /* renamed from: d */
    public final TextView f24668d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11157g(ViewGroup viewGroup, C13240j jVar) {
        super(C0114h.m305j0(viewGroup, R.layout.shop_related_links, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        this.f24667c = jVar;
        View findViewById = this.itemView.findViewById(R.id.related_link_text);
        C19383o.m32795e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f24668d = (TextView) findViewById;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ShopRelatedLink shopRelatedLink = (ShopRelatedLink) obj;
        C19383o.m32797g(shopRelatedLink, ResponseConstants.LINK);
        String string = this.itemView.getResources().getString(ShopRelatedLinkType.Companion.displayTitleResFromFieldName(shopRelatedLink.getTitle()));
        C19383o.m32796f(string, "itemView.resources.getSt…me(link.title),\n        )");
        this.f24668d.setText(string);
        Context context = this.itemView.getContext();
        int typeVectorIcon = ShopRelatedLinkExtensionsKt.getTypeVectorIcon(shopRelatedLink);
        Object obj2 = C8184a.f17966a;
        this.f24668d.setCompoundDrawablesWithIntrinsicBounds(C8184a.C8187c.m16466b(context, typeVectorIcon), (Drawable) null, (Drawable) null, (Drawable) null);
        if (this.f24667c != null) {
            ViewExtensions.m12866j(this.f24668d, new ShopHomeRelatedLinkViewHolder$bind$1$1(shopRelatedLink, this));
        }
        ViewExtensions.m12869m(this.f24668d);
    }
}
