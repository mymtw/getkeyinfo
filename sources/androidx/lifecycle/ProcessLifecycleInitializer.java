package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.C2883p;
import androidx.lifecycle.Lifecycle;
import java.util.Collections;
import java.util.List;
import p136i2.C6983a;
import p136i2.C6984b;

public final class ProcessLifecycleInitializer implements C6984b<C2887s> {
    /* renamed from: a */
    public final List<Class<? extends C6984b<?>>> mo10023a() {
        return Collections.emptyList();
    }

    public final Object create(Context context) {
        if (C6983a.m13524c(context).f15473b.contains(ProcessLifecycleInitializer.class)) {
            if (!C2883p.f6515a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2883p.C2884a());
            }
            C2851d0 d0Var = C2851d0.f6469j;
            d0Var.getClass();
            d0Var.f6474f = new Handler();
            d0Var.f6475g.mo10837f(Lifecycle.Event.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2855e0(d0Var));
            return d0Var;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
