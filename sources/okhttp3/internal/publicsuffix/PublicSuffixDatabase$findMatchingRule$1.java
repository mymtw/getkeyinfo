package okhttp3.internal.publicsuffix;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

final /* synthetic */ class PublicSuffixDatabase$findMatchingRule$1 extends MutablePropertyReference0Impl {
    public PublicSuffixDatabase$findMatchingRule$1(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
    }

    public Object get() {
        byte[] bArr = ((PublicSuffixDatabase) this.receiver).f44215c;
        if (bArr != null) {
            return bArr;
        }
        C19383o.m32805o("publicSuffixListBytes");
        throw null;
    }

    public void set(Object obj) {
        ((PublicSuffixDatabase) this.receiver).f44215c = (byte[]) obj;
    }
}
