package com.google.protobuf;

import android.support.p013v4.media.C0072d;
import com.google.protobuf.ByteString;
import com.google.protobuf.C16863a;
import com.google.protobuf.C16863a.C16864a;
import com.google.protobuf.C16881e;
import com.google.protobuf.C16906j0;
import com.google.protobuf.C16935v;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.a */
public abstract class C16863a<MessageType extends C16863a<MessageType, BuilderType>, BuilderType extends C16864a<MessageType, BuilderType>> implements C16906j0 {
    public int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    public static abstract class C16864a<MessageType extends C16863a<MessageType, BuilderType>, BuilderType extends C16864a<MessageType, BuilderType>> implements C16906j0.C16907a {
        /* renamed from: r */
        public final GeneratedMessageLite.C16838a mo59828r(byte[] bArr) throws InvalidProtocolBufferException {
            int length = bArr.length;
            GeneratedMessageLite.C16838a aVar = (GeneratedMessageLite.C16838a) this;
            C16915n a = C16915n.m28337a();
            aVar.mo59761u();
            try {
                C16932t0 t0Var = C16932t0.f37292c;
                MessageType messagetype = aVar.f37158c;
                t0Var.getClass();
                t0Var.mo60039a(messagetype.getClass()).mo59996h(aVar.f37158c, bArr, 0, length + 0, new C16881e.C16882a(a));
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

    /* renamed from: e */
    public static void m28025e(List list, C16935v.C16942f fVar) {
        Charset charset = C16935v.f37301a;
        list.getClass();
        if (list instanceof C16952z) {
            List<?> f = ((C16952z) list).mo59884f();
            C16952z zVar = (C16952z) fVar;
            int size = fVar.size();
            for (Object next : f) {
                if (next == null) {
                    StringBuilder h = C0072d.m201h("Element at index ");
                    h.append(zVar.size() - size);
                    h.append(" is null.");
                    String sb = h.toString();
                    int size2 = zVar.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            zVar.remove(size2);
                        } else {
                            throw new NullPointerException(sb);
                        }
                    }
                } else if (next instanceof ByteString) {
                    zVar.mo59891t((ByteString) next);
                } else {
                    zVar.add((String) next);
                }
            }
        } else if (list instanceof C16930s0) {
            fVar.addAll(list);
        } else {
            if (fVar instanceof ArrayList) {
                ((ArrayList) fVar).ensureCapacity(list.size() + fVar.size());
            }
            int size3 = fVar.size();
            for (Object next2 : list) {
                if (next2 == null) {
                    StringBuilder h2 = C0072d.m201h("Element at index ");
                    h2.append(fVar.size() - size3);
                    h2.append(" is null.");
                    String sb2 = h2.toString();
                    int size4 = fVar.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            fVar.remove(size4);
                        } else {
                            throw new NullPointerException(sb2);
                        }
                    }
                } else {
                    fVar.add(next2);
                }
            }
        }
    }

    /* renamed from: n */
    private String m28026n(String str) {
        StringBuilder h = C0072d.m201h("Serializing ");
        h.append(getClass().getName());
        h.append(" to a ");
        h.append(str);
        h.append(" threw an IOException (should never happen).");
        return h.toString();
    }

    /* renamed from: a */
    public final ByteString mo59826a() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            ByteString.C16817g newCodedBuilder = ByteString.newCodedBuilder(generatedMessageLite.mo59745b());
            generatedMessageLite.mo59753m(newCodedBuilder.f37133a);
            if (newCodedBuilder.f37133a.mo59732V() == 0) {
                return new ByteString.LiteralByteString(newCodedBuilder.f37134b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m28026n("ByteString"), e);
        }
    }

    /* renamed from: c */
    public final byte[] mo59827c() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int b = generatedMessageLite.mo59745b();
            byte[] bArr = new byte[b];
            Logger logger = CodedOutputStream.f37140b;
            CodedOutputStream.C16820a aVar = new CodedOutputStream.C16820a(bArr, b);
            generatedMessageLite.mo59753m(aVar);
            if (aVar.mo59732V() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m28026n("byte array"), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo59749g() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo59754r(int i) {
        throw new UnsupportedOperationException();
    }
}
