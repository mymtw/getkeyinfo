package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.GiftOptionsHelper */
public final class GiftOptionsHelper {

    /* renamed from: a */
    public final View f23119a;

    /* renamed from: b */
    public final C13573c f23120b;

    /* renamed from: c */
    public final Button f23121c;

    /* renamed from: d */
    public final TextView f23122d;

    public GiftOptionsHelper(View view, C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23119a = view;
        this.f23120b = cVar;
        View findViewById = view.findViewById(R.id.gift_wrap_available);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.gift_wrap_available)");
        this.f23121c = (Button) findViewById;
        View findViewById2 = view.findViewById(R.id.gift_message_available);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.gift_message_available)");
        this.f23122d = (TextView) findViewById2;
    }

    /* renamed from: a */
    public final void mo34138a(C10564g gVar) {
        C19383o.m32797g(gVar, "giftInfo");
        if (gVar.f23169c || gVar.f23168b) {
            ViewExtensions.m12869m(this.f23119a);
            if (gVar.f23169c) {
                ViewExtensions.m12869m(this.f23122d);
            } else {
                ViewExtensions.m12860d(this.f23122d);
            }
            if (gVar.f23168b) {
                ViewExtensions.m12869m(this.f23121c);
                ViewExtensions.m12866j(this.f23121c, new GiftOptionsHelper$bind$1(this, gVar));
                return;
            }
            ViewExtensions.m12860d(this.f23121c);
            this.f23121c.setOnClickListener((View.OnClickListener) null);
            return;
        }
        ViewExtensions.m12860d(this.f23119a);
        ViewExtensions.m12860d(this.f23122d);
        ViewExtensions.m12860d(this.f23121c);
        this.f23121c.setOnClickListener((View.OnClickListener) null);
    }
}
