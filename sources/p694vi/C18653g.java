package p694vi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p513bj.C14049b0;
import p636oi.C18296a;
import p636oi.C18300d;

/* renamed from: vi.g */
public final class C18653g implements C18300d {

    /* renamed from: b */
    public final C18650d f41258b;

    /* renamed from: c */
    public final long[] f41259c;

    /* renamed from: d */
    public final Map<String, C18652f> f41260d;

    /* renamed from: e */
    public final Map<String, C18651e> f41261e;

    /* renamed from: f */
    public final Map<String, String> f41262f;

    public C18653g(C18650d dVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f41258b = dVar;
        this.f41261e = hashMap2;
        this.f41262f = hashMap3;
        this.f41260d = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        dVar.mo70156d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f41259c = jArr;
    }

    /* renamed from: a */
    public final int mo69841a(long j) {
        int b = C14049b0.m21629b(this.f41259c, j, false);
        if (b < this.f41259c.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: c */
    public final List<C18296a> mo69842c(long j) {
        C18650d dVar = this.f41258b;
        Map<String, C18652f> map = this.f41260d;
        Map<String, C18651e> map2 = this.f41261e;
        Map<String, String> map3 = this.f41262f;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        dVar.mo70158g(j, dVar.f41223h, arrayList);
        TreeMap treeMap = new TreeMap();
        C18650d dVar2 = dVar;
        long j2 = j;
        dVar2.mo70160i(j2, false, dVar.f41223h, treeMap);
        dVar2.mo70159h(j2, map, map2, dVar.f41223h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C18651e eVar = map2.get(pair.first);
                eVar.getClass();
                C18296a.C18297a aVar = new C18296a.C18297a();
                aVar.f40165b = decodeByteArray;
                aVar.f40171h = eVar.f41230b;
                aVar.f40172i = 0;
                aVar.f40168e = eVar.f41231c;
                aVar.f40169f = 0;
                aVar.f40170g = eVar.f41233e;
                aVar.f40175l = eVar.f41234f;
                aVar.f40176m = eVar.f41235g;
                aVar.f40179p = eVar.f41238j;
                arrayList2.add(aVar.mo69838a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C18651e eVar2 = map2.get(entry.getKey());
            eVar2.getClass();
            C18296a.C18297a aVar2 = (C18296a.C18297a) entry.getValue();
            CharSequence charSequence = aVar2.f40164a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C18644a aVar3 : (C18644a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C18644a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar3), spannableStringBuilder.getSpanEnd(aVar3), "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == 10) {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == 10) {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = eVar2.f41231c;
            int i9 = eVar2.f41232d;
            aVar2.f40168e = f;
            aVar2.f40169f = i9;
            aVar2.f40170g = eVar2.f41233e;
            aVar2.f40171h = eVar2.f41230b;
            aVar2.f40175l = eVar2.f41234f;
            float f2 = eVar2.f41237i;
            int i10 = eVar2.f41236h;
            aVar2.f40174k = f2;
            aVar2.f40173j = i10;
            aVar2.f40179p = eVar2.f41238j;
            arrayList2.add(aVar2.mo69838a());
        }
        return arrayList2;
    }

    /* renamed from: e */
    public final long mo69843e(int i) {
        return this.f41259c[i];
    }

    /* renamed from: f */
    public final int mo69844f() {
        return this.f41259c.length;
    }
}
