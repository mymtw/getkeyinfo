package p727zj;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.wallet.zzah;
import p605kk.C18124h;

/* renamed from: zj.b */
public final class C18933b extends zzah {

    /* renamed from: a */
    public final C18124h<Boolean> f42220a;

    public C18933b(C18124h<Boolean> hVar) {
        this.f42220a = hVar;
    }

    public final void zza(int i, boolean z, Bundle bundle) {
        TaskUtil.setResultOrApiException(new Status(i), Boolean.valueOf(z), this.f42220a);
    }

    public final void zza(Status status, boolean z, Bundle bundle) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), this.f42220a);
    }
}
