package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.appboy.enums.CardKey;
import com.appboy.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C19327t;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p024b4.C3475a;
import p301z3.C8433c;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: bo.app.a0 */
public final class C3517a0 implements C3475a<C8433c> {

    /* renamed from: f */
    public static final C3518a f8148f = new C3518a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Set<String> f8149g = C19382n.m32704D0(CardKey.VIEWED.getContentCardsKey(), CardKey.DISMISSED.getContentCardsKey());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f8150a;

    /* renamed from: b */
    private final C4274x1 f8151b;

    /* renamed from: c */
    private final SharedPreferences f8152c;

    /* renamed from: d */
    private final SharedPreferences f8153d;

    /* renamed from: e */
    private final C4318z1 f8154e;

    /* renamed from: bo.app.a0$b */
    public static final class C3519b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8155b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3519b(String str) {
            super(0);
            this.f8155b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8155b, "Adding card to test cache: ");
        }
    }

    /* renamed from: bo.app.a0$c */
    public static final class C3520c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8156b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3520c(String str) {
            super(0);
            this.f8156b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8156b, "Deleting expired card from storage with id: ");
        }
    }

    /* renamed from: bo.app.a0$d */
    public static final class C3521d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8157b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3521d(String str) {
            super(0);
            this.f8157b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8157b, "Card not present in storage for id: ");
        }
    }

    /* renamed from: bo.app.a0$e */
    public static final class C3522e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8158b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3522e(String str) {
            super(0);
            this.f8158b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8158b, "Failed to read card json from storage. Json: ");
        }
    }

    /* renamed from: bo.app.a0$f */
    public static final class C3523f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8159b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3523f(String str) {
            super(0);
            this.f8159b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8159b, "Removing card from test cache: ");
        }
    }

    /* renamed from: bo.app.a0$g */
    public static final class C3524g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8160b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3524g(String str) {
            super(0);
            this.f8160b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8160b, "Removing card from storage with id: ");
        }
    }

    /* renamed from: bo.app.a0$h */
    public static final class C3525h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3525h f8161b = new C3525h();

        public C3525h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The server card received is older than the cached card. Discarding the server card.";
        }
    }

    /* renamed from: bo.app.a0$i */
    public static final class C3526i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8162b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3526i(JSONObject jSONObject) {
            super(0);
            this.f8162b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8162b, "Server card json: ");
        }
    }

    /* renamed from: bo.app.a0$j */
    public static final class C3527j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8163b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3527j(JSONObject jSONObject) {
            super(0);
            this.f8163b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8163b, "Cached card json: ");
        }
    }

    /* renamed from: bo.app.a0$k */
    public static final class C3528k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8164b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3528k(String str) {
            super(0);
            this.f8164b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8164b, "Server card is marked as removed. Removing from card storage with id: ");
        }
    }

    /* renamed from: bo.app.a0$l */
    public static final class C3529l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8165b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3529l(JSONObject jSONObject) {
            super(0);
            this.f8165b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8165b, "Server card was locally dismissed already. Not adding card to storage. Server card: ");
        }
    }

    /* renamed from: bo.app.a0$m */
    public static final class C3530m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8166b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3530m(JSONObject jSONObject) {
            super(0);
            this.f8166b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8166b, "Server card has expired already. Not adding card to storage. Server card: ");
        }
    }

    /* renamed from: bo.app.a0$n */
    public static final class C3531n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8167b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3531n(String str) {
            super(0);
            this.f8167b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8167b, "Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ");
        }
    }

    /* renamed from: bo.app.a0$o */
    public static final class C3532o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8168b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3532o(String str) {
            super(0);
            this.f8168b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8168b, "Can't update card field. Json cannot be parsed from disk or is not present. Id: ");
        }
    }

    /* renamed from: bo.app.a0$p */
    public static final class C3533p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Object f8169b;

        /* renamed from: c */
        public final /* synthetic */ CardKey f8170c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3533p(Object obj, CardKey cardKey) {
            super(0);
            this.f8169b = obj;
            this.f8170c = cardKey;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to update card json field to ");
            h.append(this.f8169b);
            h.append(" with key: ");
            h.append(this.f8170c);
            return h.toString();
        }
    }

    /* renamed from: bo.app.a0$q */
    public static final class C3534q extends Lambda implements C19857l<Integer, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f8171b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3534q(JSONArray jSONArray) {
            super(1);
            this.f8171b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo13057a(int i) {
            return Boolean.valueOf(this.f8171b.opt(i) instanceof JSONObject);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo13057a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.a0$r */
    public static final class C3535r extends Lambda implements C19857l<Integer, JSONObject> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f8172b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3535r(JSONArray jSONArray) {
            super(1);
            this.f8172b = jSONArray;
        }

        /* renamed from: a */
        public final JSONObject mo13058a(int i) {
            Object obj = this.f8172b.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo13058a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.a0$s */
    public static final class C3536s extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3536s f8173b = new C3536s();

        public C3536s() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Input user id was null. Defaulting to the empty user id";
        }
    }

    /* renamed from: bo.app.a0$t */
    public static final class C3537t extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef<String> f8174b;

        /* renamed from: c */
        public final /* synthetic */ C3517a0 f8175c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3537t(Ref$ObjectRef<String> ref$ObjectRef, C3517a0 a0Var) {
            super(0);
            this.f8174b = ref$ObjectRef;
            this.f8175c = a0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("The received cards are for user ");
            h.append(this.f8174b.element);
            h.append(" and the current user is ");
            h.append(this.f8175c.f8150a);
            h.append(" , the cards will be discarded and no changes will be made.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.a0$u */
    public static final class C3538u extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef<String> f8176b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3538u(Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f8176b = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8176b.element, "Updating offline Content Cards for user with id: ");
        }
    }

    public C3517a0(Context context, String str, String str2, C4274x1 x1Var, String str3) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "userId");
        C19383o.m32797g(str2, "apiKey");
        C19383o.m32797g(x1Var, "brazeManager");
        C19383o.m32797g(str3, "currentSdkVersion");
        this.f8150a = str;
        this.f8151b = x1Var;
        String b = StringUtils.m11341b(context, str, str2);
        this.f8153d = C3965m5.m9150a(context, C19383o.m32802l(b, "com.braze.storage.content_cards_storage_provider.metadata"), str3);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C19383o.m32802l(b, "com.appboy.storage.content_cards_storage_provider.cards"), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ix, Context.MODE_PRIVATE)");
        this.f8152c = sharedPreferences;
        this.f8154e = new C4285y();
    }

    /* renamed from: g */
    private final long m8348g() {
        return this.f8153d.getLong("last_storage_update_timestamp", 0);
    }

    /* renamed from: i */
    private final void m8349i() {
        this.f8153d.edit().putLong("last_storage_update_timestamp", DateTimeUtils.m11302d()).apply();
    }

    /* renamed from: b */
    public C8433c getCachedCardsAsEvent() {
        return mo13018a(true);
    }

    /* renamed from: c */
    public final Set<String> mo13028c() {
        Set<String> stringSet = this.f8153d.getStringSet("dismissed", new HashSet());
        Set<String> s1 = stringSet == null ? null : C19327t.m32663s1(C19327t.m32636R0(stringSet));
        return s1 == null ? C19327t.m32663s1(EmptySet.INSTANCE) : s1;
    }

    /* renamed from: d */
    public final Set<String> mo13031d() {
        Set<String> stringSet = this.f8153d.getStringSet(Listing.EXPIRED_STATE, new HashSet());
        Set<String> s1 = stringSet == null ? null : C19327t.m32663s1(C19327t.m32636R0(stringSet));
        return s1 == null ? C19327t.m32663s1(EmptySet.INSTANCE) : s1;
    }

    /* renamed from: e */
    public final long mo13033e() {
        return this.f8153d.getLong("last_card_updated_at", 0);
    }

    /* renamed from: f */
    public final long mo13035f() {
        return this.f8153d.getLong("last_full_sync_at", 0);
    }

    /* renamed from: h */
    public final Set<String> mo13038h() {
        Set<String> stringSet = this.f8153d.getStringSet("test", new HashSet());
        Set<String> s1 = stringSet == null ? null : C19327t.m32663s1(C19327t.m32636R0(stringSet));
        return s1 == null ? C19327t.m32663s1(EmptySet.INSTANCE) : s1;
    }

    public void markCardAsClicked(String str) {
        C19383o.m32797g(str, "cardId");
        mo13022a(str, CardKey.CLICKED, Boolean.TRUE);
    }

    public void markCardAsDismissed(String str) {
        C19383o.m32797g(str, "cardId");
        mo13021a(str);
        mo13023a(str, (JSONObject) null);
    }

    public void markCardAsViewed(String str) {
        C19383o.m32797g(str, "cardId");
        mo13022a(str, CardKey.VIEWED, Boolean.TRUE);
    }

    public void markCardAsVisuallyRead(String str) {
        C19383o.m32797g(str, "cardId");
        mo13022a(str, CardKey.READ, Boolean.TRUE);
    }

    /* renamed from: b */
    private final boolean m8347b(JSONObject jSONObject) {
        Set<String> c = mo13028c();
        Set<String> d = mo13031d();
        String string = jSONObject.getString(CardKey.ID.getContentCardsKey());
        C19383o.m32796f(string, "serverCardId");
        JSONObject d2 = mo13032d(string);
        C3518a aVar = f8148f;
        if (aVar.mo13041b(d2, jSONObject)) {
            BrazeLogger brazeLogger = BrazeLogger.f11932a;
            BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, C3525h.f8161b, 6);
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C3526i(jSONObject), 7);
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C3527j(jSONObject), 7);
            return false;
        } else if (aVar.mo13040a(jSONObject, CardKey.REMOVED)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3528k(string), 7);
            mo13034e(string);
            mo13036f(string);
            mo13023a(string, (JSONObject) null);
            return true;
        } else if (c.contains(string)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3529l(jSONObject), 7);
            return true;
        } else if (d.contains(string)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3530m(jSONObject), 7);
            return true;
        } else if (aVar.mo13040a(jSONObject, CardKey.DISMISSED)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3531n(string), 7);
            mo13021a(string);
            mo13023a(string, (JSONObject) null);
            return true;
        } else {
            mo13023a(string, aVar.mo13039a(d2, jSONObject));
            if (aVar.mo13040a(jSONObject, CardKey.IS_TEST)) {
                mo13029c(string);
            }
            return true;
        }
    }

    /* renamed from: e */
    public final void mo13034e(String str) {
        C19383o.m32797g(str, "cardId");
        Set<String> c = mo13028c();
        c.remove(str);
        this.f8153d.edit().putStringSet("dismissed", c).apply();
    }

    /* renamed from: f */
    public final void mo13036f(String str) {
        C19383o.m32797g(str, "cardId");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C3523f(str), 6);
        Set<String> h = mo13038h();
        h.remove(str);
        this.f8153d.edit().putStringSet("test", h).apply();
    }

    /* renamed from: a */
    public final C8433c mo13017a(C4309z zVar, String str) {
        C19383o.m32797g(zVar, "contentCardsResponse");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = str;
        if (str == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3536s.f8173b, 7);
            ref$ObjectRef.element = "";
        }
        if (!C19383o.m32792b(this.f8150a, ref$ObjectRef.element)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C3537t(ref$ObjectRef, this), 6);
            return null;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C3538u(ref$ObjectRef), 6);
        mo13019a(zVar);
        m8349i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JSONArray a = zVar.mo14244a();
        if (!(a == null || a.length() == 0)) {
            C19439n p1 = SequencesKt___SequencesKt.m32985p1(SequencesKt___SequencesKt.m32984o1(C19327t.m32633O0(C19388s.m32816D0(0, a.length())), new C3534q(a)), new C3535r(a));
            for (T invoke : p1.f43362a) {
                JSONObject jSONObject = (JSONObject) p1.f43363b.invoke(invoke);
                if (m8347b(jSONObject)) {
                    String string = jSONObject.getString(CardKey.ID.getContentCardsKey());
                    C19383o.m32796f(string, "serverCardJson.getString…rdKey.ID.contentCardsKey)");
                    linkedHashSet.add(string);
                }
            }
        }
        if (zVar.mo14247d()) {
            mo13027b((Set<String>) linkedHashSet);
            mo13030c((Set<String>) linkedHashSet);
            linkedHashSet.addAll(mo13038h());
            mo13024a((Set<String>) linkedHashSet);
        }
        return mo13018a(false);
    }

    /* renamed from: c */
    public final void mo13029c(String str) {
        C19383o.m32797g(str, "cardId");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C3519b(str), 6);
        Set<String> h = mo13038h();
        h.add(str);
        this.f8153d.edit().putStringSet("test", h).apply();
    }

    /* renamed from: d */
    public final JSONObject mo13032d(String str) {
        C19383o.m32797g(str, "cardId");
        String string = this.f8152c.getString(str, (String) null);
        if (string == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3521d(str), 7);
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C3522e(string), 4);
            return null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3517a0(Context context, String str, String str2, C4274x1 x1Var, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, x1Var, (i & 16) != 0 ? Constants.APPBOY_SDK_VERSION : str3);
    }

    /* renamed from: c */
    public final void mo13030c(Set<String> set) {
        C19383o.m32797g(set, "cardIdsToRetain");
        Set<String> d = mo13031d();
        d.retainAll(set);
        this.f8153d.edit().putStringSet(Listing.EXPIRED_STATE, d).apply();
    }

    /* renamed from: bo.app.a0$a */
    public static final class C3518a {
        private C3518a() {
        }

        public /* synthetic */ C3518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final JSONObject mo13039a(JSONObject jSONObject, JSONObject jSONObject2) {
            C19383o.m32797g(jSONObject2, "serverCard");
            if (jSONObject == null) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject3.put(next, jSONObject.get(next));
            }
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (C3517a0.f8149g.contains(next2)) {
                    jSONObject3.put(next2, jSONObject.getBoolean(next2) || jSONObject2.getBoolean(next2));
                } else {
                    jSONObject3.put(next2, jSONObject2.get(next2));
                }
            }
            return jSONObject3;
        }

        /* renamed from: b */
        public final boolean mo13041b(JSONObject jSONObject, JSONObject jSONObject2) {
            C19383o.m32797g(jSONObject2, "serverCard");
            if (jSONObject == null) {
                return false;
            }
            String contentCardsKey = CardKey.CREATED.getContentCardsKey();
            return jSONObject.has(contentCardsKey) && jSONObject2.has(contentCardsKey) && jSONObject.getLong(contentCardsKey) > jSONObject2.getLong(contentCardsKey);
        }

        /* renamed from: a */
        public final boolean mo13040a(JSONObject jSONObject, CardKey cardKey) {
            C19383o.m32797g(jSONObject, "json");
            C19383o.m32797g(cardKey, "cardKey");
            String contentCardsKey = cardKey.getContentCardsKey();
            if (jSONObject.has(contentCardsKey)) {
                return jSONObject.getBoolean(contentCardsKey);
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void mo13027b(Set<String> set) {
        C19383o.m32797g(set, "cardIdsToRetain");
        Set<String> c = mo13028c();
        c.retainAll(set);
        this.f8153d.edit().putStringSet("dismissed", c).apply();
    }

    /* renamed from: b */
    public final void mo13026b(String str) {
        C19383o.m32797g(str, "cardId");
        Set<String> d = mo13031d();
        d.add(str);
        this.f8153d.edit().putStringSet(Listing.EXPIRED_STATE, d).apply();
    }

    /* renamed from: a */
    public final Card mo13016a(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "cardJson");
        return C4224u.m9692a(jSONObject, CardKey.Provider.CONTENT_CARDS, this.f8151b, (C3475a<?>) this, this.f8154e);
    }

    /* renamed from: a */
    public final C8433c mo13018a(boolean z) {
        CardKey.Provider provider = CardKey.Provider.CONTENT_CARDS;
        Map<String, ?> all = this.f8152c.getAll();
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List<Card> a = C4224u.m9693a(jSONArray, provider, this.f8151b, (C3475a<?>) this, this.f8154e);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T next : a) {
            if (((Card) next).isExpired()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component2();
        for (Card a2 : (List) pair.component1()) {
            mo13020a(a2);
        }
        return new C8433c(list, this.f8150a, z, m8348g());
    }

    /* renamed from: a */
    public final void mo13020a(Card card) {
        C19383o.m32797g(card, ResponseConstants.CARD);
        String id = card.getId();
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3520c(id), 7);
        mo13023a(id, (JSONObject) null);
        mo13026b(id);
        mo13036f(id);
    }

    /* renamed from: a */
    public final void mo13022a(String str, CardKey cardKey, Object obj) {
        C19383o.m32797g(str, "cardId");
        C19383o.m32797g(cardKey, "cardKey");
        C19383o.m32797g(obj, "value");
        JSONObject d = mo13032d(str);
        if (d == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3532o(str), 7);
            return;
        }
        try {
            d.put(cardKey.getContentCardsKey(), obj);
            mo13023a(str, d);
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C3533p(obj, cardKey), 4);
        }
    }

    /* renamed from: a */
    public final void mo13019a(C4309z zVar) {
        C19383o.m32797g(zVar, "contentCardsResponse");
        SharedPreferences.Editor edit = this.f8153d.edit();
        if (zVar.mo14245b() != -1) {
            edit.putLong("last_card_updated_at", zVar.mo14245b());
        }
        if (zVar.mo14246c() != -1) {
            edit.putLong("last_full_sync_at", zVar.mo14246c());
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void mo13023a(String str, JSONObject jSONObject) {
        C19383o.m32797g(str, "cardId");
        SharedPreferences.Editor edit = this.f8152c.edit();
        if (jSONObject != null) {
            edit.putString(str, jSONObject.toString());
        } else {
            edit.remove(str);
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void mo13021a(String str) {
        C19383o.m32797g(str, "cardId");
        Set<String> c = mo13028c();
        c.add(str);
        this.f8153d.edit().putStringSet("dismissed", c).apply();
    }

    /* renamed from: a */
    public final void mo13024a(Set<String> set) {
        C19383o.m32797g(set, "cardIdsToRetain");
        Set<String> keySet = this.f8152c.getAll().keySet();
        SharedPreferences.Editor edit = this.f8152c.edit();
        for (String next : keySet) {
            if (!set.contains(next)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3524g(next), 7);
                edit.remove(next);
            }
        }
        edit.apply();
    }
}
