package com.appboy.p043ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.p043ui.C4940R;
import com.appboy.p043ui.feed.view.BaseFeedCardView;
import com.braze.p044ui.actions.C5623a;
import com.braze.support.BrazeLogger;

/* renamed from: com.appboy.ui.widget.CaptionedImageCardView */
public class CaptionedImageCardView extends BaseFeedCardView<CaptionedImageCard> {
    private static final String TAG = BrazeLogger.m11287i(CaptionedImageCardView.class);
    private float mAspectRatio;
    private C5623a mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final ImageView mImage;
    private final TextView mTitle;

    public CaptionedImageCardView(Context context) {
        this(context, (CaptionedImageCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(CaptionedImageCard captionedImageCard, View view) {
        handleCardClick(this.applicationContext, captionedImageCard, this.mCardAction);
    }

    public int getLayoutResource() {
        return C4940R.C4943layout.com_appboy_captioned_image_card;
    }

    public CaptionedImageCardView(Context context, CaptionedImageCard captionedImageCard) {
        super(context);
        this.mAspectRatio = 1.3333334f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(C4940R.C4942id.com_appboy_captioned_image_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        this.mTitle = (TextView) findViewById(C4940R.C4942id.com_appboy_captioned_image_title);
        this.mDescription = (TextView) findViewById(C4940R.C4942id.com_appboy_captioned_image_description);
        this.mDomain = (TextView) findViewById(C4940R.C4942id.com_appboy_captioned_image_card_domain);
        if (captionedImageCard != null) {
            setCard(captionedImageCard);
        }
        setBackground(getResources().getDrawable(C4940R.C4941drawable.com_appboy_card_background));
    }

    public void onSetCard(CaptionedImageCard captionedImageCard) {
        this.mTitle.setText(captionedImageCard.getTitle());
        this.mDescription.setText(captionedImageCard.getDescription());
        setOptionalTextView(this.mDomain, captionedImageCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(captionedImageCard);
        setOnClickListener(new C4956b(0, this, captionedImageCard));
        this.mAspectRatio = captionedImageCard.getAspectRatio();
        setImageViewToUrl(this.mImage, captionedImageCard.getImageUrl(), this.mAspectRatio, captionedImageCard);
    }
}
