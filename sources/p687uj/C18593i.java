package p687uj;

import com.google.android.gms.internal.firebase_messaging.zzr;
import java.lang.annotation.Annotation;

/* renamed from: uj.i */
public final class C18593i implements C18596l {

    /* renamed from: a */
    public final int f41063a;

    /* renamed from: b */
    public final zzr f41064b;

    public C18593i(int i, zzr zzr) {
        this.f41063a = i;
        this.f41064b = zzr;
    }

    public final Class<? extends Annotation> annotationType() {
        return C18596l.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18596l)) {
            return false;
        }
        C18596l lVar = (C18596l) obj;
        return this.f41063a == ((C18593i) lVar).f41063a && this.f41064b.equals(((C18593i) lVar).f41064b);
    }

    public final int hashCode() {
        return (this.f41063a ^ 14552422) + (this.f41064b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f41063a + "intEncoding=" + this.f41064b + ')';
    }
}
