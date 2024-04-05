package p030bo.app;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.b0 */
public final class C3570b0 extends C4121r {

    /* renamed from: w */
    public static final C3571a f8228w = new C3571a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private final long f8229r;

    /* renamed from: s */
    private final long f8230s;

    /* renamed from: t */
    private String f8231t;

    /* renamed from: u */
    private int f8232u;

    /* renamed from: v */
    private final boolean f8233v;

    /* renamed from: bo.app.b0$a */
    public static final class C3571a {
        private C3571a() {
        }

        public /* synthetic */ C3571a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.b0$b */
    public static final class C3572b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8234b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3572b(long j) {
            super(0);
            this.f8234b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0087d.m236f(C0072d.m201h("ContentCardsSyncRequest scheduled for retry in "), this.f8234b, " ms.");
        }
    }

    /* renamed from: bo.app.b0$c */
    public static final class C3573c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3573c f8235b = new C3573c();

        public C3573c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "ContentCardsSyncRequest executed successfully.";
        }
    }

    /* renamed from: bo.app.b0$d */
    public static final class C3574d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3574d f8236b = new C3574d();

        public C3574d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while creating Content Cards request. Returning null.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3570b0(String str, long j, long j2, String str2, int i) {
        super(new C4179s4(C19383o.m32802l("content_cards/sync", str)));
        C19383o.m32797g(str, "urlBase");
        this.f8229r = j;
        this.f8230s = j2;
        this.f8231t = str2;
        this.f8232u = i;
    }

    /* renamed from: a */
    public String mo13114a() {
        return this.f8231t;
    }

    /* renamed from: b */
    public boolean mo13118b() {
        return this.f8233v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028 A[Catch:{ JSONException -> 0x0032 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo13119l() {
        /*
            r8 = this;
            org.json.JSONObject r0 = super.mo13119l()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r2 = "last_full_sync_at"
            long r3 = r8.f8230s     // Catch:{ JSONException -> 0x0032 }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r2 = "last_card_updated_at"
            long r3 = r8.f8229r     // Catch:{ JSONException -> 0x0032 }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r2 = r8.mo13114a()     // Catch:{ JSONException -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            boolean r2 = kotlin.text.C19457k.m33020X0(r2)     // Catch:{ JSONException -> 0x0032 }
            if (r2 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r2 = 0
            goto L_0x0026
        L_0x0025:
            r2 = 1
        L_0x0026:
            if (r2 != 0) goto L_0x0031
            java.lang.String r2 = "user_id"
            java.lang.String r3 = r8.mo13114a()     // Catch:{ JSONException -> 0x0032 }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0032 }
        L_0x0031:
            return r0
        L_0x0032:
            r0 = move-exception
            r5 = r0
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.W
            bo.app.b0$d r6 = p030bo.app.C3570b0.C3574d.f8236b
            r7 = 4
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3570b0.mo13119l():org.json.JSONObject");
    }

    /* renamed from: t */
    public final int mo13120t() {
        return this.f8232u;
    }

    /* renamed from: a */
    public void mo13116a(String str) {
        this.f8231t = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r1 = r11.mo13177e();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13115a(p030bo.app.C3666f2 r9, p030bo.app.C3666f2 r10, p030bo.app.C3608d r11) {
        /*
            r8 = this;
            java.lang.String r0 = "internalPublisher"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "externalPublisher"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            java.lang.String r10 = "RETRY-AFTER"
            r0 = 1
            if (r11 != 0) goto L_0x0010
            goto L_0x001f
        L_0x0010:
            java.util.Map r1 = r11.mo13177e()
            if (r1 != 0) goto L_0x0017
            goto L_0x001f
        L_0x0017:
            boolean r1 = p030bo.app.C4135r1.m9504a(r1, r10)
            if (r1 != r0) goto L_0x001f
            r1 = r0
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x0056
            java.util.Map r11 = r11.mo13177e()
            java.lang.String r10 = p030bo.app.C4135r1.m9505b(r11, r10)
            if (r10 != 0) goto L_0x002d
            goto L_0x0056
        L_0x002d:
            java.lang.Long r10 = p030bo.app.C4135r1.m9502a((java.lang.String) r10)
            if (r10 != 0) goto L_0x0034
            goto L_0x0056
        L_0x0034:
            long r10 = r10.longValue()
            bo.app.x r1 = new bo.app.x
            int r2 = r8.mo13120t()
            int r2 = r2 + r0
            r1.<init>(r10, r2)
            java.lang.Class<bo.app.x> r0 = p030bo.app.C4269x.class
            r9.mo13286a(r1, r0)
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            bo.app.b0$b r6 = new bo.app.b0$b
            r6.<init>(r10)
            r4 = 0
            r5 = 0
            r7 = 7
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
            return
        L_0x0056:
            bo.app.w r10 = new bo.app.w
            r10.<init>()
            java.lang.Class<bo.app.w> r11 = p030bo.app.C4251w.class
            r9.mo13286a(r10, r11)
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a
            bo.app.b0$c r4 = p030bo.app.C3570b0.C3573c.f8235b
            r2 = 0
            r3 = 0
            r5 = 7
            r1 = r8
            com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3570b0.mo13115a(bo.app.f2, bo.app.f2, bo.app.d):void");
    }

    /* renamed from: a */
    public void mo13117a(Map<String, String> map) {
        C19383o.m32797g(map, "existingHeaders");
        super.mo13117a(map);
        map.put("X-Braze-DataRequest", "true");
        map.put("X-Braze-ContentCardsRequest", "true");
        map.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.f8232u));
    }
}
