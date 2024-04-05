package p632nn;

import com.google.firebase.installations.C16563d;
import com.google.firebase.remoteconfig.internal.C16688a;
import com.google.firebase.remoteconfig.internal.C16690b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p583hm.C17829b;
import p641on.C18325d;
import p641on.C18330h;

/* renamed from: nn.b */
public final class C18276b {

    /* renamed from: a */
    public final C17829b f40112a;

    /* renamed from: b */
    public final Executor f40113b;

    /* renamed from: c */
    public final C18325d f40114c;

    /* renamed from: d */
    public final C18325d f40115d;

    /* renamed from: e */
    public final C16688a f40116e;

    /* renamed from: f */
    public final C18330h f40117f;

    /* renamed from: g */
    public final C16690b f40118g;

    /* renamed from: h */
    public final C16563d f40119h;

    public C18276b(C16563d dVar, C17829b bVar, ExecutorService executorService, C18325d dVar2, C18325d dVar3, C18325d dVar4, C16688a aVar, C18330h hVar, C16690b bVar2) {
        this.f40119h = dVar;
        this.f40112a = bVar;
        this.f40113b = executorService;
        this.f40114c = dVar2;
        this.f40115d = dVar3;
        this.f40116e = aVar;
        this.f40117f = hVar;
        this.f40118g = bVar2;
    }

    /* renamed from: b */
    public static ArrayList m30897b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap mo69823a() {
        /*
            r13 = this;
            on.h r0 = r13.f40117f
            r0.getClass()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            on.d r2 = r0.f40247c
            java.util.HashSet r2 = p641on.C18330h.m30958b(r2)
            r1.addAll(r2)
            on.d r2 = r0.f40248d
            java.util.HashSet r2 = p641on.C18330h.m30958b(r2)
            r1.addAll(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            on.d r4 = r0.f40247c
            on.e r4 = p641on.C18330h.m30957a(r4)
            r5 = 0
            if (r4 != 0) goto L_0x003c
        L_0x003a:
            r4 = r5
            goto L_0x0042
        L_0x003c:
            org.json.JSONObject r4 = r4.f40233b     // Catch:{ JSONException -> 0x003a }
            java.lang.String r4 = r4.getString(r3)     // Catch:{ JSONException -> 0x003a }
        L_0x0042:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0079
            on.d r5 = r0.f40247c
            on.e r5 = p641on.C18330h.m30957a(r5)
            if (r5 != 0) goto L_0x004f
            goto L_0x0070
        L_0x004f:
            java.util.HashSet r8 = r0.f40245a
            monitor-enter(r8)
            java.util.HashSet r9 = r0.f40245a     // Catch:{ all -> 0x0076 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0076 }
        L_0x0058:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0076 }
            if (r10 == 0) goto L_0x006f
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0076 }
            com.google.android.gms.common.util.BiConsumer r10 = (com.google.android.gms.common.util.BiConsumer) r10     // Catch:{ all -> 0x0076 }
            java.util.concurrent.Executor r11 = r0.f40246b     // Catch:{ all -> 0x0076 }
            lh.i r12 = new lh.i     // Catch:{ all -> 0x0076 }
            r12.<init>(r10, r7, r3, r5)     // Catch:{ all -> 0x0076 }
            r11.execute(r12)     // Catch:{ all -> 0x0076 }
            goto L_0x0058
        L_0x006f:
            monitor-exit(r8)     // Catch:{ all -> 0x0076 }
        L_0x0070:
            on.j r5 = new on.j
            r5.<init>(r4, r6)
            goto L_0x00ac
        L_0x0076:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0076 }
            throw r0
        L_0x0079:
            on.d r4 = r0.f40248d
            on.e r4 = p641on.C18330h.m30957a(r4)
            if (r4 != 0) goto L_0x0082
            goto L_0x0088
        L_0x0082:
            org.json.JSONObject r4 = r4.f40233b     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r5 = r4.getString(r3)     // Catch:{ JSONException -> 0x0088 }
        L_0x0088:
            if (r5 == 0) goto L_0x0091
            on.j r4 = new on.j
            r4.<init>(r5, r7)
            r5 = r4
            goto L_0x00ac
        L_0x0091:
            java.lang.String r4 = "FirebaseRemoteConfigValue"
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r6 = 0
            r5[r6] = r4
            r5[r7] = r3
            java.lang.String r4 = "No value of type '%s' exists for parameter key '%s'."
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            android.util.Log.w(r5, r4)
            on.j r5 = new on.j
            java.lang.String r4 = ""
            r5.<init>(r4, r6)
        L_0x00ac:
            r2.put(r3, r5)
            goto L_0x0025
        L_0x00b1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p632nn.C18276b.mo69823a():java.util.HashMap");
    }
}
