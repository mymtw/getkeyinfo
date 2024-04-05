package com.appboy.p043ui.adapters;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p043ui.feed.view.BaseFeedCardView;
import com.appboy.p043ui.widget.BannerImageCardView;
import com.appboy.p043ui.widget.CaptionedImageCardView;
import com.appboy.p043ui.widget.DefaultCardView;
import com.appboy.p043ui.widget.ShortNewsCardView;
import com.appboy.p043ui.widget.TextAnnouncementCardView;
import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.appboy.ui.adapters.AppboyListAdapter */
public class AppboyListAdapter extends ArrayAdapter<Card> {
    private static final String TAG = BrazeLogger.m11287i(AppboyListAdapter.class);
    private final Set<String> mCardIdImpressions = new HashSet();
    private final Context mContext;

    public AppboyListAdapter(Context context, int i, List<Card> list) {
        super(context, i, list);
        this.mContext = context;
    }

    private void logCardImpression(Card card) {
        String id = card.getId();
        if (!this.mCardIdImpressions.contains(id)) {
            this.mCardIdImpressions.add(id);
            card.logImpression();
            String str = TAG;
            BrazeLogger.m11291m(str, "Logged impression for card " + id);
        } else {
            String str2 = TAG;
            BrazeLogger.m11291m(str2, "Already counted impression for card " + id);
        }
        if (!card.getViewed()) {
            card.setViewed(true);
        }
    }

    public void batchSetCardsToRead(int i, int i2) {
        if (getCount() == 0) {
            BrazeLogger.m11285g(TAG, "mAdapter is empty in setting some cards to viewed.");
            return;
        }
        int min = Math.min(getCount(), i2);
        for (int max = Math.max(0, i); max < min; max++) {
            Card card = (Card) getItem(max);
            if (card == null) {
                BrazeLogger.m11285g(TAG, "Card was null in setting some cards to viewed.");
                return;
            }
            if (!card.isIndicatorHighlighted()) {
                card.setIndicatorHighlighted(true);
            }
        }
    }

    public int getItemViewType(int i) {
        Card card = (Card) getItem(i);
        if (card instanceof BannerImageCard) {
            return 1;
        }
        if (card instanceof CaptionedImageCard) {
            return 2;
        }
        if (card instanceof ShortNewsCard) {
            return 3;
        }
        return card instanceof TextAnnouncementCard ? 4 : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        BaseFeedCardView baseFeedCardView;
        Card card = (Card) getItem(i);
        if (view == null) {
            baseFeedCardView = card instanceof BannerImageCard ? new BannerImageCardView(this.mContext) : card instanceof CaptionedImageCard ? new CaptionedImageCardView(this.mContext) : card instanceof ShortNewsCard ? new ShortNewsCardView(this.mContext) : card instanceof TextAnnouncementCard ? new TextAnnouncementCardView(this.mContext) : new DefaultCardView(this.mContext);
        } else {
            String str = TAG;
            BrazeLogger.m11291m(str, "Reusing convertView for rendering of item " + i);
            baseFeedCardView = (BaseFeedCardView) view;
        }
        String str2 = TAG;
        StringBuilder h = C0072d.m201h("Using view of type: ");
        h.append(baseFeedCardView.getClass().getName());
        h.append(" for card at position ");
        h.append(i);
        h.append(": ");
        h.append(card.toString());
        BrazeLogger.m11291m(str2, h.toString());
        baseFeedCardView.setCard(card);
        logCardImpression(card);
        return baseFeedCardView;
    }

    public int getViewTypeCount() {
        return 5;
    }

    public synchronized void replaceFeed(List<Card> list) {
        int i = 0;
        setNotifyOnChange(false);
        if (list == null) {
            clear();
            notifyDataSetChanged();
            return;
        }
        String str = TAG;
        BrazeLogger.m11285g(str, "Replacing existing feed of " + getCount() + " cards with new feed containing " + list.size() + " cards.");
        int size = list.size();
        int i2 = 0;
        while (i < getCount()) {
            Card card = (Card) getItem(i);
            Card card2 = null;
            if (i2 < size) {
                card2 = list.get(i2);
            }
            if (card2 == null || !card2.equals(card)) {
                remove(card);
            } else {
                i++;
                i2++;
            }
        }
        super.addAll(list.subList(i2, size));
        notifyDataSetChanged();
    }

    public void resetCardImpressionTracker() {
        this.mCardIdImpressions.clear();
    }

    public synchronized void add(Card card) {
        super.add(card);
    }
}
