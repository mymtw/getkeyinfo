package com.appboy.p043ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.p043ui.C4940R;
import com.appboy.p043ui.feed.view.BaseFeedCardView;
import com.braze.p044ui.actions.C5623a;
import com.braze.support.BrazeLogger;

/* renamed from: com.appboy.ui.widget.BannerImageCardView */
public class BannerImageCardView extends BaseFeedCardView<BannerImageCard> {
    private static final String TAG = BrazeLogger.m11287i(BannerImageCardView.class);
    private float mAspectRatio;
    private C5623a mCardAction;
    private final ImageView mImage;

    public BannerImageCardView(Context context) {
        this(context, (BannerImageCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(BannerImageCard bannerImageCard, View view) {
        handleCardClick(this.applicationContext, bannerImageCard, this.mCardAction);
    }

    public int getLayoutResource() {
        return C4940R.C4943layout.com_appboy_banner_image_card;
    }

    public BannerImageCardView(Context context, BannerImageCard bannerImageCard) {
        super(context);
        this.mAspectRatio = 6.0f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(C4940R.C4942id.com_appboy_banner_image_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (bannerImageCard != null) {
            setCard(bannerImageCard);
        }
        setBackground(getResources().getDrawable(C4940R.C4941drawable.com_appboy_card_background));
    }

    public void onSetCard(BannerImageCard bannerImageCard) {
        if (bannerImageCard.getAspectRatio() != 0.0f) {
            this.mAspectRatio = bannerImageCard.getAspectRatio();
        }
        setImageViewToUrl(this.mImage, bannerImageCard.getImageUrl(), this.mAspectRatio, bannerImageCard);
        this.mCardAction = BaseCardView.getUriActionForCard(bannerImageCard);
        setOnClickListener(new C4955a(0, this, bannerImageCard));
    }
}
