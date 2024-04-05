package com.google.common.hash;

import com.google.common.base.C15794l;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

@Immutable
final class ChecksumHashFunction extends C16268b implements Serializable {
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public final int bits;
    private final C16273g<? extends Checksum> checksumSupplier;
    private final String toString;

    /* renamed from: com.google.common.hash.ChecksumHashFunction$a */
    public final class C16250a extends C16267a {

        /* renamed from: b */
        public final Checksum f36341b;

        public C16250a(Checksum checksum) {
            checksum.getClass();
            this.f36341b = checksum;
        }

        /* renamed from: f */
        public final HashCode mo57800f() {
            long value = this.f36341b.getValue();
            return ChecksumHashFunction.this.bits == 32 ? HashCode.fromInt((int) value) : HashCode.fromLong(value);
        }

        /* renamed from: k */
        public final void mo57801k(byte b) {
            this.f36341b.update(b);
        }

        /* renamed from: m */
        public final void mo57802m(int i, int i2, byte[] bArr) {
            this.f36341b.update(bArr, i, i2);
        }
    }

    public ChecksumHashFunction(C16273g<? extends Checksum> gVar, int i, String str) {
        gVar.getClass();
        this.checksumSupplier = gVar;
        C15794l.m25609c(i, "bits (%s) must be either 32 or 64", i == 32 || i == 64);
        this.bits = i;
        str.getClass();
        this.toString = str;
    }

    public int bits() {
        return this.bits;
    }

    public C16272f newHasher() {
        return new C16250a((Checksum) this.checksumSupplier.get());
    }

    public String toString() {
        return this.toString;
    }
}
