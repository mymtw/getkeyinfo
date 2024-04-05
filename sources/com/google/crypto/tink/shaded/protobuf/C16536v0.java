package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v0 */
public final class C16536v0 implements C16495h0 {

    /* renamed from: a */
    public final C16503j0 f36706a;

    /* renamed from: b */
    public final String f36707b;

    /* renamed from: c */
    public final Object[] f36708c;

    /* renamed from: d */
    public final int f36709d;

    public C16536v0(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        this.f36706a = generatedMessageLite;
        this.f36707b = str;
        this.f36708c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f36709d = charAt;
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
                this.f36709d = c | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo58667a() {
        return (this.f36709d & 2) == 2;
    }

    /* renamed from: b */
    public final C16503j0 mo58668b() {
        return this.f36706a;
    }

    /* renamed from: c */
    public final ProtoSyntax mo58669c() {
        return (this.f36709d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    /* renamed from: d */
    public final Object[] mo58970d() {
        return this.f36708c;
    }

    /* renamed from: e */
    public final String mo58971e() {
        return this.f36707b;
    }
}
