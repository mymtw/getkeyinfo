package p703wj;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzan;

/* renamed from: wj.l */
public final class C18709l extends zzan {

    /* renamed from: a */
    public BaseImplementation.ResultHolder<Status> f41462a;

    public C18709l(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f41462a = resultHolder;
    }

    public final void zza(int i, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
    }

    public final void zza(int i, String[] strArr) {
        if (this.f41462a == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
            return;
        }
        if ((i < 0 || i > 1) && (1000 > i || i > 1002)) {
            i = 1;
        }
        if (i == 1) {
            i = 13;
        }
        this.f41462a.setResult(new Status(i));
        this.f41462a = null;
    }

    public final void zzb(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
    }
}
