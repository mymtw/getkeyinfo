package com.braze.p044ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p043ui.C4940R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p102f4.C6784b;

/* renamed from: com.braze.ui.contentcards.view.TextAnnouncementContentCardView */
public class TextAnnouncementContentCardView extends BaseContentCardView<TextAnnouncementCard> {

    /* renamed from: com.braze.ui.contentcards.view.TextAnnouncementContentCardView$a */
    public final class C5646a extends C6784b {

        /* renamed from: e */
        public final TextView f12060e;

        /* renamed from: f */
        public final TextView f12061f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5646a(TextAnnouncementContentCardView textAnnouncementContentCardView, View view) {
            super(view, textAnnouncementContentCardView.isUnreadIndicatorEnabled());
            C19383o.m32797g(textAnnouncementContentCardView, "this$0");
            this.f12060e = (TextView) view.findViewById(C4940R.C4942id.com_braze_content_cards_text_announcement_card_title);
            this.f12061f = (TextView) view.findViewById(C4940R.C4942id.com_braze_content_cards_text_announcement_card_description);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextAnnouncementContentCardView(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    public void bindViewHolder(C6784b bVar, Card card) {
        TextView textView;
        C19383o.m32797g(bVar, "viewHolder");
        C19383o.m32797g(card, ResponseConstants.CARD);
        if (card instanceof TextAnnouncementCard) {
            super.bindViewHolder(bVar, card);
            C5646a aVar = (C5646a) bVar;
            TextView textView2 = aVar.f12060e;
            if (textView2 != null) {
                setOptionalTextView(textView2, ((TextAnnouncementCard) card).getTitle());
            }
            TextView textView3 = aVar.f12061f;
            if (textView3 != null) {
                setOptionalTextView(textView3, ((TextAnnouncementCard) card).getDescription());
            }
            TextAnnouncementCard textAnnouncementCard = (TextAnnouncementCard) card;
            String domain = textAnnouncementCard.getDomain();
            String url = domain == null || C19457k.m33020X0(domain) ? card.getUrl() : textAnnouncementCard.getDomain();
            if (!(url == null || (textView = aVar.f14927d) == null)) {
                textView.setText(url);
            }
            View view = bVar.itemView;
            view.setContentDescription(textAnnouncementCard.getTitle() + " . " + textAnnouncementCard.getDescription());
        }
    }

    public C6784b createViewHolder(ViewGroup viewGroup) {
        C19383o.m32797g(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4940R.C4943layout.com_braze_text_announcement_content_card, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        setViewBackground(inflate);
        return new C5646a(this, inflate);
    }
}
