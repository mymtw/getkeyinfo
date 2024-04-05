package p365hg;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import com.paypal.openid.AuthorizationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p401mg.C13080a;
import p453tf.C13418j;
import p568fn.C17782b;

/* renamed from: hg.e0 */
public final class C12851e0 {

    /* renamed from: a */
    public static final String f28342a = C12851e0.class.getName();

    /* renamed from: b */
    public static final ArrayList f28343b;

    /* renamed from: c */
    public static final AtomicBoolean f28344c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final Integer[] f28345d = {20210906, 20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101};

    /* renamed from: e */
    public static final C12851e0 f28346e;

    /* renamed from: hg.e0$a */
    public static final class C12852a extends C12857f {
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ String mo45633b() {
            return null;
        }

        /* renamed from: c */
        public final String mo45634c() {
            return "com.facebook.arstudio.player";
        }
    }

    /* renamed from: hg.e0$b */
    public static final class C12853b extends C12857f {
        /* renamed from: b */
        public final String mo45633b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        /* renamed from: c */
        public final String mo45634c() {
            return "com.facebook.lite";
        }
    }

    /* renamed from: hg.e0$c */
    public static final class C12854c extends C12857f {
        /* renamed from: b */
        public final String mo45633b() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        /* renamed from: c */
        public final String mo45634c() {
            return "com.instagram.android";
        }

        /* renamed from: d */
        public final String mo45635d() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* renamed from: hg.e0$d */
    public static final class C12855d extends C12857f {
        /* renamed from: b */
        public final String mo45633b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* renamed from: c */
        public final String mo45634c() {
            return "com.facebook.katana";
        }

        /* renamed from: e */
        public final void mo45636e() {
            if (C13418j.m21106b().getApplicationInfo().targetSdkVersion >= 30) {
                String str = C12851e0.f28342a;
                Class<C12851e0> cls = C12851e0.class;
                String str2 = null;
                if (!C13080a.m20762b(cls)) {
                    try {
                        str2 = C12851e0.f28342a;
                    } catch (Throwable th) {
                        C13080a.m20761a(cls, th);
                    }
                }
                Log.w(str2, "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* renamed from: hg.e0$e */
    public static final class C12856e extends C12857f {
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ String mo45633b() {
            return null;
        }

        /* renamed from: c */
        public final String mo45634c() {
            return "com.facebook.orca";
        }
    }

    /* renamed from: hg.e0$f */
    public static abstract class C12857f {

        /* renamed from: a */
        public TreeSet<Integer> f28347a;

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
            if (r4.isEmpty() == false) goto L_0x0026;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0036 A[Catch:{ all -> 0x0020 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo45637a(boolean r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                if (r4 != 0) goto L_0x000f
                java.util.TreeSet<java.lang.Integer> r4 = r3.f28347a     // Catch:{ all -> 0x003b }
                if (r4 == 0) goto L_0x000f
                if (r4 == 0) goto L_0x000f
                boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x003b }
                if (r4 == 0) goto L_0x0026
            L_0x000f:
                hg.e0 r4 = p365hg.C12851e0.f28346e     // Catch:{ all -> 0x003b }
                java.lang.Class<hg.e0> r0 = p365hg.C12851e0.class
                boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x003b }
                r2 = 0
                if (r1 == 0) goto L_0x001b
                goto L_0x0024
            L_0x001b:
                java.util.TreeSet r2 = r4.mo45631f(r3)     // Catch:{ all -> 0x0020 }
                goto L_0x0024
            L_0x0020:
                r4 = move-exception
                p401mg.C13080a.m20761a(r0, r4)     // Catch:{ all -> 0x003b }
            L_0x0024:
                r3.f28347a = r2     // Catch:{ all -> 0x003b }
            L_0x0026:
                java.util.TreeSet<java.lang.Integer> r4 = r3.f28347a     // Catch:{ all -> 0x003b }
                if (r4 == 0) goto L_0x0033
                boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x003b }
                if (r4 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r4 = 0
                goto L_0x0034
            L_0x0033:
                r4 = 1
            L_0x0034:
                if (r4 == 0) goto L_0x0039
                r3.mo45636e()     // Catch:{ all -> 0x003b }
            L_0x0039:
                monitor-exit(r3)
                return
            L_0x003b:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p365hg.C12851e0.C12857f.mo45637a(boolean):void");
        }

        /* renamed from: b */
        public abstract String mo45633b();

        /* renamed from: c */
        public abstract String mo45634c();

        /* renamed from: d */
        public String mo45635d() {
            return "id_token,token,signed_request,graph_domain";
        }

        /* renamed from: e */
        public void mo45636e() {
        }
    }

    /* renamed from: hg.e0$g */
    public static final class C12858g {

        /* renamed from: a */
        public int f28348a;
    }

    /* renamed from: hg.e0$h */
    public static final class C12859h extends C12857f {
        /* renamed from: b */
        public final String mo45633b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* renamed from: c */
        public final String mo45634c() {
            return "com.facebook.wakizashi";
        }
    }

    /* renamed from: hg.e0$i */
    public static final class C12860i implements Runnable {

        /* renamed from: b */
        public static final C12860i f28349b = new C12860i();

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            p401mg.C13080a.m20761a(r0, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            p401mg.C13080a.m20761a(r0, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x005b, code lost:
            p401mg.C13080a.m20761a(r6, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:17:0x0031, B:20:0x003a, B:30:0x004f] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[Catch:{ all -> 0x0017, all -> 0x0045 }, LOOP:0: B:14:0x0020->B:16:0x0026, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[SYNTHETIC, Splitter:B:20:0x003a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                java.lang.Class<hg.e0> r0 = p365hg.C12851e0.class
                boolean r1 = p401mg.C13080a.m20762b(r6)
                if (r1 == 0) goto L_0x0009
                return
            L_0x0009:
                r1 = 0
                r2 = 0
                java.lang.String r3 = p365hg.C12851e0.f28342a     // Catch:{ all -> 0x0045 }
                boolean r3 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x0045 }
                if (r3 == 0) goto L_0x0014
                goto L_0x001b
            L_0x0014:
                java.util.ArrayList r3 = p365hg.C12851e0.f28343b     // Catch:{ all -> 0x0017 }
                goto L_0x001c
            L_0x0017:
                r3 = move-exception
                p401mg.C13080a.m20761a(r0, r3)     // Catch:{ all -> 0x0045 }
            L_0x001b:
                r3 = r2
            L_0x001c:
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0045 }
            L_0x0020:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0045 }
                if (r4 == 0) goto L_0x0031
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0045 }
                hg.e0$f r4 = (p365hg.C12851e0.C12857f) r4     // Catch:{ all -> 0x0045 }
                r5 = 1
                r4.mo45637a(r5)     // Catch:{ all -> 0x0045 }
                goto L_0x0020
            L_0x0031:
                java.lang.String r3 = p365hg.C12851e0.f28342a     // Catch:{ all -> 0x005a }
                boolean r3 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x005a }
                if (r3 == 0) goto L_0x003a
                goto L_0x0041
            L_0x003a:
                java.util.concurrent.atomic.AtomicBoolean r2 = p365hg.C12851e0.f28344c     // Catch:{ all -> 0x003d }
                goto L_0x0041
            L_0x003d:
                r3 = move-exception
                p401mg.C13080a.m20761a(r0, r3)     // Catch:{ all -> 0x005a }
            L_0x0041:
                r2.set(r1)     // Catch:{ all -> 0x005a }
                return
            L_0x0045:
                r3 = move-exception
                java.lang.String r4 = p365hg.C12851e0.f28342a     // Catch:{ all -> 0x005a }
                boolean r4 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x005a }
                if (r4 == 0) goto L_0x004f
                goto L_0x0056
            L_0x004f:
                java.util.concurrent.atomic.AtomicBoolean r2 = p365hg.C12851e0.f28344c     // Catch:{ all -> 0x0052 }
                goto L_0x0056
            L_0x0052:
                r4 = move-exception
                p401mg.C13080a.m20761a(r0, r4)     // Catch:{ all -> 0x005a }
            L_0x0056:
                r2.set(r1)     // Catch:{ all -> 0x005a }
                throw r3     // Catch:{ all -> 0x005a }
            L_0x005a:
                r0 = move-exception
                p401mg.C13080a.m20761a(r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p365hg.C12851e0.C12860i.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003f A[SYNTHETIC, Splitter:B:9:0x003f] */
    static {
        /*
            hg.e0 r0 = new hg.e0
            r0.<init>()
            f28346e = r0
            java.lang.Class<hg.e0> r1 = p365hg.C12851e0.class
            java.lang.String r1 = r1.getName()
            f28342a = r1
            java.util.ArrayList r1 = r0.mo45629a()
            f28343b = r1
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001e
            goto L_0x0037
        L_0x001e:
            hg.e0$f[] r1 = new p365hg.C12851e0.C12857f[r2]     // Catch:{ all -> 0x0033 }
            hg.e0$a r4 = new hg.e0$a     // Catch:{ all -> 0x0033 }
            r4.<init>()     // Catch:{ all -> 0x0033 }
            r1[r3] = r4     // Catch:{ all -> 0x0033 }
            java.util.ArrayList r1 = p568fn.C17782b.m29888u(r1)     // Catch:{ all -> 0x0033 }
            java.util.ArrayList r4 = r0.mo45629a()     // Catch:{ all -> 0x0033 }
            r1.addAll(r4)     // Catch:{ all -> 0x0033 }
            goto L_0x0038
        L_0x0033:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)
        L_0x0037:
            r1 = 0
        L_0x0038:
            boolean r4 = p401mg.C13080a.m20762b(r0)
            if (r4 == 0) goto L_0x003f
            goto L_0x0080
        L_0x003f:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x007c }
            r4.<init>()     // Catch:{ all -> 0x007c }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x007c }
            r5.<init>()     // Catch:{ all -> 0x007c }
            hg.e0$e r6 = new hg.e0$e     // Catch:{ all -> 0x007c }
            r6.<init>()     // Catch:{ all -> 0x007c }
            r5.add(r6)     // Catch:{ all -> 0x007c }
            java.lang.String r6 = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"
            java.util.ArrayList r7 = f28343b     // Catch:{ all -> 0x007c }
            r4.put(r6, r7)     // Catch:{ all -> 0x007c }
            java.lang.String r6 = "com.facebook.platform.action.request.FEED_DIALOG"
            r4.put(r6, r7)     // Catch:{ all -> 0x007c }
            java.lang.String r6 = "com.facebook.platform.action.request.LIKE_DIALOG"
            r4.put(r6, r7)     // Catch:{ all -> 0x007c }
            java.lang.String r6 = "com.facebook.platform.action.request.APPINVITES_DIALOG"
            r4.put(r6, r7)     // Catch:{ all -> 0x007c }
            java.lang.String r6 = "com.facebook.platform.action.request.MESSAGE_DIALOG"
            r4.put(r6, r5)     // Catch:{ all -> 0x007c }
            java.lang.String r6 = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"
            r4.put(r6, r5)     // Catch:{ all -> 0x007c }
            java.lang.String r5 = "com.facebook.platform.action.request.CAMERA_EFFECT"
            r4.put(r5, r1)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "com.facebook.platform.action.request.SHARE_STORY"
            r4.put(r1, r7)     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)
        L_0x0080:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            f28344c = r0
            r0 = 14
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 20210906(0x13464da, float:3.3133136E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r3] = r1
            r1 = 20170417(0x133c6b1, float:3.3019662E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            r1 = 2
            r2 = 20160327(0x1339f47, float:3.2991384E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 3
            r2 = 20141218(0x13354a2, float:3.293783E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 4
            r2 = 20141107(0x1335433, float:3.2937518E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 5
            r2 = 20141028(0x13353e4, float:3.2937296E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 6
            r2 = 20141001(0x13353c9, float:3.293722E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 7
            r2 = 20140701(0x133529d, float:3.293638E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 8
            r2 = 20140324(0x1335124, float:3.2935323E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 9
            r2 = 20140204(0x13350ac, float:3.2934987E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 10
            r2 = 20131107(0x1332d23, float:3.2909492E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 11
            r2 = 20130618(0x1332b3a, float:3.290812E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 12
            r2 = 20130502(0x1332ac6, float:3.2907796E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 13
            r2 = 20121101(0x133060d, float:3.288145E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            f28345d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12851e0.<clinit>():void");
    }

    /* renamed from: b */
    public static final int m20504b(TreeSet<Integer> treeSet, int i, int[] iArr) {
        Class<C12851e0> cls = C12851e0.class;
        if (C13080a.m20762b(cls)) {
            return 0;
        }
        if (treeSet == null) {
            return -1;
        }
        try {
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i2 = -1;
            while (descendingIterator.hasNext()) {
                Integer next = descendingIterator.next();
                C19383o.m32796f(next, "fbAppVersion");
                i2 = Math.max(i2, next.intValue());
                while (length >= 0 && iArr[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == next.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i2, i);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Intent m20505d(android.content.Context r6) {
        /*
            java.lang.Class<hg.e0> r0 = p365hg.C12851e0.class
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r6, r1)     // Catch:{ all -> 0x0064 }
            java.util.ArrayList r1 = f28343b     // Catch:{ all -> 0x0064 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0064 }
        L_0x0015:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0064 }
            if (r3 == 0) goto L_0x0063
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0064 }
            hg.e0$f r3 = (p365hg.C12851e0.C12857f) r3     // Catch:{ all -> 0x0064 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x0064 }
            java.lang.String r5 = "com.facebook.platform.PLATFORM_SERVICE"
            r4.<init>(r5)     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = r3.mo45634c()     // Catch:{ all -> 0x0064 }
            android.content.Intent r3 = r4.setPackage(r3)     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "android.intent.category.DEFAULT"
            android.content.Intent r3 = r3.addCategory(r4)     // Catch:{ all -> 0x0064 }
            boolean r4 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x003d
            goto L_0x005f
        L_0x003d:
            if (r3 != 0) goto L_0x0040
            goto L_0x005f
        L_0x0040:
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch:{ all -> 0x005b }
            r5 = 0
            android.content.pm.ResolveInfo r4 = r4.resolveService(r3, r5)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x005f
            android.content.pm.ServiceInfo r4 = r4.serviceInfo     // Catch:{ all -> 0x005b }
            java.lang.String r4 = r4.packageName     // Catch:{ all -> 0x005b }
            java.lang.String r5 = "resolveInfo.serviceInfo.packageName"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)     // Catch:{ all -> 0x005b }
            boolean r4 = p365hg.C12866h.m20543a(r6, r4)     // Catch:{ all -> 0x005b }
            if (r4 != 0) goto L_0x0060
            goto L_0x005f
        L_0x005b:
            r3 = move-exception
            p401mg.C13080a.m20761a(r0, r3)     // Catch:{ all -> 0x0064 }
        L_0x005f:
            r3 = r2
        L_0x0060:
            if (r3 == 0) goto L_0x0015
            return r3
        L_0x0063:
            return r2
        L_0x0064:
            r6 = move-exception
            p401mg.C13080a.m20761a(r0, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12851e0.m20505d(android.content.Context):android.content.Intent");
    }

    /* renamed from: e */
    public static final Intent m20506e(Intent intent, Bundle bundle, FacebookException facebookException) {
        Bundle bundle2;
        Class<C12851e0> cls = C12851e0.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            UUID g = m20507g(intent);
            if (g == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m20510k(intent));
            Bundle bundle3 = new Bundle();
            bundle3.putString("action_id", g.toString());
            if (facebookException != null) {
                if (!C13080a.m20762b(cls)) {
                    bundle2 = new Bundle();
                    bundle2.putString(AuthorizationException.PARAM_ERROR_DESCRIPTION, facebookException.toString());
                    if (facebookException instanceof FacebookOperationCanceledException) {
                        bundle2.putString("error_type", "UserCanceled");
                    }
                    bundle3.putBundle("error", bundle2);
                }
                bundle2 = null;
                bundle3.putBundle("error", bundle2);
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle3);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: g */
    public static final UUID m20507g(Intent intent) {
        String str;
        Class<C12851e0> cls = C12851e0.class;
        if (C13080a.m20762b(cls) || intent == null) {
            return null;
        }
        try {
            if (m20511l(m20510k(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (str == null) {
                return null;
            }
            try {
                return UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: h */
    public static final FacebookException m20508h(Bundle bundle) {
        Class<C12851e0> cls = C12851e0.class;
        if (C13080a.m20762b(cls) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString(AuthorizationException.PARAM_ERROR_DESCRIPTION);
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !C19457k.m33019W0(string, "UserCanceled", true)) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: j */
    public static final Bundle m20509j(Intent intent) {
        Class<C12851e0> cls = C12851e0.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return !m20511l(m20510k(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: k */
    public static final int m20510k(Intent intent) {
        Class<C12851e0> cls = C12851e0.class;
        if (C13080a.m20762b(cls)) {
            return 0;
        }
        try {
            C19383o.m32797g(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return 0;
        }
    }

    /* renamed from: l */
    public static final boolean m20511l(int i) {
        Class<C12851e0> cls = C12851e0.class;
        if (C13080a.m20762b(cls)) {
            return false;
        }
        try {
            Integer[] numArr = f28345d;
            Integer valueOf = Integer.valueOf(i);
            C19383o.m32797g(numArr, "<this>");
            return (C19318k.m32615g1(numArr, valueOf) >= 0) && i >= 20140701;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return false;
        }
    }

    /* renamed from: m */
    public static final void m20512m() {
        Class<C12851e0> cls = C12851e0.class;
        if (!C13080a.m20762b(cls)) {
            try {
                if (f28344c.compareAndSet(false, true)) {
                    C13418j.m21108d().execute(C12860i.f28349b);
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: n */
    public static final Intent m20513n(FragmentActivity fragmentActivity, Intent intent) {
        Class<C12851e0> cls = C12851e0.class;
        if (C13080a.m20762b(cls) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveActivity = fragmentActivity.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null) {
                return null;
            }
            String str = resolveActivity.activityInfo.packageName;
            C19383o.m32796f(str, "resolveInfo.activityInfo.packageName");
            if (!C12866h.m20543a(fragmentActivity, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: a */
    public final ArrayList mo45629a() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            return C17782b.m29888u(new C12855d(), new C12859h());
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: c */
    public final Intent mo45630c(C12857f fVar, String str, Set set, String str2, boolean z, DefaultAudience defaultAudience, String str3, String str4, boolean z2, String str5, boolean z3, LoginTargetApp loginTargetApp, boolean z4, boolean z5, String str6) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            String b = fVar.mo45633b();
            if (b == null) {
                return null;
            }
            String str7 = str;
            Intent putExtra = new Intent().setClassName(fVar.mo45634c(), b).putExtra("client_id", str);
            C19383o.m32796f(putExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
            String str8 = C13418j.f29381a;
            putExtra.putExtra("facebook_sdk_version", "12.3.0");
            int i = C12869i0.f28368a;
            if (!(set.isEmpty())) {
                Set set2 = set;
                putExtra.putExtra("scope", TextUtils.join(",", set));
            }
            if (!C12869i0.m20546B(str2)) {
                String str9 = str2;
                putExtra.putExtra("e2e", str2);
            }
            String str10 = str3;
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", fVar.mo45635d());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z) {
                putExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
            }
            putExtra.putExtra("legacy_override", C13418j.m21109e());
            String str11 = str4;
            putExtra.putExtra("auth_type", str4);
            if (z2) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z3);
            if (z4) {
                putExtra.putExtra("fx_app", loginTargetApp.toString());
            }
            if (z5) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0083 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097 A[LOOP:0: B:34:0x0097->B:37:0x009d, LOOP_START, SYNTHETIC, Splitter:B:34:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b5 A[SYNTHETIC, Splitter:B:42:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bd A[Catch:{ all -> 0x004a, all -> 0x00c1 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.TreeSet<java.lang.Integer> mo45631f(p365hg.C12851e0.C12857f r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = p401mg.C13080a.m20762b(r12)
            r3 = 0
            if (r2 == 0) goto L_0x000c
            return r3
        L_0x000c:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch:{ all -> 0x00c1 }
            r2.<init>()     // Catch:{ all -> 0x00c1 }
            android.content.Context r4 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x00c1 }
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch:{ all -> 0x00c1 }
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch:{ all -> 0x00c1 }
            boolean r4 = p401mg.C13080a.m20762b(r12)     // Catch:{ all -> 0x00c1 }
            if (r4 == 0) goto L_0x0025
        L_0x0023:
            r6 = r3
            goto L_0x004f
        L_0x0025:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r4.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "content://"
            r4.append(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = r13.mo45634c()     // Catch:{ all -> 0x004a }
            r4.append(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = ".provider.PlatformProvider/versions"
            r4.append(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x004a }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "Uri.parse(CONTENT_SCHEME…ATFORM_PROVIDER_VERSIONS)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)     // Catch:{ all -> 0x004a }
            r6 = r4
            goto L_0x004f
        L_0x004a:
            r4 = move-exception
            p401mg.C13080a.m20761a(r12, r4)     // Catch:{ all -> 0x00c1 }
            goto L_0x0023
        L_0x004f:
            android.content.Context r4 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x00b9 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r8.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r13 = r13.mo45634c()     // Catch:{ all -> 0x00b9 }
            r8.append(r13)     // Catch:{ all -> 0x00b9 }
            java.lang.String r13 = ".provider.PlatformProvider"
            r8.append(r13)     // Catch:{ all -> 0x00b9 }
            java.lang.String r13 = r8.toString()     // Catch:{ all -> 0x00b9 }
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch:{ RuntimeException -> 0x0072 }
            goto L_0x0079
        L_0x0072:
            r13 = move-exception
            java.lang.String r4 = f28342a     // Catch:{ all -> 0x00b9 }
            android.util.Log.e(r4, r1, r13)     // Catch:{ all -> 0x00b9 }
            r13 = r3
        L_0x0079:
            if (r13 == 0) goto L_0x00b2
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ NullPointerException -> 0x008f, SecurityException -> 0x0089, IllegalArgumentException -> 0x0083 }
            goto L_0x0095
        L_0x0083:
            java.lang.String r13 = f28342a     // Catch:{ all -> 0x00b9 }
            android.util.Log.e(r13, r1)     // Catch:{ all -> 0x00b9 }
            goto L_0x0094
        L_0x0089:
            java.lang.String r13 = f28342a     // Catch:{ all -> 0x00b9 }
            android.util.Log.e(r13, r1)     // Catch:{ all -> 0x00b9 }
            goto L_0x0094
        L_0x008f:
            java.lang.String r13 = f28342a     // Catch:{ all -> 0x00b9 }
            android.util.Log.e(r13, r1)     // Catch:{ all -> 0x00b9 }
        L_0x0094:
            r13 = r3
        L_0x0095:
            if (r13 == 0) goto L_0x00b3
        L_0x0097:
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x00b3
            int r1 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x00ad }
            int r1 = r13.getInt(r1)     // Catch:{ all -> 0x00ad }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00ad }
            r2.add(r1)     // Catch:{ all -> 0x00ad }
            goto L_0x0097
        L_0x00ad:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L_0x00bb
        L_0x00b2:
            r13 = r3
        L_0x00b3:
            if (r13 == 0) goto L_0x00b8
            r13.close()     // Catch:{ all -> 0x00c1 }
        L_0x00b8:
            return r2
        L_0x00b9:
            r13 = move-exception
            r0 = r3
        L_0x00bb:
            if (r0 == 0) goto L_0x00c0
            r0.close()     // Catch:{ all -> 0x00c1 }
        L_0x00c0:
            throw r13     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r13 = move-exception
            p401mg.C13080a.m20761a(r12, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12851e0.mo45631f(hg.e0$f):java.util.TreeSet");
    }

    /* renamed from: i */
    public final C12858g mo45632i(ArrayList arrayList, int[] iArr) {
        Class<C12851e0> cls;
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            m20512m();
            if (arrayList == null) {
                C12858g gVar = new C12858g();
                gVar.f28348a = -1;
                return gVar;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C12857f fVar = (C12857f) it.next();
                TreeSet<Integer> treeSet = fVar.f28347a;
                int i = 0;
                if (treeSet == null || treeSet.isEmpty()) {
                    fVar.mo45637a(false);
                }
                TreeSet<Integer> treeSet2 = fVar.f28347a;
                cls = C12851e0.class;
                if (!C13080a.m20762b(cls)) {
                    i = f28345d[0].intValue();
                }
                int b = m20504b(treeSet2, i, iArr);
                if (b != -1) {
                    C12858g gVar2 = new C12858g();
                    gVar2.f28348a = b;
                    return gVar2;
                }
            }
            C12858g gVar3 = new C12858g();
            gVar3.f28348a = -1;
            return gVar3;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }
}
