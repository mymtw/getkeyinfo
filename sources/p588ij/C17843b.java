package p588ij;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import p240t1.C7938a;

/* renamed from: ij.b */
public final class C17843b extends C7938a<Void> implements SignInConnectionListener {

    /* renamed from: j */
    public Semaphore f38757j = new Semaphore(0);

    /* renamed from: k */
    public Set<GoogleApiClient> f38758k;

    public C17843b(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.f38758k = set;
    }

    public final void onComplete() {
        this.f38757j.release();
    }
}
