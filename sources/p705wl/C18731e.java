package p705wl;

import android.support.p013v4.media.C0072d;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wl.e */
public abstract class C18731e<KeyProtoT extends C16503j0> {

    /* renamed from: a */
    public final Class<KeyProtoT> f41501a;

    /* renamed from: b */
    public final Map<Class<?>, C18733b<?, KeyProtoT>> f41502b;

    /* renamed from: c */
    public final Class<?> f41503c;

    /* renamed from: wl.e$a */
    public static abstract class C18732a<KeyFormatProtoT extends C16503j0, KeyT> {

        /* renamed from: a */
        public final Class<KeyFormatProtoT> f41504a;

        public C18732a(Class<KeyFormatProtoT> cls) {
            this.f41504a = cls;
        }

        /* renamed from: a */
        public abstract KeyT mo46968a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        /* renamed from: b */
        public abstract KeyFormatProtoT mo46969b(ByteString byteString) throws InvalidProtocolBufferException;

        /* renamed from: c */
        public abstract void mo46970c(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    /* renamed from: wl.e$b */
    public static abstract class C18733b<PrimitiveT, KeyT> {

        /* renamed from: a */
        public final Class<PrimitiveT> f41505a;

        public C18733b(Class<PrimitiveT> cls) {
            this.f41505a = cls;
        }

        /* renamed from: a */
        public abstract PrimitiveT mo46967a(KeyT keyt) throws GeneralSecurityException;
    }

    @SafeVarargs
    public C18731e(Class<KeyProtoT> cls, C18733b<?, KeyProtoT>... bVarArr) {
        this.f41501a = cls;
        HashMap hashMap = new HashMap();
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            C18733b<?, KeyProtoT> bVar = bVarArr[i];
            if (!hashMap.containsKey(bVar.f41505a)) {
                hashMap.put(bVar.f41505a, bVar);
                i++;
            } else {
                StringBuilder h = C0072d.m201h("KeyTypeManager constructed with duplicate factories for primitive ");
                h.append(bVar.f41505a.getCanonicalName());
                throw new IllegalArgumentException(h.toString());
            }
        }
        if (bVarArr.length > 0) {
            this.f41503c = bVarArr[0].f41505a;
        } else {
            this.f41503c = Void.class;
        }
        this.f41502b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public abstract String mo46962a();

    /* renamed from: b */
    public final <P> P mo70222b(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        C18733b bVar = this.f41502b.get(cls);
        if (bVar != null) {
            return bVar.mo46967a(keyprotot);
        }
        StringBuilder h = C0072d.m201h("Requested primitive class ");
        h.append(cls.getCanonicalName());
        h.append(" not supported.");
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: c */
    public abstract C18732a<?, KeyProtoT> mo46963c();

    /* renamed from: d */
    public abstract KeyData.KeyMaterialType mo46964d();

    /* renamed from: e */
    public abstract KeyProtoT mo46965e(ByteString byteString) throws InvalidProtocolBufferException;

    /* renamed from: f */
    public abstract void mo46966f(KeyProtoT keyprotot) throws GeneralSecurityException;
}
