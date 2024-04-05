package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2621s;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.a1 */
public final class C2549a1 extends C2554b1<Object, Object> {
    public C2549a1(int i) {
        super(i);
    }

    /* renamed from: g */
    public final void mo9550g() {
        if (!this.f5823e) {
            for (int i = 0; i < mo9560d(); i++) {
                ((C2621s.C2623b) mo9557c(i).getKey()).mo9481x();
            }
            for (Map.Entry key : mo9561e()) {
                ((C2621s.C2623b) key.getKey()).mo9481x();
            }
        }
        super.mo9550g();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((C2621s.C2623b) obj, obj2);
    }
}
