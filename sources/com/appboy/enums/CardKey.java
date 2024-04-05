package com.appboy.enums;

import com.appboy.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p753kq.C19846a;

public enum CardKey {
    ID("id", "id"),
    VIEWED("viewed", "v"),
    CREATED("created", "ca"),
    EXPIRES_AT("expires_at", "ea"),
    EXTRAS("extras", "e"),
    OPEN_URI_IN_WEBVIEW("use_webview", "uw"),
    TYPE("type", "tp"),
    CATEGORIES("categories", ""),
    UPDATED("updated", ""),
    DISMISSED("", "d"),
    REMOVED("", "r"),
    PINNED("", Constants.APPBOY_PUSH_PRIORITY_KEY),
    DISMISSIBLE("", "db"),
    IS_TEST("", Constants.APPBOY_PUSH_TITLE_KEY),
    READ("", "read"),
    CLICKED("", "cl"),
    BANNER_IMAGE_IMAGE(ResponseConstants.IMAGE, "i"),
    BANNER_IMAGE_URL("url", "u"),
    BANNER_IMAGE_DOMAIN("domain", ""),
    BANNER_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    CAPTIONED_IMAGE_IMAGE(ResponseConstants.IMAGE, "i"),
    CAPTIONED_IMAGE_TITLE("title", "tt"),
    CAPTIONED_IMAGE_DESCRIPTION("description", "ds"),
    CAPTIONED_IMAGE_URL("url", "u"),
    CAPTIONED_IMAGE_DOMAIN("domain", "dm"),
    CAPTIONED_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    TEXT_ANNOUNCEMENT_TITLE("title", "tt"),
    TEXT_ANNOUNCEMENT_DESCRIPTION("description", "ds"),
    TEXT_ANNOUNCEMENT_URL("url", "u"),
    TEXT_ANNOUNCEMENT_DOMAIN("domain", "dm"),
    SHORT_NEWS_IMAGE(ResponseConstants.IMAGE, "i"),
    SHORT_NEWS_TITLE("title", "tt"),
    SHORT_NEWS_DESCRIPTION("description", "ds"),
    SHORT_NEWS_URL("url", "u"),
    SHORT_NEWS_DOMAIN("domain", "dm");
    
    private static final String BANNER_IMAGE_KEY = "banner_image";
    private static final String CAPTIONED_IMAGE_KEY = "captioned_image";
    private static final String CONTROL_KEY = "control";
    public static final C4904a Companion = null;
    private static final String SHORT_NEWS_KEY = "short_news";
    private static final String TEXT_ANNOUNCEMENT_KEY = "text_announcement";
    /* access modifiers changed from: private */
    public static final Map<String, CardType> cardTypeMap = null;
    private final String contentCardsKey;
    private final String feedKey;

    public static final class Provider {
        public static final Provider CONTENT_CARDS = null;
        public static final C4902a Companion = null;
        public static final Provider NEWS_FEED = null;
        private final boolean isContentCardProvider;

        /* renamed from: com.appboy.enums.CardKey$Provider$a */
        public static final class C4902a {
            private C4902a() {
            }

            public /* synthetic */ C4902a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.appboy.enums.CardKey$Provider$b */
        public static final class C4903b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ JSONObject f11096b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4903b(JSONObject jSONObject) {
                super(0);
                this.f11096b = jSONObject;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11096b, "Short News card doesn't contain image url, parsing type as Text Announcement. JSON: ");
            }
        }

        static {
            Companion = new C4902a((DefaultConstructorMarker) null);
            CONTENT_CARDS = new Provider(true);
            NEWS_FEED = new Provider(false);
        }

        public Provider(boolean z) {
            this.isContentCardProvider = z;
        }

        public final CardType getCardTypeFromJson(JSONObject jSONObject) {
            C19383o.m32797g(jSONObject, "jsonObject");
            String e = JsonUtils.m11314e(getKey(CardKey.TYPE), jSONObject);
            boolean z = false;
            if (!(e == null || e.length() == 0) && this.isContentCardProvider && C19383o.m32792b(e, CardKey.SHORT_NEWS_KEY)) {
                String e2 = JsonUtils.m11314e(getKey(CardKey.SHORT_NEWS_IMAGE), jSONObject);
                if (e2 == null || e2.length() == 0) {
                    z = true;
                }
                if (z) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4903b(jSONObject), 6);
                    e = CardKey.TEXT_ANNOUNCEMENT_KEY;
                }
            }
            return CardKey.cardTypeMap.containsKey(e) ? (CardType) CardKey.cardTypeMap.get(e) : CardType.DEFAULT;
        }

        public final String getKey(CardKey cardKey) {
            C19383o.m32797g(cardKey, "key");
            return this.isContentCardProvider ? cardKey.getContentCardsKey() : cardKey.getFeedKey();
        }

        public final String getServerKeyFromCardType(CardType cardType) {
            C19383o.m32797g(cardType, "cardType");
            for (Map.Entry entry : CardKey.cardTypeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (cardType == ((CardType) entry.getValue())) {
                    return str;
                }
            }
            return null;
        }

        public final boolean isContentCardProvider() {
            return this.isContentCardProvider;
        }
    }

    /* renamed from: com.appboy.enums.CardKey$a */
    public static final class C4904a {
        private C4904a() {
        }

        public /* synthetic */ C4904a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C4904a((DefaultConstructorMarker) null);
        cardTypeMap = C19294b0.m32562s0(new Pair(BANNER_IMAGE_KEY, CardType.BANNER), new Pair(CAPTIONED_IMAGE_KEY, CardType.CAPTIONED_IMAGE), new Pair(TEXT_ANNOUNCEMENT_KEY, CardType.TEXT_ANNOUNCEMENT), new Pair(SHORT_NEWS_KEY, CardType.SHORT_NEWS), new Pair(CONTROL_KEY, CardType.CONTROL));
    }

    private CardKey(String str, String str2) {
        this.feedKey = str;
        this.contentCardsKey = str2;
    }

    public final String getContentCardsKey() {
        return this.contentCardsKey;
    }

    public final String getFeedKey() {
        return this.feedKey;
    }
}
