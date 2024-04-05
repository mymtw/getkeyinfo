package p698vm;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.C16548b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p085dh.C6673a;
import p674sm.C18537d;
import p674sm.C18539f;
import p682tm.C18560a;

/* renamed from: vm.e */
public final class C18663e {

    /* renamed from: a */
    public final Map<Class<?>, C18537d<?>> f41268a;

    /* renamed from: b */
    public final Map<Class<?>, C18539f<?>> f41269b;

    /* renamed from: c */
    public final C18537d<Object> f41270c;

    /* renamed from: vm.e$a */
    public static final class C18664a implements C18560a<C18664a> {

        /* renamed from: a */
        public static final C18662d f41271a = new C18662d();
    }

    public C18663e(HashMap hashMap, HashMap hashMap2, C18662d dVar) {
        this.f41268a = hashMap;
        this.f41269b = hashMap2;
        this.f41270c = dVar;
    }

    /* renamed from: a */
    public final void mo70165a(ByteArrayOutputStream byteArrayOutputStream, C6673a aVar) throws IOException {
        Class<C6673a> cls = C6673a.class;
        Map<Class<?>, C18537d<?>> map = this.f41268a;
        C16548b bVar = new C16548b(byteArrayOutputStream, map, this.f41269b, this.f41270c);
        C18537d dVar = map.get(cls);
        if (dVar != null) {
            dVar.mo18639a(aVar, bVar);
            return;
        }
        throw new EncodingException("No encoder for " + cls);
    }
}
