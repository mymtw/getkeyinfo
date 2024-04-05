package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.appcompat.app.C0164l;
import androidx.compose.runtime.C1339j1;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1313c;
import com.google.android.datatransport.C6518e;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.measurement.internal.C15128x4;
import com.google.android.gms.measurement.internal.C15136y4;
import com.google.android.play.core.assetpacks.C15664v1;
import com.google.android.play.core.assetpacks.C15673x2;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.C16563d;
import com.google.firebase.messaging.C16584a;
import com.google.firebase.platforminfo.C16687f;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p268v8.C8220b;
import p517bn.C14103a0;
import p517bn.C14107c0;
import p517bn.C14109d0;
import p517bn.C14118i;
import p517bn.C14119j;
import p517bn.C14120k;
import p517bn.C14121l;
import p517bn.C14122m;
import p517bn.C14123n;
import p517bn.C14124o;
import p517bn.C14125p;
import p517bn.C14128s;
import p517bn.C14129t;
import p517bn.C14131v;
import p517bn.C14132w;
import p517bn.C14135z;
import p575gm.C17793c;
import p604kj.C18105j;
import p605kk.C18117a0;
import p605kk.C18123g;
import p605kk.C18124h;
import p605kk.C18126j;
import p706wm.C18752d;
import p714xm.C18819a;
import p722ym.C18895a;

public class FirebaseMessaging {
    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static C16584a store;
    public static ScheduledExecutorService syncExecutor;
    @SuppressLint({"FirebaseUnknownNullness"})
    public static C6518e transportFactory;
    private final C16582a autoInit;
    private final Context context;
    private final Executor fileIoExecutor;
    /* access modifiers changed from: private */
    public final C17793c firebaseApp;
    private final C16563d fis;
    private final C14125p gmsRpc;
    private final C18819a iid;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final C14129t metadata;
    private final C14132w requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Executor taskExecutor;
    private final C18123g<C14109d0> topicsSubscriberTask;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    public class C16582a {

        /* renamed from: a */
        public final C18752d f36789a;

        /* renamed from: b */
        public boolean f36790b;

        /* renamed from: c */
        public C14123n f36791c;

        /* renamed from: d */
        public Boolean f36792d;

        public C16582a(C18752d dVar) {
            this.f36789a = dVar;
        }

        /* renamed from: a */
        public final synchronized void mo59179a() {
            if (!this.f36790b) {
                Boolean b = mo59180b();
                this.f36792d = b;
                if (b == null) {
                    C14123n nVar = new C14123n(this);
                    this.f36791c = nVar;
                    this.f36789a.mo69949b(nVar);
                }
                this.f36790b = true;
            }
        }

        /* renamed from: b */
        public final Boolean mo59180b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            C17793c r1 = FirebaseMessaging.this.firebaseApp;
            r1.mo69021a();
            Context context = r1.f38672a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FirebaseMessaging(C17793c cVar, C18819a aVar, C18895a<C16687f> aVar2, C18895a<HeartBeatInfo> aVar3, C16563d dVar, C6518e eVar, C18752d dVar2) {
        this(cVar, aVar, aVar2, aVar3, dVar, eVar, dVar2, new C14129t(cVar.f38672a));
        cVar.mo69021a();
    }

    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(C17793c.m29919b());
        }
        return instance;
    }

    private static synchronized C16584a getStore(Context context2) {
        C16584a aVar;
        synchronized (FirebaseMessaging.class) {
            if (store == null) {
                store = new C16584a(context2);
            }
            aVar = store;
        }
        return aVar;
    }

    private String getSubtype() {
        C17793c cVar = this.firebaseApp;
        cVar.mo69021a();
        return "[DEFAULT]".equals(cVar.f38673b) ? "" : this.firebaseApp.mo69022c();
    }

    public static C6518e getTransportFactory() {
        return transportFactory;
    }

    /* access modifiers changed from: private */
    public void invokeOnTokenRefresh(String str) {
        C17793c cVar = this.firebaseApp;
        cVar.mo69021a();
        if ("[DEFAULT]".equals(cVar.f38673b)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                C17793c cVar2 = this.firebaseApp;
                cVar2.mo69021a();
                String valueOf = String.valueOf(cVar2.f38673b);
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, str);
            new C14118i(this.context).mo46995b(intent);
        }
    }

    public static C18123g lambda$subscribeToTopic$6(String str, C14109d0 d0Var) throws Exception {
        d0Var.getClass();
        C18117a0 e = d0Var.mo46984e(new C14103a0("S", str));
        d0Var.mo46985f();
        return e;
    }

    public static C18123g lambda$unsubscribeFromTopic$7(String str, C14109d0 d0Var) throws Exception {
        d0Var.getClass();
        C18117a0 e = d0Var.mo46984e(new C14103a0("U", str));
        d0Var.mo46985f();
        return e;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0);
        }
    }

    /* access modifiers changed from: private */
    public void startSyncIfNecessary() {
        C18819a aVar = this.iid;
        if (aVar != null) {
            aVar.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() throws IOException {
        C18123g gVar;
        C18819a aVar = this.iid;
        if (aVar != null) {
            try {
                return (String) C18126j.m30613a(aVar.mo70262c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            C16584a.C16585a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
            if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
                return tokenWithoutTriggeringSync.f36796a;
            }
            String a = C14129t.m21863a(this.firebaseApp);
            C14132w wVar = this.requestDeduplicator;
            synchronized (wVar) {
                gVar = (C18123g) wVar.f31132b.getOrDefault(a, null);
                if (gVar == null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        String valueOf = String.valueOf(a);
                        Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Making new request for: ".concat(valueOf) : new String("Making new request for: "));
                    }
                    gVar = mo59163xa77f119c(a, tokenWithoutTriggeringSync).mo69662i(wVar.f31131a, new C1339j1(wVar, a));
                    wVar.f31132b.put(a, gVar);
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String valueOf2 = String.valueOf(a);
                    Log.d("FirebaseMessaging", valueOf2.length() != 0 ? "Joining ongoing request for: ".concat(valueOf2) : new String("Joining ongoing request for: "));
                }
            }
            try {
                return (String) C18126j.m30613a(gVar);
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    public C18123g<Void> deleteToken() {
        if (this.iid != null) {
            C18124h hVar = new C18124h();
            this.fileIoExecutor.execute(new C15128x4((Object) this, (Object) hVar, 5));
            return hVar.f39566a;
        } else if (getTokenWithoutTriggeringSync() == null) {
            return C18126j.m30617e((Object) null);
        } else {
            C18124h hVar2 = new C18124h();
            Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new C15136y4(this, hVar2));
            return hVar2.f39566a;
        }
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return C14128s.m21860a();
    }

    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public C18123g<String> getToken() {
        C18819a aVar = this.iid;
        if (aVar != null) {
            return aVar.mo70262c();
        }
        C18124h hVar = new C18124h();
        this.fileIoExecutor.execute(new C18105j(6, (Object) this, (Object) hVar));
        return hVar.f39566a;
    }

    public C16584a.C16585a getTokenWithoutTriggeringSync() {
        C16584a.C16585a b;
        C16584a store2 = getStore(this.context);
        String subtype = getSubtype();
        String a = C14129t.m21863a(this.firebaseApp);
        synchronized (store2) {
            b = C16584a.C16585a.m27411b(store2.f36794a.getString(C16584a.m27409a(subtype, a), (String) null));
        }
        return b;
    }

    public boolean isAutoInitEnabled() {
        boolean booleanValue;
        C16582a aVar = this.autoInit;
        synchronized (aVar) {
            aVar.mo59179a();
            Boolean bool = aVar.f36792d;
            booleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.mo69025f();
        }
        return booleanValue;
    }

    public boolean isGmsCorePresent() {
        return this.metadata.mo47012c();
    }

    public boolean isNotificationDelegationEnabled() {
        Context context2 = this.context;
        if (PlatformVersion.isAtLeastQ()) {
            if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                String valueOf = String.valueOf(context2.getPackageName());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "error retrieving notification delegate for package ".concat(valueOf) : new String("error retrieving notification delegate for package "));
            } else if ("com.google.android.gms".equals(((NotificationManager) context2.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    /* renamed from: lambda$blockingGetToken$8$com-google-firebase-messaging-FirebaseMessaging */
    public C18123g mo59162xa7f5779b(String str, C16584a.C16585a aVar, String str2) throws Exception {
        String str3;
        C16584a store2 = getStore(this.context);
        String subtype = getSubtype();
        C14129t tVar = this.metadata;
        synchronized (tVar) {
            if (tVar.f31123b == null) {
                tVar.mo47013d();
            }
            str3 = tVar.f31123b;
        }
        synchronized (store2) {
            String a = C16584a.C16585a.m27410a(System.currentTimeMillis(), str2, str3);
            if (a != null) {
                SharedPreferences.Editor edit = store2.f36794a.edit();
                edit.putString(C16584a.m27409a(subtype, str), a);
                edit.commit();
            }
        }
        if (aVar == null || !str2.equals(aVar.f36796a)) {
            invokeOnTokenRefresh(str2);
        }
        return C18126j.m30617e(str2);
    }

    /* renamed from: lambda$blockingGetToken$9$com-google-firebase-messaging-FirebaseMessaging */
    public C18123g mo59163xa77f119c(String str, C16584a.C16585a aVar) {
        C14125p pVar = this.gmsRpc;
        return pVar.mo47008b(C14129t.m21863a(pVar.f31112a), new Bundle(), "*").mo69660g(C14124o.f31111b, new C0164l((Object) pVar)).mo69669p(C14120k.f31107b, new C8220b(this, str, aVar));
    }

    /* renamed from: lambda$deleteToken$4$com-google-firebase-messaging-FirebaseMessaging */
    public /* synthetic */ void mo59164xd74d2373(C18124h hVar) {
        try {
            C18819a aVar = this.iid;
            C14129t.m21863a(this.firebaseApp);
            aVar.mo70260a();
            hVar.mo69678b(null);
        } catch (Exception e) {
            hVar.mo69677a(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        r5.mo69677a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: lambda$deleteToken$5$com-google-firebase-messaging-FirebaseMessaging */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo59165xd6d6bd74(p605kk.C18124h r5) {
        /*
            r4 = this;
            bn.p r0 = r4.gmsRpc     // Catch:{ Exception -> 0x0055 }
            r0.getClass()     // Catch:{ Exception -> 0x0055 }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Exception -> 0x0055 }
            r1.<init>()     // Catch:{ Exception -> 0x0055 }
            java.lang.String r2 = "delete"
            java.lang.String r3 = "1"
            r1.putString(r2, r3)     // Catch:{ Exception -> 0x0055 }
            gm.c r2 = r0.f31112a     // Catch:{ Exception -> 0x0055 }
            java.lang.String r2 = p517bn.C14129t.m21863a(r2)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r3 = "*"
            kk.g r1 = r0.mo47008b(r2, r1, r3)     // Catch:{ Exception -> 0x0055 }
            bn.o r2 = p517bn.C14124o.f31111b     // Catch:{ Exception -> 0x0055 }
            androidx.appcompat.app.l r3 = new androidx.appcompat.app.l     // Catch:{ Exception -> 0x0055 }
            r3.<init>((java.lang.Object) r0)     // Catch:{ Exception -> 0x0055 }
            kk.g r0 = r1.mo69660g(r2, r3)     // Catch:{ Exception -> 0x0055 }
            p605kk.C18126j.m30613a(r0)     // Catch:{ Exception -> 0x0055 }
            android.content.Context r0 = r4.context     // Catch:{ Exception -> 0x0055 }
            com.google.firebase.messaging.a r0 = getStore(r0)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r1 = r4.getSubtype()     // Catch:{ Exception -> 0x0055 }
            gm.c r2 = r4.firebaseApp     // Catch:{ Exception -> 0x0055 }
            java.lang.String r2 = p517bn.C14129t.m21863a(r2)     // Catch:{ Exception -> 0x0055 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r1 = com.google.firebase.messaging.C16584a.m27409a(r1, r2)     // Catch:{ all -> 0x0052 }
            android.content.SharedPreferences r2 = r0.f36794a     // Catch:{ all -> 0x0052 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x0052 }
            r2.remove(r1)     // Catch:{ all -> 0x0052 }
            r2.commit()     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)     // Catch:{ Exception -> 0x0055 }
            r0 = 0
            r5.mo69678b(r0)     // Catch:{ Exception -> 0x0055 }
            return
        L_0x0052:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x0055 }
            throw r1     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            r5.mo69677a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.mo59165xd6d6bd74(kk.h):void");
    }

    /* renamed from: lambda$getToken$3$com-google-firebase-messaging-FirebaseMessaging */
    public /* synthetic */ void mo59166x6c2cd681(C18124h hVar) {
        try {
            hVar.mo69678b(blockingGetToken());
        } catch (Exception e) {
            hVar.mo69677a(e);
        }
    }

    /* renamed from: lambda$new$0$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ void m35114lambda$new$0$comgooglefirebasemessagingFirebaseMessaging() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* renamed from: lambda$new$1$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ void m35115lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(C14109d0 d0Var) {
        if (isAutoInitEnabled()) {
            d0Var.mo46985f();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* renamed from: lambda$new$2$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m35116lambda$new$2$comgooglefirebasemessagingFirebaseMessaging() {
        /*
            r5 = this;
            android.content.Context r0 = r5.context
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            r1 = r0
        L_0x000a:
            java.lang.String r2 = "com.google.firebase.messaging"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            java.lang.String r2 = "proxy_notification_initialized"
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 == 0) goto L_0x001a
            goto L_0x005c
        L_0x001a:
            java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r2 = r0.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x0043 }
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0043 }
            if (r3 == 0) goto L_0x0043
            java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x0043 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0043 }
            if (r2 == 0) goto L_0x0043
            android.os.Bundle r3 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0043 }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.containsKey(r1)     // Catch:{ NameNotFoundException -> 0x0043 }
            if (r3 == 0) goto L_0x0043
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0043 }
            boolean r1 = r2.getBoolean(r1)     // Catch:{ NameNotFoundException -> 0x0043 }
            goto L_0x0044
        L_0x0043:
            r1 = 1
        L_0x0044:
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
            if (r2 != 0) goto L_0x004f
            r0 = 0
            p605kk.C18126j.m30617e(r0)
            goto L_0x005c
        L_0x004f:
            kk.h r2 = new kk.h
            r2.<init>()
            bn.v r3 = new bn.v
            r3.<init>(r0, r1, r2)
            r3.run()
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.m35116lambda$new$2$comgooglefirebasemessagingFirebaseMessaging():void");
    }

    public void send(RemoteMessage remoteMessage) {
        if (!TextUtils.isEmpty(remoteMessage.getTo())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
            intent.setPackage("com.google.android.gms");
            remoteMessage.populateSendMessageIntent(intent);
            this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void setAutoInitEnabled(boolean z) {
        C16582a aVar = this.autoInit;
        synchronized (aVar) {
            aVar.mo59179a();
            C14123n nVar = aVar.f36791c;
            if (nVar != null) {
                aVar.f36789a.mo69948a(nVar);
                aVar.f36791c = null;
            }
            C17793c r1 = FirebaseMessaging.this.firebaseApp;
            r1.mo69021a();
            SharedPreferences.Editor edit = r1.f38672a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
            aVar.f36792d = Boolean.valueOf(z);
        }
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        C17793c b = C17793c.m29919b();
        b.mo69021a();
        b.f38672a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    public C18123g<Void> setNotificationDelegationEnabled(boolean z) {
        Executor executor = this.fileIoExecutor;
        Context context2 = this.context;
        if (!PlatformVersion.isAtLeastQ()) {
            return C18126j.m30617e((Object) null);
        }
        C18124h hVar = new C18124h();
        executor.execute(new C14131v(context2, z, hVar));
        return hVar.f39566a;
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public C18123g<Void> subscribeToTopic(String str) {
        return this.topicsSubscriberTask.mo69670q(new C14121l(str));
    }

    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new C14135z(this, Math.min(Math.max(30, j + j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(C16584a.C16585a aVar) {
        String str;
        if (aVar != null) {
            C14129t tVar = this.metadata;
            synchronized (tVar) {
                if (tVar.f31123b == null) {
                    tVar.mo47013d();
                }
                str = tVar.f31123b;
            }
            return (System.currentTimeMillis() > (aVar.f36798c + C16584a.C16585a.f36795d) ? 1 : (System.currentTimeMillis() == (aVar.f36798c + C16584a.C16585a.f36795d) ? 0 : -1)) > 0 || !str.equals(aVar.f36797b);
        }
    }

    public C18123g<Void> unsubscribeFromTopic(String str) {
        return this.topicsSubscriberTask.mo69670q(new C15673x2(str));
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C17793c cVar) {
        FirebaseMessaging firebaseMessaging;
        Class<FirebaseMessaging> cls = FirebaseMessaging.class;
        synchronized (cls) {
            cVar.mo69021a();
            firebaseMessaging = (FirebaseMessaging) cVar.f38675d.get(cls);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public FirebaseMessaging(C17793c cVar, C18819a aVar, C18895a<C16687f> aVar2, C18895a<HeartBeatInfo> aVar3, C16563d dVar, C6518e eVar, C18752d dVar2, C14129t tVar) {
        this(cVar, aVar, dVar, eVar, dVar2, tVar, new C14125p(cVar, tVar, aVar2, aVar3, dVar), Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task")), new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init")));
    }

    public FirebaseMessaging(C17793c cVar, C18819a aVar, C16563d dVar, C6518e eVar, C18752d dVar2, C14129t tVar, C14125p pVar, Executor executor, Executor executor2) {
        this.syncScheduledOrRunning = false;
        transportFactory = eVar;
        this.firebaseApp = cVar;
        this.iid = aVar;
        this.fis = dVar;
        this.autoInit = new C16582a(dVar2);
        cVar.mo69021a();
        Context context2 = cVar.f38672a;
        this.context = context2;
        C14119j jVar = new C14119j();
        this.lifecycleCallbacks = jVar;
        this.metadata = tVar;
        this.taskExecutor = executor;
        this.gmsRpc = pVar;
        this.requestDeduplicator = new C14132w(executor);
        this.fileIoExecutor = executor2;
        cVar.mo69021a();
        Context context3 = cVar.f38672a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(jVar);
        } else {
            String valueOf = String.valueOf(context3);
            StringBuilder sb = new StringBuilder(valueOf.length() + 125);
            sb.append("Context ");
            sb.append(valueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (aVar != null) {
            aVar.mo70261b();
        }
        executor2.execute(new C15664v1(this, 1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i = C14109d0.f31073j;
        C18117a0 c = C18126j.m30615c(scheduledThreadPoolExecutor, new C14107c0(context2, this, pVar, tVar, scheduledThreadPoolExecutor));
        this.topicsSubscriberTask = c;
        c.mo69658e(executor2, new C1313c((Object) this));
        executor2.execute(new C14122m(this));
    }
}
