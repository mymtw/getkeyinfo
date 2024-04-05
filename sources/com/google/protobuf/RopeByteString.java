package com.google.protobuf;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.api.Api;
import com.google.protobuf.ByteString;
import com.google.protobuf.C16900i;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class RopeByteString extends ByteString {
    public static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private static final long serialVersionUID = 1;
    /* access modifiers changed from: private */
    public final ByteString left;
    private final int leftLength;
    /* access modifiers changed from: private */
    public final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* renamed from: com.google.protobuf.RopeByteString$a */
    public class C16846a extends ByteString.C16813c {

        /* renamed from: b */
        public final C16848c f37163b;

        /* renamed from: c */
        public ByteString.C16816f f37164c;

        public C16846a(RopeByteString ropeByteString) {
            C16848c cVar = new C16848c(ropeByteString);
            this.f37163b = cVar;
            this.f37164c = cVar.hasNext() ? cVar.next().iterator() : null;
        }

        public final boolean hasNext() {
            return this.f37164c != null;
        }

        public final byte nextByte() {
            ByteString.C16816f fVar = this.f37164c;
            if (fVar != null) {
                byte nextByte = fVar.nextByte();
                if (!this.f37164c.hasNext()) {
                    this.f37164c = this.f37163b.hasNext() ? this.f37163b.next().iterator() : null;
                }
                return nextByte;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.protobuf.RopeByteString$b */
    public static class C16847b {

        /* renamed from: a */
        public final ArrayDeque<ByteString> f37165a = new ArrayDeque<>();

        /* renamed from: a */
        public final void mo59798a(ByteString byteString) {
            if (byteString.isBalanced()) {
                int binarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, byteString.size());
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int minLength = RopeByteString.minLength(binarySearch + 1);
                if (this.f37165a.isEmpty() || this.f37165a.peek().size() >= minLength) {
                    this.f37165a.push(byteString);
                    return;
                }
                int minLength2 = RopeByteString.minLength(binarySearch);
                ByteString pop = this.f37165a.pop();
                while (!this.f37165a.isEmpty() && this.f37165a.peek().size() < minLength2) {
                    pop = new RopeByteString(this.f37165a.pop(), pop, (C16846a) null);
                }
                RopeByteString ropeByteString = new RopeByteString(pop, byteString, (C16846a) null);
                while (!this.f37165a.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(RopeByteString.minLengthByDepth, ropeByteString.size());
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (this.f37165a.peek().size() >= RopeByteString.minLength(binarySearch2 + 1)) {
                        break;
                    }
                    ropeByteString = new RopeByteString(this.f37165a.pop(), ropeByteString, (C16846a) null);
                }
                this.f37165a.push(ropeByteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString2 = (RopeByteString) byteString;
                mo59798a(ropeByteString2.left);
                mo59798a(ropeByteString2.right);
            } else {
                StringBuilder h = C0072d.m201h("Has a new type of ByteString been created? Found ");
                h.append(byteString.getClass());
                throw new IllegalArgumentException(h.toString());
            }
        }
    }

    /* renamed from: com.google.protobuf.RopeByteString$c */
    public static final class C16848c implements Iterator<ByteString.LeafByteString> {

        /* renamed from: b */
        public final ArrayDeque<RopeByteString> f37166b;

        /* renamed from: c */
        public ByteString.LeafByteString f37167c;

        public C16848c(ByteString byteString) {
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.getTreeDepth());
                this.f37166b = arrayDeque;
                arrayDeque.push(ropeByteString);
                ByteString access$400 = ropeByteString.left;
                while (access$400 instanceof RopeByteString) {
                    RopeByteString ropeByteString2 = (RopeByteString) access$400;
                    this.f37166b.push(ropeByteString2);
                    access$400 = ropeByteString2.left;
                }
                this.f37167c = (ByteString.LeafByteString) access$400;
                return;
            }
            this.f37166b = null;
            this.f37167c = (ByteString.LeafByteString) byteString;
        }

        /* renamed from: a */
        public final ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString;
            ByteString.LeafByteString leafByteString2 = this.f37167c;
            if (leafByteString2 != null) {
                while (true) {
                    ArrayDeque<RopeByteString> arrayDeque = this.f37166b;
                    if (arrayDeque != null && !arrayDeque.isEmpty()) {
                        ByteString access$500 = this.f37166b.pop().right;
                        while (access$500 instanceof RopeByteString) {
                            RopeByteString ropeByteString = (RopeByteString) access$500;
                            this.f37166b.push(ropeByteString);
                            access$500 = ropeByteString.left;
                        }
                        leafByteString = (ByteString.LeafByteString) access$500;
                        if (!leafByteString.isEmpty()) {
                            break;
                        }
                    } else {
                        leafByteString = null;
                    }
                }
                leafByteString = null;
                this.f37167c = leafByteString;
                return leafByteString2;
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            return this.f37167c != null;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, C16846a aVar) {
        this(byteString, byteString2);
    }

    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString2.size() + byteString.size();
        if (size < 128) {
            int size2 = byteString.size();
            int size3 = byteString2.size();
            byte[] bArr = new byte[(size2 + size3)];
            byteString.copyTo(bArr, 0, 0, size2);
            byteString2.copyTo(bArr, 0, size2, size3);
            return ByteString.wrap(bArr);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (byteString2.size() + ropeByteString.right.size() < 128) {
                ByteString byteString3 = ropeByteString.right;
                int size4 = byteString3.size();
                int size5 = byteString2.size();
                byte[] bArr2 = new byte[(size4 + size5)];
                byteString3.copyTo(bArr2, 0, 0, size4);
                byteString2.copyTo(bArr2, 0, size4, size5);
                return new RopeByteString(ropeByteString.left, ByteString.wrap(bArr2));
            } else if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size >= minLength(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new RopeByteString(byteString, byteString2);
        }
        C16847b bVar = new C16847b();
        bVar.mo59798a(byteString);
        bVar.mo59798a(byteString2);
        ByteString pop = bVar.f37165a.pop();
        while (!bVar.f37165a.isEmpty()) {
            pop = new RopeByteString(bVar.f37165a.pop(), pop, (C16846a) null);
        }
        return pop;
    }

    public static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        return i >= iArr.length ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iArr[i];
    }

    public static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ByteString.LeafByteString leafByteString;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(getTreeDepth());
        arrayDeque.push(this);
        ByteString access$400 = this.left;
        while (access$400 instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) access$400;
            arrayDeque.push(ropeByteString);
            access$400 = ropeByteString.left;
        }
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) access$400;
        while (true) {
            if (!(leafByteString2 != null)) {
                return arrayList;
            }
            if (leafByteString2 != null) {
                while (true) {
                    if (!arrayDeque.isEmpty()) {
                        ByteString access$500 = ((RopeByteString) arrayDeque.pop()).right;
                        while (access$500 instanceof RopeByteString) {
                            RopeByteString ropeByteString2 = (RopeByteString) access$500;
                            arrayDeque.push(ropeByteString2);
                            access$500 = ropeByteString2.left;
                        }
                        leafByteString = (ByteString.LeafByteString) access$500;
                        if (!leafByteString.isEmpty()) {
                            break;
                        }
                    } else {
                        leafByteString = null;
                        break;
                    }
                }
                arrayList.add(leafByteString2.asReadOnlyByteBuffer());
                leafByteString2 = leafByteString;
            } else {
                throw new NoSuchElementException();
            }
        }
    }

    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.right.copyToInternal(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = byteString.peekCachedHashCode();
        if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
            return false;
        }
        C16848c cVar = new C16848c(this);
        ByteString.LeafByteString a = cVar.next();
        C16848c cVar2 = new C16848c(byteString);
        ByteString.LeafByteString a2 = cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = a.size() - i;
            int size2 = a2.size() - i2;
            int min = Math.min(size, size2);
            if (!(i == 0 ? a.equalsRange(a2, i2, min) : a2.equalsRange(a, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 < i4) {
                if (min == size) {
                    a = cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    a2 = cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int getTreeDepth() {
        return this.treeDepth;
    }

    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        return i < i2 ? this.left.internalByteAt(i) : this.right.internalByteAt(i - i2);
    }

    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    public C16900i newCodedInput() {
        return new C16900i.C16902b(new C16849d());
    }

    public InputStream newInput() {
        return new C16849d();
    }

    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    public int size() {
        return this.totalLength;
    }

    public ByteString substring(int i, int i2) {
        int checkRange = ByteString.checkRange(i, i2, this.totalLength);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        return i2 <= i3 ? this.left.substring(i, i2) : i >= i3 ? this.right.substring(i - i3, i2 - i3) : new RopeByteString(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else if (i >= i4) {
            this.right.writeToInternal(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    public void writeToReverse(C16898h hVar) throws IOException {
        this.right.writeToReverse(hVar);
        this.left.writeToReverse(hVar);
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = byteString2.size() + size;
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public ByteString.C16816f iterator() {
        return new C16846a(this);
    }

    public void writeTo(C16898h hVar) throws IOException {
        this.left.writeTo(hVar);
        this.right.writeTo(hVar);
    }

    /* renamed from: com.google.protobuf.RopeByteString$d */
    public class C16849d extends InputStream {

        /* renamed from: b */
        public C16848c f37168b;

        /* renamed from: c */
        public ByteString.LeafByteString f37169c;

        /* renamed from: d */
        public int f37170d;

        /* renamed from: e */
        public int f37171e = 0;

        /* renamed from: f */
        public int f37172f = 0;

        /* renamed from: g */
        public int f37173g;

        public C16849d() {
            C16848c cVar = new C16848c(RopeByteString.this);
            this.f37168b = cVar;
            ByteString.LeafByteString a = cVar.next();
            this.f37169c = a;
            this.f37170d = a.size();
        }

        /* renamed from: a */
        public final void mo59803a() {
            int i;
            if (this.f37169c != null && this.f37171e == (i = this.f37170d)) {
                this.f37172f += i;
                this.f37171e = 0;
                if (this.f37168b.hasNext()) {
                    ByteString.LeafByteString a = this.f37168b.next();
                    this.f37169c = a;
                    this.f37170d = a.size();
                    return;
                }
                this.f37169c = null;
                this.f37170d = 0;
            }
        }

        public final int available() throws IOException {
            return RopeByteString.this.size() - (this.f37172f + this.f37171e);
        }

        /* renamed from: b */
        public final int mo59805b(int i, int i2, byte[] bArr) {
            int i3 = i2;
            while (i3 > 0) {
                mo59803a();
                if (this.f37169c == null) {
                    break;
                }
                int min = Math.min(this.f37170d - this.f37171e, i3);
                if (bArr != null) {
                    this.f37169c.copyTo(bArr, this.f37171e, i, min);
                    i += min;
                }
                this.f37171e += min;
                i3 -= min;
            }
            return i2 - i3;
        }

        public final void mark(int i) {
            this.f37173g = this.f37172f + this.f37171e;
        }

        public final boolean markSupported() {
            return true;
        }

        public final int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            int b = mo59805b(i, i2, bArr);
            if (b != 0) {
                return b;
            }
            if (i2 <= 0) {
                if (RopeByteString.this.size() - (this.f37172f + this.f37171e) == 0) {
                    return -1;
                }
                return b;
            }
            return -1;
        }

        public final synchronized void reset() {
            C16848c cVar = new C16848c(RopeByteString.this);
            this.f37168b = cVar;
            ByteString.LeafByteString a = cVar.next();
            this.f37169c = a;
            this.f37170d = a.size();
            this.f37171e = 0;
            this.f37172f = 0;
            mo59805b(0, this.f37173g, (byte[]) null);
        }

        public final long skip(long j) {
            if (j >= 0) {
                if (j > ParserMinimalBase.MAX_INT_L) {
                    j = 2147483647L;
                }
                return (long) mo59805b(0, (int) j, (byte[]) null);
            }
            throw new IndexOutOfBoundsException();
        }

        public final int read() throws IOException {
            mo59803a();
            ByteString.LeafByteString leafByteString = this.f37169c;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f37171e;
            this.f37171e = i + 1;
            return leafByteString.byteAt(i) & 255;
        }
    }
}
