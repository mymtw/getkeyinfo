package p145io.branch.referral;

import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p145io.branch.referral.ServerRequest;

/* renamed from: io.branch.referral.y */
public final class C7089y {

    /* renamed from: d */
    public static C7089y f15775d;

    /* renamed from: e */
    public static final Object f15776e = new Object();

    /* renamed from: a */
    public SharedPreferences f15777a;

    /* renamed from: b */
    public SharedPreferences.Editor f15778b;

    /* renamed from: c */
    public final List<ServerRequest> f15779c;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004a */
    @android.annotation.SuppressLint({"CommitPrefEdits"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7089y(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "BNC_Server_Request_Queue"
            r1 = 0
            android.content.SharedPreferences r0 = r7.getSharedPreferences(r0, r1)
            r6.f15777a = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.f15778b = r0
            android.content.SharedPreferences r0 = r6.f15777a
            java.lang.String r2 = "BNCServerRequestQueue"
            r3 = 0
            java.lang.String r0 = r0.getString(r2, r3)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.List r2 = java.util.Collections.synchronizedList(r2)
            java.lang.Object r3 = f15776e
            monitor-enter(r3)
            if (r0 == 0) goto L_0x004a
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x004a }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x004a }
            int r0 = r4.length()     // Catch:{ JSONException -> 0x004a }
            r5 = 25
            int r0 = java.lang.Math.min(r0, r5)     // Catch:{ JSONException -> 0x004a }
        L_0x0038:
            if (r1 >= r0) goto L_0x004a
            org.json.JSONObject r5 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x004a }
            io.branch.referral.ServerRequest r5 = p145io.branch.referral.ServerRequest.m13602d(r7, r5)     // Catch:{ JSONException -> 0x004a }
            if (r5 == 0) goto L_0x0047
            r2.add(r5)     // Catch:{ JSONException -> 0x004a }
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0038
        L_0x004a:
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            r6.f15779c = r2
            return
        L_0x004e:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7089y.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19387a(p145io.branch.referral.C7087w r3, int r4) {
        /*
            r2 = this;
            java.lang.Object r0 = f15776e
            monitor-enter(r0)
            java.util.List<io.branch.referral.ServerRequest> r1 = r2.f15779c     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            int r1 = r1.size()     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            if (r1 >= r4) goto L_0x0011
            java.util.List<io.branch.referral.ServerRequest> r4 = r2.f15779c     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            int r4 = r4.size()     // Catch:{ IndexOutOfBoundsException -> 0x001c }
        L_0x0011:
            java.util.List<io.branch.referral.ServerRequest> r1 = r2.f15779c     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            r1.add(r4, r3)     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            r2.mo19388b()     // Catch:{ IndexOutOfBoundsException -> 0x001c }
            goto L_0x001c
        L_0x001a:
            r3 = move-exception
            goto L_0x001e
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7089y.mo19387a(io.branch.referral.w, int):void");
    }

    /* renamed from: b */
    public final void mo19388b() {
        JSONObject q;
        try {
            JSONArray jSONArray = new JSONArray();
            synchronized (f15776e) {
                for (ServerRequest next : this.f15779c) {
                    if (next.mo19250i() && (q = next.mo19257q()) != null) {
                        jSONArray.put(q);
                    }
                }
            }
            this.f15778b.putString("BNCServerRequestQueue", jSONArray.toString()).apply();
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder h = C0072d.m201h("Failed to persist queue");
            if (message == null) {
                message = "";
            }
            h.append(message);
            C7077r.m13675a(h.toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000e */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19389c(p145io.branch.referral.ServerRequest r3) {
        /*
            r2 = this;
            java.lang.Object r0 = f15776e
            monitor-enter(r0)
            java.util.List<io.branch.referral.ServerRequest> r1 = r2.f15779c     // Catch:{ UnsupportedOperationException -> 0x000e }
            r1.remove(r3)     // Catch:{ UnsupportedOperationException -> 0x000e }
            r2.mo19388b()     // Catch:{ UnsupportedOperationException -> 0x000e }
            goto L_0x000e
        L_0x000c:
            r3 = move-exception
            goto L_0x0010
        L_0x000e:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7089y.mo19389c(io.branch.referral.ServerRequest):void");
    }

    /* renamed from: d */
    public final void mo19390d(ServerRequest.PROCESS_WAIT_LOCK process_wait_lock) {
        synchronized (f15776e) {
            for (ServerRequest next : this.f15779c) {
                if (next != null) {
                    next.f15620f.remove(process_wait_lock);
                }
            }
        }
    }
}
