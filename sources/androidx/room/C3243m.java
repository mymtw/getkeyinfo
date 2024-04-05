package androidx.room;

import com.google.android.play.core.assetpacks.C15583b0;
import com.google.android.play.core.assetpacks.C15597e2;
import com.google.android.play.core.internal.C15682a0;
import com.google.android.play.core.internal.C15684b0;
import com.google.android.play.core.internal.C15686c0;
import java.util.ArrayList;
import java.util.List;
import p707wn.C18753a;
import p707wn.C18754b;

/* renamed from: androidx.room.m */
public final class C3243m implements C15686c0 {

    /* renamed from: b */
    public final Object f7539b;

    /* renamed from: c */
    public final Object f7540c;

    public /* synthetic */ C3243m(C15686c0 c0Var, C15682a0 a0Var) {
        this.f7539b = c0Var;
        this.f7540c = a0Var;
    }

    public /* synthetic */ C3243m(C18753a aVar) {
        this.f7539b = aVar;
        ArrayList arrayList = new ArrayList();
        this.f7540c = arrayList;
        arrayList.add(new C18754b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    public final void mo12040a(int i, int[] iArr) {
        C18754b bVar;
        int i2 = i;
        int[] iArr2 = iArr;
        if (i2 != 0) {
            int length = iArr2.length - i2;
            if (length > 0) {
                int i3 = 0;
                int i4 = 1;
                if (i2 >= ((List) this.f7540c).size()) {
                    List list = (List) this.f7540c;
                    C18754b bVar2 = (C18754b) list.get(list.size() - 1);
                    int size = ((List) this.f7540c).size();
                    while (size <= i2) {
                        C18753a aVar = (C18753a) this.f7539b;
                        int[] iArr3 = new int[2];
                        iArr3[i3] = i4;
                        iArr3[i4] = aVar.f41530a[(size - 1) + aVar.f41535f];
                        C18754b bVar3 = new C18754b(aVar, iArr3);
                        if (bVar2.f41536a.equals(aVar)) {
                            if (bVar2.mo70242b() || bVar3.mo70242b()) {
                                bVar2 = bVar2.f41536a.f41532c;
                            } else {
                                int[] iArr4 = bVar2.f41537b;
                                int length2 = iArr4.length;
                                int[] iArr5 = bVar3.f41537b;
                                int length3 = iArr5.length;
                                int[] iArr6 = new int[((length2 + length3) - 1)];
                                int i5 = i3;
                                while (i5 < length2) {
                                    int i6 = iArr4[i5];
                                    int i7 = i3;
                                    while (i7 < length3) {
                                        int i8 = i5 + i7;
                                        iArr6[i8] = bVar2.f41536a.mo70239a(i6, iArr5[i7]) ^ iArr6[i8];
                                        i7++;
                                        iArr4 = iArr4;
                                    }
                                    int[] iArr7 = iArr4;
                                    i5++;
                                    i3 = 0;
                                }
                                bVar2 = new C18754b(bVar2.f41536a, iArr6);
                            }
                            ((List) this.f7540c).add(bVar2);
                            size++;
                            i3 = 0;
                            i4 = 1;
                        } else {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                    }
                }
                C18754b bVar4 = (C18754b) ((List) this.f7540c).get(i2);
                int[] iArr8 = new int[length];
                System.arraycopy(iArr2, 0, iArr8, 0, length);
                C18754b c = new C18754b((C18753a) this.f7539b, iArr8).mo70243c(i2, 1);
                if (!c.f41536a.equals(bVar4.f41536a)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                } else if (!bVar4.mo70242b()) {
                    C18753a aVar2 = c.f41536a;
                    C18754b bVar5 = aVar2.f41532c;
                    int[] iArr9 = bVar4.f41537b;
                    int i9 = iArr9[(iArr9.length - 1) - (iArr9.length - 1)];
                    if (i9 != 0) {
                        int i10 = aVar2.f41530a[(aVar2.f41533d - aVar2.f41531b[i9]) - 1];
                        C18754b bVar6 = c;
                        while (bVar6.f41537b.length - 1 >= bVar4.f41537b.length - 1 && !bVar6.mo70242b()) {
                            int[] iArr10 = bVar6.f41537b;
                            int length4 = (iArr10.length - 1) - (bVar4.f41537b.length - 1);
                            int a = c.f41536a.mo70239a(iArr10[(iArr10.length - 1) - (iArr10.length - 1)], i10);
                            C18754b c2 = bVar4.mo70243c(length4, a);
                            C18753a aVar3 = c.f41536a;
                            aVar3.getClass();
                            if (length4 >= 0) {
                                if (a == 0) {
                                    bVar = aVar3.f41532c;
                                } else {
                                    int[] iArr11 = new int[(length4 + 1)];
                                    iArr11[0] = a;
                                    bVar = new C18754b(aVar3, iArr11);
                                }
                                bVar5 = bVar5.mo70241a(bVar);
                                bVar6 = bVar6.mo70241a(c2);
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        int[] iArr12 = bVar6.f41537b;
                        int length5 = i2 - iArr12.length;
                        for (int i11 = 0; i11 < length5; i11++) {
                            iArr2[length + i11] = 0;
                        }
                        System.arraycopy(iArr12, 0, iArr2, length + length5, iArr12.length);
                        return;
                    }
                    aVar2.getClass();
                    throw new ArithmeticException();
                } else {
                    throw new IllegalArgumentException("Divide by 0");
                }
            } else {
                throw new IllegalArgumentException("No data bytes provided");
            }
        } else {
            throw new IllegalArgumentException("No error correction bytes");
        }
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new C15597e2((C15583b0) ((C15686c0) this.f7539b).zza(), C15684b0.m25502a((C15686c0) this.f7540c));
    }
}
