package com.etsy.android.p327ui.shop.homesection;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.etsy.android.R;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.ShopRelatedLink;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.p327ui.user.addresses.C11392c;
import com.etsy.android.uikit.util.C11903g;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.shop.homesection.ShopHomeRelatedLinkViewHolder$bind$1$1 */
final class ShopHomeRelatedLinkViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ShopRelatedLink $link;
    public final /* synthetic */ C11157g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopHomeRelatedLinkViewHolder$bind$1$1(ShopRelatedLink shopRelatedLink, C11157g gVar) {
        super(1);
        this.$link = shopRelatedLink;
        this.this$0 = gVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        final String url = this.$link.getUrl();
        try {
            if (C8915n.m17353e(new URL(url).getHost())) {
                this.this$0.f24667c.mo31328c(url);
                return;
            }
            Context context = this.this$0.itemView.getContext();
            C19383o.m32796f(context, "itemView.context");
            final C11157g gVar = this.this$0;
            C111501 r1 = new C19857l<String, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(String str) {
                    C19383o.m32797g(str, "it");
                    gVar.f24667c.mo31328c(url);
                }
            };
            C19383o.m32797g(url, "url");
            AlertDialog.C0133a aVar = new AlertDialog.C0133a(context);
            aVar.mo1238i(R.string.convo_external_link_warning_title);
            aVar.mo1229b(R.string.convo_external_link_warning_message);
            aVar.f286a.f271m = true;
            aVar.setNegativeButton(R.string.convo_external_link_warning_cancel_button, new C11392c(1));
            aVar.setPositiveButton(R.string.convo_external_link_warning_open_button, new C11903g(r1, url));
            AlertDialog create = aVar.create();
            C19383o.m32796f(create, "builder.create()");
            create.show();
        } catch (MalformedURLException e) {
            LogCatKt.m17045a().mo21314h(e);
            C8901g0.m17338d(this.this$0.itemView.getContext(), "Unable to open link");
        }
    }
}
