package p756lr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
import kotlin.collections.C19289b;
import kotlin.collections.C19315h;
import kotlin.collections.C19323p;
import kotlin.jvm.internal.C19383o;
import okio.ByteString;
import p568fn.C17782b;

/* renamed from: lr.t */
public final class C19908t extends C19289b<ByteString> implements RandomAccess {

    /* renamed from: d */
    public static final C19909a f43902d = new C19909a();

    /* renamed from: b */
    public final ByteString[] f43903b;

    /* renamed from: c */
    public final int[] f43904c;

    /* renamed from: lr.t$a */
    public static final class C19909a {
        /* renamed from: a */
        public static void m34004a(long j, C19893f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            int i4;
            int i5;
            int i6;
            long j2;
            int i7;
            C19893f fVar2;
            C19893f fVar3 = fVar;
            int i8 = i;
            ArrayList arrayList3 = arrayList;
            int i9 = i2;
            int i10 = i3;
            ArrayList arrayList4 = arrayList2;
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((ByteString) arrayList3.get(i11)).size() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                ByteString byteString = (ByteString) arrayList.get(i2);
                ByteString byteString2 = (ByteString) arrayList3.get(i10 - 1);
                int i12 = -1;
                if (i8 == byteString.size()) {
                    int intValue = ((Number) arrayList4.get(i9)).intValue();
                    int i13 = i9 + 1;
                    ByteString byteString3 = (ByteString) arrayList3.get(i13);
                    i4 = i13;
                    i5 = intValue;
                    byteString = byteString3;
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (byteString.getByte(i8) != byteString2.getByte(i8)) {
                    int i14 = 1;
                    for (int i15 = i4 + 1; i15 < i10; i15++) {
                        if (((ByteString) arrayList3.get(i15 - 1)).getByte(i8) != ((ByteString) arrayList3.get(i15)).getByte(i8)) {
                            i14++;
                        }
                    }
                    long j3 = (long) 4;
                    long j4 = ((long) (i14 * 2)) + (fVar3.f43876c / j3) + j + ((long) 2);
                    fVar3.mo72711C0(i14);
                    fVar3.mo72711C0(i5);
                    for (int i16 = i4; i16 < i10; i16++) {
                        byte b = ((ByteString) arrayList3.get(i16)).getByte(i8);
                        if (i16 == i4 || b != ((ByteString) arrayList3.get(i16 - 1)).getByte(i8)) {
                            fVar3.mo72711C0(b & 255);
                        }
                    }
                    C19893f fVar4 = new C19893f();
                    while (i4 < i10) {
                        byte b2 = ((ByteString) arrayList3.get(i4)).getByte(i8);
                        int i17 = i4 + 1;
                        int i18 = i17;
                        while (true) {
                            if (i18 >= i10) {
                                i6 = i10;
                                break;
                            } else if (b2 != ((ByteString) arrayList3.get(i18)).getByte(i8)) {
                                i6 = i18;
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i17 == i6 && i8 + 1 == ((ByteString) arrayList3.get(i4)).size()) {
                            fVar3.mo72711C0(((Number) arrayList4.get(i4)).intValue());
                            i7 = i6;
                            fVar2 = fVar4;
                            j2 = j3;
                        } else {
                            fVar3.mo72711C0(((int) ((fVar4.f43876c / j3) + j4)) * i12);
                            i7 = i6;
                            fVar2 = fVar4;
                            j2 = j3;
                            m34004a(j4, fVar4, i8 + 1, arrayList, i4, i7, arrayList2);
                        }
                        fVar4 = fVar2;
                        i4 = i7;
                        j3 = j2;
                        i12 = -1;
                    }
                    fVar3.mo72764w0(fVar4);
                    return;
                }
                int min = Math.min(byteString.size(), byteString2.size());
                int i19 = i8;
                int i20 = 0;
                while (i19 < min && byteString.getByte(i19) == byteString2.getByte(i19)) {
                    i20++;
                    i19++;
                }
                long j5 = (long) 4;
                long j6 = (fVar3.f43876c / j5) + j + ((long) 2) + ((long) i20) + 1;
                fVar3.mo72711C0(-i20);
                fVar3.mo72711C0(i5);
                int i21 = i8 + i20;
                while (i8 < i21) {
                    fVar3.mo72711C0(byteString.getByte(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i21 == ((ByteString) arrayList3.get(i4)).size()) {
                        fVar3.mo72711C0(((Number) arrayList4.get(i4)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C19893f fVar5 = new C19893f();
                fVar3.mo72711C0(((int) ((fVar5.f43876c / j5) + j6)) * -1);
                m34004a(j6, fVar5, i21, arrayList, i4, i3, arrayList2);
                fVar3.mo72764w0(fVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        public static C19908t m34005b(ByteString... byteStringArr) {
            int i = 0;
            if (byteStringArr.length == 0) {
                return new C19908t(new ByteString[0], new int[]{0, -1});
            }
            ArrayList arrayList = new ArrayList(new C19315h(byteStringArr, false));
            C19323p.m32626H0(arrayList);
            ArrayList arrayList2 = new ArrayList(byteStringArr.length);
            for (ByteString byteString : byteStringArr) {
                arrayList2.add(-1);
            }
            Object[] array = arrayList2.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                ArrayList f0 = C17782b.m29866f0((Integer[]) Arrays.copyOf(numArr, numArr.length));
                int length = byteStringArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    f0.set(C17782b.m29896y(arrayList, byteStringArr[i2]), Integer.valueOf(i3));
                    i2++;
                    i3++;
                }
                if (((ByteString) arrayList.get(0)).size() > 0) {
                    int i4 = 0;
                    while (i4 < arrayList.size()) {
                        ByteString byteString2 = (ByteString) arrayList.get(i4);
                        int i5 = i4 + 1;
                        int i6 = i5;
                        while (i6 < arrayList.size()) {
                            ByteString byteString3 = (ByteString) arrayList.get(i6);
                            if (!byteString3.startsWith(byteString2)) {
                                continue;
                                break;
                            }
                            if (!(byteString3.size() != byteString2.size())) {
                                throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                            } else if (((Number) f0.get(i6)).intValue() > ((Number) f0.get(i4)).intValue()) {
                                arrayList.remove(i6);
                                f0.remove(i6);
                            } else {
                                i6++;
                            }
                        }
                        i4 = i5;
                    }
                    C19893f fVar = new C19893f();
                    m34004a(0, fVar, 0, arrayList, 0, arrayList.size(), f0);
                    int[] iArr = new int[((int) (fVar.f43876c / ((long) 4)))];
                    while (!fVar.mo72733e0()) {
                        iArr[i] = fVar.readInt();
                        i++;
                    }
                    Object[] copyOf = Arrays.copyOf(byteStringArr, byteStringArr.length);
                    C19383o.m32796f(copyOf, "java.util.Arrays.copyOf(this, size)");
                    return new C19908t((ByteString[]) copyOf, iArr);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public C19908t(ByteString[] byteStringArr, int[] iArr) {
        this.f43903b = byteStringArr;
        this.f43904c = iArr;
    }

    /* renamed from: a */
    public final int mo5763a() {
        return this.f43903b.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    public final Object get(int i) {
        return this.f43903b[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
