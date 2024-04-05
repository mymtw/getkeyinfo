package p517bn;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: bn.c0 */
public final /* synthetic */ class C14107c0 implements Callable {

    /* renamed from: b */
    public /* synthetic */ Context f31066b;

    /* renamed from: c */
    public /* synthetic */ ScheduledExecutorService f31067c;

    /* renamed from: d */
    public /* synthetic */ FirebaseMessaging f31068d;

    /* renamed from: e */
    public /* synthetic */ C14129t f31069e;

    /* renamed from: f */
    public /* synthetic */ C14125p f31070f;

    public /* synthetic */ C14107c0(Context context, FirebaseMessaging firebaseMessaging, C14125p pVar, C14129t tVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f31066b = context;
        this.f31067c = scheduledThreadPoolExecutor;
        this.f31068d = firebaseMessaging;
        this.f31069e = tVar;
        this.f31070f = pVar;
    }

    public final Object call() {
        C14105b0 b0Var;
        Context context = this.f31066b;
        ScheduledExecutorService scheduledExecutorService = this.f31067c;
        FirebaseMessaging firebaseMessaging = this.f31068d;
        C14129t tVar = this.f31069e;
        C14125p pVar = this.f31070f;
        synchronized (C14105b0.class) {
            WeakReference<C14105b0> weakReference = C14105b0.f31061b;
            b0Var = weakReference != null ? weakReference.get() : null;
            if (b0Var == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                C14105b0 b0Var2 = new C14105b0(sharedPreferences, scheduledExecutorService);
                synchronized (b0Var2) {
                    b0Var2.f31062a = C14134y.m21883a(sharedPreferences, scheduledExecutorService);
                }
                C14105b0.f31061b = new WeakReference<>(b0Var2);
                b0Var = b0Var2;
            }
        }
        return new C14109d0(firebaseMessaging, tVar, b0Var, pVar, context, scheduledExecutorService);
    }
}
