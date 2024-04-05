package com.appboy.p043ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p043ui.C4940R;
import com.appboy.p043ui.feed.view.BaseFeedCardView;
import com.braze.p044ui.actions.C5623a;
import com.braze.support.BrazeLogger;

/* renamed from: com.appboy.ui.widget.TextAnnouncementCardView */
public class TextAnnouncementCardView extends BaseFeedCardView<TextAnnouncementCard> {
    private static final String TAG = BrazeLogger.m11287i(TextAnnouncementCardView.class);
    private C5623a mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final TextView mTitle;

    public TextAnnouncementCardView(Context context) {
        this(context, (TextAnnouncementCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(TextAnnouncementCard textAnnouncementCard, View view) {
        handleCardClick(this.applicationContext, textAnnouncementCard, this.mCardAction);
    }

    public int getLayoutResource() {
        return C4940R.C4943layout.com_appboy_text_announcement_card;
    }

    public TextAnnouncementCardView(Context context, TextAnnouncementCard textAnnouncementCard) {
        super(context);
        this.mTitle = (TextView) findViewById(C4940R.C4942id.com_appboy_text_announcement_card_title);
        this.mDescription = (TextView) findViewById(C4940R.C4942id.com_appboy_text_announcement_card_description);
        this.mDomain = (TextView) findViewById(C4940R.C4942id.com_appboy_text_announcement_card_domain);
        if (textAnnouncementCard != null) {
            setCard(textAnnouncementCard);
        }
        setBackground(getResources().getDrawable(C4940R.C4941drawable.com_appboy_card_background));
    }

    public void onSetCard(TextAnnouncementCard textAnnouncementCard) {
        this.mTitle.setText(textAnnouncementCard.getTitle());
        this.mDescription.setText(textAnnouncementCard.getDescription());
        setOptionalTextView(this.mDomain, textAnnouncementCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(textAnnouncementCard);
        setOnClickListener(new C4958d(this, textAnnouncementCard));
    }
}
