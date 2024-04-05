package p604kj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.p013v4.media.C0070b;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p193o.C7506i;
import p605kk.C18117a0;
import p605kk.C18124h;
import p679tj.C18557a;

/* renamed from: kj.a */
public final class C18096a {

    /* renamed from: h */
    public static int f39507h;

    /* renamed from: i */
    public static PendingIntent f39508i;

    /* renamed from: j */
    public static final Pattern f39509j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a */
    public final C7506i<String, C18124h<Bundle>> f39510a = new C7506i<>();

    /* renamed from: b */
    public final Context f39511b;

    /* renamed from: c */
    public final C18112q f39512c;

    /* renamed from: d */
    public final ScheduledThreadPoolExecutor f39513d;

    /* renamed from: e */
    public Messenger f39514e;

    /* renamed from: f */
    public Messenger f39515f;

    /* renamed from: g */
    public zzd f39516g;

    public C18096a(Context context) {
        this.f39511b = context;
        this.f39512c = new C18112q(context);
        this.f39514e = new Messenger(new C18097b(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f39513d = scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public final C18117a0 mo69627a(Bundle bundle) {
        String num;
        Class<C18096a> cls = C18096a.class;
        synchronized (cls) {
            int i = f39507h;
            f39507h = i + 1;
            num = Integer.toString(i);
        }
        C18124h hVar = new C18124h();
        synchronized (this.f39510a) {
            this.f39510a.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f39512c.mo69651a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f39511b;
        synchronized (cls) {
            if (f39508i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f39508i = PendingIntent.getBroadcast(context, 0, intent2, C18557a.f40867a);
            }
            intent.putExtra("app", f39508i);
        }
        intent.putExtra("kid", C0070b.m184f(new StringBuilder(String.valueOf(num).length() + 5), "|ID|", num, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(valueOf.length() + 8);
            sb.append("Sending ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        intent.putExtra("google.messenger", this.f39514e);
        if (!(this.f39515f == null && this.f39516g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f39515f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f39516g.zzb(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.f39566a.mo69655b(C18115t.f39559b, new C18113r(this, num, this.f39513d.schedule(new C18114s(hVar), 30, TimeUnit.SECONDS)));
            return hVar.f39566a;
        }
        if (this.f39512c.mo69651a() == 2) {
            this.f39511b.sendBroadcast(intent);
        } else {
            this.f39511b.startService(intent);
        }
        hVar.f39566a.mo69655b(C18115t.f39559b, new C18113r(this, num, this.f39513d.schedule(new C18114s(hVar), 30, TimeUnit.SECONDS)));
        return hVar.f39566a;
    }

    /* renamed from: b */
    public final void mo69628b(Bundle bundle, String str) {
        synchronized (this.f39510a) {
            C18124h remove = this.f39510a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.mo69678b(bundle);
        }
    }
}
