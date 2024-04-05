package p705wl;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.crypto.tink.proto.C16415a;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p508am.C14035d;
import p551dm.C17684w;
import p705wl.C18727b;
import p705wl.C18739k;

/* renamed from: wl.f */
public final class C18734f {

    /* renamed from: a */
    public final C16415a f41506a;

    public C18734f(C16415a aVar) {
        this.f41506a = aVar;
    }

    /* renamed from: b */
    public static final C18734f m31591b(C14035d dVar, C18726a aVar) throws GeneralSecurityException, IOException {
        C17684w y = C17684w.m29676y(dVar.mo46860a(), C16511n.m27170a());
        if (y.mo68966w().size() != 0) {
            try {
                C16415a B = C16415a.m26536B(aVar.mo46854b(y.mo68966w().toByteArray(), new byte[0]), C16511n.m27170a());
                if (B.mo58432x() > 0) {
                    return new C18734f(B);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: a */
    public final <P> P mo70223a(Class<P> cls) throws GeneralSecurityException {
        byte[] bArr;
        C18742l lVar = (C18742l) C18745o.f41522e.get(cls);
        Class b = lVar == null ? null : lVar.mo46972b();
        if (b != null) {
            C16415a aVar = this.f41506a;
            int i = C18748q.f41523a;
            int z = aVar.mo58434z();
            int i2 = 0;
            boolean z2 = false;
            boolean z3 = true;
            for (C16415a.C16418c next : aVar.mo58433y()) {
                if (next.mo58436B() == KeyStatusType.ENABLED) {
                    if (!next.mo58437C()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.mo58439z())}));
                    } else if (next.mo58435A() == OutputPrefixType.UNKNOWN_PREFIX) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.mo58439z())}));
                    } else if (next.mo58436B() != KeyStatusType.UNKNOWN_STATUS) {
                        if (next.mo58439z() == z) {
                            if (!z2) {
                                z2 = true;
                            } else {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                        }
                        if (next.mo58438y().mo58429y() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                            z3 = false;
                        }
                        i2++;
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.mo58439z())}));
                    }
                }
            }
            if (i2 == 0) {
                throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
            } else if (z2 || z3) {
                C18739k kVar = new C18739k(b);
                for (C16415a.C16418c next2 : this.f41506a.mo58433y()) {
                    KeyStatusType B = next2.mo58436B();
                    KeyStatusType keyStatusType = KeyStatusType.ENABLED;
                    if (B == keyStatusType) {
                        Object c = C18745o.m31613c(next2.mo58438y().mo58430z(), next2.mo58438y().mo58427A(), b);
                        if (next2.mo58436B() == keyStatusType) {
                            int i3 = C18727b.C18728a.f41498a[next2.mo58435A().ordinal()];
                            if (i3 == 1 || i3 == 2) {
                                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(next2.mo58439z()).array();
                            } else if (i3 == 3) {
                                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(next2.mo58439z()).array();
                            } else if (i3 == 4) {
                                bArr = C18727b.f41497a;
                            } else {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                            C18739k.C18740a<P> aVar2 = new C18739k.C18740a<>(c, bArr, next2.mo58436B(), next2.mo58435A());
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(aVar2);
                            C18739k.C18741b bVar = new C18739k.C18741b(aVar2.mo70229a());
                            List list = (List) kVar.f41509a.put(bVar, Collections.unmodifiableList(arrayList));
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(list);
                                arrayList2.add(aVar2);
                                kVar.f41509a.put(bVar, Collections.unmodifiableList(arrayList2));
                            }
                            if (next2.mo58439z() != this.f41506a.mo58434z()) {
                                continue;
                            } else if (aVar2.f41514c != keyStatusType) {
                                throw new IllegalArgumentException("the primary entry has to be ENABLED");
                            } else if (!kVar.mo70228a(aVar2.mo70229a()).isEmpty()) {
                                kVar.f41510b = aVar2;
                            } else {
                                throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                            }
                        } else {
                            throw new GeneralSecurityException("only ENABLED key is allowed");
                        }
                    }
                }
                C18742l lVar2 = (C18742l) C18745o.f41522e.get(cls);
                if (lVar2 == null) {
                    throw new GeneralSecurityException(C0326j.m862g(kVar.f41511c, C0072d.m201h("No wrapper found for ")));
                } else if (lVar2.mo46972b().equals(kVar.f41511c)) {
                    return lVar2.mo46971a(kVar);
                } else {
                    StringBuilder h = C0072d.m201h("Wrong input primitive class, expected ");
                    h.append(lVar2.mo46972b());
                    h.append(", got ");
                    h.append(kVar.f41511c);
                    throw new GeneralSecurityException(h.toString());
                }
            } else {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
        } else {
            throw new GeneralSecurityException(C0326j.m862g(cls, C0072d.m201h("No wrapper found for ")));
        }
    }

    public final String toString() {
        return C18748q.m31621a(this.f41506a).toString();
    }
}
