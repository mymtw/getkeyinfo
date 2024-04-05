package p705wl;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p705wl.C18731e;

/* renamed from: wl.d */
public final class C18730d<PrimitiveT, KeyProtoT extends C16503j0> {

    /* renamed from: a */
    public final C18731e<KeyProtoT> f41499a;

    /* renamed from: b */
    public final Class<PrimitiveT> f41500b;

    public C18730d(C18731e<KeyProtoT> eVar, Class<PrimitiveT> cls) {
        if (eVar.f41502b.keySet().contains(cls) || Void.class.equals(cls)) {
            this.f41499a = eVar;
            this.f41500b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{eVar.toString(), cls.getName()}));
    }

    /* renamed from: a */
    public final PrimitiveT mo70219a(ByteString byteString) throws GeneralSecurityException {
        try {
            KeyProtoT e = this.f41499a.mo46965e(byteString);
            if (!Void.class.equals(this.f41500b)) {
                this.f41499a.mo46966f(e);
                return this.f41499a.mo70222b(e, this.f41500b);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException(C0326j.m862g(this.f41499a.f41501a, C0072d.m201h("Failures parsing proto of type ")), e2);
        }
    }

    /* renamed from: b */
    public final C16503j0 mo70220b(ByteString byteString) throws GeneralSecurityException {
        try {
            C18731e.C18732a c = this.f41499a.mo46963c();
            C16503j0 b = c.mo46969b(byteString);
            c.mo46970c(b);
            return (C16503j0) c.mo46968a(b);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException(C0326j.m862g(this.f41499a.mo46963c().f41504a, C0072d.m201h("Failures parsing proto of type ")), e);
        }
    }

    /* renamed from: c */
    public final KeyData mo70221c(ByteString byteString) throws GeneralSecurityException {
        try {
            C18731e.C18732a c = this.f41499a.mo46963c();
            C16503j0 b = c.mo46969b(byteString);
            c.mo46970c(b);
            KeyData.C16410b B = KeyData.m26522B();
            String a = this.f41499a.mo46962a();
            B.mo58540o();
            KeyData.m26524u((KeyData) B.f36539c, a);
            ByteString a2 = ((C16503j0) c.mo46968a(b)).mo58604a();
            B.mo58540o();
            KeyData.m26525v((KeyData) B.f36539c, a2);
            KeyData.KeyMaterialType d = this.f41499a.mo46964d();
            B.mo58540o();
            KeyData.m26526w((KeyData) B.f36539c, d);
            return (KeyData) B.mo58538l();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
