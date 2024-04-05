package androidx.room;

import com.etsy.android.lib.useraction.C8873f;
import java.util.concurrent.Callable;
import p248tp.C8072t;
import p248tp.C8074v;

/* renamed from: androidx.room.e0 */
public final class C3228e0 implements C8074v<Object> {

    /* renamed from: b */
    public final /* synthetic */ Callable f7510b;

    public C3228e0(C8873f fVar) {
        this.f7510b = fVar;
    }

    /* renamed from: f */
    public final void mo11996f(C8072t<Object> tVar) throws Exception {
        try {
            tVar.onSuccess(this.f7510b.call());
        } catch (EmptyResultSetException e) {
            tVar.tryOnError(e);
        }
    }
}
