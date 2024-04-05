package p453tf;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.support.p013v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopRelatedLink;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12831b;
import p365hg.C12835b0;
import p365hg.C12851e0;
import p365hg.C12865g0;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p388lb.C13006a;
import p401mg.C13080a;
import p405nc.C13110a;
import p610kp.C18161c;

/* renamed from: tf.j */
public final class C13418j {

    /* renamed from: a */
    public static final String f29381a = C13418j.class.getCanonicalName();

    /* renamed from: b */
    public static final HashSet<LoggingBehavior> f29382b = C19382n.m32754j0(LoggingBehavior.DEVELOPER_ERRORS);

    /* renamed from: c */
    public static Executor f29383c;

    /* renamed from: d */
    public static volatile String f29384d;

    /* renamed from: e */
    public static volatile String f29385e;

    /* renamed from: f */
    public static volatile String f29386f;

    /* renamed from: g */
    public static volatile Boolean f29387g;

    /* renamed from: h */
    public static AtomicLong f29388h = new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);

    /* renamed from: i */
    public static volatile boolean f29389i;

    /* renamed from: j */
    public static C12835b0<File> f29390j;

    /* renamed from: k */
    public static Context f29391k;

    /* renamed from: l */
    public static int f29392l = 64206;

    /* renamed from: m */
    public static final ReentrantLock f29393m = new ReentrantLock();

    /* renamed from: n */
    public static String f29394n = "v12.0";

    /* renamed from: o */
    public static boolean f29395o;

    /* renamed from: p */
    public static boolean f29396p;

    /* renamed from: q */
    public static boolean f29397q;

    /* renamed from: r */
    public static final AtomicBoolean f29398r = new AtomicBoolean(false);

    /* renamed from: s */
    public static volatile String f29399s = "instagram.com";

    /* renamed from: t */
    public static volatile String f29400t = "facebook.com";

    /* renamed from: u */
    public static C13420b f29401u = C13420b.f29404a;

    /* renamed from: v */
    public static boolean f29402v;

    /* renamed from: w */
    public static final C13418j f29403w = new C13418j();

    /* renamed from: tf.j$a */
    public interface C13419a {
        /* renamed from: a */
        void mo46087a();
    }

    /* renamed from: tf.j$b */
    public static final class C13420b {

        /* renamed from: a */
        public static final C13420b f29404a = new C13420b();
    }

    static {
        List list = C12865g0.f28360a;
    }

    /* renamed from: a */
    public static final void m21105a(C13418j jVar, Context context, String str) {
        jVar.getClass();
        if (!C13080a.m20762b(jVar)) {
            try {
                C12831b.f28321h.getClass();
                C12831b a = C12831b.C12832a.m20469a(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str2 = str + "ping";
                long j = sharedPreferences.getLong(str2, 0);
                JSONObject a2 = AppEventsLoggerUtility.m20070a(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, a, C15562d.m25173K(context), m21111g(context), context);
                String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                C19383o.m32796f(format, "java.lang.String.format(format, *args)");
                f29401u.getClass();
                GraphRequest.f27224o.getClass();
                GraphRequest h = GraphRequest.C12196c.m20008h((AccessToken) null, format, a2, (GraphRequest.C12195b) null);
                if (j == 0 && h.mo39226c().f27247d == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str2, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (JSONException e) {
                throw new FacebookException("An error occurred while publishing install.", (Throwable) e);
            } catch (Exception e2) {
                C12869i0.m20550F("Facebook-publish", e2);
            } catch (Throwable th) {
                C13080a.m20761a(jVar, th);
            }
        }
    }

    /* renamed from: b */
    public static final Context m21106b() {
        C12879l0.m20603g();
        Context context = f29391k;
        if (context != null) {
            return context;
        }
        C19383o.m32805o("applicationContext");
        throw null;
    }

    /* renamed from: c */
    public static final String m21107c() {
        C12879l0.m20603g();
        String str = f29384d;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public static final Executor m21108d() {
        ReentrantLock reentrantLock = f29393m;
        reentrantLock.lock();
        try {
            if (f29383c == null) {
                f29383c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            Executor executor = f29383c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static final String m21109e() {
        String str = f29381a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f29394n}, 1));
        C19383o.m32796f(format, "java.lang.String.format(format, *args)");
        C12869i0.m20551G(str, format);
        return f29394n;
    }

    /* renamed from: f */
    public static final String m21110f() {
        AccessToken.Companion.getClass();
        AccessToken d = AccessToken.C12174c.m19981d();
        String graphDomain = d != null ? d.getGraphDomain() : null;
        int i = C12869i0.f28368a;
        String str = f29400t;
        if (graphDomain == null) {
            return str;
        }
        int hashCode = graphDomain.hashCode();
        return hashCode != -1253231569 ? (hashCode == 28903346 && graphDomain.equals(ShopRelatedLink.INSTAGRAM_TITLE)) ? C19457k.m33023a1(str, "facebook.com", "instagram.com", false) : str : graphDomain.equals("gaming") ? C19457k.m33023a1(str, "facebook.com", "fb.gg", false) : str;
    }

    /* renamed from: g */
    public static final boolean m21111g(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C12879l0.m20603g();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: h */
    public static final synchronized boolean m21112h() {
        boolean z;
        synchronized (C13418j.class) {
            z = f29402v;
        }
        return z;
    }

    /* renamed from: i */
    public static final boolean m21113i() {
        return f29398r.get();
    }

    /* renamed from: j */
    public static final boolean m21114j(LoggingBehavior loggingBehavior) {
        boolean z;
        C19383o.m32797g(loggingBehavior, "behavior");
        HashSet<LoggingBehavior> hashSet = f29382b;
        synchronized (hashSet) {
            z = f29389i && hashSet.contains(loggingBehavior);
        }
        return z;
    }

    /* renamed from: k */
    public static final void m21115k(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (f29384d == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            Locale locale = Locale.ROOT;
                            C19383o.m32796f(locale, "Locale.ROOT");
                            String lowerCase = str.toLowerCase(locale);
                            C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            if (C19457k.m33025c1(lowerCase, "fb", false)) {
                                String substring = str.substring(2);
                                C19383o.m32796f(substring, "(this as java.lang.String).substring(startIndex)");
                                f29384d = substring;
                            } else {
                                f29384d = str;
                            }
                        } else if (obj instanceof Number) {
                            throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f29385e == null) {
                        f29385e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f29386f == null) {
                        f29386f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f29392l == 64206) {
                        f29392l = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f29387g == null) {
                        f29387g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: l */
    public static final synchronized void m21116l(Context context) {
        synchronized (C13418j.class) {
            m21117m(context);
        }
    }

    /* renamed from: m */
    public static final synchronized void m21117m(Context context) {
        synchronized (C13418j.class) {
            AtomicBoolean atomicBoolean = f29398r;
            if (!atomicBoolean.get()) {
                boolean z = false;
                C12879l0.m20598b(context);
                if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
                    Log.w(C12879l0.f28392a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
                }
                Context applicationContext = context.getApplicationContext();
                C19383o.m32796f(applicationContext, "applicationContext.applicationContext");
                f29391k = applicationContext;
                C15562d.m25173K(context);
                Context context2 = f29391k;
                if (context2 != null) {
                    m21115k(context2);
                    if (!C12869i0.m20546B(f29384d)) {
                        atomicBoolean.set(true);
                        String str = C13442y.f29447a;
                        Class<C13442y> cls = C13442y.class;
                        if (!C13080a.m20762b(cls)) {
                            try {
                                C13442y.f29456j.mo46124e();
                                z = C13442y.f29450d.mo46131a();
                            } catch (Throwable th) {
                                C13080a.m20761a(cls, th);
                            }
                        }
                        if (z) {
                            f29402v = true;
                        }
                        Context context3 = f29391k;
                        if (context3 != null) {
                            if ((context3 instanceof Application) && C13442y.m21140c()) {
                                Context context4 = f29391k;
                                if (context4 != null) {
                                    ActivityLifecycleTracker.m20068b((Application) context4, f29384d);
                                } else {
                                    C19383o.m32805o("applicationContext");
                                    throw null;
                                }
                            }
                            FetchedAppSettingsManager.m20105c();
                            C12851e0.m20512m();
                            BoltsMeasurementEventListener.C12246a aVar = BoltsMeasurementEventListener.Companion;
                            Context context5 = f29391k;
                            if (context5 != null) {
                                aVar.getClass();
                                BoltsMeasurementEventListener.C12246a.m20093a(context5);
                                f29390j = new C12835b0<>();
                                FeatureManager.m20098a(C13423m.f29408b, FeatureManager.Feature.Instrument);
                                FeatureManager.m20098a(C13006a.f28634F, FeatureManager.Feature.AppEvents);
                                FeatureManager.m20098a(C18161c.f39717v1, FeatureManager.Feature.ChromeCustomTabsPrefetching);
                                FeatureManager.m20098a(C15588c1.f35097w, FeatureManager.Feature.IgnoreAppSwitchToLoggedOut);
                                FeatureManager.m20098a(C13110a.f28831i, FeatureManager.Feature.BypassAppSwitch);
                                m21108d().execute(new FutureTask(new C13424n()));
                                return;
                            }
                            C19383o.m32805o("applicationContext");
                            throw null;
                        }
                        C19383o.m32805o("applicationContext");
                        throw null;
                    }
                    throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
                }
                C19383o.m32805o("applicationContext");
                throw null;
            }
        }
    }
}
