package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C16521r;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.z0 */
public final class C16546z0 extends C16457a1<Object, Object> {
    public C16546z0(int i) {
        super(i);
    }

    /* renamed from: g */
    public final void mo58620g() {
        if (!this.f36563e) {
            for (int i = 0; i < mo58615d(); i++) {
                ((C16521r.C16523b) mo58612c(i).getKey()).mo58545x();
            }
            for (Map.Entry key : mo58616e()) {
                ((C16521r.C16523b) key.getKey()).mo58545x();
            }
        }
        super.mo58620g();
    }
}
