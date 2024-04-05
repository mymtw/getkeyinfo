package p492yf;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import org.json.JSONException;
import org.json.JSONObject;
import p401mg.C13080a;
import p492yf.C13923b;

/* renamed from: yf.c */
public final class C13926c {

    /* renamed from: s */
    public static final AtomicBoolean f30602s = new AtomicBoolean(false);

    /* renamed from: t */
    public static C13926c f30603t;

    /* renamed from: u */
    public static final AtomicBoolean f30604u = new AtomicBoolean(false);

    /* renamed from: v */
    public static final ConcurrentHashMap f30605v = new ConcurrentHashMap();

    /* renamed from: w */
    public static final ConcurrentHashMap f30606w = new ConcurrentHashMap();

    /* renamed from: x */
    public static final C13928b f30607x = new C13928b();

    /* renamed from: a */
    public final CopyOnWriteArraySet f30608a;

    /* renamed from: b */
    public final Context f30609b;

    /* renamed from: c */
    public final Object f30610c;

    /* renamed from: d */
    public final Class<?> f30611d;

    /* renamed from: e */
    public final Class<?> f30612e;

    /* renamed from: f */
    public final Class<?> f30613f;

    /* renamed from: g */
    public final Class<?> f30614g;

    /* renamed from: h */
    public final Class<?> f30615h;

    /* renamed from: i */
    public final Class<?> f30616i;

    /* renamed from: j */
    public final Class<?> f30617j;

    /* renamed from: k */
    public final Method f30618k;

    /* renamed from: l */
    public final Method f30619l;

    /* renamed from: m */
    public final Method f30620m;

    /* renamed from: n */
    public final Method f30621n;

    /* renamed from: o */
    public final Method f30622o;

    /* renamed from: p */
    public final Method f30623p;

    /* renamed from: q */
    public final Method f30624q;

    /* renamed from: r */
    public final C13936h f30625r;

    /* renamed from: yf.c$a */
    public static final class C13927a implements InvocationHandler {
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C13080a.m20762b(this)) {
                return null;
            }
            try {
                C19383o.m32797g(obj, "proxy");
                C19383o.m32797g(method, "m");
                if (C19383o.m32792b(method.getName(), "onBillingSetupFinished")) {
                    C13926c.f30607x.getClass();
                    C13928b.m21440c().set(true);
                } else {
                    String name = method.getName();
                    C19383o.m32796f(name, "m.name");
                    if (C19457k.m33018V0(name, "onBillingServiceDisconnected")) {
                        C13926c.f30607x.getClass();
                        C13928b.m21440c().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return null;
            }
        }
    }

    /* renamed from: yf.c$b */
    public static final class C13928b {
        /* JADX WARNING: Removed duplicated region for block: B:104:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8 A[SYNTHETIC, Splitter:B:40:0x00a8] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m21438a(android.content.Context r27) {
            /*
                java.lang.Class<yf.h> r1 = p492yf.C13936h.class
                java.lang.Class<yf.c> r2 = p492yf.C13926c.class
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                yf.h$a r0 = p492yf.C13936h.f30646i
                r0.getClass()
                boolean r0 = p401mg.C13080a.m20762b(r1)
                if (r0 == 0) goto L_0x0013
            L_0x0011:
                r0 = 0
                goto L_0x001c
            L_0x0013:
                java.util.concurrent.atomic.AtomicBoolean r0 = p492yf.C13936h.f30645h     // Catch:{ all -> 0x0016 }
                goto L_0x001c
            L_0x0016:
                r0 = move-exception
                r5 = r0
                p401mg.C13080a.m20761a(r1, r5)
                goto L_0x0011
            L_0x001c:
                boolean r0 = r0.get()
                java.lang.String r5 = "build"
                java.lang.String r6 = "newBuilder"
                r7 = 0
                r8 = 1
                if (r0 == 0) goto L_0x003c
                boolean r0 = p401mg.C13080a.m20762b(r1)
                if (r0 == 0) goto L_0x0030
            L_0x002e:
                r0 = 0
                goto L_0x0039
            L_0x0030:
                yf.h r0 = p492yf.C13936h.f30644g     // Catch:{ all -> 0x0033 }
                goto L_0x0039
            L_0x0033:
                r0 = move-exception
                r9 = r0
                p401mg.C13080a.m20761a(r1, r9)
                goto L_0x002e
            L_0x0039:
                r1 = r0
                goto L_0x00b1
            L_0x003c:
                java.lang.String r0 = "com.android.billingclient.api.SkuDetailsParams"
                java.lang.Class r10 = p492yf.C13938i.m21464a(r0)
                java.lang.String r0 = "com.android.billingclient.api.SkuDetailsParams$Builder"
                java.lang.Class r11 = p492yf.C13938i.m21464a(r0)
                if (r10 == 0) goto L_0x008d
                if (r11 != 0) goto L_0x004d
                goto L_0x008d
            L_0x004d:
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.reflect.Method r12 = p492yf.C13938i.m21465b(r10, r6, r0)
                java.lang.Class[] r0 = new java.lang.Class[r8]
                r0[r7] = r3
                java.lang.String r9 = "setType"
                java.lang.reflect.Method r13 = p492yf.C13938i.m21465b(r11, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r8]
                java.lang.Class<java.util.List> r9 = java.util.List.class
                r0[r7] = r9
                java.lang.String r9 = "setSkusList"
                java.lang.reflect.Method r14 = p492yf.C13938i.m21465b(r11, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.reflect.Method r15 = p492yf.C13938i.m21465b(r11, r5, r0)
                if (r12 == 0) goto L_0x008d
                if (r13 == 0) goto L_0x008d
                if (r14 == 0) goto L_0x008d
                if (r15 != 0) goto L_0x0078
                goto L_0x008d
            L_0x0078:
                yf.h r0 = new yf.h
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15)
                boolean r9 = p401mg.C13080a.m20762b(r1)
                if (r9 == 0) goto L_0x0085
                goto L_0x008d
            L_0x0085:
                p492yf.C13936h.f30644g = r0     // Catch:{ all -> 0x0088 }
                goto L_0x008d
            L_0x0088:
                r0 = move-exception
                r9 = r0
                p401mg.C13080a.m20761a(r1, r9)
            L_0x008d:
                boolean r0 = p401mg.C13080a.m20762b(r1)
                if (r0 == 0) goto L_0x0095
            L_0x0093:
                r0 = 0
                goto L_0x009e
            L_0x0095:
                java.util.concurrent.atomic.AtomicBoolean r0 = p492yf.C13936h.f30645h     // Catch:{ all -> 0x0098 }
                goto L_0x009e
            L_0x0098:
                r0 = move-exception
                r9 = r0
                p401mg.C13080a.m20761a(r1, r9)
                goto L_0x0093
            L_0x009e:
                r0.set(r8)
                boolean r0 = p401mg.C13080a.m20762b(r1)
                if (r0 == 0) goto L_0x00a8
            L_0x00a7:
                goto L_0x002e
            L_0x00a8:
                yf.h r0 = p492yf.C13936h.f30644g     // Catch:{ all -> 0x00ab }
                goto L_0x0039
            L_0x00ab:
                r0 = move-exception
                r9 = r0
                p401mg.C13080a.m20761a(r1, r9)
                goto L_0x00a7
            L_0x00b1:
                if (r1 == 0) goto L_0x0209
                java.lang.String r0 = "com.android.billingclient.api.BillingClient"
                java.lang.Class r12 = p492yf.C13938i.m21464a(r0)
                java.lang.String r0 = "com.android.billingclient.api.Purchase"
                java.lang.Class r14 = p492yf.C13938i.m21464a(r0)
                java.lang.String r0 = "com.android.billingclient.api.Purchase$PurchasesResult"
                java.lang.Class r13 = p492yf.C13938i.m21464a(r0)
                java.lang.String r0 = "com.android.billingclient.api.SkuDetails"
                java.lang.Class r15 = p492yf.C13938i.m21464a(r0)
                java.lang.String r0 = "com.android.billingclient.api.PurchaseHistoryRecord"
                java.lang.Class r11 = p492yf.C13938i.m21464a(r0)
                java.lang.String r0 = "com.android.billingclient.api.SkuDetailsResponseListener"
                java.lang.Class r17 = p492yf.C13938i.m21464a(r0)
                java.lang.String r0 = "com.android.billingclient.api.PurchaseHistoryResponseListener"
                java.lang.Class r18 = p492yf.C13938i.m21464a(r0)
                if (r12 == 0) goto L_0x0209
                if (r13 == 0) goto L_0x0209
                if (r14 == 0) goto L_0x0209
                if (r15 == 0) goto L_0x0209
                if (r17 == 0) goto L_0x0209
                if (r11 == 0) goto L_0x0209
                if (r18 != 0) goto L_0x00ed
                goto L_0x0209
            L_0x00ed:
                java.lang.Class[] r0 = new java.lang.Class[r8]
                r0[r7] = r3
                java.lang.String r9 = "queryPurchases"
                java.lang.reflect.Method r19 = p492yf.C13938i.m21465b(r12, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.String r9 = "getPurchasesList"
                java.lang.reflect.Method r20 = p492yf.C13938i.m21465b(r13, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.String r9 = "getOriginalJson"
                java.lang.reflect.Method r21 = p492yf.C13938i.m21465b(r14, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.reflect.Method r22 = p492yf.C13938i.m21465b(r15, r9, r0)
                java.lang.Class[] r0 = new java.lang.Class[r7]
                java.lang.reflect.Method r23 = p492yf.C13938i.m21465b(r11, r9, r0)
                r9 = 2
                java.lang.Class[] r10 = new java.lang.Class[r9]
                boolean r0 = p401mg.C13080a.m20762b(r1)
                if (r0 == 0) goto L_0x011d
                goto L_0x0125
            L_0x011d:
                java.lang.Class<?> r0 = r1.f30647a     // Catch:{ all -> 0x0120 }
                goto L_0x0126
            L_0x0120:
                r0 = move-exception
                r4 = r0
                p401mg.C13080a.m20761a(r1, r4)
            L_0x0125:
                r0 = 0
            L_0x0126:
                r10[r7] = r0
                r10[r8] = r17
                java.lang.String r0 = "querySkuDetailsAsync"
                java.lang.reflect.Method r24 = p492yf.C13938i.m21465b(r12, r0, r10)
                java.lang.Class[] r0 = new java.lang.Class[r9]
                r0[r7] = r3
                r0[r8] = r18
                java.lang.String r3 = "queryPurchaseHistoryAsync"
                java.lang.reflect.Method r25 = p492yf.C13938i.m21465b(r12, r3, r0)
                if (r19 == 0) goto L_0x0209
                if (r20 == 0) goto L_0x0209
                if (r21 == 0) goto L_0x0209
                if (r22 == 0) goto L_0x0209
                if (r23 == 0) goto L_0x0209
                if (r24 == 0) goto L_0x0209
                if (r25 != 0) goto L_0x014c
                goto L_0x0209
            L_0x014c:
                java.lang.String r0 = "com.android.billingclient.api.BillingClient$Builder"
                java.lang.Class r0 = p492yf.C13938i.m21464a(r0)
                java.lang.String r3 = "com.android.billingclient.api.PurchasesUpdatedListener"
                java.lang.Class r3 = p492yf.C13938i.m21464a(r3)
                if (r0 == 0) goto L_0x01c8
                if (r3 != 0) goto L_0x015d
                goto L_0x01c8
            L_0x015d:
                java.lang.Class[] r4 = new java.lang.Class[r8]
                java.lang.Class<android.content.Context> r9 = android.content.Context.class
                r4[r7] = r9
                java.lang.reflect.Method r4 = p492yf.C13938i.m21465b(r12, r6, r4)
                java.lang.Class[] r6 = new java.lang.Class[r7]
                java.lang.String r9 = "enablePendingPurchases"
                java.lang.reflect.Method r6 = p492yf.C13938i.m21465b(r0, r9, r6)
                java.lang.Class[] r9 = new java.lang.Class[r8]
                r9[r7] = r3
                java.lang.String r10 = "setListener"
                java.lang.reflect.Method r9 = p492yf.C13938i.m21465b(r0, r10, r9)
                java.lang.Class[] r10 = new java.lang.Class[r7]
                java.lang.reflect.Method r5 = p492yf.C13938i.m21465b(r0, r5, r10)
                if (r4 == 0) goto L_0x01c8
                if (r6 == 0) goto L_0x01c8
                if (r9 == 0) goto L_0x01c8
                if (r5 != 0) goto L_0x0188
                goto L_0x01c8
            L_0x0188:
                java.lang.Object[] r10 = new java.lang.Object[r8]
                r10[r7] = r27
                r7 = 0
                java.lang.Object r4 = p492yf.C13938i.m21466c(r12, r7, r4, r10)
                if (r4 == 0) goto L_0x01c8
                java.lang.ClassLoader r10 = r3.getClassLoader()
                java.lang.Class[] r7 = new java.lang.Class[r8]
                r8 = 0
                r7[r8] = r3
                yf.c$d r3 = new yf.c$d
                r3.<init>()
                java.lang.Object r3 = java.lang.reflect.Proxy.newProxyInstance(r10, r7, r3)
                java.lang.String r7 = "Proxy.newProxyInstance(\n…UpdatedListenerWrapper())"
                kotlin.jvm.internal.C19383o.m32796f(r3, r7)
                r7 = 1
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r7[r8] = r3
                java.lang.Object r3 = p492yf.C13938i.m21466c(r0, r4, r9, r7)
                if (r3 != 0) goto L_0x01b6
                goto L_0x01c8
            L_0x01b6:
                java.lang.Object[] r4 = new java.lang.Object[r8]
                java.lang.Object r3 = p492yf.C13938i.m21466c(r0, r3, r6, r4)
                if (r3 != 0) goto L_0x01bf
                goto L_0x01c8
            L_0x01bf:
                java.lang.Object[] r4 = new java.lang.Object[r8]
                java.lang.Object r4 = p492yf.C13938i.m21466c(r0, r3, r5, r4)
                r16 = r4
                goto L_0x01ca
            L_0x01c8:
                r16 = 0
            L_0x01ca:
                if (r16 == 0) goto L_0x0209
                yf.c r0 = new yf.c
                r9 = r0
                r10 = r27
                r3 = r11
                r11 = r16
                r16 = r3
                r26 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                boolean r1 = p401mg.C13080a.m20762b(r2)
                if (r1 == 0) goto L_0x01e2
                goto L_0x01ea
            L_0x01e2:
                p492yf.C13926c.f30603t = r0     // Catch:{ all -> 0x01e5 }
                goto L_0x01ea
            L_0x01e5:
                r0 = move-exception
                r1 = r0
                p401mg.C13080a.m20761a(r2, r1)
            L_0x01ea:
                yf.c r0 = p492yf.C13926c.m21433a()
                if (r0 == 0) goto L_0x0201
                boolean r1 = p401mg.C13080a.m20762b(r2)
                if (r1 == 0) goto L_0x01f7
                goto L_0x0200
            L_0x01f7:
                r0.mo46737e()     // Catch:{ all -> 0x01fb }
                goto L_0x0200
            L_0x01fb:
                r0 = move-exception
                r1 = r0
                p401mg.C13080a.m20761a(r2, r1)
            L_0x0200:
                return
            L_0x0201:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper"
                r0.<init>(r1)
                throw r0
            L_0x0209:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p492yf.C13926c.C13928b.m21438a(android.content.Context):void");
        }

        /* renamed from: b */
        public static ConcurrentHashMap m21439b() {
            AtomicBoolean atomicBoolean = C13926c.f30602s;
            Class<C13926c> cls = C13926c.class;
            if (!C13080a.m20762b(cls)) {
                try {
                    return C13926c.f30605v;
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
            return null;
        }

        /* renamed from: c */
        public static AtomicBoolean m21440c() {
            AtomicBoolean atomicBoolean = C13926c.f30602s;
            Class<C13926c> cls = C13926c.class;
            if (!C13080a.m20762b(cls)) {
                try {
                    return C13926c.f30604u;
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
            return null;
        }
    }

    /* renamed from: yf.c$c */
    public final class C13929c implements InvocationHandler {

        /* renamed from: a */
        public Runnable f30626a;

        public C13929c(C13932d dVar) {
            this.f30626a = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0034 A[SYNTHETIC, Splitter:B:21:0x0034] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0047 A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004c A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0071 A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x000f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x000f A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo46739a(java.util.List<?> r8) {
            /*
                r7 = this;
                java.lang.Class<yf.c> r0 = p492yf.C13926c.class
                java.lang.String r1 = "productId"
                boolean r2 = p401mg.C13080a.m20762b(r7)
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00a1 }
            L_0x000f:
                boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00a1 }
                if (r2 == 0) goto L_0x009b
                java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00a1 }
                yf.c r3 = p492yf.C13926c.this     // Catch:{ Exception -> 0x000f }
                boolean r4 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x000f }
                r5 = 0
                if (r4 == 0) goto L_0x0023
                goto L_0x002a
            L_0x0023:
                java.lang.Class<?> r3 = r3.f30615h     // Catch:{ all -> 0x0026 }
                goto L_0x002b
            L_0x0026:
                r3 = move-exception
                p401mg.C13080a.m20761a(r0, r3)     // Catch:{ Exception -> 0x000f }
            L_0x002a:
                r3 = r5
            L_0x002b:
                yf.c r4 = p492yf.C13926c.this     // Catch:{ Exception -> 0x000f }
                boolean r6 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x000f }
                if (r6 == 0) goto L_0x0034
                goto L_0x003b
            L_0x0034:
                java.lang.reflect.Method r4 = r4.f30622o     // Catch:{ all -> 0x0037 }
                goto L_0x003c
            L_0x0037:
                r4 = move-exception
                p401mg.C13080a.m20761a(r0, r4)     // Catch:{ Exception -> 0x000f }
            L_0x003b:
                r4 = r5
            L_0x003c:
                r6 = 0
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x000f }
                java.lang.Object r2 = p492yf.C13938i.m21466c(r3, r2, r4, r6)     // Catch:{ Exception -> 0x000f }
                boolean r3 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x000f }
                if (r3 != 0) goto L_0x0048
                r2 = r5
            L_0x0048:
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x000f }
                if (r2 == 0) goto L_0x000f
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x000f }
                r3.<init>(r2)     // Catch:{ Exception -> 0x000f }
                yf.c r2 = p492yf.C13926c.this     // Catch:{ Exception -> 0x000f }
                boolean r4 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x000f }
                if (r4 == 0) goto L_0x005a
                goto L_0x0061
            L_0x005a:
                android.content.Context r2 = r2.f30609b     // Catch:{ all -> 0x005d }
                goto L_0x0062
            L_0x005d:
                r2 = move-exception
                p401mg.C13080a.m20761a(r0, r2)     // Catch:{ Exception -> 0x000f }
            L_0x0061:
                r2 = r5
            L_0x0062:
                java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x000f }
                java.lang.String r4 = "packageName"
                r3.put(r4, r2)     // Catch:{ Exception -> 0x000f }
                boolean r2 = r3.has(r1)     // Catch:{ Exception -> 0x000f }
                if (r2 == 0) goto L_0x000f
                java.lang.String r2 = r3.getString(r1)     // Catch:{ Exception -> 0x000f }
                yf.c r4 = p492yf.C13926c.this     // Catch:{ Exception -> 0x000f }
                boolean r6 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x000f }
                if (r6 == 0) goto L_0x007e
                goto L_0x0085
            L_0x007e:
                java.util.concurrent.CopyOnWriteArraySet r5 = r4.f30608a     // Catch:{ all -> 0x0081 }
                goto L_0x0085
            L_0x0081:
                r4 = move-exception
                p401mg.C13080a.m20761a(r0, r4)     // Catch:{ Exception -> 0x000f }
            L_0x0085:
                r5.add(r2)     // Catch:{ Exception -> 0x000f }
                yf.c$b r4 = p492yf.C13926c.f30607x     // Catch:{ Exception -> 0x000f }
                r4.getClass()     // Catch:{ Exception -> 0x000f }
                java.util.concurrent.ConcurrentHashMap r4 = p492yf.C13926c.C13928b.m21439b()     // Catch:{ Exception -> 0x000f }
                java.lang.String r5 = "skuID"
                kotlin.jvm.internal.C19383o.m32796f(r2, r5)     // Catch:{ Exception -> 0x000f }
                r4.put(r2, r3)     // Catch:{ Exception -> 0x000f }
                goto L_0x000f
            L_0x009b:
                java.lang.Runnable r8 = r7.f30626a     // Catch:{ all -> 0x00a1 }
                r8.run()     // Catch:{ all -> 0x00a1 }
                return
            L_0x00a1:
                r8 = move-exception
                p401mg.C13080a.m20761a(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p492yf.C13926c.C13929c.mo46739a(java.util.List):void");
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C13080a.m20762b(this)) {
                return null;
            }
            try {
                C19383o.m32797g(obj, "proxy");
                C19383o.m32797g(method, ResponseConstants.METHOD);
                if (C19383o.m32792b(method.getName(), "onPurchaseHistoryResponse")) {
                    List list = objArr != null ? objArr[1] : null;
                    if (list != null && (list instanceof List)) {
                        mo46739a(list);
                    }
                }
                return null;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return null;
            }
        }
    }

    /* renamed from: yf.c$d */
    public static final class C13930d implements InvocationHandler {
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C13080a.m20762b(this)) {
                return null;
            }
            try {
                C19383o.m32797g(obj, "proxy");
                C19383o.m32797g(method, "m");
                return null;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return null;
            }
        }
    }

    /* renamed from: yf.c$e */
    public final class C13931e implements InvocationHandler {

        /* renamed from: a */
        public Runnable f30628a;

        /* renamed from: b */
        public final /* synthetic */ C13926c f30629b;

        public C13931e(C13926c cVar, Runnable runnable) {
            C19383o.m32797g(runnable, "runnable");
            this.f30629b = cVar;
            this.f30628a = runnable;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0034 A[SYNTHETIC, Splitter:B:21:0x0034] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0047 A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004c A[Catch:{ Exception -> 0x000f }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x000f A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo46742a(java.util.List<?> r8) {
            /*
                r7 = this;
                java.lang.Class<yf.c> r0 = p492yf.C13926c.class
                java.lang.String r1 = "productId"
                boolean r2 = p401mg.C13080a.m20762b(r7)
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x007d }
            L_0x000f:
                boolean r2 = r8.hasNext()     // Catch:{ all -> 0x007d }
                if (r2 == 0) goto L_0x0077
                java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x007d }
                yf.c r3 = r7.f30629b     // Catch:{ Exception -> 0x000f }
                boolean r4 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x000f }
                r5 = 0
                if (r4 == 0) goto L_0x0023
                goto L_0x002a
            L_0x0023:
                java.lang.Class<?> r3 = r3.f30614g     // Catch:{ all -> 0x0026 }
                goto L_0x002b
            L_0x0026:
                r3 = move-exception
                p401mg.C13080a.m20761a(r0, r3)     // Catch:{ Exception -> 0x000f }
            L_0x002a:
                r3 = r5
            L_0x002b:
                yf.c r4 = r7.f30629b     // Catch:{ Exception -> 0x000f }
                boolean r6 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x000f }
                if (r6 == 0) goto L_0x0034
                goto L_0x003b
            L_0x0034:
                java.lang.reflect.Method r4 = r4.f30621n     // Catch:{ all -> 0x0037 }
                goto L_0x003c
            L_0x0037:
                r4 = move-exception
                p401mg.C13080a.m20761a(r0, r4)     // Catch:{ Exception -> 0x000f }
            L_0x003b:
                r4 = r5
            L_0x003c:
                r6 = 0
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x000f }
                java.lang.Object r2 = p492yf.C13938i.m21466c(r3, r2, r4, r6)     // Catch:{ Exception -> 0x000f }
                boolean r3 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x000f }
                if (r3 != 0) goto L_0x0048
                r2 = r5
            L_0x0048:
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x000f }
                if (r2 == 0) goto L_0x000f
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x000f }
                r3.<init>(r2)     // Catch:{ Exception -> 0x000f }
                boolean r2 = r3.has(r1)     // Catch:{ Exception -> 0x000f }
                if (r2 == 0) goto L_0x000f
                java.lang.String r2 = r3.getString(r1)     // Catch:{ Exception -> 0x000f }
                yf.c$b r4 = p492yf.C13926c.f30607x     // Catch:{ Exception -> 0x000f }
                r4.getClass()     // Catch:{ Exception -> 0x000f }
                boolean r4 = p401mg.C13080a.m20762b(r0)     // Catch:{ Exception -> 0x000f }
                if (r4 == 0) goto L_0x0067
                goto L_0x006e
            L_0x0067:
                java.util.concurrent.ConcurrentHashMap r5 = p492yf.C13926c.f30606w     // Catch:{ all -> 0x006a }
                goto L_0x006e
            L_0x006a:
                r4 = move-exception
                p401mg.C13080a.m20761a(r0, r4)     // Catch:{ Exception -> 0x000f }
            L_0x006e:
                java.lang.String r4 = "skuID"
                kotlin.jvm.internal.C19383o.m32796f(r2, r4)     // Catch:{ Exception -> 0x000f }
                r5.put(r2, r3)     // Catch:{ Exception -> 0x000f }
                goto L_0x000f
            L_0x0077:
                java.lang.Runnable r8 = r7.f30628a     // Catch:{ all -> 0x007d }
                r8.run()     // Catch:{ all -> 0x007d }
                return
            L_0x007d:
                r8 = move-exception
                p401mg.C13080a.m20761a(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p492yf.C13926c.C13931e.mo46742a(java.util.List):void");
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C13080a.m20762b(this)) {
                return null;
            }
            try {
                C19383o.m32797g(obj, "proxy");
                C19383o.m32797g(method, "m");
                if (C19383o.m32792b(method.getName(), "onSkuDetailsResponse")) {
                    List list = objArr != null ? objArr[1] : null;
                    if (list != null && (list instanceof List)) {
                        mo46742a(list);
                    }
                }
                return null;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return null;
            }
        }
    }

    public C13926c() {
        throw null;
    }

    public C13926c(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C13936h hVar) {
        this.f30609b = context;
        this.f30610c = obj;
        this.f30611d = cls;
        this.f30612e = cls2;
        this.f30613f = cls3;
        this.f30614g = cls4;
        this.f30615h = cls5;
        this.f30616i = cls6;
        this.f30617j = cls7;
        this.f30618k = method;
        this.f30619l = method2;
        this.f30620m = method3;
        this.f30621n = method4;
        this.f30622o = method5;
        this.f30623p = method6;
        this.f30624q = method7;
        this.f30625r = hVar;
        this.f30608a = new CopyOnWriteArraySet();
    }

    /* renamed from: a */
    public static final /* synthetic */ C13926c m21433a() {
        Class<C13926c> cls = C13926c.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return f30603t;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo46734b() {
        C13923b.C13925b bVar = C13923b.C13925b.f30601b;
        if (!C13080a.m20762b(this)) {
            try {
                Object c = C13938i.m21466c(this.f30612e, C13938i.m21466c(this.f30611d, this.f30610c, this.f30618k, "inapp"), this.f30619l, new Object[0]);
                if (!(c instanceof List)) {
                    c = null;
                }
                List<Object> list = (List) c;
                if (list != null) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Object c2 : list) {
                            Object c3 = C13938i.m21466c(this.f30613f, c2, this.f30620m, new Object[0]);
                            if (!(c3 instanceof String)) {
                                c3 = null;
                            }
                            String str = (String) c3;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    arrayList.add(string);
                                    ConcurrentHashMap concurrentHashMap = f30605v;
                                    C19383o.m32796f(string, "skuID");
                                    concurrentHashMap.put(string, jSONObject);
                                }
                            }
                        }
                        mo46736d(arrayList, bVar);
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: c */
    public final void mo46735c(C13932d dVar) {
        if (!C13080a.m20762b(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.f30617j.getClassLoader(), new Class[]{this.f30617j}, new C13929c(dVar));
                C19383o.m32796f(newProxyInstance, "Proxy.newProxyInstance(\n…istenerWrapper(runnable))");
                Class<?> cls = this.f30611d;
                Method method = this.f30624q;
                C13938i.m21466c(cls, this.f30610c, method, "inapp", newProxyInstance);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: d */
    public final void mo46736d(ArrayList arrayList, Runnable runnable) {
        if (!C13080a.m20762b(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.f30616i.getClassLoader(), new Class[]{this.f30616i}, new C13931e(this, runnable));
                C19383o.m32796f(newProxyInstance, "Proxy.newProxyInstance(\n…istenerWrapper(runnable))");
                Object a = this.f30625r.mo46760a(arrayList);
                Class<?> cls = this.f30611d;
                Method method = this.f30623p;
                C13938i.m21466c(cls, this.f30610c, method, a, newProxyInstance);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: e */
    public final void mo46737e() {
        Method b;
        if (!C13080a.m20762b(this)) {
            try {
                Class<?> a = C13938i.m21464a("com.android.billingclient.api.BillingClientStateListener");
                if (a != null && (b = C13938i.m21465b(this.f30611d, "startConnection", a)) != null) {
                    Object newProxyInstance = Proxy.newProxyInstance(a.getClassLoader(), new Class[]{a}, new C13927a());
                    C19383o.m32796f(newProxyInstance, "Proxy.newProxyInstance(\n…ntStateListenerWrapper())");
                    C13938i.m21466c(this.f30611d, this.f30610c, b, newProxyInstance);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
