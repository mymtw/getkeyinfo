package androidx.compose.p015ui.text.platform.extensions;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C1933b;
import androidx.compose.p015ui.text.C2012n;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p015ui.text.android.style.FontFeatureSpan;
import androidx.compose.p015ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p015ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.p015ui.text.android.style.ShadowSpan;
import androidx.compose.p015ui.text.android.style.SkewXSpan;
import androidx.compose.p015ui.text.android.style.TextDecorationSpan;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.text.style.C2025a;
import androidx.compose.p015ui.text.style.C2030e;
import androidx.compose.p015ui.text.style.C2032g;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import p157k0.C7175c;
import p173m.C7279a;
import p174m0.C7282b;
import p174m0.C7292j;
import p174m0.C7293k;
import p288y.C8343c;
import p628nj.C18263b;
import p753kq.C19863r;

/* renamed from: androidx.compose.ui.text.platform.extensions.c */
public final class C2020c {
    /* renamed from: a */
    public static final float m4442a(long j, float f, C7282b bVar) {
        long b = C7292j.m13998b(j);
        if (C7293k.m14001a(b, 4294967296L)) {
            return bVar.mo3793b0(j);
        }
        if (C7293k.m14001a(b, 8589934592L)) {
            return C7292j.m13999c(j) * f;
        }
        return Float.NaN;
    }

    /* renamed from: b */
    public static final void m4443b(SpannableString spannableString, long j, int i, int i2) {
        if (j != C1545s.f3364i) {
            m4446e(spannableString, new BackgroundColorSpan(C18263b.m30859o0(j)), i, i2);
        }
    }

    /* renamed from: c */
    public static final void m4444c(SpannableString spannableString, long j, int i, int i2) {
        if (j != C1545s.f3364i) {
            m4446e(spannableString, new ForegroundColorSpan(C18263b.m30859o0(j)), i, i2);
        }
    }

    /* renamed from: d */
    public static final void m4445d(SpannableString spannableString, long j, C7282b bVar, int i, int i2) {
        C19383o.m32797g(bVar, "density");
        long b = C7292j.m13998b(j);
        if (C7293k.m14001a(b, 4294967296L)) {
            m4446e(spannableString, new AbsoluteSizeSpan(C7279a.m13954l(bVar.mo3793b0(j)), false), i, i2);
        } else if (C7293k.m14001a(b, 8589934592L)) {
            m4446e(spannableString, new RelativeSizeSpan(C7292j.m13999c(j)), i, i2);
        }
    }

    /* renamed from: e */
    public static final void m4446e(Spannable spannable, Object obj, int i, int i2) {
        C19383o.m32797g(spannable, "<this>");
        C19383o.m32797g(obj, "span");
        spannable.setSpan(obj, i, i2, 33);
    }

    /* renamed from: f */
    public static final void m4447f(SpannableString spannableString, C2023s sVar, ArrayList arrayList, C7282b bVar, C19863r rVar) {
        C2012n nVar;
        C2012n nVar2;
        SpannableString spannableString2 = spannableString;
        C2023s sVar2 = sVar;
        ArrayList arrayList2 = arrayList;
        C7282b bVar2 = bVar;
        C19383o.m32797g(sVar2, "contextTextStyle");
        C19383o.m32797g(bVar2, "density");
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList2.get(i2);
            C1913a.C1916b bVar3 = (C1913a.C1916b) obj;
            if (!C1993m.m4354O((C2012n) bVar3.f4308a) && ((C2012n) bVar3.f4308a).f4540e == null) {
                z = false;
            }
            if (z) {
                arrayList3.add(obj);
            }
            i2++;
        }
        if (C1993m.m4354O(sVar2.f4599a) || sVar2.f4599a.f4540e != null) {
            C2012n nVar3 = sVar2.f4599a;
            nVar = new C2012n(0, 0, nVar3.f4538c, nVar3.f4539d, nVar3.f4540e, nVar3.f4541f, (String) null, 0, (C2025a) null, (C2032g) null, (C7175c) null, 0, (C2030e) null, (C1528j0) null, 16323);
        } else {
            nVar = null;
        }
        SpannableExtensions_androidKt$setFontAttributes$1 spannableExtensions_androidKt$setFontAttributes$1 = new SpannableExtensions_androidKt$setFontAttributes$1(spannableString2, rVar);
        if (arrayList3.size() > 1) {
            int size2 = arrayList3.size();
            int i3 = size2 * 2;
            Integer[] numArr = new Integer[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                numArr[i4] = 0;
            }
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                C1913a.C1916b bVar4 = (C1913a.C1916b) arrayList3.get(i5);
                numArr[i5] = Integer.valueOf(bVar4.f4309b);
                numArr[i5 + size2] = Integer.valueOf(bVar4.f4310c);
            }
            Comparable[] comparableArr = (Comparable[]) numArr;
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            int intValue = ((Number) C19318k.m32612d1(numArr)).intValue();
            int i6 = 0;
            while (i6 < i3) {
                int intValue2 = numArr[i6].intValue();
                if (intValue2 == intValue) {
                    nVar2 = nVar;
                } else {
                    int size4 = arrayList3.size();
                    int i7 = i;
                    C2012n nVar4 = nVar;
                    while (i7 < size4) {
                        C1913a.C1916b bVar5 = (C1913a.C1916b) arrayList3.get(i7);
                        int i8 = bVar5.f4309b;
                        C2012n nVar5 = nVar;
                        int i9 = bVar5.f4310c;
                        if (i8 != i9 && C1933b.m4232b(intValue, intValue2, i8, i9)) {
                            C2012n nVar6 = (C2012n) bVar5.f4308a;
                            if (nVar4 != null) {
                                nVar6 = nVar4.mo7714c(nVar6);
                            }
                            nVar4 = nVar6;
                        }
                        i7++;
                        nVar = nVar5;
                    }
                    nVar2 = nVar;
                    if (nVar4 != null) {
                        spannableExtensions_androidKt$setFontAttributes$1.invoke(nVar4, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                    }
                    intValue = intValue2;
                }
                i6++;
                nVar = nVar2;
                i = 0;
            }
        } else if (!arrayList3.isEmpty()) {
            C2012n nVar7 = (C2012n) ((C1913a.C1916b) arrayList3.get(0)).f4308a;
            if (nVar != null) {
                nVar7 = nVar.mo7714c(nVar7);
            }
            spannableExtensions_androidKt$setFontAttributes$1.invoke(nVar7, Integer.valueOf(((C1913a.C1916b) arrayList3.get(0)).f4309b), Integer.valueOf(((C1913a.C1916b) arrayList3.get(0)).f4310c));
        }
        ArrayList arrayList4 = new ArrayList();
        int size5 = arrayList.size();
        for (int i10 = 0; i10 < size5; i10++) {
            C1913a.C1916b bVar6 = (C1913a.C1916b) arrayList2.get(i10);
            int i11 = bVar6.f4309b;
            int i12 = bVar6.f4310c;
            if (i11 >= 0 && i11 < spannableString.length() && i12 > i11 && i12 <= spannableString.length()) {
                int i13 = bVar6.f4309b;
                int i14 = bVar6.f4310c;
                C2012n nVar8 = (C2012n) bVar6.f4308a;
                C2025a aVar = nVar8.f4544i;
                if (aVar != null) {
                    m4446e(spannableString2, new BaselineShiftSpan(aVar.f4603a), i13, i14);
                }
                m4444c(spannableString2, nVar8.mo7712a(), i13, i14);
                nVar8.f4536a.mo7766d();
                C2030e eVar = nVar8.f4548m;
                if (eVar != null) {
                    int i15 = eVar.f4615a;
                    boolean z2 = (1 | i15) == i15;
                    int i16 = eVar.f4615a;
                    m4446e(spannableString2, new TextDecorationSpan(z2, (2 | i16) == i16), i13, i14);
                }
                m4445d(spannableString, nVar8.f4537b, bVar, i13, i14);
                String str = nVar8.f4542g;
                if (str != null) {
                    m4446e(spannableString2, new FontFeatureSpan(str), i13, i14);
                }
                C2032g gVar = nVar8.f4545j;
                if (gVar != null) {
                    m4446e(spannableString2, new ScaleXSpan(gVar.f4618a), i13, i14);
                    m4446e(spannableString2, new SkewXSpan(gVar.f4619b), i13, i14);
                }
                C7175c cVar = nVar8.f4546k;
                if (cVar != null) {
                    m4446e(spannableString2, C2018a.f4585a.mo7729a(cVar), i13, i14);
                }
                m4443b(spannableString2, nVar8.f4547l, i13, i14);
                C1528j0 j0Var = nVar8.f4549n;
                if (j0Var != null) {
                    m4446e(spannableString2, new ShadowSpan(C18263b.m30859o0(j0Var.f3323a), C8343c.m16642c(j0Var.f3324b), C8343c.m16643d(j0Var.f3324b), j0Var.f3325c), i13, i14);
                }
                long j = nVar8.f4543h;
                long b = C7292j.m13998b(j);
                MetricAffectingSpan letterSpacingSpanPx = C7293k.m14001a(b, 4294967296L) ? new LetterSpacingSpanPx(bVar2.mo3793b0(j)) : C7293k.m14001a(b, 8589934592L) ? new LetterSpacingSpanEm(C7292j.m13999c(j)) : null;
                if (letterSpacingSpanPx != null) {
                    arrayList4.add(new C2019b(letterSpacingSpanPx, i13, i14));
                }
            }
        }
        int size6 = arrayList4.size();
        for (int i17 = 0; i17 < size6; i17++) {
            C2019b bVar7 = (C2019b) arrayList4.get(i17);
            m4446e(spannableString2, bVar7.f4586a, bVar7.f4587b, bVar7.f4588c);
        }
    }
}
