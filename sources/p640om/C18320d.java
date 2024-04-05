package p640om;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.icing.C14474a;
import com.google.android.gms.internal.icing.zzaa;
import com.google.android.gms.internal.icing.zzak;
import kotlin.reflect.C19421p;
import p605kk.C18124h;

/* renamed from: om.d */
public abstract class C18320d extends TaskApiCall<C14474a, Void> implements BaseImplementation.ResultHolder<Status> {

    /* renamed from: a */
    public C18124h<Void> f40217a;

    public C18320d() {
        super((Feature[]) null, false, 9004);
    }

    public final void doExecute(Api.AnyClient anyClient, C18124h hVar) throws RemoteException {
        this.f40217a = hVar;
        C18318b bVar = (C18318b) this;
        ((zzaa) ((C14474a) anyClient).getService()).zze(new zzak(bVar), bVar.f40216b);
    }

    public final void setFailedResult(Status status) {
        Preconditions.checkArgument(!status.isSuccess(), "Failed result must not be success.");
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        this.f40217a.mo69677a(C19421p.m32944l0(status, statusMessage));
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        Status status = (Status) obj;
        if (status.isSuccess()) {
            this.f40217a.mo69678b(null);
        } else {
            this.f40217a.mo69677a(C19421p.m32944l0(status, "User Action indexing error, please try again."));
        }
    }
}
