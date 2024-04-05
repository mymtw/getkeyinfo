package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import p604kj.C18105j;

@VisibleForTesting
public final class zzjn implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ C14999i6 zza;
    /* access modifiers changed from: private */
    public volatile boolean zzb;
    private volatile C15013k2 zzc;

    public zzjn(C14999i6 i6Var) {
        this.zza = i6Var;
    }

    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                ((C15103u3) this.zza.f33681b).mo52015a().mo52308o(new C14981g6(this, (zzeb) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        C15049o2 o2Var = ((C15103u3) this.zza.f33681b).f33880j;
        if (o2Var == null || !o2Var.f33708c) {
            o2Var = null;
        }
        if (o2Var != null) {
            o2Var.f33727j.mo52238b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        ((C15103u3) this.zza.f33681b).mo52015a().mo52308o(new C15096t4(this, 1));
    }

    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        ((C15103u3) this.zza.f33681b).mo52016b().f33731n.mo52237a("Service connection suspended");
        ((C15103u3) this.zza.f33681b).mo52015a().mo52308o(new C14990h6(this, 0));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        ((com.google.android.gms.measurement.internal.C15103u3) r3.zza.f33681b).mo52016b().f33724g.mo52237a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0066 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x0021
            r3.zzb = r4     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.i6 r4 = r3.zza     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.o4 r4 = r4.f33681b     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33724g     // Catch:{ all -> 0x001e }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo52237a(r5)     // Catch:{ all -> 0x001e }
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r4 = move-exception
            goto L_0x00a2
        L_0x0021:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0066 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0066 }
            if (r2 == 0) goto L_0x0054
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0066 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.zzeb     // Catch:{ RemoteException -> 0x0066 }
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.zzeb r1 = (com.google.android.gms.measurement.internal.zzeb) r1     // Catch:{ RemoteException -> 0x0066 }
        L_0x003a:
            r0 = r1
            goto L_0x0042
        L_0x003c:
            com.google.android.gms.measurement.internal.zzdz r1 = new com.google.android.gms.measurement.internal.zzdz     // Catch:{ RemoteException -> 0x0066 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0066 }
            goto L_0x003a
        L_0x0042:
            com.google.android.gms.measurement.internal.i6 r5 = r3.zza     // Catch:{ RemoteException -> 0x0066 }
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b     // Catch:{ RemoteException -> 0x0066 }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ RemoteException -> 0x0066 }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ RemoteException -> 0x0066 }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33732o     // Catch:{ RemoteException -> 0x0066 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo52237a(r1)     // Catch:{ RemoteException -> 0x0066 }
            goto L_0x0077
        L_0x0054:
            com.google.android.gms.measurement.internal.i6 r5 = r3.zza     // Catch:{ RemoteException -> 0x0066 }
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b     // Catch:{ RemoteException -> 0x0066 }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ RemoteException -> 0x0066 }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ RemoteException -> 0x0066 }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33724g     // Catch:{ RemoteException -> 0x0066 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo52238b(r1, r2)     // Catch:{ RemoteException -> 0x0066 }
            goto L_0x0077
        L_0x0066:
            com.google.android.gms.measurement.internal.i6 r5 = r3.zza     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33724g     // Catch:{ all -> 0x001e }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo52237a(r1)     // Catch:{ all -> 0x001e }
        L_0x0077:
            if (r0 != 0) goto L_0x008d
            r3.zzb = r4     // Catch:{ all -> 0x001e }
            com.google.android.gms.common.stats.ConnectionTracker r4 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.i6 r5 = r3.zza     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.o4 r0 = r5.f33681b     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r0 = r0.f33872b     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.zzjn r5 = r5.f33573d     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.unbindService(r0, r5)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x008d:
            com.google.android.gms.measurement.internal.i6 r4 = r3.zza     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.o4 r4 = r4.f33681b     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ all -> 0x001e }
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo52015a()     // Catch:{ all -> 0x001e }
            kj.i r5 = new kj.i     // Catch:{ all -> 0x001e }
            r1 = 3
            r5.<init>(r1, r3, r0)     // Catch:{ all -> 0x001e }
            r4.mo52308o(r5)     // Catch:{ all -> 0x001e }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjn.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        ((C15103u3) this.zza.f33681b).mo52016b().f33731n.mo52237a("Service disconnected");
        ((C15103u3) this.zza.f33681b).mo52015a().mo52308o(new C18105j((Object) this, (Object) componentName, 4));
    }

    public final void zzb(Intent intent) {
        this.zza.mo51995g();
        Context context = ((C15103u3) this.zza.f33681b).f33872b;
        ConnectionTracker instance = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.zzb) {
                    ((C15103u3) this.zza.f33681b).mo52016b().f33732o.mo52237a("Connection attempt already in progress");
                    return;
                }
                ((C15103u3) this.zza.f33681b).mo52016b().f33732o.mo52237a("Using local app measurement service");
                this.zzb = true;
                instance.bindService(context, intent, this.zza.f33573d, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        this.zza.mo51995g();
        Context context = ((C15103u3) this.zza.f33681b).f33872b;
        synchronized (this) {
            try {
                if (this.zzb) {
                    ((C15103u3) this.zza.f33681b).mo52016b().f33732o.mo52237a("Connection attempt already in progress");
                } else if (this.zzc == null || (!this.zzc.isConnecting() && !this.zzc.isConnected())) {
                    this.zzc = new C15013k2(context, Looper.getMainLooper(), this, this);
                    ((C15103u3) this.zza.f33681b).mo52016b().f33732o.mo52237a("Connecting to remote service");
                    this.zzb = true;
                    Preconditions.checkNotNull(this.zzc);
                    this.zzc.checkAvailabilityAndConnect();
                } else {
                    ((C15103u3) this.zza.f33681b).mo52016b().f33732o.mo52237a("Already awaiting connection attempt");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }
}
