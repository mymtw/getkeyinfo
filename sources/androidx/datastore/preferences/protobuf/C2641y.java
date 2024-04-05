package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.y */
public class C2641y {

    /* renamed from: a */
    public volatile C2602k0 f5981a;

    /* renamed from: b */
    public volatile ByteString f5982b;

    static {
        C2611o.m6212a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.datastore.preferences.protobuf.C2602k0 mo9921a(androidx.datastore.preferences.protobuf.C2602k0 r2) {
        /*
            r1 = this;
            androidx.datastore.preferences.protobuf.k0 r0 = r1.f5981a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            androidx.datastore.preferences.protobuf.k0 r0 = r1.f5981a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f5981a = r2     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            r1.f5982b = r0     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f5981a = r2     // Catch:{ all -> 0x001d }
            androidx.datastore.preferences.protobuf.ByteString r2 = androidx.datastore.preferences.protobuf.ByteString.EMPTY     // Catch:{ all -> 0x001d }
            r1.f5982b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            androidx.datastore.preferences.protobuf.k0 r2 = r1.f5981a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2641y.mo9921a(androidx.datastore.preferences.protobuf.k0):androidx.datastore.preferences.protobuf.k0");
    }

    /* renamed from: b */
    public final ByteString mo9922b() {
        if (this.f5982b != null) {
            return this.f5982b;
        }
        synchronized (this) {
            if (this.f5982b != null) {
                ByteString byteString = this.f5982b;
                return byteString;
            }
            if (this.f5981a == null) {
                this.f5982b = ByteString.EMPTY;
            } else {
                this.f5982b = this.f5981a.mo9541a();
            }
            ByteString byteString2 = this.f5982b;
            return byteString2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2641y)) {
            return false;
        }
        C2641y yVar = (C2641y) obj;
        C2602k0 k0Var = this.f5981a;
        C2602k0 k0Var2 = yVar.f5981a;
        return (k0Var == null && k0Var2 == null) ? mo9922b().equals(yVar.mo9922b()) : (k0Var == null || k0Var2 == null) ? k0Var != null ? k0Var.equals(yVar.mo9921a(k0Var.mo9462d())) : mo9921a(k0Var2.mo9462d()).equals(k0Var2) : k0Var.equals(k0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
