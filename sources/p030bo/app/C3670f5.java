package p030bo.app;

import java.util.UUID;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005a4.C0035b;

/* renamed from: bo.app.f5 */
public final class C3670f5 implements C0035b<String> {

    /* renamed from: d */
    public static final C3671a f8421d = new C3671a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final UUID f8422b;

    /* renamed from: c */
    private final String f8423c;

    /* renamed from: bo.app.f5$a */
    public static final class C3671a {
        private C3671a() {
        }

        public /* synthetic */ C3671a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3670f5 mo13297a() {
            UUID randomUUID = UUID.randomUUID();
            C19383o.m32796f(randomUUID, "randomUUID()");
            return new C3670f5(randomUUID);
        }

        /* renamed from: a */
        public final C3670f5 mo13298a(String str) {
            C19383o.m32797g(str, "sessionId");
            UUID fromString = UUID.fromString(str);
            C19383o.m32796f(fromString, "fromString(sessionId)");
            return new C3670f5(fromString);
        }
    }

    public C3670f5(UUID uuid) {
        C19383o.m32797g(uuid, "sessionIdUuid");
        this.f8422b = uuid;
        String uuid2 = uuid.toString();
        C19383o.m32796f(uuid2, "sessionIdUuid.toString()");
        this.f8423c = uuid2;
    }

    /* renamed from: e */
    public String forJsonPut() {
        return this.f8423c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3670f5) && C19383o.m32792b(this.f8422b, ((C3670f5) obj).f8422b);
    }

    public int hashCode() {
        return this.f8422b.hashCode();
    }

    public String toString() {
        return this.f8423c;
    }
}
