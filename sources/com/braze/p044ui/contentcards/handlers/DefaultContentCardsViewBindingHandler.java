package com.braze.p044ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.appboy.enums.CardType;
import com.appboy.models.cards.Card;
import com.braze.p044ui.contentcards.view.BannerImageContentCardView;
import com.braze.p044ui.contentcards.view.BaseContentCardView;
import com.braze.p044ui.contentcards.view.CaptionedImageContentCardView;
import com.braze.p044ui.contentcards.view.DefaultContentCardView;
import com.braze.p044ui.contentcards.view.ShortNewsContentCardView;
import com.braze.p044ui.contentcards.view.TextAnnouncementContentCardView;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p102f4.C6784b;

/* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler */
public final class DefaultContentCardsViewBindingHandler implements IContentCardsViewBindingHandler {
    public static final Parcelable.Creator<DefaultContentCardsViewBindingHandler> CREATOR = new DefaultContentCardsViewBindingHandler$Companion$CREATOR$1();
    public static final C5640a Companion = new C5640a();
    private final Map<CardType, BaseContentCardView<?>> contentCardViewCache = new LinkedHashMap();

    /* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler$a */
    public static final class C5640a {
    }

    /* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler$b */
    public /* synthetic */ class C5641b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12050a;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.BANNER.ordinal()] = 1;
            iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            f12050a = iArr;
        }
    }

    public int describeContents() {
        return 0;
    }

    public final BaseContentCardView<?> getContentCardsViewFromCache(Context context, CardType cardType) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(cardType, "cardType");
        if (!this.contentCardViewCache.containsKey(cardType) || this.contentCardViewCache.get(cardType) == null) {
            int i = C5641b.f12050a[cardType.ordinal()];
            this.contentCardViewCache.put(cardType, i != 1 ? i != 2 ? i != 3 ? i != 4 ? new DefaultContentCardView(context) : new TextAnnouncementContentCardView(context) : new ShortNewsContentCardView(context) : new CaptionedImageContentCardView(context) : new BannerImageContentCardView(context));
        }
        BaseContentCardView<?> baseContentCardView = this.contentCardViewCache.get(cardType);
        return baseContentCardView == null ? new DefaultContentCardView(context) : baseContentCardView;
    }

    public int getItemViewType(Context context, List<? extends Card> list, int i) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(list, "cards");
        if (i < 0 || i >= list.size()) {
            return -1;
        }
        return ((Card) list.get(i)).getCardType().getValue();
    }

    public void onBindViewHolder(Context context, List<? extends Card> list, C6784b bVar, int i) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(list, "cards");
        C19383o.m32797g(bVar, "viewHolder");
        if (i >= 0 && i < list.size()) {
            Card card = (Card) list.get(i);
            getContentCardsViewFromCache(context, card.getCardType()).bindViewHolder(bVar, card);
        }
    }

    public C6784b onCreateViewHolder(Context context, List<? extends Card> list, ViewGroup viewGroup, int i) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(list, "cards");
        C19383o.m32797g(viewGroup, "viewGroup");
        return getContentCardsViewFromCache(context, CardType.Companion.fromValue(i)).createViewHolder(viewGroup);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "dest");
    }
}
