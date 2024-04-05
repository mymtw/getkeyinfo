package com.google.crypto.tink.shaded.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import androidx.compose.animation.C0472h;
import com.google.android.gms.common.api.Api;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.play.core.appupdate.C15562d;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import p003a2.C0015b;

public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(C16531v.f36705b);
    public static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    public static final int MIN_READ_FROM_CHUNK_SIZE = 256;

    /* renamed from: b */
    public static final C16424e f36517b = (C16474d.m26752a() ? new C16428i() : new C16423d());

    /* renamed from: c */
    public static final C16421b f36518c = new C16421b();
    private int hash = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.checkRange(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        public byte byteAt(int i) {
            ByteString.checkIndex(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
        }

        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        public byte internalByteAt(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    public static abstract class LeafByteString extends ByteString {
        public abstract boolean equalsRange(ByteString byteString, int i, int i2);

        public final int getTreeDepth() {
            return 0;
        }

        public final boolean isBalanced() {
            return true;
        }

        public void writeToReverse(C16494h hVar) throws IOException {
            writeTo(hVar);
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        public final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        public byte byteAt(int i) {
            return this.bytes[i];
        }

        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = literalByteString.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return equalsRange(literalByteString, 0, size());
            }
            return false;
        }

        public final boolean equalsRange(ByteString byteString, int i, int i2) {
            if (i2 <= byteString.size()) {
                int i3 = i + i2;
                if (i3 > byteString.size()) {
                    StringBuilder g = C0472h.m1244g("Ran off end of other: ", i, ", ", i2, ", ");
                    g.append(byteString.size());
                    throw new IllegalArgumentException(g.toString());
                } else if (!(byteString instanceof LiteralByteString)) {
                    return byteString.substring(i, i3).equals(substring(0, i2));
                } else {
                    LiteralByteString literalByteString = (LiteralByteString) byteString;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = literalByteString.bytes;
                    int offsetIntoBytes = getOffsetIntoBytes() + i2;
                    int offsetIntoBytes2 = getOffsetIntoBytes();
                    int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + i;
                    while (offsetIntoBytes2 < offsetIntoBytes) {
                        if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                            return false;
                        }
                        offsetIntoBytes2++;
                        offsetIntoBytes3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        public int getOffsetIntoBytes() {
            return 0;
        }

        public byte internalByteAt(int i) {
            return this.bytes[i];
        }

        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return Utf8.m26668f(offsetIntoBytes, size() + offsetIntoBytes, this.bytes);
        }

        public final C16497i newCodedInput() {
            return C16497i.m26921f(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        public final int partialHash(int i, int i2, int i3) {
            byte[] bArr = this.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            Charset charset = C16531v.f36704a;
            for (int i4 = offsetIntoBytes; i4 < offsetIntoBytes + i3; i4++) {
                i = (i * 31) + bArr[i4];
            }
            return i;
        }

        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            byte[] bArr = this.bytes;
            return Utf8.f36555a.mo58597f(i, offsetIntoBytes, i3 + offsetIntoBytes, bArr);
        }

        public int size() {
            return this.bytes.length;
        }

        public final ByteString substring(int i, int i2) {
            int checkRange = ByteString.checkRange(i, i2, size());
            return checkRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, getOffsetIntoBytes() + i, checkRange);
        }

        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
        }

        public final void writeTo(C16494h hVar) throws IOException {
            hVar.mo58513a(getOffsetIntoBytes(), size(), this.bytes);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$a */
    public class C16420a extends C16422c {

        /* renamed from: b */
        public int f36519b = 0;

        /* renamed from: c */
        public final int f36520c;

        public C16420a() {
            this.f36520c = ByteString.this.size();
        }

        public final boolean hasNext() {
            return this.f36519b < this.f36520c;
        }

        public final byte nextByte() {
            int i = this.f36519b;
            if (i < this.f36520c) {
                this.f36519b = i + 1;
                return ByteString.this.internalByteAt(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$b */
    public class C16421b implements Comparator<ByteString> {
        public final int compare(Object obj, Object obj2) {
            ByteString byteString = (ByteString) obj;
            ByteString byteString2 = (ByteString) obj2;
            C16425f it = byteString.iterator();
            C16425f it2 = byteString2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(ByteString.access$200(it.nextByte()), ByteString.access$200(it2.nextByte()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$c */
    public static abstract class C16422c implements C16425f {
        public final Object next() {
            return Byte.valueOf(nextByte());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$d */
    public static final class C16423d implements C16424e {
        /* renamed from: a */
        public final byte[] mo58485a(int i, int i2, byte[] bArr) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$e */
    public interface C16424e {
        /* renamed from: a */
        byte[] mo58485a(int i, int i2, byte[] bArr);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$f */
    public interface C16425f extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$g */
    public static final class C16426g {

        /* renamed from: a */
        public final CodedOutputStream.C16429a f36522a;

        /* renamed from: b */
        public final byte[] f36523b;

        public C16426g(int i) {
            byte[] bArr = new byte[i];
            this.f36523b = bArr;
            Logger logger = CodedOutputStream.f36529b;
            this.f36522a = new CodedOutputStream.C16429a(bArr, i);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$i */
    public static final class C16428i implements C16424e {
        /* renamed from: a */
        public final byte[] mo58485a(int i, int i2, byte[] bArr) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    /* renamed from: a */
    public static ByteString m26557a(Iterator<ByteString> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            return m26557a(it, i2).concat(m26557a(it, i - i2));
        }
    }

    public static int access$200(byte b) {
        return b & 255;
    }

    public static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C0015b.m88g("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(C0087d.m235e("Index > length: ", i, ", ", i2));
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C0069a.m175f("Beginning index: ", i, " < 0"));
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(C0087d.m235e("Beginning index larger than ending index: ", i, ", ", i2));
        } else {
            throw new IndexOutOfBoundsException(C0087d.m235e("End index: ", i2, " >= ", i3));
        }
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        checkRange(i, i + i2, bArr.length);
        return new LiteralByteString(f36517b.mo58485a(i, i2, bArr));
    }

    public static ByteString copyFromUtf8(String str) {
        return new LiteralByteString(str.getBytes(C16531v.f36704a));
    }

    public static C16426g newCodedBuilder(int i) {
        return new C16426g(i);
    }

    public static C16427h newOutput(int i) {
        return new C16427h(i);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return f36518c;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final ByteString concat(ByteString byteString) {
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - size() >= byteString.size()) {
            return RopeByteString.concatenate(this, byteString);
        }
        StringBuilder h = C0072d.m201h("ByteString would be too long: ");
        h.append(size());
        h.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        h.append(byteString.size());
        throw new IllegalArgumentException(h.toString());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public abstract byte internalByteAt(int i);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract C16497i newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i, int i2, int i3);

    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i) {
        return substring(i, size());
    }

    public abstract ByteString substring(int i, int i2);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return C16531v.f36705b;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(C16531v.f36704a);
    }

    public abstract void writeTo(C16494h hVar) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    public abstract void writeToReverse(C16494h hVar) throws IOException;

    public static C16427h newOutput() {
        return new C16427h(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i) throws IOException {
        return readFrom(inputStream, i, i);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public C16425f iterator() {
        return new C16420a();
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) throws IOException {
        ByteString byteString;
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] bArr = new byte[i];
            int i3 = 0;
            while (i3 < i) {
                int read = inputStream.read(bArr, i3, i - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            if (i3 == 0) {
                byteString = null;
            } else {
                byteString = copyFrom(bArr, 0, i3);
            }
            if (byteString == null) {
                return copyFrom((Iterable<ByteString>) arrayList);
            }
            arrayList.add(byteString);
            i = Math.min(i * 2, i2);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$h */
    public static final class C16427h extends OutputStream {

        /* renamed from: b */
        public final int f36524b;

        /* renamed from: c */
        public final ArrayList<ByteString> f36525c;

        /* renamed from: d */
        public int f36526d;

        /* renamed from: e */
        public byte[] f36527e;

        /* renamed from: f */
        public int f36528f;

        public C16427h(int i) {
            if (i >= 0) {
                this.f36524b = i;
                this.f36525c = new ArrayList<>();
                this.f36527e = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: a */
        public final void mo58486a(int i) {
            this.f36525c.add(new LiteralByteString(this.f36527e));
            int length = this.f36526d + this.f36527e.length;
            this.f36526d = length;
            this.f36527e = new byte[Math.max(this.f36524b, Math.max(i, length >>> 1))];
            this.f36528f = 0;
        }

        public final String toString() {
            int i;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i = this.f36526d + this.f36528f;
            }
            objArr[1] = Integer.valueOf(i);
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        public final synchronized void write(int i) {
            if (this.f36528f == this.f36527e.length) {
                mo58486a(1);
            }
            byte[] bArr = this.f36527e;
            int i2 = this.f36528f;
            this.f36528f = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public final synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f36527e;
            int length = bArr2.length;
            int i3 = this.f36528f;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f36528f += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                mo58486a(i4);
                System.arraycopy(bArr, i + length2, this.f36527e, 0, i4);
                this.f36528f = i4;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        checkRange(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString wrap(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = C15562d.m25170H(this);
        } else {
            str = C15562d.m25170H(substring(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        if (i == 0) {
            return EMPTY;
        }
        return m26557a(iterable.iterator(), i);
    }
}
