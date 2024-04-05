package p027b8;

import com.cardinalcommerce.dependencies.internal.minidev.asm.Accessor;
import com.cardinalcommerce.dependencies.internal.minidev.asm.BeansAccess;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import java.io.IOException;
import p305z7.C8462e;
import p305z7.C8463f;

/* renamed from: b8.b */
public final class C3483b implements C3504n<Object> {
    /* renamed from: a */
    public final <E> void mo12997a(E e, Appendable appendable, C8462e eVar) {
        try {
            BeansAccess beansAccess = BeansAccess.get(e.getClass(), C8463f.f18487a);
            appendable.append('{');
            boolean z = false;
            for (Accessor accessor : beansAccess.getAccessors()) {
                Object obj = beansAccess.get(e, accessor.getIndex());
                if (obj != null || !eVar.mo21033a()) {
                    if (z) {
                        appendable.append(',');
                    } else {
                        z = true;
                    }
                    JSONObject.writeJSONKV(accessor.getName(), obj, appendable, eVar);
                }
            }
            appendable.append('}');
        } catch (IOException e2) {
            throw e2;
        }
    }
}
