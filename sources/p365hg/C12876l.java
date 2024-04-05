package p365hg;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.animation.C0388a;
import androidx.compose.runtime.C1353o0;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: hg.l */
public final class C12876l {

    /* renamed from: a */
    public static final AtomicBoolean f28385a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final ConcurrentLinkedQueue<C12877a> f28386b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    public static final ConcurrentHashMap f28387c = new ConcurrentHashMap();

    /* renamed from: d */
    public static Long f28388d;

    /* renamed from: e */
    public static C1353o0 f28389e;

    /* renamed from: f */
    public static final C12876l f28390f = new C12876l();

    /* renamed from: hg.l$a */
    public interface C12877a {
        void onCompleted();
    }

    /* renamed from: hg.l$b */
    public static final class C12878b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C12877a f28391b;

        public C12878b(C12877a aVar) {
            this.f28391b = aVar;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    this.f28391b.onCompleted();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    static {
        C19386q.m32807a(C12876l.class).mo71919c();
    }

    /* renamed from: a */
    public static JSONObject m20591a(String str) {
        GraphRequest graphRequest;
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        String str2 = C13418j.f29381a;
        bundle.putString("sdk_version", "12.3.0");
        bundle.putString("fields", "gatekeepers");
        C12879l0.m20603g();
        if (C12869i0.m20546B(C13418j.f29386f)) {
            GraphRequest.C12196c cVar = GraphRequest.f27224o;
            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, "mobile_sdk_gk"}, 2));
            C19383o.m32796f(format, "java.lang.String.format(format, *args)");
            cVar.getClass();
            graphRequest = GraphRequest.C12196c.m20007g((AccessToken) null, format, (GraphRequest.C12195b) null);
            graphRequest.f27233i = true;
            graphRequest.f27228d = bundle;
        } else {
            GraphRequest.C12196c cVar2 = GraphRequest.f27224o;
            String format2 = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
            C19383o.m32796f(format2, "java.lang.String.format(format, *args)");
            cVar2.getClass();
            graphRequest = GraphRequest.C12196c.m20007g((AccessToken) null, format2, (GraphRequest.C12195b) null);
            graphRequest.f27228d = bundle;
        }
        JSONObject jSONObject = graphRequest.mo39226c().f27244a;
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011a, code lost:
        r7 = (java.lang.Boolean) r8.get(r7);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m20592b(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            hg.l r0 = f28390f
            r0.getClass()
            r0 = 0
            m20593c(r0)
            java.util.concurrent.ConcurrentHashMap r1 = f28387c
            boolean r1 = r1.containsKey(r8)
            if (r1 != 0) goto L_0x001d
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            goto L_0x0113
        L_0x001d:
            androidx.compose.runtime.o0 r1 = f28389e
            if (r1 == 0) goto L_0x0054
            java.lang.Object r1 = r1.f2952b
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r8)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L_0x0054
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r1.size()
            r0.<init>(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x003e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            ig.a r2 = (p372ig.C12955a) r2
            r0.add(r2)
            goto L_0x003e
        L_0x0054:
            if (r0 == 0) goto L_0x0077
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x005f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0113
            java.lang.Object r1 = r0.next()
            ig.a r1 = (p372ig.C12955a) r1
            java.lang.String r2 = r1.f28535a
            boolean r1 = r1.f28536b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.put(r2, r1)
            goto L_0x005f
        L_0x0077:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r1 = f28387c
            java.lang.Object r1 = r1.get(r8)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x008c:
            java.util.Iterator r2 = r1.keys()
        L_0x0090:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ad
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "key"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            boolean r4 = r1.optBoolean(r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.put(r3, r4)
            goto L_0x0090
        L_0x00ad:
            androidx.compose.runtime.o0 r1 = f28389e
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            androidx.compose.runtime.o0 r1 = new androidx.compose.runtime.o0
            r2 = 3
            r1.<init>((int) r2)
        L_0x00b8:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
            java.util.Set r3 = r0.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00c9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00ee
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            ig.a r5 = new ig.a
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5.<init>(r6, r4)
            r2.add(r5)
            goto L_0x00c9
        L_0x00ee:
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00f7:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0109
            java.lang.Object r4 = r2.next()
            ig.a r4 = (p372ig.C12955a) r4
            java.lang.String r5 = r4.f28535a
            r3.put(r5, r4)
            goto L_0x00f7
        L_0x0109:
            java.lang.Object r2 = r1.f2952b
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            r2.put(r8, r3)
            f28389e = r1
            r8 = r0
        L_0x0113:
            boolean r0 = r8.containsKey(r7)
            if (r0 != 0) goto L_0x011a
            goto L_0x0126
        L_0x011a:
            java.lang.Object r7 = r8.get(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x0126
            boolean r9 = r7.booleanValue()
        L_0x0126:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12876l.m20592b(java.lang.String, java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[Catch:{ JSONException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[SYNTHETIC, Splitter:B:18:0x003c] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void m20593c(p365hg.C12874k r8) {
        /*
            java.lang.Class<hg.l> r0 = p365hg.C12876l.class
            monitor-enter(r0)
            if (r8 == 0) goto L_0x000a
            java.util.concurrent.ConcurrentLinkedQueue<hg.l$a> r1 = f28386b     // Catch:{ all -> 0x0092 }
            r1.add(r8)     // Catch:{ all -> 0x0092 }
        L_0x000a:
            java.lang.String r8 = p453tf.C13418j.m21107c()     // Catch:{ all -> 0x0092 }
            hg.l r1 = f28390f     // Catch:{ all -> 0x0092 }
            java.lang.Long r2 = f28388d     // Catch:{ all -> 0x0092 }
            r1.getClass()     // Catch:{ all -> 0x0092 }
            r1 = 1
            r3 = 0
            if (r2 != 0) goto L_0x001a
            goto L_0x002c
        L_0x001a:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0092 }
            long r6 = r2.longValue()     // Catch:{ all -> 0x0092 }
            long r4 = r4 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x002c
            r2 = r1
            goto L_0x002d
        L_0x002c:
            r2 = r3
        L_0x002d:
            if (r2 == 0) goto L_0x003c
            java.util.concurrent.ConcurrentHashMap r2 = f28387c     // Catch:{ all -> 0x0092 }
            boolean r2 = r2.containsKey(r8)     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x003c
            m20595e()     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)
            return
        L_0x003c:
            android.content.Context r2 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = "com.facebook.internal.APP_GATEKEEPERS.%s"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0092 }
            r5[r3] = r8     // Catch:{ all -> 0x0092 }
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0092 }
            java.lang.String r5 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)     // Catch:{ all -> 0x0092 }
            if (r2 != 0) goto L_0x0057
            monitor-exit(r0)
            return
        L_0x0057:
            java.lang.String r5 = "com.facebook.internal.preferences.APP_GATEKEEPERS"
            android.content.SharedPreferences r5 = r2.getSharedPreferences(r5, r3)     // Catch:{ all -> 0x0092 }
            r6 = 0
            java.lang.String r5 = r5.getString(r4, r6)     // Catch:{ all -> 0x0092 }
            boolean r7 = p365hg.C12869i0.m20546B(r5)     // Catch:{ all -> 0x0092 }
            if (r7 != 0) goto L_0x007a
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006f }
            r7.<init>(r5)     // Catch:{ JSONException -> 0x006f }
            r6 = r7
            goto L_0x0075
        L_0x006f:
            r5 = move-exception
            java.lang.String r7 = "FacebookSDK"
            p365hg.C12869i0.m20550F(r7, r5)     // Catch:{ all -> 0x0092 }
        L_0x0075:
            if (r6 == 0) goto L_0x007a
            m20594d(r8, r6)     // Catch:{ all -> 0x0092 }
        L_0x007a:
            java.util.concurrent.Executor r5 = p453tf.C13418j.m21108d()     // Catch:{ all -> 0x0092 }
            java.util.concurrent.atomic.AtomicBoolean r6 = f28385a     // Catch:{ all -> 0x0092 }
            boolean r1 = r6.compareAndSet(r3, r1)     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x0088
            monitor-exit(r0)
            return
        L_0x0088:
            hg.m r1 = new hg.m     // Catch:{ all -> 0x0092 }
            r1.<init>(r2, r8, r4)     // Catch:{ all -> 0x0092 }
            r5.execute(r1)     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)
            return
        L_0x0092:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12876l.m20593c(hg.k):void");
    }

    /* renamed from: d */
    public static final synchronized JSONObject m20594d(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        synchronized (C12876l.class) {
            C19383o.m32797g(str, "applicationId");
            jSONObject2 = (JSONObject) f28387c.get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray == null || (jSONObject3 = optJSONArray.optJSONObject(0)) == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                    jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                } catch (JSONException e) {
                    C12869i0.m20550F("FacebookSDK", e);
                }
            }
            f28387c.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* renamed from: e */
    public static void m20595e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<C12877a> concurrentLinkedQueue = f28386b;
            if (!concurrentLinkedQueue.isEmpty()) {
                C12877a poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new C12878b(poll));
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public static final void m20596f(String str) {
        C19383o.m32797g(str, "applicationId");
        f28390f.getClass();
        JSONObject a = m20591a(str);
        Context b = C13418j.m21106b();
        b.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(C0388a.m1049e(new Object[]{str}, 1, "com.facebook.internal.APP_GATEKEEPERS.%s", "java.lang.String.format(format, *args)"), a.toString()).apply();
        m20594d(str, a);
    }
}
