package p145io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import androidx.browser.customtabs.CustomTabsService;
import androidx.preference.C3039b;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.paypal.pyplcheckout.utils.BrowserPackages;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.C7039g0;
import p145io.branch.referral.C7046j0;
import p145io.branch.referral.C7050l;
import p145io.branch.referral.C7056m0;
import p145io.branch.referral.C7063o;
import p145io.branch.referral.C7070p0;
import p145io.branch.referral.C7074q0;
import p145io.branch.referral.ServerRequest;
import p145io.branch.referral.network.C7062a;
import p250u0.C8077a;
import p772tq.C20203a;

/* renamed from: io.branch.referral.Branch */
public final class Branch implements C7063o.C7066c, C7074q0.C7075a, C7039g0.C7040a, C7046j0.C7047a, C7056m0.C7057a, C7070p0.C7071a {

    /* renamed from: A */
    public static Branch f15568A = null;

    /* renamed from: B */
    public static String f15569B = "app.link";

    /* renamed from: C */
    public static final String[] f15570C = {"extra_launch_uri", "branch_intent"};

    /* renamed from: w */
    public static final String f15571w = "!SDK-VERSION-STRING!:io.branch.sdk.android:library:5.2.2";

    /* renamed from: x */
    public static boolean f15572x = false;

    /* renamed from: y */
    public static boolean f15573y = false;

    /* renamed from: z */
    public static boolean f15574z = true;

    /* renamed from: a */
    public C7062a f15575a;

    /* renamed from: b */
    public final C7077r f15576b;

    /* renamed from: c */
    public final C7072q f15577c;

    /* renamed from: d */
    public final Context f15578d;

    /* renamed from: e */
    public final Semaphore f15579e = new Semaphore(1);

    /* renamed from: f */
    public final C7089y f15580f;

    /* renamed from: g */
    public int f15581g = 0;

    /* renamed from: h */
    public final ConcurrentHashMap<C7034e, String> f15582h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public INTENT_STATE f15583i = INTENT_STATE.PENDING;

    /* renamed from: j */
    public SESSION_STATE f15584j = SESSION_STATE.UNINITIALISED;

    /* renamed from: k */
    public boolean f15585k = false;

    /* renamed from: l */
    public WeakReference<Activity> f15586l;

    /* renamed from: m */
    public final ConcurrentHashMap<String, String> f15587m = new ConcurrentHashMap<>();

    /* renamed from: n */
    public boolean f15588n = false;

    /* renamed from: o */
    public boolean f15589o = false;

    /* renamed from: p */
    public boolean f15590p = false;

    /* renamed from: q */
    public boolean f15591q = false;

    /* renamed from: r */
    public boolean f15592r = false;

    /* renamed from: s */
    public boolean f15593s = false;

    /* renamed from: t */
    public boolean f15594t = false;

    /* renamed from: u */
    public C7030c f15595u;

    /* renamed from: v */
    public final C7078r0 f15596v;

    /* renamed from: io.branch.referral.Branch$CreditHistoryOrder */
    public enum CreditHistoryOrder {
        kMostRecentFirst,
        kLeastRecentFirst
    }

    /* renamed from: io.branch.referral.Branch$INTENT_STATE */
    public enum INTENT_STATE {
        PENDING,
        READY
    }

    /* renamed from: io.branch.referral.Branch$SESSION_STATE */
    public enum SESSION_STATE {
        INITIALISED,
        INITIALISING,
        UNINITIALISED
    }

    /* renamed from: io.branch.referral.Branch$a */
    public class C7011a implements C7050l.C7053c {
        public C7011a() {
        }
    }

    /* renamed from: io.branch.referral.Branch$b */
    public interface C7012b {
    }

    /* renamed from: io.branch.referral.Branch$c */
    public interface C7013c {
        /* renamed from: a */
        void mo19208a(String str, String str2, C7032d dVar);
    }

    /* renamed from: io.branch.referral.Branch$d */
    public class C7014d extends BranchAsyncTask<Void, Void, C7031c0> {

        /* renamed from: a */
        public ServerRequest f15598a;

        /* renamed from: b */
        public final CountDownLatch f15599b;

        /* renamed from: io.branch.referral.Branch$d$a */
        public class C7015a implements Runnable {
            public C7015a() {
            }

            public final void run() {
                Branch.this.mo19203t();
            }
        }

        public C7014d(ServerRequest serverRequest, CountDownLatch countDownLatch) {
            this.f15598a = serverRequest;
            this.f15599b = countDownLatch;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x0243  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0245  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x0262  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x0268  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x017f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo19209a(p145io.branch.referral.C7031c0 r9) {
            /*
                r8 = this;
                java.util.concurrent.CountDownLatch r0 = r8.f15599b
                if (r0 == 0) goto L_0x0007
                r0.countDown()
            L_0x0007:
                if (r9 != 0) goto L_0x0013
                io.branch.referral.ServerRequest r9 = r8.f15598a
                r0 = -116(0xffffffffffffff8c, float:NaN)
                java.lang.String r1 = "Null response."
                r9.mo19248g(r0, r1)
                return
            L_0x0013:
                int r0 = r9.f15640a
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x01bc
                org.json.JSONObject r0 = r9.mo19274a()
                if (r0 != 0) goto L_0x002a
                io.branch.referral.ServerRequest r1 = r8.f15598a
                r4 = 500(0x1f4, float:7.0E-43)
                java.lang.String r5 = "Null response json."
                r1.mo19248g(r4, r5)
            L_0x002a:
                io.branch.referral.ServerRequest r1 = r8.f15598a
                boolean r4 = r1 instanceof p145io.branch.referral.C7082t
                if (r4 == 0) goto L_0x0049
                if (r0 == 0) goto L_0x0049
                io.branch.referral.t r1 = (p145io.branch.referral.C7082t) r1     // Catch:{ JSONException -> 0x0044 }
                io.branch.referral.e r1 = r1.f15769j     // Catch:{ JSONException -> 0x0044 }
                java.lang.String r4 = "url"
                java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x0044 }
                io.branch.referral.Branch r5 = p145io.branch.referral.Branch.this     // Catch:{ JSONException -> 0x0044 }
                java.util.concurrent.ConcurrentHashMap<io.branch.referral.e, java.lang.String> r5 = r5.f15582h     // Catch:{ JSONException -> 0x0044 }
                r5.put(r1, r4)     // Catch:{ JSONException -> 0x0044 }
                goto L_0x006d
            L_0x0044:
                r1 = move-exception
                r1.printStackTrace()
                goto L_0x006d
            L_0x0049:
                boolean r1 = r1 instanceof p145io.branch.referral.C7088x
                if (r1 == 0) goto L_0x006d
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this
                java.util.concurrent.ConcurrentHashMap<io.branch.referral.e, java.lang.String> r1 = r1.f15582h
                r1.clear()
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this
                io.branch.referral.y r1 = r1.f15580f
                r1.getClass()
                java.lang.Object r4 = p145io.branch.referral.C7089y.f15776e
                monitor-enter(r4)
                java.util.List<io.branch.referral.ServerRequest> r5 = r1.f15779c     // Catch:{ UnsupportedOperationException -> 0x0069 }
                r5.clear()     // Catch:{ UnsupportedOperationException -> 0x0069 }
                r1.mo19388b()     // Catch:{ UnsupportedOperationException -> 0x0069 }
                goto L_0x0069
            L_0x0067:
                r9 = move-exception
                goto L_0x006b
            L_0x0069:
                monitor-exit(r4)     // Catch:{ all -> 0x0067 }
                goto L_0x006d
            L_0x006b:
                monitor-exit(r4)     // Catch:{ all -> 0x0067 }
                throw r9
            L_0x006d:
                io.branch.referral.ServerRequest r1 = r8.f15598a
                boolean r4 = r1 instanceof p145io.branch.referral.C7087w
                if (r4 != 0) goto L_0x0077
                boolean r1 = r1 instanceof p145io.branch.referral.C7086v
                if (r1 == 0) goto L_0x018e
            L_0x0077:
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this
                io.branch.referral.r0 r1 = r1.f15596v
                boolean r1 = r1.f15762a
                if (r1 != 0) goto L_0x00fe
                if (r0 == 0) goto L_0x00fe
                io.branch.referral.Defines$Jsonkey r1 = p145io.branch.referral.Defines$Jsonkey.SessionID     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r4 = r1.getKey()     // Catch:{ JSONException -> 0x00fa }
                boolean r4 = r0.has(r4)     // Catch:{ JSONException -> 0x00fa }
                if (r4 == 0) goto L_0x00a0
                io.branch.referral.Branch r4 = p145io.branch.referral.Branch.this     // Catch:{ JSONException -> 0x00fa }
                io.branch.referral.r r4 = r4.f15576b     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r1 = r1.getKey()     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r1 = r0.getString(r1)     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r5 = "bnc_session_id"
                r4.mo19335y(r5, r1)     // Catch:{ JSONException -> 0x00fa }
                r1 = r2
                goto L_0x00a1
            L_0x00a0:
                r1 = r3
            L_0x00a1:
                io.branch.referral.Defines$Jsonkey r4 = p145io.branch.referral.Defines$Jsonkey.RandomizedBundleToken     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r5 = r4.getKey()     // Catch:{ JSONException -> 0x00fa }
                boolean r5 = r0.has(r5)     // Catch:{ JSONException -> 0x00fa }
                if (r5 == 0) goto L_0x00d4
                java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x00fa }
                io.branch.referral.Branch r5 = p145io.branch.referral.Branch.this     // Catch:{ JSONException -> 0x00fa }
                io.branch.referral.r r5 = r5.f15576b     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r5 = r5.mo19322l()     // Catch:{ JSONException -> 0x00fa }
                boolean r5 = r5.equals(r4)     // Catch:{ JSONException -> 0x00fa }
                if (r5 != 0) goto L_0x00d4
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this     // Catch:{ JSONException -> 0x00fa }
                java.util.concurrent.ConcurrentHashMap<io.branch.referral.e, java.lang.String> r1 = r1.f15582h     // Catch:{ JSONException -> 0x00fa }
                r1.clear()     // Catch:{ JSONException -> 0x00fa }
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this     // Catch:{ JSONException -> 0x00fa }
                io.branch.referral.r r1 = r1.f15576b     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r5 = "bnc_randomized_bundle_token"
                r1.mo19335y(r5, r4)     // Catch:{ JSONException -> 0x00fa }
                r1 = r2
            L_0x00d4:
                io.branch.referral.Defines$Jsonkey r4 = p145io.branch.referral.Defines$Jsonkey.RandomizedDeviceToken     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r5 = r4.getKey()     // Catch:{ JSONException -> 0x00fa }
                boolean r5 = r0.has(r5)     // Catch:{ JSONException -> 0x00fa }
                if (r5 == 0) goto L_0x00f2
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this     // Catch:{ JSONException -> 0x00fa }
                io.branch.referral.r r1 = r1.f15576b     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x00fa }
                java.lang.String r5 = "bnc_randomized_device_token"
                r1.mo19335y(r5, r4)     // Catch:{ JSONException -> 0x00fa }
                r1 = r2
            L_0x00f2:
                if (r1 == 0) goto L_0x00fe
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this     // Catch:{ JSONException -> 0x00fa }
                r1.mo19207x()     // Catch:{ JSONException -> 0x00fa }
                goto L_0x00fe
            L_0x00fa:
                r1 = move-exception
                r1.printStackTrace()
            L_0x00fe:
                io.branch.referral.ServerRequest r1 = r8.f15598a
                boolean r4 = r1 instanceof p145io.branch.referral.C7087w
                if (r4 == 0) goto L_0x018e
                io.branch.referral.Branch r4 = p145io.branch.referral.Branch.this
                io.branch.referral.Branch$SESSION_STATE r5 = p145io.branch.referral.Branch.SESSION_STATE.INITIALISED
                r4.f15584j = r5
                io.branch.referral.w r1 = (p145io.branch.referral.C7087w) r1
                r1.getClass()
                org.json.JSONObject r4 = r9.mo19274a()
                if (r4 == 0) goto L_0x017c
                org.json.JSONObject r4 = r9.mo19274a()
                io.branch.referral.Defines$Jsonkey r5 = p145io.branch.referral.Defines$Jsonkey.BranchViewData
                java.lang.String r6 = r5.getKey()
                boolean r4 = r4.has(r6)
                if (r4 == 0) goto L_0x017c
                org.json.JSONObject r4 = r9.mo19274a()     // Catch:{ JSONException -> 0x017c }
                java.lang.String r5 = r5.getKey()     // Catch:{ JSONException -> 0x017c }
                org.json.JSONObject r4 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x017c }
                java.lang.String r1 = r1.mo19265s()     // Catch:{ JSONException -> 0x017c }
                io.branch.referral.Branch r5 = p145io.branch.referral.Branch.m13575j()     // Catch:{ JSONException -> 0x017c }
                android.app.Activity r5 = r5.mo19196i()     // Catch:{ JSONException -> 0x017c }
                if (r5 == 0) goto L_0x0173
                io.branch.referral.Branch r5 = p145io.branch.referral.Branch.m13575j()     // Catch:{ JSONException -> 0x017c }
                android.app.Activity r5 = r5.mo19196i()     // Catch:{ JSONException -> 0x017c }
                boolean r6 = r5 instanceof p145io.branch.referral.Branch.C7018g     // Catch:{ JSONException -> 0x017c }
                if (r6 == 0) goto L_0x0153
                r6 = r5
                io.branch.referral.Branch$g r6 = (p145io.branch.referral.Branch.C7018g) r6     // Catch:{ JSONException -> 0x017c }
                boolean r6 = r6.mo19216a()     // Catch:{ JSONException -> 0x017c }
                r2 = r2 ^ r6
            L_0x0153:
                if (r2 == 0) goto L_0x016a
                io.branch.referral.o r2 = p145io.branch.referral.C7063o.m13656b()     // Catch:{ JSONException -> 0x017c }
                io.branch.referral.Branch r6 = p145io.branch.referral.Branch.m13575j()     // Catch:{ JSONException -> 0x017c }
                r2.getClass()     // Catch:{ JSONException -> 0x017c }
                io.branch.referral.o$b r7 = new io.branch.referral.o$b     // Catch:{ JSONException -> 0x017c }
                r7.<init>(r4, r1)     // Catch:{ JSONException -> 0x017c }
                boolean r1 = r2.mo19299d(r7, r5, r6)     // Catch:{ JSONException -> 0x017c }
                goto L_0x017d
            L_0x016a:
                io.branch.referral.o r2 = p145io.branch.referral.C7063o.m13656b()     // Catch:{ JSONException -> 0x017c }
                boolean r1 = r2.mo19298c(r1, r4)     // Catch:{ JSONException -> 0x017c }
                goto L_0x017d
            L_0x0173:
                io.branch.referral.o r2 = p145io.branch.referral.C7063o.m13656b()     // Catch:{ JSONException -> 0x017c }
                boolean r1 = r2.mo19298c(r1, r4)     // Catch:{ JSONException -> 0x017c }
                goto L_0x017d
            L_0x017c:
                r1 = r3
            L_0x017d:
                if (r1 != 0) goto L_0x0184
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this
                r1.mo19194c()
            L_0x0184:
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this
                r1.getClass()
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this
                r1.getClass()
            L_0x018e:
                if (r0 == 0) goto L_0x01a2
                io.branch.referral.ServerRequest r0 = r8.f15598a
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.f15568A
                r0.mo19252k(r9, r1)
                io.branch.referral.Branch r9 = p145io.branch.referral.Branch.this
                io.branch.referral.y r9 = r9.f15580f
                io.branch.referral.ServerRequest r0 = r8.f15598a
                r9.mo19389c(r0)
                goto L_0x0278
            L_0x01a2:
                io.branch.referral.ServerRequest r9 = r8.f15598a
                boolean r9 = r9.mo19255o()
                if (r9 == 0) goto L_0x01b1
                io.branch.referral.ServerRequest r9 = r8.f15598a
                r9.mo19245b()
                goto L_0x0278
            L_0x01b1:
                io.branch.referral.Branch r9 = p145io.branch.referral.Branch.this
                io.branch.referral.y r9 = r9.f15580f
                io.branch.referral.ServerRequest r0 = r8.f15598a
                r9.mo19389c(r0)
                goto L_0x0278
            L_0x01bc:
                io.branch.referral.ServerRequest r1 = r8.f15598a
                boolean r1 = r1 instanceof p145io.branch.referral.C7087w
                if (r1 == 0) goto L_0x01da
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this
                io.branch.referral.r r1 = r1.f15576b
                java.lang.String r4 = "bnc_session_params"
                java.lang.String r1 = r1.mo19328r(r4)
                java.lang.String r4 = "bnc_no_value"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x01da
                io.branch.referral.Branch r1 = p145io.branch.referral.Branch.this
                io.branch.referral.Branch$SESSION_STATE r4 = p145io.branch.referral.Branch.SESSION_STATE.UNINITIALISED
                r1.f15584j = r4
            L_0x01da:
                r1 = 400(0x190, float:5.6E-43)
                if (r0 == r1) goto L_0x01e2
                r4 = 409(0x199, float:5.73E-43)
                if (r0 != r4) goto L_0x01ee
            L_0x01e2:
                io.branch.referral.ServerRequest r4 = r8.f15598a
                boolean r5 = r4 instanceof p145io.branch.referral.C7082t
                if (r5 == 0) goto L_0x01ee
                io.branch.referral.t r4 = (p145io.branch.referral.C7082t) r4
                r4.getClass()
                goto L_0x0239
            L_0x01ee:
                io.branch.referral.Branch r4 = p145io.branch.referral.Branch.this
                r4.f15581g = r3
                io.branch.referral.ServerRequest r4 = r8.f15598a
                java.lang.String r5 = "message"
                java.lang.String r6 = "error"
                org.json.JSONObject r9 = r9.mo19274a()     // Catch:{ Exception -> 0x0234 }
                if (r9 == 0) goto L_0x0234
                boolean r7 = r9.has(r6)     // Catch:{ Exception -> 0x0234 }
                if (r7 == 0) goto L_0x0234
                org.json.JSONObject r7 = r9.getJSONObject(r6)     // Catch:{ Exception -> 0x0234 }
                boolean r7 = r7.has(r5)     // Catch:{ Exception -> 0x0234 }
                if (r7 == 0) goto L_0x0234
                org.json.JSONObject r9 = r9.getJSONObject(r6)     // Catch:{ Exception -> 0x0234 }
                java.lang.String r9 = r9.getString(r5)     // Catch:{ Exception -> 0x0234 }
                if (r9 == 0) goto L_0x0236
                java.lang.String r5 = r9.trim()     // Catch:{ Exception -> 0x0236 }
                int r5 = r5.length()     // Catch:{ Exception -> 0x0236 }
                if (r5 <= 0) goto L_0x0236
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0236 }
                r5.<init>()     // Catch:{ Exception -> 0x0236 }
                r5.append(r9)     // Catch:{ Exception -> 0x0236 }
                java.lang.String r6 = "."
                r5.append(r6)     // Catch:{ Exception -> 0x0236 }
                java.lang.String r9 = r5.toString()     // Catch:{ Exception -> 0x0236 }
                goto L_0x0236
            L_0x0234:
                java.lang.String r9 = ""
            L_0x0236:
                r4.mo19248g(r0, r9)
            L_0x0239:
                if (r1 > r0) goto L_0x023f
                r9 = 451(0x1c3, float:6.32E-43)
                if (r0 <= r9) goto L_0x0243
            L_0x023f:
                r9 = -117(0xffffffffffffff8b, float:NaN)
                if (r0 != r9) goto L_0x0245
            L_0x0243:
                r9 = r2
                goto L_0x0246
            L_0x0245:
                r9 = r3
            L_0x0246:
                if (r9 != 0) goto L_0x0268
                io.branch.referral.ServerRequest r9 = r8.f15598a
                boolean r9 = r9.mo19255o()
                if (r9 == 0) goto L_0x0268
                io.branch.referral.ServerRequest r9 = r8.f15598a
                int r9 = r9.f15622h
                io.branch.referral.Branch r0 = p145io.branch.referral.Branch.this
                io.branch.referral.r r0 = r0.f15576b
                r1 = 3
                java.lang.String r4 = "bnc_no_connection_retry_max"
                int r0 = r0.mo19319i(r1, r4)
                if (r9 < r0) goto L_0x0262
                goto L_0x0268
            L_0x0262:
                io.branch.referral.ServerRequest r9 = r8.f15598a
                r9.mo19245b()
                goto L_0x0271
            L_0x0268:
                io.branch.referral.Branch r9 = p145io.branch.referral.Branch.this
                io.branch.referral.y r9 = r9.f15580f
                io.branch.referral.ServerRequest r0 = r8.f15598a
                r9.mo19389c(r0)
            L_0x0271:
                io.branch.referral.ServerRequest r9 = r8.f15598a
                int r0 = r9.f15622h
                int r0 = r0 + r2
                r9.f15622h = r0
            L_0x0278:
                io.branch.referral.Branch r9 = p145io.branch.referral.Branch.this
                r9.f15581g = r3
                android.os.Handler r9 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r9.<init>(r0)
                io.branch.referral.Branch$d$a r0 = new io.branch.referral.Branch$d$a
                r0.<init>()
                r9.post(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.Branch.C7014d.mo19209a(io.branch.referral.c0):void");
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x01a9 */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01d9 A[Catch:{ JSONException -> 0x01f9 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object doInBackground(java.lang.Object[] r9) {
            /*
                r8 = this;
                java.lang.Void[] r9 = (java.lang.Void[]) r9
                io.branch.referral.Branch r9 = p145io.branch.referral.Branch.this
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                io.branch.referral.ServerRequest r1 = r8.f15598a
                java.lang.String r1 = r1.mo19247f()
                r0.append(r1)
                java.lang.String r1 = "-"
                r0.append(r1)
                io.branch.referral.Defines$Jsonkey r1 = p145io.branch.referral.Defines$Jsonkey.Queue_Wait_Time
                java.lang.String r1 = r1.getKey()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                io.branch.referral.ServerRequest r1 = r8.f15598a
                long r2 = r1.f15618d
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0036
                long r2 = java.lang.System.currentTimeMillis()
                long r4 = r1.f15618d
                long r4 = r2 - r4
            L_0x0036:
                java.lang.String r1 = java.lang.String.valueOf(r4)
                r9.mo19193a(r0, r1)
                io.branch.referral.ServerRequest r9 = r8.f15598a
                r9.getClass()
                boolean r0 = r9 instanceof p145io.branch.referral.C7087w
                r1 = 1
                if (r0 == 0) goto L_0x00eb
                r0 = r9
                io.branch.referral.w r0 = (p145io.branch.referral.C7087w) r0
                io.branch.referral.r r2 = r0.f15617c
                java.lang.String r3 = "bnc_link_click_identifier"
                java.lang.String r2 = r2.mo19328r(r3)
                java.lang.String r3 = "bnc_no_value"
                boolean r4 = r2.equals(r3)
                if (r4 != 0) goto L_0x0078
                org.json.JSONObject r4 = r0.f15615a     // Catch:{ JSONException -> 0x0078 }
                io.branch.referral.Defines$Jsonkey r5 = p145io.branch.referral.Defines$Jsonkey.LinkIdentifier     // Catch:{ JSONException -> 0x0078 }
                java.lang.String r5 = r5.getKey()     // Catch:{ JSONException -> 0x0078 }
                r4.put(r5, r2)     // Catch:{ JSONException -> 0x0078 }
                org.json.JSONObject r2 = r0.f15615a     // Catch:{ JSONException -> 0x0078 }
                io.branch.referral.Defines$Jsonkey r4 = p145io.branch.referral.Defines$Jsonkey.FaceBookAppLinkChecked     // Catch:{ JSONException -> 0x0078 }
                java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x0078 }
                io.branch.referral.r r5 = r0.f15617c     // Catch:{ JSONException -> 0x0078 }
                java.lang.String r6 = "bnc_triggered_by_fb_app_link"
                boolean r5 = r5.mo19316e(r6)     // Catch:{ JSONException -> 0x0078 }
                r2.put(r4, r5)     // Catch:{ JSONException -> 0x0078 }
            L_0x0078:
                io.branch.referral.r r2 = r0.f15617c
                java.lang.String r4 = "bnc_google_search_install_identifier"
                java.lang.String r2 = r2.mo19328r(r4)
                boolean r4 = r2.equals(r3)
                if (r4 != 0) goto L_0x0091
                org.json.JSONObject r4 = r0.f15615a     // Catch:{ JSONException -> 0x0091 }
                io.branch.referral.Defines$Jsonkey r5 = p145io.branch.referral.Defines$Jsonkey.GoogleSearchInstallReferrer     // Catch:{ JSONException -> 0x0091 }
                java.lang.String r5 = r5.getKey()     // Catch:{ JSONException -> 0x0091 }
                r4.put(r5, r2)     // Catch:{ JSONException -> 0x0091 }
            L_0x0091:
                io.branch.referral.r r2 = r0.f15617c
                java.lang.String r4 = "bnc_google_play_install_referrer_extras"
                java.lang.String r2 = r2.mo19328r(r4)
                boolean r4 = r2.equals(r3)
                if (r4 != 0) goto L_0x00aa
                org.json.JSONObject r4 = r0.f15615a     // Catch:{ JSONException -> 0x00aa }
                io.branch.referral.Defines$Jsonkey r5 = p145io.branch.referral.Defines$Jsonkey.GooglePlayInstallReferrer     // Catch:{ JSONException -> 0x00aa }
                java.lang.String r5 = r5.getKey()     // Catch:{ JSONException -> 0x00aa }
                r4.put(r5, r2)     // Catch:{ JSONException -> 0x00aa }
            L_0x00aa:
                io.branch.referral.r r2 = r0.f15617c
                java.lang.String r4 = "bnc_app_store_source"
                java.lang.String r2 = r2.mo19328r(r4)
                boolean r3 = r3.equals(r2)
                if (r3 != 0) goto L_0x00c3
                org.json.JSONObject r3 = r0.f15615a     // Catch:{ JSONException -> 0x00c3 }
                io.branch.referral.Defines$Jsonkey r4 = p145io.branch.referral.Defines$Jsonkey.App_Store     // Catch:{ JSONException -> 0x00c3 }
                java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x00c3 }
                r3.put(r4, r2)     // Catch:{ JSONException -> 0x00c3 }
            L_0x00c3:
                io.branch.referral.r r2 = r0.f15617c
                java.lang.String r3 = "bnc_is_full_app_conversion"
                boolean r2 = r2.mo19316e(r3)
                if (r2 == 0) goto L_0x00eb
                org.json.JSONObject r2 = r0.f15615a     // Catch:{ JSONException -> 0x00eb }
                io.branch.referral.Defines$Jsonkey r3 = p145io.branch.referral.Defines$Jsonkey.AndroidAppLinkURL     // Catch:{ JSONException -> 0x00eb }
                java.lang.String r3 = r3.getKey()     // Catch:{ JSONException -> 0x00eb }
                io.branch.referral.r r4 = r0.f15617c     // Catch:{ JSONException -> 0x00eb }
                java.lang.String r5 = "bnc_app_link"
                java.lang.String r4 = r4.mo19328r(r5)     // Catch:{ JSONException -> 0x00eb }
                r2.put(r3, r4)     // Catch:{ JSONException -> 0x00eb }
                org.json.JSONObject r0 = r0.f15615a     // Catch:{ JSONException -> 0x00eb }
                io.branch.referral.Defines$Jsonkey r2 = p145io.branch.referral.Defines$Jsonkey.IsFullAppConv     // Catch:{ JSONException -> 0x00eb }
                java.lang.String r2 = r2.getKey()     // Catch:{ JSONException -> 0x00eb }
                r0.put(r2, r1)     // Catch:{ JSONException -> 0x00eb }
            L_0x00eb:
                io.branch.referral.ServerRequest$BRANCH_API_VERSION r0 = r9.mo19246e()
                io.branch.referral.ServerRequest$BRANCH_API_VERSION r2 = p145io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2
                if (r0 != r2) goto L_0x0121
                org.json.JSONObject r0 = r9.f15615a
                io.branch.referral.Defines$Jsonkey r2 = p145io.branch.referral.Defines$Jsonkey.UserData
                java.lang.String r2 = r2.getKey()
                org.json.JSONObject r0 = r0.optJSONObject(r2)
                if (r0 == 0) goto L_0x0121
                io.branch.referral.Defines$Jsonkey r2 = p145io.branch.referral.Defines$Jsonkey.DeveloperIdentity     // Catch:{ JSONException -> 0x0121 }
                java.lang.String r2 = r2.getKey()     // Catch:{ JSONException -> 0x0121 }
                io.branch.referral.r r3 = r9.f15617c     // Catch:{ JSONException -> 0x0121 }
                java.lang.String r4 = "bnc_identity"
                java.lang.String r3 = r3.mo19328r(r4)     // Catch:{ JSONException -> 0x0121 }
                r0.put(r2, r3)     // Catch:{ JSONException -> 0x0121 }
                io.branch.referral.Defines$Jsonkey r2 = p145io.branch.referral.Defines$Jsonkey.RandomizedDeviceToken     // Catch:{ JSONException -> 0x0121 }
                java.lang.String r2 = r2.getKey()     // Catch:{ JSONException -> 0x0121 }
                io.branch.referral.r r3 = r9.f15617c     // Catch:{ JSONException -> 0x0121 }
                java.lang.String r3 = r3.mo19323m()     // Catch:{ JSONException -> 0x0121 }
                r0.put(r2, r3)     // Catch:{ JSONException -> 0x0121 }
            L_0x0121:
                io.branch.referral.ServerRequest$BRANCH_API_VERSION r0 = r9.mo19246e()
                io.branch.referral.ServerRequest$BRANCH_API_VERSION r2 = p145io.branch.referral.ServerRequest.BRANCH_API_VERSION.V1
                if (r0 != r2) goto L_0x012c
                org.json.JSONObject r0 = r9.f15615a
                goto L_0x0138
            L_0x012c:
                org.json.JSONObject r0 = r9.f15615a
                io.branch.referral.Defines$Jsonkey r2 = p145io.branch.referral.Defines$Jsonkey.UserData
                java.lang.String r2 = r2.getKey()
                org.json.JSONObject r0 = r0.optJSONObject(r2)
            L_0x0138:
                if (r0 == 0) goto L_0x0151
                io.branch.referral.r r2 = r9.f15617c
                java.lang.String r3 = "bnc_ad_network_callouts_disabled"
                boolean r2 = r2.mo19316e(r3)
                if (r2 == 0) goto L_0x0151
                io.branch.referral.Defines$Jsonkey r3 = p145io.branch.referral.Defines$Jsonkey.DisableAdNetworkCallouts     // Catch:{ JSONException -> 0x0151 }
                java.lang.String r3 = r3.getKey()     // Catch:{ JSONException -> 0x0151 }
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ JSONException -> 0x0151 }
                r0.putOpt(r3, r2)     // Catch:{ JSONException -> 0x0151 }
            L_0x0151:
                io.branch.referral.ServerRequest$BRANCH_API_VERSION r0 = r9.mo19246e()
                io.branch.referral.q r2 = p145io.branch.referral.C7072q.m13663c()
                io.branch.referral.q$a r2 = r2.f15748a
                int r2 = r2.f15751b
                io.branch.referral.q r3 = p145io.branch.referral.C7072q.m13663c()
                io.branch.referral.q$a r3 = r3.f15748a
                java.lang.String r3 = r3.f15750a
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 != 0) goto L_0x01fd
                java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r5 = "amazon"
                boolean r4 = r4.equalsIgnoreCase(r5)     // Catch:{ JSONException -> 0x01a9 }
                if (r4 == 0) goto L_0x017c
                io.branch.referral.Defines$Jsonkey r4 = p145io.branch.referral.Defines$Jsonkey.FireAdId     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x01a9 }
                goto L_0x0195
            L_0x017c:
                io.branch.referral.Branch r4 = p145io.branch.referral.Branch.m13575j()     // Catch:{ JSONException -> 0x01a9 }
                android.content.Context r4 = r4.f15578d     // Catch:{ JSONException -> 0x01a9 }
                boolean r4 = p145io.branch.referral.C7074q0.m13673f(r4)     // Catch:{ JSONException -> 0x01a9 }
                if (r4 == 0) goto L_0x018f
                io.branch.referral.Defines$Jsonkey r4 = p145io.branch.referral.Defines$Jsonkey.OpenAdvertisingID     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x01a9 }
                goto L_0x0195
            L_0x018f:
                io.branch.referral.Defines$Jsonkey r4 = p145io.branch.referral.Defines$Jsonkey.AAID     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x01a9 }
            L_0x0195:
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a9 }
                r5.<init>()     // Catch:{ JSONException -> 0x01a9 }
                org.json.JSONObject r4 = r5.put(r4, r3)     // Catch:{ JSONException -> 0x01a9 }
                org.json.JSONObject r5 = r9.f15615a     // Catch:{ JSONException -> 0x01a9 }
                io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.AdvertisingIDs     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r6 = r6.getKey()     // Catch:{ JSONException -> 0x01a9 }
                r5.put(r6, r4)     // Catch:{ JSONException -> 0x01a9 }
            L_0x01a9:
                io.branch.referral.q r4 = p145io.branch.referral.C7072q.m13663c()     // Catch:{ JSONException -> 0x01f9 }
                io.branch.referral.q0$b r4 = r4.mo19309b()     // Catch:{ JSONException -> 0x01f9 }
                org.json.JSONObject r5 = r9.f15615a     // Catch:{ JSONException -> 0x01f9 }
                io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.HardwareID     // Catch:{ JSONException -> 0x01f9 }
                java.lang.String r6 = r6.getKey()     // Catch:{ JSONException -> 0x01f9 }
                java.lang.String r7 = r4.f15753a     // Catch:{ JSONException -> 0x01f9 }
                r5.put(r6, r7)     // Catch:{ JSONException -> 0x01f9 }
                org.json.JSONObject r5 = r9.f15615a     // Catch:{ JSONException -> 0x01f9 }
                io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.IsHardwareIDReal     // Catch:{ JSONException -> 0x01f9 }
                java.lang.String r6 = r6.getKey()     // Catch:{ JSONException -> 0x01f9 }
                boolean r7 = r4.f15754b     // Catch:{ JSONException -> 0x01f9 }
                r5.put(r6, r7)     // Catch:{ JSONException -> 0x01f9 }
                org.json.JSONObject r5 = r9.f15615a     // Catch:{ JSONException -> 0x01f9 }
                io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.UserData     // Catch:{ JSONException -> 0x01f9 }
                java.lang.String r7 = r6.getKey()     // Catch:{ JSONException -> 0x01f9 }
                boolean r5 = r5.has(r7)     // Catch:{ JSONException -> 0x01f9 }
                if (r5 == 0) goto L_0x01fd
                org.json.JSONObject r5 = r9.f15615a     // Catch:{ JSONException -> 0x01f9 }
                java.lang.String r6 = r6.getKey()     // Catch:{ JSONException -> 0x01f9 }
                org.json.JSONObject r5 = r5.getJSONObject(r6)     // Catch:{ JSONException -> 0x01f9 }
                io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.AndroidID     // Catch:{ JSONException -> 0x01f9 }
                java.lang.String r7 = r6.getKey()     // Catch:{ JSONException -> 0x01f9 }
                boolean r7 = r5.has(r7)     // Catch:{ JSONException -> 0x01f9 }
                if (r7 == 0) goto L_0x01fd
                java.lang.String r6 = r6.getKey()     // Catch:{ JSONException -> 0x01f9 }
                java.lang.String r4 = r4.f15753a     // Catch:{ JSONException -> 0x01f9 }
                r5.put(r6, r4)     // Catch:{ JSONException -> 0x01f9 }
                goto L_0x01fd
            L_0x01f9:
                r4 = move-exception
                r4.printStackTrace()
            L_0x01fd:
                io.branch.referral.ServerRequest$BRANCH_API_VERSION r4 = p145io.branch.referral.ServerRequest.BRANCH_API_VERSION.V1     // Catch:{ JSONException -> 0x02a2 }
                if (r0 != r4) goto L_0x0251
                org.json.JSONObject r0 = r9.f15615a     // Catch:{ JSONException -> 0x02a2 }
                io.branch.referral.Defines$Jsonkey r4 = p145io.branch.referral.Defines$Jsonkey.LATVal     // Catch:{ JSONException -> 0x02a2 }
                java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x02a2 }
                r0.put(r4, r2)     // Catch:{ JSONException -> 0x02a2 }
                boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x02a2 }
                if (r0 != 0) goto L_0x0231
                android.content.Context r0 = r9.f15619e     // Catch:{ JSONException -> 0x02a2 }
                boolean r0 = p145io.branch.referral.C7074q0.m13673f(r0)     // Catch:{ JSONException -> 0x02a2 }
                if (r0 != 0) goto L_0x0225
                org.json.JSONObject r0 = r9.f15615a     // Catch:{ JSONException -> 0x02a2 }
                io.branch.referral.Defines$Jsonkey r1 = p145io.branch.referral.Defines$Jsonkey.GoogleAdvertisingID     // Catch:{ JSONException -> 0x02a2 }
                java.lang.String r1 = r1.getKey()     // Catch:{ JSONException -> 0x02a2 }
                r0.put(r1, r3)     // Catch:{ JSONException -> 0x02a2 }
            L_0x0225:
                org.json.JSONObject r9 = r9.f15615a     // Catch:{ JSONException -> 0x02a2 }
                io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.UnidentifiedDevice     // Catch:{ JSONException -> 0x02a2 }
                java.lang.String r0 = r0.getKey()     // Catch:{ JSONException -> 0x02a2 }
                r9.remove(r0)     // Catch:{ JSONException -> 0x02a2 }
                goto L_0x02a2
            L_0x0231:
                org.json.JSONObject r0 = r9.f15615a     // Catch:{ JSONException -> 0x02a2 }
                boolean r0 = p145io.branch.referral.ServerRequest.m13603l(r0)     // Catch:{ JSONException -> 0x02a2 }
                if (r0 != 0) goto L_0x02a2
                org.json.JSONObject r0 = r9.f15615a     // Catch:{ JSONException -> 0x02a2 }
                io.branch.referral.Defines$Jsonkey r2 = p145io.branch.referral.Defines$Jsonkey.UnidentifiedDevice     // Catch:{ JSONException -> 0x02a2 }
                java.lang.String r3 = r2.getKey()     // Catch:{ JSONException -> 0x02a2 }
                boolean r0 = r0.optBoolean(r3)     // Catch:{ JSONException -> 0x02a2 }
                if (r0 != 0) goto L_0x02a2
                org.json.JSONObject r9 = r9.f15615a     // Catch:{ JSONException -> 0x02a2 }
                java.lang.String r0 = r2.getKey()     // Catch:{ JSONException -> 0x02a2 }
                r9.put(r0, r1)     // Catch:{ JSONException -> 0x02a2 }
                goto L_0x02a2
            L_0x0251:
                org.json.JSONObject r0 = r9.f15615a     // Catch:{ JSONException -> 0x02a2 }
                io.branch.referral.Defines$Jsonkey r4 = p145io.branch.referral.Defines$Jsonkey.UserData     // Catch:{ JSONException -> 0x02a2 }
                java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x02a2 }
                org.json.JSONObject r0 = r0.optJSONObject(r4)     // Catch:{ JSONException -> 0x02a2 }
                if (r0 == 0) goto L_0x02a2
                io.branch.referral.Defines$Jsonkey r4 = p145io.branch.referral.Defines$Jsonkey.LimitedAdTracking     // Catch:{ JSONException -> 0x02a2 }
                java.lang.String r4 = r4.getKey()     // Catch:{ JSONException -> 0x02a2 }
                r0.put(r4, r2)     // Catch:{ JSONException -> 0x02a2 }
                boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x02a2 }
                if (r2 != 0) goto L_0x0289
                android.content.Context r9 = r9.f15619e     // Catch:{ JSONException -> 0x02a2 }
                boolean r9 = p145io.branch.referral.C7074q0.m13673f(r9)     // Catch:{ JSONException -> 0x02a2 }
                if (r9 != 0) goto L_0x027f
                io.branch.referral.Defines$Jsonkey r9 = p145io.branch.referral.Defines$Jsonkey.AAID     // Catch:{ JSONException -> 0x02a2 }
                java.lang.String r9 = r9.getKey()     // Catch:{ JSONException -> 0x02a2 }
                r0.put(r9, r3)     // Catch:{ JSONException -> 0x02a2 }
            L_0x027f:
                io.branch.referral.Defines$Jsonkey r9 = p145io.branch.referral.Defines$Jsonkey.UnidentifiedDevice     // Catch:{ JSONException -> 0x02a2 }
                java.lang.String r9 = r9.getKey()     // Catch:{ JSONException -> 0x02a2 }
                r0.remove(r9)     // Catch:{ JSONException -> 0x02a2 }
                goto L_0x02a2
            L_0x0289:
                boolean r9 = p145io.branch.referral.ServerRequest.m13603l(r0)     // Catch:{ JSONException -> 0x02a2 }
                if (r9 != 0) goto L_0x02a2
                io.branch.referral.Defines$Jsonkey r9 = p145io.branch.referral.Defines$Jsonkey.UnidentifiedDevice     // Catch:{ JSONException -> 0x02a2 }
                java.lang.String r2 = r9.getKey()     // Catch:{ JSONException -> 0x02a2 }
                boolean r2 = r0.optBoolean(r2)     // Catch:{ JSONException -> 0x02a2 }
                if (r2 != 0) goto L_0x02a2
                java.lang.String r9 = r9.getKey()     // Catch:{ JSONException -> 0x02a2 }
                r0.put(r9, r1)     // Catch:{ JSONException -> 0x02a2 }
            L_0x02a2:
                io.branch.referral.Branch r9 = p145io.branch.referral.Branch.this
                io.branch.referral.r0 r9 = r9.f15596v
                boolean r9 = r9.f15762a
                if (r9 == 0) goto L_0x02c0
                io.branch.referral.ServerRequest r9 = r8.f15598a
                boolean r9 = r9.mo19253m()
                if (r9 != 0) goto L_0x02c0
                io.branch.referral.c0 r9 = new io.branch.referral.c0
                io.branch.referral.ServerRequest r0 = r8.f15598a
                r0.mo19247f()
                r0 = -117(0xffffffffffffff8b, float:NaN)
                r9.<init>(r0)
                goto L_0x0371
            L_0x02c0:
                io.branch.referral.Branch r9 = p145io.branch.referral.Branch.this
                io.branch.referral.r r9 = r9.f15576b
                java.lang.String r9 = r9.mo19317f()
                io.branch.referral.ServerRequest r0 = r8.f15598a
                r0.mo19249h()
                io.branch.referral.Branch r0 = p145io.branch.referral.Branch.this
                io.branch.referral.network.a r1 = r0.f15575a
                io.branch.referral.ServerRequest r2 = r8.f15598a
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r0.f15587m
                r2.getClass()
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                org.json.JSONObject r4 = r2.f15615a     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                if (r4 == 0) goto L_0x0304
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                org.json.JSONObject r5 = r2.f15615a     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                r4.<init>(r5)     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                java.util.Iterator r5 = r4.keys()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
            L_0x02f0:
                boolean r6 = r5.hasNext()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                if (r6 == 0) goto L_0x0304
                java.lang.Object r6 = r5.next()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                java.lang.Object r7 = r4.get(r6)     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                r3.put(r6, r7)     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                goto L_0x02f0
            L_0x0304:
                int r4 = r0.size()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                if (r4 <= 0) goto L_0x033a
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                r4.<init>()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                java.util.Set r5 = r0.keySet()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
            L_0x0317:
                boolean r6 = r5.hasNext()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                if (r6 == 0) goto L_0x032e
                java.lang.Object r6 = r5.next()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                java.lang.Object r7 = r0.get(r6)     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                r4.put(r6, r7)     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                r0.remove(r6)     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                goto L_0x0317
            L_0x032e:
                io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.Branch_Instrumentation     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                java.lang.String r0 = r0.getKey()     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                r3.put(r0, r4)     // Catch:{ JSONException -> 0x033a, ConcurrentModificationException -> 0x0338 }
                goto L_0x033a
            L_0x0338:
                org.json.JSONObject r3 = r2.f15615a
            L_0x033a:
                io.branch.referral.ServerRequest r0 = r8.f15598a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                io.branch.referral.r r4 = r0.f15617c
                r4.getClass()
                r4 = 0
                boolean r5 = android.webkit.URLUtil.isHttpsUrl(r4)
                if (r5 == 0) goto L_0x034e
                goto L_0x0350
            L_0x034e:
                java.lang.String r4 = "https://api2.branch.io/"
            L_0x0350:
                r2.append(r4)
                io.branch.referral.Defines$RequestPath r0 = r0.f15616b
                java.lang.String r0 = r0.getPath()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                io.branch.referral.ServerRequest r2 = r8.f15598a
                java.lang.String r2 = r2.mo19247f()
                io.branch.referral.c0 r9 = r1.mo19295b(r0, r2, r9, r3)
                java.util.concurrent.CountDownLatch r0 = r8.f15599b
                if (r0 == 0) goto L_0x0371
                r0.countDown()
            L_0x0371:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.Branch.C7014d.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public final void onPostExecute(Object obj) {
            C7031c0 c0Var = (C7031c0) obj;
            super.onPostExecute(c0Var);
            mo19209a(c0Var);
        }

        public final void onPreExecute() {
            boolean e;
            super.onPreExecute();
            this.f15598a.mo19251j();
            ServerRequest serverRequest = this.f15598a;
            serverRequest.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                Iterator<String> keys = serverRequest.f15617c.f15759c.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, serverRequest.f15617c.f15759c.get(next));
                }
                JSONObject optJSONObject = serverRequest.f15615a.optJSONObject(Defines$Jsonkey.Metadata.getKey());
                if (optJSONObject != null) {
                    Iterator<String> keys2 = optJSONObject.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        jSONObject.put(next2, optJSONObject.get(next2));
                    }
                }
                if ((serverRequest instanceof C7027a0) && serverRequest.f15617c.f15760d.length() > 0) {
                    Iterator<String> keys3 = serverRequest.f15617c.f15760d.keys();
                    while (keys3.hasNext()) {
                        String next3 = keys3.next();
                        serverRequest.f15615a.putOpt(next3, serverRequest.f15617c.f15760d.get(next3));
                    }
                }
                serverRequest.f15615a.put(Defines$Jsonkey.Metadata.getKey(), jSONObject);
            } catch (JSONException unused) {
                C7077r.m13675a("Could not merge metadata, ignoring user metadata.");
            }
            if (serverRequest.mo19256p()) {
                JSONObject optJSONObject2 = serverRequest.mo19246e() == ServerRequest.BRANCH_API_VERSION.V1 ? serverRequest.f15615a : serverRequest.f15615a.optJSONObject(Defines$Jsonkey.UserData.getKey());
                if (optJSONObject2 != null && (e = serverRequest.f15617c.mo19316e("bnc_limit_facebook_tracking"))) {
                    try {
                        optJSONObject2.putOpt(Defines$Jsonkey.limitFacebookTracking.getKey(), Boolean.valueOf(e));
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: io.branch.referral.Branch$e */
    public interface C7016e {
        /* renamed from: a */
        void mo19214a(JSONObject jSONObject, C7032d dVar);
    }

    /* renamed from: io.branch.referral.Branch$f */
    public class C7017f extends AsyncTask<ServerRequest, Void, C7031c0> {
        public C7017f() {
        }

        public final Object doInBackground(Object[] objArr) {
            C7062a aVar = Branch.this.f15575a;
            JSONObject jSONObject = ((ServerRequest[]) objArr)[0].f15615a;
            StringBuilder sb = new StringBuilder();
            Branch.this.f15576b.getClass();
            String str = null;
            if (!URLUtil.isHttpsUrl((String) null)) {
                str = "https://api2.branch.io/";
            }
            sb.append(str);
            Defines$RequestPath defines$RequestPath = Defines$RequestPath.GetURL;
            sb.append(defines$RequestPath.getPath());
            return aVar.mo19295b(sb.toString(), defines$RequestPath.getPath(), Branch.this.f15576b.mo19317f(), jSONObject);
        }
    }

    /* renamed from: io.branch.referral.Branch$g */
    public interface C7018g {
        /* renamed from: a */
        boolean mo19216a();
    }

    /* renamed from: io.branch.referral.Branch$h */
    public interface C7019h {
    }

    /* renamed from: io.branch.referral.Branch$i */
    public static class C7020i {

        /* renamed from: a */
        public C7016e f15603a;

        /* renamed from: b */
        public boolean f15604b;

        /* renamed from: c */
        public Uri f15605c;

        /* renamed from: d */
        public boolean f15606d;

        public C7020i(Activity activity) {
            Branch j = Branch.m13575j();
            if (activity == null) {
                return;
            }
            if (j.mo19196i() == null || !j.mo19196i().getLocalClassName().equals(activity.getLocalClassName())) {
                j.f15586l = new WeakReference<>(activity);
            }
        }

        /* renamed from: a */
        public final void mo19217a() {
            Branch j = Branch.m13575j();
            if (j != null) {
                Activity i = j.mo19196i();
                C7087w wVar = null;
                Intent intent = i != null ? i.getIntent() : null;
                if (!(i == null || intent == null)) {
                    int i2 = C8077a.f17593c;
                    if (i.getReferrer() != null) {
                        C7077r.m13677h(i).mo19335y("bnc_initial_referrer", i.getReferrer().toString());
                    }
                }
                Uri uri = this.f15605c;
                if (uri != null) {
                    j.mo19204u(uri, i);
                } else if (this.f15606d && Branch.m13578p(intent)) {
                    j.mo19204u(intent != null ? intent.getData() : null, i);
                } else if (this.f15606d) {
                    C7016e eVar = this.f15603a;
                    if (eVar != null) {
                        eVar.mo19214a((JSONObject) null, new C7032d("", -119));
                        return;
                    }
                    return;
                }
                if (j.f15594t) {
                    j.f15594t = false;
                    C7016e eVar2 = this.f15603a;
                    if (eVar2 != null) {
                        eVar2.mo19214a(j.mo19197k(), (C7032d) null);
                    }
                    j.mo19193a(Defines$Jsonkey.InstantDeepLinkSession.getKey(), "true");
                    j.mo19194c();
                    this.f15603a = null;
                }
                C7016e eVar3 = this.f15603a;
                boolean z = this.f15604b;
                C7087w b0Var = j.f15576b.mo19322l().equals("bnc_no_value") ^ true ? new C7029b0(j.f15578d, eVar3, z) : new C7027a0(j.f15578d, eVar3, z);
                if (j.f15576b.mo19317f() == null || j.f15576b.mo19317f().equalsIgnoreCase("bnc_no_value")) {
                    j.f15584j = SESSION_STATE.UNINITIALISED;
                    C7016e eVar4 = b0Var.f15773k;
                    if (eVar4 != null) {
                        eVar4.mo19214a((JSONObject) null, new C7032d("Trouble initializing Branch.", -114));
                    }
                    C7077r.m13675a("Warning: Please enter your branch_key in your project's manifest");
                    return;
                }
                if (C7058n.f15709a) {
                    C7077r.m13675a("Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
                }
                SESSION_STATE session_state = j.f15584j;
                SESSION_STATE session_state2 = SESSION_STATE.UNINITIALISED;
                if (session_state == session_state2) {
                    j.f15576b.mo19328r("bnc_external_intent_uri").equals("bnc_no_value");
                }
                Intent intent2 = j.mo19196i() != null ? j.mo19196i().getIntent() : null;
                boolean p = Branch.m13578p(intent2);
                if (j.f15584j == session_state2 || p) {
                    if (p && intent2 != null) {
                        intent2.removeExtra(Defines$IntentKeys.ForceNewBranchSession.getKey());
                    }
                    j.f15584j = SESSION_STATE.INITIALISING;
                    if (j.f15583i != INTENT_STATE.READY && (!Branch.f15572x)) {
                        b0Var.mo19244a(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
                    }
                    if (Branch.f15574z && (b0Var instanceof C7027a0)) {
                        if (!C7039g0.f15657d) {
                            j.f15590p = true;
                            b0Var.mo19244a(ServerRequest.PROCESS_WAIT_LOCK.GOOGLE_INSTALL_REFERRER_FETCH_WAIT_LOCK);
                        }
                        if (Branch.m13573f("com.huawei.hms.ads.installreferrer.api.InstallReferrerClient") && !C7046j0.f15671d) {
                            j.f15589o = true;
                            b0Var.mo19244a(ServerRequest.PROCESS_WAIT_LOCK.HUAWEI_INSTALL_REFERRER_FETCH_WAIT_LOCK);
                        }
                        if (Branch.m13573f("com.sec.android.app.samsungapps.installreferrer.api.InstallReferrerClient") && !C7056m0.f15704d) {
                            j.f15591q = true;
                            b0Var.mo19244a(ServerRequest.PROCESS_WAIT_LOCK.SAMSUNG_INSTALL_REFERRER_FETCH_WAIT_LOCK);
                        }
                        if (Branch.m13573f("com.miui.referrer.api.GetAppsReferrerClient") && !C7070p0.f15743d) {
                            j.f15592r = true;
                            b0Var.mo19244a(ServerRequest.PROCESS_WAIT_LOCK.XIAOMI_INSTALL_REFERRER_FETCH_WAIT_LOCK);
                        }
                        if (j.f15590p) {
                            Context context = j.f15578d;
                            C7039g0.f15656c = j;
                            C7039g0.f15657d = true;
                            InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                            build.startConnection(new C7035e0(build, context));
                            new Timer().schedule(new C7037f0(), 1500);
                        }
                        if (j.f15589o) {
                            C7046j0.m13640u0(j.f15578d, j);
                        }
                        if (j.f15591q) {
                            Context context2 = j.f15578d;
                            C7056m0.f15704d = true;
                            C7056m0.f15703c = j;
                            try {
                                Class<?> cls = Class.forName("com.sec.android.app.samsungapps.installreferrer.api.InstallReferrerClient");
                                Object invoke = Class.forName("com.sec.android.app.samsungapps.installreferrer.api.InstallReferrerClient$Builder").getMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]).invoke(cls.getMethod("newBuilder", new Class[]{Context.class}).invoke(cls, new Object[]{context2}), new Object[0]);
                                Class<?> cls2 = Class.forName("com.sec.android.app.samsungapps.installreferrer.api.InstallReferrerStateListener");
                                cls.getMethod("startConnection", new Class[]{cls2}).invoke(invoke, new Object[]{(Proxy) Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new C7049k0(cls, invoke, context2))});
                                new Timer().schedule(new C7054l0(), 1500);
                            } catch (Exception e) {
                                C7077r.m13675a(e.getMessage());
                                e.printStackTrace();
                                C7056m0.f15705e = true;
                                C7056m0.m13646u0();
                            }
                        }
                        if (j.f15592r) {
                            Context context3 = j.f15578d;
                            C7070p0.f15743d = true;
                            C7070p0.f15742c = j;
                            try {
                                Class<?> cls3 = Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
                                Class<?> cls4 = Class.forName("com.miui.referrer.api.GetAppsReferrerClient$Builder");
                                Object invoke2 = cls4.getMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]).invoke(cls4.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context3}), new Object[0]);
                                Class<?> cls5 = Class.forName("com.miui.referrer.api.GetAppsReferrerStateListener");
                                cls3.getMethod("startConnection", new Class[]{cls5}).invoke(invoke2, new Object[]{(Proxy) Proxy.newProxyInstance(cls5.getClassLoader(), new Class[]{cls5}, new C7060n0(cls3, invoke2, context3))});
                            } catch (Exception e2) {
                                C7077r.m13675a(e2.getMessage());
                                e2.printStackTrace();
                                C7070p0.f15744e = true;
                                C7070p0.m13662u0();
                            }
                            new Timer().schedule(new C7068o0(), 1500);
                        }
                        if (C7039g0.f15658e) {
                            b0Var.f15620f.remove(ServerRequest.PROCESS_WAIT_LOCK.GOOGLE_INSTALL_REFERRER_FETCH_WAIT_LOCK);
                        }
                        if (C7056m0.f15705e) {
                            b0Var.f15620f.remove(ServerRequest.PROCESS_WAIT_LOCK.SAMSUNG_INSTALL_REFERRER_FETCH_WAIT_LOCK);
                        }
                        if (C7070p0.f15744e) {
                            b0Var.f15620f.remove(ServerRequest.PROCESS_WAIT_LOCK.XIAOMI_INSTALL_REFERRER_FETCH_WAIT_LOCK);
                        }
                    }
                    if (j.f15588n) {
                        b0Var.mo19244a(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
                    }
                    C7089y yVar = j.f15580f;
                    yVar.getClass();
                    synchronized (C7089y.f15776e) {
                        Iterator<ServerRequest> it = yVar.f15779c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ServerRequest next = it.next();
                            if (next instanceof C7087w) {
                                C7087w wVar2 = (C7087w) next;
                                if (wVar2.f15774l) {
                                    wVar = wVar2;
                                    break;
                                }
                            }
                        }
                    }
                    if (wVar == null) {
                        if (j.f15581g == 0) {
                            j.f15580f.mo19387a(b0Var, 0);
                        } else {
                            j.f15580f.mo19387a(b0Var, 1);
                        }
                        j.mo19203t();
                        return;
                    }
                    wVar.f15773k = b0Var.f15773k;
                    return;
                }
                C7016e eVar5 = b0Var.f15773k;
                if (eVar5 != null) {
                    eVar5.mo19214a((JSONObject) null, new C7032d("Warning.", -118));
                }
            } else if (!TextUtils.isEmpty("Branch is not setup properly, make sure to call getAutoInstance in your application class or declare BranchApp in your manifest.")) {
                Log.i("BranchSDK", "Branch is not setup properly, make sure to call getAutoInstance in your application class or declare BranchApp in your manifest.");
            }
        }
    }

    public Branch(Context context) {
        this.f15578d = context;
        this.f15576b = C7077r.m13677h(context);
        C7078r0 r0Var = new C7078r0(context);
        this.f15596v = r0Var;
        this.f15575a = new C7062a(this);
        C7072q qVar = new C7072q(context);
        this.f15577c = qVar;
        new ConcurrentHashMap();
        if (C7089y.f15775d == null) {
            synchronized (C7089y.class) {
                if (C7089y.f15775d == null) {
                    C7089y.f15775d = new C7089y(context);
                }
            }
        }
        this.f15580f = C7089y.f15775d;
        if (!r0Var.f15762a) {
            this.f15588n = qVar.f15748a.mo19311g(context, this);
        }
    }

    /* renamed from: b */
    public static void m13570b(CountDownLatch countDownLatch, int i, C7014d dVar) {
        try {
            if (!countDownLatch.await((long) i, TimeUnit.MILLISECONDS)) {
                dVar.cancel(true);
                dVar.f15598a.mo19247f();
                dVar.mo19209a(new C7031c0(-120));
            }
        } catch (InterruptedException unused) {
            dVar.cancel(true);
            dVar.f15598a.mo19247f();
            dVar.mo19209a(new C7031c0(-120));
        }
    }

    /* renamed from: d */
    public static boolean m13571d(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_keys") != null) {
            for (String has : activityInfo.metaData.getString("io.branch.sdk.auto_link_keys").split(",")) {
                if (jSONObject.has(has)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e A[LOOP:0: B:13:0x0046->B:30:0x008e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13572e(org.json.JSONObject r9, android.content.pm.ActivityInfo r10) {
        /*
            io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.AndroidDeepLinkPath     // Catch:{ JSONException -> 0x002a }
            java.lang.String r1 = r0.getKey()     // Catch:{ JSONException -> 0x002a }
            boolean r1 = r9.has(r1)     // Catch:{ JSONException -> 0x002a }
            if (r1 == 0) goto L_0x0015
            java.lang.String r0 = r0.getKey()     // Catch:{ JSONException -> 0x002a }
            java.lang.String r9 = r9.getString(r0)     // Catch:{ JSONException -> 0x002a }
            goto L_0x002b
        L_0x0015:
            io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.DeepLinkPath     // Catch:{ JSONException -> 0x002a }
            java.lang.String r1 = r0.getKey()     // Catch:{ JSONException -> 0x002a }
            boolean r1 = r9.has(r1)     // Catch:{ JSONException -> 0x002a }
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r0.getKey()     // Catch:{ JSONException -> 0x002a }
            java.lang.String r9 = r9.getString(r0)     // Catch:{ JSONException -> 0x002a }
            goto L_0x002b
        L_0x002a:
            r9 = 0
        L_0x002b:
            android.os.Bundle r0 = r10.metaData
            java.lang.String r1 = "io.branch.sdk.auto_link_path"
            java.lang.String r0 = r0.getString(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0091
            if (r9 == 0) goto L_0x0091
            android.os.Bundle r10 = r10.metaData
            java.lang.String r10 = r10.getString(r1)
            java.lang.String r0 = ","
            java.lang.String[] r10 = r10.split(r0)
            int r0 = r10.length
            r1 = r2
        L_0x0046:
            if (r1 >= r0) goto L_0x0091
            r3 = r10[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = "\\?"
            java.lang.String[] r3 = r3.split(r4)
            r3 = r3[r2]
            java.lang.String r5 = "/"
            java.lang.String[] r3 = r3.split(r5)
            java.lang.String[] r4 = r9.split(r4)
            r4 = r4[r2]
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r3.length
            int r6 = r4.length
            r7 = 1
            if (r5 == r6) goto L_0x006c
            goto L_0x0085
        L_0x006c:
            r5 = r2
        L_0x006d:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x008a
            int r6 = r4.length
            if (r5 >= r6) goto L_0x008a
            r6 = r3[r5]
            r8 = r4[r5]
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0087
            java.lang.String r8 = "*"
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x0087
        L_0x0085:
            r3 = r2
            goto L_0x008b
        L_0x0087:
            int r5 = r5 + 1
            goto L_0x006d
        L_0x008a:
            r3 = r7
        L_0x008b:
            if (r3 == 0) goto L_0x008e
            return r7
        L_0x008e:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0091:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.Branch.m13572e(org.json.JSONObject, android.content.pm.ActivityInfo):boolean");
    }

    /* renamed from: f */
    public static boolean m13573f(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            C7077r.m13675a("Could not find " + str + ". If expected, import the dependency into your app.");
            return false;
        }
    }

    /* renamed from: h */
    public static synchronized void m13574h(Context context) {
        synchronized (Branch.class) {
            if (f15568A == null) {
                C7058n.f15709a = C7058n.m13647a(context);
                Branch m = m13576m(context, C7058n.m13648b(context));
                f15568A = m;
                C20203a.m34520C(m, context);
            }
        }
    }

    /* renamed from: j */
    public static synchronized Branch m13575j() {
        Branch branch;
        synchronized (Branch.class) {
            if (f15568A == null) {
                C7077r.m13675a("Branch instance is not created yet. Make sure you call getAutoInstance(Context).");
            }
            branch = f15568A;
        }
        return branch;
    }

    /* renamed from: m */
    public static synchronized Branch m13576m(Context context, String str) {
        synchronized (Branch.class) {
            if (f15568A != null) {
                C7077r.m13675a("Warning, attempted to reinitialize Branch SDK singleton!");
                Branch branch = f15568A;
                return branch;
            }
            f15568A = new Branch(context.getApplicationContext());
            if (TextUtils.isEmpty(str)) {
                C7077r.m13675a("Warning: Please enter your branch_key in your project's Manifest file!");
                f15568A.f15576b.mo19331u("bnc_no_value");
            } else {
                f15568A.f15576b.mo19331u(str);
            }
            if (context instanceof Application) {
                f15568A.mo19205v((Application) context);
            }
            Branch branch2 = f15568A;
            return branch2;
        }
    }

    /* renamed from: o */
    public static boolean m13577o(Activity activity) {
        return (activity == null || activity.getIntent() == null || !activity.getIntent().getBooleanExtra(Defines$IntentKeys.BranchLinkUsed.getKey(), false)) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13578p(android.content.Intent r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x000e
            io.branch.referral.Defines$IntentKeys r1 = p145io.branch.referral.Defines$IntentKeys.ForceNewBranchSession
            java.lang.String r1 = r1.getKey()
            boolean r1 = r4.getBooleanExtra(r1, r0)
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            r2 = 1
            if (r1 != 0) goto L_0x0037
            if (r4 == 0) goto L_0x0034
            io.branch.referral.Defines$IntentKeys r1 = p145io.branch.referral.Defines$IntentKeys.BranchURI
            java.lang.String r1 = r1.getKey()
            java.lang.String r1 = r4.getStringExtra(r1)
            if (r1 == 0) goto L_0x0022
            r1 = r2
            goto L_0x0023
        L_0x0022:
            r1 = r0
        L_0x0023:
            io.branch.referral.Defines$IntentKeys r3 = p145io.branch.referral.Defines$IntentKeys.BranchLinkUsed
            java.lang.String r3 = r3.getKey()
            boolean r4 = r4.getBooleanExtra(r3, r0)
            r4 = r4 ^ r2
            if (r1 == 0) goto L_0x0034
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x0034:
            r4 = r0
        L_0x0035:
            if (r4 == 0) goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.Branch.m13578p(android.content.Intent):boolean");
    }

    /* renamed from: a */
    public final void mo19193a(String str, String str2) {
        this.f15587m.put(str, str2);
    }

    /* renamed from: c */
    public final void mo19194c() {
        ActivityInfo activityInfo;
        Bundle bundle;
        JSONObject k = mo19197k();
        String str = null;
        try {
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.Clicked_Branch_Link;
            if (!k.has(defines$Jsonkey.getKey())) {
                return;
            }
            if (k.getBoolean(defines$Jsonkey.getKey())) {
                if (k.length() > 0) {
                    Bundle bundle2 = this.f15578d.getPackageManager().getApplicationInfo(this.f15578d.getPackageName(), 128).metaData;
                    int i = 0;
                    if (bundle2 == null || !bundle2.getBoolean("io.branch.sdk.auto_link_disable", false)) {
                        ActivityInfo[] activityInfoArr = this.f15578d.getPackageManager().getPackageInfo(this.f15578d.getPackageName(), 129).activities;
                        int i2 = 1501;
                        if (activityInfoArr != null) {
                            int length = activityInfoArr.length;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                activityInfo = activityInfoArr[i];
                                if (activityInfo == null || (bundle = activityInfo.metaData) == null || ((bundle.getString("io.branch.sdk.auto_link_keys") == null && activityInfo.metaData.getString("io.branch.sdk.auto_link_path") == null) || (!m13571d(k, activityInfo) && !m13572e(k, activityInfo)))) {
                                    i++;
                                }
                            }
                            str = activityInfo.name;
                            i2 = activityInfo.metaData.getInt("io.branch.sdk.auto_link_request_code", 1501);
                        }
                        if (str == null || mo19196i() == null) {
                            C7077r.m13675a("No activity reference to launch deep linked activity");
                            return;
                        }
                        Activity i3 = mo19196i();
                        Intent intent = new Intent(i3, Class.forName(str));
                        intent.putExtra(Defines$IntentKeys.AutoDeepLinked.getKey(), "true");
                        intent.putExtra(Defines$Jsonkey.ReferringData.getKey(), k.toString());
                        Iterator<String> keys = k.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            intent.putExtra(next, k.getString(next));
                        }
                        i3.startActivityForResult(intent, i2);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            C7077r.m13675a("Warning: Please make sure Activity names set for auto deep link are correct!");
        } catch (ClassNotFoundException unused2) {
            C7077r.m13675a("Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity " + null);
        } catch (Exception unused3) {
        }
    }

    /* renamed from: g */
    public final String mo19195g(C7082t tVar) {
        boolean z;
        C7031c0 c0Var;
        String str = null;
        if (tVar.f15621g) {
            return null;
        }
        if (!ServerRequest.m13601c(this.f15578d)) {
            tVar.getClass();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (this.f15582h.containsKey(tVar.f15769j)) {
            String str2 = this.f15582h.get(tVar.f15769j);
            tVar.getClass();
            return str2;
        } else if (tVar.f15770k) {
            mo19198l(tVar);
            return null;
        } else if (this.f15596v.f15762a) {
            return tVar.mo19340t();
        } else {
            if (this.f15584j == SESSION_STATE.INITIALISED) {
                try {
                    c0Var = (C7031c0) new C7017f().execute(new ServerRequest[]{tVar}).get((long) (this.f15576b.mo19319i(5500, "bnc_timeout") + RecyclerView.MAX_SCROLL_DURATION), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    c0Var = null;
                }
                if (tVar.f15771l) {
                    str = tVar.mo19340t();
                }
                if (c0Var == null || c0Var.f15640a != 200) {
                    return str;
                }
                try {
                    String string = c0Var.mo19274a().getString("url");
                    C7034e eVar = tVar.f15769j;
                    if (eVar == null) {
                        return string;
                    }
                    this.f15582h.put(eVar, string);
                    return string;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return str;
                }
            } else {
                C7077r.m13675a("Warning: User session has not been initialized");
                return null;
            }
        }
    }

    /* renamed from: i */
    public final Activity mo19196i() {
        WeakReference<Activity> weakReference = this.f15586l;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0108, code lost:
        if (r9 != 4) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo19197k() {
        /*
            r17 = this;
            r1 = r17
            io.branch.referral.r r0 = r1.f15576b
            java.lang.String r2 = "bnc_session_params"
            java.lang.String r0 = r0.mo19328r(r2)
            java.lang.String r2 = "bnc_no_value"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0019
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x0145
        L_0x0019:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0021 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0021 }
            r0 = r2
            goto L_0x0145
        L_0x0021:
            byte[] r0 = r0.getBytes()
            int r2 = r0.length
            int r3 = r2 * 3
            r4 = 4
            int r3 = r3 / r4
            byte[] r5 = new byte[r3]
            int[] r6 = p145io.branch.referral.C7023a.C7025b.f15626b
            r7 = 0
            int r2 = r2 + r7
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        L_0x0034:
            r12 = 3
            r13 = 2
            r14 = 1
            if (r8 >= r2) goto L_0x0102
            if (r9 != 0) goto L_0x0082
        L_0x003b:
            int r15 = r8 + 4
            if (r15 > r2) goto L_0x007e
            byte r10 = r0[r8]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r6[r10]
            int r10 = r10 << 18
            int r16 = r8 + 1
            byte r7 = r0[r16]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r6[r7]
            int r7 = r7 << 12
            r7 = r7 | r10
            int r10 = r8 + 2
            byte r10 = r0[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r6[r10]
            int r10 = r10 << 6
            r7 = r7 | r10
            int r10 = r8 + 3
            byte r10 = r0[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r6[r10]
            r10 = r10 | r7
            if (r10 < 0) goto L_0x007e
            int r7 = r11 + 2
            byte r8 = (byte) r10
            r5[r7] = r8
            int r7 = r11 + 1
            int r8 = r10 >> 8
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r10 >> 16
            byte r7 = (byte) r7
            r5[r11] = r7
            int r11 = r11 + 3
            r8 = r15
            r7 = 0
            goto L_0x003b
        L_0x007e:
            if (r8 < r2) goto L_0x0082
            goto L_0x0102
        L_0x0082:
            int r7 = r8 + 1
            byte r8 = r0[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r6[r8]
            r15 = -1
            if (r9 == 0) goto L_0x00f5
            if (r9 == r14) goto L_0x00ec
            r14 = -2
            if (r9 == r13) goto L_0x00da
            if (r9 == r12) goto L_0x00a9
            if (r9 == r4) goto L_0x009f
            r12 = 5
            if (r9 == r12) goto L_0x009b
            goto L_0x00fe
        L_0x009b:
            if (r8 == r15) goto L_0x00fe
            goto L_0x0123
        L_0x009f:
            if (r8 != r14) goto L_0x00a5
            int r9 = r9 + 1
            goto L_0x00fe
        L_0x00a5:
            if (r8 == r15) goto L_0x00fe
            goto L_0x0123
        L_0x00a9:
            r12 = 5
            if (r8 < 0) goto L_0x00c5
            int r9 = r10 << 6
            r8 = r8 | r9
            int r9 = r11 + 2
            byte r10 = (byte) r8
            r5[r9] = r10
            int r9 = r11 + 1
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r5[r9] = r10
            int r9 = r8 >> 16
            byte r9 = (byte) r9
            r5[r11] = r9
            int r11 = r11 + 3
            r10 = r8
            r9 = 0
            goto L_0x00fe
        L_0x00c5:
            if (r8 != r14) goto L_0x00d7
            int r8 = r11 + 1
            int r9 = r10 >> 2
            byte r9 = (byte) r9
            r5[r8] = r9
            int r8 = r10 >> 10
            byte r8 = (byte) r8
            r5[r11] = r8
            int r11 = r11 + 2
            r9 = r12
            goto L_0x00fe
        L_0x00d7:
            if (r8 == r15) goto L_0x00fe
            goto L_0x0123
        L_0x00da:
            if (r8 < 0) goto L_0x00dd
            goto L_0x00ee
        L_0x00dd:
            if (r8 != r14) goto L_0x00e9
            int r8 = r11 + 1
            int r9 = r10 >> 4
            byte r9 = (byte) r9
            r5[r11] = r9
            r9 = r4
            r11 = r8
            goto L_0x00fe
        L_0x00e9:
            if (r8 == r15) goto L_0x00fe
            goto L_0x0123
        L_0x00ec:
            if (r8 < 0) goto L_0x00f2
        L_0x00ee:
            int r10 = r10 << 6
            r8 = r8 | r10
            goto L_0x00f7
        L_0x00f2:
            if (r8 == r15) goto L_0x00fe
            goto L_0x0123
        L_0x00f5:
            if (r8 < 0) goto L_0x00fb
        L_0x00f7:
            int r9 = r9 + 1
            r10 = r8
            goto L_0x00fe
        L_0x00fb:
            if (r8 == r15) goto L_0x00fe
            goto L_0x0123
        L_0x00fe:
            r8 = r7
            r7 = 0
            goto L_0x0034
        L_0x0102:
            if (r9 == r14) goto L_0x0123
            if (r9 == r13) goto L_0x011a
            if (r9 == r12) goto L_0x010b
            if (r9 == r4) goto L_0x0123
            goto L_0x0125
        L_0x010b:
            int r0 = r11 + 1
            int r2 = r10 >> 10
            byte r2 = (byte) r2
            r5[r11] = r2
            int r11 = r0 + 1
            int r2 = r10 >> 2
            byte r2 = (byte) r2
            r5[r0] = r2
            goto L_0x0125
        L_0x011a:
            int r0 = r11 + 1
            int r2 = r10 >> 4
            byte r2 = (byte) r2
            r5[r11] = r2
            r11 = r0
            goto L_0x0125
        L_0x0123:
            r11 = 0
            r14 = 0
        L_0x0125:
            if (r14 == 0) goto L_0x0146
            if (r11 != r3) goto L_0x012a
            goto L_0x0131
        L_0x012a:
            byte[] r0 = new byte[r11]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r11)
            r5 = r0
        L_0x0131:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013c }
            java.lang.String r2 = new java.lang.String     // Catch:{ JSONException -> 0x013c }
            r2.<init>(r5)     // Catch:{ JSONException -> 0x013c }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x013c }
            goto L_0x0145
        L_0x013c:
            r0 = move-exception
            r0.printStackTrace()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0145:
            return r0
        L_0x0146:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "bad base-64"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.Branch.mo19197k():org.json.JSONObject");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: l */
    public final void mo19198l(p145io.branch.referral.ServerRequest r6) {
        /*
            r5 = this;
            io.branch.referral.r0 r0 = r5.f15596v
            boolean r0 = r0.f15762a
            if (r0 == 0) goto L_0x002f
            boolean r0 = r6.mo19253m()
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "Requested operation cannot be completed since tracking is disabled ["
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            io.branch.referral.Defines$RequestPath r1 = r6.f15616b
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p145io.branch.referral.C7077r.m13675a(r0)
            r0 = -117(0xffffffffffffff8b, float:NaN)
            java.lang.String r1 = ""
            r6.mo19248g(r0, r1)
            return
        L_0x002f:
            io.branch.referral.Branch$SESSION_STATE r0 = r5.f15584j
            io.branch.referral.Branch$SESSION_STATE r1 = p145io.branch.referral.Branch.SESSION_STATE.INITIALISED
            r2 = 1
            if (r0 == r1) goto L_0x0066
            boolean r0 = r6 instanceof p145io.branch.referral.C7087w
            if (r0 != 0) goto L_0x0066
            boolean r1 = r6 instanceof p145io.branch.referral.C7088x
            if (r1 == 0) goto L_0x004b
            r0 = -101(0xffffffffffffff9b, float:NaN)
            java.lang.String r1 = ""
            r6.mo19248g(r0, r1)
            java.lang.String r6 = "Branch is not initialized, cannot logout"
            p145io.branch.referral.C7077r.m13675a(r6)
            return
        L_0x004b:
            boolean r1 = r6 instanceof p145io.branch.referral.C7090z
            if (r1 == 0) goto L_0x0055
            java.lang.String r6 = "Branch is not initialized, cannot close session"
            p145io.branch.referral.C7077r.m13675a(r6)
            return
        L_0x0055:
            r1 = 0
            if (r0 == 0) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            boolean r0 = r6 instanceof p145io.branch.referral.C7082t
            if (r0 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            if (r1 == 0) goto L_0x0066
            io.branch.referral.ServerRequest$PROCESS_WAIT_LOCK r0 = p145io.branch.referral.ServerRequest.PROCESS_WAIT_LOCK.SDK_INIT_WAIT_LOCK
            r6.mo19244a(r0)
        L_0x0066:
            io.branch.referral.y r0 = r5.f15580f
            r0.getClass()
            java.lang.Object r1 = p145io.branch.referral.C7089y.f15776e
            monitor-enter(r1)
            java.util.List<io.branch.referral.ServerRequest> r3 = r0.f15779c     // Catch:{ all -> 0x0095 }
            r3.add(r6)     // Catch:{ all -> 0x0095 }
            monitor-enter(r1)     // Catch:{ all -> 0x0095 }
            java.util.List<io.branch.referral.ServerRequest> r3 = r0.f15779c     // Catch:{ all -> 0x0092 }
            int r3 = r3.size()     // Catch:{ all -> 0x0092 }
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            r4 = 25
            if (r3 < r4) goto L_0x0084
            java.util.List<io.branch.referral.ServerRequest> r3 = r0.f15779c     // Catch:{ all -> 0x0095 }
            r3.remove(r2)     // Catch:{ all -> 0x0095 }
        L_0x0084:
            r0.mo19388b()     // Catch:{ all -> 0x0095 }
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
            long r0 = java.lang.System.currentTimeMillis()
            r6.f15618d = r0
            r5.mo19203t()
            return
        L_0x0092:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            throw r6     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.Branch.mo19198l(io.branch.referral.ServerRequest):void");
    }

    /* renamed from: n */
    public final boolean mo19199n() {
        return Boolean.parseBoolean(this.f15587m.get(Defines$Jsonkey.InstantDeepLinkSession.getKey()));
    }

    /* renamed from: q */
    public final void mo19200q() {
        this.f15588n = false;
        this.f15580f.mo19390d(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        if (this.f15593s) {
            mo19202s();
            this.f15593s = false;
            return;
        }
        mo19203t();
    }

    /* renamed from: r */
    public final void mo19201r(String str) {
        if (C7087w.m13721t(str)) {
            mo19194c();
        }
    }

    /* renamed from: s */
    public final void mo19202s() {
        if (!this.f15596v.f15762a && this.f15578d != null) {
            C7089y yVar = this.f15580f;
            yVar.getClass();
            synchronized (C7089y.f15776e) {
                for (ServerRequest next : yVar.f15779c) {
                    if (next != null && (next instanceof C7087w)) {
                        next.mo19244a(ServerRequest.PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
                    }
                }
            }
            if (C7050l.f15681i == null) {
                C7050l.f15681i = new C7050l();
            }
            C7050l lVar = C7050l.f15681i;
            Context context = this.f15578d;
            String str = f15569B;
            C7072q qVar = this.f15577c;
            C7077r rVar = this.f15576b;
            C7011a aVar = new C7011a();
            lVar.f15685d = false;
            if (System.currentTimeMillis() - rVar.mo19321k("bnc_branch_strong_match_time") < 2592000000L) {
                C7050l.m13643b(aVar, lVar.f15685d);
            } else if (!lVar.f15684c) {
                C7050l.m13643b(aVar, lVar.f15685d);
            } else {
                try {
                    qVar.mo19309b();
                    Uri a = C7050l.m13642a(str, qVar, rVar, context);
                    if (a != null) {
                        lVar.f15683b.postDelayed(new C7045j(lVar, aVar), 500);
                        Method method = lVar.f15686e.getMethod("warmup", new Class[]{Long.TYPE});
                        Method method2 = lVar.f15686e.getMethod("newSession", new Class[]{lVar.f15687f});
                        Method method3 = lVar.f15688g.getMethod("mayLaunchUrl", new Class[]{Uri.class, Bundle.class, List.class});
                        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                        intent.setPackage(BrowserPackages.CHROME_PACKAGE);
                        context.bindService(intent, new C7048k(lVar, method, method2, a, method3, rVar, aVar), 33);
                        return;
                    }
                    C7050l.m13643b(aVar, lVar.f15685d);
                } catch (Exception unused) {
                    C7050l.m13643b(aVar, lVar.f15685d);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094 A[Catch:{ Exception -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e9 A[Catch:{ Exception -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7 A[Catch:{ Exception -> 0x010f }] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19203t() {
        /*
            r7 = this;
            java.util.concurrent.Semaphore r0 = r7.f15579e     // Catch:{ Exception -> 0x010f }
            r0.acquire()     // Catch:{ Exception -> 0x010f }
            int r0 = r7.f15581g     // Catch:{ Exception -> 0x010f }
            if (r0 != 0) goto L_0x0109
            io.branch.referral.y r0 = r7.f15580f     // Catch:{ Exception -> 0x010f }
            r0.getClass()     // Catch:{ Exception -> 0x010f }
            java.lang.Object r1 = p145io.branch.referral.C7089y.f15776e     // Catch:{ Exception -> 0x010f }
            monitor-enter(r1)     // Catch:{ Exception -> 0x010f }
            java.util.List<io.branch.referral.ServerRequest> r0 = r0.f15779c     // Catch:{ all -> 0x0106 }
            int r0 = r0.size()     // Catch:{ all -> 0x0106 }
            monitor-exit(r1)     // Catch:{ all -> 0x0106 }
            if (r0 <= 0) goto L_0x0109
            r0 = 1
            r7.f15581g = r0     // Catch:{ Exception -> 0x010f }
            io.branch.referral.y r2 = r7.f15580f     // Catch:{ Exception -> 0x010f }
            r2.getClass()     // Catch:{ Exception -> 0x010f }
            monitor-enter(r1)     // Catch:{ Exception -> 0x010f }
            r3 = 0
            r4 = 0
            java.util.List<io.branch.referral.ServerRequest> r2 = r2.f15779c     // Catch:{ IndexOutOfBoundsException | NoSuchElementException -> 0x0031 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ IndexOutOfBoundsException | NoSuchElementException -> 0x0031 }
            io.branch.referral.ServerRequest r2 = (p145io.branch.referral.ServerRequest) r2     // Catch:{ IndexOutOfBoundsException | NoSuchElementException -> 0x0031 }
            goto L_0x0032
        L_0x002e:
            r0 = move-exception
            goto L_0x0104
        L_0x0031:
            r2 = r3
        L_0x0032:
            monitor-exit(r1)     // Catch:{ all -> 0x002e }
            java.util.concurrent.Semaphore r1 = r7.f15579e     // Catch:{ Exception -> 0x010f }
            r1.release()     // Catch:{ Exception -> 0x010f }
            if (r2 == 0) goto L_0x00fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010f }
            r1.<init>()     // Catch:{ Exception -> 0x010f }
            java.lang.String r3 = "processNextQueueItem, req "
            r1.append(r3)     // Catch:{ Exception -> 0x010f }
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x010f }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ Exception -> 0x010f }
            r1.append(r3)     // Catch:{ Exception -> 0x010f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x010f }
            p145io.branch.referral.C7077r.m13675a(r1)     // Catch:{ Exception -> 0x010f }
            java.util.HashSet r1 = r2.f15620f     // Catch:{ Exception -> 0x010f }
            int r1 = r1.size()     // Catch:{ Exception -> 0x010f }
            if (r1 <= 0) goto L_0x0060
            r1 = r0
            goto L_0x0061
        L_0x0060:
            r1 = r4
        L_0x0061:
            if (r1 != 0) goto L_0x00fb
            boolean r1 = r2 instanceof p145io.branch.referral.C7027a0     // Catch:{ Exception -> 0x010f }
            r3 = -101(0xffffffffffffff9b, float:NaN)
            if (r1 != 0) goto L_0x0086
            io.branch.referral.r r1 = r7.f15576b     // Catch:{ Exception -> 0x010f }
            java.lang.String r1 = r1.mo19322l()     // Catch:{ Exception -> 0x010f }
            java.lang.String r5 = "bnc_no_value"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x010f }
            r1 = r1 ^ r0
            if (r1 != 0) goto L_0x0086
            java.lang.String r0 = "Branch Error: User session has not been initialized!"
            p145io.branch.referral.C7077r.m13675a(r0)     // Catch:{ Exception -> 0x010f }
            r7.f15581g = r4     // Catch:{ Exception -> 0x010f }
            java.lang.String r0 = ""
            r2.mo19248g(r3, r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x0113
        L_0x0086:
            boolean r1 = r2 instanceof p145io.branch.referral.C7087w     // Catch:{ Exception -> 0x010f }
            if (r1 == 0) goto L_0x008c
        L_0x008a:
            r1 = r4
            goto L_0x0092
        L_0x008c:
            boolean r1 = r2 instanceof p145io.branch.referral.C7082t     // Catch:{ Exception -> 0x010f }
            if (r1 == 0) goto L_0x0091
            goto L_0x008a
        L_0x0091:
            r1 = r0
        L_0x0092:
            if (r1 == 0) goto L_0x00bd
            io.branch.referral.r r1 = r7.f15576b     // Catch:{ Exception -> 0x010f }
            java.lang.String r1 = r1.mo19327q()     // Catch:{ Exception -> 0x010f }
            java.lang.String r5 = "bnc_no_value"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x010f }
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x00b2
            io.branch.referral.r r1 = r7.f15576b     // Catch:{ Exception -> 0x010f }
            java.lang.String r1 = r1.mo19323m()     // Catch:{ Exception -> 0x010f }
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x010f }
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x00b2
            r1 = r0
            goto L_0x00b3
        L_0x00b2:
            r1 = r4
        L_0x00b3:
            if (r1 != 0) goto L_0x00bd
            r7.f15581g = r4     // Catch:{ Exception -> 0x010f }
            java.lang.String r0 = ""
            r2.mo19248g(r3, r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x0113
        L_0x00bd:
            io.branch.referral.r r1 = r7.f15576b     // Catch:{ Exception -> 0x010f }
            r3 = 5500(0x157c, float:7.707E-42)
            java.lang.String r5 = "bnc_timeout"
            int r3 = r1.mo19319i(r3, r5)     // Catch:{ Exception -> 0x010f }
            r5 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r6 = "bnc_connect_timeout"
            int r1 = r1.mo19319i(r5, r6)     // Catch:{ Exception -> 0x010f }
            int r1 = r1 + r3
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch     // Catch:{ Exception -> 0x010f }
            r3.<init>(r0)     // Catch:{ Exception -> 0x010f }
            io.branch.referral.Branch$d r0 = new io.branch.referral.Branch$d     // Catch:{ Exception -> 0x010f }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x010f }
            java.lang.Void[] r2 = new java.lang.Void[r4]     // Catch:{ Exception -> 0x010f }
            r0.executeTask(r2)     // Catch:{ Exception -> 0x010f }
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x010f }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x010f }
            if (r2 != r4) goto L_0x00f7
            java.lang.Thread r2 = new java.lang.Thread     // Catch:{ Exception -> 0x010f }
            io.branch.referral.b r4 = new io.branch.referral.b     // Catch:{ Exception -> 0x010f }
            r4.<init>(r7, r3, r1, r0)     // Catch:{ Exception -> 0x010f }
            r2.<init>(r4)     // Catch:{ Exception -> 0x010f }
            r2.start()     // Catch:{ Exception -> 0x010f }
            goto L_0x0113
        L_0x00f7:
            m13570b(r3, r1, r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x0113
        L_0x00fb:
            r7.f15581g = r4     // Catch:{ Exception -> 0x010f }
            goto L_0x0113
        L_0x00fe:
            io.branch.referral.y r0 = r7.f15580f     // Catch:{ Exception -> 0x010f }
            r0.mo19389c(r3)     // Catch:{ Exception -> 0x010f }
            goto L_0x0113
        L_0x0104:
            monitor-exit(r1)     // Catch:{ all -> 0x002e }
            throw r0     // Catch:{ Exception -> 0x010f }
        L_0x0106:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ Exception -> 0x010f }
        L_0x0109:
            java.util.concurrent.Semaphore r0 = r7.f15579e     // Catch:{ Exception -> 0x010f }
            r0.release()     // Catch:{ Exception -> 0x010f }
            goto L_0x0113
        L_0x010f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.Branch.mo19203t():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19204u(android.net.Uri r10, android.app.Activity r11) {
        /*
            r9 = this;
            io.branch.referral.Branch$INTENT_STATE r0 = r9.f15583i
            io.branch.referral.Branch$INTENT_STATE r1 = p145io.branch.referral.Branch.INTENT_STATE.READY
            if (r0 != r1) goto L_0x01fc
            r0 = 0
            boolean r1 = m13577o(r11)     // Catch:{ Exception -> 0x0076 }
            if (r1 != 0) goto L_0x0076
            android.content.Context r1 = r9.f15578d     // Catch:{ Exception -> 0x0076 }
            io.branch.referral.s0 r2 = p145io.branch.referral.C7080s0.f15765d     // Catch:{ Exception -> 0x0076 }
            if (r2 != 0) goto L_0x001a
            io.branch.referral.s0 r2 = new io.branch.referral.s0     // Catch:{ Exception -> 0x0076 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0076 }
            p145io.branch.referral.C7080s0.f15765d = r2     // Catch:{ Exception -> 0x0076 }
        L_0x001a:
            io.branch.referral.s0 r1 = p145io.branch.referral.C7080s0.f15765d     // Catch:{ Exception -> 0x0076 }
            java.lang.String r2 = r10.toString()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = r1.mo19336a(r2)     // Catch:{ Exception -> 0x0076 }
            io.branch.referral.r r2 = r9.f15576b     // Catch:{ Exception -> 0x0076 }
            java.lang.String r3 = "bnc_external_intent_uri"
            r2.mo19335y(r3, r1)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r2 = r10.toString()     // Catch:{ Exception -> 0x0076 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0076 }
            if (r1 == 0) goto L_0x0076
            android.content.Intent r1 = r11.getIntent()     // Catch:{ Exception -> 0x0076 }
            android.os.Bundle r1 = r1.getExtras()     // Catch:{ Exception -> 0x0076 }
            java.util.Set r2 = r1.keySet()     // Catch:{ Exception -> 0x0076 }
            boolean r3 = r2.isEmpty()     // Catch:{ Exception -> 0x0076 }
            if (r3 == 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0076 }
            r3.<init>()     // Catch:{ Exception -> 0x0076 }
            java.lang.String[] r4 = f15570C     // Catch:{ Exception -> 0x0076 }
            int r5 = r4.length     // Catch:{ Exception -> 0x0076 }
            r6 = r0
        L_0x0051:
            if (r6 >= r5) goto L_0x0065
            r7 = r4[r6]     // Catch:{ Exception -> 0x0076 }
            boolean r8 = r2.contains(r7)     // Catch:{ Exception -> 0x0076 }
            if (r8 == 0) goto L_0x0062
            java.lang.Object r8 = r1.get(r7)     // Catch:{ Exception -> 0x0076 }
            r3.put(r7, r8)     // Catch:{ Exception -> 0x0076 }
        L_0x0062:
            int r6 = r6 + 1
            goto L_0x0051
        L_0x0065:
            int r1 = r3.length()     // Catch:{ Exception -> 0x0076 }
            if (r1 <= 0) goto L_0x0076
            io.branch.referral.r r1 = r9.f15576b     // Catch:{ Exception -> 0x0076 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r3 = "bnc_external_intent_extra"
            r1.mo19335y(r3, r2)     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            r1 = 1
            if (r11 == 0) goto L_0x00d3
            android.content.Intent r2 = r11.getIntent()     // Catch:{ Exception -> 0x00d3 }
            if (r2 == 0) goto L_0x00d3
            android.content.Intent r2 = r11.getIntent()     // Catch:{ Exception -> 0x00d3 }
            android.os.Bundle r2 = r2.getExtras()     // Catch:{ Exception -> 0x00d3 }
            if (r2 == 0) goto L_0x00d3
            boolean r2 = m13577o(r11)     // Catch:{ Exception -> 0x00d3 }
            if (r2 != 0) goto L_0x00d3
            android.content.Intent r2 = r11.getIntent()     // Catch:{ Exception -> 0x00d3 }
            android.os.Bundle r2 = r2.getExtras()     // Catch:{ Exception -> 0x00d3 }
            io.branch.referral.Defines$IntentKeys r3 = p145io.branch.referral.Defines$IntentKeys.BranchURI     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r3 = r3.getKey()     // Catch:{ Exception -> 0x00d3 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00d3 }
            r3 = 0
            boolean r4 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x00d3 }
            if (r4 == 0) goto L_0x00aa
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00b4
        L_0x00aa:
            boolean r4 = r2 instanceof android.net.Uri     // Catch:{ Exception -> 0x00d3 }
            if (r4 == 0) goto L_0x00b4
            android.net.Uri r2 = (android.net.Uri) r2     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r3 = r2.toString()     // Catch:{ Exception -> 0x00d3 }
        L_0x00b4:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00d3 }
            if (r2 != 0) goto L_0x00d3
            io.branch.referral.r r2 = r9.f15576b     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r4 = "bnc_push_identifier"
            r2.mo19335y(r4, r3)     // Catch:{ Exception -> 0x00d3 }
            android.content.Intent r2 = r11.getIntent()     // Catch:{ Exception -> 0x00d3 }
            io.branch.referral.Defines$IntentKeys r3 = p145io.branch.referral.Defines$IntentKeys.BranchLinkUsed     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r3 = r3.getKey()     // Catch:{ Exception -> 0x00d3 }
            r2.putExtra(r3, r1)     // Catch:{ Exception -> 0x00d3 }
            r11.setIntent(r2)     // Catch:{ Exception -> 0x00d3 }
            r2 = r1
            goto L_0x00d4
        L_0x00d3:
            r2 = r0
        L_0x00d4:
            if (r2 == 0) goto L_0x00d7
            return
        L_0x00d7:
            if (r11 == 0) goto L_0x00ee
            android.content.Intent r2 = r11.getIntent()
            if (r2 == 0) goto L_0x00ee
            android.content.Intent r2 = r11.getIntent()
            int r2 = r2.getFlags()
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00ee
            r2 = r1
            goto L_0x00ef
        L_0x00ee:
            r2 = r0
        L_0x00ef:
            if (r2 != 0) goto L_0x01fc
            if (r10 == 0) goto L_0x0190
            boolean r2 = r10.isHierarchical()     // Catch:{ Exception -> 0x0190 }
            if (r2 != 0) goto L_0x00fb
            goto L_0x0190
        L_0x00fb:
            io.branch.referral.Defines$Jsonkey r2 = p145io.branch.referral.Defines$Jsonkey.LinkClickID     // Catch:{ Exception -> 0x0190 }
            java.lang.String r2 = r2.getKey()     // Catch:{ Exception -> 0x0190 }
            java.lang.String r2 = r10.getQueryParameter(r2)     // Catch:{ Exception -> 0x0190 }
            if (r2 != 0) goto L_0x0109
            goto L_0x0190
        L_0x0109:
            io.branch.referral.r r3 = r9.f15576b     // Catch:{ Exception -> 0x0190 }
            java.lang.String r4 = "bnc_link_click_identifier"
            r3.mo19335y(r4, r2)     // Catch:{ Exception -> 0x0190 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0190 }
            r3.<init>()     // Catch:{ Exception -> 0x0190 }
            java.lang.String r4 = "link_click_id="
            r3.append(r4)     // Catch:{ Exception -> 0x0190 }
            r3.append(r2)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0190 }
            java.lang.String r3 = r10.toString()     // Catch:{ Exception -> 0x0190 }
            java.lang.String r4 = r10.getQuery()     // Catch:{ Exception -> 0x0190 }
            boolean r4 = r2.equals(r4)     // Catch:{ Exception -> 0x0190 }
            if (r4 == 0) goto L_0x0141
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0190 }
            r4.<init>()     // Catch:{ Exception -> 0x0190 }
            java.lang.String r5 = "\\?"
            r4.append(r5)     // Catch:{ Exception -> 0x0190 }
            r4.append(r2)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0190 }
            goto L_0x0171
        L_0x0141:
            int r4 = r3.length()     // Catch:{ Exception -> 0x0190 }
            int r5 = r2.length()     // Catch:{ Exception -> 0x0190 }
            int r4 = r4 - r5
            int r5 = r3.indexOf(r2)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r6 = "&"
            if (r4 != r5) goto L_0x0162
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0190 }
            r4.<init>()     // Catch:{ Exception -> 0x0190 }
            r4.append(r6)     // Catch:{ Exception -> 0x0190 }
            r4.append(r2)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0190 }
            goto L_0x0171
        L_0x0162:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0190 }
            r4.<init>()     // Catch:{ Exception -> 0x0190 }
            r4.append(r2)     // Catch:{ Exception -> 0x0190 }
            r4.append(r6)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0190 }
        L_0x0171:
            java.lang.String r4 = ""
            java.lang.String r2 = r3.replaceFirst(r2, r4)     // Catch:{ Exception -> 0x0190 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0190 }
            android.content.Intent r3 = r11.getIntent()     // Catch:{ Exception -> 0x0190 }
            r3.setData(r2)     // Catch:{ Exception -> 0x0190 }
            android.content.Intent r2 = r11.getIntent()     // Catch:{ Exception -> 0x0190 }
            io.branch.referral.Defines$IntentKeys r3 = p145io.branch.referral.Defines$IntentKeys.BranchLinkUsed     // Catch:{ Exception -> 0x0190 }
            java.lang.String r3 = r3.getKey()     // Catch:{ Exception -> 0x0190 }
            r2.putExtra(r3, r1)     // Catch:{ Exception -> 0x0190 }
            r0 = r1
        L_0x0190:
            if (r0 == 0) goto L_0x0193
            return
        L_0x0193:
            if (r10 == 0) goto L_0x01fc
            if (r11 != 0) goto L_0x0198
            goto L_0x01fc
        L_0x0198:
            java.lang.String r0 = r10.getScheme()
            android.content.Intent r2 = r11.getIntent()
            if (r0 == 0) goto L_0x01fc
            if (r2 == 0) goto L_0x01fc
            java.lang.String r3 = "http"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "https"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x01fc
        L_0x01b4:
            java.lang.String r0 = r10.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01fc
            boolean r0 = m13577o(r11)
            if (r0 != 0) goto L_0x01fc
            android.content.Context r0 = r9.f15578d
            io.branch.referral.s0 r3 = p145io.branch.referral.C7080s0.f15765d
            if (r3 != 0) goto L_0x01d1
            io.branch.referral.s0 r3 = new io.branch.referral.s0
            r3.<init>(r0)
            p145io.branch.referral.C7080s0.f15765d = r3
        L_0x01d1:
            io.branch.referral.s0 r0 = p145io.branch.referral.C7080s0.f15765d
            java.lang.String r3 = r10.toString()
            java.lang.String r0 = r0.mo19336a(r3)
            java.lang.String r3 = r10.toString()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x01f0
            io.branch.referral.r r0 = r9.f15576b
            java.lang.String r10 = r10.toString()
            java.lang.String r3 = "bnc_app_link"
            r0.mo19335y(r3, r10)
        L_0x01f0:
            io.branch.referral.Defines$IntentKeys r10 = p145io.branch.referral.Defines$IntentKeys.BranchLinkUsed
            java.lang.String r10 = r10.getKey()
            r2.putExtra(r10, r1)
            r11.setIntent(r2)
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.Branch.mo19204u(android.net.Uri, android.app.Activity):void");
    }

    /* renamed from: v */
    public final void mo19205v(Application application) {
        try {
            C7030c cVar = new C7030c();
            this.f15595u = cVar;
            application.unregisterActivityLifecycleCallbacks(cVar);
            application.registerActivityLifecycleCallbacks(this.f15595u);
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            C7077r.m13675a("" + "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.");
        }
    }

    /* renamed from: w */
    public final void mo19206w() {
        String str;
        if (!this.f15590p && !this.f15589o && !this.f15591q && !this.f15592r) {
            Long l = 0L;
            if (C7039g0.f15660g.longValue() > l.longValue()) {
                l = C7039g0.f15660g;
                str = Defines$Jsonkey.Google_Play_Store.getKey();
            } else {
                str = "";
            }
            if (Long.MIN_VALUE > l.longValue()) {
                l = Long.MIN_VALUE;
                str = Defines$Jsonkey.Huawei_App_Gallery.getKey();
            }
            if (C7056m0.f15707g.longValue() > l.longValue()) {
                l = C7056m0.f15707g;
                str = Defines$Jsonkey.Samsung_Galaxy_Store.getKey();
            }
            if (C7070p0.f15746g.longValue() > l.longValue()) {
                str = Defines$Jsonkey.Xiaomi_Get_Apps.getKey();
            }
            if (str.isEmpty()) {
                if (!TextUtils.isEmpty(C7039g0.f15661h)) {
                    str = Defines$Jsonkey.Google_Play_Store.getKey();
                }
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    str = Defines$Jsonkey.Huawei_App_Gallery.getKey();
                }
                if (!TextUtils.isEmpty(C7056m0.f15708h)) {
                    str = Defines$Jsonkey.Samsung_Galaxy_Store.getKey();
                }
                if (!TextUtils.isEmpty(C7070p0.f15747h)) {
                    str = Defines$Jsonkey.Xiaomi_Get_Apps.getKey();
                }
            }
            Context context = this.f15578d;
            if (str.equals(Defines$Jsonkey.Google_Play_Store.getKey())) {
                C3039b.m7184s0(context, C7039g0.f15661h, C7039g0.f15659f.longValue(), C7039g0.f15660g.longValue(), str);
            }
            if (str.equals(Defines$Jsonkey.Huawei_App_Gallery.getKey())) {
                C3039b.m7184s0(context, (String) null, Long.MIN_VALUE, Long.MIN_VALUE, str);
            }
            if (str.equals(Defines$Jsonkey.Samsung_Galaxy_Store.getKey())) {
                C3039b.m7184s0(context, C7056m0.f15708h, C7056m0.f15706f.longValue(), C7056m0.f15707g.longValue(), str);
            }
            if (str.equals(Defines$Jsonkey.Xiaomi_Get_Apps.getKey())) {
                C3039b.m7184s0(context, C7070p0.f15747h, C7070p0.f15745f.longValue(), C7070p0.f15746g.longValue(), str);
            }
            mo19203t();
        }
    }

    /* renamed from: x */
    public final void mo19207x() {
        int size;
        ServerRequest serverRequest;
        int i = 0;
        while (true) {
            try {
                C7089y yVar = this.f15580f;
                yVar.getClass();
                Object obj = C7089y.f15776e;
                synchronized (obj) {
                    size = yVar.f15779c.size();
                }
                if (i < size) {
                    C7089y yVar2 = this.f15580f;
                    yVar2.getClass();
                    synchronized (obj) {
                        try {
                            serverRequest = yVar2.f15779c.get(i);
                        } catch (IndexOutOfBoundsException | NoSuchElementException unused) {
                            serverRequest = null;
                        }
                    }
                    if (serverRequest != null) {
                        JSONObject jSONObject = serverRequest.f15615a;
                        if (jSONObject != null) {
                            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.SessionID;
                            if (jSONObject.has(defines$Jsonkey.getKey())) {
                                serverRequest.f15615a.put(defines$Jsonkey.getKey(), this.f15576b.mo19327q());
                            }
                            Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.RandomizedBundleToken;
                            if (jSONObject.has(defines$Jsonkey2.getKey())) {
                                serverRequest.f15615a.put(defines$Jsonkey2.getKey(), this.f15576b.mo19322l());
                            }
                            Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.RandomizedDeviceToken;
                            if (jSONObject.has(defines$Jsonkey3.getKey())) {
                                serverRequest.f15615a.put(defines$Jsonkey3.getKey(), this.f15576b.mo19323m());
                            }
                        }
                    }
                    i++;
                } else {
                    return;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
        while (true) {
        }
    }
}
