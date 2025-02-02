package com.appboy.events;

import com.appboy.enums.CardCategory;
import com.appboy.models.cards.Card;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import p003a2.C0015b;

public final class FeedUpdatedEvent {
    private static final String TAG = BrazeLogger.m11287i(FeedUpdatedEvent.class);
    private final List<Card> mFeedCards;
    private final boolean mFromOfflineStorage;
    private final long mTimestamp;
    private final String mUserId;

    public FeedUpdatedEvent(List<Card> list, String str, boolean z, long j) {
        this.mUserId = str;
        this.mFromOfflineStorage = z;
        list.getClass();
        this.mFeedCards = list;
        this.mTimestamp = j;
    }

    public int getCardCount() {
        return getCardCount(CardCategory.getAllCategories());
    }

    public List<Card> getFeedCards() {
        return getFeedCards(CardCategory.getAllCategories());
    }

    public int getUnreadCardCount() {
        return getUnreadCardCount(CardCategory.getAllCategories());
    }

    public String getUserId() {
        return this.mUserId;
    }

    public boolean isFromOfflineStorage() {
        return this.mFromOfflineStorage;
    }

    public long lastUpdatedInSecondsFromEpoch() {
        return this.mTimestamp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeedUpdatedEvent{");
        sb.append("mFeedCards=");
        sb.append(this.mFeedCards);
        sb.append(", mUserId='");
        sb.append(this.mUserId);
        sb.append('\'');
        sb.append(", mFromOfflineStorage=");
        sb.append(this.mFromOfflineStorage);
        sb.append(", mTimestamp=");
        return C0015b.m91j(sb, this.mTimestamp, '}');
    }

    public int getCardCount(CardCategory cardCategory) {
        return getCardCount((EnumSet<CardCategory>) EnumSet.of(cardCategory));
    }

    public List<Card> getFeedCards(CardCategory cardCategory) {
        return getFeedCards((EnumSet<CardCategory>) EnumSet.of(cardCategory));
    }

    public int getUnreadCardCount(CardCategory cardCategory) {
        return getUnreadCardCount((EnumSet<CardCategory>) EnumSet.of(cardCategory));
    }

    public int getCardCount(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            BrazeLogger.m11288j(TAG, "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.");
            return this.mFeedCards.size();
        } else if (!enumSet.isEmpty()) {
            return getFeedCards(enumSet).size();
        } else {
            BrazeLogger.m11292n(TAG, "The parameters passed into categories are not valid, Braze is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
    }

    public List<Card> getFeedCards(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            try {
                BrazeLogger.m11288j(TAG, "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.");
                enumSet = CardCategory.getAllCategories();
            } catch (Exception e) {
                String str = TAG;
                BrazeLogger.m11293o(str, "Unable to get cards with categories[" + enumSet + "]. Ignoring.", e);
                return null;
            }
        }
        if (enumSet.isEmpty()) {
            BrazeLogger.m11292n(TAG, "The parameter passed into categories is not valid, Braze is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Card next : this.mFeedCards) {
            if (next.isInCategorySet(enumSet) && !next.isExpired()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public int getUnreadCardCount(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            BrazeLogger.m11292n(TAG, "The categories passed to getUnreadCardCount are null, FeedUpdatedEvent is going to return the count of all the unread cards in cache.");
            return getUnreadCardCount(CardCategory.getAllCategories());
        }
        int i = 0;
        if (enumSet.isEmpty()) {
            BrazeLogger.m11292n(TAG, "The parameters passed into categories are Empty, Braze is returning 0 in getUnreadCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
        for (Card next : this.mFeedCards) {
            if (next.isInCategorySet(enumSet) && !next.getViewed() && !next.isExpired()) {
                i++;
            }
        }
        return i;
    }
}
