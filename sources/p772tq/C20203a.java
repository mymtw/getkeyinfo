package p772tq;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.C0114h;
import androidx.compose.p015ui.node.C1742i;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import androidx.work.C3436p;
import com.etsy.android.R;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.FeedbackKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.facebook.appevents.p332ml.ModelManager;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.measurement.internal.C14921a0;
import com.google.android.gms.measurement.internal.C15099u;
import com.google.android.play.core.assetpacks.C15579a0;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.assetpacks.C15653s2;
import com.google.android.play.core.internal.C15686c0;
import com.google.android.play.core.internal.C15702n;
import com.google.android.play.core.internal.C15706r;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.gson.internal.C16790g;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C19736t;
import org.json.JSONException;
import p145io.branch.referral.Branch;
import p145io.branch.referral.C7038g;
import p145io.branch.referral.C7077r;
import p145io.branch.referral.Defines$Jsonkey;
import p145io.branch.referral.Defines$PreinstallKey;
import p309ad.C8508d;
import p318bg.C8557e;
import p343ee.C12693a;
import p365hg.C12869i0;
import p401mg.C13080a;
import p453tf.C13418j;
import p649pm.C18400e;
import p649pm.C18415r;
import p715xn.C18822c;

/* renamed from: tq.a */
public final class C20203a implements C8508d, C15686c0, C15702n, C18822c, C15579a0, C15706r, C16790g, C12693a, C18400e, FeatureManager.C12256a {

    /* renamed from: b */
    public static final int f44772b = 10;

    /* renamed from: c */
    public static final int f44773c = 5;

    /* renamed from: d */
    public static int f44774d;

    /* renamed from: e */
    public static final int[] f44775e = {R.attr.com_facebook_confirm_logout, R.attr.com_facebook_login_button_radius, R.attr.com_facebook_login_button_transparency, R.attr.com_facebook_login_text, R.attr.com_facebook_logout_text, R.attr.com_facebook_tooltip_mode};

    /* renamed from: f */
    public static final int[] f44776f = {R.attr.com_facebook_is_cropped, R.attr.com_facebook_preset_size};

    /* renamed from: g */
    public static final /* synthetic */ C20203a f44777g = new C20203a();

    /* renamed from: h */
    public static final C19736t f44778h = new C19736t("NULL");

    /* renamed from: i */
    public static final C19736t f44779i = new C19736t("UNINITIALIZED");

    /* renamed from: j */
    public static final C19736t f44780j = new C19736t("DONE");

    /* renamed from: k */
    public static final /* synthetic */ C20203a f44781k = new C20203a();

    /* renamed from: l */
    public static final int[] f44782l = {-1, -1, 0, -1, -1, -1, -1, -2};

    /* renamed from: m */
    public static final int[] f44783m = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    /* renamed from: n */
    public static final int[] f44784n = {-4553, -2, -1, -1, -1, -1};

    /* renamed from: o */
    public static final int[] f44785o = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* renamed from: p */
    public static final int[] f44786p = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    /* renamed from: q */
    public static final C20203a f44787q = new C20203a();

    /* renamed from: r */
    public static final int[] f44788r = {16842960, R.attr.destination, R.attr.enterAnim, R.attr.exitAnim, R.attr.launchSingleTop, R.attr.popEnterAnim, R.attr.popExitAnim, R.attr.popUpTo, R.attr.popUpToInclusive};

    /* renamed from: s */
    public static final int[] f44789s = {16842755, 16843245, R.attr.argType, R.attr.nullable};

    /* renamed from: t */
    public static final int[] f44790t = {16844014, R.attr.action, R.attr.mimeType, R.attr.uri};

    /* renamed from: u */
    public static final int[] f44791u = {R.attr.startDestination};

    /* renamed from: v */
    public static final int[] f44792v = {16842753, 16842960};

    /* renamed from: w */
    public static final int[] f44793w = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};

    public /* synthetic */ C20203a() {
    }

    public /* synthetic */ C20203a(int i) {
    }

    /* renamed from: A */
    public static void m34518A() {
        int i = f44774d;
        if (i > 0) {
            f44774d = i - 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045 A[Catch:{ JSONException -> 0x0004 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0004 A[SYNTHETIC] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m34519B(org.json.JSONObject r8, p145io.branch.referral.Branch r9, android.content.Context r10) {
        /*
            java.util.Iterator r0 = r8.keys()
        L_0x0004:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0109
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "apps"
            boolean r2 = r1.equals(r2)     // Catch:{ JSONException -> 0x0004 }
            if (r2 == 0) goto L_0x0004
            java.lang.Object r2 = r8.get(r1)     // Catch:{ JSONException -> 0x0004 }
            boolean r2 = r2 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0004 }
            if (r2 == 0) goto L_0x0004
            org.json.JSONObject r2 = r8.getJSONObject(r1)     // Catch:{ JSONException -> 0x0004 }
            r3 = 0
            java.lang.String r4 = "Error obtaining PackageName"
            java.lang.String r5 = ""
            if (r10 == 0) goto L_0x003e
            android.content.pm.PackageManager r6 = r10.getPackageManager()     // Catch:{ Exception -> 0x003a }
            java.lang.String r7 = r10.getPackageName()     // Catch:{ Exception -> 0x003a }
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r3)     // Catch:{ Exception -> 0x003a }
            java.lang.String r6 = r6.packageName     // Catch:{ Exception -> 0x003a }
            goto L_0x003f
        L_0x003a:
            r6 = move-exception
            p145io.branch.referral.C7077r.m13676b(r4, r6)     // Catch:{ JSONException -> 0x0004 }
        L_0x003e:
            r6 = r5
        L_0x003f:
            java.lang.Object r2 = r2.get(r6)     // Catch:{ JSONException -> 0x0004 }
            if (r2 == 0) goto L_0x0004
            org.json.JSONObject r1 = r8.getJSONObject(r1)     // Catch:{ JSONException -> 0x0004 }
            if (r10 == 0) goto L_0x005e
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch:{ Exception -> 0x005a }
            java.lang.String r6 = r10.getPackageName()     // Catch:{ Exception -> 0x005a }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r6, r3)     // Catch:{ Exception -> 0x005a }
            java.lang.String r5 = r2.packageName     // Catch:{ Exception -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r2 = move-exception
            p145io.branch.referral.C7077r.m13676b(r4, r2)     // Catch:{ JSONException -> 0x0004 }
        L_0x005e:
            org.json.JSONObject r1 = r1.getJSONObject(r5)     // Catch:{ JSONException -> 0x0004 }
            java.util.Iterator r2 = r1.keys()     // Catch:{ JSONException -> 0x0004 }
        L_0x0066:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x0004 }
            if (r3 == 0) goto L_0x0004
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x0004 }
            io.branch.referral.Defines$PreinstallKey r4 = p145io.branch.referral.Defines$PreinstallKey.campaign     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r5 = r4.getKey()     // Catch:{ JSONException -> 0x0004 }
            boolean r5 = r3.equals(r5)     // Catch:{ JSONException -> 0x0004 }
            if (r5 == 0) goto L_0x00ad
            io.branch.referral.r r5 = p145io.branch.referral.C7077r.m13677h(r10)     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r6 = r4.getKey()     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r5 = r5.mo19318g(r6)     // Catch:{ JSONException -> 0x0004 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0004 }
            if (r5 == 0) goto L_0x00ad
            java.lang.Object r3 = r1.get(r3)     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0004 }
            r9.getClass()     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x0004 }
            io.branch.referral.r r5 = r9.f15576b     // Catch:{ JSONException -> 0x0004 }
            r5.getClass()     // Catch:{ JSONException -> 0x0004 }
            if (r4 != 0) goto L_0x00a7
            goto L_0x0066
        L_0x00a7:
            org.json.JSONObject r5 = r5.f15760d     // Catch:{ JSONException -> 0x0066 }
            r5.putOpt(r4, r3)     // Catch:{ JSONException -> 0x0066 }
            goto L_0x0066
        L_0x00ad:
            io.branch.referral.Defines$PreinstallKey r4 = p145io.branch.referral.Defines$PreinstallKey.partner     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r5 = r4.getKey()     // Catch:{ JSONException -> 0x0004 }
            boolean r5 = r3.equals(r5)     // Catch:{ JSONException -> 0x0004 }
            if (r5 == 0) goto L_0x00e9
            io.branch.referral.r r5 = p145io.branch.referral.C7077r.m13677h(r10)     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r6 = r4.getKey()     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r5 = r5.mo19318g(r6)     // Catch:{ JSONException -> 0x0004 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0004 }
            if (r5 == 0) goto L_0x00e9
            java.lang.Object r3 = r1.get(r3)     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0004 }
            r9.getClass()     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x0004 }
            io.branch.referral.r r5 = r9.f15576b     // Catch:{ JSONException -> 0x0004 }
            r5.getClass()     // Catch:{ JSONException -> 0x0004 }
            if (r4 != 0) goto L_0x00e2
            goto L_0x0066
        L_0x00e2:
            org.json.JSONObject r5 = r5.f15760d     // Catch:{ JSONException -> 0x0066 }
            r5.putOpt(r4, r3)     // Catch:{ JSONException -> 0x0066 }
            goto L_0x0066
        L_0x00e9:
            java.lang.Object r4 = r1.get(r3)     // Catch:{ JSONException -> 0x0004 }
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x0004 }
            io.branch.referral.r r5 = r9.f15576b     // Catch:{ JSONException -> 0x0004 }
            org.json.JSONObject r6 = r5.f15759c     // Catch:{ JSONException -> 0x0004 }
            boolean r6 = r6.has(r3)     // Catch:{ JSONException -> 0x0004 }
            if (r6 == 0) goto L_0x0102
            if (r4 != 0) goto L_0x0102
            org.json.JSONObject r6 = r5.f15759c     // Catch:{ JSONException -> 0x0004 }
            r6.remove(r3)     // Catch:{ JSONException -> 0x0004 }
        L_0x0102:
            org.json.JSONObject r5 = r5.f15759c     // Catch:{ JSONException -> 0x0066 }
            r5.put(r3, r4)     // Catch:{ JSONException -> 0x0066 }
            goto L_0x0066
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p772tq.C20203a.m34519B(org.json.JSONObject, io.branch.referral.Branch, android.content.Context):void");
    }

    /* renamed from: C */
    public static void m34520C(Branch branch, Context context) {
        if (branch != null) {
            String str = null;
            try {
                str = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"io.branch.preinstall.apps.path"});
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                new Thread(new C7038g(str, branch, context)).start();
            }
        }
    }

    /* renamed from: D */
    public static final boolean m34521D(C1742i[] iVarArr, int i) {
        return iVarArr[i] != null;
    }

    /* renamed from: E */
    public static void m34522E(Context context, HashMap hashMap) {
        Branch j = Branch.m13575j();
        C7077r h = C7077r.m13677h(context);
        if (TextUtils.isEmpty(h.mo19318g(Defines$PreinstallKey.partner.getKey()))) {
            Defines$PreinstallKey defines$PreinstallKey = Defines$PreinstallKey.campaign;
            if (TextUtils.isEmpty(h.mo19318g(defines$PreinstallKey.getKey()))) {
                Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.UTMCampaign;
                if (!TextUtils.isEmpty((CharSequence) hashMap.get(defines$Jsonkey.getKey()))) {
                    String str = (String) hashMap.get(defines$Jsonkey.getKey());
                    j.getClass();
                    String key = defines$PreinstallKey.getKey();
                    C7077r rVar = j.f15576b;
                    rVar.getClass();
                    if (key != null) {
                        try {
                            rVar.f15760d.putOpt(key, str);
                        } catch (JSONException unused) {
                        }
                    }
                }
                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.UTMMedium;
                if (!TextUtils.isEmpty((CharSequence) hashMap.get(defines$Jsonkey2.getKey()))) {
                    String str2 = (String) hashMap.get(defines$Jsonkey2.getKey());
                    j.getClass();
                    String key2 = Defines$PreinstallKey.partner.getKey();
                    C7077r rVar2 = j.f15576b;
                    rVar2.getClass();
                    if (key2 != null) {
                        try {
                            rVar2.f15760d.putOpt(key2, str2);
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public static String m34523F(int i) {
        boolean z = false;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Characters";
        }
        if (i == 2) {
            return "Words";
        }
        if (i == 3) {
            z = true;
        }
        return z ? "Sentences" : "Invalid";
    }

    /* renamed from: G */
    public static final boolean m34524G() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: c */
    public static void m34525c(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & UnsignedInteger.INT_MASK;
            long j3 = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & UnsignedInteger.INT_MASK);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = ((((long) iArr[2]) & UnsignedInteger.INT_MASK) - j2) + j4;
            iArr[2] = (int) j6;
            long j7 = (((long) iArr[3]) & UnsignedInteger.INT_MASK) + j2 + (j6 >> 32);
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & UnsignedInteger.INT_MASK);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & UnsignedInteger.INT_MASK);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (((long) iArr[6]) & UnsignedInteger.INT_MASK);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = (UnsignedInteger.INT_MASK & ((long) iArr[7])) + j2 + j8;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && C3436p.m8227A(iArr, f44782l))) {
            m34527h(iArr);
        }
    }

    /* renamed from: g */
    public static void m34526g(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        C3436p.m8232F(iArr, iArr3);
        while (true) {
            m34532t(iArr3, iArr2);
            i--;
            if (i > 0) {
                C3436p.m8232F(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public static void m34527h(int[] iArr) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & UnsignedInteger.INT_MASK);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = ((((long) iArr[2]) & UnsignedInteger.INT_MASK) - 1) + j2;
        iArr[2] = (int) j4;
        long j5 = (((long) iArr[3]) & UnsignedInteger.INT_MASK) + 1 + (j4 >> 32);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & UnsignedInteger.INT_MASK);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & UnsignedInteger.INT_MASK);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & UnsignedInteger.INT_MASK);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) ((UnsignedInteger.INT_MASK & ((long) iArr[7])) + 1 + j6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (r14 == 0) goto L_0x0040;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m34528p(int r14, int[] r15) {
        /*
            r0 = 6
            r1 = 4553(0x11c9, float:6.38E-42)
            if (r14 == 0) goto L_0x0040
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r14
            long r6 = r6 & r4
            long r2 = r2 * r6
            r14 = 0
            r8 = r15[r14]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r2 = r2 + r8
            r8 = 0
            long r2 = r2 + r8
            int r10 = (int) r2
            r15[r14] = r10
            r10 = 32
            long r2 = r2 >>> r10
            r11 = 1
            r12 = r15[r11]
            long r12 = (long) r12
            long r12 = r12 & r4
            long r6 = r6 + r12
            long r6 = r6 + r2
            int r2 = (int) r6
            r15[r11] = r2
            long r2 = r6 >>> r10
            r6 = 2
            r7 = r15[r6]
            long r11 = (long) r7
            long r4 = r4 & r11
            long r2 = r2 + r4
            int r4 = (int) r2
            r15[r6] = r4
            long r2 = r2 >>> r10
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            r14 = 3
            int r14 = androidx.datastore.preferences.protobuf.C2606m.m6155u(r0, r15, r14)
        L_0x003e:
            if (r14 != 0) goto L_0x004e
        L_0x0040:
            r14 = 5
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0051
            int[] r14 = f44784n
            boolean r14 = androidx.preference.C3039b.m7152V(r15, r14)
            if (r14 == 0) goto L_0x0051
        L_0x004e:
            androidx.datastore.preferences.protobuf.C2606m.m6143i(r0, r1, r15)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p772tq.C20203a.m34528p(int, int[]):void");
    }

    /* renamed from: q */
    public static void m34529q(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        C3039b.m7165g0(iArr, iArr3);
        while (true) {
            m34533u(iArr3, iArr2);
            i--;
            if (i > 0) {
                C3039b.m7165g0(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    public static void m34530r(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        C3436p.m8230D(iArr, iArr2, iArr4);
        m34532t(iArr4, iArr3);
    }

    /* renamed from: s */
    public static void m34531s(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        C3039b.m7163f0(iArr, iArr2, iArr4);
        m34533u(iArr4, iArr3);
    }

    /* renamed from: t */
    public static void m34532t(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[8]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[9]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr[10]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr[11]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr[12]) & UnsignedInteger.INT_MASK;
        long j6 = ((long) iArr[13]) & UnsignedInteger.INT_MASK;
        long j7 = ((long) iArr[14]) & UnsignedInteger.INT_MASK;
        long j8 = ((long) iArr[15]) & UnsignedInteger.INT_MASK;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = j10 + (j8 << 1);
        long j12 = j + j2 + j10;
        long j13 = j9 + j5 + j8 + j12;
        long j14 = j5;
        long j15 = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + j13 + j6 + j7 + j8 + 0;
        iArr3[0] = (int) j15;
        long j16 = j4;
        long j17 = (((((long) iArr[1]) & UnsignedInteger.INT_MASK) + j13) - j) + j7 + j8 + (j15 >> 32);
        iArr3[1] = (int) j17;
        long j18 = ((((long) iArr[2]) & UnsignedInteger.INT_MASK) - j12) + (j17 >> 32);
        iArr3[2] = (int) j18;
        long j19 = ((((((long) iArr[3]) & UnsignedInteger.INT_MASK) + j13) - j2) - j3) + j6 + (j18 >> 32);
        iArr3[3] = (int) j19;
        long j20 = ((((((long) iArr[4]) & UnsignedInteger.INT_MASK) + j13) - j9) - j) + j7 + (j19 >> 32);
        iArr3[4] = (int) j20;
        long j21 = (((long) iArr[5]) & UnsignedInteger.INT_MASK) + j11 + j3 + (j20 >> 32);
        iArr3[5] = (int) j21;
        long j22 = (((long) iArr[6]) & UnsignedInteger.INT_MASK) + j16 + j7 + j8 + (j21 >> 32);
        iArr3[6] = (int) j22;
        long j23 = (UnsignedInteger.INT_MASK & ((long) iArr[7])) + j13 + j11 + j14 + (j22 >> 32);
        iArr3[7] = (int) j23;
        m34525c((int) (j23 >> 32), iArr3);
    }

    /* renamed from: u */
    public static void m34533u(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) 4553) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[6]) & UnsignedInteger.INT_MASK;
        long j3 = (j * j2) + (((long) iArr[0]) & UnsignedInteger.INT_MASK) + 0;
        int i = (int) j3;
        iArr3[0] = i;
        long j4 = ((long) iArr[7]) & UnsignedInteger.INT_MASK;
        long j5 = (j * j4) + j2 + (((long) iArr[1]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr3[1] = i2;
        long j6 = ((long) iArr[8]) & UnsignedInteger.INT_MASK;
        long j7 = (j * j6) + j4 + (((long) iArr[2]) & UnsignedInteger.INT_MASK) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr3[2] = i3;
        long j8 = ((long) iArr[9]) & UnsignedInteger.INT_MASK;
        long j9 = j;
        long j10 = (j * j8) + j6 + (((long) iArr[3]) & UnsignedInteger.INT_MASK) + (j7 >>> 32);
        int i4 = (int) j10;
        iArr3[3] = i4;
        long j11 = ((long) iArr[10]) & UnsignedInteger.INT_MASK;
        long j12 = (j9 * j11) + j8 + (((long) iArr[4]) & UnsignedInteger.INT_MASK) + (j10 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = ((long) iArr[11]) & UnsignedInteger.INT_MASK;
        long j14 = (j9 * j13) + j11 + (((long) iArr[5]) & UnsignedInteger.INT_MASK) + (j12 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (j14 >>> 32) + j13;
        long j16 = j15 & UnsignedInteger.INT_MASK;
        long j17 = (j9 * j16) + (((long) i) & UnsignedInteger.INT_MASK) + 0;
        iArr3[0] = (int) j17;
        long j18 = j15 >>> 32;
        long j19 = (j9 * j18) + j16 + (((long) i2) & UnsignedInteger.INT_MASK) + (j17 >>> 32);
        iArr3[1] = (int) j19;
        long j20 = j18 + (((long) i3) & UnsignedInteger.INT_MASK) + (j19 >>> 32);
        iArr3[2] = (int) j20;
        long j21 = (j20 >>> 32) + (((long) i4) & UnsignedInteger.INT_MASK);
        iArr3[3] = (int) j21;
        if (((j21 >>> 32) == 0 ? 0 : C2606m.m6155u(6, iArr3, 4)) != 0 || (iArr3[5] == -1 && C3039b.m7152V(iArr3, f44784n))) {
            C2606m.m6143i(6, 4553, iArr3);
        }
    }

    /* renamed from: v */
    public static void m34534v(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        C3436p.m8232F(iArr, iArr3);
        m34532t(iArr3, iArr2);
    }

    /* renamed from: w */
    public static void m34535w(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C3436p.m8238L(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & UnsignedInteger.INT_MASK) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & UnsignedInteger.INT_MASK);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = (((long) iArr3[2]) & UnsignedInteger.INT_MASK) + 1 + j2;
            iArr3[2] = (int) j4;
            long j5 = ((((long) iArr3[3]) & UnsignedInteger.INT_MASK) - 1) + (j4 >> 32);
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (((long) iArr3[4]) & UnsignedInteger.INT_MASK);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (((long) iArr3[5]) & UnsignedInteger.INT_MASK);
                iArr3[5] = (int) j8;
                long j9 = (j8 >> 32) + (((long) iArr3[6]) & UnsignedInteger.INT_MASK);
                iArr3[6] = (int) j9;
                j6 = j9 >> 32;
            }
            iArr3[7] = (int) (((UnsignedInteger.INT_MASK & ((long) iArr3[7])) - 1) + j6);
        }
    }

    /* renamed from: x */
    public static void m34536x(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        C3039b.m7165g0(iArr, iArr3);
        m34533u(iArr3, iArr2);
    }

    /* renamed from: y */
    public static void m34537y(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C3039b.m7180p0(iArr, iArr2, iArr3) != 0) {
            C2606m.m6117L(6, 4553, iArr3);
        }
    }

    /* renamed from: z */
    public static String m34538z(StringBuilder sb) {
        char c = 0;
        int length = sb.length() - 0;
        if (length != 0) {
            char charAt = sb.charAt(0);
            char charAt2 = length >= 2 ? sb.charAt(1) : 0;
            char charAt3 = length >= 3 ? sb.charAt(2) : 0;
            if (length >= 4) {
                c = sb.charAt(3);
            }
            int i = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i >> 8) & 255);
            char c3 = (char) (i & 255);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append((char) ((i >> 16) & 255));
            if (length >= 2) {
                sb2.append(c2);
            }
            if (length >= 3) {
                sb2.append(c3);
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        throw null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45793a(p715xn.C18823d r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            boolean r1 = r11.mo70270c()
            r2 = 1
            r3 = 0
            r4 = 4
            r5 = 0
            if (r1 == 0) goto L_0x0055
            char r1 = r11.mo70269b()
            r6 = 32
            if (r1 < r6) goto L_0x001f
            r6 = 63
            if (r1 > r6) goto L_0x001f
            r0.append(r1)
            goto L_0x002d
        L_0x001f:
            r6 = 64
            if (r1 < r6) goto L_0x0051
            r6 = 94
            if (r1 > r6) goto L_0x0051
            int r1 = r1 + -64
            char r1 = (char) r1
            r0.append(r1)
        L_0x002d:
            int r1 = r11.f41678f
            int r1 = r1 + r2
            r11.f41678f = r1
            int r1 = r0.length()
            if (r1 < r4) goto L_0x0005
            java.lang.String r1 = m34538z(r0)
            java.lang.StringBuilder r6 = r11.f41677e
            r6.append(r1)
            r0.delete(r3, r4)
            java.lang.String r1 = r11.f41673a
            int r6 = r11.f41678f
            int r1 = androidx.compose.foundation.layout.C0761x.m1745t0(r6, r4, r1)
            if (r1 == r4) goto L_0x0005
            r11.f41679g = r3
            goto L_0x0055
        L_0x0051:
            androidx.compose.foundation.layout.C0761x.m1725h0(r1)
            throw r5
        L_0x0055:
            r1 = 31
            r0.append(r1)
            int r1 = r0.length()     // Catch:{ all -> 0x00ea }
            if (r1 != 0) goto L_0x0064
            r11.f41679g = r3
            goto L_0x00e1
        L_0x0064:
            r6 = 2
            if (r1 != r2) goto L_0x009b
            int r7 = r11.mo70268a()     // Catch:{ all -> 0x00ea }
            r11.mo70271d(r7)     // Catch:{ all -> 0x00ea }
            xn.f r7 = r11.f41680h     // Catch:{ all -> 0x00ea }
            int r7 = r7.f41688b     // Catch:{ all -> 0x00ea }
            int r8 = r11.mo70268a()     // Catch:{ all -> 0x00ea }
            int r7 = r7 - r8
            java.lang.String r8 = r11.f41673a     // Catch:{ all -> 0x00ea }
            int r8 = r8.length()     // Catch:{ all -> 0x00ea }
            int r9 = r11.f41681i     // Catch:{ all -> 0x00ea }
            int r8 = r8 - r9
            int r9 = r11.f41678f     // Catch:{ all -> 0x00ea }
            int r8 = r8 - r9
            if (r8 <= r7) goto L_0x0096
            int r7 = r11.mo70268a()     // Catch:{ all -> 0x00ea }
            int r7 = r7 + r2
            r11.mo70271d(r7)     // Catch:{ all -> 0x00ea }
            xn.f r7 = r11.f41680h     // Catch:{ all -> 0x00ea }
            int r7 = r7.f41688b     // Catch:{ all -> 0x00ea }
            int r9 = r11.mo70268a()     // Catch:{ all -> 0x00ea }
            int r7 = r7 - r9
        L_0x0096:
            if (r8 > r7) goto L_0x009b
            if (r7 > r6) goto L_0x009b
            goto L_0x00df
        L_0x009b:
            if (r1 > r4) goto L_0x00e2
            int r1 = r1 - r2
            java.lang.String r0 = m34538z(r0)     // Catch:{ all -> 0x00ea }
            boolean r4 = r11.mo70270c()     // Catch:{ all -> 0x00ea }
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x00ac
            if (r1 > r6) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r2 = r3
        L_0x00ad:
            if (r1 > r6) goto L_0x00d0
            int r4 = r11.mo70268a()     // Catch:{ all -> 0x00ea }
            int r4 = r4 + r1
            r11.mo70271d(r4)     // Catch:{ all -> 0x00ea }
            xn.f r4 = r11.f41680h     // Catch:{ all -> 0x00ea }
            int r4 = r4.f41688b     // Catch:{ all -> 0x00ea }
            int r6 = r11.mo70268a()     // Catch:{ all -> 0x00ea }
            int r4 = r4 - r6
            r6 = 3
            if (r4 < r6) goto L_0x00d0
            int r2 = r11.mo70268a()     // Catch:{ all -> 0x00ea }
            int r4 = r0.length()     // Catch:{ all -> 0x00ea }
            int r2 = r2 + r4
            r11.mo70271d(r2)     // Catch:{ all -> 0x00ea }
            r2 = r3
        L_0x00d0:
            if (r2 == 0) goto L_0x00da
            r11.f41680h = r5     // Catch:{ all -> 0x00ea }
            int r0 = r11.f41678f     // Catch:{ all -> 0x00ea }
            int r0 = r0 - r1
            r11.f41678f = r0     // Catch:{ all -> 0x00ea }
            goto L_0x00df
        L_0x00da:
            java.lang.StringBuilder r1 = r11.f41677e     // Catch:{ all -> 0x00ea }
            r1.append(r0)     // Catch:{ all -> 0x00ea }
        L_0x00df:
            r11.f41679g = r3
        L_0x00e1:
            return
        L_0x00e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = "Count must not exceed 4"
            r0.<init>(r1)     // Catch:{ all -> 0x00ea }
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            r11.f41679g = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p772tq.C20203a.mo45793a(xn.d):void");
    }

    /* renamed from: b */
    public Object[] mo4157b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        return (Object[]) C19382n.m32720L0(obj, "makePathElements", Object[].class, List.class, arrayList);
    }

    /* renamed from: d */
    public boolean mo4158d(ClassLoader classLoader, File file, File file2, boolean z) {
        return C15099u.m24634g(classLoader, file, file2, z, new C0114h(), ResponseConstants.PATH, new C1993m());
    }

    /* renamed from: e */
    public void mo4159e(ClassLoader classLoader, HashSet hashSet) {
        C14921a0.m24234a(classLoader, hashSet, new C20203a());
    }

    /* renamed from: f */
    public Object mo56f(C18415r rVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(rVar);
    }

    /* renamed from: i */
    public Object mo1134i() {
        return new ConcurrentSkipListMap();
    }

    /* renamed from: j */
    public int mo21047j() {
        return R.string.shipping_postal_code_hint;
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        FragmentNavigationKey fragmentNavigationKey2 = fragmentNavigationKey;
        C19383o.m32797g(fragmentNavigationKey2, "key");
        ArrayList arrayList = new ArrayList();
        if (fragmentNavigationKey2 instanceof FeedbackKey) {
            if (!z) {
                arrayList.add(new HomePagerKey(fragmentNavigationKey.getReferrer(), (Bundle) null, false, 6, (DefaultConstructorMarker) null));
                arrayList.add(new ShopHomeKey(fragmentNavigationKey.getReferrer(), ((FeedbackKey) fragmentNavigationKey2).getShopId(), (ShopHomeConfig) null, (Map) null, (String) null, (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 1020, (DefaultConstructorMarker) null));
            }
            arrayList.add(fragmentNavigationKey2);
            return arrayList;
        }
        throw new UnsupportedNavigationException("Invalid key " + fragmentNavigationKey2 + " provided to " + this);
    }

    /* renamed from: l */
    public int mo21048l() {
        return 4097;
    }

    /* renamed from: m */
    public int mo7682m(int i, String str) {
        return i;
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        if (z) {
            ConcurrentHashMap concurrentHashMap = ModelManager.f27307a;
            Class<ModelManager> cls = ModelManager.class;
            if (!C13080a.m20762b(cls)) {
                try {
                    C8557e eVar = C8557e.f18640b;
                    int i = C12869i0.f28368a;
                    try {
                        C13418j.m21108d().execute(eVar);
                    } catch (Exception unused) {
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
        }
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_home;
    }

    public /* synthetic */ Object zza() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C15653s2.f35332b);
        C15588c1.m25311V0(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
