package p604kj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C14999i6;
import com.google.android.gms.measurement.internal.C15103u3;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: kj.e */
public final /* synthetic */ class C18100e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f39518b = 0;

    /* renamed from: c */
    public final /* synthetic */ boolean f39519c;

    /* renamed from: d */
    public final /* synthetic */ Object f39520d;

    /* renamed from: e */
    public final /* synthetic */ Parcelable f39521e;

    /* renamed from: f */
    public final /* synthetic */ Object f39522f;

    /* renamed from: g */
    public final /* synthetic */ Object f39523g;

    public /* synthetic */ C18100e(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f39520d = cloudMessagingReceiver;
        this.f39521e = intent;
        this.f39522f = context;
        this.f39519c = z;
        this.f39523g = pendingResult;
    }

    public final void run() {
        switch (this.f39518b) {
            case 0:
                ((CloudMessagingReceiver) this.f39520d).zza((Intent) this.f39521e, (Context) this.f39522f, this.f39519c, (BroadcastReceiver.PendingResult) this.f39523g);
                return;
            default:
                C14999i6 i6Var = (C14999i6) this.f39523g;
                zzeb zzeb = i6Var.f33574e;
                if (zzeb == null) {
                    ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52237a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                Preconditions.checkNotNull((zzp) this.f39520d);
                ((C14999i6) this.f39523g).mo52125k(zzeb, this.f39519c ? null : (zzab) this.f39521e, (zzp) this.f39520d);
                ((C14999i6) this.f39523g).mo52132r();
                return;
        }
    }

    public C18100e(C14999i6 i6Var, zzp zzp, boolean z, zzab zzab, zzab zzab2) {
        this.f39523g = i6Var;
        this.f39520d = zzp;
        this.f39519c = z;
        this.f39521e = zzab;
        this.f39522f = zzab2;
    }
}
