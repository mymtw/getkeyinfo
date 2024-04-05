package com.etsy.android.vespa.viewholders;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.LargeImageDeeplinkCard;
import kotlin.jvm.internal.C19383o;
import p423pf.C13232c;

/* renamed from: com.etsy.android.vespa.viewholders.s */
public final class C12107s extends C12086e<LargeImageDeeplinkCard> {

    /* renamed from: c */
    public final C8672b f27003c;

    /* renamed from: d */
    public final C13232c f27004d;

    /* renamed from: e */
    public final TextView f27005e;

    /* renamed from: f */
    public final ImageView f27006f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12107s(ViewGroup viewGroup, C8703p pVar, C13232c cVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_large_image_deeplink_card, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "analyticsTracker");
        C19383o.m32797g(cVar, "clickHandler");
        this.f27003c = pVar;
        this.f27004d = cVar;
        TextView textView = (TextView) this.itemView.findViewById(R.id.large_image_deeplink_card_title);
        C19383o.m32796f(textView, "itemView.large_image_deeplink_card_title");
        this.f27005e = textView;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.large_image_deeplink_card_image);
        C19383o.m32796f(imageView, "itemView.large_image_deeplink_card_image");
        this.f27006f = imageView;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        LargeImageDeeplinkCard largeImageDeeplinkCard = (LargeImageDeeplinkCard) obj;
        if (largeImageDeeplinkCard != null) {
            this.f27005e.setText(largeImageDeeplinkCard.getTitle());
            int generateLoadingColor = largeImageDeeplinkCard.getImage().generateLoadingColor();
            C0114h.m270B0(this.itemView.getContext()).load(largeImageDeeplinkCard.getImage().pickBestImageSource(this.f27006f.getMeasuredWidth(), this.f27006f.getMeasuredHeight())).mo17160t(new ColorDrawable(generateLoadingColor)).mo16816M(this.f27006f);
            View view = this.itemView;
            C19383o.m32796f(view, "itemView");
            ViewExtensions.m12865i(view, largeImageDeeplinkCard, new LargeImageDeeplinkCardViewHolder$bind$1$1(this, largeImageDeeplinkCard));
        }
    }
}
