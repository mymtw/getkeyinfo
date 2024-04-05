package p605kk;

import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

/* renamed from: kk.z */
public final class C18142z implements Executor {

    /* renamed from: b */
    public final zza f39607b = new zza(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f39607b.post(runnable);
    }
}
