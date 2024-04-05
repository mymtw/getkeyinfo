package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.C3422l;
import java.util.HashMap;
import p252u2.C8119a;

/* renamed from: androidx.work.impl.background.systemalarm.a */
public final class C3398a implements C8119a {

    /* renamed from: e */
    public static final String f7928e = C3422l.m8214e("CommandHandler");

    /* renamed from: b */
    public final Context f7929b;

    /* renamed from: c */
    public final HashMap f7930c = new HashMap();

    /* renamed from: d */
    public final Object f7931d = new Object();

    public C3398a(Context context) {
        this.f7929b = context;
    }

    /* renamed from: a */
    public static Intent m8156a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    public static Intent m8157b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0127  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12865c(int r11, android.content.Intent r12, androidx.work.impl.background.systemalarm.C3401d r13) {
        /*
            r10 = this;
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "ACTION_CONSTRAINTS_CHANGED"
            boolean r1 = r1.equals(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00ba
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = f7928e
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r12
            java.lang.String r12 = "Handling constraints changed %s"
            java.lang.String r12 = java.lang.String.format(r12, r4)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.mo12926a(r1, r12, r4)
            androidx.work.impl.background.systemalarm.b r12 = new androidx.work.impl.background.systemalarm.b
            android.content.Context r0 = r10.f7929b
            r12.<init>(r0, r11, r13)
            u2.j r11 = r13.f7952f
            androidx.work.impl.WorkDatabase r11 = r11.f17763c
            c3.p r11 = r11.mo12857t()
            c3.q r11 = (p034c3.C4394q) r11
            java.util.ArrayList r11 = r11.mo14329e()
            androidx.work.impl.background.systemalarm.ConstraintProxy.updateAll(r0, r11)
            y2.d r13 = r12.f7936d
            r13.mo20960b(r11)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r11.size()
            r13.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Iterator r11 = r11.iterator()
        L_0x0051:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0079
            java.lang.Object r4 = r11.next()
            c3.o r4 = (p034c3.C4391o) r4
            java.lang.String r5 = r4.f9644a
            long r6 = r4.mo14317a()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0051
            boolean r6 = r4.mo14318b()
            if (r6 == 0) goto L_0x0075
            y2.d r6 = r12.f7936d
            boolean r5 = r6.mo20959a(r5)
            if (r5 == 0) goto L_0x0051
        L_0x0075:
            r13.add(r4)
            goto L_0x0051
        L_0x0079:
            java.util.Iterator r11 = r13.iterator()
        L_0x007d:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00b3
            java.lang.Object r13 = r11.next()
            c3.o r13 = (p034c3.C4391o) r13
            java.lang.String r13 = r13.f9644a
            android.content.Context r0 = r12.f7933a
            android.content.Intent r0 = m8156a(r0, r13)
            androidx.work.l r1 = androidx.work.C3422l.m8213c()
            java.lang.String r4 = androidx.work.impl.background.systemalarm.C3399b.f7932e
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r13
            java.lang.String r13 = "Creating a delay_met command for workSpec with id (%s)"
            java.lang.String r13 = java.lang.String.format(r13, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r3]
            r1.mo12926a(r4, r13, r5)
            androidx.work.impl.background.systemalarm.d r13 = r12.f7935c
            androidx.work.impl.background.systemalarm.d$b r1 = new androidx.work.impl.background.systemalarm.d$b
            int r4 = r12.f7934b
            r1.<init>(r4, r0, r13)
            r13.mo12876d(r1)
            goto L_0x007d
        L_0x00b3:
            y2.d r11 = r12.f7936d
            r11.mo20961c()
            goto L_0x031e
        L_0x00ba:
            java.lang.String r1 = "ACTION_RESCHEDULE"
            boolean r1 = r1.equals(r0)
            r4 = 2
            if (r1 == 0) goto L_0x00e5
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = f7928e
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4[r2] = r11
            java.lang.String r11 = "Handling reschedule %s, %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r3]
            r0.mo12926a(r1, r11, r12)
            u2.j r11 = r13.f7952f
            r11.mo20727h()
            goto L_0x031e
        L_0x00e5:
            android.os.Bundle r1 = r12.getExtras()
            java.lang.String r5 = "KEY_WORKSPEC_ID"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            if (r1 == 0) goto L_0x0109
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x00f8
            goto L_0x0109
        L_0x00f8:
            r6 = r3
        L_0x00f9:
            if (r6 >= r2) goto L_0x0107
            r7 = r5[r6]
            java.lang.Object r7 = r1.get(r7)
            if (r7 != 0) goto L_0x0104
            goto L_0x0109
        L_0x0104:
            int r6 = r6 + 1
            goto L_0x00f9
        L_0x0107:
            r1 = r2
            goto L_0x010a
        L_0x0109:
            r1 = r3
        L_0x010a:
            if (r1 != 0) goto L_0x0127
            androidx.work.l r11 = androidx.work.C3422l.m8213c()
            java.lang.String r12 = f7928e
            java.lang.String r13 = "Invalid request for %s, requires %s."
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            r1[r2] = r0
            java.lang.String r13 = java.lang.String.format(r13, r1)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r3]
            r11.mo12927b(r12, r13, r0)
            goto L_0x031e
        L_0x0127:
            java.lang.String r1 = "ACTION_SCHEDULE_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0216
            android.os.Bundle r12 = r12.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r12 = r12.getString(r0)
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = f7928e
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r12
            java.lang.String r6 = "Handling schedule work for %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]
            r0.mo12926a(r1, r5, r6)
            u2.j r0 = r13.f7952f
            androidx.work.impl.WorkDatabase r0 = r0.f17763c
            r0.mo11974c()
            c3.p r5 = r0.mo12857t()     // Catch:{ all -> 0x0211 }
            c3.q r5 = (p034c3.C4394q) r5     // Catch:{ all -> 0x0211 }
            c3.o r5 = r5.mo14333i(r12)     // Catch:{ all -> 0x0211 }
            java.lang.String r6 = "Skipping scheduling "
            if (r5 != 0) goto L_0x0182
            androidx.work.l r11 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x0211 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0211 }
            r13.<init>()     // Catch:{ all -> 0x0211 }
            r13.append(r6)     // Catch:{ all -> 0x0211 }
            r13.append(r12)     // Catch:{ all -> 0x0211 }
            java.lang.String r12 = " because it's no longer in the DB"
            r13.append(r12)     // Catch:{ all -> 0x0211 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x0211 }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0211 }
            r11.mo12929f(r1, r12, r13)     // Catch:{ all -> 0x0211 }
            goto L_0x020c
        L_0x0182:
            androidx.work.WorkInfo$State r7 = r5.f9645b     // Catch:{ all -> 0x0211 }
            boolean r7 = r7.isFinished()     // Catch:{ all -> 0x0211 }
            if (r7 == 0) goto L_0x01a8
            androidx.work.l r11 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x0211 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0211 }
            r13.<init>()     // Catch:{ all -> 0x0211 }
            r13.append(r6)     // Catch:{ all -> 0x0211 }
            r13.append(r12)     // Catch:{ all -> 0x0211 }
            java.lang.String r12 = "because it is finished."
            r13.append(r12)     // Catch:{ all -> 0x0211 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x0211 }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0211 }
            r11.mo12929f(r1, r12, r13)     // Catch:{ all -> 0x0211 }
            goto L_0x020c
        L_0x01a8:
            long r6 = r5.mo14317a()     // Catch:{ all -> 0x0211 }
            boolean r5 = r5.mo14318b()     // Catch:{ all -> 0x0211 }
            if (r5 != 0) goto L_0x01d3
            androidx.work.l r11 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x0211 }
            java.lang.String r5 = "Setting up Alarms for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0211 }
            r4[r3] = r12     // Catch:{ all -> 0x0211 }
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0211 }
            r4[r2] = r8     // Catch:{ all -> 0x0211 }
            java.lang.String r2 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x0211 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0211 }
            r11.mo12926a(r1, r2, r3)     // Catch:{ all -> 0x0211 }
            android.content.Context r11 = r10.f7929b     // Catch:{ all -> 0x0211 }
            u2.j r13 = r13.f7952f     // Catch:{ all -> 0x0211 }
            p271w2.C8228a.m16518b(r11, r13, r12, r6)     // Catch:{ all -> 0x0211 }
            goto L_0x0209
        L_0x01d3:
            androidx.work.l r5 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x0211 }
            java.lang.String r8 = "Opportunistically setting an alarm for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0211 }
            r4[r3] = r12     // Catch:{ all -> 0x0211 }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0211 }
            r4[r2] = r9     // Catch:{ all -> 0x0211 }
            java.lang.String r2 = java.lang.String.format(r8, r4)     // Catch:{ all -> 0x0211 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0211 }
            r5.mo12926a(r1, r2, r3)     // Catch:{ all -> 0x0211 }
            android.content.Context r1 = r10.f7929b     // Catch:{ all -> 0x0211 }
            u2.j r2 = r13.f7952f     // Catch:{ all -> 0x0211 }
            p271w2.C8228a.m16518b(r1, r2, r12, r6)     // Catch:{ all -> 0x0211 }
            android.content.Context r12 = r10.f7929b     // Catch:{ all -> 0x0211 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0211 }
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r2 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            r1.<init>(r12, r2)     // Catch:{ all -> 0x0211 }
            java.lang.String r12 = "ACTION_CONSTRAINTS_CHANGED"
            r1.setAction(r12)     // Catch:{ all -> 0x0211 }
            androidx.work.impl.background.systemalarm.d$b r12 = new androidx.work.impl.background.systemalarm.d$b     // Catch:{ all -> 0x0211 }
            r12.<init>(r11, r1, r13)     // Catch:{ all -> 0x0211 }
            r13.mo12876d(r12)     // Catch:{ all -> 0x0211 }
        L_0x0209:
            r0.mo11984m()     // Catch:{ all -> 0x0211 }
        L_0x020c:
            r0.mo11980i()
            goto L_0x031e
        L_0x0211:
            r11 = move-exception
            r0.mo11980i()
            throw r11
        L_0x0216:
            java.lang.String r1 = "ACTION_DELAY_MET"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0271
            android.os.Bundle r12 = r12.getExtras()
            java.lang.Object r1 = r10.f7931d
            monitor-enter(r1)
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r12 = r12.getString(r0)     // Catch:{ all -> 0x026e }
            androidx.work.l r0 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x026e }
            java.lang.String r4 = f7928e     // Catch:{ all -> 0x026e }
            java.lang.String r5 = "Handing delay met for %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x026e }
            r6[r3] = r12     // Catch:{ all -> 0x026e }
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x026e }
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x026e }
            r0.mo12926a(r4, r5, r6)     // Catch:{ all -> 0x026e }
            java.util.HashMap r0 = r10.f7930c     // Catch:{ all -> 0x026e }
            boolean r0 = r0.containsKey(r12)     // Catch:{ all -> 0x026e }
            if (r0 != 0) goto L_0x0258
            androidx.work.impl.background.systemalarm.c r0 = new androidx.work.impl.background.systemalarm.c     // Catch:{ all -> 0x026e }
            android.content.Context r2 = r10.f7929b     // Catch:{ all -> 0x026e }
            r0.<init>(r2, r11, r12, r13)     // Catch:{ all -> 0x026e }
            java.util.HashMap r11 = r10.f7930c     // Catch:{ all -> 0x026e }
            r11.put(r12, r0)     // Catch:{ all -> 0x026e }
            r0.mo12870d()     // Catch:{ all -> 0x026e }
            goto L_0x026b
        L_0x0258:
            androidx.work.l r11 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x026e }
            java.lang.String r13 = "WorkSpec %s is already being handled for ACTION_DELAY_MET"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x026e }
            r0[r3] = r12     // Catch:{ all -> 0x026e }
            java.lang.String r12 = java.lang.String.format(r13, r0)     // Catch:{ all -> 0x026e }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x026e }
            r11.mo12926a(r4, r12, r13)     // Catch:{ all -> 0x026e }
        L_0x026b:
            monitor-exit(r1)     // Catch:{ all -> 0x026e }
            goto L_0x031e
        L_0x026e:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x026e }
            throw r11
        L_0x0271:
            java.lang.String r1 = "ACTION_STOP_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02d2
            android.os.Bundle r11 = r12.getExtras()
            java.lang.String r12 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r12)
            androidx.work.l r12 = androidx.work.C3422l.m8213c()
            java.lang.String r0 = f7928e
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            java.lang.String r4 = "Handing stopWork work for %s"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r12.mo12926a(r0, r1, r4)
            u2.j r12 = r13.f7952f
            r12.mo20729j(r11)
            android.content.Context r12 = r10.f7929b
            u2.j r0 = r13.f7952f
            java.lang.String r1 = p271w2.C8228a.f18060a
            androidx.work.impl.WorkDatabase r0 = r0.f17763c
            c3.h r0 = r0.mo12854q()
            c3.i r0 = (p034c3.C4380i) r0
            c3.g r1 = r0.mo14312a(r11)
            if (r1 == 0) goto L_0x02ce
            int r1 = r1.f9632b
            p271w2.C8228a.m16517a(r12, r1, r11)
            androidx.work.l r12 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = p271w2.C8228a.f18060a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r11
            java.lang.String r4 = "Removing SystemIdInfo for workSpecId (%s)"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r12.mo12926a(r1, r2, r4)
            r0.mo14314c(r11)
        L_0x02ce:
            r13.onExecuted(r11, r3)
            goto L_0x031e
        L_0x02d2:
            java.lang.String r13 = "ACTION_EXECUTION_COMPLETED"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0309
            android.os.Bundle r13 = r12.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = "KEY_NEEDS_RESCHEDULE"
            boolean r13 = r13.getBoolean(r1)
            androidx.work.l r1 = androidx.work.C3422l.m8213c()
            java.lang.String r5 = f7928e
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4[r2] = r11
            java.lang.String r11 = "Handling onExecutionCompleted %s, %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r3]
            r1.mo12926a(r5, r11, r12)
            r10.onExecuted(r0, r13)
            goto L_0x031e
        L_0x0309:
            androidx.work.l r11 = androidx.work.C3422l.m8213c()
            java.lang.String r13 = f7928e
            java.lang.String r0 = "Ignoring intent %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r12
            java.lang.String r12 = java.lang.String.format(r0, r1)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r3]
            r11.mo12929f(r13, r12, r0)
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.C3398a.mo12865c(int, android.content.Intent, androidx.work.impl.background.systemalarm.d):void");
    }

    public final void onExecuted(String str, boolean z) {
        synchronized (this.f7931d) {
            C8119a aVar = (C8119a) this.f7930c.remove(str);
            if (aVar != null) {
                aVar.onExecuted(str, z);
            }
        }
    }
}
