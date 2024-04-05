package com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery;

import android.support.p013v4.media.C0069a;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p479xa.C13862a;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.estimateddelivery.d */
public final class C10257d extends C10424k {

    /* renamed from: d */
    public static final /* synthetic */ int f22540d = 0;

    /* renamed from: b */
    public final C13573c f22541b;

    /* renamed from: c */
    public final TextView f22542c;

    public C10257d(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_estimated_delivery, false));
        this.f22541b = cVar;
        View findViewById = this.itemView.findViewById(R.id.estimated_delivery_date_buybox);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…ted_delivery_date_buybox)");
        this.f22542c = (TextView) findViewById;
    }

    /* renamed from: b */
    public final void mo33629b() {
        EtsyLinkify.m19614h(this.f22542c);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10253a) {
            TextView textView = this.f22542c;
            C10253a aVar = (C10253a) jVar;
            String str = aVar.f22536a;
            textView.setText(str == null ? null : Html.fromHtml(str, 0));
            this.f22542c.setMovementMethod(LinkMovementMethod.getInstance());
            EtsyLinkify.m19607a(this.f22542c, aVar.f22537b, (String) null, new C13862a(2, this, jVar));
            return;
        }
        throw new IllegalArgumentException();
    }
}
