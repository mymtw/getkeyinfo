package com.google.firebase.installations;

import android.net.TrafficStats;
import android.util.Log;
import androidx.compose.p015ui.input.pointer.C1634f;
import androidx.compose.p015ui.platform.C1864q;
import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.C16572a;
import com.google.firebase.installations.local.C16573b;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.C16579a;
import com.google.firebase.installations.remote.C16580b;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.platforminfo.C16687f;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import kotlin.reflect.C19421p;
import p575gm.C17793c;
import p605kk.C18117a0;
import p605kk.C18124h;
import p605kk.C18126j;
import p722ym.C18895a;

/* renamed from: com.google.firebase.installations.c */
public final class C16560c implements C16563d {

    /* renamed from: m */
    public static final Object f36744m = new Object();

    /* renamed from: n */
    public static final C16561a f36745n = new C16561a();

    /* renamed from: a */
    public final C17793c f36746a;

    /* renamed from: b */
    public final C16579a f36747b;

    /* renamed from: c */
    public final PersistedInstallation f36748c;

    /* renamed from: d */
    public final C16570j f36749d;

    /* renamed from: e */
    public final C16572a f36750e;

    /* renamed from: f */
    public final C16568h f36751f;

    /* renamed from: g */
    public final Object f36752g;

    /* renamed from: h */
    public final ExecutorService f36753h;

    /* renamed from: i */
    public final ThreadPoolExecutor f36754i;

    /* renamed from: j */
    public String f36755j;

    /* renamed from: k */
    public HashSet f36756k;

    /* renamed from: l */
    public final ArrayList f36757l;

    /* renamed from: com.google.firebase.installations.c$a */
    public class C16561a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f36758b = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f36758b.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.c$b */
    public static /* synthetic */ class C16562b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36759a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f36760b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36760b = r0
                r1 = 1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f36760b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f36760b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f36759a = r2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f36759a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C16560c.C16562b.<clinit>():void");
        }
    }

    public C16560c(C17793c cVar, C18895a<C16687f> aVar, C18895a<HeartBeatInfo> aVar2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C16561a aVar3 = f36745n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, aVar3);
        cVar.mo69021a();
        C16579a aVar4 = new C16579a(cVar.f38672a, aVar, aVar2);
        PersistedInstallation persistedInstallation = new PersistedInstallation(cVar);
        if (C19421p.f43320j == null) {
            C19421p.f43320j = new C19421p();
        }
        C19421p pVar = C19421p.f43320j;
        if (C16570j.f36768d == null) {
            C16570j.f36768d = new C16570j(pVar);
        }
        C16570j jVar = C16570j.f36768d;
        C16572a aVar5 = new C16572a(cVar);
        C16568h hVar = new C16568h();
        this.f36752g = new Object();
        this.f36756k = new HashSet();
        this.f36757l = new ArrayList();
        this.f36746a = cVar;
        this.f36747b = aVar4;
        this.f36748c = persistedInstallation;
        this.f36749d = jVar;
        this.f36750e = aVar5;
        this.f36751f = hVar;
        this.f36753h = threadPoolExecutor;
        this.f36754i = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), aVar3);
    }

    /* renamed from: a */
    public final void mo59069a(boolean z) {
        C16573b b;
        synchronized (f36744m) {
            C17793c cVar = this.f36746a;
            cVar.mo69021a();
            C1634f c = C1634f.m3493c(cVar.f38672a);
            try {
                b = this.f36748c.mo59102b();
                if (b.isNotGenerated()) {
                    String d = mo59072d(b);
                    PersistedInstallation persistedInstallation = this.f36748c;
                    b = b.withUnregisteredFid(d);
                    persistedInstallation.mo59101a(b);
                }
            } finally {
                if (c != null) {
                    c.mo6597g();
                }
            }
        }
        if (z) {
            b = b.withClearedAuthToken();
        }
        mo59075g(b);
        this.f36754i.execute(new C16559b(this, z));
    }

    /* renamed from: b */
    public final C16573b mo59070b(C16573b bVar) throws FirebaseInstallationsException {
        boolean z;
        TokenResult f;
        C16579a aVar = this.f36747b;
        C17793c cVar = this.f36746a;
        cVar.mo69021a();
        String str = cVar.f38674c.f38684a;
        String firebaseInstallationId = bVar.getFirebaseInstallationId();
        C17793c cVar2 = this.f36746a;
        cVar2.mo69021a();
        String str2 = cVar2.f38674c.f38690g;
        String refreshToken = bVar.getRefreshToken();
        C16580b bVar2 = aVar.f36782d;
        synchronized (bVar2) {
            if (bVar2.f36787c != 0) {
                bVar2.f36785a.f36769a.getClass();
                if (System.currentTimeMillis() <= bVar2.f36786b) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            URL a = C16579a.m27390a(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str2, firebaseInstallationId}));
            int i = 0;
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c = aVar.mo59141c(a, str);
                try {
                    c.setRequestMethod("POST");
                    c.addRequestProperty("Authorization", "FIS_v2 " + refreshToken);
                    c.setDoOutput(true);
                    C16579a.m27396h(c);
                    int responseCode = c.getResponseCode();
                    aVar.f36782d.mo59142a(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        f = C16579a.m27394f(c);
                    } else {
                        C16579a.m27391b(c, (String) null, str, str2);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    f = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.BAD_CONFIG).build();
                                } else {
                                    c.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i++;
                                }
                            }
                        }
                        f = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.AUTH_ERROR).build();
                    }
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int i2 = C16562b.f36760b[f.getResponseCode().ordinal()];
                    if (i2 == 1) {
                        String token = f.getToken();
                        long tokenExpirationTimestamp = f.getTokenExpirationTimestamp();
                        C16570j jVar = this.f36749d;
                        jVar.getClass();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        jVar.f36769a.getClass();
                        return bVar.withAuthToken(token, tokenExpirationTimestamp, timeUnit.toSeconds(System.currentTimeMillis()));
                    } else if (i2 == 2) {
                        return bVar.withFisError("BAD CONFIG");
                    } else {
                        if (i2 == 3) {
                            synchronized (this) {
                                this.f36755j = null;
                            }
                            return bVar.withNoGeneratedFid();
                        }
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    /* renamed from: c */
    public final void mo59071c() {
        C17793c cVar = this.f36746a;
        cVar.mo69021a();
        Preconditions.checkNotEmpty(cVar.f38674c.f38685b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C17793c cVar2 = this.f36746a;
        cVar2.mo69021a();
        Preconditions.checkNotEmpty(cVar2.f38674c.f38690g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C17793c cVar3 = this.f36746a;
        cVar3.mo69021a();
        Preconditions.checkNotEmpty(cVar3.f38674c.f38684a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C17793c cVar4 = this.f36746a;
        cVar4.mo69021a();
        String str = cVar4.f38674c.f38685b;
        Pattern pattern = C16570j.f36767c;
        Preconditions.checkArgument(str.contains(MessageDraft.IMAGE_DELIMITER), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C17793c cVar5 = this.f36746a;
        cVar5.mo69021a();
        Preconditions.checkArgument(C16570j.f36767c.matcher(cVar5.f38674c.f38684a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f38673b) != false) goto L_0x001e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo59072d(com.google.firebase.installations.local.C16573b r6) {
        /*
            r5 = this;
            gm.c r0 = r5.f36746a
            r0.mo69021a()
            java.lang.String r0 = r0.f38673b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            gm.c r0 = r5.f36746a
            r0.mo69021a()
            java.lang.String r0 = r0.f38673b
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
        L_0x001e:
            boolean r6 = r6.shouldAttemptMigration()
            if (r6 != 0) goto L_0x002e
        L_0x0024:
            com.google.firebase.installations.h r6 = r5.f36751f
            r6.getClass()
            java.lang.String r6 = com.google.firebase.installations.C16568h.m27383a()
            return r6
        L_0x002e:
            com.google.firebase.installations.local.a r6 = r5.f36750e
            android.content.SharedPreferences r0 = r6.f36773a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f36773a     // Catch:{ all -> 0x005c }
            monitor-enter(r1)     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r2 = r6.f36773a     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0044
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            goto L_0x0049
        L_0x0044:
            java.lang.String r2 = r6.mo59103a()     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
        L_0x0049:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0058
            com.google.firebase.installations.h r6 = r5.f36751f
            r6.getClass()
            java.lang.String r2 = com.google.firebase.installations.C16568h.m27383a()
        L_0x0058:
            return r2
        L_0x0059:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            throw r6     // Catch:{ all -> 0x005c }
        L_0x005c:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C16560c.mo59072d(com.google.firebase.installations.local.b):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r8.startsWith("{") == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = new org.json.JSONObject(r8).getString(com.paypal.pyplcheckout.constants.UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0187, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0188, code lost:
        r12.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018e, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0061 */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0187 A[ExcHandler: all (r0v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:43:0x00cb] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.installations.local.C16573b mo59073e(com.google.firebase.installations.local.C16573b r17) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = r17.getFirebaseInstallationId()
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r17.getFirebaseInstallationId()
            int r0 = r0.length()
            r4 = 11
            if (r0 != r4) goto L_0x006b
            com.google.firebase.installations.local.a r0 = r1.f36750e
            android.content.SharedPreferences r4 = r0.f36773a
            monitor-enter(r4)
            java.lang.String[] r5 = com.google.firebase.installations.local.C16572a.f36772c     // Catch:{ all -> 0x0068 }
            r6 = 4
            r7 = r2
        L_0x001f:
            if (r7 >= r6) goto L_0x0066
            r8 = r5[r7]     // Catch:{ all -> 0x0068 }
            java.lang.String r9 = r0.f36774b     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r10.<init>()     // Catch:{ all -> 0x0068 }
            java.lang.String r11 = "|T|"
            r10.append(r11)     // Catch:{ all -> 0x0068 }
            r10.append(r9)     // Catch:{ all -> 0x0068 }
            java.lang.String r9 = "|"
            r10.append(r9)     // Catch:{ all -> 0x0068 }
            r10.append(r8)     // Catch:{ all -> 0x0068 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0068 }
            android.content.SharedPreferences r9 = r0.f36773a     // Catch:{ all -> 0x0068 }
            java.lang.String r8 = r9.getString(r8, r3)     // Catch:{ all -> 0x0068 }
            if (r8 == 0) goto L_0x0063
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x0068 }
            if (r9 != 0) goto L_0x0063
            java.lang.String r0 = "{"
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0060
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0061 }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r5 = "token"
            java.lang.String r3 = r0.getString(r5)     // Catch:{ JSONException -> 0x0061 }
            goto L_0x0061
        L_0x0060:
            r3 = r8
        L_0x0061:
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            goto L_0x006b
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x001f
        L_0x0066:
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            goto L_0x006b
        L_0x0068:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            throw r0
        L_0x006b:
            com.google.firebase.installations.remote.a r0 = r1.f36747b
            gm.c r4 = r1.f36746a
            r4.mo69021a()
            gm.e r4 = r4.f38674c
            java.lang.String r4 = r4.f38684a
            java.lang.String r5 = r17.getFirebaseInstallationId()
            gm.c r6 = r1.f36746a
            r6.mo69021a()
            gm.e r6 = r6.f38674c
            java.lang.String r6 = r6.f38690g
            gm.c r7 = r1.f36746a
            r7.mo69021a()
            gm.e r7 = r7.f38674c
            java.lang.String r7 = r7.f38685b
            com.google.firebase.installations.remote.b r8 = r0.f36782d
            monitor-enter(r8)
            int r9 = r8.f36787c     // Catch:{ all -> 0x01ac }
            r10 = 1
            if (r9 == 0) goto L_0x00a8
            com.google.firebase.installations.j r9 = r8.f36785a     // Catch:{ all -> 0x01ac }
            kotlin.reflect.p r9 = r9.f36769a     // Catch:{ all -> 0x01ac }
            r9.getClass()     // Catch:{ all -> 0x01ac }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01ac }
            long r13 = r8.f36786b     // Catch:{ all -> 0x01ac }
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r9 = r2
            goto L_0x00a9
        L_0x00a8:
            r9 = r10
        L_0x00a9:
            monitor-exit(r8)
            java.lang.String r8 = "Firebase Installations Service is unavailable. Please try again later."
            if (r9 == 0) goto L_0x01a4
            java.lang.Object[] r9 = new java.lang.Object[r10]
            r9[r2] = r6
            java.lang.String r11 = "projects/%s/installations"
            java.lang.String r9 = java.lang.String.format(r11, r9)
            java.net.URL r9 = com.google.firebase.installations.remote.C16579a.m27390a(r9)
            r11 = r2
        L_0x00bd:
            if (r11 > r10) goto L_0x019c
            r12 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r12)
            java.net.HttpURLConnection r12 = r0.mo59141c(r9, r4)
            java.lang.String r13 = "POST"
            r12.setRequestMethod(r13)     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            r12.setDoOutput(r10)     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            if (r3 == 0) goto L_0x00d8
            java.lang.String r13 = "x-goog-fis-android-iid-migration-auth"
            r12.addRequestProperty(r13, r3)     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
        L_0x00d8:
            com.google.firebase.installations.remote.C16579a.m27395g(r12, r5, r7)     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            int r13 = r12.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            com.google.firebase.installations.remote.b r14 = r0.f36782d     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            r14.mo59142a(r13)     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            r14 = 200(0xc8, float:2.8E-43)
            if (r13 < r14) goto L_0x00ee
            r14 = 300(0x12c, float:4.2E-43)
            if (r13 >= r14) goto L_0x00ee
            r14 = r10
            goto L_0x00ef
        L_0x00ee:
            r14 = r2
        L_0x00ef:
            if (r14 == 0) goto L_0x00f6
            com.google.firebase.installations.remote.InstallationResponse r0 = com.google.firebase.installations.remote.C16579a.m27393e(r12)     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            goto L_0x011c
        L_0x00f6:
            com.google.firebase.installations.remote.C16579a.m27391b(r12, r7, r4, r6)     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            r14 = 429(0x1ad, float:6.01E-43)
            if (r13 == r14) goto L_0x017b
            r14 = 500(0x1f4, float:7.0E-43)
            if (r13 < r14) goto L_0x0107
            r14 = 600(0x258, float:8.41E-43)
            if (r13 >= r14) goto L_0x0107
            goto L_0x018f
        L_0x0107:
            java.lang.String r13 = "Firebase-Installations"
            java.lang.String r14 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r13, r14)     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            com.google.firebase.installations.remote.InstallationResponse$a r13 = com.google.firebase.installations.remote.InstallationResponse.builder()     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r14 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            com.google.firebase.installations.remote.InstallationResponse$a r13 = r13.setResponseCode(r14)     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
            com.google.firebase.installations.remote.InstallationResponse r0 = r13.build()     // Catch:{ IOException | AssertionError -> 0x018f, all -> 0x0187 }
        L_0x011c:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int[] r2 = com.google.firebase.installations.C16560c.C16562b.f36759a
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = r0.getResponseCode()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            if (r2 == r10) goto L_0x0146
            r0 = 2
            if (r2 != r0) goto L_0x013c
            java.lang.String r0 = "BAD CONFIG"
            r13 = r17
            com.google.firebase.installations.local.b r0 = r13.withFisError(r0)
            return r0
        L_0x013c:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r3 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r2, r3)
            throw r0
        L_0x0146:
            r13 = r17
            java.lang.String r3 = r0.getFid()
            java.lang.String r4 = r0.getRefreshToken()
            com.google.firebase.installations.j r2 = r1.f36749d
            r2.getClass()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            kotlin.reflect.p r2 = r2.f36769a
            r2.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            long r5 = r5.toSeconds(r6)
            com.google.firebase.installations.remote.TokenResult r2 = r0.getAuthToken()
            java.lang.String r7 = r2.getToken()
            com.google.firebase.installations.remote.TokenResult r0 = r0.getAuthToken()
            long r8 = r0.getTokenExpirationTimestamp()
            r2 = r17
            com.google.firebase.installations.local.b r0 = r2.withRegisteredFid(r3, r4, r5, r7, r8)
            return r0
        L_0x017b:
            r13 = r17
            com.google.firebase.installations.FirebaseInstallationsException r14 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException | AssertionError -> 0x0191, all -> 0x0187 }
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x0191, all -> 0x0187 }
            r14.<init>(r15, r2)     // Catch:{ IOException | AssertionError -> 0x0191, all -> 0x0187 }
            throw r14     // Catch:{ IOException | AssertionError -> 0x0191, all -> 0x0187 }
        L_0x0187:
            r0 = move-exception
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x018f:
            r13 = r17
        L_0x0191:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r11 = r11 + 1
            r2 = 0
            goto L_0x00bd
        L_0x019c:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r8, r2)
            throw r0
        L_0x01a4:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r8, r2)
            throw r0
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C16560c.mo59073e(com.google.firebase.installations.local.b):com.google.firebase.installations.local.b");
    }

    /* renamed from: f */
    public final void mo59074f(Exception exc) {
        synchronized (this.f36752g) {
            Iterator it = this.f36757l.iterator();
            while (it.hasNext()) {
                if (((C16569i) it.next()).mo59079a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo59075g(C16573b bVar) {
        synchronized (this.f36752g) {
            Iterator it = this.f36757l.iterator();
            while (it.hasNext()) {
                if (((C16569i) it.next()).mo59080b(bVar)) {
                    it.remove();
                }
            }
        }
    }

    public final C18117a0 getId() {
        String str;
        mo59071c();
        synchronized (this) {
            str = this.f36755j;
        }
        if (str != null) {
            return C18126j.m30617e(str);
        }
        C18124h hVar = new C18124h();
        C16565f fVar = new C16565f(hVar);
        synchronized (this.f36752g) {
            this.f36757l.add(fVar);
        }
        C18117a0<TResult> a0Var = hVar.f39566a;
        this.f36753h.execute(new C1864q(this, 6));
        return a0Var;
    }

    public final C18117a0 getToken() {
        mo59071c();
        C18124h hVar = new C18124h();
        C16564e eVar = new C16564e(this.f36749d, hVar);
        synchronized (this.f36752g) {
            this.f36757l.add(eVar);
        }
        C18117a0<TResult> a0Var = hVar.f39566a;
        this.f36753h.execute(new C16558a(this));
        return a0Var;
    }
}
