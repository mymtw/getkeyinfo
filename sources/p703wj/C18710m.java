package p703wj;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzan;

/* renamed from: wj.m */
public final class C18710m extends zzan {

    /* renamed from: a */
    public BaseImplementation.ResultHolder<Status> f41463a;

    public C18710m(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f41463a = resultHolder;
    }

    /* renamed from: a */
    public final void mo70198a(int i) {
        if (this.f41463a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
            return;
        }
        if ((i < 0 || i > 1) && (1000 > i || i > 1002)) {
            i = 1;
        }
        if (i == 1) {
            i = 13;
        }
        this.f41463a.setResult(new Status(i));
        this.f41463a = null;
    }

    public final void zza(int i, PendingIntent pendingIntent) {
        mo70198a(i);
    }

    public final void zza(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
    }

    public final void zzb(int i, String[] strArr) {
        mo70198a(i);
    }
}
