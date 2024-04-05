package p004a3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C3422l;
import p090e3.C6712a;

/* renamed from: a3.c */
public abstract class C0026c<T> extends C0028d<T> {

    /* renamed from: h */
    public static final String f56h = C3422l.m8214e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    public final C0027a f57g = new C0027a();

    /* renamed from: a3.c$a */
    public class C0027a extends BroadcastReceiver {
        public C0027a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C0026c.this.mo59f(intent);
            }
        }
    }

    public C0026c(Context context, C6712a aVar) {
        super(context, aVar);
    }

    /* renamed from: c */
    public final void mo60c() {
        C3422l.m8213c().mo12926a(f56h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f61b.registerReceiver(this.f57g, mo58e());
    }

    /* renamed from: d */
    public final void mo61d() {
        C3422l.m8213c().mo12926a(f56h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f61b.unregisterReceiver(this.f57g);
    }

    /* renamed from: e */
    public abstract IntentFilter mo58e();

    /* renamed from: f */
    public abstract void mo59f(Intent intent);
}
