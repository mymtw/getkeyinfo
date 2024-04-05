package p758mr;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import p756lr.C19893f;
import p756lr.C19908t;
import p756lr.C19915y;

/* renamed from: mr.a */
public final class C19918a {

    /* renamed from: a */
    public static final byte[] f43933a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
        f43933a = bytes;
    }

    /* renamed from: a */
    public static final boolean m34061a(C19915y yVar, int i, byte[] bArr, int i2) {
        int i3 = yVar.f43922c;
        byte[] bArr2 = yVar.f43920a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                yVar = yVar.f43925f;
                C19383o.m32794d(yVar);
                byte[] bArr3 = yVar.f43920a;
                bArr2 = bArr3;
                i = yVar.f43921b;
                i3 = yVar.f43922c;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: b */
    public static final String m34062b(C19893f fVar, long j) {
        C19383o.m32797g(fVar, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (fVar.mo72738h(j2) == ((byte) 13)) {
                String M = fVar.mo72720M(j2);
                fVar.skip(2);
                return M;
            }
        }
        String M2 = fVar.mo72720M(j);
        fVar.skip(1);
        return M2;
    }

    /* renamed from: c */
    public static final int m34063c(C19893f fVar, C19908t tVar, boolean z) {
        int i;
        int i2;
        int i3;
        C19915y yVar;
        int i4;
        C19893f fVar2 = fVar;
        C19908t tVar2 = tVar;
        C19383o.m32797g(fVar2, "$this$selectPrefix");
        C19383o.m32797g(tVar2, ResponseConstants.OPTIONS);
        C19915y yVar2 = fVar2.f43875b;
        if (yVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = yVar2.f43920a;
        int i5 = yVar2.f43921b;
        int i6 = yVar2.f43922c;
        int[] iArr = tVar2.f43904c;
        C19915y yVar3 = yVar2;
        int i7 = -1;
        int i8 = 0;
        loop0:
        while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (yVar3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = (i10 * -1) + i11;
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & 255) != iArr[i11]) {
                        return i7;
                    }
                    boolean z2 = i15 == i13;
                    if (i14 == i6) {
                        C19383o.m32794d(yVar3);
                        C19915y yVar4 = yVar3.f43925f;
                        C19383o.m32794d(yVar4);
                        i4 = yVar4.f43921b;
                        byte[] bArr2 = yVar4.f43920a;
                        i3 = yVar4.f43922c;
                        if (yVar4 != yVar2) {
                            byte[] bArr3 = bArr2;
                            yVar = yVar4;
                            bArr = bArr3;
                        } else if (!z2) {
                            break loop0;
                        } else {
                            bArr = bArr2;
                            yVar = null;
                        }
                    } else {
                        C19915y yVar5 = yVar3;
                        i3 = i6;
                        i4 = i14;
                        yVar = yVar5;
                    }
                    if (z2) {
                        i2 = iArr[i15];
                        i = i4;
                        i6 = i3;
                        yVar3 = yVar;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    i11 = i15;
                    yVar3 = yVar;
                }
            } else {
                i = i5 + 1;
                byte b = bArr[i5] & 255;
                int i16 = i11 + i10;
                while (i11 != i16) {
                    if (b == iArr[i11]) {
                        i2 = iArr[i11 + i10];
                        if (i == i6) {
                            yVar3 = yVar3.f43925f;
                            C19383o.m32794d(yVar3);
                            i = yVar3.f43921b;
                            bArr = yVar3.f43920a;
                            i6 = yVar3.f43922c;
                            if (yVar3 == yVar2) {
                                yVar3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
