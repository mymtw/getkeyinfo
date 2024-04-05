package com.braze.p044ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.p043ui.C4940R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p102f4.C6784b;

/* renamed from: com.braze.ui.contentcards.view.ShortNewsContentCardView */
public class ShortNewsContentCardView extends BaseContentCardView<ShortNewsCard> {
    private static final float ASPECT_RATIO = 1.0f;
    public static final C5644a Companion = new C5644a();

    /* renamed from: com.braze.ui.contentcards.view.ShortNewsContentCardView$a */
    public static final class C5644a {
    }

    /* renamed from: com.braze.ui.contentcards.view.ShortNewsContentCardView$b */
    public final class C5645b extends C6784b {

        /* renamed from: e */
        public final TextView f12057e;

        /* renamed from: f */
        public final TextView f12058f;

        /* renamed from: g */
        public final ImageView f12059g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5645b(ShortNewsContentCardView shortNewsContentCardView, View view) {
            super(view, shortNewsContentCardView.isUnreadIndicatorEnabled());
            C19383o.m32797g(shortNewsContentCardView, "this$0");
            this.f12057e = (TextView) view.findViewById(C4940R.C4942id.com_braze_content_cards_short_news_card_title);
            this.f12058f = (TextView) view.findViewById(C4940R.C4942id.com_braze_content_cards_short_news_card_description);
            this.f12059g = (ImageView) view.findViewById(C4940R.C4942id.com_braze_content_cards_short_news_card_image);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShortNewsContentCardView(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    public void bindViewHolder(C6784b bVar, Card card) {
        TextView textView;
        C19383o.m32797g(bVar, "viewHolder");
        C19383o.m32797g(card, ResponseConstants.CARD);
        if (card instanceof ShortNewsCard) {
            super.bindViewHolder(bVar, card);
            C5645b bVar2 = (C5645b) bVar;
            TextView textView2 = bVar2.f12057e;
            if (textView2 != null) {
                setOptionalTextView(textView2, ((ShortNewsCard) card).getTitle());
            }
            TextView textView3 = bVar2.f12058f;
            if (textView3 != null) {
                setOptionalTextView(textView3, ((ShortNewsCard) card).getDescription());
            }
            ShortNewsCard shortNewsCard = (ShortNewsCard) card;
            String domain = shortNewsCard.getDomain();
            String url = domain == null || C19457k.m33020X0(domain) ? card.getUrl() : shortNewsCard.getDomain();
            if (!(url == null || (textView = bVar2.f14927d) == null)) {
                textView.setText(url);
            }
            setOptionalCardImage(bVar2.f12059g, 1.0f, shortNewsCard.getImageUrl(), card);
            safeSetClipToOutline(bVar2.f12059g);
            View view = bVar.itemView;
            view.setContentDescription(shortNewsCard.getTitle() + " . " + shortNewsCard.getDescription());
        }
    }

    public C6784b createViewHolder(ViewGroup viewGroup) {
        C19383o.m32797g(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4940R.C4943layout.com_braze_short_news_content_card, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        setViewBackground(inflate);
        return new C5645b(this, inflate);
    }
}
