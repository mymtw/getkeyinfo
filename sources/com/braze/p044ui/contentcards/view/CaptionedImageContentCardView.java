package com.braze.p044ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.models.cards.Card;
import com.appboy.p043ui.C4940R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p102f4.C6784b;

/* renamed from: com.braze.ui.contentcards.view.CaptionedImageContentCardView */
public class CaptionedImageContentCardView extends BaseContentCardView<CaptionedImageCard> {

    /* renamed from: com.braze.ui.contentcards.view.CaptionedImageContentCardView$a */
    public final class C5643a extends C6784b {

        /* renamed from: e */
        public final TextView f12054e;

        /* renamed from: f */
        public final TextView f12055f;

        /* renamed from: g */
        public final ImageView f12056g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5643a(CaptionedImageContentCardView captionedImageContentCardView, View view) {
            super(view, captionedImageContentCardView.isUnreadIndicatorEnabled());
            C19383o.m32797g(captionedImageContentCardView, "this$0");
            this.f12054e = (TextView) view.findViewById(C4940R.C4942id.com_braze_content_cards_captioned_image_title);
            this.f12055f = (TextView) view.findViewById(C4940R.C4942id.com_braze_content_cards_captioned_image_description);
            this.f12056g = (ImageView) view.findViewById(C4940R.C4942id.com_braze_content_cards_captioned_image_card_image);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptionedImageContentCardView(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    public void bindViewHolder(C6784b bVar, Card card) {
        TextView textView;
        C19383o.m32797g(bVar, "viewHolder");
        C19383o.m32797g(card, ResponseConstants.CARD);
        if (card instanceof CaptionedImageCard) {
            super.bindViewHolder(bVar, card);
            C5643a aVar = (C5643a) bVar;
            TextView textView2 = aVar.f12054e;
            if (textView2 != null) {
                setOptionalTextView(textView2, ((CaptionedImageCard) card).getTitle());
            }
            TextView textView3 = aVar.f12055f;
            if (textView3 != null) {
                setOptionalTextView(textView3, ((CaptionedImageCard) card).getDescription());
            }
            CaptionedImageCard captionedImageCard = (CaptionedImageCard) card;
            String domain = captionedImageCard.getDomain();
            String url = domain == null || C19457k.m33020X0(domain) ? card.getUrl() : captionedImageCard.getDomain();
            if (!(url == null || (textView = aVar.f14927d) == null)) {
                textView.setText(url);
            }
            setOptionalCardImage(aVar.f12056g, captionedImageCard.getAspectRatio(), captionedImageCard.getImageUrl(), card);
            View view = bVar.itemView;
            view.setContentDescription(captionedImageCard.getTitle() + " .  " + captionedImageCard.getDescription());
        }
    }

    public C6784b createViewHolder(ViewGroup viewGroup) {
        C19383o.m32797g(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4940R.C4943layout.com_braze_captioned_image_content_card, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        setViewBackground(inflate);
        return new C5643a(this, inflate);
    }
}
