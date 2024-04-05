package com.etsy.android.p327ui.cart.viewholders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.MessageBanner;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.viewholders.u */
public final class C9407u extends C12086e<CartGroupItem> {

    /* renamed from: c */
    public final C9282g f20858c;

    /* renamed from: d */
    public final TextView f20859d;

    /* renamed from: e */
    public final TextView f20860e;

    /* renamed from: f */
    public final Button f20861f;

    /* renamed from: g */
    public final ImageView f20862g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9407u(ViewGroup viewGroup, C9282g gVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_msco_message_banner, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(gVar, "clickHandler");
        this.f20858c = gVar;
        View f = mo38986f(R.id.txt_title);
        C19383o.m32795e(f, "null cannot be cast to non-null type android.widget.TextView");
        this.f20859d = (TextView) f;
        View f2 = mo38986f(R.id.txt_message);
        C19383o.m32795e(f2, "null cannot be cast to non-null type android.widget.TextView");
        this.f20860e = (TextView) f2;
        View f3 = mo38986f(R.id.btn_dismiss);
        C19383o.m32795e(f3, "null cannot be cast to non-null type android.widget.Button");
        this.f20861f = (Button) f3;
        View f4 = mo38986f(R.id.image);
        C19383o.m32795e(f4, "null cannot be cast to non-null type android.widget.ImageView");
        this.f20862g = (ImageView) f4;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        CartGroupItem cartGroupItem = (CartGroupItem) obj;
        C19383o.m32797g(cartGroupItem, "item");
        MessageBanner messageBanner = (MessageBanner) cartGroupItem.getData();
        if (messageBanner != null) {
            this.f20859d.setText(messageBanner.getTitle());
            this.f20860e.setText(messageBanner.getMessage());
            C0114h.m272C0(this.f20862g).load(messageBanner.getImageUrl()).mo16816M(this.f20862g);
            this.f20861f.setText(messageBanner.getButtonText());
            Button button = this.f20861f;
            String buttonText = messageBanner.getButtonText();
            C19383o.m32796f(buttonText, "buttonText");
            int i = 0;
            if (buttonText.length() == 0) {
                i = 8;
            }
            button.setVisibility(i);
            this.f20861f.setOnClickListener(new MessageBannerViewHolder$bind$1$1(cartGroupItem, this));
        }
    }
}
