package p703wj;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.internal.location.zzak;

/* renamed from: wj.b */
public final class C18699b extends zzak {

    /* renamed from: a */
    public final BaseImplementation.ResultHolder<Status> f41452a;

    public C18699b(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f41452a = resultHolder;
    }

    public final void zza(zzad zzad) {
        this.f41452a.setResult(zzad.getStatus());
    }
}
