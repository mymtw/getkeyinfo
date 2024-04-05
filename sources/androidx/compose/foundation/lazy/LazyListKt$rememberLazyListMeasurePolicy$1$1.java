package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C1030w;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.lazy.layout.C0843f;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1686i0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19861p;

final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends Lambda implements C19861p<C0843f, C7280a, C0853n> {
    public final /* synthetic */ C0779f $beyondBoundsInfo;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ C1428a.C1430b $horizontalAlignment;
    public final /* synthetic */ C0718d.C0722d $horizontalArrangement;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C0829l $itemProvider;
    public final /* synthetic */ C1030w $overscrollEffect;
    public final /* synthetic */ LazyListItemPlacementAnimator $placementAnimator;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ C1428a.C1431c $verticalAlignment;
    public final /* synthetic */ C0718d.C0729k $verticalArrangement;

    /* renamed from: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$a */
    public static final class C0768a implements C0866y {

        /* renamed from: a */
        public final /* synthetic */ int f1589a;

        /* renamed from: b */
        public final /* synthetic */ int f1590b;

        /* renamed from: c */
        public final /* synthetic */ C0843f f1591c;

        /* renamed from: d */
        public final /* synthetic */ boolean f1592d;

        /* renamed from: e */
        public final /* synthetic */ C1428a.C1430b f1593e;

        /* renamed from: f */
        public final /* synthetic */ C1428a.C1431c f1594f;

        /* renamed from: g */
        public final /* synthetic */ boolean f1595g;

        /* renamed from: h */
        public final /* synthetic */ int f1596h;

        /* renamed from: i */
        public final /* synthetic */ int f1597i;

        /* renamed from: j */
        public final /* synthetic */ LazyListItemPlacementAnimator f1598j;

        /* renamed from: k */
        public final /* synthetic */ long f1599k;

        public C0768a(int i, int i2, C0843f fVar, boolean z, C1428a.C1430b bVar, C1428a.C1431c cVar, boolean z2, int i3, int i4, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j) {
            this.f1589a = i;
            this.f1590b = i2;
            this.f1591c = fVar;
            this.f1592d = z;
            this.f1593e = bVar;
            this.f1594f = cVar;
            this.f1595g = z2;
            this.f1596h = i3;
            this.f1597i = i4;
            this.f1598j = lazyListItemPlacementAnimator;
            this.f1599k = j;
        }

        /* renamed from: a */
        public final C0864w mo4213a(int i, Object obj, C1686i0[] i0VarArr) {
            C19383o.m32797g(obj, "key");
            C19383o.m32797g(i0VarArr, "placeables");
            return new C0864w(i, i0VarArr, this.f1592d, this.f1593e, this.f1594f, this.f1591c.getLayoutDirection(), this.f1595g, this.f1596h, this.f1597i, this.f1598j, i == this.f1589a + -1 ? 0 : this.f1590b, this.f1599k, obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1(boolean z, C0759v vVar, boolean z2, LazyListState lazyListState, C0829l lVar, C0718d.C0729k kVar, C0718d.C0722d dVar, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, C0779f fVar, C1428a.C1430b bVar, C1428a.C1431c cVar, C1030w wVar) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = vVar;
        this.$reverseLayout = z2;
        this.$state = lazyListState;
        this.$itemProvider = lVar;
        this.$verticalArrangement = kVar;
        this.$horizontalArrangement = dVar;
        this.$placementAnimator = lazyListItemPlacementAnimator;
        this.$beyondBoundsInfo = fVar;
        this.$horizontalAlignment = bVar;
        this.$verticalAlignment = cVar;
        this.$overscrollEffect = wVar;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34685invoke0kLqBqw((C0843f) obj, ((C7280a) obj2).f16152a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.compose.foundation.lazy.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v101, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v103, resolved type: androidx.compose.foundation.lazy.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v127, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v102, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v103, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v140, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v141, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x06b6  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0972 A[LOOP:20: B:357:0x092d->B:367:0x0972, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0a25  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0a27  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0a43  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0a46  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0a86  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0a89  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x068d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x0970 A[SYNTHETIC] */
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.C0853n m34685invoke0kLqBqw(androidx.compose.foundation.lazy.layout.C0843f r46, long r47) {
        /*
            r45 = this;
            r1 = r45
            r0 = r46
            r13 = r47
            java.lang.String r2 = "$this$null"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            boolean r2 = r1.$isVertical
            if (r2 == 0) goto L_0x0012
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0014
        L_0x0012:
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0014:
            androidx.activity.C0114h.m282M(r13, r2)
            boolean r2 = r1.$isVertical
            if (r2 == 0) goto L_0x002a
            androidx.compose.foundation.layout.v r2 = r1.$contentPadding
            androidx.compose.ui.unit.LayoutDirection r3 = r46.getLayoutDirection()
            float r2 = r2.mo4151b(r3)
            int r2 = r0.mo3791V(r2)
            goto L_0x0038
        L_0x002a:
            androidx.compose.foundation.layout.v r2 = r1.$contentPadding
            androidx.compose.ui.unit.LayoutDirection r3 = r46.getLayoutDirection()
            float r2 = com.google.android.play.core.assetpacks.C15588c1.m25290L(r2, r3)
            int r2 = r0.mo3791V(r2)
        L_0x0038:
            boolean r3 = r1.$isVertical
            if (r3 == 0) goto L_0x004b
            androidx.compose.foundation.layout.v r3 = r1.$contentPadding
            androidx.compose.ui.unit.LayoutDirection r4 = r46.getLayoutDirection()
            float r3 = r3.mo4152c(r4)
            int r3 = r0.mo3791V(r3)
            goto L_0x0059
        L_0x004b:
            androidx.compose.foundation.layout.v r3 = r1.$contentPadding
            androidx.compose.ui.unit.LayoutDirection r4 = r46.getLayoutDirection()
            float r3 = com.google.android.play.core.assetpacks.C15588c1.m25288K(r3, r4)
            int r3 = r0.mo3791V(r3)
        L_0x0059:
            androidx.compose.foundation.layout.v r4 = r1.$contentPadding
            float r4 = r4.mo4153d()
            int r4 = r0.mo3791V(r4)
            androidx.compose.foundation.layout.v r5 = r1.$contentPadding
            float r5 = r5.mo4150a()
            int r5 = r0.mo3791V(r5)
            int r15 = r4 + r5
            int r12 = r2 + r3
            boolean r6 = r1.$isVertical
            if (r6 == 0) goto L_0x0077
            r7 = r15
            goto L_0x0078
        L_0x0077:
            r7 = r12
        L_0x0078:
            if (r6 == 0) goto L_0x0080
            boolean r8 = r1.$reverseLayout
            if (r8 != 0) goto L_0x0080
            r11 = r4
            goto L_0x0091
        L_0x0080:
            if (r6 == 0) goto L_0x0088
            boolean r8 = r1.$reverseLayout
            if (r8 == 0) goto L_0x0088
            r11 = r5
            goto L_0x0091
        L_0x0088:
            if (r6 != 0) goto L_0x0090
            boolean r5 = r1.$reverseLayout
            if (r5 != 0) goto L_0x0090
            r11 = r2
            goto L_0x0091
        L_0x0090:
            r11 = r3
        L_0x0091:
            int r16 = r7 - r11
            int r3 = -r12
            int r5 = -r15
            long r9 = androidx.activity.C0114h.m312p0(r3, r5, r13)
            androidx.compose.foundation.lazy.LazyListState r3 = r1.$state
            androidx.compose.foundation.lazy.l r5 = r1.$itemProvider
            r3.mo4228i(r5)
            androidx.compose.foundation.lazy.LazyListState r3 = r1.$state
            r3.getClass()
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r3.f1605e
            r3.setValue(r0)
            androidx.compose.foundation.lazy.l r3 = r1.$itemProvider
            androidx.compose.foundation.lazy.e r3 = r3.mo4198b()
            int r5 = p174m0.C7280a.m13963h(r9)
            float r5 = r0.mo3797p(r5)
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r3.f1625a
            m0.d r6 = new m0.d
            r6.<init>(r5)
            r3.setValue(r6)
            androidx.compose.foundation.lazy.l r3 = r1.$itemProvider
            androidx.compose.foundation.lazy.e r3 = r3.mo4198b()
            int r5 = p174m0.C7280a.m13962g(r9)
            float r5 = r0.mo3797p(r5)
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r3.f1626b
            m0.d r6 = new m0.d
            r6.<init>(r5)
            r3.setValue(r6)
            boolean r3 = r1.$isVertical
            java.lang.String r17 = "Required value was null."
            if (r3 == 0) goto L_0x00f3
            androidx.compose.foundation.layout.d$k r3 = r1.$verticalArrangement
            if (r3 == 0) goto L_0x00e9
            float r3 = r3.mo4094a()
            goto L_0x00fb
        L_0x00e9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r17.toString()
            r0.<init>(r2)
            throw r0
        L_0x00f3:
            androidx.compose.foundation.layout.d$d r3 = r1.$horizontalArrangement
            if (r3 == 0) goto L_0x0b83
            float r3 = r3.mo4094a()
        L_0x00fb:
            int r5 = r0.mo3791V(r3)
            androidx.compose.foundation.lazy.l r3 = r1.$itemProvider
            int r8 = r3.getItemCount()
            boolean r3 = r1.$isVertical
            if (r3 == 0) goto L_0x010f
            int r3 = p174m0.C7280a.m13962g(r47)
            int r3 = r3 - r15
            goto L_0x0114
        L_0x010f:
            int r3 = p174m0.C7280a.m13963h(r47)
            int r3 = r3 - r12
        L_0x0114:
            r7 = r3
            boolean r3 = r1.$reverseLayout
            if (r3 == 0) goto L_0x012a
            if (r7 <= 0) goto L_0x011c
            goto L_0x012a
        L_0x011c:
            boolean r3 = r1.$isVertical
            if (r3 == 0) goto L_0x0121
            goto L_0x0122
        L_0x0121:
            int r2 = r2 + r7
        L_0x0122:
            if (r3 == 0) goto L_0x0125
            int r4 = r4 + r7
        L_0x0125:
            long r2 = kotlin.reflect.C19421p.m32949o(r2, r4)
            goto L_0x012e
        L_0x012a:
            long r2 = kotlin.reflect.C19421p.m32949o(r2, r4)
        L_0x012e:
            r18 = r2
            androidx.compose.foundation.lazy.x r6 = new androidx.compose.foundation.lazy.x
            boolean r4 = r1.$isVertical
            androidx.compose.foundation.lazy.l r3 = r1.$itemProvider
            androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$a r20 = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$a
            androidx.compose.ui.a$b r2 = r1.$horizontalAlignment
            r21 = r9
            androidx.compose.ui.a$c r9 = r1.$verticalAlignment
            boolean r10 = r1.$reverseLayout
            r23 = r12
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r12 = r1.$placementAnimator
            r24 = r2
            r2 = r20
            r25 = r3
            r3 = r8
            r26 = r4
            r4 = r5
            r5 = r46
            r27 = r6
            r6 = r26
            r0 = r7
            r7 = r24
            r24 = r0
            r0 = r8
            r8 = r9
            r28 = r21
            r9 = r10
            r10 = r11
            r30 = r0
            r0 = r11
            r11 = r16
            r21 = r23
            r13 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r27
            r3 = r28
            r5 = r26
            r6 = r25
            r7 = r46
            r8 = r20
            r2.<init>(r3, r5, r6, r7, r8)
            androidx.compose.foundation.lazy.LazyListState r2 = r1.$state
            r8 = r27
            long r3 = r8.f1872d
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = r2.f1615o
            m0.a r5 = new m0.a
            r5.<init>(r3)
            r2.setValue(r5)
            androidx.compose.foundation.lazy.LazyListState r2 = r1.$state
            androidx.compose.runtime.j1 r3 = androidx.compose.runtime.snapshots.SnapshotKt.f2988b
            java.lang.Object r3 = r3.mo5886c()
            androidx.compose.runtime.snapshots.f r3 = (androidx.compose.runtime.snapshots.C1385f) r3
            r9 = 0
            r10 = 0
            androidx.compose.runtime.snapshots.f r3 = androidx.compose.runtime.snapshots.SnapshotKt.m2908g(r3, r9, r10)
            androidx.compose.runtime.snapshots.f r4 = r3.mo6001i()     // Catch:{ all -> 0x0b78 }
            int r11 = r2.mo4224e()     // Catch:{ all -> 0x0b7a }
            int r12 = r2.mo4225f()     // Catch:{ all -> 0x0b7a }
            kotlin.m r2 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0b7a }
            androidx.compose.runtime.snapshots.C1385f.m2974o(r4)     // Catch:{ all -> 0x0b78 }
            r3.mo5930c()
            androidx.compose.foundation.lazy.LazyListState r2 = r1.$state
            float r13 = r2.f1604d
            boolean r14 = r1.$isVertical
            androidx.compose.foundation.lazy.l r2 = r1.$itemProvider
            java.util.List r7 = r2.mo4202f()
            androidx.compose.foundation.layout.d$k r6 = r1.$verticalArrangement
            androidx.compose.foundation.layout.d$d r4 = r1.$horizontalArrangement
            boolean r5 = r1.$reverseLayout
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r3 = r1.$placementAnimator
            androidx.compose.foundation.lazy.f r2 = r1.$beyondBoundsInfo
            androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$2 r9 = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$2
            r10 = r2
            r2 = r9
            r18 = r12
            r12 = r3
            r3 = r46
            r19 = r4
            r20 = r5
            r4 = r47
            r1 = r6
            r6 = r21
            r47 = r1
            r1 = r7
            r7 = r15
            r2.<init>(r3, r4, r6, r7)
            java.lang.String r2 = "headerIndexes"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            java.lang.String r2 = "placementAnimator"
            kotlin.jvm.internal.C19383o.m32797g(r12, r2)
            java.lang.String r2 = "beyondBoundsInfo"
            kotlin.jvm.internal.C19383o.m32797g(r10, r2)
            if (r0 < 0) goto L_0x01f0
            r2 = 1
            goto L_0x01f1
        L_0x01f0:
            r2 = 0
        L_0x01f1:
            java.lang.String r3 = "Failed requirement."
            if (r2 == 0) goto L_0x0b6c
            if (r16 < 0) goto L_0x01f9
            r2 = 1
            goto L_0x01fa
        L_0x01f9:
            r2 = 0
        L_0x01fa:
            if (r2 == 0) goto L_0x0b60
            if (r30 > 0) goto L_0x0238
            androidx.compose.foundation.lazy.n r0 = new androidx.compose.foundation.lazy.n
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            int r1 = p174m0.C7280a.m13965j(r28)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = p174m0.C7280a.m13964i(r28)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1 r3 = androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1.INSTANCE
            java.lang.Object r1 = r9.invoke(r1, r2, r3)
            r36 = r1
            androidx.compose.ui.layout.w r36 = (androidx.compose.p015ui.layout.C1712w) r36
            kotlin.collections.EmptyList r37 = kotlin.collections.EmptyList.INSTANCE
            r38 = 0
            if (r14 == 0) goto L_0x022b
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x022d
        L_0x022b:
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x022d:
            r39 = r1
            r31 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x0234:
            r1 = r45
            goto L_0x0a9f
        L_0x0238:
            r7 = r30
            if (r11 < r7) goto L_0x0240
            int r11 = r7 + -1
            r18 = 0
        L_0x0240:
            int r2 = p173m.C7279a.m13954l(r13)
            int r4 = r18 - r2
            if (r11 != 0) goto L_0x024a
            r5 = 1
            goto L_0x024b
        L_0x024a:
            r5 = 0
        L_0x024b:
            if (r5 == 0) goto L_0x0251
            if (r4 >= 0) goto L_0x0251
            int r2 = r2 + r4
            r4 = 0
        L_0x0251:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r4 = r4 - r0
            int r5 = -r0
            r15 = 0
        L_0x0259:
            if (r4 >= 0) goto L_0x027b
            int r18 = r11 + 0
            if (r18 <= 0) goto L_0x027b
            int r11 = r11 + -1
            r18 = r9
            androidx.compose.foundation.lazy.w r9 = r8.mo4402a(r11)
            r21 = r11
            r11 = 0
            r6.add(r11, r9)
            int r11 = r9.f1868p
            int r15 = java.lang.Math.max(r15, r11)
            int r9 = r9.f1867o
            int r4 = r4 + r9
            r9 = r18
            r11 = r21
            goto L_0x0259
        L_0x027b:
            r18 = r9
            if (r4 >= r5) goto L_0x0281
            int r2 = r2 + r4
            r4 = r5
        L_0x0281:
            int r4 = r4 + r0
            int r9 = r24 + r16
            r16 = r11
            if (r9 >= 0) goto L_0x0289
            r9 = 0
        L_0x0289:
            int r11 = -r4
            r21 = r4
            int r4 = r6.size()
            r22 = r15
            r23 = r16
            r15 = 0
        L_0x0295:
            if (r15 >= r4) goto L_0x02ab
            java.lang.Object r25 = r6.get(r15)
            r26 = r4
            r4 = r25
            androidx.compose.foundation.lazy.w r4 = (androidx.compose.foundation.lazy.C0864w) r4
            int r23 = r23 + 1
            int r4 = r4.f1867o
            int r11 = r11 + r4
            int r15 = r15 + 1
            r4 = r26
            goto L_0x0295
        L_0x02ab:
            r15 = r22
            r4 = r23
        L_0x02af:
            if (r11 <= r9) goto L_0x02b7
            boolean r22 = r6.isEmpty()
            if (r22 == 0) goto L_0x02e8
        L_0x02b7:
            if (r4 >= r7) goto L_0x02e8
            r22 = r9
            androidx.compose.foundation.lazy.w r9 = r8.mo4402a(r4)
            r23 = r12
            int r12 = r9.f1867o
            int r11 = r11 + r12
            if (r11 > r5) goto L_0x02d3
            r25 = r5
            int r5 = r7 + -1
            if (r4 == r5) goto L_0x02d5
            int r5 = r4 + 1
            int r21 = r21 - r12
            r16 = r5
            goto L_0x02df
        L_0x02d3:
            r25 = r5
        L_0x02d5:
            int r5 = r9.f1868p
            int r5 = java.lang.Math.max(r15, r5)
            r6.add(r9)
            r15 = r5
        L_0x02df:
            int r4 = r4 + 1
            r9 = r22
            r12 = r23
            r5 = r25
            goto L_0x02af
        L_0x02e8:
            r25 = r5
            r23 = r12
            r4 = r24
            if (r11 >= r4) goto L_0x0322
            int r5 = r4 - r11
            int r21 = r21 - r5
            int r11 = r11 + r5
            r9 = r21
        L_0x02f7:
            if (r9 >= r0) goto L_0x0319
            int r12 = r16 + 0
            if (r12 <= 0) goto L_0x0319
            int r12 = r16 + -1
            r16 = r1
            androidx.compose.foundation.lazy.w r1 = r8.mo4402a(r12)
            r21 = r12
            r12 = 0
            r6.add(r12, r1)
            int r12 = r1.f1868p
            int r15 = java.lang.Math.max(r15, r12)
            int r1 = r1.f1867o
            int r9 = r9 + r1
            r1 = r16
            r16 = r21
            goto L_0x02f7
        L_0x0319:
            r16 = r1
            int r2 = r2 + r5
            if (r9 >= 0) goto L_0x0326
            int r2 = r2 + r9
            int r11 = r11 + r9
            r9 = 0
            goto L_0x0326
        L_0x0322:
            r16 = r1
            r9 = r21
        L_0x0326:
            int r1 = p173m.C7279a.m13954l(r13)
            if (r1 >= 0) goto L_0x032e
            r1 = -1
            goto L_0x0333
        L_0x032e:
            if (r1 <= 0) goto L_0x0332
            r1 = 1
            goto L_0x0333
        L_0x0332:
            r1 = 0
        L_0x0333:
            if (r2 >= 0) goto L_0x0337
            r5 = -1
            goto L_0x033c
        L_0x0337:
            if (r2 <= 0) goto L_0x033b
            r5 = 1
            goto L_0x033c
        L_0x033b:
            r5 = 0
        L_0x033c:
            if (r1 != r5) goto L_0x034e
            int r1 = p173m.C7279a.m13954l(r13)
            int r1 = java.lang.Math.abs(r1)
            int r5 = java.lang.Math.abs(r2)
            if (r1 < r5) goto L_0x034e
            float r1 = (float) r2
            r13 = r1
        L_0x034e:
            int r1 = -r9
            java.lang.Object r2 = kotlin.collections.C19327t.m32638T0(r6)
            androidx.compose.foundation.lazy.w r2 = (androidx.compose.foundation.lazy.C0864w) r2
            if (r0 <= 0) goto L_0x0381
            int r0 = r6.size()
            r5 = 0
        L_0x035c:
            if (r5 >= r0) goto L_0x0381
            java.lang.Object r21 = r6.get(r5)
            r12 = r21
            androidx.compose.foundation.lazy.w r12 = (androidx.compose.foundation.lazy.C0864w) r12
            int r12 = r12.f1867o
            if (r9 == 0) goto L_0x0381
            if (r12 > r9) goto L_0x0381
            r21 = r0
            int r0 = p568fn.C17782b.m29859Y(r6)
            if (r5 == r0) goto L_0x0381
            int r9 = r9 - r12
            int r5 = r5 + 1
            java.lang.Object r0 = r6.get(r5)
            r2 = r0
            androidx.compose.foundation.lazy.w r2 = (androidx.compose.foundation.lazy.C0864w) r2
            r0 = r21
            goto L_0x035c
        L_0x0381:
            r0 = r2
            r.e<androidx.compose.foundation.lazy.f$a> r2 = r10.f1627a
            boolean r2 = r2.mo20240n()
            if (r2 == 0) goto L_0x03ca
            java.lang.Object r2 = kotlin.collections.C19327t.m32638T0(r6)
            androidx.compose.foundation.lazy.w r2 = (androidx.compose.foundation.lazy.C0864w) r2
            int r2 = r2.f1853a
            int r5 = r10.mo4246b()
            int r12 = r7 + -1
            int r5 = java.lang.Math.min(r5, r12)
            if (r2 <= r5) goto L_0x03ca
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r5 = kotlin.collections.C19327t.m32638T0(r6)
            androidx.compose.foundation.lazy.w r5 = (androidx.compose.foundation.lazy.C0864w) r5
            int r5 = r5.f1853a
            r21 = -1
            int r5 = r5 + -1
            r21 = r15
            int r15 = r10.mo4246b()
            int r12 = java.lang.Math.min(r15, r12)
            if (r12 > r5) goto L_0x03c7
        L_0x03bb:
            androidx.compose.foundation.lazy.w r15 = r8.mo4402a(r5)
            r2.add(r15)
            if (r5 == r12) goto L_0x03c7
            int r5 = r5 + -1
            goto L_0x03bb
        L_0x03c7:
            kotlin.m r5 = kotlin.C19394m.f43287a
            goto L_0x03ce
        L_0x03ca:
            r21 = r15
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE
        L_0x03ce:
            r.e<androidx.compose.foundation.lazy.f$a> r5 = r10.f1627a
            boolean r5 = r5.mo20240n()
            if (r5 == 0) goto L_0x040e
            java.lang.Object r5 = kotlin.collections.C19327t.m32645a1(r6)
            androidx.compose.foundation.lazy.w r5 = (androidx.compose.foundation.lazy.C0864w) r5
            int r5 = r5.f1853a
            int r12 = r10.mo4245a()
            int r15 = r7 + -1
            int r12 = java.lang.Math.min(r12, r15)
            if (r5 >= r12) goto L_0x040e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r12 = kotlin.collections.C19327t.m32645a1(r6)
            androidx.compose.foundation.lazy.w r12 = (androidx.compose.foundation.lazy.C0864w) r12
            int r12 = r12.f1853a
            int r10 = r10.mo4245a()
            int r10 = java.lang.Math.min(r10, r15)
        L_0x03ff:
            if (r12 >= r10) goto L_0x040b
            int r12 = r12 + 1
            androidx.compose.foundation.lazy.w r15 = r8.mo4402a(r12)
            r5.add(r15)
            goto L_0x03ff
        L_0x040b:
            kotlin.m r10 = kotlin.C19394m.f43287a
            goto L_0x0410
        L_0x040e:
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.INSTANCE
        L_0x0410:
            java.lang.Object r10 = kotlin.collections.C19327t.m32638T0(r6)
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r0, r10)
            if (r10 == 0) goto L_0x0428
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L_0x0428
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto L_0x0428
            r10 = 1
            goto L_0x0429
        L_0x0428:
            r10 = 0
        L_0x0429:
            r30 = r7
            r12 = r9
            r15 = r10
            if (r14 == 0) goto L_0x0432
            r7 = r21
            goto L_0x0433
        L_0x0432:
            r7 = r11
        L_0x0433:
            r9 = r28
            int r7 = androidx.activity.C0114h.m287R(r7, r9)
            r24 = r7
            if (r14 == 0) goto L_0x043f
            r7 = r11
            goto L_0x0441
        L_0x043f:
            r7 = r21
        L_0x0441:
            int r9 = androidx.activity.C0114h.m286Q(r7, r9)
            if (r14 == 0) goto L_0x0449
            r10 = r9
            goto L_0x044b
        L_0x0449:
            r10 = r24
        L_0x044b:
            int r7 = java.lang.Math.min(r10, r4)
            if (r11 >= r7) goto L_0x0453
            r7 = 1
            goto L_0x0454
        L_0x0453:
            r7 = 0
        L_0x0454:
            if (r7 == 0) goto L_0x046c
            if (r1 != 0) goto L_0x045b
            r21 = 1
            goto L_0x045d
        L_0x045b:
            r21 = 0
        L_0x045d:
            if (r21 == 0) goto L_0x0460
            goto L_0x046c
        L_0x0460:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x046c:
            r21 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            int r26 = r6.size()
            int r28 = r2.size()
            int r28 = r28 + r26
            int r26 = r5.size()
            r29 = r4
            int r4 = r26 + r28
            r1.<init>(r4)
            if (r7 == 0) goto L_0x056d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0495
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x0495
            r2 = 1
            goto L_0x0496
        L_0x0495:
            r2 = 0
        L_0x0496:
            if (r2 == 0) goto L_0x0563
            int r7 = r6.size()
            int[] r4 = new int[r7]
            r2 = 0
        L_0x049f:
            if (r2 >= r7) goto L_0x04b6
            if (r20 != 0) goto L_0x04a5
            r3 = r2
            goto L_0x04a9
        L_0x04a5:
            int r3 = r7 - r2
            r5 = -1
            int r3 = r3 + r5
        L_0x04a9:
            java.lang.Object r3 = r6.get(r3)
            androidx.compose.foundation.lazy.w r3 = (androidx.compose.foundation.lazy.C0864w) r3
            int r3 = r3.f1866n
            r4[r2] = r3
            int r2 = r2 + 1
            goto L_0x049f
        L_0x04b6:
            int[] r5 = new int[r7]
            r2 = 0
        L_0x04b9:
            if (r2 >= r7) goto L_0x04c1
            r3 = 0
            r5[r2] = r3
            int r2 = r2 + 1
            goto L_0x04b9
        L_0x04c1:
            if (r14 == 0) goto L_0x04ec
            if (r47 == 0) goto L_0x04e2
            r3 = r46
            r2 = r47
            r2.mo4092b(r3, r10, r4, r5)
            r19 = r0
            r21 = r5
            r17 = r7
            r47 = r12
            r26 = r15
            r15 = r24
            r0 = r25
            r12 = r29
            r28 = r30
            r25 = r14
            r14 = r6
            goto L_0x0513
        L_0x04e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x04ec:
            r3 = r46
            if (r19 == 0) goto L_0x0559
            androidx.compose.ui.unit.LayoutDirection r17 = androidx.compose.p015ui.unit.LayoutDirection.Ltr
            r47 = r12
            r12 = r29
            r2 = r19
            r3 = r10
            r19 = r0
            r21 = r5
            r0 = r25
            r5 = r17
            r25 = r14
            r14 = r6
            r6 = r46
            r17 = r7
            r26 = r15
            r15 = r24
            r28 = r30
            r7 = r21
            r2.mo4095c(r3, r4, r5, r6, r7)
        L_0x0513:
            pq.i r2 = new pq.i
            int r7 = r17 + -1
            r3 = 0
            r2.<init>(r3, r7)
            if (r20 != 0) goto L_0x051e
            goto L_0x0529
        L_0x051e:
            int r4 = r2.f44415c
            int r2 = r2.f44416d
            int r2 = -r2
            pq.g r5 = new pq.g
            r5.<init>(r4, r3, r2)
            r2 = r5
        L_0x0529:
            int r3 = r2.f44414b
            int r4 = r2.f44415c
            int r2 = r2.f44416d
            if (r2 <= 0) goto L_0x0533
            if (r3 <= r4) goto L_0x0537
        L_0x0533:
            if (r2 >= 0) goto L_0x05d0
            if (r4 > r3) goto L_0x05d0
        L_0x0537:
            r5 = r21[r3]
            if (r20 != 0) goto L_0x053d
            r7 = r3
            goto L_0x0541
        L_0x053d:
            int r7 = r17 - r3
            r6 = -1
            int r7 = r7 + r6
        L_0x0541:
            java.lang.Object r6 = r14.get(r7)
            androidx.compose.foundation.lazy.w r6 = (androidx.compose.foundation.lazy.C0864w) r6
            if (r20 == 0) goto L_0x054e
            int r5 = r10 - r5
            int r7 = r6.f1866n
            int r5 = r5 - r7
        L_0x054e:
            androidx.compose.foundation.lazy.q r5 = r6.mo4401a(r5, r15, r9)
            r1.add(r5)
            if (r3 == r4) goto L_0x05d0
            int r3 = r3 + r2
            goto L_0x0537
        L_0x0559:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0563:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x056d:
            r19 = r0
            r47 = r12
            r26 = r15
            r15 = r24
            r0 = r25
            r12 = r29
            r28 = r30
            r25 = r14
            r14 = r6
            int r3 = r2.size()
            r6 = r21
            r4 = 0
        L_0x0585:
            if (r4 >= r3) goto L_0x059a
            java.lang.Object r7 = r2.get(r4)
            androidx.compose.foundation.lazy.w r7 = (androidx.compose.foundation.lazy.C0864w) r7
            int r10 = r7.f1867o
            int r6 = r6 - r10
            androidx.compose.foundation.lazy.q r7 = r7.mo4401a(r6, r15, r9)
            r1.add(r7)
            int r4 = r4 + 1
            goto L_0x0585
        L_0x059a:
            int r2 = r14.size()
            r3 = r21
            r4 = 0
        L_0x05a1:
            if (r4 >= r2) goto L_0x05b6
            java.lang.Object r6 = r14.get(r4)
            androidx.compose.foundation.lazy.w r6 = (androidx.compose.foundation.lazy.C0864w) r6
            androidx.compose.foundation.lazy.q r7 = r6.mo4401a(r3, r15, r9)
            r1.add(r7)
            int r6 = r6.f1867o
            int r3 = r3 + r6
            int r4 = r4 + 1
            goto L_0x05a1
        L_0x05b6:
            int r2 = r5.size()
            r4 = 0
        L_0x05bb:
            if (r4 >= r2) goto L_0x05d0
            java.lang.Object r6 = r5.get(r4)
            androidx.compose.foundation.lazy.w r6 = (androidx.compose.foundation.lazy.C0864w) r6
            androidx.compose.foundation.lazy.q r7 = r6.mo4401a(r3, r15, r9)
            r1.add(r7)
            int r6 = r6.f1867o
            int r3 = r3 + r6
            int r4 = r4 + 1
            goto L_0x05bb
        L_0x05d0:
            boolean r2 = r16.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0675
            java.lang.Object r2 = kotlin.collections.C19327t.m32638T0(r1)
            androidx.compose.foundation.lazy.q r2 = (androidx.compose.foundation.lazy.C0858q) r2
            int r2 = r2.f1834b
            int r3 = r16.size()
            r4 = -1
            r5 = -1
            r6 = 0
        L_0x05e7:
            if (r6 >= r3) goto L_0x061f
            r7 = r16
            java.lang.Object r10 = r7.get(r6)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 > r2) goto L_0x061f
            java.lang.Object r4 = r7.get(r6)
            java.lang.Number r4 = (java.lang.Number) r4
            int r5 = r4.intValue()
            int r6 = r6 + 1
            if (r6 < 0) goto L_0x0610
            int r4 = p568fn.C17782b.m29859Y(r7)
            if (r6 > r4) goto L_0x0610
            java.lang.Object r4 = r7.get(r6)
            goto L_0x0616
        L_0x0610:
            r4 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r4 = r10
        L_0x0616:
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r16 = r7
            goto L_0x05e7
        L_0x061f:
            int r2 = r1.size()
            r6 = -1
            r7 = 0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r41 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0629:
            if (r7 >= r2) goto L_0x0648
            java.lang.Object r16 = r1.get(r7)
            r3 = r16
            androidx.compose.foundation.lazy.q r3 = (androidx.compose.foundation.lazy.C0858q) r3
            r16 = r2
            int r2 = r3.f1834b
            if (r2 != r5) goto L_0x063d
            int r10 = r3.f1833a
            r6 = r7
            goto L_0x0643
        L_0x063d:
            if (r2 != r4) goto L_0x0643
            int r2 = r3.f1833a
            r41 = r2
        L_0x0643:
            int r7 = r7 + 1
            r2 = r16
            goto L_0x0629
        L_0x0648:
            r2 = -1
            if (r5 != r2) goto L_0x064c
            goto L_0x0675
        L_0x064c:
            androidx.compose.foundation.lazy.w r2 = r8.mo4402a(r5)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x0659
            int r5 = java.lang.Math.max(r0, r10)
            goto L_0x065a
        L_0x0659:
            r5 = r0
        L_0x065a:
            r0 = r41
            if (r0 == r3) goto L_0x0665
            int r3 = r2.f1866n
            int r0 = r0 - r3
            int r5 = java.lang.Math.min(r5, r0)
        L_0x0665:
            androidx.compose.foundation.lazy.q r0 = r2.mo4401a(r5, r15, r9)
            r2 = -1
            if (r6 == r2) goto L_0x0670
            r1.set(r6, r0)
            goto L_0x0676
        L_0x0670:
            r2 = 0
            r1.add(r2, r0)
            goto L_0x0676
        L_0x0675:
            r0 = 0
        L_0x0676:
            int r2 = (int) r13
            int r3 = r1.size()
            r4 = 0
        L_0x067c:
            if (r4 >= r3) goto L_0x068d
            java.lang.Object r5 = r1.get(r4)
            androidx.compose.foundation.lazy.q r5 = (androidx.compose.foundation.lazy.C0858q) r5
            boolean r5 = r5.f1844l
            if (r5 == 0) goto L_0x068a
            r3 = 1
            goto L_0x068e
        L_0x068a:
            int r4 = r4 + 1
            goto L_0x067c
        L_0x068d:
            r3 = 0
        L_0x068e:
            if (r3 != 0) goto L_0x06b6
            r3 = r23
            java.util.LinkedHashMap r2 = r3.f1576c
            r2.clear()
            java.util.Map r2 = kotlin.collections.C19294b0.m32559p0()
            r3.f1577d = r2
            r2 = -1
            r3.f1578e = r2
            r4 = 0
            r3.f1579f = r4
            r3.f1580g = r2
            r3.f1581h = r4
            r22 = r0
            r7 = r1
            r8 = r9
            r24 = r11
            r42 = r12
            r16 = r13
            r21 = r14
            r5 = r15
            goto L_0x0a1f
        L_0x06b6:
            r3 = r23
            boolean r4 = r3.f1575b
            if (r4 == 0) goto L_0x06be
            r7 = r9
            goto L_0x06bf
        L_0x06be:
            r7 = r15
        L_0x06bf:
            if (r20 == 0) goto L_0x06c2
            int r2 = -r2
        L_0x06c2:
            if (r4 == 0) goto L_0x06c6
            r5 = 0
            goto L_0x06c7
        L_0x06c6:
            r5 = r2
        L_0x06c7:
            if (r4 != 0) goto L_0x06ca
            r2 = 0
        L_0x06ca:
            long r4 = kotlin.reflect.C19421p.m32949o(r5, r2)
            java.lang.Object r2 = kotlin.collections.C19327t.m32638T0(r1)
            androidx.compose.foundation.lazy.q r2 = (androidx.compose.foundation.lazy.C0858q) r2
            java.lang.Object r6 = kotlin.collections.C19327t.m32645a1(r1)
            androidx.compose.foundation.lazy.q r6 = (androidx.compose.foundation.lazy.C0858q) r6
            int r10 = r1.size()
            r16 = r13
            r13 = 0
            r17 = 0
        L_0x06e3:
            if (r13 >= r10) goto L_0x070a
            java.lang.Object r21 = r1.get(r13)
            r46 = r10
            r10 = r21
            androidx.compose.foundation.lazy.q r10 = (androidx.compose.foundation.lazy.C0858q) r10
            r21 = r14
            java.util.LinkedHashMap r14 = r3.f1576c
            r22 = r0
            java.lang.Object r0 = r10.f1835c
            java.lang.Object r0 = r14.get(r0)
            androidx.compose.foundation.lazy.c r0 = (androidx.compose.foundation.lazy.C0776c) r0
            int r0 = r10.f1837e
            int r17 = r17 + r0
            int r13 = r13 + 1
            r10 = r46
            r14 = r21
            r0 = r22
            goto L_0x06e3
        L_0x070a:
            r22 = r0
            r21 = r14
            int r0 = r1.size()
            int r17 = r17 / r0
            java.util.LinkedHashSet r0 = r3.f1582i
            r0.clear()
            int r0 = r1.size()
            r10 = 0
        L_0x071e:
            if (r10 >= r0) goto L_0x0887
            java.lang.Object r14 = r1.get(r10)
            androidx.compose.foundation.lazy.q r14 = (androidx.compose.foundation.lazy.C0858q) r14
            java.util.LinkedHashSet r13 = r3.f1582i
            r23 = r0
            java.lang.Object r0 = r14.f1835c
            r13.add(r0)
            java.util.LinkedHashMap r0 = r3.f1576c
            java.lang.Object r13 = r14.f1835c
            java.lang.Object r0 = r0.get(r13)
            androidx.compose.foundation.lazy.c r0 = (androidx.compose.foundation.lazy.C0776c) r0
            if (r0 != 0) goto L_0x0838
            boolean r0 = r14.f1844l
            if (r0 == 0) goto L_0x0826
            androidx.compose.foundation.lazy.c r0 = new androidx.compose.foundation.lazy.c
            r0.<init>()
            java.util.Map<java.lang.Object, java.lang.Integer> r13 = r3.f1577d
            r24 = r11
            java.lang.Object r11 = r14.f1835c
            java.lang.Object r11 = r13.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            r30 = r8
            r29 = r9
            r13 = 0
            long r8 = r14.mo4396d(r13)
            int r41 = r14.mo4395c(r13)
            if (r11 != 0) goto L_0x0766
            int r11 = r3.mo4193c(r8)
            r42 = r12
            goto L_0x079d
        L_0x0766:
            if (r20 != 0) goto L_0x076f
            int r13 = r3.mo4193c(r8)
            r42 = r12
            goto L_0x077a
        L_0x076f:
            int r13 = r3.mo4193c(r8)
            r42 = r12
            int r12 = r14.f1837e
            int r13 = r13 - r12
            int r13 = r13 + r41
        L_0x077a:
            r39 = r13
            int r12 = r14.f1837e
            int r32 = r11.intValue()
            r31 = r3
            r33 = r12
            r34 = r17
            r35 = r4
            r37 = r20
            r38 = r7
            r40 = r1
            int r11 = r31.mo4192a(r32, r33, r34, r35, r37, r38, r39, r40)
            if (r20 == 0) goto L_0x079b
            int r12 = r14.f1836d
            int r12 = r12 - r41
            goto L_0x079c
        L_0x079b:
            r12 = 0
        L_0x079c:
            int r11 = r11 + r12
        L_0x079d:
            boolean r12 = r3.f1575b
            if (r12 == 0) goto L_0x07a8
            r12 = 1
            r13 = 0
            long r31 = p174m0.C7287g.m13991a(r13, r11, r12, r8)
            goto L_0x07ae
        L_0x07a8:
            r13 = 0
            r12 = 2
            long r31 = p174m0.C7287g.m13991a(r11, r13, r12, r8)
        L_0x07ae:
            java.util.List<androidx.compose.foundation.lazy.p> r11 = r14.f1841i
            int r11 = r11.size()
            r12 = 0
        L_0x07b5:
            if (r12 >= r11) goto L_0x0812
            long r33 = r14.mo4396d(r12)
            r35 = r6
            r41 = r7
            r13 = 32
            long r6 = r33 >> r13
            int r6 = (int) r6
            r7 = r1
            r36 = r2
            long r1 = r8 >> r13
            int r1 = (int) r1
            int r6 = r6 - r1
            int r1 = p174m0.C7287g.m13992b(r33)
            int r2 = p174m0.C7287g.m13992b(r8)
            int r1 = r1 - r2
            long r1 = kotlin.reflect.C19421p.m32949o(r6, r1)
            java.util.ArrayList r6 = r0.f1624b
            r33 = r8
            androidx.compose.foundation.lazy.z r8 = new androidx.compose.foundation.lazy.z
            r37 = r10
            long r9 = r31 >> r13
            int r9 = (int) r9
            r38 = r11
            long r10 = r1 >> r13
            int r10 = (int) r10
            int r9 = r9 + r10
            int r10 = p174m0.C7287g.m13992b(r31)
            int r1 = p174m0.C7287g.m13992b(r1)
            int r1 = r1 + r10
            long r1 = kotlin.reflect.C19421p.m32949o(r9, r1)
            int r9 = r14.mo4395c(r12)
            r8.<init>(r9, r1)
            r6.add(r8)
            kotlin.m r1 = kotlin.C19394m.f43287a
            int r12 = r12 + 1
            r1 = r7
            r8 = r33
            r6 = r35
            r2 = r36
            r10 = r37
            r11 = r38
            r7 = r41
            goto L_0x07b5
        L_0x0812:
            r36 = r2
            r35 = r6
            r41 = r7
            r37 = r10
            r7 = r1
            java.util.LinkedHashMap r1 = r3.f1576c
            java.lang.Object r2 = r14.f1835c
            r1.put(r2, r0)
            r3.mo4194d(r14, r0)
            goto L_0x0872
        L_0x0826:
            r36 = r2
            r35 = r6
            r41 = r7
            r30 = r8
            r29 = r9
            r37 = r10
            r24 = r11
            r42 = r12
            r7 = r1
            goto L_0x0872
        L_0x0838:
            r36 = r2
            r35 = r6
            r41 = r7
            r30 = r8
            r29 = r9
            r37 = r10
            r24 = r11
            r42 = r12
            r7 = r1
            boolean r1 = r14.f1844l
            if (r1 == 0) goto L_0x086b
            long r1 = r0.f1623a
            r6 = 32
            long r8 = r1 >> r6
            int r8 = (int) r8
            long r9 = r4 >> r6
            int r6 = (int) r9
            int r8 = r8 + r6
            int r1 = p174m0.C7287g.m13992b(r1)
            int r2 = p174m0.C7287g.m13992b(r4)
            int r2 = r2 + r1
            long r1 = kotlin.reflect.C19421p.m32949o(r8, r2)
            r0.f1623a = r1
            r3.mo4194d(r14, r0)
            goto L_0x0872
        L_0x086b:
            java.util.LinkedHashMap r0 = r3.f1576c
            java.lang.Object r1 = r14.f1835c
            r0.remove(r1)
        L_0x0872:
            int r10 = r37 + 1
            r1 = r7
            r0 = r23
            r11 = r24
            r9 = r29
            r8 = r30
            r6 = r35
            r2 = r36
            r7 = r41
            r12 = r42
            goto L_0x071e
        L_0x0887:
            r36 = r2
            r35 = r6
            r41 = r7
            r30 = r8
            r29 = r9
            r24 = r11
            r42 = r12
            r7 = r1
            if (r20 != 0) goto L_0x08b2
            r2 = r36
            int r0 = r2.f1834b
            r3.f1578e = r0
            int r0 = r2.f1833a
            r3.f1579f = r0
            r6 = r35
            int r0 = r6.f1834b
            r3.f1580g = r0
            int r0 = r6.f1833a
            int r1 = r6.f1837e
            int r0 = r0 + r1
            int r0 = r0 - r41
            r3.f1581h = r0
            goto L_0x08d2
        L_0x08b2:
            r6 = r35
            r2 = r36
            int r0 = r6.f1834b
            r3.f1578e = r0
            int r0 = r6.f1833a
            int r0 = r41 - r0
            int r1 = r6.f1836d
            int r0 = r0 - r1
            r3.f1579f = r0
            int r0 = r2.f1834b
            r3.f1580g = r0
            int r0 = r2.f1833a
            int r0 = -r0
            int r1 = r2.f1837e
            int r2 = r2.f1836d
            int r1 = r1 - r2
            int r1 = r1 + r0
            r3.f1581h = r1
        L_0x08d2:
            java.util.LinkedHashMap r0 = r3.f1576c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x08dc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a12
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.LinkedHashSet r2 = r3.f1582i
            java.lang.Object r6 = r1.getKey()
            boolean r2 = r2.contains(r6)
            if (r2 != 0) goto L_0x09fc
            java.lang.Object r2 = r1.getValue()
            androidx.compose.foundation.lazy.c r2 = (androidx.compose.foundation.lazy.C0776c) r2
            long r8 = r2.f1623a
            r6 = 32
            long r10 = r8 >> r6
            int r10 = (int) r10
            long r11 = r4 >> r6
            int r6 = (int) r11
            int r10 = r10 + r6
            int r6 = p174m0.C7287g.m13992b(r8)
            int r8 = p174m0.C7287g.m13992b(r4)
            int r8 = r8 + r6
            long r8 = kotlin.reflect.C19421p.m32949o(r10, r8)
            r2.f1623a = r8
            r6 = r30
            androidx.compose.foundation.lazy.l r8 = r6.f1869a
            java.util.Map r8 = r8.mo4200d()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r8.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.ArrayList r8 = r2.f1624b
            int r9 = r8.size()
            r11 = 0
        L_0x092d:
            if (r11 >= r9) goto L_0x097f
            java.lang.Object r10 = r8.get(r11)
            androidx.compose.foundation.lazy.z r10 = (androidx.compose.foundation.lazy.C0867z) r10
            long r12 = r10.f1875c
            r14 = r8
            r23 = r9
            long r8 = r2.f1623a
            r31 = r14
            r46 = r15
            r30 = 32
            long r14 = r12 >> r30
            int r14 = (int) r14
            r43 = r4
            long r4 = r8 >> r30
            int r4 = (int) r4
            int r14 = r14 + r4
            int r4 = p174m0.C7287g.m13992b(r12)
            int r5 = p174m0.C7287g.m13992b(r8)
            int r5 = r5 + r4
            long r4 = kotlin.reflect.C19421p.m32949o(r14, r5)
            int r8 = r3.mo4193c(r4)
            int r9 = r10.f1873a
            int r8 = r8 + r9
            if (r8 <= 0) goto L_0x096b
            int r4 = r3.mo4193c(r4)
            r15 = r41
            if (r4 >= r15) goto L_0x096d
            r4 = 1
            goto L_0x096e
        L_0x096b:
            r15 = r41
        L_0x096d:
            r4 = 0
        L_0x096e:
            if (r4 == 0) goto L_0x0972
            r11 = 1
            goto L_0x0988
        L_0x0972:
            int r11 = r11 + 1
            r41 = r15
            r9 = r23
            r8 = r31
            r4 = r43
            r15 = r46
            goto L_0x092d
        L_0x097f:
            r43 = r4
            r46 = r15
            r15 = r41
            r30 = 32
            r11 = 0
        L_0x0988:
            java.util.ArrayList r4 = r2.f1624b
            int r5 = r4.size()
            r8 = 0
        L_0x098f:
            if (r8 >= r5) goto L_0x09aa
            java.lang.Object r9 = r4.get(r8)
            androidx.compose.foundation.lazy.z r9 = (androidx.compose.foundation.lazy.C0867z) r9
            androidx.compose.runtime.ParcelableSnapshotMutableState r9 = r9.f1876d
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x09a7
            r4 = 1
            goto L_0x09ab
        L_0x09a7:
            int r8 = r8 + 1
            goto L_0x098f
        L_0x09aa:
            r4 = 0
        L_0x09ab:
            r5 = 1
            r4 = r4 ^ r5
            if (r11 != 0) goto L_0x09b1
            if (r4 != 0) goto L_0x09f4
        L_0x09b1:
            if (r1 == 0) goto L_0x09f4
            java.util.ArrayList r4 = r2.f1624b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x09bc
            goto L_0x09f4
        L_0x09bc:
            int r4 = r1.intValue()
            androidx.compose.foundation.lazy.w r4 = r6.mo4402a(r4)
            int r5 = r4.f1867o
            int r32 = r1.intValue()
            r31 = r3
            r33 = r5
            r34 = r17
            r35 = r43
            r37 = r20
            r38 = r15
            r39 = r15
            r40 = r7
            int r1 = r31.mo4192a(r32, r33, r34, r35, r37, r38, r39, r40)
            if (r20 == 0) goto L_0x09e5
            int r1 = r15 - r1
            int r5 = r4.f1866n
            int r1 = r1 - r5
        L_0x09e5:
            r5 = r46
            r8 = r29
            androidx.compose.foundation.lazy.q r1 = r4.mo4401a(r1, r5, r8)
            r7.add(r1)
            r3.mo4194d(r1, r2)
            goto L_0x0a07
        L_0x09f4:
            r5 = r46
            r8 = r29
            r0.remove()
            goto L_0x0a07
        L_0x09fc:
            r43 = r4
            r5 = r15
            r8 = r29
            r6 = r30
            r15 = r41
            r30 = 32
        L_0x0a07:
            r30 = r6
            r29 = r8
            r41 = r15
            r15 = r5
            r4 = r43
            goto L_0x08dc
        L_0x0a12:
            r5 = r15
            r8 = r29
            r6 = r30
            androidx.compose.foundation.lazy.l r0 = r6.f1869a
            java.util.Map r0 = r0.mo4200d()
            r3.f1577d = r0
        L_0x0a1f:
            r11 = r24
            r3 = r42
            if (r11 <= r3) goto L_0x0a27
            r0 = 1
            goto L_0x0a28
        L_0x0a27:
            r0 = 0
        L_0x0a28:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3 r3 = new androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
            r4 = r22
            r3.<init>(r7, r4)
            r5 = r18
            java.lang.Object r1 = r5.invoke(r1, r2, r3)
            r23 = r1
            androidx.compose.ui.layout.w r23 = (androidx.compose.p015ui.layout.C1712w) r23
            if (r26 == 0) goto L_0x0a46
            r24 = r7
            goto L_0x0a84
        L_0x0a46:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r7.size()
            r1.<init>(r2)
            int r2 = r7.size()
            r11 = 0
        L_0x0a54:
            if (r11 >= r2) goto L_0x0a82
            java.lang.Object r3 = r7.get(r11)
            r5 = r3
            androidx.compose.foundation.lazy.q r5 = (androidx.compose.foundation.lazy.C0858q) r5
            int r6 = r5.f1834b
            java.lang.Object r8 = kotlin.collections.C19327t.m32638T0(r21)
            androidx.compose.foundation.lazy.w r8 = (androidx.compose.foundation.lazy.C0864w) r8
            int r8 = r8.f1853a
            if (r6 < r8) goto L_0x0a75
            int r6 = r5.f1834b
            java.lang.Object r8 = kotlin.collections.C19327t.m32645a1(r21)
            androidx.compose.foundation.lazy.w r8 = (androidx.compose.foundation.lazy.C0864w) r8
            int r8 = r8.f1853a
            if (r6 <= r8) goto L_0x0a77
        L_0x0a75:
            if (r5 != r4) goto L_0x0a79
        L_0x0a77:
            r5 = 1
            goto L_0x0a7a
        L_0x0a79:
            r5 = 0
        L_0x0a7a:
            if (r5 == 0) goto L_0x0a7f
            r1.add(r3)
        L_0x0a7f:
            int r11 = r11 + 1
            goto L_0x0a54
        L_0x0a82:
            r24 = r1
        L_0x0a84:
            if (r25 == 0) goto L_0x0a89
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0a8b
        L_0x0a89:
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0a8b:
            r26 = r1
            androidx.compose.foundation.lazy.n r1 = new androidx.compose.foundation.lazy.n
            r18 = r1
            r20 = r47
            r21 = r0
            r22 = r16
            r25 = r28
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = r1
            goto L_0x0234
        L_0x0a9f:
            androidx.compose.foundation.lazy.LazyListState r2 = r1.$state
            androidx.compose.foundation.w r3 = r1.$overscrollEffect
            r2.getClass()
            androidx.compose.foundation.lazy.t r4 = r2.f1601a
            r4.getClass()
            androidx.compose.foundation.lazy.w r5 = r0.f1815a
            if (r5 == 0) goto L_0x0ab2
            java.lang.Object r5 = r5.f1865m
            goto L_0x0ab3
        L_0x0ab2:
            r5 = 0
        L_0x0ab3:
            r4.f1850d = r5
            boolean r5 = r4.f1849c
            if (r5 != 0) goto L_0x0ac1
            int r5 = r0.f1820f
            if (r5 <= 0) goto L_0x0abe
            goto L_0x0ac1
        L_0x0abe:
            r7 = 0
            r11 = 1
            goto L_0x0af6
        L_0x0ac1:
            r11 = 1
            r4.f1849c = r11
            int r5 = r0.f1816b
            float r6 = (float) r5
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x0ace
            r6 = r11
            goto L_0x0acf
        L_0x0ace:
            r6 = 0
        L_0x0acf:
            if (r6 == 0) goto L_0x0b40
            androidx.compose.runtime.j1 r6 = androidx.compose.runtime.snapshots.SnapshotKt.f2988b
            java.lang.Object r6 = r6.mo5886c()
            androidx.compose.runtime.snapshots.f r6 = (androidx.compose.runtime.snapshots.C1385f) r6
            r7 = 0
            r8 = 0
            androidx.compose.runtime.snapshots.f r6 = androidx.compose.runtime.snapshots.SnapshotKt.m2908g(r6, r8, r7)
            androidx.compose.runtime.snapshots.f r8 = r6.mo6001i()     // Catch:{ all -> 0x0b3b }
            androidx.compose.foundation.lazy.w r9 = r0.f1815a     // Catch:{ all -> 0x0b36 }
            if (r9 == 0) goto L_0x0aea
            int r9 = r9.f1853a     // Catch:{ all -> 0x0b36 }
            goto L_0x0aeb
        L_0x0aea:
            r9 = r7
        L_0x0aeb:
            r4.mo4400a(r9, r5)     // Catch:{ all -> 0x0b36 }
            kotlin.m r4 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0b36 }
            androidx.compose.runtime.snapshots.C1385f.m2974o(r8)     // Catch:{ all -> 0x0b3b }
            r6.mo5930c()
        L_0x0af6:
            float r4 = r2.f1604d
            float r5 = r0.f1818d
            float r4 = r4 - r5
            r2.f1604d = r4
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = r2.f1602b
            r4.setValue(r0)
            boolean r4 = r0.f1817c
            r2.f1617q = r4
            androidx.compose.foundation.lazy.w r5 = r0.f1815a
            if (r5 == 0) goto L_0x0b0d
            int r6 = r5.f1853a
            goto L_0x0b0e
        L_0x0b0d:
            r6 = r7
        L_0x0b0e:
            if (r6 != 0) goto L_0x0b17
            int r6 = r0.f1816b
            if (r6 == 0) goto L_0x0b15
            goto L_0x0b17
        L_0x0b15:
            r6 = r7
            goto L_0x0b18
        L_0x0b17:
            r6 = r11
        L_0x0b18:
            r2.f1616p = r6
            if (r5 == 0) goto L_0x0b1f
            int r2 = r5.f1853a
            goto L_0x0b20
        L_0x0b1f:
            r2 = r7
        L_0x0b20:
            if (r2 != 0) goto L_0x0b29
            int r2 = r0.f1816b
            if (r2 == 0) goto L_0x0b27
            goto L_0x0b29
        L_0x0b27:
            r2 = r7
            goto L_0x0b2a
        L_0x0b29:
            r2 = r11
        L_0x0b2a:
            if (r4 != 0) goto L_0x0b31
            if (r2 == 0) goto L_0x0b2f
            goto L_0x0b31
        L_0x0b2f:
            r10 = r7
            goto L_0x0b32
        L_0x0b31:
            r10 = r11
        L_0x0b32:
            r3.setEnabled(r10)
            return r0
        L_0x0b36:
            r0 = move-exception
            androidx.compose.runtime.snapshots.C1385f.m2974o(r8)     // Catch:{ all -> 0x0b3b }
            throw r0     // Catch:{ all -> 0x0b3b }
        L_0x0b3b:
            r0 = move-exception
            r6.mo5930c()
            throw r0
        L_0x0b40:
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
        L_0x0b60:
            r1 = r45
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0b6c:
            r1 = r45
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0b78:
            r0 = move-exception
            goto L_0x0b7f
        L_0x0b7a:
            r0 = move-exception
            androidx.compose.runtime.snapshots.C1385f.m2974o(r4)     // Catch:{ all -> 0x0b78 }
            throw r0     // Catch:{ all -> 0x0b78 }
        L_0x0b7f:
            r3.mo5930c()
            throw r0
        L_0x0b83:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r17.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.m34685invoke0kLqBqw(androidx.compose.foundation.lazy.layout.f, long):androidx.compose.foundation.lazy.n");
    }
}
