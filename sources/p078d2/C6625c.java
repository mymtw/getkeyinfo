package p078d2;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.coroutines.C19543e0;
import p022b2.C3469a;
import p033c2.C4362a;
import p033c2.C4368e;
import p077d1.C6619c;
import p100f2.C6776b;
import p100f2.C6777c;
import p100f2.C6780d;
import p514bk.C14088a;

/* renamed from: d2.c */
public final class C6625c extends C6627d implements C6623a {

    /* renamed from: d */
    public Slice f14615d;

    /* renamed from: e */
    public boolean f14616e;

    /* renamed from: f */
    public boolean f14617f;

    /* renamed from: g */
    public boolean f14618g;

    /* renamed from: d2.c$a */
    public static class C6626a extends C6627d {

        /* renamed from: d */
        public C4368e f14619d;

        /* renamed from: e */
        public SliceItem f14620e;

        /* renamed from: f */
        public SliceItem f14621f;

        /* renamed from: g */
        public Slice f14622g;

        /* renamed from: h */
        public ArrayList<Slice> f14623h = new ArrayList<>();

        public C6626a(Slice.C3273a aVar) {
            super(aVar, (SliceSpec) null);
        }

        /* renamed from: e */
        public final void mo18812e(Slice.C3273a aVar) {
            Slice slice = this.f14622g;
            if (slice != null) {
                aVar.getClass();
                aVar.mo12106f(slice);
            }
            SliceItem sliceItem = this.f14620e;
            if (sliceItem != null) {
                aVar.mo12105e(sliceItem);
            }
            SliceItem sliceItem2 = this.f14621f;
            if (sliceItem2 != null) {
                aVar.mo12105e(sliceItem2);
            }
            for (int i = 0; i < this.f14623h.size(); i++) {
                Slice slice2 = this.f14623h.get(i);
                aVar.getClass();
                slice2.getClass();
                aVar.mo12106f(slice2);
            }
            C4368e eVar = this.f14619d;
            if (eVar != null) {
                eVar.mo14302a(aVar);
            }
        }
    }

    public C6625c(Slice.C3273a aVar, C3469a aVar2) {
        super(aVar, C14088a.f31023d, aVar2);
    }

    /* renamed from: a */
    public final void mo18808a() {
        this.f14624a.f7604b.add(new SliceItem(-1L, "long", "millis", new String[]{"ttl"}));
    }

    /* renamed from: b */
    public final void mo18809b(C4362a aVar) {
        SliceItem sliceItem;
        SliceItem sliceItem2;
        this.f14617f = true;
        this.f14618g = true;
        this.f14616e = true;
        Slice.C3273a aVar2 = new Slice.C3273a(this.f14624a);
        C4368e eVar = aVar.f9607e;
        aVar2.mo12104d(0, "layout_direction", new String[0]);
        CharSequence charSequence = aVar.f9603a;
        if (charSequence != null || aVar.f9604b) {
            boolean z = aVar.f9604b;
            sliceItem = new SliceItem(charSequence, "text", (String) null, new String[]{"title"});
            if (z) {
                sliceItem.mo12109b();
            }
        } else {
            sliceItem = null;
        }
        CharSequence charSequence2 = aVar.f9605c;
        if (charSequence2 != null || aVar.f9606d) {
            boolean z2 = aVar.f9606d;
            sliceItem2 = new SliceItem(charSequence2, "text", (String) null, new String[0]);
            if (z2) {
                sliceItem2.mo12109b();
            }
        } else {
            sliceItem2 = null;
        }
        aVar2.f7606d = null;
        if (sliceItem != null) {
            aVar2.mo12105e(sliceItem);
        }
        if (sliceItem2 != null) {
            aVar2.mo12105e(sliceItem2);
        }
        if (eVar != null) {
            eVar.mo14302a(aVar2);
        }
        if (sliceItem2 == null && sliceItem == null) {
            throw new IllegalStateException("Header requires a title or subtitle to be set.");
        }
        this.f14615d = aVar2.mo12108h();
    }

    /* renamed from: c */
    public final void mo18810c(PendingIntent pendingIntent) {
        Slice.C3273a aVar = this.f14624a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Uri.Builder appendPath = aVar.f7603a.buildUpon().appendPath("_gen");
        int i = aVar.f7607e;
        aVar.f7607e = i + 1;
        Uri build = appendPath.appendPath(String.valueOf(i)).build();
        arrayList2.addAll(Arrays.asList(new String[]{"see_more"}));
        Slice.C3273a aVar2 = this.f14624a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Uri.Builder appendPath2 = aVar2.f7603a.buildUpon().appendPath("_gen");
        int i2 = aVar2.f7607e;
        aVar2.f7607e = i2 + 1;
        Uri build2 = appendPath2.appendPath(String.valueOf(i2)).build();
        arrayList4.addAll(Arrays.asList(new String[]{"see_more"}));
        Slice slice = new Slice(arrayList3, (String[]) arrayList4.toArray(new String[arrayList4.size()]), build2, (SliceSpec) null);
        pendingIntent.getClass();
        arrayList.add(new SliceItem(new C6619c(pendingIntent, slice), ResponseConstants.ACTION, (String) null, (String[]) slice.mo12097c().toArray(new String[slice.mo12097c().size()])));
        aVar.mo12106f(new Slice(arrayList, (String[]) arrayList2.toArray(new String[arrayList2.size()]), build, (SliceSpec) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0114  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18811d(p033c2.C4367d r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            d2.c$a r2 = new d2.c$a
            androidx.slice.Slice$a r3 = new androidx.slice.Slice$a
            androidx.slice.Slice$a r4 = r0.f14624a
            r3.<init>((androidx.slice.Slice.C3273a) r4)
            r2.<init>(r3)
            r3 = 0
            r2.f14619d = r3
            int r4 = r1.f9616i
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L_0x0022
            androidx.slice.Slice$a r5 = r2.f14624a
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.String r8 = "layout_direction"
            r5.mo12104d(r4, r8, r7)
        L_0x0022:
            androidx.core.graphics.drawable.IconCompat r4 = r1.f9611d
            java.lang.String r5 = "long"
            java.lang.String r7 = "large"
            java.lang.String r8 = "no_tint"
            java.lang.String r9 = "title"
            java.lang.String r10 = "partial"
            java.lang.String r11 = "image"
            java.lang.String r13 = "_gen"
            if (r4 != 0) goto L_0x00a4
            boolean r14 = r1.f9609b
            if (r14 == 0) goto L_0x0039
            goto L_0x00a4
        L_0x0039:
            long r14 = r1.f9608a
            r16 = -1
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x009f
            androidx.slice.Slice$a r4 = r2.f14624a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.net.Uri r6 = r4.f7603a
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.appendPath(r13)
            int r0 = r4.f7607e
            r18 = r11
            int r11 = r0 + 1
            r4.f7607e = r11
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.net.Uri$Builder r0 = r6.appendPath(r0)
            android.net.Uri r0 = r0.build()
            r4 = 0
            java.lang.String[] r6 = new java.lang.String[r4]
            androidx.slice.SliceItem r4 = new androidx.slice.SliceItem
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            r14 = 0
            r4.<init>(r11, r5, r14, r6)
            r12.add(r4)
            java.lang.String[] r4 = new java.lang.String[]{r9}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.addAll(r4)
            androidx.slice.Slice r4 = new androidx.slice.Slice
            int r6 = r3.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r3 = r3.toArray(r6)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r4.<init>(r12, r3, r0, r14)
            r2.f14622g = r4
            r19 = r5
            r14 = r18
            goto L_0x013e
        L_0x009f:
            r19 = r5
            r14 = r11
            goto L_0x013e
        L_0x00a4:
            r18 = r11
            int r0 = r1.f9610c
            boolean r3 = r1.f9609b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r0 == 0) goto L_0x00b4
            r6.add(r8)
        L_0x00b4:
            r11 = 2
            if (r0 != r11) goto L_0x00ba
            r6.add(r7)
        L_0x00ba:
            if (r3 == 0) goto L_0x00bf
            r6.add(r10)
        L_0x00bf:
            androidx.slice.Slice$a r0 = r2.f14624a
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            android.net.Uri r14 = r0.f7603a
            android.net.Uri$Builder r14 = r14.buildUpon()
            android.net.Uri$Builder r14 = r14.appendPath(r13)
            int r15 = r0.f7607e
            r19 = r5
            int r5 = r15 + 1
            r0.f7607e = r5
            java.lang.String r0 = java.lang.String.valueOf(r15)
            android.net.Uri$Builder r0 = r14.appendPath(r0)
            android.net.Uri r0 = r0.build()
            r4.getClass()
            boolean r5 = androidx.slice.Slice.m7929d(r4)
            if (r5 == 0) goto L_0x0110
            int r5 = r6.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r6.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            boolean r6 = androidx.slice.Slice.m7929d(r4)
            if (r6 == 0) goto L_0x0110
            androidx.slice.SliceItem r6 = new androidx.slice.SliceItem
            r14 = r18
            r15 = 0
            r6.<init>(r4, r14, r15, r5)
            r11.add(r6)
            goto L_0x0112
        L_0x0110:
            r14 = r18
        L_0x0112:
            if (r3 == 0) goto L_0x011f
            java.lang.String[] r3 = new java.lang.String[]{r10}
            java.util.List r3 = java.util.Arrays.asList(r3)
            r12.addAll(r3)
        L_0x011f:
            java.lang.String[] r3 = new java.lang.String[]{r9}
            java.util.List r3 = java.util.Arrays.asList(r3)
            r12.addAll(r3)
            androidx.slice.Slice r3 = new androidx.slice.Slice
            int r4 = r12.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r4 = r12.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r5 = 0
            r3.<init>(r11, r4, r0, r5)
            r2.f14622g = r3
        L_0x013e:
            java.lang.CharSequence r0 = r1.f9612e
            java.lang.String r3 = "text"
            if (r0 != 0) goto L_0x0148
            boolean r4 = r1.f9613f
            if (r4 == 0) goto L_0x015b
        L_0x0148:
            boolean r4 = r1.f9613f
            androidx.slice.SliceItem r5 = new androidx.slice.SliceItem
            java.lang.String[] r6 = new java.lang.String[]{r9}
            r9 = 0
            r5.<init>(r0, r3, r9, r6)
            r2.f14620e = r5
            if (r4 == 0) goto L_0x015b
            r5.mo12109b()
        L_0x015b:
            java.lang.CharSequence r0 = r1.f9614g
            if (r0 != 0) goto L_0x0163
            boolean r4 = r1.f9615h
            if (r4 == 0) goto L_0x0175
        L_0x0163:
            boolean r4 = r1.f9615h
            androidx.slice.SliceItem r5 = new androidx.slice.SliceItem
            r6 = 0
            java.lang.String[] r9 = new java.lang.String[r6]
            r6 = 0
            r5.<init>(r0, r3, r6, r9)
            r2.f14621f = r5
            if (r4 == 0) goto L_0x0175
            r5.mo12109b()
        L_0x0175:
            java.util.ArrayList r0 = r1.f9617j
            java.util.ArrayList r3 = r1.f9618k
            java.util.ArrayList r1 = r1.f9619l
            r4 = 0
        L_0x017c:
            int r5 = r0.size()
            r6 = 1
            if (r4 >= r5) goto L_0x02f8
            java.lang.Object r5 = r3.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 == 0) goto L_0x028c
            if (r5 == r6) goto L_0x01e1
            r6 = 2
            if (r5 == r6) goto L_0x019c
        L_0x0194:
            r18 = r1
            r20 = r3
            r21 = r7
            goto L_0x0288
        L_0x019c:
            java.lang.Object r5 = r0.get(r4)
            c2.e r5 = (p033c2.C4368e) r5
            java.lang.Object r6 = r1.get(r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            androidx.slice.Slice$a r9 = new androidx.slice.Slice$a
            androidx.slice.Slice$a r11 = r2.f14624a
            r9.<init>((androidx.slice.Slice.C3273a) r11)
            if (r6 == 0) goto L_0x01bc
            java.lang.String[] r6 = new java.lang.String[]{r10}
            r9.mo12102b(r6)
        L_0x01bc:
            java.util.ArrayList<androidx.slice.Slice> r6 = r2.f14623h
            f2.a r5 = r5.f9620a
            r5.getClass()
            java.lang.String r11 = "shortcut"
            java.lang.String[] r11 = new java.lang.String[]{r11}
            r9.mo12102b(r11)
            android.app.PendingIntent r11 = r5.f14908a
            androidx.slice.Slice$a r5 = r5.mo18915a(r9)
            androidx.slice.Slice r5 = r5.mo12108h()
            r9.mo12101a(r11, r5)
            androidx.slice.Slice r5 = r9.mo12108h()
            r6.add(r5)
            goto L_0x0194
        L_0x01e1:
            java.lang.Object r5 = r0.get(r4)
            d1.c r5 = (p077d1.C6619c) r5
            F r6 = r5.f14606a
            androidx.core.graphics.drawable.IconCompat r6 = (androidx.core.graphics.drawable.IconCompat) r6
            S r5 = r5.f14607b
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r9 = r1.get(r4)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r5 == 0) goto L_0x0207
            r11.add(r8)
        L_0x0207:
            r12 = 2
            if (r5 != r12) goto L_0x020d
            r11.add(r7)
        L_0x020d:
            if (r9 == 0) goto L_0x0212
            r11.add(r10)
        L_0x0212:
            androidx.slice.Slice$a r5 = r2.f14624a
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r18 = r1
            android.net.Uri r1 = r5.f7603a
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.appendPath(r13)
            r20 = r3
            int r3 = r5.f7607e
            r21 = r7
            int r7 = r3 + 1
            r5.f7607e = r7
            java.lang.String r3 = java.lang.String.valueOf(r3)
            android.net.Uri$Builder r1 = r1.appendPath(r3)
            android.net.Uri r1 = r1.build()
            r6.getClass()
            boolean r3 = androidx.slice.Slice.m7929d(r6)
            if (r3 == 0) goto L_0x0264
            int r3 = r11.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r11.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            boolean r5 = androidx.slice.Slice.m7929d(r6)
            if (r5 == 0) goto L_0x0264
            androidx.slice.SliceItem r5 = new androidx.slice.SliceItem
            r7 = 0
            r5.<init>(r6, r14, r7, r3)
            r15.add(r5)
        L_0x0264:
            if (r9 == 0) goto L_0x0271
            java.lang.String[] r3 = new java.lang.String[]{r10}
            java.util.List r3 = java.util.Arrays.asList(r3)
            r12.addAll(r3)
        L_0x0271:
            java.util.ArrayList<androidx.slice.Slice> r3 = r2.f14623h
            androidx.slice.Slice r5 = new androidx.slice.Slice
            int r6 = r12.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r12.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r7 = 0
            r5.<init>(r15, r6, r1, r7)
            r3.add(r5)
        L_0x0288:
            r6 = r19
            r11 = 0
            goto L_0x02ec
        L_0x028c:
            r18 = r1
            r20 = r3
            r21 = r7
            java.lang.Object r1 = r0.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            java.util.ArrayList<androidx.slice.Slice> r1 = r2.f14623h
            androidx.slice.Slice$a r3 = r2.f14624a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            android.net.Uri r11 = r3.f7603a
            android.net.Uri$Builder r11 = r11.buildUpon()
            android.net.Uri$Builder r11 = r11.appendPath(r13)
            int r12 = r3.f7607e
            int r15 = r12 + 1
            r3.f7607e = r15
            java.lang.String r3 = java.lang.String.valueOf(r12)
            android.net.Uri$Builder r3 = r11.appendPath(r3)
            android.net.Uri r3 = r3.build()
            r11 = 0
            java.lang.String[] r12 = new java.lang.String[r11]
            androidx.slice.SliceItem r15 = new androidx.slice.SliceItem
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = r19
            r11 = 0
            r15.<init>(r5, r6, r11, r12)
            r7.add(r15)
            androidx.slice.Slice r5 = new androidx.slice.Slice
            int r12 = r9.size()
            java.lang.String[] r12 = new java.lang.String[r12]
            java.lang.Object[] r9 = r9.toArray(r12)
            java.lang.String[] r9 = (java.lang.String[]) r9
            r5.<init>(r7, r9, r3, r11)
            r1.add(r5)
        L_0x02ec:
            int r4 = r4 + 1
            r19 = r6
            r1 = r18
            r3 = r20
            r7 = r21
            goto L_0x017c
        L_0x02f8:
            androidx.slice.SliceItem r0 = r2.f14620e
            if (r0 != 0) goto L_0x0303
            androidx.slice.SliceItem r1 = r2.f14621f
            if (r1 == 0) goto L_0x0301
            goto L_0x0303
        L_0x0301:
            r4 = 0
            goto L_0x0304
        L_0x0303:
            r4 = r6
        L_0x0304:
            r1 = r22
            boolean r3 = r1.f14616e
            if (r3 != 0) goto L_0x0310
            r1.f14616e = r6
            r1.f14617f = r6
            r1.f14618g = r4
        L_0x0310:
            if (r0 != 0) goto L_0x0319
            androidx.slice.SliceItem r0 = r2.f14621f
            if (r0 == 0) goto L_0x0317
            goto L_0x0319
        L_0x0317:
            r0 = 0
            goto L_0x031a
        L_0x0319:
            r0 = r6
        L_0x031a:
            boolean r3 = r1.f14616e
            if (r3 != 0) goto L_0x0324
            r1.f14616e = r6
            r1.f14617f = r6
            r1.f14618g = r0
        L_0x0324:
            androidx.slice.Slice$a r0 = r2.f14624a
            java.lang.String r3 = "list_item"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r0.mo12102b(r3)
            androidx.slice.Slice$a r0 = r1.f14624a
            androidx.slice.Slice r2 = r2.mo18813f()
            r0.getClass()
            r0.mo12106f(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p078d2.C6625c.mo18811d(c2.d):void");
    }

    /* renamed from: e */
    public final void mo18812e(Slice.C3273a aVar) {
        ((C19543e0) this.f14626c).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        aVar.f7604b.add(new SliceItem(Long.valueOf(currentTimeMillis), "long", "millis", new String[]{"last_updated"}));
        Slice slice = this.f14615d;
        if (slice != null) {
            aVar.mo12106f(slice);
        }
    }

    /* renamed from: f */
    public final Slice mo18813f() {
        Object obj;
        Object obj2;
        Slice f = super.mo18813f();
        boolean z = C6777c.m13166a(f, (String) null, new String[]{"partial"}, new String[]{null}) != null;
        boolean z2 = C6777c.m13166a(f, "slice", new String[]{"list_item"}, new String[]{null}) == null;
        String[] strArr = {"shortcut", "title"};
        SliceItem a = C6777c.m13166a(f, ResponseConstants.ACTION, strArr, (String[]) null);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(f.f7600b));
        C6780d dVar = new C6780d(arrayList);
        C6776b bVar = new C6776b(strArr);
        while (true) {
            if (!dVar.hasNext()) {
                obj = null;
                break;
            }
            obj = dVar.next();
            if (bVar.mo18916a(obj)) {
                break;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            if (!(obj != null)) {
                break;
            }
            while (true) {
                if (!dVar.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = dVar.next();
                if (bVar.mo18916a(obj2)) {
                    break;
                }
            }
            arrayList2.add(obj);
            obj = obj2;
        }
        if (z || z2 || a != null || !arrayList2.isEmpty()) {
            boolean z3 = this.f14616e;
            if (z3 && !this.f14617f) {
                throw new IllegalStateException("A slice cannot have the first row be constructed from a GridRowBuilder, consider using #setHeader.");
            } else if (!z3 || this.f14618g) {
                return f;
            } else {
                throw new IllegalStateException("A slice requires the first row to have some text.");
            }
        } else {
            throw new IllegalStateException("A slice requires a primary action; ensure one of your builders has called #setPrimaryAction with a valid SliceAction.");
        }
    }
}
