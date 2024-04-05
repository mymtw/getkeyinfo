package p596jk;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzi;
import com.google.android.gms.measurement.internal.C14990h6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p719yj.C18891a;

@ShowFirstParty
@KeepForSdk
/* renamed from: jk.a */
public final class C18005a {

    /* renamed from: n */
    public static final long f39389n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o */
    public static volatile ScheduledExecutorService f39390o = null;

    /* renamed from: p */
    public static final Object f39391p = new Object();

    /* renamed from: a */
    public final Object f39392a = new Object();

    /* renamed from: b */
    public final PowerManager.WakeLock f39393b;

    /* renamed from: c */
    public int f39394c = 0;

    /* renamed from: d */
    public ScheduledFuture f39395d;

    /* renamed from: e */
    public long f39396e;

    /* renamed from: f */
    public final HashSet f39397f = new HashSet();

    /* renamed from: g */
    public boolean f39398g = true;

    /* renamed from: h */
    public C18891a f39399h;

    /* renamed from: i */
    public Clock f39400i = DefaultClock.getInstance();

    /* renamed from: j */
    public final String f39401j;

    /* renamed from: k */
    public final HashMap f39402k = new HashMap();

    /* renamed from: l */
    public AtomicInteger f39403l = new AtomicInteger(0);

    /* renamed from: m */
    public final ScheduledExecutorService f39404m;

    @KeepForSdk
    public C18005a(Context context) {
        String packageName = context.getPackageName();
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f39399h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.f39401j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        } else {
            this.f39401j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            this.f39393b = newWakeLock;
            if (WorkSourceUtil.hasWorkSourcePermission(context)) {
                WorkSource fromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
                if (fromPackage != null) {
                    try {
                        newWakeLock.setWorkSource(fromPackage);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f39390o;
            if (scheduledExecutorService == null) {
                synchronized (f39391p) {
                    scheduledExecutorService = f39390o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f39390o = scheduledExecutorService;
                    }
                }
            }
            this.f39404m = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    @KeepForSdk
    /* renamed from: a */
    public final void mo69576a(long j) {
        this.f39403l.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f39389n), 1);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f39392a) {
            try {
                if (!mo69577b()) {
                    this.f39399h = C18891a.f42072b;
                    this.f39393b.acquire();
                    this.f39400i.elapsedRealtime();
                }
                this.f39394c++;
                if (this.f39398g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                C18006b bVar = (C18006b) this.f39402k.get((Object) null);
                if (bVar == null) {
                    bVar = new C18006b(0);
                    this.f39402k.put((Object) null, bVar);
                }
                bVar.f39405a++;
                long elapsedRealtime = this.f39400i.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j2 = elapsedRealtime + max;
                }
                if (j2 > this.f39396e) {
                    this.f39396e = j2;
                    ScheduledFuture scheduledFuture = this.f39395d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f39395d = this.f39404m.schedule(new C14990h6(this, 1), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public final boolean mo69577b() {
        boolean z;
        synchronized (this.f39392a) {
            z = this.f39394c > 0;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: c */
    public final void mo69578c() {
        if (this.f39403l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f39401j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f39392a) {
            try {
                if (this.f39398g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                if (this.f39402k.containsKey((Object) null)) {
                    C18006b bVar = (C18006b) this.f39402k.get((Object) null);
                    if (bVar != null) {
                        int i = bVar.f39405a - 1;
                        bVar.f39405a = i;
                        if (i == 0) {
                            this.f39402k.remove((Object) null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f39401j).concat(" counter does not exist"));
                }
                mo69580e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void mo69579d() {
        if (!this.f39397f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f39397f);
            this.f39397f.clear();
            if (arrayList.size() > 0) {
                C18007c cVar = (C18007c) arrayList.get(0);
                throw null;
            }
        }
    }

    /* renamed from: e */
    public final void mo69580e() {
        synchronized (this.f39392a) {
            if (mo69577b()) {
                if (this.f39398g) {
                    int i = this.f39394c - 1;
                    this.f39394c = i;
                    if (i > 0) {
                        return;
                    }
                } else {
                    this.f39394c = 0;
                }
                mo69579d();
                for (C18006b bVar : this.f39402k.values()) {
                    bVar.f39405a = 0;
                }
                this.f39402k.clear();
                ScheduledFuture scheduledFuture = this.f39395d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f39395d = null;
                    this.f39396e = 0;
                }
                if (this.f39393b.isHeld()) {
                    try {
                        this.f39393b.release();
                        if (this.f39399h != null) {
                            this.f39399h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f39401j).concat(" failed to release!"), e);
                            if (this.f39399h != null) {
                                this.f39399h = null;
                            }
                            return;
                        }
                        throw e;
                    } catch (Throwable th) {
                        if (this.f39399h != null) {
                            this.f39399h = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f39401j).concat(" should be held!"));
                }
            }
        }
    }
}
