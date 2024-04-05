package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import com.appboy.enums.CardKey;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19459m;
import org.json.JSONArray;
import org.json.JSONObject;
import p024b4.C3475a;
import p753kq.C19846a;

/* renamed from: bo.app.f1 */
public final class C3661f1 implements C3475a<FeedUpdatedEvent> {

    /* renamed from: f */
    public static final C3663b f8403f = new C3663b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C4274x1 f8404a;

    /* renamed from: b */
    private final SharedPreferences f8405b;

    /* renamed from: c */
    private final Set<String> f8406c;

    /* renamed from: d */
    private final Set<String> f8407d;

    /* renamed from: e */
    private final C4318z1 f8408e = new C3634e1();

    /* renamed from: bo.app.f1$a */
    public enum C3662a {
        READ_CARDS("read_cards_set", "read_cards_flat"),
        VIEWED_CARDS("viewed_cards_set", "viewed_cards_flat");
        

        /* renamed from: b */
        private final String f8412b;

        /* renamed from: c */
        private final String f8413c;

        private C3662a(String str, String str2) {
            this.f8412b = str;
            this.f8413c = str2;
        }

        /* renamed from: b */
        public final String mo13279b() {
            return this.f8413c;
        }

        /* renamed from: c */
        public final String mo13280c() {
            return this.f8412b;
        }
    }

    /* renamed from: bo.app.f1$c */
    public static final class C3664c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8414b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3664c(String str) {
            super(0);
            this.f8414b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8414b, "Updating offline feed for user with id: ");
        }
    }

    /* renamed from: bo.app.f1$d */
    public static final class C3665d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8415b;

        /* renamed from: c */
        public final /* synthetic */ String f8416c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3665d(String str, String str2) {
            super(0);
            this.f8415b = str;
            this.f8416c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("The received cards are for user ");
            h.append(this.f8415b);
            h.append(" and the current user is ");
            h.append(this.f8416c);
            h.append(", the cards will be discarded and no changes will be made.");
            return h.toString();
        }
    }

    public C3661f1(Context context, String str, C4274x1 x1Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(x1Var, "brazeManager");
        this.f8404a = x1Var;
        String str2 = str == null ? "" : str;
        String str3 = StringUtils.f11974a;
        SharedPreferences sharedPreferences = context.getSharedPreferences(C19383o.m32802l(StringUtils.m11341b(context, str2, (String) null), "com.appboy.storage.feedstorageprovider"), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…Id, Context.MODE_PRIVATE)");
        this.f8405b = sharedPreferences;
        this.f8406c = m8624a(C3662a.VIEWED_CARDS);
        this.f8407d = m8624a(C3662a.READ_CARDS);
        m8625a(str);
    }

    /* renamed from: a */
    public FeedUpdatedEvent getCachedCardsAsEvent() {
        return m8623a(new JSONArray(this.f8405b.getString("cards", "[]")), this.f8405b.getString("uid", ""), true, this.f8405b.getLong("cards_timestamp", -1));
    }

    public void markCardAsClicked(String str) {
        C19383o.m32797g(str, "cardId");
    }

    public void markCardAsDismissed(String str) {
        C19383o.m32797g(str, "cardId");
    }

    public void markCardAsViewed(String str) {
        C19383o.m32797g(str, "cardId");
        if (!this.f8406c.contains(str)) {
            this.f8406c.add(str);
            mo13277a(this.f8406c, C3662a.VIEWED_CARDS);
        }
    }

    public void markCardAsVisuallyRead(String str) {
        C19383o.m32797g(str, "cardId");
        if (!this.f8407d.contains(str)) {
            this.f8407d.add(str);
            mo13277a(this.f8407d, C3662a.READ_CARDS);
        }
    }

    /* renamed from: bo.app.f1$b */
    public static final class C3663b {
        private C3663b() {
        }

        public /* synthetic */ C3663b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Set<String> mo13281a(String str) {
            C19383o.m32797g(str, "input");
            HashSet hashSet = new HashSet();
            Object[] array = C19459m.m33056y1(str, new String[]{";"}, 0, 6).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                Collections.addAll(hashSet, Arrays.copyOf(strArr, strArr.length));
                return hashSet;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* renamed from: a */
        public final Set<String> mo13282a(JSONArray jSONArray) {
            C19383o.m32797g(jSONArray, "cardsArray");
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                CardKey cardKey = CardKey.ID;
                if (jSONObject.has(cardKey.getFeedKey())) {
                    String string = jSONObject.getString(cardKey.getFeedKey());
                    C19383o.m32796f(string, "card.getString(CardKey.ID.feedKey)");
                    hashSet.add(string);
                }
                i = i2;
            }
            return hashSet;
        }
    }

    /* renamed from: a */
    public final FeedUpdatedEvent mo13276a(JSONArray jSONArray, String str) {
        C19383o.m32797g(jSONArray, "cardsArray");
        String str2 = str == null ? "" : str;
        String string = this.f8405b.getString("uid", "");
        if (C19383o.m32792b(string, str2)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C3664c(str), 6);
            long d = DateTimeUtils.m11302d();
            m8626a(jSONArray, d);
            Set<String> set = this.f8406c;
            C3663b bVar = f8403f;
            set.retainAll(bVar.mo13282a(jSONArray));
            mo13277a(this.f8406c, C3662a.VIEWED_CARDS);
            this.f8407d.retainAll(bVar.mo13282a(jSONArray));
            mo13277a(this.f8407d, C3662a.READ_CARDS);
            return m8623a(jSONArray, str, false, d);
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3665d(str, string), 7);
        return null;
    }

    /* renamed from: a */
    private final FeedUpdatedEvent m8623a(JSONArray jSONArray, String str, boolean z, long j) {
        List list;
        if (jSONArray.length() == 0) {
            list = new ArrayList();
        } else {
            list = C4224u.m9693a(jSONArray, new CardKey.Provider(false), this.f8404a, (C3475a<?>) this, this.f8408e);
        }
        List<Card> list2 = list;
        for (Card card : list2) {
            if (this.f8406c.contains(card.getId())) {
                card.setViewed(true);
                card.setIndicatorHighlighted(true);
            }
            if (this.f8407d.contains(card.getId())) {
                card.setIndicatorHighlighted(true);
            }
        }
        return new FeedUpdatedEvent(list2, str, z, j);
    }

    /* renamed from: a */
    private final Set<String> m8624a(C3662a aVar) {
        String b = aVar.mo13279b();
        if (this.f8405b.contains(b)) {
            Set<String> set = null;
            String string = this.f8405b.getString(b, (String) null);
            if (string != null) {
                set = f8403f.mo13281a(string);
            }
            SharedPreferences.Editor edit = this.f8405b.edit();
            edit.remove(b);
            edit.apply();
            if (set != null) {
                mo13277a(set, aVar);
                return set;
            }
        }
        return new ConcurrentSkipListSet(this.f8405b.getStringSet(aVar.mo13280c(), new HashSet()));
    }

    /* renamed from: a */
    private final void m8626a(JSONArray jSONArray, long j) {
        SharedPreferences.Editor edit = this.f8405b.edit();
        if (jSONArray.length() == 0) {
            edit.remove("cards");
        } else {
            edit.putString("cards", jSONArray.toString());
        }
        edit.putLong("cards_timestamp", j);
        edit.apply();
    }

    /* renamed from: a */
    private final void m8625a(String str) {
        SharedPreferences.Editor edit = this.f8405b.edit();
        edit.putString("uid", str);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo13277a(Set<String> set, C3662a aVar) {
        C19383o.m32797g(set, "cardIds");
        C19383o.m32797g(aVar, "property");
        String c = aVar.mo13280c();
        SharedPreferences.Editor edit = this.f8405b.edit();
        if (set.isEmpty()) {
            edit.remove(c);
        } else {
            edit.putStringSet(c, set);
        }
        edit.apply();
    }
}
