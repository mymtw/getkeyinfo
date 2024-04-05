package com.etsy.android.p327ui.cardview.viewholders;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.models.finds.GiftCardBanner;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CreateGiftCardKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.FullImageView;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.b0 */
public final class C9160b0 extends C12086e<GiftCardBanner> {

    /* renamed from: c */
    public TextView f20147c = ((TextView) this.itemView.findViewById(R.id.cta));

    /* renamed from: d */
    public TextView f20148d = ((TextView) this.itemView.findViewById(R.id.title));

    /* renamed from: e */
    public FullImageView f20149e = ((FullImageView) this.itemView.findViewById(R.id.banner_image));

    /* renamed from: com.etsy.android.ui.cardview.viewholders.b0$a */
    public class C9161a extends TrackingOnClickListener {
        public C9161a() {
        }

        public final void onViewClick(View view) {
            C12788a.m20424c((FragmentActivity) C9160b0.this.itemView.getContext(), new CreateGiftCardKey(C19421p.m32935c0(C9160b0.this.itemView.getContext()), (Bundle) null));
        }
    }

    /* renamed from: com.etsy.android.ui.cardview.viewholders.b0$b */
    public class C9162b extends TrackingOnClickListener {
        public C9162b() {
        }

        public final void onViewClick(View view) {
            C12788a.m20424c((FragmentActivity) C9160b0.this.itemView.getContext(), new CreateGiftCardKey(C19421p.m32935c0(C9160b0.this.itemView.getContext()), (Bundle) null));
        }
    }

    public C9160b0(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_view_giftcard_banner, viewGroup, false));
        this.f20147c.setOnClickListener(new C9161a());
        this.itemView.setOnClickListener(new C9162b());
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        GiftCardBanner giftCardBanner = (GiftCardBanner) obj;
        this.f20148d.setText(giftCardBanner.getText());
        this.f20147c.setText(giftCardBanner.getCta());
        this.f20149e.setImageInfo(giftCardBanner.getGiftCardBannerImages());
    }
}
