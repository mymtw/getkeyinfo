package com.braze.configuration;

import android.support.p013v4.media.C0072d;
import com.appboy.enums.DeviceKey;
import com.appboy.enums.LocationProviderName;
import com.appboy.enums.SdkFlavor;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: com.braze.configuration.a */
public final class C5410a {

    /* renamed from: A */
    public final Boolean f11617A;

    /* renamed from: B */
    public final Boolean f11618B;

    /* renamed from: C */
    public final Boolean f11619C;

    /* renamed from: D */
    public final Boolean f11620D;

    /* renamed from: E */
    public final Boolean f11621E;

    /* renamed from: F */
    public final Boolean f11622F;

    /* renamed from: G */
    public final Boolean f11623G;

    /* renamed from: H */
    public final Boolean f11624H;

    /* renamed from: I */
    public final Boolean f11625I;

    /* renamed from: J */
    public final Boolean f11626J;

    /* renamed from: K */
    public final EnumSet<DeviceKey> f11627K;

    /* renamed from: L */
    public final Boolean f11628L;

    /* renamed from: M */
    public final EnumSet<LocationProviderName> f11629M;

    /* renamed from: N */
    public final EnumSet<BrazeSdkMetadata> f11630N;

    /* renamed from: a */
    public final C5411a f11631a;

    /* renamed from: b */
    public final String f11632b;

    /* renamed from: c */
    public final String f11633c;

    /* renamed from: d */
    public final String f11634d;

    /* renamed from: e */
    public final String f11635e;

    /* renamed from: f */
    public final String f11636f;

    /* renamed from: g */
    public final String f11637g;

    /* renamed from: h */
    public final String f11638h;

    /* renamed from: i */
    public final String f11639i;

    /* renamed from: j */
    public final String f11640j;

    /* renamed from: k */
    public final String f11641k;

    /* renamed from: l */
    public final SdkFlavor f11642l;

    /* renamed from: m */
    public final Integer f11643m;

    /* renamed from: n */
    public final Integer f11644n;

    /* renamed from: o */
    public final Integer f11645o;

    /* renamed from: p */
    public final Integer f11646p;

    /* renamed from: q */
    public final Integer f11647q;

    /* renamed from: r */
    public final Integer f11648r;

    /* renamed from: s */
    public final Integer f11649s;

    /* renamed from: t */
    public final Boolean f11650t;

    /* renamed from: u */
    public final Boolean f11651u;

    /* renamed from: v */
    public final Boolean f11652v;

    /* renamed from: w */
    public final Boolean f11653w;

    /* renamed from: x */
    public final Boolean f11654x;

    /* renamed from: y */
    public final Boolean f11655y;

    /* renamed from: z */
    public final Boolean f11656z;

    /* renamed from: com.braze.configuration.a$a */
    public static final class C5411a {

        /* renamed from: A */
        public Boolean f11657A = null;

        /* renamed from: B */
        public Boolean f11658B = null;

        /* renamed from: C */
        public Boolean f11659C = null;

        /* renamed from: D */
        public Boolean f11660D = null;

        /* renamed from: E */
        public Boolean f11661E = null;

        /* renamed from: F */
        public Boolean f11662F = null;

        /* renamed from: G */
        public Boolean f11663G = null;

        /* renamed from: H */
        public Boolean f11664H = null;

        /* renamed from: I */
        public Boolean f11665I = null;

        /* renamed from: J */
        public EnumSet<DeviceKey> f11666J = null;

        /* renamed from: K */
        public Boolean f11667K = null;

        /* renamed from: L */
        public EnumSet<BrazeSdkMetadata> f11668L = null;

        /* renamed from: M */
        public EnumSet<LocationProviderName> f11669M = null;

        /* renamed from: a */
        public String f11670a = null;

        /* renamed from: b */
        public String f11671b = null;

        /* renamed from: c */
        public String f11672c = null;

        /* renamed from: d */
        public String f11673d = null;

        /* renamed from: e */
        public String f11674e = null;

        /* renamed from: f */
        public String f11675f = null;

        /* renamed from: g */
        public String f11676g = null;

        /* renamed from: h */
        public String f11677h = null;

        /* renamed from: i */
        public String f11678i = null;

        /* renamed from: j */
        public String f11679j = null;

        /* renamed from: k */
        public SdkFlavor f11680k = null;

        /* renamed from: l */
        public Integer f11681l = null;

        /* renamed from: m */
        public Integer f11682m = null;

        /* renamed from: n */
        public Integer f11683n = null;

        /* renamed from: o */
        public Integer f11684o = null;

        /* renamed from: p */
        public Integer f11685p = null;

        /* renamed from: q */
        public Integer f11686q = null;

        /* renamed from: r */
        public Integer f11687r = null;

        /* renamed from: s */
        public Boolean f11688s = null;

        /* renamed from: t */
        public Boolean f11689t = null;

        /* renamed from: u */
        public Boolean f11690u = null;

        /* renamed from: v */
        public Boolean f11691v = null;

        /* renamed from: w */
        public Boolean f11692w = null;

        /* renamed from: x */
        public Boolean f11693x = null;

        /* renamed from: y */
        public Boolean f11694y = null;

        /* renamed from: z */
        public Boolean f11695z = null;

        /* renamed from: a */
        public final void mo15902a(String str) {
            C19383o.m32797g(str, "apiKey");
            if (!C19457k.m33020X0(str)) {
                this.f11670a = str;
                return;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, BrazeConfig$Builder$a.f11529b, 6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5411a)) {
                return false;
            }
            C5411a aVar = (C5411a) obj;
            return C19383o.m32792b(this.f11670a, aVar.f11670a) && C19383o.m32792b(this.f11671b, aVar.f11671b) && C19383o.m32792b(this.f11672c, aVar.f11672c) && C19383o.m32792b(this.f11673d, aVar.f11673d) && C19383o.m32792b(this.f11674e, aVar.f11674e) && C19383o.m32792b(this.f11675f, aVar.f11675f) && C19383o.m32792b(this.f11676g, aVar.f11676g) && C19383o.m32792b(this.f11677h, aVar.f11677h) && C19383o.m32792b(this.f11678i, aVar.f11678i) && C19383o.m32792b(this.f11679j, aVar.f11679j) && this.f11680k == aVar.f11680k && C19383o.m32792b(this.f11681l, aVar.f11681l) && C19383o.m32792b(this.f11682m, aVar.f11682m) && C19383o.m32792b(this.f11683n, aVar.f11683n) && C19383o.m32792b(this.f11684o, aVar.f11684o) && C19383o.m32792b(this.f11685p, aVar.f11685p) && C19383o.m32792b(this.f11686q, aVar.f11686q) && C19383o.m32792b(this.f11687r, aVar.f11687r) && C19383o.m32792b(this.f11688s, aVar.f11688s) && C19383o.m32792b(this.f11689t, aVar.f11689t) && C19383o.m32792b(this.f11690u, aVar.f11690u) && C19383o.m32792b(this.f11691v, aVar.f11691v) && C19383o.m32792b(this.f11692w, aVar.f11692w) && C19383o.m32792b(this.f11693x, aVar.f11693x) && C19383o.m32792b(this.f11694y, aVar.f11694y) && C19383o.m32792b(this.f11695z, aVar.f11695z) && C19383o.m32792b(this.f11657A, aVar.f11657A) && C19383o.m32792b(this.f11658B, aVar.f11658B) && C19383o.m32792b(this.f11659C, aVar.f11659C) && C19383o.m32792b(this.f11660D, aVar.f11660D) && C19383o.m32792b(this.f11661E, aVar.f11661E) && C19383o.m32792b(this.f11662F, aVar.f11662F) && C19383o.m32792b(this.f11663G, aVar.f11663G) && C19383o.m32792b(this.f11664H, aVar.f11664H) && C19383o.m32792b(this.f11665I, aVar.f11665I) && C19383o.m32792b(this.f11666J, aVar.f11666J) && C19383o.m32792b(this.f11667K, aVar.f11667K) && C19383o.m32792b(this.f11668L, aVar.f11668L) && C19383o.m32792b(this.f11669M, aVar.f11669M);
        }

        public final int hashCode() {
            String str = this.f11670a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f11671b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f11672c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f11673d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f11674e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f11675f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f11676g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f11677h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f11678i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f11679j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            SdkFlavor sdkFlavor = this.f11680k;
            int hashCode11 = (hashCode10 + (sdkFlavor == null ? 0 : sdkFlavor.hashCode())) * 31;
            Integer num = this.f11681l;
            int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f11682m;
            int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f11683n;
            int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f11684o;
            int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f11685p;
            int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.f11686q;
            int hashCode17 = (hashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.f11687r;
            int hashCode18 = (hashCode17 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Boolean bool = this.f11688s;
            int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f11689t;
            int hashCode20 = (hashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.f11690u;
            int hashCode21 = (hashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.f11691v;
            int hashCode22 = (hashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.f11692w;
            int hashCode23 = (hashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.f11693x;
            int hashCode24 = (hashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.f11694y;
            int hashCode25 = (hashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.f11695z;
            int hashCode26 = (hashCode25 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.f11657A;
            int hashCode27 = (hashCode26 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.f11658B;
            int hashCode28 = (hashCode27 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.f11659C;
            int hashCode29 = (hashCode28 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.f11660D;
            int hashCode30 = (hashCode29 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Boolean bool13 = this.f11661E;
            int hashCode31 = (hashCode30 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.f11662F;
            int hashCode32 = (hashCode31 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            Boolean bool15 = this.f11663G;
            int hashCode33 = (hashCode32 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.f11664H;
            int hashCode34 = (hashCode33 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            Boolean bool17 = this.f11665I;
            int hashCode35 = (hashCode34 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            EnumSet<DeviceKey> enumSet = this.f11666J;
            int hashCode36 = (hashCode35 + (enumSet == null ? 0 : enumSet.hashCode())) * 31;
            Boolean bool18 = this.f11667K;
            int hashCode37 = (hashCode36 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            EnumSet<BrazeSdkMetadata> enumSet2 = this.f11668L;
            int hashCode38 = (hashCode37 + (enumSet2 == null ? 0 : enumSet2.hashCode())) * 31;
            EnumSet<LocationProviderName> enumSet3 = this.f11669M;
            if (enumSet3 != null) {
                i = enumSet3.hashCode();
            }
            return hashCode38 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Builder(apiKey=");
            h.append(this.f11670a);
            h.append(", serverTarget=");
            h.append(this.f11671b);
            h.append(", smallNotificationIconName=");
            h.append(this.f11672c);
            h.append(", largeNotificationIconName=");
            h.append(this.f11673d);
            h.append(", customEndpoint=");
            h.append(this.f11674e);
            h.append(", defaultNotificationChannelName=");
            h.append(this.f11675f);
            h.append(", defaultNotificationChannelDescription=");
            h.append(this.f11676g);
            h.append(", pushDeepLinkBackStackActivityClassName=");
            h.append(this.f11677h);
            h.append(", firebaseCloudMessagingSenderIdKey=");
            h.append(this.f11678i);
            h.append(", customHtmlWebViewActivityClassName=");
            h.append(this.f11679j);
            h.append(", sdkFlavor=");
            h.append(this.f11680k);
            h.append(", sessionTimeout=");
            h.append(this.f11681l);
            h.append(", defaultNotificationAccentColor=");
            h.append(this.f11682m);
            h.append(", triggerActionMinimumTimeIntervalSeconds=");
            h.append(this.f11683n);
            h.append(", badNetworkInterval=");
            h.append(this.f11684o);
            h.append(", goodNetworkInterval=");
            h.append(this.f11685p);
            h.append(", greatNetworkInterval=");
            h.append(this.f11686q);
            h.append(", inAppMessageWebViewClientMaxOnPageFinishedWaitMs=");
            h.append(this.f11687r);
            h.append(", admMessagingRegistrationEnabled=");
            h.append(this.f11688s);
            h.append(", handlePushDeepLinksAutomatically=");
            h.append(this.f11689t);
            h.append(", isLocationCollectionEnabled=");
            h.append(this.f11690u);
            h.append(", isNewsFeedVisualIndicatorOn=");
            h.append(this.f11691v);
            h.append(", isPushDeepLinkBackStackActivityEnabled=");
            h.append(this.f11692w);
            h.append(", isSessionStartBasedTimeoutEnabled=");
            h.append(this.f11693x);
            h.append(", isFirebaseCloudMessagingRegistrationEnabled=");
            h.append(this.f11694y);
            h.append(", isContentCardsUnreadVisualIndicatorEnabled=");
            h.append(this.f11695z);
            h.append(", isInAppMessageAccessibilityExclusiveModeEnabled=");
            h.append(this.f11657A);
            h.append(", isPushWakeScreenForNotificationEnabled=");
            h.append(this.f11658B);
            h.append(", isPushHtmlRenderingEnabled=");
            h.append(this.f11659C);
            h.append(", isGeofencesEnabled=");
            h.append(this.f11660D);
            h.append(", inAppMessageTestPushEagerDisplayEnabled=");
            h.append(this.f11661E);
            h.append(", automaticGeofenceRequestsEnabled=");
            h.append(this.f11662F);
            h.append(", isFirebaseMessagingServiceOnNewTokenRegistrationEnabled=");
            h.append(this.f11663G);
            h.append(", isTouchModeRequiredForHtmlInAppMessages=");
            h.append(this.f11664H);
            h.append(", isSdkAuthEnabled=");
            h.append(this.f11665I);
            h.append(", deviceObjectAllowlist=");
            h.append(this.f11666J);
            h.append(", isDeviceObjectAllowlistEnabled=");
            h.append(this.f11667K);
            h.append(", brazeSdkMetadata=");
            h.append(this.f11668L);
            h.append(", customLocationProviderNames=");
            h.append(this.f11669M);
            h.append(')');
            return h.toString();
        }
    }

    public C5410a(C5411a aVar) {
        this.f11631a = aVar;
        this.f11632b = aVar.f11670a;
        this.f11633c = aVar.f11671b;
        this.f11634d = aVar.f11672c;
        this.f11635e = aVar.f11673d;
        this.f11636f = aVar.f11674e;
        this.f11637g = aVar.f11675f;
        this.f11638h = aVar.f11676g;
        this.f11639i = aVar.f11677h;
        this.f11640j = aVar.f11678i;
        this.f11641k = aVar.f11679j;
        this.f11642l = aVar.f11680k;
        this.f11643m = aVar.f11681l;
        this.f11644n = aVar.f11682m;
        this.f11645o = aVar.f11683n;
        this.f11646p = aVar.f11684o;
        this.f11647q = aVar.f11685p;
        this.f11648r = aVar.f11686q;
        this.f11649s = aVar.f11687r;
        this.f11650t = aVar.f11688s;
        this.f11651u = aVar.f11689t;
        this.f11652v = aVar.f11690u;
        this.f11653w = aVar.f11691v;
        this.f11654x = aVar.f11692w;
        this.f11655y = aVar.f11693x;
        this.f11656z = aVar.f11694y;
        this.f11617A = aVar.f11695z;
        this.f11618B = aVar.f11657A;
        this.f11619C = aVar.f11658B;
        this.f11620D = aVar.f11659C;
        this.f11621E = aVar.f11660D;
        this.f11622F = aVar.f11661E;
        this.f11623G = aVar.f11662F;
        this.f11624H = aVar.f11663G;
        this.f11625I = aVar.f11665I;
        this.f11626J = aVar.f11664H;
        this.f11627K = aVar.f11666J;
        this.f11628L = aVar.f11667K;
        this.f11629M = aVar.f11669M;
        this.f11630N = aVar.f11668L;
    }

    public final String toString() {
        return this.f11631a.toString();
    }
}
