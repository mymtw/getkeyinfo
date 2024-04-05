package com.etsy.android.p327ui.cardview.viewholders;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.appboy.Constants;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.EditorialCard;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.EtsyWebKey;
import com.paypal.pyplcheckout.shippingmethods.view.adapters.ShippingMethodsAdapter;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p350fe.C12741o;
import p363he.C12821d;
import p478x9.C13858f;

/* renamed from: com.etsy.android.ui.cardview.viewholders.j */
public final /* synthetic */ class C9186j implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f20223b;

    /* renamed from: c */
    public final /* synthetic */ Object f20224c;

    /* renamed from: d */
    public final /* synthetic */ Object f20225d;

    /* renamed from: e */
    public final /* synthetic */ Object f20226e;

    public /* synthetic */ C9186j(Object obj, int i, Object obj2, Object obj3) {
        this.f20223b = i;
        this.f20224c = obj;
        this.f20225d = obj2;
        this.f20226e = obj3;
    }

    public final void onClick(View view) {
        boolean z;
        switch (this.f20223b) {
            case 0:
                C9190k kVar = (C9190k) this.f20224c;
                String str = (String) this.f20225d;
                EditorialCard editorialCard = (EditorialCard) this.f20226e;
                C19383o.m32797g(kVar, "this$0");
                C19383o.m32797g(str, "$url");
                kVar.f20266d.mo21333d("editorial_clicked", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.URL, str)));
                Uri parse = Uri.parse(str);
                C13858f a = C13858f.m21391a(parse);
                if (kVar.f20268f.f28043a.mo21132b(C8592b.C8599g.f18883c)) {
                    C12741o oVar = kVar.f20267e;
                    Context context = kVar.itemView.getContext();
                    C19383o.m32796f(context, "itemView.context");
                    C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                    z = oVar.mo45508a(context, parse);
                } else {
                    z = a != null;
                }
                if (z) {
                    C19421p.m32933W(kVar.itemView.getContext(), new C12821d(str));
                    return;
                } else {
                    C19421p.m32933W(kVar.itemView.getContext(), new EtsyWebKey(C19421p.m32935c0(kVar.itemView.getContext()), 19, str, editorialCard.getTitle()));
                    return;
                }
            default:
                ShippingMethodsAdapter.ItemViewHolder.m35439_init_$lambda0((ShippingMethodsAdapter.ShippingMethodsAdapterClickListener) this.f20224c, (ShippingMethodsAdapter) this.f20225d, (ShippingMethodsAdapter.ItemViewHolder) this.f20226e, view);
                return;
        }
    }
}
