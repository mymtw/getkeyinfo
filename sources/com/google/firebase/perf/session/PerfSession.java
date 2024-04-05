package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.p530v1.C16672h;
import com.google.firebase.perf.p530v1.SessionVerbosity;
import com.google.firebase.perf.util.C16625a;
import com.google.firebase.perf.util.Timer;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.apache.commons.cli.HelpFormatter;

public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new C16617a();
    private final Timer creationTime;
    private boolean isGaugeAndEventCollectionEnabled;
    private final String sessionId;

    /* renamed from: com.google.firebase.perf.session.PerfSession$a */
    public class C16617a implements Parcelable.Creator<PerfSession> {
        public final Object createFromParcel(Parcel parcel) {
            return new PerfSession(parcel, (C16617a) null);
        }

        public final Object[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    public /* synthetic */ PerfSession(Parcel parcel, C16617a aVar) {
        this(parcel);
    }

    public static C16672h[] buildAndSort(List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        C16672h[] hVarArr = new C16672h[list.size()];
        C16672h build = list.get(0).build();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            C16672h build2 = list.get(i).build();
            if (z || !list.get(i).isVerbose()) {
                hVarArr[i] = build2;
            } else {
                hVarArr[0] = build2;
                hVarArr[i] = build;
                z = true;
            }
        }
        if (!z) {
            hVarArr[0] = build;
        }
        return hVarArr;
    }

    public static PerfSession create() {
        PerfSession perfSession = new PerfSession(UUID.randomUUID().toString().replace(HelpFormatter.DEFAULT_OPT_PREFIX, ""), new C16625a());
        perfSession.setGaugeAndEventCollectionEnabled(shouldCollectGaugesAndEvents());
        return perfSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (com.google.firebase.perf.config.C16594a.m27427p(r1) != false) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean shouldCollectGaugesAndEvents() {
        /*
            com.google.firebase.perf.config.a r0 = com.google.firebase.perf.config.C16594a.m27423e()
            boolean r1 = r0.mo59258o()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00f8
            double r4 = java.lang.Math.random()
            java.lang.Class<com.google.firebase.perf.config.o> r1 = com.google.firebase.perf.config.C16608o.class
            monitor-enter(r1)
            com.google.firebase.perf.config.o r6 = com.google.firebase.perf.config.C16608o.f36845e     // Catch:{ all -> 0x00f5 }
            if (r6 != 0) goto L_0x001e
            com.google.firebase.perf.config.o r6 = new com.google.firebase.perf.config.o     // Catch:{ all -> 0x00f5 }
            r6.<init>()     // Catch:{ all -> 0x00f5 }
            com.google.firebase.perf.config.C16608o.f36845e = r6     // Catch:{ all -> 0x00f5 }
        L_0x001e:
            com.google.firebase.perf.config.o r6 = com.google.firebase.perf.config.C16608o.f36845e     // Catch:{ all -> 0x00f5 }
            monitor-exit(r1)
            com.google.firebase.perf.util.b r1 = r0.f36830b
            r6.getClass()
            java.lang.String r7 = "sessions_sampling_percentage"
            android.os.Bundle r8 = r1.f36856a
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x0032
            r8 = r3
            goto L_0x0033
        L_0x0032:
            r8 = r2
        L_0x0033:
            if (r8 != 0) goto L_0x003b
            com.google.firebase.perf.util.c r1 = new com.google.firebase.perf.util.c
            r1.<init>()
            goto L_0x006a
        L_0x003b:
            android.os.Bundle r1 = r1.f36856a     // Catch:{ ClassCastException -> 0x0052 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ ClassCastException -> 0x0052 }
            java.lang.Float r1 = (java.lang.Float) r1     // Catch:{ ClassCastException -> 0x0052 }
            if (r1 != 0) goto L_0x004b
            com.google.firebase.perf.util.c r1 = new com.google.firebase.perf.util.c     // Catch:{ ClassCastException -> 0x0052 }
            r1.<init>()     // Catch:{ ClassCastException -> 0x0052 }
            goto L_0x006a
        L_0x004b:
            com.google.firebase.perf.util.c r8 = new com.google.firebase.perf.util.c     // Catch:{ ClassCastException -> 0x0052 }
            r8.<init>(r1)     // Catch:{ ClassCastException -> 0x0052 }
            r1 = r8
            goto L_0x006a
        L_0x0052:
            r1 = move-exception
            fn.a r8 = com.google.firebase.perf.util.C16626b.f36855b
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r2] = r7
            java.lang.String r1 = r1.getMessage()
            r9[r3] = r1
            java.lang.String r1 = "Metadata key %s contains type other than float: %s"
            r8.mo69015b(r1, r9)
            com.google.firebase.perf.util.c r1 = new com.google.firebase.perf.util.c
            r1.<init>()
        L_0x006a:
            boolean r7 = r1.mo59369b()
            if (r7 == 0) goto L_0x0084
            java.lang.Object r1 = r1.mo59368a()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r7 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r7
            boolean r7 = com.google.firebase.perf.config.C16594a.m27427p(r1)
            if (r7 == 0) goto L_0x0084
            goto L_0x00ee
        L_0x0084:
            com.google.firebase.perf.config.RemoteConfigManager r1 = r0.f36829a
            java.lang.String r7 = "fpr_vc_session_sampling_rate"
            com.google.firebase.perf.util.c r1 = r1.getFloat(r7)
            boolean r7 = r1.mo59369b()
            if (r7 == 0) goto L_0x00be
            java.lang.Object r7 = r1.mo59368a()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            boolean r7 = com.google.firebase.perf.config.C16594a.m27427p(r7)
            if (r7 == 0) goto L_0x00be
            com.google.firebase.perf.config.s r0 = r0.f36831c
            java.lang.String r6 = "com.google.firebase.perf.SessionSamplingRate"
            java.lang.Object r7 = r1.mo59368a()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r0.mo59262d(r6, r7)
            java.lang.Object r0 = r1.mo59368a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r1 = r0.floatValue()
            goto L_0x00ee
        L_0x00be:
            com.google.firebase.perf.util.c r0 = r0.mo59249b(r6)
            boolean r1 = r0.mo59369b()
            if (r1 == 0) goto L_0x00e3
            java.lang.Object r1 = r0.mo59368a()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            boolean r1 = com.google.firebase.perf.config.C16594a.m27427p(r1)
            if (r1 == 0) goto L_0x00e3
            java.lang.Object r0 = r0.mo59368a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r1 = r0.floatValue()
            goto L_0x00ee
        L_0x00e3:
            r0 = 1008981770(0x3c23d70a, float:0.01)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r1 = r0.floatValue()
        L_0x00ee:
            double r0 = (double) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f8
            r2 = r3
            goto L_0x00f8
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00f8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.PerfSession.shouldCollectGaugesAndEvents():boolean");
    }

    public C16672h build() {
        C16672h.C16675c E = C16672h.m27620E();
        String str = this.sessionId;
        E.mo59761u();
        C16672h.m27622z((C16672h) E.f37158c, str);
        if (this.isGaugeAndEventCollectionEnabled) {
            SessionVerbosity sessionVerbosity = SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
            E.mo59761u();
            C16672h.m27619A((C16672h) E.f37158c, sessionVerbosity);
        }
        return (C16672h) E.mo59759s();
    }

    public int describeContents() {
        return 0;
    }

    public Timer getTimer() {
        return this.creationTime;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isExpired() {
        /*
            r12 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            com.google.firebase.perf.util.Timer r1 = r12.creationTime
            long r1 = r1.getDurationMicros()
            long r0 = r0.toMinutes(r1)
            com.google.firebase.perf.config.a r2 = com.google.firebase.perf.config.C16594a.m27423e()
            r2.getClass()
            java.lang.Class<com.google.firebase.perf.config.l> r3 = com.google.firebase.perf.config.C16605l.class
            monitor-enter(r3)
            com.google.firebase.perf.config.l r4 = com.google.firebase.perf.config.C16605l.f36842e     // Catch:{ all -> 0x00c3 }
            if (r4 != 0) goto L_0x0021
            com.google.firebase.perf.config.l r4 = new com.google.firebase.perf.config.l     // Catch:{ all -> 0x00c3 }
            r4.<init>()     // Catch:{ all -> 0x00c3 }
            com.google.firebase.perf.config.C16605l.f36842e = r4     // Catch:{ all -> 0x00c3 }
        L_0x0021:
            com.google.firebase.perf.config.l r4 = com.google.firebase.perf.config.C16605l.f36842e     // Catch:{ all -> 0x00c3 }
            monitor-exit(r3)
            com.google.firebase.perf.util.c r3 = r2.mo59255i(r4)
            boolean r5 = r3.mo59369b()
            r6 = 0
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r3.mo59368a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r10 = r5.longValue()
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0042
            r5 = r8
            goto L_0x0043
        L_0x0042:
            r5 = r9
        L_0x0043:
            if (r5 == 0) goto L_0x0051
            java.lang.Object r2 = r3.mo59368a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L_0x00bc
        L_0x0051:
            com.google.firebase.perf.util.c r3 = r2.mo59257k(r4)
            boolean r5 = r3.mo59369b()
            if (r5 == 0) goto L_0x008a
            java.lang.Object r5 = r3.mo59368a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r10 = r5.longValue()
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x006b
            r5 = r8
            goto L_0x006c
        L_0x006b:
            r5 = r9
        L_0x006c:
            if (r5 == 0) goto L_0x008a
            com.google.firebase.perf.config.s r2 = r2.f36831c
            java.lang.String r4 = "com.google.firebase.perf.SessionsMaxDurationMinutes"
            java.lang.Object r5 = r3.mo59368a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r2.mo59261c(r5, r4)
            java.lang.Object r2 = r3.mo59368a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L_0x00bc
        L_0x008a:
            com.google.firebase.perf.util.c r2 = r2.mo59250c(r4)
            boolean r3 = r2.mo59369b()
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r2.mo59368a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a4
            r3 = r8
            goto L_0x00a5
        L_0x00a4:
            r3 = r9
        L_0x00a5:
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r2 = r2.mo59368a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L_0x00bc
        L_0x00b2:
            r2 = 240(0xf0, double:1.186E-321)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r2 = r2.longValue()
        L_0x00bc:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r8 = r9
        L_0x00c2:
            return r8
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.PerfSession.isExpired():boolean");
    }

    public boolean isGaugeAndEventCollectionEnabled() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    public boolean isVerbose() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    public String sessionId() {
        return this.sessionId;
    }

    public void setGaugeAndEventCollectionEnabled(boolean z) {
        this.isGaugeAndEventCollectionEnabled = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sessionId);
        parcel.writeByte(this.isGaugeAndEventCollectionEnabled ? (byte) 1 : 0);
        parcel.writeParcelable(this.creationTime, 0);
    }

    public PerfSession(String str, C16625a aVar) {
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = str;
        aVar.getClass();
        this.creationTime = new Timer();
    }

    public static boolean isVerbose(C16672h hVar) {
        Iterator it = hVar.mo59413D().iterator();
        while (it.hasNext()) {
            if (((SessionVerbosity) it.next()) == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
                return true;
            }
        }
        return false;
    }

    private PerfSession(Parcel parcel) {
        boolean z = false;
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = parcel.readString();
        this.isGaugeAndEventCollectionEnabled = parcel.readByte() != 0 ? true : z;
        this.creationTime = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
