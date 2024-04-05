package androidx.navigation;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2878l0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: androidx.navigation.e */
public final class C2955e extends C2866i0 {

    /* renamed from: c */
    public static final C2956a f6699c = new C2956a();

    /* renamed from: b */
    public final HashMap<UUID, C2878l0> f6700b = new HashMap<>();

    /* renamed from: androidx.navigation.e$a */
    public class C2956a implements C2870k0.C2872b {
        public final <T extends C2866i0> T create(Class<T> cls) {
            return new C2955e();
        }
    }

    public final void onCleared() {
        for (C2878l0 a : this.f6700b.values()) {
            a.mo10831a();
        }
        this.f6700b.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f6700b.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
