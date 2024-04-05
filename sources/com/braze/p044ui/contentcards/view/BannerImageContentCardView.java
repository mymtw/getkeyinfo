package com.braze.p044ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.models.cards.Card;
import com.appboy.p043ui.C4940R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p102f4.C6784b;

/* renamed from: com.braze.ui.contentcards.view.BannerImageContentCardView */
public class BannerImageContentCardView extends BaseContentCardView<BannerImageCard> {

    /* renamed from: com.braze.ui.contentcards.view.BannerImageContentCardView$a */
    public final class C5642a extends C6784b {

        /* renamed from: e */
        public final ImageView f12053e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5642a(BannerImageContentCardView bannerImageContentCardView, View view) {
            super(view, bannerImageContentCardView.isUnreadIndicatorEnabled());
            C19383o.m32797g(bannerImageContentCardView, "this$0");
            this.f12053e = (ImageView) view.findViewById(C4940R.C4942id.com_braze_content_cards_banner_image_card_image);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerImageContentCardView(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    public void bindViewHolder(C6784b bVar, Card card) {
        C19383o.m32797g(bVar, "viewHolder");
        C19383o.m32797g(card, ResponseConstants.CARD);
        if (card instanceof BannerImageCard) {
            super.bindViewHolder(bVar, card);
            BannerImageCard bannerImageCard = (BannerImageCard) card;
            setOptionalCardImage(((C5642a) bVar).f12053e, bannerImageCard.getAspectRatio(), bannerImageCard.getImageUrl(), card);
        }
    }

    public C6784b createViewHolder(ViewGroup viewGroup) {
        C19383o.m32797g(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4940R.C4943layout.com_braze_banner_image_content_card, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        setViewBackground(inflate);
        return new C5642a(this, inflate);
    }
}
