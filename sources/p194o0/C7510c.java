package p194o0;

import com.google.android.play.core.assetpacks.C15604g1;
import com.google.android.play.core.assetpacks.C15608h1;

/* renamed from: o0.c */
public final class C7510c implements C15604g1 {

    /* renamed from: b */
    public int f16754b;

    /* renamed from: c */
    public final Object f16755c;

    public /* synthetic */ C7510c() {
        this.f16755c = new Object[256];
    }

    public /* synthetic */ C7510c(C15608h1 h1Var, int i) {
        this.f16755c = h1Var;
        this.f16754b = i;
    }

    /* renamed from: a */
    public final boolean mo19998a(Object obj) {
        int i = this.f16754b;
        Object[] objArr = (Object[]) this.f16755c;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.f16754b = i + 1;
        return true;
    }

    public final Object zza() {
        ((C15608h1) this.f16755c).mo55411c(this.f16754b).f35123c.f35106d = 5;
        return null;
    }
}
