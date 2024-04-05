package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.x */
public class C16541x {

    /* renamed from: a */
    public volatile C16503j0 f36712a;

    /* renamed from: b */
    public volatile ByteString f36713b;

    static {
        C16511n.m27170a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.crypto.tink.shaded.protobuf.C16503j0 mo58981a(com.google.crypto.tink.shaded.protobuf.C16503j0 r2) {
        /*
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.j0 r0 = r1.f36712a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.j0 r0 = r1.f36712a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f36712a = r2     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            r1.f36713b = r0     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f36712a = r2     // Catch:{ all -> 0x001d }
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY     // Catch:{ all -> 0x001d }
            r1.f36713b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            com.google.crypto.tink.shaded.protobuf.j0 r2 = r1.f36712a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16541x.mo58981a(com.google.crypto.tink.shaded.protobuf.j0):com.google.crypto.tink.shaded.protobuf.j0");
    }

    /* renamed from: b */
    public final ByteString mo58982b() {
        if (this.f36713b != null) {
            return this.f36713b;
        }
        synchronized (this) {
            if (this.f36713b != null) {
                ByteString byteString = this.f36713b;
                return byteString;
            }
            if (this.f36712a == null) {
                this.f36713b = ByteString.EMPTY;
            } else {
                this.f36713b = this.f36712a.mo58604a();
            }
            ByteString byteString2 = this.f36713b;
            return byteString2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16541x)) {
            return false;
        }
        C16541x xVar = (C16541x) obj;
        C16503j0 j0Var = this.f36712a;
        C16503j0 j0Var2 = xVar.f36712a;
        return (j0Var == null && j0Var2 == null) ? mo58982b().equals(xVar.mo58982b()) : (j0Var == null || j0Var2 == null) ? j0Var != null ? j0Var.equals(xVar.mo58981a(j0Var.mo58525d())) : mo58981a(j0Var2.mo58525d()).equals(j0Var2) : j0Var.equals(j0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
