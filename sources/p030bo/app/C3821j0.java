package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.appboy.enums.DeviceKey;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p005a4.C0035b;
import p753kq.C19846a;

/* renamed from: bo.app.j0 */
public final class C3821j0 implements C0035b<JSONObject>, C3637e2 {

    /* renamed from: m */
    public static final C3823b f8669m = new C3823b((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final BrazeConfigurationProvider f8670b;

    /* renamed from: c */
    private final String f8671c;

    /* renamed from: d */
    private final String f8672d;

    /* renamed from: e */
    private final String f8673e;

    /* renamed from: f */
    private final String f8674f;

    /* renamed from: g */
    private final String f8675g;

    /* renamed from: h */
    private final String f8676h;

    /* renamed from: i */
    private final Boolean f8677i;

    /* renamed from: j */
    private final Boolean f8678j;

    /* renamed from: k */
    private final String f8679k;

    /* renamed from: l */
    private final Boolean f8680l;

    /* renamed from: bo.app.j0$a */
    public static final class C3822a {

        /* renamed from: a */
        private final BrazeConfigurationProvider f8681a;

        /* renamed from: b */
        private String f8682b;

        /* renamed from: c */
        private String f8683c;

        /* renamed from: d */
        private String f8684d;

        /* renamed from: e */
        private String f8685e;

        /* renamed from: f */
        private String f8686f;

        /* renamed from: g */
        private String f8687g;

        /* renamed from: h */
        private Boolean f8688h;

        /* renamed from: i */
        private Boolean f8689i;

        /* renamed from: j */
        private String f8690j;

        /* renamed from: k */
        private Boolean f8691k;

        public C3822a(BrazeConfigurationProvider brazeConfigurationProvider) {
            C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
            this.f8681a = brazeConfigurationProvider;
        }

        /* renamed from: a */
        public final C3822a mo13526a(String str) {
            this.f8682b = str;
            return this;
        }

        /* renamed from: b */
        public final C3822a mo13529b(String str) {
            this.f8683c = str;
            return this;
        }

        /* renamed from: c */
        public final C3822a mo13530c(Boolean bool) {
            this.f8688h = bool;
            return this;
        }

        /* renamed from: d */
        public final C3822a mo13532d(String str) {
            this.f8685e = str;
            return this;
        }

        /* renamed from: e */
        public final C3822a mo13533e(String str) {
            this.f8684d = str;
            return this;
        }

        /* renamed from: f */
        public final C3822a mo13534f(String str) {
            this.f8687g = str;
            return this;
        }

        /* renamed from: g */
        public final C3822a mo13535g(String str) {
            this.f8686f = str;
            return this;
        }

        /* renamed from: a */
        public final C3822a mo13525a(Boolean bool) {
            this.f8691k = bool;
            return this;
        }

        /* renamed from: b */
        public final C3822a mo13528b(Boolean bool) {
            this.f8689i = bool;
            return this;
        }

        /* renamed from: c */
        public final C3822a mo13531c(String str) {
            this.f8690j = str;
            return this;
        }

        /* renamed from: a */
        public final C3821j0 mo13527a() {
            return new C3821j0(this.f8681a, this.f8682b, this.f8683c, this.f8684d, this.f8685e, this.f8686f, this.f8687g, this.f8688h, this.f8689i, this.f8690j, this.f8691k);
        }
    }

    /* renamed from: bo.app.j0$c */
    public static final class C3826c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3826c f8694b = new C3826c();

        public C3826c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating device Json.";
        }
    }

    public C3821j0(BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
        this.f8670b = brazeConfigurationProvider;
        this.f8671c = str;
        this.f8672d = str2;
        this.f8673e = str3;
        this.f8674f = str4;
        this.f8675g = str5;
        this.f8676h = str6;
        this.f8677i = bool;
        this.f8678j = bool2;
        this.f8679k = str7;
        this.f8680l = bool3;
    }

    /* renamed from: e */
    public boolean mo13244e() {
        return forJsonPut().length() == 0;
    }

    /* renamed from: v */
    public final boolean mo13523v() {
        return forJsonPut().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0058 A[Catch:{ JSONException -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065 A[Catch:{ JSONException -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079 A[Catch:{ JSONException -> 0x0083 }] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject forJsonPut() {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            bo.app.j0$b r1 = f8669m     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.BrazeConfigurationProvider r2 = r8.f8670b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.ANDROID_VERSION     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r8.f8671c     // Catch:{ JSONException -> 0x0083 }
            r1.mo13537a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.BrazeConfigurationProvider r2 = r8.f8670b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.CARRIER     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r8.f8672d     // Catch:{ JSONException -> 0x0083 }
            r1.mo13537a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.BrazeConfigurationProvider r2 = r8.f8670b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.MODEL     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r8.f8673e     // Catch:{ JSONException -> 0x0083 }
            r1.mo13537a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.BrazeConfigurationProvider r2 = r8.f8670b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.RESOLUTION     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r8.f8676h     // Catch:{ JSONException -> 0x0083 }
            r1.mo13537a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.BrazeConfigurationProvider r2 = r8.f8670b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.LOCALE     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r8.f8674f     // Catch:{ JSONException -> 0x0083 }
            r1.mo13537a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.BrazeConfigurationProvider r2 = r8.f8670b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.NOTIFICATIONS_ENABLED     // Catch:{ JSONException -> 0x0083 }
            java.lang.Boolean r4 = r8.f8677i     // Catch:{ JSONException -> 0x0083 }
            r1.mo13537a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.BrazeConfigurationProvider r2 = r8.f8670b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.IS_BACKGROUND_RESTRICTED     // Catch:{ JSONException -> 0x0083 }
            java.lang.Boolean r4 = r8.f8678j     // Catch:{ JSONException -> 0x0083 }
            r1.mo13537a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r2 = r8.f8679k     // Catch:{ JSONException -> 0x0083 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0055
            boolean r2 = kotlin.text.C19457k.m33020X0(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r2 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r2 = r3
            goto L_0x0056
        L_0x0055:
            r2 = r4
        L_0x0056:
            if (r2 != 0) goto L_0x0061
            com.braze.configuration.BrazeConfigurationProvider r2 = r8.f8670b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r5 = com.appboy.enums.DeviceKey.GOOGLE_ADVERTISING_ID     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r6 = r8.f8679k     // Catch:{ JSONException -> 0x0083 }
            r1.mo13537a(r2, r0, r5, r6)     // Catch:{ JSONException -> 0x0083 }
        L_0x0061:
            java.lang.Boolean r2 = r8.f8680l     // Catch:{ JSONException -> 0x0083 }
            if (r2 == 0) goto L_0x006c
            com.braze.configuration.BrazeConfigurationProvider r5 = r8.f8670b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r6 = com.appboy.enums.DeviceKey.AD_TRACKING_ENABLED     // Catch:{ JSONException -> 0x0083 }
            r1.mo13537a(r5, r0, r6, r2)     // Catch:{ JSONException -> 0x0083 }
        L_0x006c:
            java.lang.String r2 = r8.f8675g     // Catch:{ JSONException -> 0x0083 }
            if (r2 == 0) goto L_0x0076
            boolean r2 = kotlin.text.C19457k.m33020X0(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r2 == 0) goto L_0x0077
        L_0x0076:
            r3 = r4
        L_0x0077:
            if (r3 != 0) goto L_0x0090
            com.braze.configuration.BrazeConfigurationProvider r2 = r8.f8670b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.TIMEZONE     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r8.f8675g     // Catch:{ JSONException -> 0x0083 }
            r1.mo13537a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            goto L_0x0090
        L_0x0083:
            r1 = move-exception
            r5 = r1
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.E
            bo.app.j0$c r6 = p030bo.app.C3821j0.C3826c.f8694b
            r7 = 4
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3821j0.forJsonPut():org.json.JSONObject");
    }

    /* renamed from: bo.app.j0$b */
    public static final class C3823b {

        /* renamed from: bo.app.j0$b$a */
        public /* synthetic */ class C3824a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f8692a;

            static {
                int[] iArr = new int[DeviceKey.values().length];
                iArr[DeviceKey.TIMEZONE.ordinal()] = 1;
                iArr[DeviceKey.CARRIER.ordinal()] = 2;
                iArr[DeviceKey.ANDROID_VERSION.ordinal()] = 3;
                iArr[DeviceKey.RESOLUTION.ordinal()] = 4;
                iArr[DeviceKey.LOCALE.ordinal()] = 5;
                iArr[DeviceKey.MODEL.ordinal()] = 6;
                iArr[DeviceKey.NOTIFICATIONS_ENABLED.ordinal()] = 7;
                iArr[DeviceKey.IS_BACKGROUND_RESTRICTED.ordinal()] = 8;
                iArr[DeviceKey.GOOGLE_ADVERTISING_ID.ordinal()] = 9;
                iArr[DeviceKey.AD_TRACKING_ENABLED.ordinal()] = 10;
                f8692a = iArr;
            }
        }

        /* renamed from: bo.app.j0$b$b */
        public static final class C3825b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ DeviceKey f8693b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3825b(DeviceKey deviceKey) {
                super(0);
                this.f8693b = deviceKey;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Not adding device key <");
                h.append(this.f8693b);
                h.append("> to export due to allowlist restrictions.");
                return h.toString();
            }
        }

        private C3823b() {
        }

        public /* synthetic */ C3823b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3821j0 mo13536a(BrazeConfigurationProvider brazeConfigurationProvider, JSONObject jSONObject) {
            C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
            C19383o.m32797g(jSONObject, "jsonObject");
            C3822a aVar = new C3822a(brazeConfigurationProvider);
            DeviceKey[] values = DeviceKey.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                DeviceKey deviceKey = values[i];
                i++;
                String key = deviceKey.getKey();
                switch (C3824a.f8692a[deviceKey.ordinal()]) {
                    case 1:
                        aVar.mo13535g(JsonUtils.m11314e(key, jSONObject));
                        break;
                    case 2:
                        aVar.mo13529b(JsonUtils.m11314e(key, jSONObject));
                        break;
                    case 3:
                        aVar.mo13526a(JsonUtils.m11314e(key, jSONObject));
                        break;
                    case 4:
                        aVar.mo13534f(JsonUtils.m11314e(key, jSONObject));
                        break;
                    case 5:
                        aVar.mo13532d(JsonUtils.m11314e(key, jSONObject));
                        break;
                    case 6:
                        aVar.mo13533e(JsonUtils.m11314e(key, jSONObject));
                        break;
                    case 7:
                        if (!jSONObject.has(key)) {
                            break;
                        } else {
                            aVar.mo13530c(Boolean.valueOf(jSONObject.optBoolean(key, true)));
                            break;
                        }
                    case 8:
                        if (!jSONObject.has(key)) {
                            break;
                        } else {
                            aVar.mo13528b(Boolean.valueOf(jSONObject.optBoolean(key, false)));
                            break;
                        }
                    case 9:
                        aVar.mo13531c(JsonUtils.m11314e(key, jSONObject));
                        break;
                    case 10:
                        if (!jSONObject.has(key)) {
                            break;
                        } else {
                            aVar.mo13525a(Boolean.valueOf(jSONObject.optBoolean(key)));
                            break;
                        }
                }
            }
            return aVar.mo13527a();
        }

        /* renamed from: a */
        public final void mo13537a(BrazeConfigurationProvider brazeConfigurationProvider, JSONObject jSONObject, DeviceKey deviceKey, Object obj) {
            C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
            C19383o.m32797g(jSONObject, "deviceExport");
            C19383o.m32797g(deviceKey, "exportKey");
            if (!brazeConfigurationProvider.isDeviceObjectAllowlistEnabled() || brazeConfigurationProvider.getDeviceObjectAllowlist().contains(deviceKey)) {
                jSONObject.putOpt(deviceKey.getKey(), obj);
                return;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C3825b(deviceKey), 6);
        }
    }
}
