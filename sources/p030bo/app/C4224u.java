package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.appboy.models.cards.Card;
import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C19435k;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p024b4.C3475a;
import p568fn.C17782b;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: bo.app.u */
public final class C4224u {

    /* renamed from: a */
    public static final C4224u f9367a = new C4224u();

    /* renamed from: bo.app.u$a */
    public /* synthetic */ class C4225a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9368a;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.BANNER.ordinal()] = 1;
            iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            iArr[CardType.CONTROL.ordinal()] = 5;
            f9368a = iArr;
        }
    }

    /* renamed from: bo.app.u$b */
    public static final class C4226b extends Lambda implements C19857l<Integer, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f9369b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4226b(JSONArray jSONArray) {
            super(1);
            this.f9369b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo14117a(int i) {
            return Boolean.valueOf(this.f9369b.opt(i) instanceof Object);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo14117a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.u$c */
    public static final class C4227c extends Lambda implements C19857l<Integer, Object> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f9370b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4227c(JSONArray jSONArray) {
            super(1);
            this.f9370b = jSONArray;
        }

        /* renamed from: a */
        public final Object mo14118a(int i) {
            Object obj = this.f9370b.get(i);
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo14118a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.u$d */
    public static final class C4228d extends Lambda implements C19857l<Object, Card> {

        /* renamed from: b */
        public final /* synthetic */ CardKey.Provider f9371b;

        /* renamed from: c */
        public final /* synthetic */ C4274x1 f9372c;

        /* renamed from: d */
        public final /* synthetic */ C3475a<?> f9373d;

        /* renamed from: e */
        public final /* synthetic */ C4318z1 f9374e;

        /* renamed from: f */
        public final /* synthetic */ JSONArray f9375f;

        /* renamed from: bo.app.u$d$a */
        public static final class C4229a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ Object f9376b;

            /* renamed from: c */
            public final /* synthetic */ JSONArray f9377c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4229a(Object obj, JSONArray jSONArray) {
                super(0);
                this.f9376b = obj;
                this.f9377c = jSONArray;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Unable to create Card JSON in array. Ignoring. Was on element: ");
                h.append(this.f9376b);
                h.append(" of json array: ");
                h.append(this.f9377c);
                return h.toString();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4228d(CardKey.Provider provider, C4274x1 x1Var, C3475a<?> aVar, C4318z1 z1Var, JSONArray jSONArray) {
            super(1);
            this.f9371b = provider;
            this.f9372c = x1Var;
            this.f9373d = aVar;
            this.f9374e = z1Var;
            this.f9375f = jSONArray;
        }

        /* renamed from: a */
        public final Card invoke(Object obj) {
            C19383o.m32797g(obj, "it");
            try {
                return C4224u.f9367a.m9691a(obj.toString(), this.f9371b, this.f9372c, this.f9373d, this.f9374e);
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, C4224u.f9367a, BrazeLogger.Priority.E, e, new C4229a(obj, this.f9375f), 4);
                return null;
            }
        }
    }

    private C4224u() {
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.appboy.models.cards.BannerImageCard] */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.appboy.models.cards.CaptionedImageCard] */
    /* JADX WARNING: type inference failed for: r0v17, types: [com.appboy.models.cards.ShortNewsCard] */
    /* JADX WARNING: type inference failed for: r0v18, types: [com.appboy.models.cards.TextAnnouncementCard] */
    /* JADX WARNING: type inference failed for: r0v19, types: [com.appboy.models.cards.ControlCard] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appboy.models.cards.Card m9692a(org.json.JSONObject r7, com.appboy.enums.CardKey.Provider r8, p030bo.app.C4274x1 r9, p024b4.C3475a<?> r10, p030bo.app.C4318z1 r11) {
        /*
            java.lang.String r0 = "jsonObject"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r0 = "cardKeyProvider"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "brazeManager"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "cardStorageProvider"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            java.lang.String r0 = "cardAnalyticsProvider"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            com.appboy.enums.CardType r0 = r8.getCardTypeFromJson(r7)
            if (r0 != 0) goto L_0x0021
            r0 = -1
            goto L_0x0029
        L_0x0021:
            int[] r1 = p030bo.app.C4224u.C4225a.f9368a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L_0x0029:
            r1 = 1
            if (r0 == r1) goto L_0x006b
            r1 = 2
            if (r0 == r1) goto L_0x005f
            r1 = 3
            if (r0 == r1) goto L_0x0053
            r1 = 4
            if (r0 == r1) goto L_0x0047
            r1 = 5
            if (r0 == r1) goto L_0x003b
            r7 = 0
            goto L_0x0077
        L_0x003b:
            com.appboy.models.cards.ControlCard r6 = new com.appboy.models.cards.ControlCard
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0076
        L_0x0047:
            com.appboy.models.cards.TextAnnouncementCard r6 = new com.appboy.models.cards.TextAnnouncementCard
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0076
        L_0x0053:
            com.appboy.models.cards.ShortNewsCard r6 = new com.appboy.models.cards.ShortNewsCard
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0076
        L_0x005f:
            com.appboy.models.cards.CaptionedImageCard r6 = new com.appboy.models.cards.CaptionedImageCard
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0076
        L_0x006b:
            com.appboy.models.cards.BannerImageCard r6 = new com.appboy.models.cards.BannerImageCard
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0076:
            r7 = r6
        L_0x0077:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4224u.m9692a(org.json.JSONObject, com.appboy.enums.CardKey$Provider, bo.app.x1, b4.a, bo.app.z1):com.appboy.models.cards.Card");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Card m9691a(String str, CardKey.Provider provider, C4274x1 x1Var, C3475a<?> aVar, C4318z1 z1Var) {
        return m9692a(new JSONObject(str), provider, x1Var, aVar, z1Var);
    }

    /* renamed from: a */
    public static final List<Card> m9693a(JSONArray jSONArray, CardKey.Provider provider, C4274x1 x1Var, C3475a<?> aVar, C4318z1 z1Var) {
        C19383o.m32797g(jSONArray, "cardJsonStringArray");
        C19383o.m32797g(provider, "cardKeyProvider");
        C19383o.m32797g(x1Var, "brazeManager");
        C19383o.m32797g(aVar, "cardStorageProvider");
        C19383o.m32797g(z1Var, "cardAnalyticsProvider");
        return C17782b.m29867g0(SequencesKt___SequencesKt.m32989t1(SequencesKt___SequencesKt.m32986q1(C19435k.m33000j1(new C19439n.C19440a(SequencesKt___SequencesKt.m32985p1(SequencesKt___SequencesKt.m32984o1(C19327t.m32633O0(C19388s.m32816D0(0, jSONArray.length())), new C4226b(jSONArray)), new C4227c(jSONArray)))), new C4228d(provider, x1Var, aVar, z1Var, jSONArray))));
    }
}
