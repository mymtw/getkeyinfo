package com.appboy.p043ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.p043ui.C4940R;
import com.appboy.p043ui.feed.AppboyImageSwitcher;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.C5442a;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.p044ui.BrazeDeeplinkHandler;
import com.braze.p044ui.actions.C5623a;
import com.braze.p044ui.actions.UriAction;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;

/* renamed from: com.appboy.ui.widget.BaseCardView */
public abstract class BaseCardView<T extends Card> extends RelativeLayout {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String ICON_READ_TAG = "icon_read";
    private static final String ICON_UNREAD_TAG = "icon_unread";
    public final Context applicationContext;
    public T card;
    private final String classLogTag = BrazeLogger.m11287i(getClass());
    public BrazeConfigurationProvider configurationProvider;
    public AppboyImageSwitcher imageSwitcher;
    private boolean isUnreadCardVisualIndicatorEnabled;

    /* renamed from: com.appboy.ui.widget.BaseCardView$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UriAction getUriActionForCard(Card card) {
            C19383o.m32797g(card, ResponseConstants.CARD);
            Bundle bundle = new Bundle();
            for (String next : card.getExtras().keySet()) {
                bundle.putString(next, card.getExtras().get(next));
            }
            String url = card.getUrl();
            if (url != null) {
                return BrazeDeeplinkHandler.f12011a.mo16169a(url, bundle, card.getOpenUriInWebView(), card.getChannel());
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, BaseCardView$Companion$getUriActionForCard$1.INSTANCE, 6);
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCardView(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Context applicationContext2 = context.getApplicationContext();
        C19383o.m32796f(applicationContext2, "context.applicationContext");
        this.applicationContext = applicationContext2;
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
        this.configurationProvider = brazeConfigurationProvider;
        this.isUnreadCardVisualIndicatorEnabled = brazeConfigurationProvider.isNewsfeedVisualIndicatorOn();
    }

    public static final UriAction getUriActionForCard(Card card2) {
        return Companion.getUriActionForCard(card2);
    }

    public final String getClassLogTag() {
        return this.classLogTag;
    }

    public final void handleCardClick(Context context, Card card2, C5623a aVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(card2, ResponseConstants.CARD);
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new BaseCardView$handleCardClick$1(card2), 6);
        card2.setIndicatorHighlighted(true);
        if (isClickHandled(context, card2, aVar)) {
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new BaseCardView$handleCardClick$5(card2), 7);
            card2.logClick();
        } else if (aVar != null) {
            card2.logClick();
            BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new BaseCardView$handleCardClick$2(card2), 6);
            if (aVar instanceof UriAction) {
                ((UriAction) aVar).mo16178a(context);
                return;
            }
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new BaseCardView$handleCardClick$3(card2), 7);
            aVar.mo16178a(context);
        } else {
            BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new BaseCardView$handleCardClick$4(card2), 6);
        }
    }

    public abstract boolean isClickHandled(Context context, Card card2, C5623a aVar);

    public final boolean isUnreadIndicatorEnabled() {
        return this.isUnreadCardVisualIndicatorEnabled;
    }

    public final void setCardViewedIndicator(AppboyImageSwitcher appboyImageSwitcher, Card card2) {
        C19383o.m32797g(card2, ResponseConstants.CARD);
        if (appboyImageSwitcher == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, BaseCardView$setCardViewedIndicator$1.INSTANCE, 6);
            return;
        }
        int i = C4940R.string.com_braze_image_is_read_tag_key;
        Object tag = appboyImageSwitcher.getTag(i);
        if (tag == null) {
            tag = "";
        }
        if (card2.isIndicatorHighlighted()) {
            if (!C19383o.m32792b(tag, ICON_READ_TAG)) {
                if (appboyImageSwitcher.getReadIcon() != null) {
                    appboyImageSwitcher.setImageDrawable(appboyImageSwitcher.getReadIcon());
                } else {
                    appboyImageSwitcher.setImageResource(C4940R.C4941drawable.com_braze_content_card_icon_read);
                }
                appboyImageSwitcher.setTag(i, ICON_READ_TAG);
            }
        } else if (!C19383o.m32792b(tag, ICON_UNREAD_TAG)) {
            if (appboyImageSwitcher.getUnReadIcon() != null) {
                appboyImageSwitcher.setImageDrawable(appboyImageSwitcher.getUnReadIcon());
            } else {
                appboyImageSwitcher.setImageResource(C4940R.C4941drawable.com_braze_content_card_icon_unread);
            }
            appboyImageSwitcher.setTag(i, ICON_UNREAD_TAG);
        }
    }

    public final void setImageViewToUrl(ImageView imageView, String str, float f, Card card2) {
        C19383o.m32797g(imageView, "imageView");
        C19383o.m32797g(str, "imageUrl");
        C19383o.m32797g(card2, ResponseConstants.CARD);
        int i = C4940R.string.com_braze_image_resize_tag_key;
        if (!C19383o.m32792b(str, imageView.getTag(i))) {
            if (!(f == 0.0f)) {
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(new BaseCardView$setImageViewToUrl$1(imageView, f));
                }
            }
            imageView.setImageResource(17170445);
            Braze.Companion companion = Braze.f11170m;
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            C5442a n = companion.mo15515f(context).mo15499n();
            Context context2 = getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            ((DefaultBrazeImageLoader) n).mo15925f(context2, imageView, BrazeViewBounds.BASE_CARD_VIEW, str);
            imageView.setTag(i, str);
        }
    }

    public final void setOptionalTextView(TextView textView, String str) {
        C19383o.m32797g(textView, "view");
        if (!(str == null || C19457k.m33020X0(str))) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setText("");
        textView.setVisibility(8);
    }
}
