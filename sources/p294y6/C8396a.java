package p294y6;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import p223r5.C7749b0;
import p223r5.C7778y;

/* renamed from: y6.a */
public final class C8396a extends DHParameterSpec {

    /* renamed from: a */
    public final BigInteger f18407a;

    /* renamed from: b */
    public final BigInteger f18408b;

    /* renamed from: c */
    public final int f18409c;

    /* renamed from: d */
    public C7749b0 f18410d;

    public C8396a(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(bigInteger, bigInteger3, i2);
        this.f18407a = bigInteger2;
        this.f18408b = bigInteger4;
        this.f18409c = i;
    }

    public C8396a(C7778y yVar) {
        this(yVar.f17211e, yVar.f17212f, yVar.f17208b, yVar.f17209c, yVar.f17207a, yVar.f17210d);
        this.f18410d = yVar.f17213g;
    }

    /* renamed from: a */
    public final C7778y mo20974a() {
        return new C7778y(getP(), getG(), this.f18407a, this.f18409c, getL(), this.f18408b, this.f18410d);
    }
}
