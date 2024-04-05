package p743fr;

import com.etsy.android.lib.conversation.MessageDraft;
import kotlin.jvm.internal.C19383o;
import okio.ByteString;

/* renamed from: fr.a */
public final class C19022a {

    /* renamed from: d */
    public static final ByteString f42389d = ByteString.C20020a.m34295c(MessageDraft.IMAGE_DELIMITER);

    /* renamed from: e */
    public static final ByteString f42390e = ByteString.C20020a.m34295c(":status");

    /* renamed from: f */
    public static final ByteString f42391f = ByteString.C20020a.m34295c(":method");

    /* renamed from: g */
    public static final ByteString f42392g = ByteString.C20020a.m34295c(":path");

    /* renamed from: h */
    public static final ByteString f42393h = ByteString.C20020a.m34295c(":scheme");

    /* renamed from: i */
    public static final ByteString f42394i = ByteString.C20020a.m34295c(":authority");

    /* renamed from: a */
    public final int f42395a;

    /* renamed from: b */
    public final ByteString f42396b;

    /* renamed from: c */
    public final ByteString f42397c;

    static {
        ByteString.Companion.getClass();
    }

    public C19022a(ByteString byteString, ByteString byteString2) {
        C19383o.m32797g(byteString, "name");
        C19383o.m32797g(byteString2, "value");
        this.f42396b = byteString;
        this.f42397c = byteString2;
        this.f42395a = byteString2.size() + byteString.size() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19022a)) {
            return false;
        }
        C19022a aVar = (C19022a) obj;
        return C19383o.m32792b(this.f42396b, aVar.f42396b) && C19383o.m32792b(this.f42397c, aVar.f42397c);
    }

    public final int hashCode() {
        ByteString byteString = this.f42396b;
        int i = 0;
        int hashCode = (byteString != null ? byteString.hashCode() : 0) * 31;
        ByteString byteString2 = this.f42397c;
        if (byteString2 != null) {
            i = byteString2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.f42396b.utf8() + ": " + this.f42397c.utf8();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C19022a(String str, String str2) {
        this(ByteString.C20020a.m34295c(str), ByteString.C20020a.m34295c(str2));
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, "value");
        ByteString.Companion.getClass();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C19022a(String str, ByteString byteString) {
        this(byteString, ByteString.C20020a.m34295c(str));
        C19383o.m32797g(byteString, "name");
        C19383o.m32797g(str, "value");
        ByteString.Companion.getClass();
    }
}
