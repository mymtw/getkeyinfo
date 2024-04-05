package p285x5;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;

/* renamed from: x5.d */
public final class C8325d extends C8005o1 {

    /* renamed from: b */
    public int f18275b = RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;

    /* renamed from: c */
    public C7999m1 f18276c;

    /* renamed from: d */
    public C7999m1 f18277d;

    /* renamed from: e */
    public C7999m1 f18278e;

    public C8325d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f18276c = new C7999m1(bigInteger);
        this.f18277d = new C7999m1(bigInteger2);
        this.f18278e = new C7999m1(bigInteger3);
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1((long) this.f18275b));
        iVar.mo55343b(this.f18276c);
        iVar.mo55343b(this.f18277d);
        iVar.mo55343b(this.f18278e);
        return new C7976f0(iVar);
    }
}
