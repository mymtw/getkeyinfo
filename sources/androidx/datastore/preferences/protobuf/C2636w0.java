package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.w0 */
public final class C2636w0 implements C2596i0 {

    /* renamed from: a */
    public final C2602k0 f5975a;

    /* renamed from: b */
    public final String f5976b;

    /* renamed from: c */
    public final Object[] f5977c;

    /* renamed from: d */
    public final int f5978d;

    public C2636w0(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        this.f5975a = generatedMessageLite;
        this.f5976b = str;
        this.f5977c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5978d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 1;
        int i2 = 13;
        while (true) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i2;
                i2 += 13;
                i = i3;
            } else {
                this.f5978d = c | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9617a() {
        return (this.f5978d & 2) == 2;
    }

    /* renamed from: b */
    public final C2602k0 mo9618b() {
        return this.f5975a;
    }

    /* renamed from: c */
    public final ProtoSyntax mo9619c() {
        return (this.f5978d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    /* renamed from: d */
    public final Object[] mo9910d() {
        return this.f5977c;
    }

    /* renamed from: e */
    public final String mo9911e() {
        return this.f5976b;
    }
}
