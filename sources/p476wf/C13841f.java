package p476wf;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.codeless.ViewIndexingTrigger;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p312ag.C8527d;
import p365hg.C12845c0;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: wf.f */
public final class C13841f {

    /* renamed from: e */
    public static final String f30465e;

    /* renamed from: a */
    public final Handler f30466a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final WeakReference<Activity> f30467b;

    /* renamed from: c */
    public Timer f30468c;

    /* renamed from: d */
    public String f30469d = null;

    /* renamed from: wf.f$a */
    public static final class C13842a {
        /* renamed from: a */
        public static GraphRequest m21383a(String str, AccessToken accessToken, String str2) {
            String str3;
            if (str == null) {
                return null;
            }
            GraphRequest.C12196c cVar = GraphRequest.f27224o;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
            cVar.getClass();
            GraphRequest h = GraphRequest.C12196c.m20008h(accessToken, format, (JSONObject) null, (GraphRequest.C12195b) null);
            Bundle bundle = h.f27228d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("tree", str);
            int i = C8527d.f18569a;
            Context b = C13418j.m21106b();
            try {
                str3 = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
                C19383o.m32796f(str3, "packageInfo.versionName");
            } catch (PackageManager.NameNotFoundException unused) {
                str3 = "";
            }
            bundle.putString("app_version", str3);
            bundle.putString("platform", "android");
            bundle.putString("request_type", "app_indexing");
            if (C19383o.m32792b("app_indexing", "app_indexing")) {
                bundle.putString("device_session_id", C13838c.m21378a());
            }
            h.f27228d = bundle;
            h.mo39232j(C13840e.f30464a);
            return h;
        }
    }

    /* renamed from: wf.f$b */
    public static final class C13843b implements Callable<String> {

        /* renamed from: b */
        public final WeakReference<View> f30470b;

        public C13843b(View view) {
            this.f30470b = new WeakReference<>(view);
        }

        public final Object call() {
            View view = this.f30470b.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            C19383o.m32796f(encodeToString, "Base64.encodeToString(ou…eArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    /* renamed from: wf.f$c */
    public static final class C13844c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C13841f f30471b;

        /* renamed from: c */
        public final /* synthetic */ TimerTask f30472c;

        public C13844c(C13841f fVar, C13845d dVar) {
            this.f30471b = fVar;
            this.f30472c = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001e A[Catch:{ Exception -> 0x0054, all -> 0x0052 }] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x002a A[SYNTHETIC, Splitter:B:17:0x002a] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[SYNTHETIC, Splitter:B:24:0x004a] */
        /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                java.lang.Class<wf.f> r0 = p476wf.C13841f.class
                boolean r1 = p401mg.C13080a.m20762b(r8)
                if (r1 == 0) goto L_0x0009
                return
            L_0x0009:
                wf.f r1 = r8.f30471b     // Catch:{ Exception -> 0x0054 }
                boolean r2 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x0054 }
                r3 = 0
                if (r2 == 0) goto L_0x0014
            L_0x0012:
                r1 = r3
                goto L_0x001c
            L_0x0014:
                java.util.Timer r1 = r1.f30468c     // Catch:{ all -> 0x0017 }
                goto L_0x001c
            L_0x0017:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)     // Catch:{ Exception -> 0x0054 }
                goto L_0x0012
            L_0x001c:
                if (r1 == 0) goto L_0x0021
                r1.cancel()     // Catch:{ Exception -> 0x0054 }
            L_0x0021:
                wf.f r1 = r8.f30471b     // Catch:{ Exception -> 0x0054 }
                boolean r2 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x0054 }
                if (r2 == 0) goto L_0x002a
                goto L_0x0031
            L_0x002a:
                r1.f30469d = r3     // Catch:{ all -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)     // Catch:{ Exception -> 0x0054 }
            L_0x0031:
                java.util.Timer r1 = new java.util.Timer     // Catch:{ Exception -> 0x0054 }
                r1.<init>()     // Catch:{ Exception -> 0x0054 }
                java.util.TimerTask r3 = r8.f30472c     // Catch:{ Exception -> 0x0054 }
                r4 = 0
                r2 = 1000(0x3e8, float:1.401E-42)
                long r6 = (long) r2     // Catch:{ Exception -> 0x0054 }
                r2 = r1
                r2.scheduleAtFixedRate(r3, r4, r6)     // Catch:{ Exception -> 0x0054 }
                wf.f r2 = r8.f30471b     // Catch:{ Exception -> 0x0054 }
                boolean r3 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x0054 }
                if (r3 == 0) goto L_0x004a
                goto L_0x005e
            L_0x004a:
                r2.f30468c = r1     // Catch:{ all -> 0x004d }
                goto L_0x005e
            L_0x004d:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)     // Catch:{ Exception -> 0x0054 }
                goto L_0x005e
            L_0x0052:
                r0 = move-exception
                goto L_0x005f
            L_0x0054:
                r0 = move-exception
                java.lang.String r1 = p476wf.C13841f.m21380a()     // Catch:{ all -> 0x0052 }
                java.lang.String r2 = "Error scheduling indexing job"
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0052 }
            L_0x005e:
                return
            L_0x005f:
                p401mg.C13080a.m20761a(r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p476wf.C13841f.C13844c.run():void");
        }
    }

    /* renamed from: wf.f$d */
    public static final class C13845d extends TimerTask {

        /* renamed from: b */
        public final /* synthetic */ C13841f f30473b;

        public C13845d(C13841f fVar) {
            this.f30473b = fVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(13:25|(2:27|28)|32|33|(3:34|35|36)|40|41|42|43|44|45|46|(1:64)(3:48|49|(1:65)(3:51|52|66))) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x009d */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0021 A[Catch:{ Exception -> 0x00da }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                java.lang.Class<wf.f> r0 = p476wf.C13841f.class
                wf.f r1 = r8.f30473b     // Catch:{ Exception -> 0x00da }
                boolean r2 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x00da }
                r3 = 0
                if (r2 == 0) goto L_0x000d
            L_0x000b:
                r1 = r3
                goto L_0x0015
            L_0x000d:
                java.lang.ref.WeakReference<android.app.Activity> r1 = r1.f30467b     // Catch:{ all -> 0x0010 }
                goto L_0x0015
            L_0x0010:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)     // Catch:{ Exception -> 0x00da }
                goto L_0x000b
            L_0x0015:
                java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00da }
                android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ Exception -> 0x00da }
                android.view.View r2 = p312ag.C8527d.m16931b(r1)     // Catch:{ Exception -> 0x00da }
                if (r1 == 0) goto L_0x00d9
                if (r2 != 0) goto L_0x0025
                goto L_0x00d9
            L_0x0025:
                java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x00da }
                java.lang.String r1 = r1.getSimpleName()     // Catch:{ Exception -> 0x00da }
                com.facebook.appevents.codeless.ViewIndexingTrigger r4 = p476wf.C13838c.f30456a     // Catch:{ Exception -> 0x00da }
                java.lang.Class<wf.c> r4 = p476wf.C13838c.class
                boolean r5 = p401mg.C13080a.m20762b(r4)     // Catch:{ Exception -> 0x00da }
                r6 = 0
                if (r5 == 0) goto L_0x0039
                goto L_0x0044
            L_0x0039:
                java.util.concurrent.atomic.AtomicBoolean r5 = p476wf.C13838c.f30461f     // Catch:{ all -> 0x0040 }
                boolean r6 = r5.get()     // Catch:{ all -> 0x0040 }
                goto L_0x0044
            L_0x0040:
                r5 = move-exception
                p401mg.C13080a.m20761a(r4, r5)     // Catch:{ Exception -> 0x00da }
            L_0x0044:
                if (r6 != 0) goto L_0x0047
                return
            L_0x0047:
                java.util.concurrent.FutureTask r4 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x00da }
                wf.f$b r5 = new wf.f$b     // Catch:{ Exception -> 0x00da }
                r5.<init>(r2)     // Catch:{ Exception -> 0x00da }
                r4.<init>(r5)     // Catch:{ Exception -> 0x00da }
                wf.f r5 = r8.f30473b     // Catch:{ Exception -> 0x00da }
                boolean r6 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x00da }
                if (r6 == 0) goto L_0x005a
                goto L_0x0061
            L_0x005a:
                android.os.Handler r3 = r5.f30466a     // Catch:{ all -> 0x005d }
                goto L_0x0061
            L_0x005d:
                r5 = move-exception
                p401mg.C13080a.m20761a(r0, r5)     // Catch:{ Exception -> 0x00da }
            L_0x0061:
                r3.post(r4)     // Catch:{ Exception -> 0x00da }
                java.lang.String r3 = ""
                r5 = 1
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0072 }
                java.lang.Object r4 = r4.get(r5, r7)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0072 }
                r3 = r4
                goto L_0x007c
            L_0x0072:
                r4 = move-exception
                java.lang.String r5 = p476wf.C13841f.m21380a()     // Catch:{ Exception -> 0x00da }
                java.lang.String r6 = "Failed to take screenshot."
                android.util.Log.e(r5, r6, r4)     // Catch:{ Exception -> 0x00da }
            L_0x007c:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00da }
                r4.<init>()     // Catch:{ Exception -> 0x00da }
                java.lang.String r5 = "screenname"
                r4.put(r5, r1)     // Catch:{ JSONException -> 0x009d }
                java.lang.String r1 = "screenshot"
                r4.put(r1, r3)     // Catch:{ JSONException -> 0x009d }
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x009d }
                r1.<init>()     // Catch:{ JSONException -> 0x009d }
                org.json.JSONObject r2 = com.facebook.appevents.codeless.internal.C12225d.m20056d(r2)     // Catch:{ JSONException -> 0x009d }
                r1.put(r2)     // Catch:{ JSONException -> 0x009d }
                java.lang.String r2 = "view"
                r4.put(r2, r1)     // Catch:{ JSONException -> 0x009d }
                goto L_0x00a6
            L_0x009d:
                java.lang.String r1 = p476wf.C13841f.m21380a()     // Catch:{ Exception -> 0x00da }
                java.lang.String r2 = "Failed to create JSONObject"
                android.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x00da }
            L_0x00a6:
                java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x00da }
                java.lang.String r2 = "viewTree.toString()"
                kotlin.jvm.internal.C19383o.m32796f(r1, r2)     // Catch:{ Exception -> 0x00da }
                wf.f r2 = r8.f30473b     // Catch:{ Exception -> 0x00da }
                boolean r3 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x00da }
                if (r3 == 0) goto L_0x00b8
                goto L_0x00e4
            L_0x00b8:
                r2.getClass()     // Catch:{ all -> 0x00d4 }
                boolean r3 = p401mg.C13080a.m20762b(r2)     // Catch:{ all -> 0x00d4 }
                if (r3 == 0) goto L_0x00c2
                goto L_0x00e4
            L_0x00c2:
                java.util.concurrent.Executor r3 = p453tf.C13418j.m21108d()     // Catch:{ all -> 0x00cf }
                wf.g r4 = new wf.g     // Catch:{ all -> 0x00cf }
                r4.<init>(r2, r1)     // Catch:{ all -> 0x00cf }
                r3.execute(r4)     // Catch:{ all -> 0x00cf }
                goto L_0x00e4
            L_0x00cf:
                r1 = move-exception
                p401mg.C13080a.m20761a(r2, r1)     // Catch:{ all -> 0x00d4 }
                goto L_0x00e4
            L_0x00d4:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)     // Catch:{ Exception -> 0x00da }
                goto L_0x00e4
            L_0x00d9:
                return
            L_0x00da:
                r0 = move-exception
                java.lang.String r1 = p476wf.C13841f.m21380a()
                java.lang.String r2 = "UI Component tree indexing failure!"
                android.util.Log.e(r1, r2, r0)
            L_0x00e4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p476wf.C13841f.C13845d.run():void");
        }
    }

    static {
        String canonicalName = C13841f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f30465e = canonicalName;
    }

    public C13841f(Activity activity) {
        C19383o.m32797g(activity, "activity");
        this.f30467b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public static final /* synthetic */ String m21380a() {
        Class<C13841f> cls = C13841f.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return f30465e;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo46677b(GraphRequest graphRequest, String str) {
        if (!C13080a.m20762b(this) && graphRequest != null) {
            try {
                GraphResponse c = graphRequest.mo39226c();
                JSONObject jSONObject = c.f27246c;
                if (jSONObject != null) {
                    if (C19383o.m32792b("true", jSONObject.optString("success"))) {
                        C12845c0.f28334f.mo45626b(LoggingBehavior.APP_EVENTS, f30465e, "Successfully send UI component tree to server");
                        this.f30469d = str;
                    }
                    if (jSONObject.has("is_app_indexing_enabled")) {
                        boolean z = jSONObject.getBoolean("is_app_indexing_enabled");
                        ViewIndexingTrigger viewIndexingTrigger = C13838c.f30456a;
                        Class<C13838c> cls = C13838c.class;
                        if (!C13080a.m20762b(cls)) {
                            try {
                                C13838c.f30461f.set(z);
                            } catch (Throwable th) {
                                C13080a.m20761a(cls, th);
                            }
                        }
                    }
                } else {
                    String str2 = f30465e;
                    Log.e(str2, "Error sending UI component tree to Facebook: " + c.f27247d);
                }
            } catch (JSONException e) {
                Log.e(f30465e, "Error decoding server response.", e);
            } catch (Throwable th2) {
                C13080a.m20761a(this, th2);
            }
        }
    }

    /* renamed from: c */
    public final void mo46678c() {
        if (!C13080a.m20762b(this)) {
            try {
                C13418j.m21108d().execute(new C13844c(this, new C13845d(this)));
            } catch (RejectedExecutionException e) {
                Log.e(f30465e, "Error scheduling indexing job", e);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
