package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: androidx.viewpager2.widget.f */
public final class C3362f extends RecyclerView.C3108s {

    /* renamed from: b */
    public ViewPager2.C3349i f7831b;

    /* renamed from: c */
    public final ViewPager2 f7832c;

    /* renamed from: d */
    public final RecyclerView f7833d;

    /* renamed from: e */
    public final LinearLayoutManager f7834e;

    /* renamed from: f */
    public int f7835f;

    /* renamed from: g */
    public int f7836g;

    /* renamed from: h */
    public C3363a f7837h = new C3363a();

    /* renamed from: i */
    public int f7838i;

    /* renamed from: j */
    public int f7839j;

    /* renamed from: k */
    public boolean f7840k;

    /* renamed from: l */
    public boolean f7841l;

    /* renamed from: m */
    public boolean f7842m;

    /* renamed from: n */
    public boolean f7843n;

    /* renamed from: androidx.viewpager2.widget.f$a */
    public static final class C3363a {

        /* renamed from: a */
        public int f7844a;

        /* renamed from: b */
        public float f7845b;

        /* renamed from: c */
        public int f7846c;
    }

    public C3362f(ViewPager2 viewPager2) {
        this.f7832c = viewPager2;
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        this.f7833d = recyclerView;
        this.f7834e = (LinearLayoutManager) recyclerView.getLayoutManager();
        mo12789c();
    }

    /* renamed from: a */
    public final void mo12787a(int i) {
        ViewPager2.C3349i iVar = this.f7831b;
        if (iVar != null) {
            iVar.mo12763c(i);
        }
    }

    /* renamed from: b */
    public final void mo12788b(int i) {
        if ((this.f7835f != 3 || this.f7836g != 0) && this.f7836g != i) {
            this.f7836g = i;
            ViewPager2.C3349i iVar = this.f7831b;
            if (iVar != null) {
                iVar.mo12762a(i);
            }
        }
    }

    /* renamed from: c */
    public final void mo12789c() {
        this.f7835f = 0;
        this.f7836g = 0;
        C3363a aVar = this.f7837h;
        aVar.f7844a = -1;
        aVar.f7845b = 0.0f;
        aVar.f7846c = 0;
        this.f7838i = -1;
        this.f7839j = -1;
        this.f7840k = false;
        this.f7841l = false;
        this.f7843n = false;
        this.f7842m = false;
    }

    /* renamed from: d */
    public final void mo12790d(boolean z) {
        this.f7843n = z;
        this.f7835f = z ? 4 : 1;
        int i = this.f7839j;
        if (i != -1) {
            this.f7838i = i;
            this.f7839j = -1;
        } else if (this.f7838i == -1) {
            this.f7838i = this.f7834e.mo11282S0();
        }
        mo12788b(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        if (r5[r3 - 1][1] >= r6) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0164 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12791e() {
        /*
            r13 = this;
            androidx.viewpager2.widget.f$a r0 = r13.f7837h
            androidx.recyclerview.widget.LinearLayoutManager r1 = r13.f7834e
            int r1 = r1.mo11282S0()
            r0.f7844a = r1
            r2 = 0
            r3 = 0
            r4 = -1
            if (r1 != r4) goto L_0x0016
            r0.f7844a = r4
            r0.f7845b = r3
            r0.f7846c = r2
            return
        L_0x0016:
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f7834e
            android.view.View r1 = r5.mo11314s(r1)
            if (r1 != 0) goto L_0x0025
            r0.f7844a = r4
            r0.f7845b = r3
            r0.f7846c = r2
            return
        L_0x0025:
            androidx.recyclerview.widget.LinearLayoutManager r4 = r13.f7834e
            r4.getClass()
            int r4 = androidx.recyclerview.widget.RecyclerView.C3100o.m7395D(r1)
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f7834e
            r5.getClass()
            int r5 = androidx.recyclerview.widget.RecyclerView.C3100o.m7398K(r1)
            androidx.recyclerview.widget.LinearLayoutManager r6 = r13.f7834e
            r6.getClass()
            int r6 = androidx.recyclerview.widget.RecyclerView.C3100o.m7399M(r1)
            androidx.recyclerview.widget.LinearLayoutManager r7 = r13.f7834e
            r7.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.C3100o.m7403w(r1)
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x005f
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            int r9 = r8.leftMargin
            int r4 = r4 + r9
            int r9 = r8.rightMargin
            int r5 = r5 + r9
            int r9 = r8.topMargin
            int r6 = r6 + r9
            int r8 = r8.bottomMargin
            int r7 = r7 + r8
        L_0x005f:
            int r8 = r1.getHeight()
            int r8 = r8 + r6
            int r8 = r8 + r7
            int r7 = r1.getWidth()
            int r7 = r7 + r4
            int r7 = r7 + r5
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f7834e
            int r5 = r5.f7017p
            r9 = 1
            if (r5 != 0) goto L_0x0074
            r5 = r9
            goto L_0x0075
        L_0x0074:
            r5 = r2
        L_0x0075:
            if (r5 == 0) goto L_0x008e
            int r1 = r1.getLeft()
            int r1 = r1 - r4
            androidx.recyclerview.widget.RecyclerView r4 = r13.f7833d
            int r4 = r4.getPaddingLeft()
            int r1 = r1 - r4
            androidx.viewpager2.widget.ViewPager2 r4 = r13.f7832c
            boolean r4 = r4.isRtl()
            if (r4 == 0) goto L_0x008c
            int r1 = -r1
        L_0x008c:
            r8 = r7
            goto L_0x009a
        L_0x008e:
            int r1 = r1.getTop()
            int r1 = r1 - r6
            androidx.recyclerview.widget.RecyclerView r4 = r13.f7833d
            int r4 = r4.getPaddingTop()
            int r1 = r1 - r4
        L_0x009a:
            int r1 = -r1
            r0.f7846c = r1
            if (r1 >= 0) goto L_0x018c
            androidx.viewpager2.widget.b r1 = new androidx.viewpager2.widget.b
            androidx.recyclerview.widget.LinearLayoutManager r3 = r13.f7834e
            r1.<init>(r3)
            int r3 = r3.mo11676y()
            if (r3 != 0) goto L_0x00ae
            goto L_0x013d
        L_0x00ae:
            androidx.recyclerview.widget.LinearLayoutManager r4 = r1.f7820a
            int r4 = r4.f7017p
            if (r4 != 0) goto L_0x00b6
            r4 = r9
            goto L_0x00b7
        L_0x00b6:
            r4 = r2
        L_0x00b7:
            r5 = 2
            int[] r6 = new int[r5]
            r6[r9] = r5
            r6[r2] = r3
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r6)
            int[][] r5 = (int[][]) r5
            r6 = r2
        L_0x00c7:
            if (r6 >= r3) goto L_0x0111
            androidx.recyclerview.widget.LinearLayoutManager r7 = r1.f7820a
            android.view.View r7 = r7.mo11674x(r6)
            if (r7 == 0) goto L_0x0109
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r10 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x00dc
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            goto L_0x00de
        L_0x00dc:
            android.view.ViewGroup$MarginLayoutParams r8 = androidx.viewpager2.widget.C3358b.f7819b
        L_0x00de:
            r10 = r5[r6]
            if (r4 == 0) goto L_0x00e9
            int r11 = r7.getLeft()
            int r12 = r8.leftMargin
            goto L_0x00ef
        L_0x00e9:
            int r11 = r7.getTop()
            int r12 = r8.topMargin
        L_0x00ef:
            int r11 = r11 - r12
            r10[r2] = r11
            r10 = r5[r6]
            if (r4 == 0) goto L_0x00fd
            int r7 = r7.getRight()
            int r8 = r8.rightMargin
            goto L_0x0103
        L_0x00fd:
            int r7 = r7.getBottom()
            int r8 = r8.bottomMargin
        L_0x0103:
            int r7 = r7 + r8
            r10[r9] = r7
            int r6 = r6 + 1
            goto L_0x00c7
        L_0x0109:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L_0x0111:
            androidx.viewpager2.widget.a r4 = new androidx.viewpager2.widget.a
            r4.<init>()
            java.util.Arrays.sort(r5, r4)
            r4 = r9
        L_0x011a:
            if (r4 >= r3) goto L_0x012c
            int r6 = r4 + -1
            r6 = r5[r6]
            r6 = r6[r9]
            r7 = r5[r4]
            r7 = r7[r2]
            if (r6 == r7) goto L_0x0129
            goto L_0x013f
        L_0x0129:
            int r4 = r4 + 1
            goto L_0x011a
        L_0x012c:
            r4 = r5[r2]
            r6 = r4[r9]
            r4 = r4[r2]
            int r6 = r6 - r4
            if (r4 > 0) goto L_0x013f
            int r3 = r3 - r9
            r3 = r5[r3]
            r3 = r3[r9]
            if (r3 >= r6) goto L_0x013d
            goto L_0x013f
        L_0x013d:
            r3 = r9
            goto L_0x0140
        L_0x013f:
            r3 = r2
        L_0x0140:
            if (r3 == 0) goto L_0x014a
            androidx.recyclerview.widget.LinearLayoutManager r3 = r1.f7820a
            int r3 = r3.mo11676y()
            if (r3 > r9) goto L_0x0169
        L_0x014a:
            androidx.recyclerview.widget.LinearLayoutManager r3 = r1.f7820a
            int r3 = r3.mo11676y()
            r4 = r2
        L_0x0151:
            if (r4 >= r3) goto L_0x0164
            androidx.recyclerview.widget.LinearLayoutManager r5 = r1.f7820a
            android.view.View r5 = r5.mo11674x(r4)
            boolean r5 = androidx.viewpager2.widget.C3358b.m8089a(r5)
            if (r5 == 0) goto L_0x0161
            r1 = r9
            goto L_0x0165
        L_0x0161:
            int r4 = r4 + 1
            goto L_0x0151
        L_0x0164:
            r1 = r2
        L_0x0165:
            if (r1 == 0) goto L_0x0169
            r1 = r9
            goto L_0x016a
        L_0x0169:
            r1 = r2
        L_0x016a:
            if (r1 == 0) goto L_0x0174
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        L_0x0174:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r4 = new java.lang.Object[r9]
            int r0 = r0.f7846c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r2] = r0
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r3, r0, r4)
            r1.<init>(r0)
            throw r1
        L_0x018c:
            if (r8 != 0) goto L_0x018f
            goto L_0x0193
        L_0x018f:
            float r1 = (float) r1
            float r2 = (float) r8
            float r3 = r1 / r2
        L_0x0193:
            r0.f7845b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C3362f.mo12791e():void");
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ViewPager2.C3349i iVar;
        int i2 = this.f7835f;
        boolean z = true;
        if (!(i2 == 1 && this.f7836g == 1) && i == 1) {
            mo12790d(false);
            return;
        }
        if (!(i2 == 1 || i2 == 4) || i != 2) {
            if ((i2 == 1 || i2 == 4) && i == 0) {
                mo12791e();
                if (!this.f7841l) {
                    int i3 = this.f7837h.f7844a;
                    if (!(i3 == -1 || (iVar = this.f7831b) == null)) {
                        iVar.mo12781b(i3, 0.0f, 0);
                    }
                } else {
                    C3363a aVar = this.f7837h;
                    if (aVar.f7846c == 0) {
                        int i4 = this.f7838i;
                        int i5 = aVar.f7844a;
                        if (i4 != i5) {
                            mo12787a(i5);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    mo12788b(0);
                    mo12789c();
                }
            }
            if (this.f7835f == 2 && i == 0 && this.f7842m) {
                mo12791e();
                C3363a aVar2 = this.f7837h;
                if (aVar2.f7846c == 0) {
                    int i6 = this.f7839j;
                    int i7 = aVar2.f7844a;
                    if (i6 != i7) {
                        if (i7 == -1) {
                            i7 = 0;
                        }
                        mo12787a(i7);
                    }
                    mo12788b(0);
                    mo12789c();
                }
            }
        } else if (this.f7841l) {
            mo12788b(2);
            this.f7840k = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r6 < 0) == r4.f7832c.isRtl()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.f7841l = r5
            r4.mo12791e()
            boolean r0 = r4.f7840k
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003d
            r4.f7840k = r2
            if (r7 > 0) goto L_0x0022
            if (r7 != 0) goto L_0x0020
            if (r6 >= 0) goto L_0x0016
            r6 = r5
            goto L_0x0017
        L_0x0016:
            r6 = r2
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.f7832c
            boolean r7 = r7.isRtl()
            if (r6 != r7) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r6 = r2
            goto L_0x0023
        L_0x0022:
            r6 = r5
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            androidx.viewpager2.widget.f$a r6 = r4.f7837h
            int r7 = r6.f7846c
            if (r7 == 0) goto L_0x002f
            int r6 = r6.f7844a
            int r6 = r6 + r5
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.f$a r6 = r4.f7837h
            int r6 = r6.f7844a
        L_0x0033:
            r4.f7839j = r6
            int r7 = r4.f7838i
            if (r7 == r6) goto L_0x004b
            r4.mo12787a(r6)
            goto L_0x004b
        L_0x003d:
            int r6 = r4.f7835f
            if (r6 != 0) goto L_0x004b
            androidx.viewpager2.widget.f$a r6 = r4.f7837h
            int r6 = r6.f7844a
            if (r6 != r1) goto L_0x0048
            r6 = r2
        L_0x0048:
            r4.mo12787a(r6)
        L_0x004b:
            androidx.viewpager2.widget.f$a r6 = r4.f7837h
            int r7 = r6.f7844a
            if (r7 != r1) goto L_0x0052
            r7 = r2
        L_0x0052:
            float r0 = r6.f7845b
            int r6 = r6.f7846c
            androidx.viewpager2.widget.ViewPager2$i r3 = r4.f7831b
            if (r3 == 0) goto L_0x005d
            r3.mo12781b(r7, r0, r6)
        L_0x005d:
            androidx.viewpager2.widget.f$a r6 = r4.f7837h
            int r7 = r6.f7844a
            int r0 = r4.f7839j
            if (r7 == r0) goto L_0x0067
            if (r0 != r1) goto L_0x0075
        L_0x0067:
            int r6 = r6.f7846c
            if (r6 != 0) goto L_0x0075
            int r6 = r4.f7836g
            if (r6 == r5) goto L_0x0075
            r4.mo12788b(r2)
            r4.mo12789c()
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C3362f.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
