package p575gm;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.material.badge.BadgeDrawable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p193o.C7494b;
import p193o.C7500h;
import p509an.C14037a;
import p649pm.C18405j;
import p649pm.C18411n;

/* renamed from: gm.c */
public final class C17793c {

    /* renamed from: i */
    public static final Object f38669i = new Object();

    /* renamed from: j */
    public static final C17796c f38670j = new C17796c();

    /* renamed from: k */
    public static final C7494b f38671k = new C7494b();

    /* renamed from: a */
    public final Context f38672a;

    /* renamed from: b */
    public final String f38673b;

    /* renamed from: c */
    public final C17799e f38674c;

    /* renamed from: d */
    public final C18405j f38675d;

    /* renamed from: e */
    public final AtomicBoolean f38676e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f38677f = new AtomicBoolean();

    /* renamed from: g */
    public final C18411n<C14037a> f38678g;

    /* renamed from: h */
    public final CopyOnWriteArrayList f38679h = new CopyOnWriteArrayList();

    @KeepForSdk
    /* renamed from: gm.c$a */
    public interface C17794a {
        @KeepForSdk
        /* renamed from: a */
        void mo69028a();
    }

    @TargetApi(14)
    /* renamed from: gm.c$b */
    public static class C17795b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        public static AtomicReference<C17795b> f38680a = new AtomicReference<>();

        public final void onBackgroundStateChanged(boolean z) {
            synchronized (C17793c.f38669i) {
                Iterator it = new ArrayList(C17793c.f38671k.values()).iterator();
                while (it.hasNext()) {
                    C17793c cVar = (C17793c) it.next();
                    if (cVar.f38676e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = cVar.f38679h.iterator();
                        while (it2.hasNext()) {
                            ((C17794a) it2.next()).mo69028a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: gm.c$c */
    public static class C17796c implements Executor {

        /* renamed from: b */
        public static final Handler f38681b = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            f38681b.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: gm.c$d */
    public static class C17797d extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C17797d> f38682b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f38683a;

        public C17797d(Context context) {
            this.f38683a = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (C17793c.f38669i) {
                Iterator it = ((C7500h.C7505e) C17793c.f38671k.values()).iterator();
                while (it.hasNext()) {
                    ((C17793c) it.next()).mo69023d();
                }
            }
            this.f38683a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2 A[LOOP:1: B:24:0x00bc->B:26:0x00c2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17793c(android.content.Context r8, p575gm.C17799e r9, java.lang.String r10) {
        /*
            r7 = this;
            r7.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r7.f38676e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r7.f38677f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r7.f38679h = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            android.content.Context r0 = (android.content.Context) r0
            r7.f38672a = r0
            java.lang.String r10 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r7.f38673b = r10
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            gm.e r10 = (p575gm.C17799e) r10
            r7.f38674c = r10
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r10 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "ComponentDiscovery"
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x006e }
            if (r3 != 0) goto L_0x0049
            java.lang.String r10 = "Context has no PackageManager."
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x006e }
            goto L_0x0073
        L_0x0049:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x006e }
            r4.<init>(r8, r10)     // Catch:{ NameNotFoundException -> 0x006e }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r3 = r3.getServiceInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x006e }
            if (r3 != 0) goto L_0x006b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x006e }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x006e }
            r3.append(r10)     // Catch:{ NameNotFoundException -> 0x006e }
            java.lang.String r10 = " has no service info."
            r3.append(r10)     // Catch:{ NameNotFoundException -> 0x006e }
            java.lang.String r10 = r3.toString()     // Catch:{ NameNotFoundException -> 0x006e }
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x006e }
            goto L_0x0073
        L_0x006b:
            android.os.Bundle r10 = r3.metaData     // Catch:{ NameNotFoundException -> 0x006e }
            goto L_0x0074
        L_0x006e:
            java.lang.String r10 = "Application info not found."
            android.util.Log.w(r2, r10)
        L_0x0073:
            r10 = 0
        L_0x0074:
            if (r10 != 0) goto L_0x0080
            java.lang.String r10 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r2, r10)
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00b8
        L_0x0080:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r3 = r10.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x008d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00b7
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.get(r4)
            java.lang.String r6 = "com.google.firebase.components.ComponentRegistrar"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x008d
            java.lang.String r5 = "com.google.firebase.components:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x008d
            r5 = 31
            java.lang.String r4 = r4.substring(r5)
            r2.add(r4)
            goto L_0x008d
        L_0x00b7:
            r10 = r2
        L_0x00b8:
            java.util.Iterator r10 = r10.iterator()
        L_0x00bc:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00d1
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            pm.d r3 = new pm.d
            r3.<init>(r2)
            r0.add(r3)
            goto L_0x00bc
        L_0x00d1:
            gm.c$c r10 = f38670j
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.addAll(r0)
            com.google.firebase.FirebaseCommonRegistrar r0 = new com.google.firebase.FirebaseCommonRegistrar
            r0.<init>()
            pm.i r4 = new pm.i
            r4.<init>(r0)
            r2.add(r4)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r4 = new java.lang.Class[r1]
            pm.b r0 = p649pm.C18396b.m31104b(r8, r0, r4)
            r3.add(r0)
            java.lang.Class<gm.c> r0 = p575gm.C17793c.class
            java.lang.Class[] r4 = new java.lang.Class[r1]
            pm.b r0 = p649pm.C18396b.m31104b(r7, r0, r4)
            r3.add(r0)
            java.lang.Class<gm.e> r0 = p575gm.C17799e.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            pm.b r9 = p649pm.C18396b.m31104b(r9, r0, r1)
            r3.add(r9)
            pm.j r9 = new pm.j
            r9.<init>(r10, r2, r3)
            r7.f38675d = r9
            pm.n r9 = new pm.n
            gm.b r10 = new gm.b
            r10.<init>(r7, r8)
            r9.<init>(r10)
            r7.f38678g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p575gm.C17793c.<init>(android.content.Context, gm.e, java.lang.String):void");
    }

    /* renamed from: b */
    public static C17793c m29919b() {
        C17793c cVar;
        synchronized (f38669i) {
            cVar = (C17793c) f38671k.getOrDefault("[DEFAULT]", null);
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* renamed from: e */
    public static C17793c m29920e(Context context, C17799e eVar) {
        C17793c cVar;
        boolean z;
        AtomicReference<C17795b> atomicReference = C17795b.f38680a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            if (C17795b.f38680a.get() == null) {
                C17795b bVar = new C17795b();
                AtomicReference<C17795b> atomicReference2 = C17795b.f38680a;
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, bVar)) {
                        if (atomicReference2.get() != null) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(bVar);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f38669i) {
            C7494b bVar2 = f38671k;
            Preconditions.checkState(true ^ bVar2.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            cVar = new C17793c(context, eVar, "[DEFAULT]");
            bVar2.put("[DEFAULT]", cVar);
        }
        cVar.mo69023d();
        return cVar;
    }

    /* renamed from: a */
    public final void mo69021a() {
        Preconditions.checkState(!this.f38677f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    /* renamed from: c */
    public final String mo69022c() {
        StringBuilder sb = new StringBuilder();
        mo69021a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f38673b.getBytes(Charset.defaultCharset())));
        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        mo69021a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f38674c.f38685b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo69023d() {
        HashMap hashMap;
        boolean z = true;
        if (!((UserManager) this.f38672a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            mo69021a();
            sb.append(this.f38673b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f38672a;
            if (C17797d.f38682b.get() == null) {
                C17797d dVar = new C17797d(context);
                AtomicReference<C17797d> atomicReference = C17797d.f38682b;
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, dVar)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        mo69021a();
        sb2.append(this.f38673b);
        Log.i("FirebaseApp", sb2.toString());
        C18405j jVar = this.f38675d;
        mo69021a();
        boolean equals = "[DEFAULT]".equals(this.f38673b);
        AtomicReference<Boolean> atomicReference2 = jVar.f40481g;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            synchronized (jVar) {
                hashMap = new HashMap(jVar.f40477c);
            }
            jVar.mo69939u0(hashMap, equals);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17793c)) {
            return false;
        }
        String str = this.f38673b;
        C17793c cVar = (C17793c) obj;
        cVar.mo69021a();
        return str.equals(cVar.f38673b);
    }

    @KeepForSdk
    /* renamed from: f */
    public final boolean mo69025f() {
        boolean z;
        mo69021a();
        C14037a aVar = this.f38678g.get();
        synchronized (aVar) {
            z = aVar.f30896b;
        }
        return z;
    }

    public final int hashCode() {
        return this.f38673b.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f38673b).add(ResponseConstants.OPTIONS, this.f38674c).toString();
    }
}
