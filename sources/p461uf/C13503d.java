package p461uf;

import androidx.appcompat.app.C0164l;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.FlushResult;
import com.facebook.login.LoginFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONException;
import p365hg.C12845c0;
import p401mg.C13080a;
import p453tf.C13418j;
import p461uf.C13511h;

/* renamed from: uf.d */
public final class C13503d {

    /* renamed from: a */
    public static final String f29545a = C13503d.class.getName();

    /* renamed from: b */
    public static final int f29546b = 100;

    /* renamed from: c */
    public static volatile C0164l f29547c = new C0164l(2);

    /* renamed from: d */
    public static final ScheduledExecutorService f29548d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: e */
    public static ScheduledFuture<?> f29549e;

    /* renamed from: f */
    public static final C13506c f29550f = C13506c.f29556b;

    /* renamed from: uf.d$a */
    public static final class C13504a implements GraphRequest.C12195b {

        /* renamed from: a */
        public final /* synthetic */ AccessTokenAppIdPair f29551a;

        /* renamed from: b */
        public final /* synthetic */ GraphRequest f29552b;

        /* renamed from: c */
        public final /* synthetic */ C13521n f29553c;

        /* renamed from: d */
        public final /* synthetic */ C13518l f29554d;

        public C13504a(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, C13521n nVar, C13518l lVar) {
            this.f29551a = accessTokenAppIdPair;
            this.f29552b = graphRequest;
            this.f29553c = nVar;
            this.f29554d = lVar;
        }

        /* renamed from: a */
        public final void mo39238a(GraphResponse graphResponse) {
            boolean z;
            String str;
            AccessTokenAppIdPair accessTokenAppIdPair = this.f29551a;
            GraphRequest graphRequest = this.f29552b;
            C13521n nVar = this.f29553c;
            C13518l lVar = this.f29554d;
            Class<C13503d> cls = C13503d.class;
            if (!C13080a.m20762b(cls)) {
                try {
                    C19383o.m32797g(accessTokenAppIdPair, "accessTokenAppId");
                    C19383o.m32797g(graphRequest, LoginFragment.EXTRA_REQUEST);
                    C19383o.m32797g(nVar, "appEvents");
                    C19383o.m32797g(lVar, "flushState");
                    FacebookRequestError facebookRequestError = graphResponse.f27247d;
                    String str2 = "Success";
                    FlushResult flushResult = FlushResult.SUCCESS;
                    boolean z2 = false;
                    if (facebookRequestError != null) {
                        if (facebookRequestError.getErrorCode() == -1) {
                            str2 = "Failed: No Connectivity";
                            flushResult = FlushResult.NO_CONNECTIVITY;
                        } else {
                            str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{graphResponse.toString(), facebookRequestError.toString()}, 2));
                            C19383o.m32796f(str2, "java.lang.String.format(format, *args)");
                            flushResult = FlushResult.SERVER_ERROR;
                        }
                    }
                    if (C13418j.m21114j(LoggingBehavior.APP_EVENTS)) {
                        try {
                            str = new JSONArray((String) graphRequest.f27229e).toString(2);
                            C19383o.m32796f(str, "jsonArray.toString(2)");
                        } catch (JSONException unused) {
                            str = "<Can't encode events for debug logging>";
                        }
                        z = true;
                        C12845c0.f28334f.mo45627c(LoggingBehavior.APP_EVENTS, C13503d.f29545a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.f27227c), str2, str);
                    } else {
                        z = true;
                    }
                    if (facebookRequestError != null) {
                        z2 = z;
                    }
                    nVar.mo46177b(z2);
                    FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
                    if (flushResult == flushResult2) {
                        C13418j.m21108d().execute(new C13507e(accessTokenAppIdPair, nVar));
                    }
                    if (flushResult != FlushResult.SUCCESS && ((FlushResult) lVar.f29575b) != flushResult2) {
                        C19383o.m32797g(flushResult, "<set-?>");
                        lVar.f29575b = flushResult;
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
        }
    }

    /* renamed from: uf.d$b */
    public static final class C13505b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ FlushReason f29555b;

        public C13505b(FlushReason flushReason) {
            this.f29555b = flushReason;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    C13503d.m21269e(this.f29555b);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: uf.d$c */
    public static final class C13506c implements Runnable {

        /* renamed from: b */
        public static final C13506c f29556b = new C13506c();

        public final void run() {
            Class<C13503d> cls;
            if (!C13080a.m20762b(this)) {
                try {
                    String str = C13503d.f29545a;
                    cls = C13503d.class;
                    if (!C13080a.m20762b(cls)) {
                        C13503d.f29549e = null;
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                    return;
                }
                C13511h.f29567i.getClass();
                if (C13511h.C13512a.m21285c() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY) {
                    C13503d.m21269e(FlushReason.TIMER);
                }
            }
        }
    }

    static {
        new C13503d();
    }

    /* renamed from: a */
    public static final /* synthetic */ C0164l m21265a() {
        Class<C13503d> cls = C13503d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return f29547c;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        p401mg.C13080a.m20761a(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebook.GraphRequest m21266b(com.facebook.appevents.AccessTokenAppIdPair r9, p461uf.C13521n r10, boolean r11, p461uf.C13518l r12) {
        /*
            java.lang.Class<uf.d> r0 = p461uf.C13503d.class
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = r9.getApplicationId()     // Catch:{ all -> 0x0081 }
            r3 = 0
            hg.n r4 = com.facebook.internal.FetchedAppSettingsManager.m20107f(r1, r3)     // Catch:{ all -> 0x0081 }
            com.facebook.GraphRequest$c r5 = com.facebook.GraphRequest.f27224o     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = "%s/activities"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0081 }
            r8[r3] = r1     // Catch:{ all -> 0x0081 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r7)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r6)     // Catch:{ all -> 0x0081 }
            r5.getClass()     // Catch:{ all -> 0x0081 }
            com.facebook.GraphRequest r1 = com.facebook.GraphRequest.C12196c.m20008h(r2, r1, r2, r2)     // Catch:{ all -> 0x0081 }
            r1.f27234j = r7     // Catch:{ all -> 0x0081 }
            android.os.Bundle r5 = r1.f27228d     // Catch:{ all -> 0x0081 }
            if (r5 != 0) goto L_0x003b
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0081 }
            r5.<init>()     // Catch:{ all -> 0x0081 }
        L_0x003b:
            java.lang.String r6 = "access_token"
            java.lang.String r7 = r9.getAccessTokenString()     // Catch:{ all -> 0x0081 }
            r5.putString(r6, r7)     // Catch:{ all -> 0x0081 }
            uf.h$a r6 = p461uf.C13511h.f29567i     // Catch:{ all -> 0x0081 }
            r6.getClass()     // Catch:{ all -> 0x0081 }
            java.lang.Object r6 = p461uf.C13511h.m21278c()     // Catch:{ all -> 0x0081 }
            monitor-enter(r6)     // Catch:{ all -> 0x0081 }
            java.lang.Class<uf.h> r7 = p461uf.C13511h.class
            p401mg.C13080a.m20762b(r7)     // Catch:{ all -> 0x007e }
            monitor-exit(r6)     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = p461uf.C13511h.C13512a.m21286d()     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x005f
            java.lang.String r7 = "install_referrer"
            r5.putString(r7, r6)     // Catch:{ all -> 0x0081 }
        L_0x005f:
            r1.f27228d = r5     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x0065
            boolean r3 = r4.f28397a     // Catch:{ all -> 0x0081 }
        L_0x0065:
            android.content.Context r4 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x0081 }
            int r11 = r10.mo46179d(r1, r4, r3, r11)     // Catch:{ all -> 0x0081 }
            if (r11 != 0) goto L_0x0070
            return r2
        L_0x0070:
            int r3 = r12.f29574a     // Catch:{ all -> 0x0081 }
            int r3 = r3 + r11
            r12.f29574a = r3     // Catch:{ all -> 0x0081 }
            uf.d$a r11 = new uf.d$a     // Catch:{ all -> 0x0081 }
            r11.<init>(r9, r1, r10, r12)     // Catch:{ all -> 0x0081 }
            r1.mo39232j(r11)     // Catch:{ all -> 0x0081 }
            return r1
        L_0x007e:
            r9 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0081 }
            throw r9     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r9 = move-exception
            p401mg.C13080a.m20761a(r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p461uf.C13503d.m21266b(com.facebook.appevents.AccessTokenAppIdPair, uf.n, boolean, uf.l):com.facebook.GraphRequest");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        p401mg.C13080a.m20761a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList m21267c(androidx.appcompat.app.C0164l r7, p461uf.C13518l r8) {
        /*
            java.lang.Class<uf.d> r0 = p461uf.C13503d.class
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "appEventCollection"
            kotlin.jvm.internal.C19383o.m32797g(r7, r1)     // Catch:{ all -> 0x005d }
            android.content.Context r1 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x005d }
            boolean r1 = p453tf.C13418j.m21111g(r1)     // Catch:{ all -> 0x005d }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x005d }
            r3.<init>()     // Catch:{ all -> 0x005d }
            java.util.Set r4 = r7.mo1419r()     // Catch:{ all -> 0x005d }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x005d }
        L_0x0024:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005c
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x005d }
            com.facebook.appevents.AccessTokenAppIdPair r5 = (com.facebook.appevents.AccessTokenAppIdPair) r5     // Catch:{ all -> 0x005d }
            monitor-enter(r7)     // Catch:{ all -> 0x005d }
            java.lang.String r6 = "accessTokenAppIdPair"
            kotlin.jvm.internal.C19383o.m32797g(r5, r6)     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r7.f398b     // Catch:{ all -> 0x0059 }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0059 }
            uf.n r6 = (p461uf.C13521n) r6     // Catch:{ all -> 0x0059 }
            monitor-exit(r7)     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x004d
            com.facebook.GraphRequest r5 = m21266b(r5, r6, r1, r8)     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x0024
            r3.add(r5)     // Catch:{ all -> 0x005d }
            goto L_0x0024
        L_0x004d:
            java.lang.String r7 = "Required value was null."
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x005d }
            r8.<init>(r7)     // Catch:{ all -> 0x005d }
            throw r8     // Catch:{ all -> 0x005d }
        L_0x0059:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x005d }
            throw r8     // Catch:{ all -> 0x005d }
        L_0x005c:
            return r3
        L_0x005d:
            r7 = move-exception
            p401mg.C13080a.m20761a(r0, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p461uf.C13503d.m21267c(androidx.appcompat.app.l, uf.l):java.util.ArrayList");
    }

    /* renamed from: d */
    public static final void m21268d(FlushReason flushReason) {
        Class<C13503d> cls = C13503d.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(flushReason, "reason");
                f29548d.execute(new C13505b(flushReason));
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m21269e(com.facebook.appevents.FlushReason r4) {
        /*
            java.lang.Class<uf.d> r0 = p461uf.C13503d.class
            boolean r1 = p401mg.C13080a.m20762b(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "reason"
            kotlin.jvm.internal.C19383o.m32797g(r4, r1)     // Catch:{ all -> 0x004b }
            com.facebook.appevents.PersistedEvents r1 = p461uf.C13509g.m21274c()     // Catch:{ all -> 0x004b }
            androidx.appcompat.app.l r2 = f29547c     // Catch:{ all -> 0x004b }
            r2.mo1415m(r1)     // Catch:{ all -> 0x004b }
            androidx.appcompat.app.l r1 = f29547c     // Catch:{ Exception -> 0x0042 }
            uf.l r4 = m21270f(r4, r1)     // Catch:{ Exception -> 0x0042 }
            if (r4 == 0) goto L_0x0041
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSHED"
            r1.<init>(r2)     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"
            int r3 = r4.f29574a     // Catch:{ all -> 0x004b }
            r1.putExtra(r2, r3)     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"
            java.lang.Object r4 = r4.f29575b     // Catch:{ all -> 0x004b }
            com.facebook.appevents.FlushResult r4 = (com.facebook.appevents.FlushResult) r4     // Catch:{ all -> 0x004b }
            r1.putExtra(r2, r4)     // Catch:{ all -> 0x004b }
            android.content.Context r4 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x004b }
            u1.a r4 = p251u1.C8115a.m16322a(r4)     // Catch:{ all -> 0x004b }
            r4.mo20709c(r1)     // Catch:{ all -> 0x004b }
        L_0x0041:
            return
        L_0x0042:
            r4 = move-exception
            java.lang.String r1 = f29545a     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "Caught unexpected exception while flushing app events: "
            android.util.Log.w(r1, r2, r4)     // Catch:{ all -> 0x004b }
            return
        L_0x004b:
            r4 = move-exception
            p401mg.C13080a.m20761a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p461uf.C13503d.m21269e(com.facebook.appevents.FlushReason):void");
    }

    /* renamed from: f */
    public static final C13518l m21270f(FlushReason flushReason, C0164l lVar) {
        Class<C13503d> cls = C13503d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(flushReason, "reason");
            C19383o.m32797g(lVar, "appEventCollection");
            C13518l lVar2 = new C13518l();
            ArrayList c = m21267c(lVar, lVar2);
            if (!(!c.isEmpty())) {
                return null;
            }
            C12845c0.f28334f.mo45627c(LoggingBehavior.APP_EVENTS, f29545a, "Flushing %d events due to %s.", Integer.valueOf(lVar2.f29574a), flushReason.toString());
            Iterator it = c.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).mo39226c();
            }
            return lVar2;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }
}
