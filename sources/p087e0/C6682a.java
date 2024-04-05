package p087e0;

import android.content.Context;
import com.google.android.play.core.assetpacks.C15669w2;
import com.google.android.play.core.internal.C15686c0;
import java.util.ArrayList;
import p673sl.C18530j;

/* renamed from: e0.a */
public final class C6682a implements C15686c0 {

    /* renamed from: b */
    public final Object f14744b;

    public /* synthetic */ C6682a() {
        this.f14744b = new ArrayList();
    }

    public /* synthetic */ C6682a(C15669w2 w2Var) {
        this.f14744b = w2Var;
    }

    /* renamed from: a */
    public final float mo18836a(int i, int i2) {
        return ((C6685d[]) this.f14744b)[i].f14750b[i2].floatValue();
    }

    /* renamed from: b */
    public final C6685d mo18837b(int i) {
        return ((C6685d[]) this.f14744b)[i];
    }

    /* renamed from: c */
    public final void mo18838c(float f, int i, int i2) {
        ((C6685d[]) this.f14744b)[i].f14750b[i2] = Float.valueOf(f);
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new C18530j((Context) ((C15686c0) this.f14744b).zza());
    }

    public /* synthetic */ C6682a(int i, int i2) {
        C6685d[] dVarArr = new C6685d[i];
        for (int i3 = 0; i3 < i; i3++) {
            dVarArr[i3] = new C6685d(i2);
        }
        this.f14744b = dVarArr;
    }
}
