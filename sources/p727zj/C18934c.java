package p727zj;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.internal.wallet.zzah;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import p605kk.C18124h;

/* renamed from: zj.c */
public final class C18934c extends zzah {

    /* renamed from: a */
    public final C18124h<PaymentData> f42221a;

    public C18934c(C18124h<PaymentData> hVar) {
        this.f42221a = hVar;
    }

    public final void zza(Status status, PaymentData paymentData, Bundle bundle) {
        C18124h<PaymentData> hVar = this.f42221a;
        int i = AutoResolveHelper.f34051c;
        if (status.isSuccess()) {
            hVar.mo69678b(paymentData);
        } else {
            hVar.mo69677a(ApiExceptionUtil.fromStatus(status));
        }
    }
}
