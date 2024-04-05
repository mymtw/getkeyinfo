package p513bj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bj.o */
public final class C14071o {

    /* renamed from: e */
    public static C14071o f30975e;

    /* renamed from: a */
    public final Handler f30976a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<C14072a>> f30977b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Object f30978c = new Object();

    /* renamed from: d */
    public int f30979d = 0;

    /* renamed from: bj.o$a */
    public interface C14072a {
        /* renamed from: a */
        void mo46825a(int i);
    }

    /* renamed from: bj.o$b */
    public final class C14073b extends BroadcastReceiver {
        public C14073b() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x006b A[Catch:{ RuntimeException -> 0x0078 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x006f A[Catch:{ RuntimeException -> 0x0078 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceive(android.content.Context r10, android.content.Intent r11) {
            /*
                r9 = this;
                java.lang.String r11 = "connectivity"
                java.lang.Object r11 = r10.getSystemService(r11)
                android.net.ConnectivityManager r11 = (android.net.ConnectivityManager) r11
                r0 = 29
                r1 = 5
                r2 = 1
                r3 = 0
                if (r11 != 0) goto L_0x0010
                goto L_0x004e
            L_0x0010:
                android.net.NetworkInfo r11 = r11.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x004e }
                if (r11 == 0) goto L_0x004c
                boolean r4 = r11.isConnected()
                if (r4 != 0) goto L_0x001d
                goto L_0x004c
            L_0x001d:
                int r4 = r11.getType()
                r5 = 2
                r6 = 9
                r7 = 6
                r8 = 4
                if (r4 == 0) goto L_0x0037
                if (r4 == r2) goto L_0x004f
                if (r4 == r8) goto L_0x0037
                if (r4 == r1) goto L_0x0037
                if (r4 == r7) goto L_0x0046
                if (r4 == r6) goto L_0x0035
                r5 = 8
                goto L_0x004f
            L_0x0035:
                r5 = 7
                goto L_0x004f
            L_0x0037:
                int r11 = r11.getSubtype()
                switch(r11) {
                    case 1: goto L_0x004a;
                    case 2: goto L_0x004a;
                    case 3: goto L_0x0048;
                    case 4: goto L_0x0048;
                    case 5: goto L_0x0048;
                    case 6: goto L_0x0048;
                    case 7: goto L_0x0048;
                    case 8: goto L_0x0048;
                    case 9: goto L_0x0048;
                    case 10: goto L_0x0048;
                    case 11: goto L_0x0048;
                    case 12: goto L_0x0048;
                    case 13: goto L_0x0046;
                    case 14: goto L_0x0048;
                    case 15: goto L_0x0048;
                    case 16: goto L_0x003e;
                    case 17: goto L_0x0048;
                    case 18: goto L_0x004f;
                    case 19: goto L_0x003e;
                    case 20: goto L_0x0040;
                    default: goto L_0x003e;
                }
            L_0x003e:
                r5 = r7
                goto L_0x004f
            L_0x0040:
                int r11 = p513bj.C14049b0.f30913a
                if (r11 < r0) goto L_0x004e
                r5 = r6
                goto L_0x004f
            L_0x0046:
                r5 = r1
                goto L_0x004f
            L_0x0048:
                r5 = r8
                goto L_0x004f
            L_0x004a:
                r5 = 3
                goto L_0x004f
            L_0x004c:
                r5 = r2
                goto L_0x004f
            L_0x004e:
                r5 = r3
            L_0x004f:
                if (r5 != r1) goto L_0x0078
                int r11 = p513bj.C14049b0.f30913a
                if (r11 < r0) goto L_0x0078
                java.lang.String r0 = "phone"
                java.lang.Object r10 = r10.getSystemService(r0)     // Catch:{ RuntimeException -> 0x0078 }
                android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch:{ RuntimeException -> 0x0078 }
                r10.getClass()     // Catch:{ RuntimeException -> 0x0078 }
                bj.o$c r0 = new bj.o$c     // Catch:{ RuntimeException -> 0x0078 }
                bj.o r1 = p513bj.C14071o.this     // Catch:{ RuntimeException -> 0x0078 }
                r0.<init>()     // Catch:{ RuntimeException -> 0x0078 }
                r1 = 31
                if (r11 >= r1) goto L_0x006f
                r10.listen(r0, r2)     // Catch:{ RuntimeException -> 0x0078 }
                goto L_0x0074
            L_0x006f:
                r11 = 1048576(0x100000, float:1.469368E-39)
                r10.listen(r0, r11)     // Catch:{ RuntimeException -> 0x0078 }
            L_0x0074:
                r10.listen(r0, r3)     // Catch:{ RuntimeException -> 0x0078 }
                return
            L_0x0078:
                bj.o r10 = p513bj.C14071o.this
                p513bj.C14071o.m21687a(r10, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p513bj.C14071o.C14073b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: bj.o$c */
    public class C14074c extends PhoneStateListener {
        public C14074c() {
        }

        public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            C14071o.m21687a(C14071o.this, overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        public final void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            C14071o.m21687a(C14071o.this, serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    public C14071o(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C14073b(), intentFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (p513bj.C14071o.C14072a) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.mo46825a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.f30977b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f30977b.iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21687a(p513bj.C14071o r3, int r4) {
        /*
            java.lang.Object r0 = r3.f30978c
            monitor-enter(r0)
            int r1 = r3.f30979d     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            goto L_0x0030
        L_0x0009:
            r3.f30979d = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<bj.o$a>> r0 = r3.f30977b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            bj.o$a r2 = (p513bj.C14071o.C14072a) r2
            if (r2 == 0) goto L_0x002a
            r2.mo46825a(r4)
            goto L_0x0012
        L_0x002a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<bj.o$a>> r2 = r3.f30977b
            r2.remove(r1)
            goto L_0x0012
        L_0x0030:
            return
        L_0x0031:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p513bj.C14071o.m21687a(bj.o, int):void");
    }
}
