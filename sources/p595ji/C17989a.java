package p595ji;

import com.google.android.exoplayer2.source.C14353l;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18353k;

/* renamed from: ji.a */
public final class C17989a implements C14353l {

    /* renamed from: a */
    public final C18353k f39331a;

    /* renamed from: b */
    public C18349h f39332b;

    /* renamed from: c */
    public C18346e f39333c;

    public C17989a(C18353k kVar) {
        this.f39331a = kVar;
    }

    /* renamed from: a */
    public final long mo69557a() {
        C18346e eVar = this.f39333c;
        if (eVar != null) {
            return eVar.f40294d;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0.f40294d != r11) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        if (r0.f40294d != r11) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        r1 = false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69558b(p505aj.C13999g r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, p644ph.C18351j r15) throws java.io.IOException {
        /*
            r7 = this;
            ph.e r6 = new ph.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f39333c = r6
            ph.h r8 = r7.f39332b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            ph.k r8 = r7.f39331a
            ph.h[] r8 = r8.mo69887a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0021
            r8 = r8[r13]
            r7.f39332b = r8
            goto L_0x00b7
        L_0x0021:
            int r10 = r8.length
            r0 = r13
        L_0x0023:
            if (r0 >= r10) goto L_0x0066
            r1 = r8[r0]
            boolean r2 = r1.mo47761f(r6)     // Catch:{ EOFException -> 0x0050, all -> 0x003d }
            if (r2 == 0) goto L_0x0032
            r7.f39332b = r1     // Catch:{ EOFException -> 0x0050, all -> 0x003d }
            r6.f40296f = r13
            goto L_0x0066
        L_0x0032:
            ph.h r1 = r7.f39332b
            if (r1 != 0) goto L_0x005d
            long r1 = r6.f40294d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x005b
            goto L_0x005d
        L_0x003d:
            r8 = move-exception
            ph.h r9 = r7.f39332b
            if (r9 != 0) goto L_0x004a
            long r9 = r6.f40294d
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r14 = r13
        L_0x004a:
            p513bj.C14075p.m21694f(r14)
            r6.f40296f = r13
            throw r8
        L_0x0050:
            ph.h r1 = r7.f39332b
            if (r1 != 0) goto L_0x005d
            long r1 = r6.f40294d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r1 = r13
            goto L_0x005e
        L_0x005d:
            r1 = r14
        L_0x005e:
            p513bj.C14075p.m21694f(r1)
            r6.f40296f = r13
            int r0 = r0 + 1
            goto L_0x0023
        L_0x0066:
            ph.h r10 = r7.f39332b
            if (r10 != 0) goto L_0x00b7
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r10 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException
            int r11 = p513bj.C14049b0.f30913a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L_0x0073:
            int r12 = r8.length
            if (r13 >= r12) goto L_0x0090
            r12 = r8[r13]
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            int r12 = r8.length
            int r12 = r12 + -1
            if (r13 >= r12) goto L_0x008d
            java.lang.String r12 = ", "
            r11.append(r12)
        L_0x008d:
            int r13 = r13 + 1
            goto L_0x0073
        L_0x0090:
            java.lang.String r8 = r11.toString()
            r11 = 58
            int r11 = androidx.compose.animation.C0391c.m1055a(r8, r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r9.getClass()
            r10.<init>(r8, r9)
            throw r10
        L_0x00b7:
            ph.h r8 = r7.f39332b
            r8.mo47758b(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p595ji.C17989a.mo69558b(aj.g, android.net.Uri, java.util.Map, long, long, ph.j):void");
    }
}
