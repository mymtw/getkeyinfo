package androidx.datastore.preferences.protobuf;

import android.support.p013v4.media.C0072d;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C2546a;
import androidx.datastore.preferences.protobuf.C2546a.C2547a;
import androidx.datastore.preferences.protobuf.C2571e;
import androidx.datastore.preferences.protobuf.C2602k0;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.a */
public abstract class C2546a<MessageType extends C2546a<MessageType, BuilderType>, BuilderType extends C2547a<MessageType, BuilderType>> implements C2602k0 {
    public int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a */
    public static abstract class C2547a<MessageType extends C2546a<MessageType, BuilderType>, BuilderType extends C2547a<MessageType, BuilderType>> implements C2602k0.C2603a {
        /* renamed from: k */
        public final GeneratedMessageLite.C2521a mo9545k(byte[] bArr) throws InvalidProtocolBufferException {
            int length = bArr.length;
            GeneratedMessageLite.C2521a aVar = (GeneratedMessageLite.C2521a) this;
            C2611o a = C2611o.m6212a();
            aVar.mo9476o();
            try {
                C2628u0 u0Var = C2628u0.f5965c;
                MessageType messagetype = aVar.f5797c;
                u0Var.getClass();
                u0Var.mo9895a(messagetype.getClass()).mo9847i(aVar.f5797c, bArr, 0, length + 0, new C2571e.C2572a(a));
                return aVar;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }
    }

    /* renamed from: a */
    public final ByteString mo9541a() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            ByteString.C2510g newCodedBuilder = ByteString.newCodedBuilder(generatedMessageLite.mo9461b());
            generatedMessageLite.mo9469j(newCodedBuilder.f5774a);
            if (newCodedBuilder.f5774a.mo9443W() == 0) {
                return new ByteString.LiteralByteString(newCodedBuilder.f5775b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(mo9544k("ByteString"), e);
        }
    }

    /* renamed from: c */
    public final byte[] mo9542c() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int b = generatedMessageLite.mo9461b();
            byte[] bArr = new byte[b];
            Logger logger = CodedOutputStream.f5781b;
            CodedOutputStream.C2514b bVar = new CodedOutputStream.C2514b(bArr, b);
            generatedMessageLite.mo9469j(bVar);
            if (bVar.mo9443W() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(mo9544k("byte array"), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9463e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final int mo9543g(C2642y0 y0Var) {
        int e = mo9463e();
        if (e != -1) {
            return e;
        }
        int d = y0Var.mo9842d(this);
        mo9470l(d);
        return d;
    }

    /* renamed from: k */
    public final String mo9544k(String str) {
        StringBuilder h = C0072d.m201h("Serializing ");
        h.append(getClass().getName());
        h.append(" to a ");
        h.append(str);
        h.append(" threw an IOException (should never happen).");
        return h.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo9470l(int i) {
        throw new UnsupportedOperationException();
    }
}
