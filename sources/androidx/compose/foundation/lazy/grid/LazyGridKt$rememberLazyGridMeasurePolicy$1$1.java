package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.C1030w;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.lazy.layout.C0843f;
import androidx.compose.p015ui.layout.C1686i0;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p174m0.C7282b;
import p753kq.C19861p;

final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends Lambda implements C19861p<C0843f, C7280a, C0812n> {
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ C0718d.C0722d $horizontalArrangement;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C0807i $itemProvider;
    public final /* synthetic */ C1030w $overscrollEffect;
    public final /* synthetic */ LazyGridItemPlacementAnimator $placementAnimator;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ C19861p<C7282b, C7280a, List<Integer>> $slotSizesSums;
    public final /* synthetic */ LazyGridState $state;
    public final /* synthetic */ C0718d.C0729k $verticalArrangement;

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$a */
    public static final class C0789a implements C0823y {

        /* renamed from: a */
        public final /* synthetic */ C0843f f1647a;

        /* renamed from: b */
        public final /* synthetic */ boolean f1648b;

        /* renamed from: c */
        public final /* synthetic */ boolean f1649c;

        /* renamed from: d */
        public final /* synthetic */ int f1650d;

        /* renamed from: e */
        public final /* synthetic */ int f1651e;

        /* renamed from: f */
        public final /* synthetic */ LazyGridItemPlacementAnimator f1652f;

        /* renamed from: g */
        public final /* synthetic */ long f1653g;

        public C0789a(C0843f fVar, boolean z, boolean z2, int i, int i2, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
            this.f1647a = fVar;
            this.f1648b = z;
            this.f1649c = z2;
            this.f1650d = i;
            this.f1651e = i2;
            this.f1652f = lazyGridItemPlacementAnimator;
            this.f1653g = j;
        }

        /* renamed from: a */
        public final C0818t mo4293a(int i, Object obj, int i2, int i3, C1686i0[] i0VarArr) {
            Object obj2 = obj;
            C19383o.m32797g(obj2, "key");
            C1686i0[] i0VarArr2 = i0VarArr;
            C19383o.m32797g(i0VarArr2, "placeables");
            return new C0818t(i, obj2, this.f1648b, i2, i3, this.f1649c, this.f1647a.getLayoutDirection(), this.f1650d, this.f1651e, i0VarArr2, this.f1652f, this.f1653g);
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$b */
    public static final class C0790b implements C0824z {

        /* renamed from: a */
        public final /* synthetic */ boolean f1654a;

        /* renamed from: b */
        public final /* synthetic */ List<Integer> f1655b;

        /* renamed from: c */
        public final /* synthetic */ C0843f f1656c;

        /* renamed from: d */
        public final /* synthetic */ int f1657d;

        public C0790b(boolean z, List<Integer> list, C0843f fVar, int i) {
            this.f1654a = z;
            this.f1655b = list;
            this.f1656c = fVar;
            this.f1657d = i;
        }

        /* renamed from: a */
        public final C0820v mo4294a(int i, C0818t[] tVarArr, List<C0801c> list, int i2) {
            C19383o.m32797g(list, "spans");
            return new C0820v(i, tVarArr, list, this.f1654a, this.f1655b.size(), this.f1656c.getLayoutDirection(), i2, this.f1657d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1(boolean z, C0759v vVar, boolean z2, LazyGridState lazyGridState, C0807i iVar, C19861p<? super C7282b, ? super C7280a, ? extends List<Integer>> pVar, C0718d.C0729k kVar, C0718d.C0722d dVar, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, C1030w wVar) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = vVar;
        this.$reverseLayout = z2;
        this.$state = lazyGridState;
        this.$itemProvider = iVar;
        this.$slotSizesSums = pVar;
        this.$verticalArrangement = kVar;
        this.$horizontalArrangement = dVar;
        this.$placementAnimator = lazyGridItemPlacementAnimator;
        this.$overscrollEffect = wVar;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34692invoke0kLqBqw((C0843f) obj, ((C7280a) obj2).f16152a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v74, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v61, resolved type: androidx.compose.foundation.lazy.grid.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03fa A[LOOP:5: B:188:0x03f8->B:189:0x03fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x08fd  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x08ff  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0917  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x091a  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0a85  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0514 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ef A[Catch:{ all -> 0x0a91, all -> 0x0a96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0249  */
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.grid.C0812n m34692invoke0kLqBqw(androidx.compose.foundation.lazy.layout.C0843f r48, long r49) {
        /*
            r47 = this;
            r1 = r47
            r0 = r48
            r11 = r49
            java.lang.String r2 = "$this$null"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            boolean r2 = r1.$isVertical
            if (r2 == 0) goto L_0x0012
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0014
        L_0x0012:
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0014:
            androidx.activity.C0114h.m282M(r11, r2)
            boolean r2 = r1.$isVertical
            if (r2 == 0) goto L_0x002a
            androidx.compose.foundation.layout.v r2 = r1.$contentPadding
            androidx.compose.ui.unit.LayoutDirection r3 = r48.getLayoutDirection()
            float r2 = r2.mo4151b(r3)
            int r2 = r0.mo3791V(r2)
            goto L_0x0038
        L_0x002a:
            androidx.compose.foundation.layout.v r2 = r1.$contentPadding
            androidx.compose.ui.unit.LayoutDirection r3 = r48.getLayoutDirection()
            float r2 = com.google.android.play.core.assetpacks.C15588c1.m25290L(r2, r3)
            int r2 = r0.mo3791V(r2)
        L_0x0038:
            boolean r3 = r1.$isVertical
            if (r3 == 0) goto L_0x004b
            androidx.compose.foundation.layout.v r3 = r1.$contentPadding
            androidx.compose.ui.unit.LayoutDirection r4 = r48.getLayoutDirection()
            float r3 = r3.mo4152c(r4)
            int r3 = r0.mo3791V(r3)
            goto L_0x0059
        L_0x004b:
            androidx.compose.foundation.layout.v r3 = r1.$contentPadding
            androidx.compose.ui.unit.LayoutDirection r4 = r48.getLayoutDirection()
            float r3 = com.google.android.play.core.assetpacks.C15588c1.m25288K(r3, r4)
            int r3 = r0.mo3791V(r3)
        L_0x0059:
            androidx.compose.foundation.layout.v r4 = r1.$contentPadding
            float r4 = r4.mo4153d()
            int r4 = r0.mo3791V(r4)
            androidx.compose.foundation.layout.v r5 = r1.$contentPadding
            float r5 = r5.mo4150a()
            int r5 = r0.mo3791V(r5)
            int r13 = r4 + r5
            int r14 = r2 + r3
            boolean r6 = r1.$isVertical
            if (r6 == 0) goto L_0x0077
            r7 = r13
            goto L_0x0078
        L_0x0077:
            r7 = r14
        L_0x0078:
            if (r6 == 0) goto L_0x0080
            boolean r8 = r1.$reverseLayout
            if (r8 != 0) goto L_0x0080
            r15 = r4
            goto L_0x0091
        L_0x0080:
            if (r6 == 0) goto L_0x0088
            boolean r8 = r1.$reverseLayout
            if (r8 == 0) goto L_0x0088
            r15 = r5
            goto L_0x0091
        L_0x0088:
            if (r6 != 0) goto L_0x0090
            boolean r5 = r1.$reverseLayout
            if (r5 != 0) goto L_0x0090
            r15 = r2
            goto L_0x0091
        L_0x0090:
            r15 = r3
        L_0x0091:
            int r16 = r7 - r15
            int r3 = -r14
            int r5 = -r13
            long r9 = androidx.activity.C0114h.m312p0(r3, r5, r11)
            androidx.compose.foundation.lazy.grid.LazyGridState r3 = r1.$state
            androidx.compose.foundation.lazy.grid.i r5 = r1.$itemProvider
            r3.mo4317i(r5)
            androidx.compose.foundation.lazy.grid.i r3 = r1.$itemProvider
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r8 = r3.mo4282g()
            kq.p<m0.b, m0.a, java.util.List<java.lang.Integer>> r3 = r1.$slotSizesSums
            m0.a r5 = new m0.a
            r5.<init>(r11)
            java.lang.Object r3 = r3.invoke(r0, r5)
            r7 = r3
            java.util.List r7 = (java.util.List) r7
            int r3 = r7.size()
            int r5 = r8.f1667i
            r6 = 0
            if (r3 == r5) goto L_0x00db
            r8.f1667i = r3
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r3 = r8.f1660b
            r3.clear()
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r3 = r8.f1660b
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a r5 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a
            r5.<init>(r6, r6)
            r3.add(r5)
            r8.f1661c = r6
            r8.f1662d = r6
            r5 = -1
            r8.f1664f = r5
            java.util.ArrayList r3 = r8.f1665g
            r3.clear()
            goto L_0x00dc
        L_0x00db:
            r5 = -1
        L_0x00dc:
            androidx.compose.foundation.lazy.grid.LazyGridState r3 = r1.$state
            r3.getClass()
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r3.f1678f
            r3.setValue(r0)
            androidx.compose.foundation.lazy.grid.LazyGridState r3 = r1.$state
            int r17 = r7.size()
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r3.f1677e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r3.setValue(r5)
            boolean r3 = r1.$isVertical
            java.lang.String r26 = "Required value was null."
            if (r3 == 0) goto L_0x010e
            androidx.compose.foundation.layout.d$k r3 = r1.$verticalArrangement
            if (r3 == 0) goto L_0x0104
            float r3 = r3.mo4094a()
            goto L_0x0116
        L_0x0104:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r26.toString()
            r0.<init>(r2)
            throw r0
        L_0x010e:
            androidx.compose.foundation.layout.d$d r3 = r1.$horizontalArrangement
            if (r3 == 0) goto L_0x0a9b
            float r3 = r3.mo4094a()
        L_0x0116:
            int r5 = r0.mo3791V(r3)
            boolean r3 = r1.$isVertical
            if (r3 == 0) goto L_0x0127
            androidx.compose.foundation.layout.d$d r3 = r1.$horizontalArrangement
            if (r3 == 0) goto L_0x0130
            float r3 = r3.mo4094a()
            goto L_0x0131
        L_0x0127:
            androidx.compose.foundation.layout.d$k r3 = r1.$verticalArrangement
            if (r3 == 0) goto L_0x0130
            float r3 = r3.mo4094a()
            goto L_0x0131
        L_0x0130:
            float r3 = (float) r6
        L_0x0131:
            int r3 = r0.mo3791V(r3)
            androidx.compose.foundation.lazy.grid.i r6 = r1.$itemProvider
            int r6 = r6.getItemCount()
            r19 = r3
            boolean r3 = r1.$isVertical
            if (r3 == 0) goto L_0x0147
            int r3 = p174m0.C7280a.m13962g(r49)
            int r3 = r3 - r13
            goto L_0x014c
        L_0x0147:
            int r3 = p174m0.C7280a.m13963h(r49)
            int r3 = r3 - r14
        L_0x014c:
            r20 = r5
            boolean r5 = r1.$reverseLayout
            if (r5 == 0) goto L_0x0163
            if (r3 <= 0) goto L_0x0155
            goto L_0x0163
        L_0x0155:
            boolean r5 = r1.$isVertical
            if (r5 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            int r2 = r2 + r3
        L_0x015b:
            if (r5 == 0) goto L_0x015e
            int r4 = r4 + r3
        L_0x015e:
            long r4 = kotlin.reflect.C19421p.m32949o(r2, r4)
            goto L_0x0167
        L_0x0163:
            long r4 = kotlin.reflect.C19421p.m32949o(r2, r4)
        L_0x0167:
            r21 = r4
            androidx.compose.foundation.lazy.grid.u r5 = new androidx.compose.foundation.lazy.grid.u
            androidx.compose.foundation.lazy.grid.i r4 = r1.$itemProvider
            androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$a r2 = new androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$a
            r23 = r4
            boolean r4 = r1.$isVertical
            r24 = r5
            boolean r5 = r1.$reverseLayout
            r25 = r8
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r8 = r1.$placementAnimator
            r27 = r2
            r12 = r3
            r11 = r19
            r3 = r48
            r28 = r12
            r12 = r23
            r29 = r13
            r30 = r14
            r13 = r20
            r14 = r24
            r18 = -1
            r34 = r6
            r6 = r15
            r31 = r15
            r15 = r7
            r7 = r16
            r32 = r25
            r36 = r9
            r9 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r14.<init>(r12, r0, r13, r2)
            androidx.compose.foundation.lazy.grid.w r8 = new androidx.compose.foundation.lazy.grid.w
            boolean r2 = r1.$isVertical
            androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$b r3 = new androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$b
            r3.<init>(r2, r15, r0, r11)
            r17 = r8
            r18 = r2
            r19 = r15
            r20 = r11
            r21 = r34
            r22 = r13
            r23 = r14
            r24 = r32
            r25 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = r1.$state
            androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1 r3 = new androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1
            r4 = r32
            r3.<init>(r4, r8)
            r2.getClass()
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = r2.f1688p
            r2.setValue(r3)
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = r1.$state
            androidx.compose.runtime.j1 r3 = androidx.compose.runtime.snapshots.SnapshotKt.f2988b
            java.lang.Object r3 = r3.mo5886c()
            androidx.compose.runtime.snapshots.f r3 = (androidx.compose.runtime.snapshots.C1385f) r3
            r9 = 0
            r10 = 0
            androidx.compose.runtime.snapshots.f r3 = androidx.compose.runtime.snapshots.SnapshotKt.m2908g(r3, r9, r10)
            androidx.compose.runtime.snapshots.f r5 = r3.mo6001i()     // Catch:{ all -> 0x0a96 }
            int r6 = r2.mo4313e()     // Catch:{ all -> 0x0a91 }
            r11 = r34
            if (r6 < r11) goto L_0x01fb
            if (r11 > 0) goto L_0x01f2
            goto L_0x01fb
        L_0x01f2:
            int r6 = r11 + -1
            int r2 = r4.mo4309c(r6)     // Catch:{ all -> 0x0a91 }
            r12 = r2
            r13 = r10
            goto L_0x0209
        L_0x01fb:
            int r6 = r2.mo4313e()     // Catch:{ all -> 0x0a91 }
            int r4 = r4.mo4309c(r6)     // Catch:{ all -> 0x0a91 }
            int r6 = r2.mo4314f()     // Catch:{ all -> 0x0a91 }
            r12 = r4
            r13 = r6
        L_0x0209:
            kotlin.m r2 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0a91 }
            androidx.compose.runtime.snapshots.C1385f.m2974o(r5)     // Catch:{ all -> 0x0a96 }
            r3.mo5930c()
            int r15 = r15.size()
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = r1.$state
            float r7 = r2.f1676d
            boolean r6 = r1.$isVertical
            androidx.compose.foundation.layout.d$k r4 = r1.$verticalArrangement
            androidx.compose.foundation.layout.d$d r5 = r1.$horizontalArrangement
            boolean r3 = r1.$reverseLayout
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r2 = r1.$placementAnimator
            androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$3 r9 = new androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$3
            r10 = r2
            r2 = r9
            r27 = r3
            r3 = r48
            r1 = r4
            r17 = r5
            r4 = r49
            r32 = r6
            r6 = r30
            r18 = r7
            r7 = r29
            r2.<init>(r3, r4, r6, r7)
            java.lang.String r2 = "placementAnimator"
            kotlin.jvm.internal.C19383o.m32797g(r10, r2)
            if (r31 < 0) goto L_0x0244
            r6 = 1
            goto L_0x0245
        L_0x0244:
            r6 = 0
        L_0x0245:
            java.lang.String r2 = "Failed requirement."
            if (r6 == 0) goto L_0x0a85
            if (r16 < 0) goto L_0x024d
            r6 = 1
            goto L_0x024e
        L_0x024d:
            r6 = 0
        L_0x024e:
            if (r6 == 0) goto L_0x0a79
            if (r11 > 0) goto L_0x028c
            androidx.compose.foundation.lazy.grid.n r0 = new androidx.compose.foundation.lazy.grid.n
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            int r1 = p174m0.C7280a.m13965j(r36)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = p174m0.C7280a.m13964i(r36)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1 r3 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1.INSTANCE
            java.lang.Object r1 = r9.invoke(r1, r2, r3)
            r43 = r1
            androidx.compose.ui.layout.w r43 = (androidx.compose.p015ui.layout.C1712w) r43
            kotlin.collections.EmptyList r44 = kotlin.collections.EmptyList.INSTANCE
            r45 = 0
            if (r32 == 0) goto L_0x027f
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0281
        L_0x027f:
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0281:
            r46 = r1
            r38 = r0
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46)
            r1 = r47
            goto L_0x0930
        L_0x028c:
            int r2 = p173m.C7279a.m13954l(r18)
            int r6 = r13 - r2
            if (r12 != 0) goto L_0x0296
            r3 = 1
            goto L_0x0297
        L_0x0296:
            r3 = 0
        L_0x0297:
            if (r3 == 0) goto L_0x029d
            if (r6 >= 0) goto L_0x029d
            int r2 = r2 + r6
            r6 = 0
        L_0x029d:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r6 = r6 - r31
            r3 = r31
            int r4 = -r3
        L_0x02a7:
            if (r6 >= 0) goto L_0x02bb
            int r5 = r12 + 0
            if (r5 <= 0) goto L_0x02bb
            int r12 = r12 + -1
            androidx.compose.foundation.lazy.grid.v r5 = r8.mo4354a(r12)
            r7 = 0
            r13.add(r7, r5)
            int r5 = r5.f1769j
            int r6 = r6 + r5
            goto L_0x02a7
        L_0x02bb:
            if (r6 >= r4) goto L_0x02c1
            int r2 = r2 + r6
            r5 = r2
            r6 = r4
            goto L_0x02c2
        L_0x02c1:
            r5 = r2
        L_0x02c2:
            int r6 = r6 + r3
            int r2 = r28 + r16
            if (r2 >= 0) goto L_0x02c9
            r7 = 0
            goto L_0x02ca
        L_0x02c9:
            r7 = r2
        L_0x02ca:
            int r2 = -r6
            r16 = r2
            int r2 = r13.size()
            r50 = r6
            r19 = r12
            r6 = 0
        L_0x02d6:
            if (r6 >= r2) goto L_0x02ed
            java.lang.Object r20 = r13.get(r6)
            r21 = r2
            r2 = r20
            androidx.compose.foundation.lazy.grid.v r2 = (androidx.compose.foundation.lazy.grid.C0820v) r2
            int r19 = r19 + 1
            int r2 = r2.f1769j
            int r16 = r16 + r2
            int r6 = r6 + 1
            r2 = r21
            goto L_0x02d6
        L_0x02ed:
            r6 = r50
            r50 = r12
            r2 = r16
            r12 = r19
        L_0x02f5:
            if (r2 <= r7) goto L_0x0301
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x02fe
            goto L_0x0301
        L_0x02fe:
            r12 = r28
            goto L_0x0316
        L_0x0301:
            r16 = r7
            androidx.compose.foundation.lazy.grid.v r7 = r8.mo4354a(r12)
            r19 = r12
            androidx.compose.foundation.lazy.grid.t[] r12 = r7.f1761b
            r20 = r4
            int r4 = r12.length
            if (r4 != 0) goto L_0x0312
            r4 = 1
            goto L_0x0313
        L_0x0312:
            r4 = 0
        L_0x0313:
            if (r4 == 0) goto L_0x0a24
            goto L_0x02fe
        L_0x0316:
            if (r2 >= r12) goto L_0x0344
            int r4 = r12 - r2
            int r6 = r6 - r4
            int r2 = r2 + r4
            r7 = r50
        L_0x031e:
            if (r6 >= r3) goto L_0x033a
            int r16 = r7 + 0
            if (r16 <= 0) goto L_0x033a
            int r7 = r7 + -1
            r34 = r11
            androidx.compose.foundation.lazy.grid.v r11 = r8.mo4354a(r7)
            r50 = r7
            r7 = 0
            r13.add(r7, r11)
            int r7 = r11.f1769j
            int r6 = r6 + r7
            r7 = r50
            r11 = r34
            goto L_0x031e
        L_0x033a:
            r34 = r11
            int r5 = r5 + r4
            if (r6 >= 0) goto L_0x0346
            int r5 = r5 + r6
            int r2 = r2 + r6
            r8 = r2
            r6 = 0
            goto L_0x0347
        L_0x0344:
            r34 = r11
        L_0x0346:
            r8 = r2
        L_0x0347:
            int r2 = p173m.C7279a.m13954l(r18)
            if (r2 >= 0) goto L_0x034f
            r2 = -1
            goto L_0x0354
        L_0x034f:
            if (r2 <= 0) goto L_0x0353
            r2 = 1
            goto L_0x0354
        L_0x0353:
            r2 = 0
        L_0x0354:
            if (r5 >= 0) goto L_0x0358
            r4 = -1
            goto L_0x035d
        L_0x0358:
            if (r5 <= 0) goto L_0x035c
            r4 = 1
            goto L_0x035d
        L_0x035c:
            r4 = 0
        L_0x035d:
            if (r2 != r4) goto L_0x0370
            int r2 = p173m.C7279a.m13954l(r18)
            int r2 = java.lang.Math.abs(r2)
            int r4 = java.lang.Math.abs(r5)
            if (r2 < r4) goto L_0x0370
            float r2 = (float) r5
            r11 = r2
            goto L_0x0372
        L_0x0370:
            r11 = r18
        L_0x0372:
            int r2 = -r6
            java.lang.Object r4 = kotlin.collections.C19327t.m32638T0(r13)
            androidx.compose.foundation.lazy.grid.v r4 = (androidx.compose.foundation.lazy.grid.C0820v) r4
            if (r3 <= 0) goto L_0x03a9
            int r3 = r13.size()
            r5 = r6
            r6 = 0
        L_0x0381:
            if (r6 >= r3) goto L_0x03a4
            java.lang.Object r7 = r13.get(r6)
            androidx.compose.foundation.lazy.grid.v r7 = (androidx.compose.foundation.lazy.grid.C0820v) r7
            int r7 = r7.f1769j
            if (r5 == 0) goto L_0x03a4
            if (r7 > r5) goto L_0x03a4
            r50 = r3
            int r3 = p568fn.C17782b.m29859Y(r13)
            if (r6 == r3) goto L_0x03a4
            int r5 = r5 - r7
            int r6 = r6 + 1
            java.lang.Object r3 = r13.get(r6)
            r4 = r3
            androidx.compose.foundation.lazy.grid.v r4 = (androidx.compose.foundation.lazy.grid.C0820v) r4
            r3 = r50
            goto L_0x0381
        L_0x03a4:
            r28 = r4
            r29 = r5
            goto L_0x03ad
        L_0x03a9:
            r28 = r4
            r29 = r6
        L_0x03ad:
            if (r32 == 0) goto L_0x03b7
            int r3 = p174m0.C7280a.m13963h(r36)
            r7 = r3
            r3 = r36
            goto L_0x03be
        L_0x03b7:
            r3 = r36
            int r5 = androidx.activity.C0114h.m287R(r8, r3)
            r7 = r5
        L_0x03be:
            if (r32 == 0) goto L_0x03c5
            int r3 = androidx.activity.C0114h.m286Q(r8, r3)
            goto L_0x03c9
        L_0x03c5:
            int r3 = p174m0.C7280a.m13962g(r3)
        L_0x03c9:
            r6 = r3
            if (r32 == 0) goto L_0x03ce
            r5 = r6
            goto L_0x03cf
        L_0x03ce:
            r5 = r7
        L_0x03cf:
            int r3 = java.lang.Math.min(r5, r12)
            if (r8 >= r3) goto L_0x03d7
            r3 = 1
            goto L_0x03d8
        L_0x03d7:
            r3 = 0
        L_0x03d8:
            if (r3 == 0) goto L_0x03ee
            if (r2 != 0) goto L_0x03de
            r4 = 1
            goto L_0x03df
        L_0x03de:
            r4 = 0
        L_0x03df:
            if (r4 == 0) goto L_0x03e2
            goto L_0x03ee
        L_0x03e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03ee:
            int r4 = r13.size()
            r16 = r2
            r50 = r6
            r2 = 0
            r6 = 0
        L_0x03f8:
            if (r2 >= r4) goto L_0x040d
            java.lang.Object r18 = r13.get(r2)
            r19 = r4
            r4 = r18
            androidx.compose.foundation.lazy.grid.v r4 = (androidx.compose.foundation.lazy.grid.C0820v) r4
            androidx.compose.foundation.lazy.grid.t[] r4 = r4.f1761b
            int r4 = r4.length
            int r6 = r6 + r4
            int r2 = r2 + 1
            r4 = r19
            goto L_0x03f8
        L_0x040d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r6)
            if (r3 == 0) goto L_0x04d6
            int r6 = r13.size()
            int[] r3 = new int[r6]
            r2 = 0
        L_0x041b:
            if (r2 >= r6) goto L_0x043b
            if (r27 != 0) goto L_0x0423
            r30 = r9
            r9 = r2
            goto L_0x042c
        L_0x0423:
            int r16 = r6 - r2
            r30 = r9
            r9 = -1
            int r16 = r16 + -1
            r9 = r16
        L_0x042c:
            java.lang.Object r9 = r13.get(r9)
            androidx.compose.foundation.lazy.grid.v r9 = (androidx.compose.foundation.lazy.grid.C0820v) r9
            int r9 = r9.f1768i
            r3[r2] = r9
            int r2 = r2 + 1
            r9 = r30
            goto L_0x041b
        L_0x043b:
            r30 = r9
            int[] r9 = new int[r6]
            r2 = 0
        L_0x0440:
            if (r2 >= r6) goto L_0x0449
            r16 = 0
            r9[r2] = r16
            int r2 = r2 + 1
            goto L_0x0440
        L_0x0449:
            if (r32 == 0) goto L_0x0468
            if (r1 == 0) goto L_0x045e
            r1.mo4092b(r0, r5, r3, r9)
            r1 = r50
            r0 = r4
            r16 = r5
            r17 = r6
            r31 = r8
            r33 = r12
            r12 = 1
            r8 = r7
            goto L_0x0487
        L_0x045e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r26.toString()
            r0.<init>(r1)
            throw r0
        L_0x0468:
            if (r17 == 0) goto L_0x04cc
            androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p015ui.unit.LayoutDirection.Ltr
            r2 = r17
            r16 = r3
            r3 = r5
            r0 = r4
            r4 = r16
            r16 = r5
            r5 = r1
            r1 = r50
            r17 = r6
            r6 = r48
            r31 = r8
            r33 = r12
            r12 = 1
            r8 = r7
            r7 = r9
            r2.mo4095c(r3, r4, r5, r6, r7)
        L_0x0487:
            pq.i r2 = new pq.i
            int r6 = r17 + -1
            r3 = 0
            r2.<init>(r3, r6)
            if (r27 == 0) goto L_0x049c
            int r4 = r2.f44415c
            int r2 = r2.f44416d
            int r2 = -r2
            pq.g r5 = new pq.g
            r5.<init>(r4, r3, r2)
            r2 = r5
        L_0x049c:
            int r3 = r2.f44414b
            int r4 = r2.f44415c
            int r2 = r2.f44416d
            if (r2 <= 0) goto L_0x04a6
            if (r3 <= r4) goto L_0x04aa
        L_0x04a6:
            if (r2 >= 0) goto L_0x04fd
            if (r4 > r3) goto L_0x04fd
        L_0x04aa:
            r5 = r9[r3]
            if (r27 != 0) goto L_0x04b0
            r6 = r3
            goto L_0x04b4
        L_0x04b0:
            int r6 = r17 - r3
            r7 = -1
            int r6 = r6 + r7
        L_0x04b4:
            java.lang.Object r6 = r13.get(r6)
            androidx.compose.foundation.lazy.grid.v r6 = (androidx.compose.foundation.lazy.grid.C0820v) r6
            if (r27 == 0) goto L_0x04c1
            int r5 = r16 - r5
            int r7 = r6.f1768i
            int r5 = r5 - r7
        L_0x04c1:
            java.util.ArrayList r5 = r6.mo4353a(r5, r8, r1)
            r0.addAll(r5)
            if (r3 == r4) goto L_0x04fd
            int r3 = r3 + r2
            goto L_0x04aa
        L_0x04cc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r26.toString()
            r0.<init>(r1)
            throw r0
        L_0x04d6:
            r1 = r50
            r0 = r4
            r31 = r8
            r30 = r9
            r33 = r12
            r12 = 1
            r8 = r7
            int r2 = r13.size()
            r3 = r16
            r6 = 0
        L_0x04e8:
            if (r6 >= r2) goto L_0x04fd
            java.lang.Object r4 = r13.get(r6)
            androidx.compose.foundation.lazy.grid.v r4 = (androidx.compose.foundation.lazy.grid.C0820v) r4
            java.util.ArrayList r5 = r4.mo4353a(r3, r8, r1)
            r0.addAll(r5)
            int r4 = r4.f1769j
            int r3 = r3 + r4
            int r6 = r6 + 1
            goto L_0x04e8
        L_0x04fd:
            int r2 = (int) r11
            int r3 = r0.size()
            r6 = 0
        L_0x0503:
            if (r6 >= r3) goto L_0x0514
            java.lang.Object r4 = r0.get(r6)
            androidx.compose.foundation.lazy.grid.p r4 = (androidx.compose.foundation.lazy.grid.C0814p) r4
            boolean r4 = r4.f1735p
            if (r4 == 0) goto L_0x0511
            r6 = r12
            goto L_0x0515
        L_0x0511:
            int r6 = r6 + 1
            goto L_0x0503
        L_0x0514:
            r6 = 0
        L_0x0515:
            if (r6 != 0) goto L_0x0539
            java.util.LinkedHashMap r2 = r10.f1638d
            r2.clear()
            java.util.Map r2 = kotlin.collections.C19294b0.m32559p0()
            r10.f1639e = r2
            r2 = -1
            r10.f1640f = r2
            r3 = 0
            r10.f1641g = r3
            r10.f1642h = r2
            r10.f1643i = r3
            r2 = r0
            r50 = r1
            r37 = r8
            r16 = r11
        L_0x0533:
            r0 = r31
            r3 = r33
            goto L_0x08fb
        L_0x0539:
            r10.f1637c = r15
            boolean r3 = r10.f1636b
            if (r3 == 0) goto L_0x0541
            r7 = r1
            goto L_0x0542
        L_0x0541:
            r7 = r8
        L_0x0542:
            if (r27 == 0) goto L_0x0545
            int r2 = -r2
        L_0x0545:
            r6 = r2
            if (r3 == 0) goto L_0x054a
            r2 = 0
            goto L_0x054b
        L_0x054a:
            r2 = r6
        L_0x054b:
            if (r3 != 0) goto L_0x054e
            r6 = 0
        L_0x054e:
            long r2 = kotlin.reflect.C19421p.m32949o(r2, r6)
            java.lang.Object r4 = kotlin.collections.C19327t.m32638T0(r0)
            androidx.compose.foundation.lazy.grid.p r4 = (androidx.compose.foundation.lazy.grid.C0814p) r4
            java.lang.Object r5 = kotlin.collections.C19327t.m32645a1(r0)
            androidx.compose.foundation.lazy.grid.p r5 = (androidx.compose.foundation.lazy.grid.C0814p) r5
            int r6 = r0.size()
            r9 = 0
        L_0x0563:
            if (r9 >= r6) goto L_0x05ad
            java.lang.Object r15 = r0.get(r9)
            androidx.compose.foundation.lazy.grid.p r15 = (androidx.compose.foundation.lazy.grid.C0814p) r15
            java.util.LinkedHashMap r12 = r10.f1638d
            java.lang.Object r13 = r15.f1723d
            java.lang.Object r12 = r12.get(r13)
            androidx.compose.foundation.lazy.grid.e r12 = (androidx.compose.foundation.lazy.grid.C0803e) r12
            if (r12 != 0) goto L_0x057a
            r35 = r14
            goto L_0x05a7
        L_0x057a:
            boolean r13 = r15.f1731l
            if (r13 == 0) goto L_0x0588
            r35 = r14
            long r13 = r15.f1726g
            r16 = 32
            long r13 = r13 >> r16
            int r13 = (int) r13
            goto L_0x0590
        L_0x0588:
            r35 = r14
            long r13 = r15.f1726g
            int r13 = p174m0.C7290i.m13995b(r13)
        L_0x0590:
            r12.f1702a = r13
            boolean r13 = r15.f1731l
            if (r13 == 0) goto L_0x059f
            long r13 = r15.f1720a
            int r15 = p174m0.C7287g.f16165c
            r15 = 32
            long r13 = r13 >> r15
            int r13 = (int) r13
            goto L_0x05a5
        L_0x059f:
            long r13 = r15.f1720a
            int r13 = p174m0.C7287g.m13992b(r13)
        L_0x05a5:
            r12.f1703b = r13
        L_0x05a7:
            int r9 = r9 + 1
            r14 = r35
            r12 = 1
            goto L_0x0563
        L_0x05ad:
            r35 = r14
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1 r6 = new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1
            r6.<init>(r10, r0)
            r9 = 0
            r12 = 0
            r13 = 0
        L_0x05b7:
            int r14 = r0.size()
            if (r9 >= r14) goto L_0x0605
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            java.lang.Object r14 = r6.invoke(r14)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r15 = -1
            if (r14 != r15) goto L_0x05d3
            int r9 = r9 + 1
            r16 = r11
            goto L_0x0602
        L_0x05d3:
            r15 = r9
            r16 = r11
            r9 = 0
        L_0x05d7:
            int r11 = r0.size()
            if (r15 >= r11) goto L_0x05fe
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            java.lang.Object r11 = r6.invoke(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 != r14) goto L_0x05fe
            java.lang.Object r11 = r0.get(r15)
            androidx.compose.foundation.lazy.grid.p r11 = (androidx.compose.foundation.lazy.grid.C0814p) r11
            int r11 = r11.mo4349f()
            int r9 = java.lang.Math.max(r9, r11)
            int r15 = r15 + 1
            goto L_0x05d7
        L_0x05fe:
            int r12 = r12 + r9
            int r13 = r13 + 1
            r9 = r15
        L_0x0602:
            r11 = r16
            goto L_0x05b7
        L_0x0605:
            r16 = r11
            int r12 = r12 / r13
            java.util.LinkedHashSet r6 = r10.f1644j
            r6.clear()
            int r6 = r0.size()
            r9 = 0
        L_0x0612:
            if (r9 >= r6) goto L_0x0746
            java.lang.Object r11 = r0.get(r9)
            androidx.compose.foundation.lazy.grid.p r11 = (androidx.compose.foundation.lazy.grid.C0814p) r11
            java.util.LinkedHashSet r13 = r10.f1644j
            java.lang.Object r14 = r11.f1723d
            r13.add(r14)
            java.util.LinkedHashMap r13 = r10.f1638d
            java.lang.Object r14 = r11.f1723d
            java.lang.Object r13 = r13.get(r14)
            androidx.compose.foundation.lazy.grid.e r13 = (androidx.compose.foundation.lazy.grid.C0803e) r13
            if (r13 != 0) goto L_0x0705
            boolean r13 = r11.f1735p
            if (r13 == 0) goto L_0x06fa
            androidx.compose.foundation.lazy.grid.e r13 = new androidx.compose.foundation.lazy.grid.e
            boolean r14 = r11.f1731l
            if (r14 == 0) goto L_0x063f
            long r14 = r11.f1726g
            r17 = 32
            long r14 = r14 >> r17
            int r14 = (int) r14
            goto L_0x0645
        L_0x063f:
            long r14 = r11.f1726g
            int r14 = p174m0.C7290i.m13995b(r14)
        L_0x0645:
            boolean r15 = r11.f1731l
            if (r15 == 0) goto L_0x0656
            r36 = r0
            r50 = r1
            long r0 = r11.f1720a
            int r15 = p174m0.C7287g.f16165c
            r15 = 32
            long r0 = r0 >> r15
            int r0 = (int) r0
            goto L_0x0660
        L_0x0656:
            r36 = r0
            r50 = r1
            long r0 = r11.f1720a
            int r0 = p174m0.C7287g.m13992b(r0)
        L_0x0660:
            r13.<init>(r14, r0)
            java.util.Map<java.lang.Object, java.lang.Integer> r0 = r10.f1639e
            java.lang.Object r1 = r11.f1723d
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            long r14 = r11.f1721b
            if (r0 != 0) goto L_0x0676
            int r0 = r10.mo4277b(r14)
            goto L_0x069f
        L_0x0676:
            if (r27 != 0) goto L_0x067d
            int r1 = r10.mo4277b(r14)
            goto L_0x0687
        L_0x067d:
            int r1 = r10.mo4277b(r14)
            int r17 = r11.mo4349f()
            int r1 = r1 - r17
        L_0x0687:
            r25 = r1
            int r19 = r11.mo4349f()
            int r18 = r0.intValue()
            r17 = r10
            r20 = r12
            r21 = r2
            r23 = r27
            r24 = r7
            int r0 = r17.mo4276a(r18, r19, r20, r21, r23, r24, r25)
        L_0x069f:
            boolean r1 = r10.f1636b
            if (r1 == 0) goto L_0x06ac
            r17 = r6
            r1 = 1
            r6 = 0
            long r14 = p174m0.C7287g.m13991a(r6, r0, r1, r14)
            goto L_0x06b4
        L_0x06ac:
            r17 = r6
            r6 = 0
            r1 = 2
            long r14 = p174m0.C7287g.m13991a(r0, r6, r1, r14)
        L_0x06b4:
            java.util.List<androidx.compose.foundation.lazy.grid.o> r0 = r11.f1732m
            int r0 = r0.size()
            r6 = 0
        L_0x06bb:
            if (r6 >= r0) goto L_0x06eb
            java.util.ArrayList r1 = r13.f1705d
            r18 = r0
            androidx.compose.foundation.lazy.grid.a0 r0 = new androidx.compose.foundation.lazy.grid.a0
            r37 = r8
            java.util.List<androidx.compose.foundation.lazy.grid.o> r8 = r11.f1732m
            java.lang.Object r8 = r8.get(r6)
            androidx.compose.foundation.lazy.grid.o r8 = (androidx.compose.foundation.lazy.grid.C0813o) r8
            androidx.compose.ui.layout.i0 r8 = r8.f1718a
            r26 = r12
            boolean r12 = r11.f1731l
            if (r12 == 0) goto L_0x06d8
            int r8 = r8.f3723c
            goto L_0x06da
        L_0x06d8:
            int r8 = r8.f3722b
        L_0x06da:
            r0.<init>(r8, r14)
            r1.add(r0)
            kotlin.m r0 = kotlin.C19394m.f43287a
            int r6 = r6 + 1
            r0 = r18
            r12 = r26
            r8 = r37
            goto L_0x06bb
        L_0x06eb:
            r37 = r8
            r26 = r12
            java.util.LinkedHashMap r0 = r10.f1638d
            java.lang.Object r1 = r11.f1723d
            r0.put(r1, r13)
            r10.mo4278c(r11, r13)
            goto L_0x0738
        L_0x06fa:
            r36 = r0
            r50 = r1
            r17 = r6
            r37 = r8
            r26 = r12
            goto L_0x0738
        L_0x0705:
            r36 = r0
            r50 = r1
            r17 = r6
            r37 = r8
            r26 = r12
            boolean r0 = r11.f1735p
            if (r0 == 0) goto L_0x0731
            long r0 = r13.f1704c
            r6 = 32
            long r14 = r0 >> r6
            int r8 = (int) r14
            long r14 = r2 >> r6
            int r6 = (int) r14
            int r8 = r8 + r6
            int r0 = p174m0.C7287g.m13992b(r0)
            int r1 = p174m0.C7287g.m13992b(r2)
            int r1 = r1 + r0
            long r0 = kotlin.reflect.C19421p.m32949o(r8, r1)
            r13.f1704c = r0
            r10.mo4278c(r11, r13)
            goto L_0x0738
        L_0x0731:
            java.util.LinkedHashMap r0 = r10.f1638d
            java.lang.Object r1 = r11.f1723d
            r0.remove(r1)
        L_0x0738:
            int r9 = r9 + 1
            r1 = r50
            r6 = r17
            r12 = r26
            r0 = r36
            r8 = r37
            goto L_0x0612
        L_0x0746:
            r36 = r0
            r50 = r1
            r37 = r8
            r26 = r12
            if (r27 != 0) goto L_0x0770
            int r0 = r4.f1722c
            r10.f1640f = r0
            long r0 = r4.f1720a
            int r0 = r10.mo4277b(r0)
            r10.f1641g = r0
            int r0 = r5.f1722c
            r10.f1642h = r0
            long r0 = r5.f1720a
            int r0 = r10.mo4277b(r0)
            int r1 = r5.f1728i
            int r4 = r5.f1727h
            int r1 = r1 + r4
            int r1 = r1 + r0
            int r1 = r1 - r7
            r10.f1643i = r1
            goto L_0x07a6
        L_0x0770:
            int r0 = r5.f1722c
            r10.f1640f = r0
            long r0 = r5.f1720a
            int r0 = r10.mo4277b(r0)
            int r0 = r7 - r0
            int r1 = r5.f1727h
            int r0 = r0 - r1
            r10.f1641g = r0
            int r0 = r4.f1722c
            r10.f1642h = r0
            long r0 = r4.f1720a
            int r0 = r10.mo4277b(r0)
            int r0 = -r0
            int r1 = r4.f1728i
            int r5 = r4.f1727h
            int r1 = r1 + r5
            boolean r5 = r10.f1636b
            if (r5 == 0) goto L_0x079c
            long r4 = r4.f1726g
            int r4 = p174m0.C7290i.m13995b(r4)
            goto L_0x07a2
        L_0x079c:
            long r4 = r4.f1726g
            r6 = 32
            long r4 = r4 >> r6
            int r4 = (int) r4
        L_0x07a2:
            int r1 = r1 - r4
            int r1 = r1 + r0
            r10.f1643i = r1
        L_0x07a6:
            java.util.LinkedHashMap r0 = r10.f1638d
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x07b0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x08ed
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.LinkedHashSet r4 = r10.f1644j
            java.lang.Object r5 = r1.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x08e9
            java.lang.Object r4 = r1.getValue()
            androidx.compose.foundation.lazy.grid.e r4 = (androidx.compose.foundation.lazy.grid.C0803e) r4
            long r5 = r4.f1704c
            r8 = 32
            long r11 = r5 >> r8
            int r9 = (int) r11
            long r11 = r2 >> r8
            int r8 = (int) r11
            int r9 = r9 + r8
            int r5 = p174m0.C7287g.m13992b(r5)
            int r6 = p174m0.C7287g.m13992b(r2)
            int r6 = r6 + r5
            long r5 = kotlin.reflect.C19421p.m32949o(r9, r6)
            r4.f1704c = r5
            r9 = r35
            androidx.compose.foundation.lazy.grid.i r5 = r9.f1756a
            java.util.Map r5 = r5.mo4200d()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.ArrayList r5 = r4.f1705d
            int r6 = r5.size()
            r8 = 0
        L_0x0801:
            if (r8 >= r6) goto L_0x0848
            java.lang.Object r11 = r5.get(r8)
            androidx.compose.foundation.lazy.grid.a0 r11 = (androidx.compose.foundation.lazy.grid.C0799a0) r11
            long r12 = r11.f1698c
            long r14 = r4.f1704c
            r17 = r5
            r48 = r6
            r35 = 32
            long r5 = r12 >> r35
            int r5 = (int) r5
            r38 = r2
            long r2 = r14 >> r35
            int r2 = (int) r2
            int r5 = r5 + r2
            int r2 = p174m0.C7287g.m13992b(r12)
            int r3 = p174m0.C7287g.m13992b(r14)
            int r3 = r3 + r2
            long r2 = kotlin.reflect.C19421p.m32949o(r5, r3)
            int r5 = r10.mo4277b(r2)
            int r6 = r11.f1696a
            int r5 = r5 + r6
            if (r5 <= 0) goto L_0x083a
            int r2 = r10.mo4277b(r2)
            if (r2 >= r7) goto L_0x083a
            r6 = 1
            goto L_0x083b
        L_0x083a:
            r6 = 0
        L_0x083b:
            if (r6 == 0) goto L_0x083f
            r6 = 1
            goto L_0x084d
        L_0x083f:
            int r8 = r8 + 1
            r6 = r48
            r5 = r17
            r2 = r38
            goto L_0x0801
        L_0x0848:
            r38 = r2
            r35 = 32
            r6 = 0
        L_0x084d:
            java.util.ArrayList r2 = r4.f1705d
            int r3 = r2.size()
            r5 = 0
        L_0x0854:
            if (r5 >= r3) goto L_0x086f
            java.lang.Object r8 = r2.get(r5)
            androidx.compose.foundation.lazy.grid.a0 r8 = (androidx.compose.foundation.lazy.grid.C0799a0) r8
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r8.f1699d
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x086c
            r2 = 1
            goto L_0x0870
        L_0x086c:
            int r5 = r5 + 1
            goto L_0x0854
        L_0x086f:
            r2 = 0
        L_0x0870:
            r3 = 1
            r2 = r2 ^ r3
            if (r6 != 0) goto L_0x0876
            if (r2 != 0) goto L_0x08dc
        L_0x0876:
            if (r1 == 0) goto L_0x08dc
            java.util.ArrayList r2 = r4.f1705d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0881
            goto L_0x08dc
        L_0x0881:
            int r2 = r1.intValue()
            boolean r3 = r10.f1636b
            if (r3 == 0) goto L_0x0890
            int r3 = r4.f1702a
            long r5 = p174m0.C7280a.C7281a.m13971e(r3)
            goto L_0x0896
        L_0x0890:
            int r3 = r4.f1702a
            long r5 = p174m0.C7280a.C7281a.m13970d(r3)
        L_0x0896:
            int r3 = r9.f1758c
            androidx.compose.foundation.lazy.grid.t r2 = r9.mo4352a(r2, r3, r5)
            int r3 = r2.f1755n
            int r18 = r1.intValue()
            r17 = r10
            r19 = r3
            r20 = r26
            r21 = r38
            r23 = r27
            r24 = r7
            r25 = r7
            int r1 = r17.mo4276a(r18, r19, r20, r21, r23, r24, r25)
            if (r27 == 0) goto L_0x08bb
            int r1 = r7 - r1
            int r3 = r2.f1754m
            int r1 = r1 - r3
        L_0x08bb:
            r19 = r1
            int r1 = r4.f1703b
            r23 = -1
            r24 = -1
            int r3 = r2.f1754m
            r18 = r2
            r20 = r1
            r21 = r37
            r22 = r50
            r25 = r3
            androidx.compose.foundation.lazy.grid.p r1 = r18.mo4351a(r19, r20, r21, r22, r23, r24, r25)
            r2 = r36
            r2.add(r1)
            r10.mo4278c(r1, r4)
            goto L_0x08e1
        L_0x08dc:
            r2 = r36
            r0.remove()
        L_0x08e1:
            r36 = r2
            r35 = r9
            r2 = r38
            goto L_0x07b0
        L_0x08e9:
            r9 = r35
            goto L_0x07b0
        L_0x08ed:
            r9 = r35
            r2 = r36
            androidx.compose.foundation.lazy.grid.i r0 = r9.f1756a
            java.util.Map r0 = r0.mo4200d()
            r10.f1639e = r0
            goto L_0x0533
        L_0x08fb:
            if (r0 <= r3) goto L_0x08ff
            r0 = 1
            goto L_0x0900
        L_0x08ff:
            r0 = 0
        L_0x0900:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r37)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r50)
            androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3 r4 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
            r4.<init>(r2)
            r11 = r30
            java.lang.Object r1 = r11.invoke(r1, r3, r4)
            androidx.compose.ui.layout.w r1 = (androidx.compose.p015ui.layout.C1712w) r1
            if (r32 == 0) goto L_0x091a
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x091c
        L_0x091a:
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x091c:
            r35 = r3
            androidx.compose.foundation.lazy.grid.n r3 = new androidx.compose.foundation.lazy.grid.n
            r27 = r3
            r30 = r0
            r31 = r16
            r32 = r1
            r33 = r2
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35)
            r1 = r47
            r0 = r3
        L_0x0930:
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = r1.$state
            androidx.compose.foundation.w r3 = r1.$overscrollEffect
            r2.getClass()
            androidx.compose.foundation.lazy.grid.q r4 = r2.f1673a
            r4.getClass()
            androidx.compose.foundation.lazy.grid.v r5 = r0.f1711a
            if (r5 == 0) goto L_0x094f
            androidx.compose.foundation.lazy.grid.t[] r5 = r5.f1761b
            if (r5 == 0) goto L_0x094f
            java.lang.Object r5 = kotlin.collections.C19318k.m32613e1(r5)
            androidx.compose.foundation.lazy.grid.t r5 = (androidx.compose.foundation.lazy.grid.C0818t) r5
            if (r5 == 0) goto L_0x094f
            java.lang.Object r5 = r5.f1743b
            goto L_0x0950
        L_0x094f:
            r5 = 0
        L_0x0950:
            r4.f1739d = r5
            boolean r5 = r4.f1738c
            if (r5 != 0) goto L_0x095d
            int r5 = r0.f1716f
            if (r5 <= 0) goto L_0x095b
            goto L_0x095d
        L_0x095b:
            r12 = 1
            goto L_0x099e
        L_0x095d:
            r12 = 1
            r4.f1738c = r12
            int r5 = r0.f1712b
            float r6 = (float) r5
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x096a
            r6 = r12
            goto L_0x096b
        L_0x096a:
            r6 = 0
        L_0x096b:
            if (r6 == 0) goto L_0x0a04
            androidx.compose.runtime.j1 r6 = androidx.compose.runtime.snapshots.SnapshotKt.f2988b
            java.lang.Object r6 = r6.mo5886c()
            androidx.compose.runtime.snapshots.f r6 = (androidx.compose.runtime.snapshots.C1385f) r6
            r7 = 0
            r14 = 0
            androidx.compose.runtime.snapshots.f r6 = androidx.compose.runtime.snapshots.SnapshotKt.m2908g(r6, r14, r7)
            androidx.compose.runtime.snapshots.f r7 = r6.mo6001i()     // Catch:{ all -> 0x09ff }
            androidx.compose.foundation.lazy.grid.v r8 = r0.f1711a     // Catch:{ all -> 0x09fa }
            if (r8 == 0) goto L_0x0992
            androidx.compose.foundation.lazy.grid.t[] r8 = r8.f1761b     // Catch:{ all -> 0x09fa }
            if (r8 == 0) goto L_0x0992
            java.lang.Object r8 = kotlin.collections.C19318k.m32613e1(r8)     // Catch:{ all -> 0x09fa }
            androidx.compose.foundation.lazy.grid.t r8 = (androidx.compose.foundation.lazy.grid.C0818t) r8     // Catch:{ all -> 0x09fa }
            if (r8 == 0) goto L_0x0992
            int r8 = r8.f1742a     // Catch:{ all -> 0x09fa }
            goto L_0x0993
        L_0x0992:
            r8 = 0
        L_0x0993:
            r4.mo4350a(r8, r5)     // Catch:{ all -> 0x09fa }
            kotlin.m r4 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x09fa }
            androidx.compose.runtime.snapshots.C1385f.m2974o(r7)     // Catch:{ all -> 0x09ff }
            r6.mo5930c()
        L_0x099e:
            float r4 = r2.f1676d
            float r5 = r0.f1714d
            float r4 = r4 - r5
            r2.f1676d = r4
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = r2.f1674b
            r4.setValue(r0)
            boolean r4 = r0.f1713c
            r2.f1691s = r4
            androidx.compose.foundation.lazy.grid.v r5 = r0.f1711a
            if (r5 == 0) goto L_0x09b5
            int r6 = r5.f1760a
            goto L_0x09b6
        L_0x09b5:
            r6 = 0
        L_0x09b6:
            if (r6 != 0) goto L_0x09bf
            int r6 = r0.f1712b
            if (r6 == 0) goto L_0x09bd
            goto L_0x09bf
        L_0x09bd:
            r6 = 0
            goto L_0x09c0
        L_0x09bf:
            r6 = r12
        L_0x09c0:
            r2.f1690r = r6
            if (r5 == 0) goto L_0x09d4
            androidx.compose.foundation.lazy.grid.t[] r2 = r5.f1761b
            if (r2 == 0) goto L_0x09d4
            java.lang.Object r2 = kotlin.collections.C19318k.m32613e1(r2)
            androidx.compose.foundation.lazy.grid.t r2 = (androidx.compose.foundation.lazy.grid.C0818t) r2
            if (r2 != 0) goto L_0x09d1
            goto L_0x09d4
        L_0x09d1:
            r21 = 0
            goto L_0x09da
        L_0x09d4:
            r21 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
        L_0x09da:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r5)
            if (r2 == 0) goto L_0x09ec
            int r2 = r0.f1712b
            if (r2 == 0) goto L_0x09e9
            goto L_0x09ec
        L_0x09e9:
            r6 = r21
            goto L_0x09ed
        L_0x09ec:
            r6 = r12
        L_0x09ed:
            if (r4 != 0) goto L_0x09f5
            if (r6 == 0) goto L_0x09f2
            goto L_0x09f5
        L_0x09f2:
            r6 = r21
            goto L_0x09f6
        L_0x09f5:
            r6 = r12
        L_0x09f6:
            r3.setEnabled(r6)
            return r0
        L_0x09fa:
            r0 = move-exception
            androidx.compose.runtime.snapshots.C1385f.m2974o(r7)     // Catch:{ all -> 0x09ff }
            throw r0     // Catch:{ all -> 0x09ff }
        L_0x09ff:
            r0 = move-exception
            r6.mo5930c()
            throw r0
        L_0x0a04:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "scrollOffset should be non-negative ("
            r0.append(r2)
            r0.append(r5)
            r2 = 41
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0a24:
            r4 = r1
            r34 = r11
            r0 = r28
            r22 = r36
            r21 = 0
            r1 = r47
            r11 = r9
            r9 = r14
            int r14 = r7.f1769j
            int r2 = r2 + r14
            r0 = r20
            if (r2 > r0) goto L_0x0a5c
            r20 = r0
            int r0 = r12.length
            if (r0 != 0) goto L_0x0a3f
            r0 = 1
            goto L_0x0a41
        L_0x0a3f:
            r0 = r21
        L_0x0a41:
            if (r0 != 0) goto L_0x0a54
            int r0 = r12.length
            r24 = -1
            int r0 = r0 + -1
            r0 = r12[r0]
            int r0 = r0.f1742a
            int r12 = r34 + -1
            if (r0 == r12) goto L_0x0a60
            int r12 = r19 + 1
            int r6 = r6 - r14
            goto L_0x0a65
        L_0x0a54:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r2 = "Array is empty."
            r0.<init>(r2)
            throw r0
        L_0x0a5c:
            r20 = r0
            r24 = -1
        L_0x0a60:
            r13.add(r7)
            r12 = r50
        L_0x0a65:
            int r0 = r19 + 1
            r1 = r4
            r14 = r9
            r9 = r11
            r50 = r12
            r7 = r16
            r4 = r20
            r36 = r22
            r11 = r34
            r12 = r0
            r0 = r48
            goto L_0x02f5
        L_0x0a79:
            r1 = r47
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0a85:
            r1 = r47
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0a91:
            r0 = move-exception
            androidx.compose.runtime.snapshots.C1385f.m2974o(r5)     // Catch:{ all -> 0x0a96 }
            throw r0     // Catch:{ all -> 0x0a96 }
        L_0x0a96:
            r0 = move-exception
            r3.mo5930c()
            throw r0
        L_0x0a9b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r26.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.m34692invoke0kLqBqw(androidx.compose.foundation.lazy.layout.f, long):androidx.compose.foundation.lazy.grid.n");
    }
}
