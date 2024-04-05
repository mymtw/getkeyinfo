package p701wh;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.UUID;
import p003a2.C0015b;
import p003a2.C0023f;
import p513bj.C14077r;

/* renamed from: wh.i */
public final class C18687i {

    /* renamed from: wh.i$a */
    public static class C18688a {

        /* renamed from: a */
        public final UUID f41390a;

        /* renamed from: b */
        public final int f41391b;

        /* renamed from: c */
        public final byte[] f41392c;

        public C18688a(UUID uuid, int i, byte[] bArr) {
            this.f41390a = uuid;
            this.f41391b = i;
            this.f41392c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m31541a(UUID uuid, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: b */
    public static C18688a m31542b(byte[] bArr) {
        C14077r rVar = new C14077r(bArr);
        if (rVar.f30988c < 32) {
            return null;
        }
        rVar.mo46935z(0);
        if (rVar.mo46912c() != (rVar.f30988c - rVar.f30987b) + 4 || rVar.mo46912c() != 1886614376) {
            return null;
        }
        int c = (rVar.mo46912c() >> 24) & 255;
        if (c > 1) {
            C0023f.m112m(37, "Unsupported pssh version: ", c, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(rVar.mo46919j(), rVar.mo46919j());
        if (c == 1) {
            rVar.mo46909A(rVar.mo46928s() * 16);
        }
        int s = rVar.mo46928s();
        if (s != rVar.f30988c - rVar.f30987b) {
            return null;
        }
        byte[] bArr2 = new byte[s];
        rVar.mo46911b(0, s, bArr2);
        return new C18688a(uuid, c, bArr2);
    }

    /* renamed from: c */
    public static byte[] m31543c(UUID uuid, byte[] bArr) {
        C18688a b = m31542b(bArr);
        if (b == null) {
            return null;
        }
        if (uuid.equals(b.f41390a)) {
            return b.f41392c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(b.f41390a);
        StringBuilder k = C0015b.m92k(valueOf2.length() + valueOf.length() + 33, "UUID mismatch. Expected: ", valueOf, ", got: ", valueOf2);
        k.append(".");
        Log.w("PsshAtomUtil", k.toString());
        return null;
    }
}
