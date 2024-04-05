package com.google.protobuf;

import com.google.protobuf.C16925r;
import java.util.Map;

/* renamed from: com.google.protobuf.y0 */
public final class C16951y0 extends C16953z0<Object, Object> {
    public C16951y0(int i) {
        super(i);
    }

    /* renamed from: g */
    public final void mo60074g() {
        if (!this.f37322e) {
            for (int i = 0; i < mo60081d(); i++) {
                ((C16925r.C16927b) mo60078c(i).getKey()).mo59766x();
            }
            for (Map.Entry key : mo60082e()) {
                ((C16925r.C16927b) key.getKey()).mo59766x();
            }
        }
        super.mo60074g();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((C16925r.C16927b) obj, obj2);
    }
}
