package p604kj;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* renamed from: kj.m */
public final class C18108m extends C18109n<Void> {
    public C18108m(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* renamed from: a */
    public final void mo69645a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo69648d((Bundle) null);
        } else {
            mo69647c(new zzq(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* renamed from: b */
    public final boolean mo69646b() {
        return true;
    }
}
