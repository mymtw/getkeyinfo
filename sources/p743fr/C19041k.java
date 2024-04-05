package p743fr;

import java.util.List;
import p737cr.C18982a;

/* renamed from: fr.k */
public final class C19041k extends C18982a {

    /* renamed from: e */
    public final /* synthetic */ C19027d f42488e;

    /* renamed from: f */
    public final /* synthetic */ int f42489f;

    /* renamed from: g */
    public final /* synthetic */ List f42490g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19041k(String str, C19027d dVar, int i, List list) {
        super(str, true);
        this.f42488e = dVar;
        this.f42489f = i;
        this.f42490g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo70418a() {
        /*
            r3 = this;
            fr.d r0 = r3.f42488e
            androidx.compose.ui.text.input.m r0 = r0.f42436m
            java.util.List r1 = r3.f42490g
            r0.getClass()
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            fr.d r0 = r3.f42488e     // Catch:{ IOException -> 0x002e }
            fr.q r0 = r0.f42449z     // Catch:{ IOException -> 0x002e }
            int r1 = r3.f42489f     // Catch:{ IOException -> 0x002e }
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x002e }
            r0.mo70532g(r1, r2)     // Catch:{ IOException -> 0x002e }
            fr.d r0 = r3.f42488e     // Catch:{ IOException -> 0x002e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x002e }
            fr.d r1 = r3.f42488e     // Catch:{ all -> 0x002b }
            java.util.LinkedHashSet r1 = r1.f42424B     // Catch:{ all -> 0x002b }
            int r2 = r3.f42489f     // Catch:{ all -> 0x002b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002b }
            r1.remove(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x002e
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            throw r1     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p743fr.C19041k.mo70418a():long");
    }
}
