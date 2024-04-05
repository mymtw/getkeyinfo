package p584hn;

import android.support.p013v4.media.C0072d;
import com.google.firebase.perf.p530v1.C16676i;
import java.util.Iterator;
import p568fn.C17781a;

/* renamed from: hn.d */
public final class C17833d extends C17834e {

    /* renamed from: b */
    public static final C17781a f38749b = C17781a.m29823d();

    /* renamed from: a */
    public final C16676i f38750a;

    public C17833d(C16676i iVar) {
        this.f38750a = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0056 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m29954d(com.google.firebase.perf.p530v1.C16676i r6, int r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 1
            if (r7 <= r1) goto L_0x000f
            fn.a r6 = f38749b
            java.lang.String r7 = "Exceed MAX_SUBTRACE_DEEP:1"
            r6.mo69018f(r7)
            return r0
        L_0x000f:
            java.util.Map r2 = r6.mo59415J()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0030
            goto L_0x0051
        L_0x0030:
            java.lang.String r4 = r4.trim()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0042
            fn.a r4 = f38749b
            java.lang.String r5 = "counterId is empty"
            r4.mo69018f(r5)
            goto L_0x0051
        L_0x0042:
            int r4 = r4.length()
            r5 = 100
            if (r4 <= r5) goto L_0x0053
            fn.a r4 = f38749b
            java.lang.String r5 = "counterId exceeded max length 100"
            r4.mo69018f(r5)
        L_0x0051:
            r4 = r0
            goto L_0x0054
        L_0x0053:
            r4 = r1
        L_0x0054:
            if (r4 != 0) goto L_0x006f
            fn.a r6 = f38749b
            java.lang.String r7 = "invalid CounterId:"
            java.lang.StringBuilder r7 = android.support.p013v4.media.C0072d.m201h(r7)
            java.lang.Object r1 = r3.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.mo69018f(r7)
            return r0
        L_0x006f:
            java.lang.Object r4 = r3.getValue()
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0079
            r4 = r1
            goto L_0x007a
        L_0x0079:
            r4 = r0
        L_0x007a:
            if (r4 != 0) goto L_0x001b
            fn.a r6 = f38749b
            java.lang.String r7 = "invalid CounterValue:"
            java.lang.StringBuilder r7 = android.support.p013v4.media.C0072d.m201h(r7)
            java.lang.Object r1 = r3.getValue()
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.mo69018f(r7)
            return r0
        L_0x0093:
            com.google.protobuf.v$f r6 = r6.mo59420P()
            java.util.Iterator r6 = r6.iterator()
        L_0x009b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00b0
            java.lang.Object r2 = r6.next()
            com.google.firebase.perf.v1.i r2 = (com.google.firebase.perf.p530v1.C16676i) r2
            int r3 = r7 + 1
            boolean r2 = m29954d(r2, r3)
            if (r2 != 0) goto L_0x009b
            return r0
        L_0x00b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p584hn.C17833d.m29954d(com.google.firebase.perf.v1.i, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m29955e(com.google.firebase.perf.p530v1.C16676i r6, int r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x000b
            fn.a r6 = f38749b
            java.lang.String r7 = "TraceMetric is null"
            r6.mo69018f(r7)
            return r0
        L_0x000b:
            r1 = 1
            if (r7 <= r1) goto L_0x0016
            fn.a r6 = f38749b
            java.lang.String r7 = "Exceed MAX_SUBTRACE_DEEP:1"
            r6.mo69018f(r7)
            return r0
        L_0x0016:
            java.lang.String r2 = r6.mo59418N()
            if (r2 != 0) goto L_0x001d
            goto L_0x0031
        L_0x001d:
            java.lang.String r2 = r2.trim()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0031
            int r2 = r2.length()
            r3 = 100
            if (r2 > r3) goto L_0x0031
            r2 = r1
            goto L_0x0032
        L_0x0031:
            r2 = r0
        L_0x0032:
            if (r2 != 0) goto L_0x004b
            fn.a r7 = f38749b
            java.lang.String r1 = "invalid TraceId:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            java.lang.String r6 = r6.mo59418N()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r7.mo69018f(r6)
            return r0
        L_0x004b:
            long r2 = r6.mo59417M()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0057
            r2 = r1
            goto L_0x0058
        L_0x0057:
            r2 = r0
        L_0x0058:
            if (r2 != 0) goto L_0x0071
            fn.a r7 = f38749b
            java.lang.String r1 = "invalid TraceDuration:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            long r2 = r6.mo59417M()
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            r7.mo69018f(r6)
            return r0
        L_0x0071:
            boolean r2 = r6.mo59421Q()
            if (r2 != 0) goto L_0x007f
            fn.a r6 = f38749b
            java.lang.String r7 = "clientStartTimeUs is null."
            r6.mo69018f(r7)
            return r0
        L_0x007f:
            java.lang.String r2 = r6.mo59418N()
            java.lang.String r3 = "_st_"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x00c3
            java.util.Map r2 = r6.mo59415J()
            com.google.firebase.perf.util.Constants$CounterNames r3 = com.google.firebase.perf.util.Constants$CounterNames.FRAMES_TOTAL
            java.lang.String r3 = r3.toString()
            java.lang.Object r2 = r2.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x00a9
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L_0x00a9
            r2 = r1
            goto L_0x00aa
        L_0x00a9:
            r2 = r0
        L_0x00aa:
            if (r2 != 0) goto L_0x00c3
            fn.a r7 = f38749b
            java.lang.String r1 = "non-positive totalFrames in screen trace "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            java.lang.String r6 = r6.mo59418N()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r7.mo69018f(r6)
            return r0
        L_0x00c3:
            com.google.protobuf.v$f r2 = r6.mo59420P()
            java.util.Iterator r2 = r2.iterator()
        L_0x00cb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00e0
            java.lang.Object r3 = r2.next()
            com.google.firebase.perf.v1.i r3 = (com.google.firebase.perf.p530v1.C16676i) r3
            int r4 = r7 + 1
            boolean r3 = m29955e(r3, r4)
            if (r3 != 0) goto L_0x00cb
            return r0
        L_0x00e0:
            java.util.Map r6 = r6.mo59416K()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00ec:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0105
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.String r7 = p584hn.C17834e.m29957b(r7)
            if (r7 == 0) goto L_0x00ec
            fn.a r6 = f38749b
            r6.mo69018f(r7)
            r6 = r0
            goto L_0x0106
        L_0x0105:
            r6 = r1
        L_0x0106:
            if (r6 != 0) goto L_0x0109
            return r0
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p584hn.C17833d.m29955e(com.google.firebase.perf.v1.i, int):boolean");
    }

    /* renamed from: a */
    public final boolean mo69066a() {
        boolean z;
        boolean z2;
        if (!m29955e(this.f38750a, 0)) {
            C17781a aVar = f38749b;
            StringBuilder h = C0072d.m201h("Invalid Trace:");
            h.append(this.f38750a.mo59418N());
            aVar.mo69018f(h.toString());
            return false;
        }
        C16676i iVar = this.f38750a;
        if (iVar.mo59414I() > 0) {
            z = true;
        } else {
            Iterator it = iVar.mo59420P().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((C16676i) it.next()).mo59414I() > 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            z = true;
        }
        if (!z || m29954d(this.f38750a, 0)) {
            return true;
        }
        C17781a aVar2 = f38749b;
        StringBuilder h2 = C0072d.m201h("Invalid Counters for Trace:");
        h2.append(this.f38750a.mo59418N());
        aVar2.mo69018f(h2.toString());
        return false;
    }
}
