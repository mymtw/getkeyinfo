package p025b5;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p036c5.C4426l;
import p150j4.C7109b;

/* renamed from: b5.a */
public final class C3476a implements C7109b {

    /* renamed from: b */
    public final int f8097b;

    /* renamed from: c */
    public final C7109b f8098c;

    public C3476a(int i, C7109b bVar) {
        this.f8097b = i;
        this.f8098c = bVar;
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        this.f8098c.mo12991b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f8097b).array());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3476a)) {
            return false;
        }
        C3476a aVar = (C3476a) obj;
        return this.f8097b == aVar.f8097b && this.f8098c.equals(aVar.f8098c);
    }

    public final int hashCode() {
        return C4426l.m10133g(this.f8097b, this.f8098c);
    }
}
