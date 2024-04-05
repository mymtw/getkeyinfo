package p030bo.app;

import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: bo.app.y4 */
public final class C4299y4 {

    /* renamed from: n */
    public static final C4300a f9480n = new C4300a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private long f9481a;

    /* renamed from: b */
    private Set<String> f9482b;

    /* renamed from: c */
    private Set<String> f9483c;

    /* renamed from: d */
    private Set<String> f9484d;

    /* renamed from: e */
    private int f9485e;

    /* renamed from: f */
    private int f9486f;

    /* renamed from: g */
    private int f9487g;

    /* renamed from: h */
    private boolean f9488h;

    /* renamed from: i */
    private boolean f9489i;

    /* renamed from: j */
    private boolean f9490j;

    /* renamed from: k */
    private long f9491k;

    /* renamed from: l */
    private boolean f9492l;

    /* renamed from: m */
    private boolean f9493m;

    /* renamed from: bo.app.y4$a */
    public static final class C4300a {
        private C4300a() {
        }

        public /* synthetic */ C4300a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.y4$b */
    public static final class C4301b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4301b f9494b = new C4301b();

        public C4301b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error getting required content cards fields. Using defaults.";
        }
    }

    /* renamed from: bo.app.y4$c */
    public static final class C4302c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4302c f9495b = new C4302c();

        public C4302c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error getting required ephemeral events fields. Using defaults.";
        }
    }

    /* renamed from: bo.app.y4$d */
    public static final class C4303d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4303d f9496b = new C4303d();

        public C4303d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error getting required geofence fields. Using defaults.";
        }
    }

    /* renamed from: bo.app.y4$e */
    public static final class C4304e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4304e f9497b = new C4304e();

        public C4304e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error getting required test user fields. Using defaults";
        }
    }

    /* renamed from: bo.app.y4$f */
    public static final class C4305f extends Lambda implements C19857l<Integer, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f9498b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4305f(JSONArray jSONArray) {
            super(1);
            this.f9498b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo14242a(int i) {
            return Boolean.valueOf(this.f9498b.opt(i) instanceof String);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo14242a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.y4$g */
    public static final class C4306g extends Lambda implements C19857l<Integer, String> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f9499b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4306g(JSONArray jSONArray) {
            super(1);
            this.f9499b = jSONArray;
        }

        /* renamed from: a */
        public final String mo14243a(int i) {
            Object obj = this.f9499b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo14243a(((Number) obj).intValue());
        }
    }

    public C4299y4(long j, Set<String> set, Set<String> set2, Set<String> set3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5) {
        this.f9481a = j;
        this.f9482b = set;
        this.f9483c = set2;
        this.f9484d = set3;
        this.f9485e = i;
        this.f9486f = i2;
        this.f9487g = i3;
        this.f9488h = z;
        this.f9489i = z2;
        this.f9490j = z3;
        this.f9491k = j2;
        this.f9492l = z4;
        this.f9493m = z5;
    }

    /* renamed from: a */
    public final void mo14214a(long j) {
        this.f9481a = j;
    }

    /* renamed from: b */
    public final Set<String> mo14217b() {
        return this.f9482b;
    }

    /* renamed from: c */
    public final Set<String> mo14222c() {
        return this.f9484d;
    }

    /* renamed from: d */
    public final long mo14226d() {
        return this.f9481a;
    }

    /* renamed from: e */
    public final void mo14228e(boolean z) {
        this.f9492l = z;
    }

    /* renamed from: f */
    public final boolean mo14230f() {
        return this.f9489i;
    }

    /* renamed from: g */
    public final boolean mo14231g() {
        return this.f9488h;
    }

    /* renamed from: h */
    public final int mo14232h() {
        return this.f9487g;
    }

    /* renamed from: i */
    public final long mo14233i() {
        return this.f9491k;
    }

    /* renamed from: j */
    public final int mo14234j() {
        return this.f9486f;
    }

    /* renamed from: k */
    public final int mo14235k() {
        return this.f9485e;
    }

    /* renamed from: l */
    public final boolean mo14236l() {
        return this.f9492l;
    }

    /* renamed from: m */
    public final boolean mo14237m() {
        return this.f9490j;
    }

    /* renamed from: a */
    public final Set<String> mo14212a() {
        return this.f9483c;
    }

    /* renamed from: b */
    public final void mo14220b(Set<String> set) {
        this.f9482b = set;
    }

    /* renamed from: c */
    public final void mo14224c(Set<String> set) {
        this.f9484d = set;
    }

    /* renamed from: d */
    public final void mo14227d(boolean z) {
        this.f9488h = z;
    }

    /* renamed from: e */
    public final boolean mo14229e() {
        return this.f9493m;
    }

    /* renamed from: d */
    private final void m9935d(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.f9485e = optJSONObject.getInt("min_time_since_last_request");
                this.f9486f = optJSONObject.getInt("min_time_since_last_report");
                this.f9489i = optJSONObject.getBoolean(ResponseConstants.ENABLED);
                this.f9488h = true;
                this.f9487g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4303d.f9496b, 4);
                this.f9485e = -1;
                this.f9486f = -1;
                this.f9487g = -1;
                this.f9489i = false;
                this.f9488h = false;
            }
        }
    }

    /* renamed from: e */
    private final void m9936e(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("test_user");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("device_logging_enabled");
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4304e.f9497b, 4);
                z = false;
            }
            this.f9492l = z;
        }
    }

    /* renamed from: a */
    public final void mo14215a(Set<String> set) {
        this.f9483c = set;
    }

    /* renamed from: b */
    public final void mo14218b(int i) {
        this.f9486f = i;
    }

    /* renamed from: c */
    public final void mo14223c(int i) {
        this.f9485e = i;
    }

    /* renamed from: a */
    public final void mo14213a(int i) {
        this.f9487g = i;
    }

    /* renamed from: b */
    public final void mo14219b(long j) {
        this.f9491k = j;
    }

    /* renamed from: c */
    public final void mo14225c(boolean z) {
        this.f9489i = z;
    }

    /* renamed from: c */
    private final void m9934c(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean(ResponseConstants.ENABLED);
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4302c.f9495b, 4);
                z = false;
            }
            mo14221b(z);
        }
    }

    /* renamed from: a */
    public final void mo14216a(boolean z) {
        this.f9490j = z;
    }

    /* renamed from: b */
    public final void mo14221b(boolean z) {
        this.f9493m = z;
    }

    /* renamed from: a */
    private final void m9932a(JSONObject jSONObject) {
        this.f9482b = m9931a(jSONObject, "events_blacklist");
        this.f9483c = m9931a(jSONObject, "attributes_blacklist");
        this.f9484d = m9931a(jSONObject, "purchases_blacklist");
    }

    /* renamed from: b */
    private final void m9933b(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean(ResponseConstants.ENABLED);
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4301b.f9494b, 4);
                z = false;
            }
            this.f9490j = z;
        }
    }

    /* renamed from: a */
    private final Set<String> m9931a(JSONObject jSONObject, String str) {
        Iterator it;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                it = EmptyList.INSTANCE.iterator();
            } else {
                it = new C19439n.C19440a(SequencesKt___SequencesKt.m32985p1(SequencesKt___SequencesKt.m32984o1(C19327t.m32633O0(C19388s.m32816D0(0, optJSONArray.length())), new C4305f(optJSONArray)), new C4306g(optJSONArray)));
            }
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C4299y4(long r17, java.util.Set r19, java.util.Set r20, java.util.Set r21, int r22, int r23, int r24, boolean r25, boolean r26, boolean r27, long r28, boolean r30, boolean r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0014
        L_0x0012:
            r3 = r19
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = r4
            goto L_0x001c
        L_0x001a:
            r5 = r20
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r4 = r21
        L_0x0023:
            r6 = r0 & 16
            r7 = -1
            if (r6 == 0) goto L_0x002a
            r6 = r7
            goto L_0x002c
        L_0x002a:
            r6 = r22
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r7
            goto L_0x0034
        L_0x0032:
            r8 = r23
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r7 = r24
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            r10 = 0
            if (r9 == 0) goto L_0x0042
            r9 = r10
            goto L_0x0044
        L_0x0042:
            r9 = r25
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = r10
            goto L_0x004c
        L_0x004a:
            r11 = r26
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = r10
            goto L_0x0054
        L_0x0052:
            r12 = r27
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005b
            r13 = -1
            goto L_0x005d
        L_0x005b:
            r13 = r28
        L_0x005d:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0063
            r15 = r10
            goto L_0x0065
        L_0x0063:
            r15 = r30
        L_0x0065:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r10 = r31
        L_0x006c:
            r17 = r16
            r18 = r1
            r20 = r3
            r21 = r5
            r22 = r4
            r23 = r6
            r24 = r8
            r25 = r7
            r26 = r9
            r27 = r11
            r28 = r12
            r29 = r13
            r31 = r15
            r32 = r10
            r17.<init>(r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4299y4.<init>(long, java.util.Set, java.util.Set, java.util.Set, int, int, int, boolean, boolean, boolean, long, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4299y4(JSONObject jSONObject) {
        this(0, (Set) null, (Set) null, (Set) null, 0, 0, 0, false, false, false, 0, false, false, 8191, (DefaultConstructorMarker) null);
        C19383o.m32797g(jSONObject, "jsonObject");
        JSONObject jSONObject2 = jSONObject;
        this.f9481a = jSONObject2.optLong("time", 0);
        this.f9491k = jSONObject2.optLong("messaging_session_timeout", -1);
        m9932a(jSONObject);
        m9933b(jSONObject);
        m9935d(jSONObject);
        m9936e(jSONObject);
        m9934c(jSONObject);
    }
}
