package p004a3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.C3422l;
import p090e3.C6712a;
import p290y2.C8367b;

/* renamed from: a3.e */
public final class C0030e extends C0028d<C8367b> {

    /* renamed from: i */
    public static final String f67i = C3422l.m8214e("NetworkStateTracker");

    /* renamed from: g */
    public final ConnectivityManager f68g = ((ConnectivityManager) this.f61b.getSystemService("connectivity"));

    /* renamed from: h */
    public C0031a f69h = new C0031a();

    /* renamed from: a3.e$a */
    public class C0031a extends ConnectivityManager.NetworkCallback {
        public C0031a() {
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C3422l.m8213c().mo12926a(C0030e.f67i, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            C0030e eVar = C0030e.this;
            eVar.mo63b(eVar.mo65e());
        }

        public final void onLost(Network network) {
            C3422l.m8213c().mo12926a(C0030e.f67i, "Network connection lost", new Throwable[0]);
            C0030e eVar = C0030e.this;
            eVar.mo63b(eVar.mo65e());
        }
    }

    public C0030e(Context context, C6712a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public final Object mo57a() {
        return mo65e();
    }

    /* renamed from: c */
    public final void mo60c() {
        try {
            C3422l.m8213c().mo12926a(f67i, "Registering network callback", new Throwable[0]);
            this.f68g.registerDefaultNetworkCallback(this.f69h);
        } catch (IllegalArgumentException | SecurityException e) {
            C3422l.m8213c().mo12927b(f67i, "Received exception while registering network callback", e);
        }
    }

    /* renamed from: d */
    public final void mo61d() {
        try {
            C3422l.m8213c().mo12926a(f67i, "Unregistering network callback", new Throwable[0]);
            this.f68g.unregisterNetworkCallback(this.f69h);
        } catch (IllegalArgumentException | SecurityException e) {
            C3422l.m8213c().mo12927b(f67i, "Received exception while unregistering network callback", e);
        }
    }

    /* renamed from: e */
    public final C8367b mo65e() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.f68g.getActiveNetworkInfo();
        boolean z2 = true;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = this.f68g.getNetworkCapabilities(this.f68g.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                z = true;
                boolean isActiveNetworkMetered = this.f68g.isActiveNetworkMetered();
                if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
                    z2 = false;
                }
                return new C8367b(z3, z, isActiveNetworkMetered, z2);
            }
        } catch (SecurityException e) {
            C3422l.m8213c().mo12927b(f67i, "Unable to validate active network", e);
        }
        z = false;
        boolean isActiveNetworkMetered2 = this.f68g.isActiveNetworkMetered();
        z2 = false;
        return new C8367b(z3, z, isActiveNetworkMetered2, z2);
    }
}
