package com.google.protobuf;

/* renamed from: com.google.protobuf.x */
public class C16948x {

    /* renamed from: a */
    public volatile C16906j0 f37311a;

    /* renamed from: b */
    public volatile ByteString f37312b;

    static {
        C16915n.m28337a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.protobuf.C16906j0 mo60068a(com.google.protobuf.C16906j0 r2) {
        /*
            r1 = this;
            com.google.protobuf.j0 r0 = r1.f37311a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            com.google.protobuf.j0 r0 = r1.f37311a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f37311a = r2     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            r1.f37312b = r0     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f37311a = r2     // Catch:{ all -> 0x001d }
            com.google.protobuf.ByteString r2 = com.google.protobuf.ByteString.EMPTY     // Catch:{ all -> 0x001d }
            r1.f37312b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            com.google.protobuf.j0 r2 = r1.f37311a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16948x.mo60068a(com.google.protobuf.j0):com.google.protobuf.j0");
    }

    /* renamed from: b */
    public final ByteString mo60069b() {
        if (this.f37312b != null) {
            return this.f37312b;
        }
        synchronized (this) {
            if (this.f37312b != null) {
                ByteString byteString = this.f37312b;
                return byteString;
            }
            if (this.f37311a == null) {
                this.f37312b = ByteString.EMPTY;
            } else {
                this.f37312b = this.f37311a.mo59826a();
            }
            ByteString byteString2 = this.f37312b;
            return byteString2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16948x)) {
            return false;
        }
        C16948x xVar = (C16948x) obj;
        C16906j0 j0Var = this.f37311a;
        C16906j0 j0Var2 = xVar.f37311a;
        return (j0Var == null && j0Var2 == null) ? mo60069b().equals(xVar.mo60069b()) : (j0Var == null || j0Var2 == null) ? j0Var != null ? j0Var.equals(xVar.mo60068a(j0Var.mo59746d())) : mo60068a(j0Var2.mo59746d()).equals(j0Var2) : j0Var.equals(j0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
