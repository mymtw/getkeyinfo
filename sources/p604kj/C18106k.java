package p604kj;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: kj.k */
public final class C18106k implements ServiceConnection {

    /* renamed from: b */
    public int f39535b = 0;

    /* renamed from: c */
    public final Messenger f39536c = new Messenger(new zzf(Looper.getMainLooper(), new com.google.android.gms.cloudmessaging.zzf(this)));

    /* renamed from: d */
    public C18107l f39537d;

    /* renamed from: e */
    public final ArrayDeque f39538e = new ArrayDeque();

    /* renamed from: f */
    public final SparseArray<C18109n<?>> f39539f = new SparseArray<>();

    /* renamed from: g */
    public final /* synthetic */ C18111p f39540g;

    public /* synthetic */ C18106k(C18111p pVar) {
        this.f39540g = pVar;
    }

    /* renamed from: a */
    public final synchronized void mo69639a(int i, String str) {
        mo69640b(i, str, (SecurityException) null);
    }

    /* renamed from: b */
    public final synchronized void mo69640b(int i, String str, SecurityException securityException) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.f39535b;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f39535b = 4;
            ConnectionTracker.getInstance().unbindService(this.f39540g.f39548a, this);
            zzq zzq = new zzq(i, str, securityException);
            Iterator it = this.f39538e.iterator();
            while (it.hasNext()) {
                ((C18109n) it.next()).mo69647c(zzq);
            }
            this.f39538e.clear();
            for (int i3 = 0; i3 < this.f39539f.size(); i3++) {
                this.f39539f.valueAt(i3).mo69647c(zzq);
            }
            this.f39539f.clear();
        } else if (i2 == 3) {
            this.f39535b = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo69641c() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f39535b     // Catch:{ all -> 0x002d }
            r1 = 2
            if (r0 != r1) goto L_0x002b
            java.util.ArrayDeque r0 = r2.f39538e     // Catch:{ all -> 0x002d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            android.util.SparseArray<kj.n<?>> r0 = r2.f39539f     // Catch:{ all -> 0x002d }
            int r0 = r0.size()     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "MessengerIpcClient"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x002d }
            r0 = 3
            r2.f39535b = r0     // Catch:{ all -> 0x002d }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ all -> 0x002d }
            kj.p r1 = r2.f39540g     // Catch:{ all -> 0x002d }
            android.content.Context r1 = r1.f39548a     // Catch:{ all -> 0x002d }
            r0.unbindService(r1, r2)     // Catch:{ all -> 0x002d }
            monitor-exit(r2)
            return
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p604kj.C18106k.mo69641c():void");
    }

    /* renamed from: d */
    public final synchronized boolean mo69642d(C18109n<?> nVar) {
        int i = this.f39535b;
        if (i == 0) {
            this.f39538e.add(nVar);
            Preconditions.checkState(this.f39535b == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.f39535b = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!ConnectionTracker.getInstance().bindService(this.f39540g.f39548a, intent, this, 1)) {
                    mo69639a(0, "Unable to bind to service");
                } else {
                    this.f39540g.f39549b.schedule(new C18103h(this, 0), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e) {
                mo69640b(0, "Unable to bind to service", e);
            }
        } else if (i == 1) {
            this.f39538e.add(nVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f39538e.add(nVar);
            this.f39540g.f39549b.execute(new C18102g(this, 0));
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f39540g.f39549b.execute(new C18104i(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f39540g.f39549b.execute(new C18101f(this));
    }
}
