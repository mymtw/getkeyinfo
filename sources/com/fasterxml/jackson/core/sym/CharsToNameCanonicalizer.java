package com.fasterxml.jackson.core.sym;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

public final class CharsToNameCanonicalizer {
    private static final int DEFAULT_T_SIZE = 64;
    public static final int HASH_MULT = 33;
    public static final int MAX_COLL_CHAIN_LENGTH = 100;
    public static final int MAX_ENTRIES_FOR_REUSE = 12000;
    private static final int MAX_T_SIZE = 65536;
    /* access modifiers changed from: private */
    public C12511a[] _buckets;
    private boolean _canonicalize;
    private final int _flags;
    private boolean _hashShared;
    private int _indexMask;
    /* access modifiers changed from: private */
    public int _longestCollisionList;
    private BitSet _overflows;
    private final CharsToNameCanonicalizer _parent;
    private final int _seed;
    /* access modifiers changed from: private */
    public int _size;
    private int _sizeThreshold;
    /* access modifiers changed from: private */
    public String[] _symbols;
    private final AtomicReference<C12512b> _tableInfo;

    /* renamed from: com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$a */
    public static final class C12511a {

        /* renamed from: a */
        public final String f27629a;

        /* renamed from: b */
        public final C12511a f27630b;

        /* renamed from: c */
        public final int f27631c;

        public C12511a(String str, C12511a aVar) {
            this.f27629a = str;
            this.f27630b = aVar;
            this.f27631c = aVar != null ? 1 + aVar.f27631c : 1;
        }

        /* renamed from: a */
        public final String mo41747a(int i, char[] cArr, int i2) {
            if (this.f27629a.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.f27629a.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.f27629a;
                }
            }
            return null;
        }
    }

    private CharsToNameCanonicalizer(int i) {
        this._parent = null;
        this._seed = i;
        this._canonicalize = true;
        this._flags = -1;
        this._hashShared = false;
        this._longestCollisionList = 0;
        this._tableInfo = new AtomicReference<>(new C12512b(new String[64], new C12511a[32]));
    }

    private String _addSymbol(char[] cArr, int i, int i2, int i3, int i4) {
        if (this._hashShared) {
            copyArrays();
            this._hashShared = false;
        } else if (this._size >= this._sizeThreshold) {
            rehash();
            i4 = _hashToIndex(calcHash(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this._flags)) {
            str = InternCache.instance.intern(str);
        }
        this._size++;
        String[] strArr = this._symbols;
        if (strArr[i4] == null) {
            strArr[i4] = str;
        } else {
            int i5 = i4 >> 1;
            C12511a[] aVarArr = this._buckets;
            C12511a aVar = new C12511a(str, aVarArr[i5]);
            int i6 = aVar.f27631c;
            if (i6 > 100) {
                _handleSpillOverflow(i5, aVar, i4);
            } else {
                aVarArr[i5] = aVar;
                this._longestCollisionList = Math.max(i6, this._longestCollisionList);
            }
        }
        return str;
    }

    private String _findSymbol2(char[] cArr, int i, int i2, C12511a aVar) {
        while (aVar != null) {
            String a = aVar.mo41747a(i, cArr, i2);
            if (a != null) {
                return a;
            }
            aVar = aVar.f27630b;
        }
        return null;
    }

    private void _handleSpillOverflow(int i, C12511a aVar, int i2) {
        BitSet bitSet = this._overflows;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this._overflows = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this._flags)) {
                reportTooManyCollisions(100);
            }
            this._canonicalize = false;
        } else {
            this._overflows.set(i);
        }
        this._symbols[i2] = aVar.f27629a;
        this._buckets[i] = null;
        this._size -= aVar.f27631c;
        this._longestCollisionList = -1;
    }

    private static int _thresholdSize(int i) {
        return i - (i >> 2);
    }

    private void copyArrays() {
        String[] strArr = this._symbols;
        this._symbols = (String[]) Arrays.copyOf(strArr, strArr.length);
        C12511a[] aVarArr = this._buckets;
        this._buckets = (C12511a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    public static CharsToNameCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022 A[LOOP:0: B:7:0x0022->B:10:0x002d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void mergeChild(com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.C12512b r4) {
        /*
            r3 = this;
            int r0 = r4.f27632a
            java.util.concurrent.atomic.AtomicReference<com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$b> r1 = r3._tableInfo
            java.lang.Object r1 = r1.get()
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$b r1 = (com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.C12512b) r1
            int r2 = r1.f27632a
            if (r0 != r2) goto L_0x000f
            return
        L_0x000f:
            r2 = 12000(0x2ee0, float:1.6816E-41)
            if (r0 <= r2) goto L_0x0020
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$b r4 = new com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$b
            r0 = 64
            java.lang.String[] r0 = new java.lang.String[r0]
            r2 = 32
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$a[] r2 = new com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.C12511a[r2]
            r4.<init>(r0, r2)
        L_0x0020:
            java.util.concurrent.atomic.AtomicReference<com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$b> r0 = r3._tableInfo
        L_0x0022:
            boolean r2 = r0.compareAndSet(r1, r4)
            if (r2 == 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L_0x0022
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.mergeChild(com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$b):void");
    }

    private void rehash() {
        int i = r1 + r1;
        if (i > 65536) {
            this._size = 0;
            this._canonicalize = false;
            this._symbols = new String[64];
            this._buckets = new C12511a[32];
            this._indexMask = 63;
            this._hashShared = false;
            return;
        }
        C12511a[] aVarArr = this._buckets;
        this._symbols = new String[i];
        this._buckets = new C12511a[(i >> 1)];
        this._indexMask = i - 1;
        this._sizeThreshold = _thresholdSize(i);
        int i2 = 0;
        int i3 = 0;
        for (String str : this._symbols) {
            if (str != null) {
                i2++;
                int _hashToIndex = _hashToIndex(calcHash(str));
                String[] strArr = this._symbols;
                if (strArr[_hashToIndex] == null) {
                    strArr[_hashToIndex] = str;
                } else {
                    int i4 = _hashToIndex >> 1;
                    C12511a[] aVarArr2 = this._buckets;
                    C12511a aVar = new C12511a(str, aVarArr2[i4]);
                    aVarArr2[i4] = aVar;
                    i3 = Math.max(i3, aVar.f27631c);
                }
            }
        }
        int i5 = r1 >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            for (C12511a aVar2 = aVarArr[i6]; aVar2 != null; aVar2 = aVar2.f27630b) {
                i2++;
                String str2 = aVar2.f27629a;
                int _hashToIndex2 = _hashToIndex(calcHash(str2));
                String[] strArr2 = this._symbols;
                if (strArr2[_hashToIndex2] == null) {
                    strArr2[_hashToIndex2] = str2;
                } else {
                    int i7 = _hashToIndex2 >> 1;
                    C12511a[] aVarArr3 = this._buckets;
                    C12511a aVar3 = new C12511a(str2, aVarArr3[i7]);
                    aVarArr3[i7] = aVar3;
                    i3 = Math.max(i3, aVar3.f27631c);
                }
            }
        }
        this._longestCollisionList = i3;
        this._overflows = null;
        if (i2 != this._size) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", new Object[]{Integer.valueOf(this._size), Integer.valueOf(i2)}));
        }
    }

    public int _hashToIndex(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this._indexMask;
    }

    public int bucketCount() {
        return this._symbols.length;
    }

    public int calcHash(char[] cArr, int i, int i2) {
        int i3 = this._seed;
        int i4 = i2 + i;
        while (i < i4) {
            i3 = (i3 * 33) + cArr[i];
            i++;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public int collisionCount() {
        int i = 0;
        for (C12511a aVar : this._buckets) {
            if (aVar != null) {
                i += aVar.f27631c;
            }
        }
        return i;
    }

    public String findSymbol(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this._canonicalize) {
            return new String(cArr, i, i2);
        }
        int _hashToIndex = _hashToIndex(i3);
        String str = this._symbols[_hashToIndex];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            C12511a aVar = this._buckets[_hashToIndex >> 1];
            if (aVar != null) {
                String a = aVar.mo41747a(i, cArr, i2);
                if (a != null) {
                    return a;
                }
                String _findSymbol2 = _findSymbol2(cArr, i, i2, aVar.f27630b);
                if (_findSymbol2 != null) {
                    return _findSymbol2;
                }
            }
        }
        return _addSymbol(cArr, i, i2, i3, _hashToIndex);
    }

    public int hashSeed() {
        return this._seed;
    }

    public CharsToNameCanonicalizer makeChild(int i) {
        return new CharsToNameCanonicalizer(this, i, this._seed, this._tableInfo.get());
    }

    public int maxCollisionLength() {
        return this._longestCollisionList;
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (maybeDirty() && (charsToNameCanonicalizer = this._parent) != null && this._canonicalize) {
            charsToNameCanonicalizer.mergeChild(new C12512b(this));
            this._hashShared = true;
        }
    }

    public void reportTooManyCollisions(int i) {
        StringBuilder h = C0072d.m201h("Longest collision chain in symbol table (of size ");
        h.append(this._size);
        h.append(") now exceeds maximum, ");
        h.append(i);
        h.append(" -- suspect a DoS attack based on hash collisions");
        throw new IllegalStateException(h.toString());
    }

    public int size() {
        AtomicReference<C12512b> atomicReference = this._tableInfo;
        return atomicReference != null ? atomicReference.get().f27632a : this._size;
    }

    public void verifyInternalConsistency() {
        int i = 0;
        for (String str : this._symbols) {
            if (str != null) {
                i++;
            }
        }
        int i2 = r0 >> 1;
        for (int i3 = 0; i3 < i2; i3++) {
            for (C12511a aVar = this._buckets[i3]; aVar != null; aVar = aVar.f27630b) {
                i++;
            }
        }
        if (i != this._size) {
            throw new IllegalStateException(String.format("Internal error: expected internal size %d vs calculated count %d", new Object[]{Integer.valueOf(this._size), Integer.valueOf(i)}));
        }
    }

    public static CharsToNameCanonicalizer createRoot(int i) {
        return new CharsToNameCanonicalizer(i);
    }

    public int calcHash(String str) {
        int length = str.length();
        int i = this._seed;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$b */
    public static final class C12512b {

        /* renamed from: a */
        public final int f27632a;

        /* renamed from: b */
        public final int f27633b;

        /* renamed from: c */
        public final String[] f27634c;

        /* renamed from: d */
        public final C12511a[] f27635d;

        public C12512b(String[] strArr, C12511a[] aVarArr) {
            this.f27632a = 0;
            this.f27633b = 0;
            this.f27634c = strArr;
            this.f27635d = aVarArr;
        }

        public C12512b(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.f27632a = charsToNameCanonicalizer._size;
            this.f27633b = charsToNameCanonicalizer._longestCollisionList;
            this.f27634c = charsToNameCanonicalizer._symbols;
            this.f27635d = charsToNameCanonicalizer._buckets;
        }
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i, int i2, C12512b bVar) {
        this._parent = charsToNameCanonicalizer;
        this._seed = i2;
        this._tableInfo = null;
        this._flags = i;
        this._canonicalize = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        String[] strArr = bVar.f27634c;
        this._symbols = strArr;
        this._buckets = bVar.f27635d;
        this._size = bVar.f27632a;
        this._longestCollisionList = bVar.f27633b;
        int length = strArr.length;
        this._sizeThreshold = _thresholdSize(length);
        this._indexMask = length - 1;
        this._hashShared = true;
    }
}
