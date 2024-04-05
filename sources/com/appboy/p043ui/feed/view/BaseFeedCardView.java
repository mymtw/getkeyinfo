package com.appboy.p043ui.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.appboy.models.cards.Card;
import com.appboy.p043ui.C4940R;
import com.appboy.p043ui.feed.AppboyFeedManager;
import com.appboy.p043ui.feed.AppboyImageSwitcher;
import com.appboy.p043ui.widget.BaseCardView;
import com.braze.p044ui.actions.C5623a;
import com.braze.support.BrazeLogger;
import p030bo.app.C3673f7;
import p283x3.C8315a;

/* renamed from: com.appboy.ui.feed.view.BaseFeedCardView */
public abstract class BaseFeedCardView<T extends Card> extends BaseCardView<T> {
    private static final String TAG = BrazeLogger.m11287i(BaseCardView.class);

    public BaseFeedCardView(Context context) {
        super(context);
        AppboyImageSwitcher appboyImageSwitcher;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        AppboyImageSwitcher appboyImageSwitcher2 = (AppboyImageSwitcher) findViewById(C4940R.C4942id.com_appboy_newsfeed_item_read_indicator_image_switcher);
        this.imageSwitcher = appboyImageSwitcher2;
        if (appboyImageSwitcher2 != null) {
            appboyImageSwitcher2.setFactory(new C8315a(this));
        }
        if (!isUnreadIndicatorEnabled() && (appboyImageSwitcher = this.imageSwitcher) != null) {
            appboyImageSwitcher.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View lambda$new$0() {
        return new ImageView(this.applicationContext);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setCard$1() {
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }

    public Card getCard() {
        return this.card;
    }

    public abstract int getLayoutResource();

    public View getProperViewFromInflatedStub(int i) {
        ((ViewStub) findViewById(i)).inflate();
        return findViewById(C4940R.C4942id.com_appboy_stubbed_feed_image_view);
    }

    public boolean isClickHandled(Context context, Card card, C5623a aVar) {
        return AppboyFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, aVar);
    }

    public abstract void onSetCard(T t);

    public void setCard(T t) {
        this.card = t;
        onSetCard(t);
        this.card.setListener(new C3673f7(this, 0));
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }
}
