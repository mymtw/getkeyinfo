package com.appboy.models.cards;

import android.support.p013v4.media.C0072d;
import com.appboy.enums.CardCategory;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.appboy.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C19453g;
import kotlin.text.C19457k;
import org.json.JSONArray;
import org.json.JSONObject;
import p005a4.C0035b;
import p024b4.C3475a;
import p030bo.app.C4208t1;
import p030bo.app.C4274x1;
import p030bo.app.C4318z1;
import p753kq.C19846a;
import p753kq.C19857l;

public class Card implements C0035b<JSONObject> {
    public static final C4907a Companion = new C4907a((DefaultConstructorMarker) null);
    private static final long DEFAULT_EXPIRES_AT_VALUE = -1;
    private final C4274x1 brazeManager;
    private final C4318z1 cardAnalytics;
    private final C3475a<?> cardStorage;
    private final CardType cardType;
    private EnumSet<CardCategory> categories;
    private final Channel channel;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;

    /* renamed from: id */
    private final String f11099id;
    private boolean isClicked;
    private final boolean isContentCard;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private ICardListener listener;
    private final boolean openUriInWebView;
    private final long updated;
    private final String url;
    private boolean wasViewedInternal;

    /* renamed from: com.appboy.models.cards.Card$a */
    public static final class C4907a {
        private C4907a() {
        }

        public /* synthetic */ C4907a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.appboy.models.cards.Card$b */
    public static final class C4908b extends Lambda implements C19857l<Integer, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f11100b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4908b(JSONArray jSONArray) {
            super(1);
            this.f11100b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo14895a(int i) {
            return Boolean.valueOf(this.f11100b.opt(i) instanceof String);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo14895a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.appboy.models.cards.Card$c */
    public static final class C4909c extends Lambda implements C19857l<Integer, String> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f11101b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4909c(JSONArray jSONArray) {
            super(1);
            this.f11101b = jSONArray;
        }

        /* renamed from: a */
        public final String mo14896a(int i) {
            Object obj = this.f11101b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo14896a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.appboy.models.cards.Card$d */
    public static final class C4910d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4910d f11102b = new C4910d();

        public C4910d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot dismiss a card more than once. Doing nothing.";
        }
    }

    /* renamed from: com.appboy.models.cards.Card$e */
    public static final class C4911e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4911e f11103b = new C4911e();

        public C4911e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log card as dismissed.";
        }
    }

    /* renamed from: com.appboy.models.cards.Card$f */
    public static final class C4912f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4912f f11104b = new C4912f();

        public C4912f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to mark card indicator as highlighted.";
        }
    }

    /* renamed from: com.appboy.models.cards.Card$g */
    public static final class C4913g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4913g f11105b = new C4913g();

        public C4913g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Card ID cannot be null";
        }
    }

    /* renamed from: com.appboy.models.cards.Card$h */
    public static final class C4914h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Card f11106b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4914h(Card card) {
            super(0);
            this.f11106b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11106b.getId(), "Logged click for card with id: ");
        }
    }

    /* renamed from: com.appboy.models.cards.Card$i */
    public static final class C4915i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Card f11107b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4915i(Card card) {
            super(0);
            this.f11107b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11107b.getId(), "Failed to log card clicked for id: ");
        }
    }

    /* renamed from: com.appboy.models.cards.Card$j */
    public static final class C4916j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Card f11108b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4916j(Card card) {
            super(0);
            this.f11108b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11108b.getId(), "Failed to log card as clicked for id: ");
        }
    }

    /* renamed from: com.appboy.models.cards.Card$k */
    public static final class C4917k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Card f11109b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4917k(Card card) {
            super(0);
            this.f11109b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11109b.getId(), "Logging impression event for card with id: ");
        }
    }

    /* renamed from: com.appboy.models.cards.Card$l */
    public static final class C4918l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Card f11110b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4918l(Card card) {
            super(0);
            this.f11110b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11110b.getId(), "Logging control impression event for card with id: ");
        }
    }

    /* renamed from: com.appboy.models.cards.Card$m */
    public static final class C4919m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Card f11111b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4919m(Card card) {
            super(0);
            this.f11111b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11111b.getId(), "Failed to log card impression for card id: ");
        }
    }

    public Card(JSONObject jSONObject, CardKey.Provider provider, C4274x1 x1Var, C3475a<?> aVar, C4318z1 z1Var) {
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeysProvider");
        this.jsonObject = jSONObject;
        this.brazeManager = x1Var;
        this.cardStorage = aVar;
        this.cardAnalytics = z1Var;
        this.extras = JsonUtils.m11311b(jSONObject.optJSONObject(provider.getKey(CardKey.EXTRAS)));
        String string = jSONObject.getString(provider.getKey(CardKey.ID));
        C19383o.m32796f(string, "jsonObject.getString(car…vider.getKey(CardKey.ID))");
        this.f11099id = string;
        this.isContentCard = provider.isContentCardProvider();
        this.cardType = CardType.DEFAULT;
        this.channel = provider.isContentCardProvider() ? Channel.CONTENT_CARD : Channel.NEWS_FEED;
        this.wasViewedInternal = jSONObject.optBoolean(provider.getKey(CardKey.VIEWED));
        this.isDismissedInternal = jSONObject.optBoolean(provider.getKey(CardKey.DISMISSED), false);
        this.isPinned = jSONObject.optBoolean(provider.getKey(CardKey.PINNED), false);
        this.created = jSONObject.getLong(provider.getKey(CardKey.CREATED));
        this.expiresAt = jSONObject.optLong(provider.getKey(CardKey.EXPIRES_AT), -1);
        this.openUriInWebView = jSONObject.optBoolean(provider.getKey(CardKey.OPEN_URI_IN_WEBVIEW), false);
        this.isRemoved = jSONObject.optBoolean(provider.getKey(CardKey.REMOVED), false);
        JSONArray optJSONArray = jSONObject.optJSONArray(provider.getKey(CardKey.CATEGORIES));
        if (optJSONArray == null || optJSONArray.length() == 0) {
            this.categories = EnumSet.of(CardCategory.NO_CATEGORY);
        } else {
            EnumSet<CardCategory> noneOf = EnumSet.noneOf(CardCategory.class);
            C19439n p1 = SequencesKt___SequencesKt.m32985p1(SequencesKt___SequencesKt.m32984o1(C19327t.m32633O0(C19388s.m32816D0(0, optJSONArray.length())), new C4908b(optJSONArray)), new C4909c(optJSONArray));
            for (T invoke : p1.f43362a) {
                CardCategory cardCategory = CardCategory.get((String) p1.f43363b.invoke(invoke));
                if (cardCategory != null) {
                    noneOf.add(cardCategory);
                }
            }
            this.categories = noneOf;
        }
        this.updated = this.jsonObject.optLong(provider.getKey(CardKey.UPDATED), this.created);
        this.isDismissibleByUser = this.jsonObject.optBoolean(provider.getKey(CardKey.DISMISSIBLE), false);
        this.isIndicatorHighlightedInternal = this.jsonObject.optBoolean(provider.getKey(CardKey.READ), this.wasViewedInternal);
        this.isClicked = this.jsonObject.optBoolean(provider.getKey(CardKey.CLICKED), false);
        this.isTest = this.jsonObject.optBoolean(provider.getKey(CardKey.IS_TEST), false);
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    public static /* synthetic */ void getViewed$annotations() {
    }

    public static /* synthetic */ void isDismissed$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(getClass(), obj.getClass())) {
            return false;
        }
        Card card = (Card) obj;
        return this.updated == card.updated && C19383o.m32792b(this.f11099id, card.f11099id);
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final EnumSet<CardCategory> getCategories() {
        return this.categories;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final long getCreated() {
        return this.created;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.f11099id;
    }

    public final ICardListener getListener() {
        return this.listener;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public final long getUpdated() {
        return this.updated;
    }

    public String getUrl() {
        return this.url;
    }

    public final boolean getViewed() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        long j = this.updated;
        return (this.f11099id.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final boolean isContentCard() {
        return this.isContentCard;
    }

    public final boolean isControl() {
        return getCardType() == CardType.CONTROL;
    }

    public final boolean isDismissed() {
        return this.isDismissedInternal;
    }

    public final boolean isDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isExpired() {
        long j = this.expiresAt;
        return j != -1 && j <= DateTimeUtils.m11302d();
    }

    public final boolean isInCategorySet(EnumSet<CardCategory> enumSet) {
        C19383o.m32797g(enumSet, "categories");
        EnumSet<CardCategory> enumSet2 = this.categories;
        if (enumSet2 == null) {
            return false;
        }
        Iterator<CardCategory> it = enumSet.iterator();
        while (it.hasNext()) {
            if (enumSet2.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isIndicatorHighlighted() {
        return this.isIndicatorHighlightedInternal;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isRemoved() {
        return this.isRemoved;
    }

    public final boolean isTest() {
        return this.isTest;
    }

    public final boolean isValidCard() {
        if (!C19457k.m33020X0(this.f11099id)) {
            return true;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4913g.f11105b, 6);
        return false;
    }

    public final boolean logClick() {
        try {
            this.isClicked = true;
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4915i(this), 6);
                return false;
            }
            C4208t1 a = this.cardAnalytics.mo13238a(this.f11099id);
            if (a != null) {
                this.brazeManager.mo13838a(a);
            }
            this.cardStorage.markCardAsClicked(this.f11099id);
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4914h(this), 7);
            return true;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C4916j(this), 4);
            return false;
        }
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                return false;
            }
            if (!isControl()) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4917k(this), 6);
                C4208t1 c = this.cardAnalytics.mo13240c(this.f11099id);
                if (c != null) {
                    this.brazeManager.mo13838a(c);
                }
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4918l(this), 6);
                C4208t1 b = this.cardAnalytics.mo13239b(this.f11099id);
                if (b != null) {
                    this.brazeManager.mo13838a(b);
                }
            }
            this.cardStorage.markCardAsViewed(this.f11099id);
            return true;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C4919m(this), 4);
            return false;
        }
    }

    public final void setDismissed(boolean z) {
        if (!this.isDismissedInternal || !z) {
            this.isDismissedInternal = z;
            C3475a<?> aVar = this.cardStorage;
            if (aVar != null) {
                aVar.markCardAsDismissed(this.f11099id);
            }
            if (z) {
                try {
                    if (this.brazeManager != null && this.cardAnalytics != null && isValidCard()) {
                        C4208t1 d = this.cardAnalytics.mo13241d(this.f11099id);
                        if (d != null) {
                            this.brazeManager.mo13838a(d);
                        }
                    }
                } catch (Exception e) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C4911e.f11103b, 4);
                }
            }
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4910d.f11102b, 6);
        }
    }

    public final void setDismissibleByUser(boolean z) {
        this.isDismissibleByUser = z;
    }

    public final void setIndicatorHighlighted(boolean z) {
        C3475a<?> aVar;
        this.isIndicatorHighlightedInternal = z;
        try {
            ICardListener iCardListener = this.listener;
            if (iCardListener != null) {
                iCardListener.onCardUpdate();
            }
        } catch (Exception unused) {
        }
        if (z && (aVar = this.cardStorage) != null) {
            try {
                aVar.markCardAsVisuallyRead(this.f11099id);
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.D, e, C4912f.f11104b, 4);
            }
        }
    }

    public final void setListener(ICardListener iCardListener) {
        this.listener = iCardListener;
    }

    public final void setPinned(boolean z) {
        this.isPinned = z;
    }

    public final void setTest(boolean z) {
        this.isTest = z;
    }

    public final void setViewed(boolean z) {
        this.wasViewedInternal = z;
        C3475a<?> aVar = this.cardStorage;
        if (aVar != null) {
            aVar.markCardAsViewed(this.f11099id);
        }
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("\n            Card{\n            extras=");
        h.append(this.extras);
        h.append("\n            id='");
        h.append(this.f11099id);
        h.append("'\n            created=");
        h.append(this.created);
        h.append("\n            updated=");
        h.append(this.updated);
        h.append("\n            expiresAt=");
        h.append(this.expiresAt);
        h.append("\n            categories=");
        h.append(this.categories);
        h.append("\n            isContentCard=");
        h.append(this.isContentCard);
        h.append("\n            viewed=");
        h.append(this.wasViewedInternal);
        h.append("\n            isRead=");
        h.append(this.isIndicatorHighlightedInternal);
        h.append("\n            isDismissed=");
        h.append(this.isDismissedInternal);
        h.append("\n            isRemoved=");
        h.append(this.isRemoved);
        h.append("\n            isPinned=");
        h.append(this.isPinned);
        h.append("\n            isClicked=");
        h.append(this.isClicked);
        h.append("\n            openUriInWebview=");
        h.append(this.openUriInWebView);
        h.append("\n            isDismissibleByUser=");
        h.append(this.isDismissibleByUser);
        h.append("\n            isTest=");
        h.append(this.isTest);
        h.append("\n            json=");
        h.append(JsonUtils.m11315f(this.jsonObject));
        h.append("\n            }\n\n        ");
        return C19453g.m33013Q0(h.toString());
    }

    public JSONObject forJsonPut() {
        return this.jsonObject;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Card(JSONObject jSONObject, CardKey.Provider provider) {
        this(jSONObject, provider, (C4274x1) null, (C3475a<?>) null, (C4318z1) null);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(provider, "cardKeyProvider");
    }
}
