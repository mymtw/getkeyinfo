package p079d3;

import androidx.work.C3422l;
import androidx.work.C3429n;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import p252u2.C8120b;
import p252u2.C8124e;
import p252u2.C8125f;
import p252u2.C8129j;

/* renamed from: d3.e */
public final class C6632e implements Runnable {

    /* renamed from: d */
    public static final String f14635d = C3422l.m8214e("EnqueueRunnable");

    /* renamed from: b */
    public final C8125f f14636b;

    /* renamed from: c */
    public final C8120b f14637c = new C8120b();

    public C6632e(C8125f fVar) {
        this.f14636b = fVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x01a8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13016a(p252u2.C8125f r21) {
        /*
            r0 = r21
            java.util.List<u2.f> r1 = r0.f17752g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0041
            java.util.Iterator r1 = r1.iterator()
            r4 = r2
        L_0x000d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r1.next()
            u2.f r5 = (p252u2.C8125f) r5
            boolean r6 = r5.f17753h
            if (r6 != 0) goto L_0x0023
            boolean r5 = m13016a(r5)
            r4 = r4 | r5
            goto L_0x000d
        L_0x0023:
            androidx.work.l r6 = androidx.work.C3422l.m8213c()
            java.lang.String r7 = f14635d
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.util.ArrayList r5 = r5.f17750e
            java.lang.String r9 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r9, r5)
            r8[r2] = r5
            java.lang.String r5 = "Already enqueued work ids (%s)."
            java.lang.String r5 = java.lang.String.format(r5, r8)
            java.lang.Throwable[] r8 = new java.lang.Throwable[r2]
            r6.mo12929f(r7, r5, r8)
            goto L_0x000d
        L_0x0041:
            r4 = r2
        L_0x0042:
            java.util.HashSet r1 = p252u2.C8125f.m16340O(r21)
            u2.j r5 = r0.f17746a
            java.util.List<? extends androidx.work.r> r6 = r0.f17749d
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r7 = r0.f17747b
            androidx.work.ExistingWorkPolicy r8 = r0.f17748c
            long r9 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r11 = r5.f17763c
            if (r1 == 0) goto L_0x0063
            int r12 = r1.length
            if (r12 <= 0) goto L_0x0063
            r12 = r3
            goto L_0x0064
        L_0x0063:
            r12 = r2
        L_0x0064:
            if (r12 == 0) goto L_0x00b4
            int r13 = r1.length
            r14 = r2
            r16 = r14
            r17 = r16
            r15 = r3
        L_0x006d:
            if (r14 >= r13) goto L_0x00b9
            r2 = r1[r14]
            c3.p r18 = r11.mo12857t()
            r3 = r18
            c3.q r3 = (p034c3.C4394q) r3
            c3.o r3 = r3.mo14333i(r2)
            if (r3 != 0) goto L_0x0098
            androidx.work.l r1 = androidx.work.C3422l.m8213c()
            java.lang.String r3 = f14635d
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r2
            java.lang.String r2 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r2, r6)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r5]
            r1.mo12927b(r3, r2, r6)
            goto L_0x00ff
        L_0x0098:
            androidx.work.WorkInfo$State r2 = r3.f9645b
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.SUCCEEDED
            if (r2 != r3) goto L_0x00a0
            r3 = 1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r15 = r15 & r3
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.FAILED
            if (r2 != r3) goto L_0x00a9
            r16 = 1
            goto L_0x00af
        L_0x00a9:
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.CANCELLED
            if (r2 != r3) goto L_0x00af
            r17 = 1
        L_0x00af:
            int r14 = r14 + 1
            r2 = 0
            r3 = 1
            goto L_0x006d
        L_0x00b4:
            r15 = 1
            r16 = 0
            r17 = 0
        L_0x00b9:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00c5
            if (r12 != 0) goto L_0x00c5
            r3 = 1
            goto L_0x00c6
        L_0x00c5:
            r3 = 0
        L_0x00c6:
            if (r3 == 0) goto L_0x01fd
            c3.p r3 = r11.mo12857t()
            c3.q r3 = (p034c3.C4394q) r3
            java.util.ArrayList r3 = r3.mo14334j(r7)
            boolean r13 = r3.isEmpty()
            if (r13 != 0) goto L_0x01fd
            androidx.work.ExistingWorkPolicy r13 = androidx.work.ExistingWorkPolicy.APPEND
            if (r8 == r13) goto L_0x0130
            androidx.work.ExistingWorkPolicy r13 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r8 != r13) goto L_0x00e1
            goto L_0x0130
        L_0x00e1:
            androidx.work.ExistingWorkPolicy r13 = androidx.work.ExistingWorkPolicy.KEEP
            if (r8 != r13) goto L_0x0105
            java.util.Iterator r8 = r3.iterator()
        L_0x00e9:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0105
            java.lang.Object r13 = r8.next()
            c3.o$a r13 = (p034c3.C4391o.C4392a) r13
            androidx.work.WorkInfo$State r13 = r13.f9663b
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo$State.ENQUEUED
            if (r13 == r14) goto L_0x00ff
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo$State.RUNNING
            if (r13 != r14) goto L_0x00e9
        L_0x00ff:
            r20 = r4
            r1 = 1
            r2 = 0
            goto L_0x0326
        L_0x0105:
            d3.c r8 = new d3.c
            r8.<init>(r5, r7)
            r8.run()
            c3.p r5 = r11.mo12857t()
            java.util.Iterator r3 = r3.iterator()
        L_0x0115:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x012a
            java.lang.Object r8 = r3.next()
            c3.o$a r8 = (p034c3.C4391o.C4392a) r8
            java.lang.String r8 = r8.f9662a
            r13 = r5
            c3.q r13 = (p034c3.C4394q) r13
            r13.mo14325a(r8)
            goto L_0x0115
        L_0x012a:
            r20 = r4
            r4 = 0
            r5 = 1
            goto L_0x0201
        L_0x0130:
            c3.b r5 = r11.mo12852o()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x013d:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x01b7
            java.lang.Object r13 = r3.next()
            c3.o$a r13 = (p034c3.C4391o.C4392a) r13
            java.lang.String r14 = r13.f9662a
            r18 = r3
            r3 = r5
            c3.c r3 = (p034c3.C4372c) r3
            r3.getClass()
            r19 = r5
            java.lang.String r5 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r20 = r4
            r4 = 1
            androidx.room.d0 r5 = androidx.room.C3226d0.m7877d(r4, r5)
            if (r14 != 0) goto L_0x0164
            r5.mo12015p0(r4)
            goto L_0x0167
        L_0x0164:
            r5.mo12011Y(r4, r14)
        L_0x0167:
            androidx.room.RoomDatabase r4 = r3.f9625a
            r4.mo11973b()
            androidx.room.RoomDatabase r3 = r3.f9625a
            android.database.Cursor r3 = r3.mo11983l(r5)
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x01af }
            if (r4 == 0) goto L_0x0181
            r4 = 0
            int r14 = r3.getInt(r4)     // Catch:{ all -> 0x01af }
            if (r14 == 0) goto L_0x0182
            r14 = 1
            goto L_0x0183
        L_0x0181:
            r4 = 0
        L_0x0182:
            r14 = r4
        L_0x0183:
            r3.close()
            r5.release()
            if (r14 != 0) goto L_0x01a8
            androidx.work.WorkInfo$State r3 = r13.f9663b
            androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo$State.SUCCEEDED
            if (r3 != r5) goto L_0x0193
            r5 = 1
            goto L_0x0194
        L_0x0193:
            r5 = r4
        L_0x0194:
            r5 = r5 & r15
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo$State.FAILED
            if (r3 != r14) goto L_0x019c
            r16 = 1
            goto L_0x01a2
        L_0x019c:
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo$State.CANCELLED
            if (r3 != r14) goto L_0x01a2
            r17 = 1
        L_0x01a2:
            java.lang.String r3 = r13.f9662a
            r12.add(r3)
            r15 = r5
        L_0x01a8:
            r3 = r18
            r5 = r19
            r4 = r20
            goto L_0x013d
        L_0x01af:
            r0 = move-exception
            r3.close()
            r5.release()
            throw r0
        L_0x01b7:
            r20 = r4
            r4 = 0
            androidx.work.ExistingWorkPolicy r3 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r8 != r3) goto L_0x01ea
            if (r17 != 0) goto L_0x01c2
            if (r16 == 0) goto L_0x01ea
        L_0x01c2:
            c3.p r3 = r11.mo12857t()
            c3.q r3 = (p034c3.C4394q) r3
            java.util.ArrayList r5 = r3.mo14334j(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x01d0:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01e2
            java.lang.Object r8 = r5.next()
            c3.o$a r8 = (p034c3.C4391o.C4392a) r8
            java.lang.String r8 = r8.f9662a
            r3.mo14325a(r8)
            goto L_0x01d0
        L_0x01e2:
            java.util.List r12 = java.util.Collections.emptyList()
            r5 = r4
            r17 = r5
            goto L_0x01ec
        L_0x01ea:
            r5 = r16
        L_0x01ec:
            java.lang.Object[] r1 = r12.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x01f9
            r16 = r5
            r12 = 1
            goto L_0x0200
        L_0x01f9:
            r12 = r4
            r16 = r5
            goto L_0x0200
        L_0x01fd:
            r20 = r4
            r4 = 0
        L_0x0200:
            r5 = r4
        L_0x0201:
            java.util.Iterator r3 = r6.iterator()
        L_0x0205:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0324
            java.lang.Object r6 = r3.next()
            androidx.work.r r6 = (androidx.work.C3438r) r6
            c3.o r8 = r6.f8039b
            if (r12 == 0) goto L_0x022a
            if (r15 != 0) goto L_0x022a
            if (r16 == 0) goto L_0x021e
            androidx.work.WorkInfo$State r13 = androidx.work.WorkInfo$State.FAILED
            r8.f9645b = r13
            goto L_0x0237
        L_0x021e:
            if (r17 == 0) goto L_0x0225
            androidx.work.WorkInfo$State r13 = androidx.work.WorkInfo$State.CANCELLED
            r8.f9645b = r13
            goto L_0x0237
        L_0x0225:
            androidx.work.WorkInfo$State r13 = androidx.work.WorkInfo$State.BLOCKED
            r8.f9645b = r13
            goto L_0x0237
        L_0x022a:
            boolean r13 = r8.mo14319c()
            if (r13 != 0) goto L_0x0233
            r8.f9657n = r9
            goto L_0x0237
        L_0x0233:
            r13 = 0
            r8.f9657n = r13
        L_0x0237:
            androidx.work.WorkInfo$State r13 = r8.f9645b
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo$State.ENQUEUED
            if (r13 != r14) goto L_0x023e
            r5 = 1
        L_0x023e:
            c3.p r13 = r11.mo12857t()
            c3.q r13 = (p034c3.C4394q) r13
            androidx.room.RoomDatabase r14 = r13.f9664a
            r14.mo11973b()
            androidx.room.RoomDatabase r14 = r13.f9664a
            r14.mo11974c()
            c3.q$a r14 = r13.f9665b     // Catch:{ all -> 0x031d }
            r14.mo12038e(r8)     // Catch:{ all -> 0x031d }
            androidx.room.RoomDatabase r8 = r13.f9664a     // Catch:{ all -> 0x031d }
            r8.mo11984m()     // Catch:{ all -> 0x031d }
            androidx.room.RoomDatabase r8 = r13.f9664a
            r8.mo11980i()
            if (r12 == 0) goto L_0x029e
            int r8 = r1.length
            r13 = r4
        L_0x0261:
            if (r13 >= r8) goto L_0x029e
            r14 = r1[r13]
            c3.a r4 = new c3.a
            r18 = r1
            java.util.UUID r1 = r6.f8038a
            java.lang.String r1 = r1.toString()
            r4.<init>(r1, r14)
            c3.b r1 = r11.mo12852o()
            c3.c r1 = (p034c3.C4372c) r1
            androidx.room.RoomDatabase r14 = r1.f9625a
            r14.mo11973b()
            androidx.room.RoomDatabase r14 = r1.f9625a
            r14.mo11974c()
            c3.c$a r14 = r1.f9626b     // Catch:{ all -> 0x0297 }
            r14.mo12038e(r4)     // Catch:{ all -> 0x0297 }
            androidx.room.RoomDatabase r4 = r1.f9625a     // Catch:{ all -> 0x0297 }
            r4.mo11984m()     // Catch:{ all -> 0x0297 }
            androidx.room.RoomDatabase r1 = r1.f9625a
            r1.mo11980i()
            int r13 = r13 + 1
            r1 = r18
            r4 = 0
            goto L_0x0261
        L_0x0297:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r1.f9625a
            r1.mo11980i()
            throw r0
        L_0x029e:
            r18 = r1
            java.util.Set<java.lang.String> r1 = r6.f8040c
            java.util.Iterator r1 = r1.iterator()
        L_0x02a6:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02e4
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            c3.s r8 = r11.mo12858u()
            c3.r r13 = new c3.r
            java.util.UUID r14 = r6.f8038a
            java.lang.String r14 = r14.toString()
            r13.<init>(r4, r14)
            c3.t r8 = (p034c3.C4405t) r8
            androidx.room.RoomDatabase r4 = r8.f9675a
            r4.mo11973b()
            androidx.room.RoomDatabase r4 = r8.f9675a
            r4.mo11974c()
            c3.t$a r4 = r8.f9676b     // Catch:{ all -> 0x02dd }
            r4.mo12038e(r13)     // Catch:{ all -> 0x02dd }
            androidx.room.RoomDatabase r4 = r8.f9675a     // Catch:{ all -> 0x02dd }
            r4.mo11984m()     // Catch:{ all -> 0x02dd }
            androidx.room.RoomDatabase r4 = r8.f9675a
            r4.mo11980i()
            goto L_0x02a6
        L_0x02dd:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r8.f9675a
            r1.mo11980i()
            throw r0
        L_0x02e4:
            if (r2 == 0) goto L_0x0318
            c3.k r1 = r11.mo12855r()
            c3.j r4 = new c3.j
            java.util.UUID r6 = r6.f8038a
            java.lang.String r6 = r6.toString()
            r4.<init>(r7, r6)
            c3.l r1 = (p034c3.C4385l) r1
            androidx.room.RoomDatabase r6 = r1.f9638a
            r6.mo11973b()
            androidx.room.RoomDatabase r6 = r1.f9638a
            r6.mo11974c()
            c3.l$a r6 = r1.f9639b     // Catch:{ all -> 0x0311 }
            r6.mo12038e(r4)     // Catch:{ all -> 0x0311 }
            androidx.room.RoomDatabase r4 = r1.f9638a     // Catch:{ all -> 0x0311 }
            r4.mo11984m()     // Catch:{ all -> 0x0311 }
            androidx.room.RoomDatabase r1 = r1.f9638a
            r1.mo11980i()
            goto L_0x0318
        L_0x0311:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r1.f9638a
            r1.mo11980i()
            throw r0
        L_0x0318:
            r1 = r18
            r4 = 0
            goto L_0x0205
        L_0x031d:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r13.f9664a
            r1.mo11980i()
            throw r0
        L_0x0324:
            r2 = r5
            r1 = 1
        L_0x0326:
            r0.f17753h = r1
            r0 = r20 | r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p079d3.C6632e.m13016a(u2.f):boolean");
    }

    public final void run() {
        WorkDatabase workDatabase;
        try {
            C8125f fVar = this.f14636b;
            fVar.getClass();
            if (!C8125f.m16339N(fVar, new HashSet())) {
                workDatabase = this.f14636b.f17746a.f17763c;
                workDatabase.mo11974c();
                boolean a = m13016a(this.f14636b);
                workDatabase.mo11984m();
                workDatabase.mo11980i();
                if (a) {
                    C6634g.m13017a(this.f14636b.f17746a.f17761a, RescheduleReceiver.class, true);
                    C8129j jVar = this.f14636b.f17746a;
                    C8124e.m16338a(jVar.f17762b, jVar.f17763c, jVar.f17765e);
                }
                this.f14637c.mo20713a(C3429n.f8035a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f14636b}));
        } catch (Throwable th) {
            this.f14637c.mo20713a(new C3429n.C3430a.C3431a(th));
        }
    }
}
