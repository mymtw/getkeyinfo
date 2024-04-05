package p604kj;

import android.os.Bundle;
import android.support.p013v4.media.C0073e;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import p605kk.C18124h;

/* renamed from: kj.n */
public abstract class C18109n<T> {

    /* renamed from: a */
    public final int f39543a;

    /* renamed from: b */
    public final C18124h<T> f39544b = new C18124h<>();

    /* renamed from: c */
    public final int f39545c;

    /* renamed from: d */
    public final Bundle f39546d;

    public C18109n(int i, int i2, Bundle bundle) {
        this.f39543a = i;
        this.f39545c = i2;
        this.f39546d = bundle;
    }

    /* renamed from: a */
    public abstract void mo69645a(Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo69646b();

    /* renamed from: c */
    public final void mo69647c(zzq zzq) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzq);
            Log.d("MessengerIpcClient", C0073e.m210j(new StringBuilder(valueOf.length() + 14 + valueOf2.length()), "Failing ", valueOf, " with ", valueOf2));
        }
        this.f39544b.mo69677a(zzq);
    }

    /* renamed from: d */
    public final void mo69648d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle);
            Log.d("MessengerIpcClient", C0073e.m210j(new StringBuilder(valueOf.length() + 16 + valueOf2.length()), "Finishing ", valueOf, " with ", valueOf2));
        }
        this.f39544b.mo69678b(bundle);
    }

    public final String toString() {
        int i = this.f39545c;
        int i2 = this.f39543a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo69646b());
        sb.append("}");
        return sb.toString();
    }
}
