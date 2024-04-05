package p604kj;

import android.os.IBinder;

/* renamed from: kj.i */
public final /* synthetic */ class C18104i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f39529b;

    /* renamed from: c */
    public final /* synthetic */ Object f39530c;

    /* renamed from: d */
    public final /* synthetic */ Object f39531d;

    public /* synthetic */ C18104i(int i, Object obj, Object obj2) {
        this.f39529b = i;
        this.f39531d = obj;
        this.f39530c = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        r0.mo69639a(0, r2.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ef, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:33:0x00c5, B:36:0x00ca] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.f39529b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x0097;
                case 2: goto L_0x0053;
                case 3: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x00f0
        L_0x0009:
            java.lang.Object r0 = r6.f39531d
            com.google.android.gms.measurement.internal.zzjn r0 = (com.google.android.gms.measurement.internal.zzjn) r0
            monitor-enter(r0)
            java.lang.Object r2 = r6.f39531d     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.zzjn r2 = (com.google.android.gms.measurement.internal.zzjn) r2     // Catch:{ all -> 0x0050 }
            r2.zzb = false     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r6.f39531d     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.zzjn r1 = (com.google.android.gms.measurement.internal.zzjn) r1     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.i6 r1 = r1.zza     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.mo52127m()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x004e
            java.lang.Object r1 = r6.f39531d     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.zzjn r1 = (com.google.android.gms.measurement.internal.zzjn) r1     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.i6 r1 = r1.zza     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "Connected to service"
            r1.mo52237a(r2)     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r6.f39531d     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.zzjn r1 = (com.google.android.gms.measurement.internal.zzjn) r1     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.i6 r1 = r1.zza     // Catch:{ all -> 0x0050 }
            java.lang.Object r2 = r6.f39530c     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.zzeb r2 = (com.google.android.gms.measurement.internal.zzeb) r2     // Catch:{ all -> 0x0050 }
            r1.mo51995g()     // Catch:{ all -> 0x0050 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0050 }
            r1.f33574e = r2     // Catch:{ all -> 0x0050 }
            r1.mo52132r()     // Catch:{ all -> 0x0050 }
            r1.mo52131q()     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x0050:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r1
        L_0x0053:
            java.lang.Object r0 = r6.f39530c
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            monitor-enter(r0)
            java.lang.Object r1 = r6.f39530c     // Catch:{ all -> 0x008b }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x008b }
            java.lang.Object r2 = r6.f39531d     // Catch:{ all -> 0x008b }
            r3 = r2
            com.google.android.gms.measurement.internal.j5 r3 = (com.google.android.gms.measurement.internal.C15007j5) r3     // Catch:{ all -> 0x008b }
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b     // Catch:{ all -> 0x008b }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x008b }
            com.google.android.gms.measurement.internal.d r3 = r3.f33878h     // Catch:{ all -> 0x008b }
            com.google.android.gms.measurement.internal.j5 r2 = (com.google.android.gms.measurement.internal.C15007j5) r2     // Catch:{ all -> 0x008b }
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b     // Catch:{ all -> 0x008b }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x008b }
            com.google.android.gms.measurement.internal.g2 r2 = r2.mo52327n()     // Catch:{ all -> 0x008b }
            java.lang.String r2 = r2.mo52046l()     // Catch:{ all -> 0x008b }
            com.google.android.gms.measurement.internal.d2<java.lang.Double> r4 = com.google.android.gms.measurement.internal.C14959e2.f33381O     // Catch:{ all -> 0x008b }
            double r2 = r3.mo51966i(r2, r4)     // Catch:{ all -> 0x008b }
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x008b }
            r1.set(r2)     // Catch:{ all -> 0x008b }
            java.lang.Object r1 = r6.f39530c     // Catch:{ all -> 0x0094 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0094 }
            r1.notify()     // Catch:{ all -> 0x0094 }
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            return
        L_0x008b:
            r1 = move-exception
            java.lang.Object r2 = r6.f39530c     // Catch:{ all -> 0x0094 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ all -> 0x0094 }
            r2.notify()     // Catch:{ all -> 0x0094 }
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            throw r1
        L_0x0097:
            java.lang.Object r0 = r6.f39531d
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            com.google.android.gms.measurement.internal.u3 r0 = r0.zza
            com.google.android.gms.measurement.internal.i6 r0 = r0.mo52333u()
            java.lang.Object r3 = r6.f39530c
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            r0.mo51995g()
            r0.mo51946h()
            com.google.android.gms.measurement.internal.zzp r1 = r0.mo52130p(r1)
            com.google.android.gms.measurement.internal.d3 r4 = new com.google.android.gms.measurement.internal.d3
            r4.<init>(r0, r2, r1, r3)
            r0.mo52133s(r4)
            return
        L_0x00b8:
            java.lang.Object r0 = r6.f39530c
            kj.k r0 = (p604kj.C18106k) r0
            java.lang.Object r2 = r6.f39531d
            android.os.IBinder r2 = (android.os.IBinder) r2
            monitor-enter(r0)
            if (r2 != 0) goto L_0x00ca
            java.lang.String r2 = "Null service connection"
            r0.mo69639a(r1, r2)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x00ed
        L_0x00ca:
            kj.l r3 = new kj.l     // Catch:{ RemoteException -> 0x00e4 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x00e4 }
            r0.f39537d = r3     // Catch:{ RemoteException -> 0x00e4 }
            r2 = 2
            r0.f39535b = r2     // Catch:{ all -> 0x00e2 }
            kj.p r2 = r0.f39540g     // Catch:{ all -> 0x00e2 }
            java.util.concurrent.ScheduledExecutorService r2 = r2.f39549b     // Catch:{ all -> 0x00e2 }
            kj.g r3 = new kj.g     // Catch:{ all -> 0x00e2 }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x00e2 }
            r2.execute(r3)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x00ed
        L_0x00e2:
            r1 = move-exception
            goto L_0x00ee
        L_0x00e4:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00e2 }
            r0.mo69639a(r1, r2)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
        L_0x00ed:
            return
        L_0x00ee:
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            throw r1
        L_0x00f0:
            java.lang.Object r0 = r6.f39531d
            com.google.android.gms.measurement.internal.f7 r0 = (com.google.android.gms.measurement.internal.C14973f7) r0
            com.google.android.gms.measurement.internal.s3 r1 = r0.mo52015a()
            r1.mo51995g()
            com.google.android.gms.measurement.internal.e3 r1 = new com.google.android.gms.measurement.internal.e3
            r1.<init>(r0)
            r0.f33496l = r1
            com.google.android.gms.measurement.internal.h r1 = new com.google.android.gms.measurement.internal.h
            r1.<init>(r0)
            r1.mo51943i()
            r0.f33488d = r1
            com.google.android.gms.measurement.internal.d r1 = r0.mo52008K()
            com.google.android.gms.measurement.internal.n3 r3 = r0.f33486b
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.measurement.internal.c r3 = (com.google.android.gms.measurement.internal.C14938c) r3
            r1.f33334d = r3
            com.google.android.gms.measurement.internal.j6 r1 = new com.google.android.gms.measurement.internal.j6
            r1.<init>(r0)
            r1.mo51943i()
            r0.f33494j = r1
            com.google.android.gms.measurement.internal.s7 r1 = new com.google.android.gms.measurement.internal.s7
            r1.<init>(r0)
            r1.mo51943i()
            r0.f33491g = r1
            com.google.android.gms.measurement.internal.o5 r1 = new com.google.android.gms.measurement.internal.o5
            r1.<init>(r0)
            r1.mo51943i()
            r0.f33493i = r1
            com.google.android.gms.measurement.internal.y6 r1 = new com.google.android.gms.measurement.internal.y6
            r1.<init>(r0)
            r1.mo51943i()
            r0.f33490f = r1
            com.google.android.gms.measurement.internal.v2 r1 = new com.google.android.gms.measurement.internal.v2
            r1.<init>(r0)
            r0.f33489e = r1
            int r1 = r0.f33502r
            int r3 = r0.f33503s
            if (r1 == r3) goto L_0x0166
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g
            int r3 = r0.f33502r
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.f33503s
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Not all upload components initialized"
            r1.mo52239c(r3, r5, r4)
        L_0x0166:
            r0.f33498n = r2
            java.lang.Object r0 = r6.f39531d
            com.google.android.gms.measurement.internal.f7 r0 = (com.google.android.gms.measurement.internal.C14973f7) r0
            com.google.android.gms.measurement.internal.s3 r1 = r0.mo52015a()
            r1.mo51995g()
            com.google.android.gms.measurement.internal.h r1 = r0.f33488d
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r1)
            r1.mo52069k()
            com.google.android.gms.measurement.internal.j6 r1 = r0.f33494j
            com.google.android.gms.measurement.internal.y2 r1 = r1.f33617j
            long r1 = r1.mo52363a()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0198
            com.google.android.gms.measurement.internal.j6 r1 = r0.f33494j
            com.google.android.gms.measurement.internal.y2 r1 = r1.f33617j
            com.google.android.gms.common.util.Clock r2 = r0.mo52017c()
            long r2 = r2.currentTimeMillis()
            r1.mo52364b(r2)
        L_0x0198:
            r0.mo52002D()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p604kj.C18104i.run():void");
    }

    public /* synthetic */ C18104i(C18106k kVar, IBinder iBinder) {
        this.f39529b = 0;
        this.f39530c = kVar;
        this.f39531d = iBinder;
    }
}
