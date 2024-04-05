package com.appboy.p043ui.widget;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import com.appboy.models.cards.Card;
import com.appboy.p043ui.C4940R;
import com.appboy.p043ui.feed.view.BaseFeedCardView;
import com.braze.support.BrazeLogger;

/* renamed from: com.appboy.ui.widget.DefaultCardView */
public class DefaultCardView extends BaseFeedCardView<Card> {
    private static final String TAG = BrazeLogger.m11287i(DefaultCardView.class);

    public DefaultCardView(Context context) {
        this(context, (Card) null);
    }

    public int getLayoutResource() {
        return C4940R.C4943layout.com_appboy_default_card;
    }

    public void onSetCard(Card card) {
        String str = TAG;
        StringBuilder h = C0072d.m201h("onSetCard called for blank view with: ");
        h.append(card.toString());
        BrazeLogger.m11292n(str, h.toString());
    }

    public DefaultCardView(Context context, Card card) {
        super(context);
        if (card != null) {
            setCard(card);
        }
    }
}
