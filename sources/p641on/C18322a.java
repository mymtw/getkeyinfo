package p641on;

import java.util.concurrent.Callable;

/* renamed from: on.a */
public final /* synthetic */ class C18322a implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C18331i f40219b;

    public /* synthetic */ C18322a(C18331i iVar) {
        this.f40219b = iVar;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [on.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033 A[SYNTHETIC, Splitter:B:14:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x0030 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            on.i r0 = r7.f40219b
            monitor-enter(r0)
            r1 = 0
            android.content.Context r2 = r0.f40250a     // Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x0030 }
            java.lang.String r3 = r0.f40251b     // Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x0030 }
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x0030 }
            int r3 = r2.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            byte[] r4 = new byte[r3]     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            r5 = 0
            r2.read(r4, r5, r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            java.lang.String r3 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            r4.<init>(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            on.e r1 = p641on.C18327e.m30956a(r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            r2.close()     // Catch:{ all -> 0x003e }
            monitor-exit(r0)
            goto L_0x0042
        L_0x002b:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0031
        L_0x0030:
            r2 = move-exception
        L_0x0031:
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ all -> 0x003e }
        L_0x0036:
            throw r2     // Catch:{ all -> 0x003e }
        L_0x0037:
            r2 = r1
        L_0x0038:
            if (r2 == 0) goto L_0x0041
            r2.close()     // Catch:{ all -> 0x003e }
            goto L_0x0041
        L_0x003e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0041:
            monitor-exit(r0)
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p641on.C18322a.call():java.lang.Object");
    }
}
