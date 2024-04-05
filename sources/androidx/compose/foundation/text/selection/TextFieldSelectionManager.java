package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.text.C0958l;
import androidx.compose.foundation.text.C0965r;
import androidx.compose.foundation.text.C0966s;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.p015ui.focus.C1478l;
import androidx.compose.p015ui.platform.C1822c1;
import androidx.compose.p015ui.platform.C1827e0;
import androidx.compose.p015ui.platform.TextToolbarStatus;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p020b0.C3449a;
import p288y.C8343c;
import p753kq.C19857l;

public final class TextFieldSelectionManager {

    /* renamed from: a */
    public final C0966s f2083a;

    /* renamed from: b */
    public C1994n f2084b;

    /* renamed from: c */
    public C19857l<? super TextFieldValue, C19394m> f2085c;

    /* renamed from: d */
    public TextFieldState f2086d;

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f2087e;

    /* renamed from: f */
    public C1827e0 f2088f;

    /* renamed from: g */
    public C1822c1 f2089g;

    /* renamed from: h */
    public C3449a f2090h;

    /* renamed from: i */
    public C1478l f2091i;

    /* renamed from: j */
    public final ParcelableSnapshotMutableState f2092j;

    /* renamed from: k */
    public long f2093k;

    /* renamed from: l */
    public Integer f2094l;

    /* renamed from: m */
    public long f2095m;

    /* renamed from: n */
    public final ParcelableSnapshotMutableState f2096n;

    /* renamed from: o */
    public final ParcelableSnapshotMutableState f2097o;

    /* renamed from: p */
    public TextFieldValue f2098p;

    /* renamed from: q */
    public final C0995b f2099q;

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$a */
    public static final class C0994a implements C1008d {

        /* renamed from: a */
        public final /* synthetic */ TextFieldSelectionManager f2100a;

        public C0994a(TextFieldSelectionManager textFieldSelectionManager) {
            this.f2100a = textFieldSelectionManager;
        }

        /* renamed from: a */
        public final boolean mo4656a(long j) {
            TextFieldState textFieldState;
            C0965r c;
            if ((this.f2100a.mo4651j().f4448a.f4296b.length() == 0) || (textFieldState = this.f2100a.f2086d) == null || (c = textFieldState.mo4562c()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f2100a;
            C1994n nVar = textFieldSelectionManager.f2084b;
            long j2 = textFieldSelectionManager.mo4651j().f4449b;
            int i = C2022r.f4596c;
            TextFieldSelectionManager.m2038c(textFieldSelectionManager, textFieldSelectionManager.mo4651j(), nVar.mo7684b((int) (j2 >> 32)), c.mo4579b(j, false), false, SelectionAdjustment.Companion.f2053a);
            return true;
        }

        /* renamed from: b */
        public final boolean mo4657b(long j, SelectionAdjustment selectionAdjustment) {
            C0965r c;
            C1478l lVar = this.f2100a.f2091i;
            if (lVar != null) {
                lVar.mo6218a();
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f2100a;
            textFieldSelectionManager.f2093k = j;
            TextFieldState textFieldState = textFieldSelectionManager.f2086d;
            if (textFieldState == null || (c = textFieldState.mo4562c()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager2 = this.f2100a;
            textFieldSelectionManager2.f2094l = Integer.valueOf(c.mo4579b(j, true));
            int b = c.mo4579b(textFieldSelectionManager2.f2093k, true);
            TextFieldSelectionManager.m2038c(textFieldSelectionManager2, textFieldSelectionManager2.mo4651j(), b, b, false, selectionAdjustment);
            return true;
        }

        /* renamed from: c */
        public final boolean mo4658c(long j, SelectionAdjustment selectionAdjustment) {
            TextFieldState textFieldState;
            C0965r c;
            C19383o.m32797g(selectionAdjustment, "adjustment");
            if ((this.f2100a.mo4651j().f4448a.f4296b.length() == 0) || (textFieldState = this.f2100a.f2086d) == null || (c = textFieldState.mo4562c()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f2100a;
            int b = c.mo4579b(j, false);
            TextFieldValue j2 = textFieldSelectionManager.mo4651j();
            Integer num = textFieldSelectionManager.f2094l;
            C19383o.m32794d(num);
            TextFieldSelectionManager.m2038c(textFieldSelectionManager, j2, num.intValue(), b, false, selectionAdjustment);
            return true;
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$b */
    public static final class C0995b implements C0958l {

        /* renamed from: a */
        public final /* synthetic */ TextFieldSelectionManager f2101a;

        public C0995b(TextFieldSelectionManager textFieldSelectionManager) {
            this.f2101a = textFieldSelectionManager;
        }

        /* renamed from: a */
        public final void mo4510a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00b2  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4511b(long r10) {
            /*
                r9 = this;
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.f2101a
                androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.f2096n
                java.lang.Object r0 = r0.getValue()
                androidx.compose.foundation.text.Handle r0 = (androidx.compose.foundation.text.Handle) r0
                if (r0 == 0) goto L_0x000d
                return
            L_0x000d:
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.f2101a
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionEnd
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.m2037b(r0, r1)
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.f2101a
                r0.mo4652k()
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.f2101a
                androidx.compose.foundation.text.TextFieldState r0 = r0.f2086d
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x005c
                androidx.compose.foundation.text.r r0 = r0.mo4562c()
                if (r0 == 0) goto L_0x005c
                long r3 = r0.mo4578a(r10)
                long r3 = r0.mo4580c(r3)
                androidx.compose.ui.text.q r5 = r0.f2042a
                float r6 = p288y.C8343c.m16643d(r3)
                int r5 = r5.mo7745g(r6)
                float r6 = p288y.C8343c.m16642c(r3)
                androidx.compose.ui.text.q r7 = r0.f2042a
                float r7 = r7.mo7746h(r5)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 < 0) goto L_0x0057
                float r3 = p288y.C8343c.m16642c(r3)
                androidx.compose.ui.text.q r0 = r0.f2042a
                float r0 = r0.mo7748i(r5)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto L_0x0057
                r0 = r1
                goto L_0x0058
            L_0x0057:
                r0 = r2
            L_0x0058:
                if (r0 != r1) goto L_0x005c
                r0 = r1
                goto L_0x005d
            L_0x005c:
                r0 = r2
            L_0x005d:
                if (r0 != 0) goto L_0x00b2
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.f2101a
                androidx.compose.foundation.text.TextFieldState r0 = r0.f2086d
                if (r0 == 0) goto L_0x00b2
                androidx.compose.foundation.text.r r0 = r0.mo4562c()
                if (r0 == 0) goto L_0x00b2
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r1 = r9.f2101a
                androidx.compose.ui.text.input.n r3 = r1.f2084b
                float r10 = p288y.C8343c.m16643d(r10)
                r11 = 0
                long r10 = kotlin.reflect.C19421p.m32952q(r11, r10)
                long r10 = r0.mo4578a(r10)
                long r10 = r0.mo4580c(r10)
                float r10 = p288y.C8343c.m16643d(r10)
                androidx.compose.ui.text.q r11 = r0.f2042a
                int r10 = r11.mo7745g(r10)
                androidx.compose.ui.text.q r11 = r0.f2042a
                int r10 = r11.mo7742e(r10, r2)
                int r10 = r3.mo7683a(r10)
                b0.a r11 = r1.f2090h
                if (r11 == 0) goto L_0x009b
                r11.mo12970a()
            L_0x009b:
                androidx.compose.ui.text.input.TextFieldValue r11 = r1.mo4651j()
                androidx.compose.ui.text.a r11 = r11.f4448a
                long r2 = p001a0.C0005b.m47l(r10, r10)
                androidx.compose.ui.text.input.TextFieldValue r10 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.m2039e(r11, r2)
                r1.mo4649h()
                kq.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.m> r11 = r1.f2085c
                r11.invoke(r10)
                return
            L_0x00b2:
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.f2101a
                androidx.compose.ui.text.input.TextFieldValue r0 = r0.mo4651j()
                androidx.compose.ui.text.a r0 = r0.f4448a
                java.lang.String r0 = r0.f4296b
                int r0 = r0.length()
                if (r0 != 0) goto L_0x00c3
                r2 = r1
            L_0x00c3:
                if (r2 == 0) goto L_0x00c6
                return
            L_0x00c6:
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.f2101a
                r0.mo4649h()
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.f2101a
                androidx.compose.foundation.text.TextFieldState r0 = r0.f2086d
                if (r0 == 0) goto L_0x00f0
                androidx.compose.foundation.text.r r0 = r0.mo4562c()
                if (r0 == 0) goto L_0x00f0
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r8 = r9.f2101a
                int r0 = r0.mo4579b(r10, r1)
                androidx.compose.ui.text.input.TextFieldValue r3 = r8.mo4651j()
                r6 = 0
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1 r7 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.f2055c
                r2 = r8
                r4 = r0
                r5 = r0
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.m2038c(r2, r3, r4, r5, r6, r7)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r8.f2094l = r0
            L_0x00f0:
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.f2101a
                r0.f2093k = r10
                y.c r1 = new y.c
                r1.<init>(r10)
                androidx.compose.runtime.ParcelableSnapshotMutableState r10 = r0.f2097o
                r10.setValue(r1)
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.f2101a
                long r0 = p288y.C8343c.f18295b
                r10.f2095m = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.C0995b.mo4511b(long):void");
        }

        /* renamed from: c */
        public final void mo4512c() {
        }

        /* renamed from: d */
        public final void mo4513d(long j) {
            C0965r c;
            if (!(this.f2101a.mo4651j().f4448a.f4296b.length() == 0)) {
                TextFieldSelectionManager textFieldSelectionManager = this.f2101a;
                textFieldSelectionManager.f2095m = C8343c.m16645f(textFieldSelectionManager.f2095m, j);
                TextFieldState textFieldState = this.f2101a.f2086d;
                if (!(textFieldState == null || (c = textFieldState.mo4562c()) == null)) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.f2101a;
                    textFieldSelectionManager2.f2097o.setValue(new C8343c(C8343c.m16645f(textFieldSelectionManager2.f2093k, textFieldSelectionManager2.f2095m)));
                    Integer num = textFieldSelectionManager2.f2094l;
                    int intValue = num != null ? num.intValue() : c.mo4579b(textFieldSelectionManager2.f2093k, false);
                    C8343c cVar = (C8343c) textFieldSelectionManager2.f2097o.getValue();
                    C19383o.m32794d(cVar);
                    TextFieldSelectionManager.m2038c(textFieldSelectionManager2, textFieldSelectionManager2.mo4651j(), intValue, c.mo4579b(cVar.f18299a, false), false, SelectionAdjustment.Companion.f2055c);
                }
                TextFieldState textFieldState2 = this.f2101a.f2086d;
                if (textFieldState2 != null) {
                    textFieldState2.f1952i = false;
                }
            }
        }

        public final void onCancel() {
        }

        public final void onStop() {
            TextFieldSelectionManager.m2037b(this.f2101a, (Handle) null);
            TextFieldSelectionManager.m2036a(this.f2101a, (C8343c) null);
            TextFieldSelectionManager textFieldSelectionManager = this.f2101a;
            TextFieldState textFieldState = textFieldSelectionManager.f2086d;
            if (textFieldState != null) {
                textFieldState.f1952i = true;
            }
            C1822c1 c1Var = textFieldSelectionManager.f2089g;
            if ((c1Var != null ? c1Var.getStatus() : null) == TextToolbarStatus.Hidden) {
                this.f2101a.mo4655n();
            }
            this.f2101a.f2094l = null;
        }
    }

    public TextFieldSelectionManager() {
        this((C0966s) null);
    }

    /* renamed from: a */
    public static final void m2036a(TextFieldSelectionManager textFieldSelectionManager, C8343c cVar) {
        textFieldSelectionManager.f2097o.setValue(cVar);
    }

    /* renamed from: b */
    public static final void m2037b(TextFieldSelectionManager textFieldSelectionManager, Handle handle) {
        textFieldSelectionManager.f2096n.setValue(handle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0027, code lost:
        r5 = r5.mo4562c();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2038c(androidx.compose.foundation.text.selection.TextFieldSelectionManager r12, androidx.compose.p015ui.text.input.TextFieldValue r13, int r14, int r15, boolean r16, androidx.compose.foundation.text.selection.SelectionAdjustment r17) {
        /*
            r0 = r12
            r1 = r13
            r2 = r17
            androidx.compose.ui.text.input.n r3 = r0.f2084b
            long r4 = r1.f4449b
            int r6 = androidx.compose.p015ui.text.C2022r.f4596c
            r9 = 32
            long r4 = r4 >> r9
            int r4 = (int) r4
            int r3 = r3.mo7684b(r4)
            androidx.compose.ui.text.input.n r4 = r0.f2084b
            long r5 = r1.f4449b
            int r5 = androidx.compose.p015ui.text.C2022r.m4464c(r5)
            int r4 = r4.mo7684b(r5)
            long r3 = p001a0.C0005b.m47l(r3, r4)
            androidx.compose.foundation.text.TextFieldState r5 = r0.f2086d
            r6 = 0
            if (r5 == 0) goto L_0x0030
            androidx.compose.foundation.text.r r5 = r5.mo4562c()
            if (r5 == 0) goto L_0x0030
            androidx.compose.ui.text.q r5 = r5.f2042a
            goto L_0x0031
        L_0x0030:
            r5 = r6
        L_0x0031:
            boolean r7 = androidx.compose.p015ui.text.C2022r.m4463b(r3)
            if (r7 == 0) goto L_0x0038
            goto L_0x003d
        L_0x0038:
            androidx.compose.ui.text.r r6 = new androidx.compose.ui.text.r
            r6.<init>(r3)
        L_0x003d:
            r8 = r6
            java.lang.String r3 = "adjustment"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            r10 = 0
            if (r5 == 0) goto L_0x0062
            long r6 = p001a0.C0005b.m47l(r14, r15)
            if (r8 != 0) goto L_0x0055
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$a r3 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.f2054b
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r2, r3)
            if (r3 == 0) goto L_0x0055
            goto L_0x0066
        L_0x0055:
            r11 = -1
            r2 = r17
            r3 = r5
            r4 = r6
            r6 = r11
            r7 = r16
            long r6 = r2.mo4590a(r3, r4, r6, r7, r8)
            goto L_0x0066
        L_0x0062:
            long r6 = p001a0.C0005b.m47l(r10, r10)
        L_0x0066:
            androidx.compose.ui.text.input.n r2 = r0.f2084b
            long r3 = r6 >> r9
            int r3 = (int) r3
            int r2 = r2.mo7683a(r3)
            androidx.compose.ui.text.input.n r3 = r0.f2084b
            int r4 = androidx.compose.p015ui.text.C2022r.m4464c(r6)
            int r3 = r3.mo7683a(r4)
            long r2 = p001a0.C0005b.m47l(r2, r3)
            long r4 = r1.f4449b
            boolean r4 = androidx.compose.p015ui.text.C2022r.m4462a(r2, r4)
            if (r4 == 0) goto L_0x0086
            goto L_0x00bd
        L_0x0086:
            b0.a r4 = r0.f2090h
            if (r4 == 0) goto L_0x008d
            r4.mo12970a()
        L_0x008d:
            androidx.compose.ui.text.a r1 = r1.f4448a
            androidx.compose.ui.text.input.TextFieldValue r1 = m2039e(r1, r2)
            kq.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.m> r2 = r0.f2085c
            r2.invoke(r1)
            androidx.compose.foundation.text.TextFieldState r1 = r0.f2086d
            if (r1 != 0) goto L_0x009d
            goto L_0x00ab
        L_0x009d:
            r2 = 1
            boolean r2 = androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.m2058b(r12, r2)
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f1953j
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r2)
        L_0x00ab:
            androidx.compose.foundation.text.TextFieldState r1 = r0.f2086d
            if (r1 != 0) goto L_0x00b0
            goto L_0x00bd
        L_0x00b0:
            boolean r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.m2058b(r12, r10)
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f1954k
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.m2038c(androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue, int, int, boolean, androidx.compose.foundation.text.selection.SelectionAdjustment):void");
    }

    /* renamed from: e */
    public static TextFieldValue m2039e(C1913a aVar, long j) {
        return new TextFieldValue(aVar, j, (C2022r) null);
    }

    /* renamed from: d */
    public final void mo4646d(boolean z) {
        if (!C2022r.m4463b(mo4651j().f4449b)) {
            C1827e0 e0Var = this.f2088f;
            if (e0Var != null) {
                e0Var.mo7207a(C1993m.m4349J(mo4651j()));
            }
            if (z) {
                int d = C2022r.m4465d(mo4651j().f4449b);
                this.f2085c.invoke(m2039e(mo4651j().f4448a, C0005b.m47l(d, d)));
                mo4654m(HandleState.None);
            }
        }
    }

    /* renamed from: f */
    public final void mo4647f() {
        if (!C2022r.m4463b(mo4651j().f4449b)) {
            C1827e0 e0Var = this.f2088f;
            if (e0Var != null) {
                e0Var.mo7207a(C1993m.m4349J(mo4651j()));
            }
            C1913a a = C1993m.m4353N(mo4651j(), mo4651j().f4448a.f4296b.length()).mo7389a(C1993m.m4352M(mo4651j(), mo4651j().f4448a.f4296b.length()));
            int e = C2022r.m4466e(mo4651j().f4449b);
            this.f2085c.invoke(m2039e(a, C0005b.m47l(e, e)));
            mo4654m(HandleState.None);
            C0966s sVar = this.f2083a;
            if (sVar != null) {
                sVar.f2050f = true;
            }
        }
    }

    /* renamed from: g */
    public final void mo4648g(C8343c cVar) {
        HandleState handleState;
        boolean z = true;
        if (!C2022r.m4463b(mo4651j().f4449b)) {
            TextFieldState textFieldState = this.f2086d;
            C0965r c = textFieldState != null ? textFieldState.mo4562c() : null;
            int d = (cVar == null || c == null) ? C2022r.m4465d(mo4651j().f4449b) : this.f2084b.mo7683a(c.mo4579b(cVar.f18299a, true));
            this.f2085c.invoke(TextFieldValue.m4312a(mo4651j(), (C1913a) null, C0005b.m47l(d, d), 5));
        }
        if (cVar != null) {
            if (mo4651j().f4448a.f4296b.length() <= 0) {
                z = false;
            }
            if (z) {
                handleState = HandleState.Cursor;
                mo4654m(handleState);
                mo4652k();
            }
        }
        handleState = HandleState.None;
        mo4654m(handleState);
        mo4652k();
    }

    /* renamed from: h */
    public final void mo4649h() {
        C1478l lVar;
        TextFieldState textFieldState = this.f2086d;
        boolean z = false;
        if (textFieldState != null && !textFieldState.mo4561b()) {
            z = true;
        }
        if (z && (lVar = this.f2091i) != null) {
            lVar.mo6218a();
        }
        this.f2098p = mo4651j();
        TextFieldState textFieldState2 = this.f2086d;
        if (textFieldState2 != null) {
            textFieldState2.f1952i = true;
        }
        mo4654m(HandleState.Selection);
    }

    /* renamed from: i */
    public final long mo4650i(boolean z) {
        int i;
        TextFieldValue j = mo4651j();
        if (z) {
            long j2 = j.f4449b;
            int i2 = C2022r.f4596c;
            i = (int) (j2 >> 32);
        } else {
            i = C2022r.m4464c(j.f4449b);
        }
        TextFieldState textFieldState = this.f2086d;
        C0965r c = textFieldState != null ? textFieldState.mo4562c() : null;
        C19383o.m32794d(c);
        C2021q qVar = c.f2042a;
        int b = this.f2084b.mo7684b(i);
        boolean f = C2022r.m4467f(mo4651j().f4449b);
        C19383o.m32797g(qVar, "textLayoutResult");
        return C19421p.m32952q(C19421p.m32921K(qVar, b, z, f), qVar.mo7741d(qVar.mo7744f(b)));
    }

    /* renamed from: j */
    public final TextFieldValue mo4651j() {
        return (TextFieldValue) this.f2087e.getValue();
    }

    /* renamed from: k */
    public final void mo4652k() {
        C1822c1 c1Var;
        C1822c1 c1Var2 = this.f2089g;
        if ((c1Var2 != null ? c1Var2.getStatus() : null) == TextToolbarStatus.Shown && (c1Var = this.f2089g) != null) {
            c1Var.mo7106b();
        }
    }

    /* renamed from: l */
    public final void mo4653l() {
        C1913a text;
        C1827e0 e0Var = this.f2088f;
        if (e0Var != null && (text = e0Var.getText()) != null) {
            C1913a a = C1993m.m4353N(mo4651j(), mo4651j().f4448a.f4296b.length()).mo7389a(text).mo7389a(C1993m.m4352M(mo4651j(), mo4651j().f4448a.f4296b.length()));
            int length = text.length() + C2022r.m4466e(mo4651j().f4449b);
            this.f2085c.invoke(m2039e(a, C0005b.m47l(length, length)));
            mo4654m(HandleState.None);
            C0966s sVar = this.f2083a;
            if (sVar != null) {
                sVar.f2050f = true;
            }
        }
    }

    /* renamed from: m */
    public final void mo4654m(HandleState handleState) {
        TextFieldState textFieldState = this.f2086d;
        if (textFieldState != null) {
            C19383o.m32797g(handleState, "<set-?>");
            textFieldState.f1951h.setValue(handleState);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4655n() {
        /*
            r18 = this;
            r0 = r18
            androidx.compose.ui.text.input.TextFieldValue r1 = r18.mo4651j()
            long r1 = r1.f4449b
            boolean r1 = androidx.compose.p015ui.text.C2022r.m4463b(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0016
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1 r1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
            r1.<init>(r0)
            r5 = r1
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            androidx.compose.ui.text.input.TextFieldValue r1 = r18.mo4651j()
            long r3 = r1.f4449b
            boolean r1 = androidx.compose.p015ui.text.C2022r.m4463b(r3)
            if (r1 != 0) goto L_0x0038
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r0.f2092j
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0038
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1 r1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
            r1.<init>(r0)
            r7 = r1
            goto L_0x0039
        L_0x0038:
            r7 = r2
        L_0x0039:
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r0.f2092j
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005a
            androidx.compose.ui.platform.e0 r1 = r0.f2088f
            if (r1 == 0) goto L_0x0050
            androidx.compose.ui.text.a r1 = r1.getText()
            goto L_0x0051
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 == 0) goto L_0x005a
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1 r1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
            r1.<init>(r0)
            r6 = r1
            goto L_0x005b
        L_0x005a:
            r6 = r2
        L_0x005b:
            androidx.compose.ui.text.input.TextFieldValue r1 = r18.mo4651j()
            long r3 = r1.f4449b
            int r1 = androidx.compose.p015ui.text.C2022r.m4465d(r3)
            int r3 = androidx.compose.p015ui.text.C2022r.m4466e(r3)
            int r1 = r1 - r3
            androidx.compose.ui.text.input.TextFieldValue r3 = r18.mo4651j()
            androidx.compose.ui.text.a r3 = r3.f4448a
            java.lang.String r3 = r3.f4296b
            int r3 = r3.length()
            if (r1 == r3) goto L_0x007d
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1 r2 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
            r2.<init>(r0)
        L_0x007d:
            r8 = r2
            androidx.compose.ui.platform.c1 r3 = r0.f2089g
            if (r3 == 0) goto L_0x0185
            androidx.compose.foundation.text.TextFieldState r1 = r0.f2086d
            if (r1 == 0) goto L_0x017f
            r2 = 1
            androidx.compose.ui.layout.j r4 = r1.f1949f
            if (r4 == 0) goto L_0x0094
            long r9 = r0.mo4650i(r2)
            long r9 = r4.mo6683P(r9)
            goto L_0x0096
        L_0x0094:
            long r9 = p288y.C8343c.f18295b
        L_0x0096:
            androidx.compose.foundation.text.TextFieldState r4 = r0.f2086d
            r11 = 0
            if (r4 == 0) goto L_0x00a8
            androidx.compose.ui.layout.j r4 = r4.f1949f
            if (r4 == 0) goto L_0x00a8
            long r12 = r0.mo4650i(r11)
            long r12 = r4.mo6683P(r12)
            goto L_0x00aa
        L_0x00a8:
            long r12 = p288y.C8343c.f18295b
        L_0x00aa:
            androidx.compose.foundation.text.TextFieldState r4 = r0.f2086d
            if (r4 == 0) goto L_0x00f6
            androidx.compose.ui.layout.j r4 = r4.f1949f
            if (r4 == 0) goto L_0x00f6
            androidx.compose.foundation.text.r r15 = r1.mo4562c()
            if (r15 == 0) goto L_0x00e5
            androidx.compose.ui.text.q r15 = r15.f2042a
            if (r15 == 0) goto L_0x00e5
            androidx.compose.ui.text.input.TextFieldValue r14 = r18.mo4651j()
            r16 = r12
            long r11 = r14.f4449b
            r13 = 32
            long r11 = r11 >> r13
            int r11 = (int) r11
            androidx.compose.ui.text.input.TextFieldValue r12 = r18.mo4651j()
            androidx.compose.ui.text.a r12 = r12.f4448a
            java.lang.String r12 = r12.f4296b
            int r12 = r12.length()
            int r12 = r12 - r2
            r13 = 0
            int r12 = java.lang.Math.max(r13, r12)
            int r11 = kotlin.jvm.internal.C19388s.m32833M(r11, r13, r12)
            y.d r11 = r15.mo7740c(r11)
            float r11 = r11.f18302b
            goto L_0x00e8
        L_0x00e5:
            r16 = r12
            r11 = 0
        L_0x00e8:
            r12 = 0
            long r13 = kotlin.reflect.C19421p.m32952q(r12, r11)
            long r11 = r4.mo6683P(r13)
            float r12 = p288y.C8343c.m16643d(r11)
            goto L_0x00f9
        L_0x00f6:
            r16 = r12
            r12 = 0
        L_0x00f9:
            androidx.compose.foundation.text.TextFieldState r4 = r0.f2086d
            if (r4 == 0) goto L_0x0141
            androidx.compose.ui.layout.j r4 = r4.f1949f
            if (r4 == 0) goto L_0x0141
            androidx.compose.foundation.text.r r11 = r1.mo4562c()
            if (r11 == 0) goto L_0x0132
            androidx.compose.ui.text.q r11 = r11.f2042a
            if (r11 == 0) goto L_0x0132
            androidx.compose.ui.text.input.TextFieldValue r13 = r18.mo4651j()
            long r13 = r13.f4449b
            int r13 = androidx.compose.p015ui.text.C2022r.m4464c(r13)
            androidx.compose.ui.text.input.TextFieldValue r14 = r18.mo4651j()
            androidx.compose.ui.text.a r14 = r14.f4448a
            java.lang.String r14 = r14.f4296b
            int r14 = r14.length()
            int r14 = r14 - r2
            r2 = 0
            int r14 = java.lang.Math.max(r2, r14)
            int r2 = kotlin.jvm.internal.C19388s.m32833M(r13, r2, r14)
            y.d r2 = r11.mo7740c(r2)
            float r2 = r2.f18302b
            goto L_0x0133
        L_0x0132:
            r2 = 0
        L_0x0133:
            r11 = 0
            long r13 = kotlin.reflect.C19421p.m32952q(r11, r2)
            long r13 = r4.mo6683P(r13)
            float r14 = p288y.C8343c.m16643d(r13)
            goto L_0x0143
        L_0x0141:
            r11 = 0
            r14 = r11
        L_0x0143:
            float r2 = p288y.C8343c.m16642c(r9)
            float r4 = p288y.C8343c.m16642c(r16)
            float r2 = java.lang.Math.min(r2, r4)
            float r4 = p288y.C8343c.m16642c(r9)
            float r11 = p288y.C8343c.m16642c(r16)
            float r4 = java.lang.Math.max(r4, r11)
            float r11 = java.lang.Math.min(r12, r14)
            float r9 = p288y.C8343c.m16643d(r9)
            float r10 = p288y.C8343c.m16643d(r16)
            float r9 = java.lang.Math.max(r9, r10)
            r10 = 25
            float r10 = (float) r10
            androidx.compose.foundation.text.k r1 = r1.f1944a
            m0.b r1 = r1.f2018f
            float r1 = r1.getDensity()
            float r1 = r1 * r10
            float r1 = r1 + r9
            y.d r9 = new y.d
            r9.<init>(r2, r11, r4, r1)
            r4 = r9
            goto L_0x0182
        L_0x017f:
            y.d r1 = p288y.C8345d.f18300e
            r4 = r1
        L_0x0182:
            r3.mo7105a(r4, r5, r6, r7, r8)
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.mo4655n():void");
    }

    public TextFieldSelectionManager(C0966s sVar) {
        this.f2083a = sVar;
        this.f2084b = C1994n.C1995a.f4512a;
        this.f2085c = TextFieldSelectionManager$onValueChange$1.INSTANCE;
        this.f2087e = C0761x.m1751w0(new TextFieldValue((String) null, 0, 7), C1351n1.f2948a);
        this.f2092j = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
        long j = C8343c.f18295b;
        this.f2093k = j;
        this.f2095m = j;
        this.f2096n = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f2097o = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f2098p = new TextFieldValue((String) null, 0, 7);
        this.f2099q = new C0995b(this);
        new C0994a(this);
    }
}
