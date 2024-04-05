package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.PaymentApplyGiftCard;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.uikit.util.TrackingOnCheckedChangeListener;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.cart.viewholders.z */
public final class C9416z extends C9370c {

    /* renamed from: c */
    public final TextView f20888c = ((TextView) mo38986f(R.id.txt_text));

    /* renamed from: d */
    public final CheckBox f20889d = ((CheckBox) mo38986f(R.id.checkbox_gift_card_applied));

    /* renamed from: e */
    public final C9282g f20890e;

    /* renamed from: f */
    public final TextView f20891f = ((TextView) mo38986f(R.id.txt_gift_card_subtitle));

    /* renamed from: com.etsy.android.ui.cart.viewholders.z$a */
    public class C9417a extends TrackingOnClickListener {
        public C9417a() {
        }

        public final void onViewClick(View view) {
            CheckBox checkBox = C9416z.this.f20889d;
            checkBox.setChecked(!checkBox.isChecked());
        }
    }

    /* renamed from: com.etsy.android.ui.cart.viewholders.z$b */
    public class C9418b extends TrackingOnCheckedChangeListener {

        /* renamed from: b */
        public final /* synthetic */ CartGroupItem f20893b;

        public C9418b(CartGroupItem cartGroupItem) {
            this.f20893b = cartGroupItem;
        }

        public final void onViewCheckedChanged(CompoundButton compoundButton, boolean z) {
            ServerDrivenAction action;
            if (C9416z.this.f20890e != null && (action = this.f20893b.getAction(ServerDrivenAction.TYPE_SHOULD_USE_GIFTCARD)) != null) {
                action.addParam("should_use_gift_card", String.valueOf(z));
                C9416z zVar = C9416z.this;
                zVar.f20890e.mo45936d(zVar.itemView, action);
            }
        }
    }

    public C9416z(ViewGroup viewGroup, C9282g gVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_payment_apply_gift_card, viewGroup, false));
        this.f20890e = gVar;
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        this.f20889d.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f20888c.setOnClickListener((View.OnClickListener) null);
        this.f20889d.setEnabled(cartGroupItem.isEnabled());
        this.f20888c.setEnabled(cartGroupItem.isEnabled());
        this.f20891f.setEnabled(cartGroupItem.isEnabled());
        PaymentApplyGiftCard paymentApplyGiftCard = (PaymentApplyGiftCard) cartGroupItem.getData();
        if (paymentApplyGiftCard != null) {
            TextView textView = this.f20888c;
            textView.setText(paymentApplyGiftCard.getTitle() + " " + paymentApplyGiftCard.getMoneyString());
            this.f20889d.setChecked(paymentApplyGiftCard.isApplied());
            if (!C8885d0.m17322f(paymentApplyGiftCard.getSubText())) {
                this.f20891f.setVisibility(0);
                this.f20891f.setText(paymentApplyGiftCard.getSubText());
            }
        }
        this.f20888c.setOnClickListener(new C9417a());
        this.f20889d.setOnCheckedChangeListener(new C9418b(cartGroupItem));
    }
}
