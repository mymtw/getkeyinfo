package com.appboy.p043ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.p043ui.C4940R;
import com.appboy.p043ui.feed.view.BaseFeedCardView;
import com.braze.p044ui.actions.C5623a;
import com.braze.support.BrazeLogger;

/* renamed from: com.appboy.ui.widget.ShortNewsCardView */
public class ShortNewsCardView extends BaseFeedCardView<ShortNewsCard> {
    private static final String TAG = BrazeLogger.m11287i(ShortNewsCardView.class);
    private final float mAspectRatio;
    private C5623a mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final ImageView mImage;
    private final TextView mTitle;

    public ShortNewsCardView(Context context) {
        this(context, (ShortNewsCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(ShortNewsCard shortNewsCard, View view) {
        handleCardClick(this.applicationContext, shortNewsCard, this.mCardAction);
    }

    public int getLayoutResource() {
        return C4940R.C4943layout.com_appboy_short_news_card;
    }

    public ShortNewsCardView(Context context, ShortNewsCard shortNewsCard) {
        super(context);
        this.mAspectRatio = 1.0f;
        this.mDescription = (TextView) findViewById(C4940R.C4942id.com_appboy_short_news_card_description);
        this.mTitle = (TextView) findViewById(C4940R.C4942id.com_appboy_short_news_card_title);
        this.mDomain = (TextView) findViewById(C4940R.C4942id.com_appboy_short_news_card_domain);
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(C4940R.C4942id.com_appboy_short_news_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (shortNewsCard != null) {
            setCard(shortNewsCard);
        }
        setBackground(getResources().getDrawable(C4940R.C4941drawable.com_appboy_card_background));
    }

    public void onSetCard(ShortNewsCard shortNewsCard) {
        this.mDescription.setText(shortNewsCard.getDescription());
        setOptionalTextView(this.mTitle, shortNewsCard.getTitle());
        setOptionalTextView(this.mDomain, shortNewsCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(shortNewsCard);
        setOnClickListener(new C4957c(0, this, shortNewsCard));
        setImageViewToUrl(this.mImage, shortNewsCard.getImageUrl(), 1.0f, shortNewsCard);
    }
}
