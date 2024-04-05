package com.google.crypto.tink.shaded.protobuf;

import android.support.p013v4.media.C0072d;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16452a;
import com.google.crypto.tink.shaded.protobuf.C16452a.C16453a;
import com.google.crypto.tink.shaded.protobuf.C16477e;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a */
public abstract class C16452a<MessageType extends C16452a<MessageType, BuilderType>, BuilderType extends C16453a<MessageType, BuilderType>> implements C16503j0 {
    public int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a */
    public static abstract class C16453a<MessageType extends C16452a<MessageType, BuilderType>, BuilderType extends C16453a<MessageType, BuilderType>> implements C16503j0.C16504a {
        /* renamed from: k */
        public final GeneratedMessageLite.C16431a mo58606k(byte[] bArr) throws InvalidProtocolBufferException {
            int length = bArr.length;
            GeneratedMessageLite.C16431a aVar = (GeneratedMessageLite.C16431a) this;
            C16511n a = C16511n.m27170a();
            aVar.mo58540o();
            try {
                C16528t0 t0Var = C16528t0.f36696c;
                MessageType messagetype = aVar.f36539c;
                t0Var.getClass();
                t0Var.mo58955a(messagetype.getClass()).mo58906h(aVar.f36539c, bArr, 0, length + 0, new C16477e.C16478a(a));
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

    /* renamed from: g */
    private String m26693g(String str) {
        StringBuilder h = C0072d.m201h("Serializing ");
        h.append(getClass().getName());
        h.append(" to a ");
        h.append(str);
        h.append(" threw an IOException (should never happen).");
        return h.toString();
    }

    /* renamed from: a */
    public final ByteString mo58604a() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            ByteString.C16426g newCodedBuilder = ByteString.newCodedBuilder(generatedMessageLite.mo58524b());
            generatedMessageLite.mo58529h(newCodedBuilder.f36522a);
            if (newCodedBuilder.f36522a.mo58508R() == 0) {
                return new ByteString.LiteralByteString(newCodedBuilder.f36523b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m26693g("ByteString"), e);
        }
    }

    /* renamed from: c */
    public final byte[] mo58605c() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int b = generatedMessageLite.mo58524b();
            byte[] bArr = new byte[b];
            Logger logger = CodedOutputStream.f36529b;
            CodedOutputStream.C16429a aVar = new CodedOutputStream.C16429a(bArr, b);
            generatedMessageLite.mo58529h(aVar);
            if (aVar.mo58508R() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m26693g("byte array"), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo58526e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo58533k(int i) {
        throw new UnsupportedOperationException();
    }
}
