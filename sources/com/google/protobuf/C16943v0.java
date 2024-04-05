package com.google.protobuf;

/* renamed from: com.google.protobuf.v0 */
public final class C16943v0 implements C16899h0 {

    /* renamed from: a */
    public final C16906j0 f37305a;

    /* renamed from: b */
    public final String f37306b;

    /* renamed from: c */
    public final Object[] f37307c;

    /* renamed from: d */
    public final int f37308d;

    public C16943v0(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        this.f37305a = generatedMessageLite;
        this.f37306b = str;
        this.f37307c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f37308d = charAt;
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
                this.f37308d = c | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo59831a() {
        return (this.f37308d & 2) == 2;
    }

    /* renamed from: b */
    public final C16906j0 mo59832b() {
        return this.f37305a;
    }

    /* renamed from: c */
    public final ProtoSyntax mo59833c() {
        return (this.f37308d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    /* renamed from: d */
    public final Object[] mo60057d() {
        return this.f37307c;
    }

    /* renamed from: e */
    public final String mo60058e() {
        return this.f37306b;
    }
}
