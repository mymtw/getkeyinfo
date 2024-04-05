package p687uj;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p674sm.C18537d;
import p674sm.C18539f;

/* renamed from: uj.p */
public final class C18600p {

    /* renamed from: a */
    public final Map<Class<?>, C18537d<?>> f41077a;

    /* renamed from: b */
    public final Map<Class<?>, C18539f<?>> f41078b;

    /* renamed from: c */
    public final C18537d<Object> f41079c;

    public C18600p(HashMap hashMap, HashMap hashMap2, C18599o oVar) {
        this.f41077a = hashMap;
        this.f41078b = hashMap2;
        this.f41079c = oVar;
    }

    /* renamed from: a */
    public final void mo70111a(ByteArrayOutputStream byteArrayOutputStream, Object obj) throws IOException {
        Map<Class<?>, C18537d<?>> map = this.f41077a;
        C18598n nVar = new C18598n(byteArrayOutputStream, map, this.f41078b, this.f41079c);
        if (obj != null) {
            C18537d dVar = map.get(obj.getClass());
            if (dVar != null) {
                dVar.mo18639a(obj, nVar);
                return;
            }
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
    }
}
