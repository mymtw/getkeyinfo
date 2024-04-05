package p461uf;

import com.facebook.appevents.AppEvent;
import java.util.ArrayList;
import java.util.List;
import p365hg.C12831b;
import p401mg.C13080a;

/* renamed from: uf.n */
public final class C13521n {

    /* renamed from: a */
    public ArrayList f29577a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f29578b = new ArrayList();

    /* renamed from: c */
    public int f29579c;

    /* renamed from: d */
    public final C12831b f29580d;

    /* renamed from: e */
    public final String f29581e;

    public C13521n(C12831b bVar, String str) {
        this.f29580d = bVar;
        this.f29581e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo46176a(com.facebook.appevents.AppEvent r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = p401mg.C13080a.m20762b(r2)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)     // Catch:{ all -> 0x002d }
            java.util.ArrayList r0 = r2.f29577a     // Catch:{ all -> 0x002d }
            int r0 = r0.size()     // Catch:{ all -> 0x002d }
            java.util.ArrayList r1 = r2.f29578b     // Catch:{ all -> 0x002d }
            int r1 = r1.size()     // Catch:{ all -> 0x002d }
            int r0 = r0 + r1
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto L_0x0026
            int r3 = r2.f29579c     // Catch:{ all -> 0x002d }
            int r3 = r3 + 1
            r2.f29579c = r3     // Catch:{ all -> 0x002d }
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = r2.f29577a     // Catch:{ all -> 0x002d }
            r0.add(r3)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r3 = move-exception
            p401mg.C13080a.m20761a(r2, r3)     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p461uf.C13521n.mo46176a(com.facebook.appevents.AppEvent):void");
    }

    /* renamed from: b */
    public final synchronized void mo46177b(boolean z) {
        if (!C13080a.m20762b(this)) {
            if (z) {
                try {
                    this.f29577a.addAll(this.f29578b);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                    return;
                }
            }
            this.f29578b.clear();
            this.f29579c = 0;
        }
    }

    /* renamed from: c */
    public final synchronized List<AppEvent> mo46178c() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.f29577a;
            this.f29577a = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        p401mg.C13080a.m20761a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        return 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo46179d(com.facebook.GraphRequest r9, android.content.Context r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = p401mg.C13080a.m20762b(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "applicationContext"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)     // Catch:{ all -> 0x0080 }
            monitor-enter(r8)     // Catch:{ all -> 0x0080 }
            int r5 = r8.f29579c     // Catch:{ all -> 0x007d }
            java.util.ArrayList r0 = r8.f29577a     // Catch:{ all -> 0x007d }
            p484xf.C13882a.m21407b(r0)     // Catch:{ all -> 0x007d }
            java.util.ArrayList r0 = r8.f29578b     // Catch:{ all -> 0x007d }
            java.util.ArrayList r2 = r8.f29577a     // Catch:{ all -> 0x007d }
            r0.addAll(r2)     // Catch:{ all -> 0x007d }
            java.util.ArrayList r0 = r8.f29577a     // Catch:{ all -> 0x007d }
            r0.clear()     // Catch:{ all -> 0x007d }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x007d }
            r0.<init>()     // Catch:{ all -> 0x007d }
            java.util.ArrayList r2 = r8.f29578b     // Catch:{ all -> 0x007d }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x007d }
        L_0x002c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0065
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007d }
            com.facebook.appevents.AppEvent r3 = (com.facebook.appevents.AppEvent) r3     // Catch:{ all -> 0x007d }
            boolean r4 = r3.isChecksumValid()     // Catch:{ all -> 0x007d }
            if (r4 == 0) goto L_0x004e
            if (r11 != 0) goto L_0x0046
            boolean r4 = r3.isImplicit()     // Catch:{ all -> 0x007d }
            if (r4 != 0) goto L_0x002c
        L_0x0046:
            org.json.JSONObject r3 = r3.getJsonObject()     // Catch:{ all -> 0x007d }
            r0.put(r3)     // Catch:{ all -> 0x007d }
            goto L_0x002c
        L_0x004e:
            java.lang.String r4 = "n"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r6.<init>()     // Catch:{ all -> 0x007d }
            java.lang.String r7 = "Event with invalid checksum: "
            r6.append(r7)     // Catch:{ all -> 0x007d }
            r6.append(r3)     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x007d }
            p365hg.C12869i0.m20551G(r4, r3)     // Catch:{ all -> 0x007d }
            goto L_0x002c
        L_0x0065:
            int r11 = r0.length()     // Catch:{ all -> 0x007d }
            if (r11 != 0) goto L_0x006d
            monitor-exit(r8)     // Catch:{ all -> 0x0080 }
            return r1
        L_0x006d:
            kotlin.m r11 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x007d }
            monitor-exit(r8)     // Catch:{ all -> 0x0080 }
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r0
            r7 = r12
            r2.mo46180e(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0080 }
            int r9 = r0.length()     // Catch:{ all -> 0x0080 }
            return r9
        L_0x007d:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r9 = move-exception
            p401mg.C13080a.m20761a(r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p461uf.C13521n.mo46179d(com.facebook.GraphRequest, android.content.Context, boolean, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        p401mg.C13080a.m20761a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001d */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46180e(com.facebook.GraphRequest r4, android.content.Context r5, int r6, org.json.JSONArray r7, boolean r8) {
        /*
            r3 = this;
            boolean r0 = p401mg.C13080a.m20762b(r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType r0 = com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS     // Catch:{ JSONException -> 0x001d }
            hg.b r1 = r3.f29580d     // Catch:{ JSONException -> 0x001d }
            java.lang.String r2 = r3.f29581e     // Catch:{ JSONException -> 0x001d }
            org.json.JSONObject r5 = com.facebook.appevents.internal.AppEventsLoggerUtility.m20070a(r0, r1, r2, r8, r5)     // Catch:{ JSONException -> 0x001d }
            int r8 = r3.f29579c     // Catch:{ JSONException -> 0x001d }
            if (r8 <= 0) goto L_0x0022
            java.lang.String r8 = "num_skipped_events"
            r5.put(r8, r6)     // Catch:{ JSONException -> 0x001d }
            goto L_0x0022
        L_0x001b:
            r4 = move-exception
            goto L_0x0039
        L_0x001d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x001b }
            r5.<init>()     // Catch:{ all -> 0x001b }
        L_0x0022:
            r4.f27227c = r5     // Catch:{ all -> 0x001b }
            android.os.Bundle r5 = r4.f27228d     // Catch:{ all -> 0x001b }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x001b }
            java.lang.String r7 = "events.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)     // Catch:{ all -> 0x001b }
            java.lang.String r7 = "custom_events"
            r5.putString(r7, r6)     // Catch:{ all -> 0x001b }
            r4.f27229e = r6     // Catch:{ all -> 0x001b }
            r4.f27228d = r5     // Catch:{ all -> 0x001b }
            return
        L_0x0039:
            p401mg.C13080a.m20761a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p461uf.C13521n.mo46180e(com.facebook.GraphRequest, android.content.Context, int, org.json.JSONArray, boolean):void");
    }
}
