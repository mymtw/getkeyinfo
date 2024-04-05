package p145io.branch.referral;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.lang.reflect.Constructor;
import p145io.branch.referral.Branch;
import p145io.branch.referral.ServerRequest;

/* renamed from: io.branch.referral.l */
public final class C7050l {

    /* renamed from: i */
    public static C7050l f15681i;

    /* renamed from: a */
    public Object f15682a = null;

    /* renamed from: b */
    public final Handler f15683b;

    /* renamed from: c */
    public boolean f15684c = true;

    /* renamed from: d */
    public boolean f15685d = false;

    /* renamed from: e */
    public Class<?> f15686e;

    /* renamed from: f */
    public Class<?> f15687f;

    /* renamed from: g */
    public Class<?> f15688g;

    /* renamed from: h */
    public Class<?> f15689h;

    /* renamed from: io.branch.referral.l$a */
    public class C7051a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C7053c f15690b;

        public C7051a(C7053c cVar) {
            this.f15690b = cVar;
        }

        public final void run() {
            Branch.C7011a aVar = (Branch.C7011a) this.f15690b;
            Branch.this.f15580f.mo19390d(ServerRequest.PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
            Branch.this.mo19203t();
        }
    }

    /* renamed from: io.branch.referral.l$b */
    public abstract class C7052b implements ServiceConnection {
        public C7052b() {
        }

        /* renamed from: a */
        public abstract void mo19285a(Object obj);

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                C7050l lVar = C7050l.this;
                Constructor<?> declaredConstructor = lVar.f15686e.getDeclaredConstructor(new Class[]{lVar.f15689h, ComponentName.class});
                declaredConstructor.setAccessible(true);
                mo19285a(declaredConstructor.newInstance(new Object[]{Class.forName("android.support.customtabs.ICustomTabsService$Stub").getMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{iBinder}), componentName}));
            } catch (Exception unused) {
                mo19285a((Object) null);
            }
        }
    }

    /* renamed from: io.branch.referral.l$c */
    public interface C7053c {
    }

    public C7050l() {
        try {
            this.f15686e = Class.forName("android.support.customtabs.CustomTabsClient");
            this.f15687f = Class.forName("android.support.customtabs.CustomTabsCallback");
            this.f15688g = Class.forName("android.support.customtabs.CustomTabsSession");
            this.f15689h = Class.forName("android.support.customtabs.ICustomTabsService");
        } catch (Exception unused) {
            this.f15684c = false;
        }
        this.f15683b = new Handler();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00eb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri m13642a(java.lang.String r4, p145io.branch.referral.C7072q r5, p145io.branch.referral.C7077r r6, android.content.Context r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = "https://"
            java.lang.String r1 = "/_strong_match?os="
            java.lang.StringBuilder r4 = p003a2.C0023f.m111l(r0, r4, r1)
            android.content.Context r0 = r5.f15749b
            java.lang.String r0 = p145io.branch.referral.C7074q0.m13670c(r0)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "&"
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0073e.m211k(r4, r0)
            io.branch.referral.Defines$Jsonkey r1 = p145io.branch.referral.Defines$Jsonkey.HardwareID
            java.lang.String r1 = r1.getKey()
            r4.append(r1)
            java.lang.String r1 = "="
            r4.append(r1)
            io.branch.referral.q0$b r2 = r5.mo19309b()
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            io.branch.referral.q0$b r2 = r5.mo19309b()
            boolean r2 = r2.f15754b
            if (r2 == 0) goto L_0x0045
            io.branch.referral.Defines$Jsonkey r2 = p145io.branch.referral.Defines$Jsonkey.HardwareIDTypeVendor
            goto L_0x0047
        L_0x0045:
            io.branch.referral.Defines$Jsonkey r2 = p145io.branch.referral.Defines$Jsonkey.HardwareIDTypeRandom
        L_0x0047:
            java.lang.String r2 = r2.getKey()
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0073e.m211k(r4, r0)
            io.branch.referral.Defines$Jsonkey r3 = p145io.branch.referral.Defines$Jsonkey.HardwareIDType
            java.lang.String r3 = r3.getKey()
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            io.branch.referral.q$a r2 = r5.f15748a
            java.lang.String r2 = r2.f15750a
            if (r2 == 0) goto L_0x0085
            boolean r7 = p145io.branch.referral.C7058n.m13647a(r7)
            if (r7 != 0) goto L_0x0085
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0073e.m211k(r4, r0)
            io.branch.referral.Defines$Jsonkey r7 = p145io.branch.referral.Defines$Jsonkey.GoogleAdvertisingID
            java.lang.String r7 = r7.getKey()
            r4.append(r7)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L_0x0085:
            java.lang.String r7 = r6.mo19323m()
            java.lang.String r2 = "bnc_no_value"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L_0x00ac
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0073e.m211k(r4, r0)
            io.branch.referral.Defines$Jsonkey r7 = p145io.branch.referral.Defines$Jsonkey.RandomizedDeviceToken
            java.lang.String r7 = r7.getKey()
            r4.append(r7)
            r4.append(r1)
            java.lang.String r7 = r6.mo19323m()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
        L_0x00ac:
            java.lang.String r7 = r5.mo19308a()
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L_0x00d1
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0073e.m211k(r4, r0)
            io.branch.referral.Defines$Jsonkey r7 = p145io.branch.referral.Defines$Jsonkey.AppVersion
            java.lang.String r7 = r7.getKey()
            r4.append(r7)
            r4.append(r1)
            java.lang.String r5 = r5.mo19308a()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L_0x00d1:
            java.lang.String r5 = r6.mo19317f()
            if (r5 == 0) goto L_0x00e8
            boolean r7 = p145io.branch.referral.C7058n.f15709a
            if (r7 == 0) goto L_0x00de
            java.lang.String r7 = "key_test_"
            goto L_0x00e0
        L_0x00de:
            java.lang.String r7 = "key_"
        L_0x00e0:
            boolean r5 = r5.startsWith(r7)
            if (r5 == 0) goto L_0x00e8
            r5 = 1
            goto L_0x00e9
        L_0x00e8:
            r5 = 0
        L_0x00e9:
            if (r5 == 0) goto L_0x0106
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0073e.m211k(r4, r0)
            io.branch.referral.Defines$Jsonkey r5 = p145io.branch.referral.Defines$Jsonkey.BranchKey
            java.lang.String r5 = r5.getKey()
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = r6.mo19317f()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L_0x0106:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "&sdk=android"
            r5.append(r4)
            java.lang.String r4 = "5.2.2"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            goto L_0x0122
        L_0x0121:
            r4 = 0
        L_0x0122:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7050l.m13642a(java.lang.String, io.branch.referral.q, io.branch.referral.r, android.content.Context):android.net.Uri");
    }

    /* renamed from: b */
    public static void m13643b(C7053c cVar, boolean z) {
        if (cVar == null) {
            return;
        }
        if (z) {
            new Handler().postDelayed(new C7051a(cVar), (long) 750);
            return;
        }
        Branch.C7011a aVar = (Branch.C7011a) cVar;
        Branch.this.f15580f.mo19390d(ServerRequest.PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
        Branch.this.mo19203t();
    }
}
