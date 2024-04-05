package android.view;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.airbnb.paris.C4864a;
import com.airbnb.paris.C4866b;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import p221r3.C7739a;
import p232s3.C7811e;
import p242t3.C7953d;
import p242t3.C7956f;
import p628nj.C18263b;

public final class ViewStyleApplier extends C4864a<C7811e, View> {

    public static final class StyleBuilder extends C0089a<StyleBuilder, ViewStyleApplier> {
        public StyleBuilder(ViewStyleApplier viewStyleApplier) {
            super(viewStyleApplier);
        }

        public StyleBuilder addDefault() {
            return this;
        }

        public StyleBuilder() {
        }
    }

    /* renamed from: android.view.ViewStyleApplier$a */
    public static abstract class C0089a<B extends C0089a<B, A>, A extends C4864a<?, ?>> extends C4866b<B, A> {
        public C0089a(A a) {
            super(a);
        }

        public B alpha(float f) {
            getBuilder().mo20495a(C18263b.f40049M[22], Float.valueOf(f));
            return this;
        }

        public B alphaRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[22], i);
            return this;
        }

        public B applyTo(View view) {
            new ViewStyleApplier(view).mo14737a(build());
            return this;
        }

        public B background(Drawable drawable) {
            getBuilder().mo20495a(C18263b.f40049M[1], drawable);
            return this;
        }

        public B backgroundRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[1], i);
            return this;
        }

        public B backgroundTint(ColorStateList colorStateList) {
            getBuilder().mo20495a(C18263b.f40049M[29], colorStateList);
            return this;
        }

        public B backgroundTintMode(int i) {
            getBuilder().mo20495a(C18263b.f40049M[30], Integer.valueOf(i));
            return this;
        }

        public B backgroundTintModeRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[30], i);
            return this;
        }

        public B backgroundTintRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[29], i);
            return this;
        }

        public B clickable(boolean z) {
            getBuilder().mo20495a(C18263b.f40049M[9], Boolean.valueOf(z));
            return this;
        }

        public B clickableRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[9], i);
            return this;
        }

        public B contentDescription(CharSequence charSequence) {
            getBuilder().mo20495a(C18263b.f40049M[21], charSequence);
            return this;
        }

        public B contentDescriptionRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[21], i);
            return this;
        }

        public B elevation(int i) {
            getBuilder().mo20495a(C18263b.f40049M[27], Integer.valueOf(i));
            return this;
        }

        public B elevationDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[27], i);
            return this;
        }

        public B elevationRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[27], i);
            return this;
        }

        public B focusable(boolean z) {
            getBuilder().mo20495a(C18263b.f40049M[7], Boolean.valueOf(z));
            return this;
        }

        public B focusableRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[7], i);
            return this;
        }

        public B foreground(Drawable drawable) {
            getBuilder().mo20495a(C18263b.f40049M[17], drawable);
            return this;
        }

        public B foregroundRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[17], i);
            return this;
        }

        public B ignoreLayoutWidthAndHeight(boolean z) {
            getBuilder().mo20495a(C18263b.f40049M[35], Boolean.valueOf(z));
            return this;
        }

        public B ignoreLayoutWidthAndHeightRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[35], i);
            return this;
        }

        public B layoutGravity(int i) {
            getBuilder().mo20495a(C18263b.f40049M[0], Integer.valueOf(i));
            return this;
        }

        public B layoutGravityRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[0], i);
            return this;
        }

        public B layoutHeight(int i) {
            getBuilder().mo20495a(C18263b.f40049M[11], Integer.valueOf(i));
            return this;
        }

        public B layoutHeightDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[11], i);
            return this;
        }

        public B layoutHeightRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[11], i);
            return this;
        }

        public B layoutMargin(int i) {
            getBuilder().mo20495a(C18263b.f40049M[12], Integer.valueOf(i));
            return this;
        }

        public B layoutMarginBottom(int i) {
            getBuilder().mo20495a(C18263b.f40049M[16], Integer.valueOf(i));
            return this;
        }

        public B layoutMarginBottomDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[16], i);
            return this;
        }

        public B layoutMarginBottomRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[16], i);
            return this;
        }

        public B layoutMarginDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[12], i);
            return this;
        }

        public B layoutMarginEnd(int i) {
            getBuilder().mo20495a(C18263b.f40049M[26], Integer.valueOf(i));
            return this;
        }

        public B layoutMarginEndDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[26], i);
            return this;
        }

        public B layoutMarginEndRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[26], i);
            return this;
        }

        public B layoutMarginHorizontal(int i) {
            getBuilder().mo20495a(C18263b.f40049M[31], Integer.valueOf(i));
            return this;
        }

        public B layoutMarginHorizontalDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[31], i);
            return this;
        }

        public B layoutMarginHorizontalRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[31], i);
            return this;
        }

        public B layoutMarginLeft(int i) {
            getBuilder().mo20495a(C18263b.f40049M[13], Integer.valueOf(i));
            return this;
        }

        public B layoutMarginLeftDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[13], i);
            return this;
        }

        public B layoutMarginLeftRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[13], i);
            return this;
        }

        public B layoutMarginRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[12], i);
            return this;
        }

        public B layoutMarginRight(int i) {
            getBuilder().mo20495a(C18263b.f40049M[15], Integer.valueOf(i));
            return this;
        }

        public B layoutMarginRightDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[15], i);
            return this;
        }

        public B layoutMarginRightRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[15], i);
            return this;
        }

        public B layoutMarginStart(int i) {
            getBuilder().mo20495a(C18263b.f40049M[25], Integer.valueOf(i));
            return this;
        }

        public B layoutMarginStartDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[25], i);
            return this;
        }

        public B layoutMarginStartRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[25], i);
            return this;
        }

        public B layoutMarginTop(int i) {
            getBuilder().mo20495a(C18263b.f40049M[14], Integer.valueOf(i));
            return this;
        }

        public B layoutMarginTopDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[14], i);
            return this;
        }

        public B layoutMarginTopRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[14], i);
            return this;
        }

        public B layoutMarginVertical(int i) {
            getBuilder().mo20495a(C18263b.f40049M[32], Integer.valueOf(i));
            return this;
        }

        public B layoutMarginVerticalDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[32], i);
            return this;
        }

        public B layoutMarginVerticalRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[32], i);
            return this;
        }

        public B layoutWeight(float f) {
            getBuilder().mo20495a(C18263b.f40049M[20], Float.valueOf(f));
            return this;
        }

        public B layoutWeightRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[20], i);
            return this;
        }

        public B layoutWidth(int i) {
            getBuilder().mo20495a(C18263b.f40049M[10], Integer.valueOf(i));
            return this;
        }

        public B layoutWidthDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[10], i);
            return this;
        }

        public B layoutWidthRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[10], i);
            return this;
        }

        public B minHeight(int i) {
            getBuilder().mo20495a(C18263b.f40049M[19], Integer.valueOf(i));
            return this;
        }

        public B minHeightDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[19], i);
            return this;
        }

        public B minHeightRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[19], i);
            return this;
        }

        public B minWidth(int i) {
            getBuilder().mo20495a(C18263b.f40049M[18], Integer.valueOf(i));
            return this;
        }

        public B minWidthDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[18], i);
            return this;
        }

        public B minWidthRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[18], i);
            return this;
        }

        public B padding(int i) {
            getBuilder().mo20495a(C18263b.f40049M[2], Integer.valueOf(i));
            return this;
        }

        public B paddingBottom(int i) {
            getBuilder().mo20495a(C18263b.f40049M[6], Integer.valueOf(i));
            return this;
        }

        public B paddingBottomDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[6], i);
            return this;
        }

        public B paddingBottomRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[6], i);
            return this;
        }

        public B paddingDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[2], i);
            return this;
        }

        public B paddingEnd(int i) {
            getBuilder().mo20495a(C18263b.f40049M[24], Integer.valueOf(i));
            return this;
        }

        public B paddingEndDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[24], i);
            return this;
        }

        public B paddingEndRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[24], i);
            return this;
        }

        public B paddingHorizontal(int i) {
            getBuilder().mo20495a(C18263b.f40049M[33], Integer.valueOf(i));
            return this;
        }

        public B paddingHorizontalDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[33], i);
            return this;
        }

        public B paddingHorizontalRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[33], i);
            return this;
        }

        public B paddingLeft(int i) {
            getBuilder().mo20495a(C18263b.f40049M[3], Integer.valueOf(i));
            return this;
        }

        public B paddingLeftDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[3], i);
            return this;
        }

        public B paddingLeftRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[3], i);
            return this;
        }

        public B paddingRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[2], i);
            return this;
        }

        public B paddingRight(int i) {
            getBuilder().mo20495a(C18263b.f40049M[5], Integer.valueOf(i));
            return this;
        }

        public B paddingRightDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[5], i);
            return this;
        }

        public B paddingRightRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[5], i);
            return this;
        }

        public B paddingStart(int i) {
            getBuilder().mo20495a(C18263b.f40049M[23], Integer.valueOf(i));
            return this;
        }

        public B paddingStartDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[23], i);
            return this;
        }

        public B paddingStartRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[23], i);
            return this;
        }

        public B paddingTop(int i) {
            getBuilder().mo20495a(C18263b.f40049M[4], Integer.valueOf(i));
            return this;
        }

        public B paddingTopDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[4], i);
            return this;
        }

        public B paddingTopRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[4], i);
            return this;
        }

        public B paddingVertical(int i) {
            getBuilder().mo20495a(C18263b.f40049M[34], Integer.valueOf(i));
            return this;
        }

        public B paddingVerticalDp(int i) {
            getBuilder().mo20496b(C18263b.f40049M[34], i);
            return this;
        }

        public B paddingVerticalRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[34], i);
            return this;
        }

        public B stateListAnimatorRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[28], i);
            return this;
        }

        public B visibility(int i) {
            getBuilder().mo20495a(C18263b.f40049M[8], Integer.valueOf(i));
            return this;
        }

        public B visibilityRes(int i) {
            getBuilder().mo20497c(C18263b.f40049M[8], i);
            return this;
        }

        public C0089a() {
        }

        public B backgroundTint(int i) {
            C7953d.C7954a builder = getBuilder();
            int i2 = C18263b.f40049M[29];
            builder.getClass();
            builder.mo20495a(i2, new C7739a(i));
            return this;
        }
    }

    public ViewStyleApplier(View view) {
        super(new C7811e(view));
    }

    /* renamed from: c */
    public final int[] mo842c() {
        return C18263b.f40049M;
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x045c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo843d(p242t3.C7956f r17, com.airbnb.paris.typed_array_wrappers.C4870c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            V r2 = r0.f11061b
            android.content.Context r2 = r2.getContext()
            r2.getResources()
            r2 = 10
            boolean r3 = r1.mo14771n(r2)
            if (r3 == 0) goto L_0x0023
            P r3 = r0.f11060a
            s3.e r3 = (p232s3.C7811e) r3
            int r2 = r1.mo14767j(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.f17262c = r2
        L_0x0023:
            r2 = 11
            boolean r3 = r1.mo14771n(r2)
            if (r3 == 0) goto L_0x0039
            P r3 = r0.f11060a
            s3.e r3 = (p232s3.C7811e) r3
            int r2 = r1.mo14767j(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.f17263d = r2
        L_0x0039:
            r2 = 0
            boolean r3 = r1.mo14771n(r2)
            if (r3 == 0) goto L_0x0068
            P r3 = r0.f11060a
            s3.e r3 = (p232s3.C7811e) r3
            int r4 = r1.mo14766i(r2)
            V r5 = r3.f17250a
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x0068
            boolean r6 = r5 instanceof android.widget.FrameLayout.LayoutParams
            if (r6 == 0) goto L_0x005a
            r6 = r5
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            r6.gravity = r4
            goto L_0x0063
        L_0x005a:
            boolean r6 = r5 instanceof android.widget.LinearLayout.LayoutParams
            if (r6 == 0) goto L_0x0063
            r6 = r5
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            r6.gravity = r4
        L_0x0063:
            V r3 = r3.f17250a
            r3.setLayoutParams(r5)
        L_0x0068:
            r3 = 20
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x008e
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            float r3 = r1.mo14762e(r3)
            V r5 = r4.f17250a
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x008e
            boolean r6 = r5 instanceof android.widget.LinearLayout.LayoutParams
            if (r6 == 0) goto L_0x008e
            r6 = r5
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            r6.weight = r3
            V r3 = r4.f17250a
            r3.setLayoutParams(r5)
        L_0x008e:
            r3 = 31
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x00a4
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            int r3 = r1.mo14760c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.f17271l = r3
        L_0x00a4:
            r3 = 32
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x00ba
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            int r3 = r1.mo14760c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.f17272m = r3
        L_0x00ba:
            r3 = 16
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x00d0
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            int r3 = r1.mo14760c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.f17265f = r3
        L_0x00d0:
            r3 = 13
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x00e6
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            int r3 = r1.mo14760c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.f17267h = r3
        L_0x00e6:
            r3 = 15
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x00fc
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            int r3 = r1.mo14760c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.f17268i = r3
        L_0x00fc:
            r3 = 14
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x0112
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            int r3 = r1.mo14760c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.f17270k = r3
        L_0x0112:
            r3 = 26
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x0128
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            int r3 = r1.mo14760c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.f17266g = r3
        L_0x0128:
            r3 = 25
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x013e
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            int r3 = r1.mo14760c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.f17269j = r3
        L_0x013e:
            r3 = 12
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x0154
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            int r3 = r1.mo14760c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.f17264e = r3
        L_0x0154:
            r3 = 22
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x0169
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            float r3 = r1.mo14762e(r3)
            V r4 = r4.f17250a
            r4.setAlpha(r3)
        L_0x0169:
            r3 = 1
            boolean r4 = r1.mo14771n(r3)
            if (r4 == 0) goto L_0x017d
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            android.graphics.drawable.Drawable r5 = r1.mo14761d(r3)
            V r4 = r4.f17250a
            r4.setBackground(r5)
        L_0x017d:
            r4 = 29
            boolean r5 = r1.mo14771n(r4)
            if (r5 == 0) goto L_0x0194
            P r5 = r0.f11060a
            s3.e r5 = (p232s3.C7811e) r5
            android.content.res.ColorStateList r4 = r1.mo14759b(r4)
            V r5 = r5.f17250a
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r6 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2373i.m5270q(r5, r4)
        L_0x0194:
            r4 = 30
            boolean r5 = r1.mo14771n(r4)
            r7 = 5
            r8 = 3
            r9 = 9
            if (r5 == 0) goto L_0x01cb
            P r5 = r0.f11060a
            s3.e r5 = (p232s3.C7811e) r5
            int r4 = r1.mo14766i(r4)
            V r5 = r5.f17250a
            if (r4 == r8) goto L_0x01c4
            if (r4 == r7) goto L_0x01c1
            if (r4 == r9) goto L_0x01be
            switch(r4) {
                case 14: goto L_0x01bb;
                case 15: goto L_0x01b8;
                case 16: goto L_0x01b5;
                default: goto L_0x01b3;
            }
        L_0x01b3:
            r4 = 0
            goto L_0x01c6
        L_0x01b5:
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x01c6
        L_0x01b8:
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x01c6
        L_0x01bb:
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x01c6
        L_0x01be:
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x01c6
        L_0x01c1:
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            goto L_0x01c6
        L_0x01c4:
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x01c6:
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r10 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2373i.m5271r(r5, r4)
        L_0x01cb:
            boolean r4 = r1.mo14771n(r9)
            if (r4 == 0) goto L_0x01de
            P r4 = r0.f11060a
            s3.e r4 = (p232s3.C7811e) r4
            boolean r5 = r1.mo14758a(r9)
            V r4 = r4.f17250a
            r4.setClickable(r5)
        L_0x01de:
            r4 = 21
            boolean r5 = r1.mo14771n(r4)
            if (r5 == 0) goto L_0x01f3
            P r5 = r0.f11060a
            s3.e r5 = (p232s3.C7811e) r5
            java.lang.CharSequence r4 = r1.mo14770m(r4)
            V r5 = r5.f17250a
            r5.setContentDescription(r4)
        L_0x01f3:
            r4 = 27
            boolean r5 = r1.mo14771n(r4)
            if (r5 == 0) goto L_0x0209
            P r5 = r0.f11060a
            s3.e r5 = (p232s3.C7811e) r5
            int r4 = r1.mo14760c(r4)
            V r5 = r5.f17250a
            float r4 = (float) r4
            r5.setElevation(r4)
        L_0x0209:
            r4 = 7
            boolean r5 = r1.mo14771n(r4)
            if (r5 == 0) goto L_0x021d
            P r5 = r0.f11060a
            s3.e r5 = (p232s3.C7811e) r5
            boolean r10 = r1.mo14758a(r4)
            V r5 = r5.f17250a
            r5.setFocusable(r10)
        L_0x021d:
            r5 = 17
            boolean r10 = r1.mo14771n(r5)
            if (r10 == 0) goto L_0x0232
            P r10 = r0.f11060a
            s3.e r10 = (p232s3.C7811e) r10
            android.graphics.drawable.Drawable r5 = r1.mo14761d(r5)
            V r10 = r10.f17250a
            r10.setForeground(r5)
        L_0x0232:
            r5 = 19
            boolean r10 = r1.mo14771n(r5)
            if (r10 == 0) goto L_0x0247
            P r10 = r0.f11060a
            s3.e r10 = (p232s3.C7811e) r10
            int r5 = r1.mo14760c(r5)
            V r10 = r10.f17250a
            r10.setMinimumHeight(r5)
        L_0x0247:
            r5 = 18
            boolean r10 = r1.mo14771n(r5)
            if (r10 == 0) goto L_0x025c
            P r10 = r0.f11060a
            s3.e r10 = (p232s3.C7811e) r10
            int r5 = r1.mo14760c(r5)
            V r10 = r10.f17250a
            r10.setMinimumWidth(r5)
        L_0x025c:
            r5 = 6
            boolean r10 = r1.mo14771n(r5)
            if (r10 == 0) goto L_0x0270
            P r10 = r0.f11060a
            s3.e r10 = (p232s3.C7811e) r10
            int r11 = r1.mo14760c(r5)
            V r10 = r10.f17250a
            kotlin.reflect.C19421p.m32936d0(r11, r10)
        L_0x0270:
            boolean r10 = r1.mo14771n(r8)
            if (r10 == 0) goto L_0x0294
            P r10 = r0.f11060a
            s3.e r10 = (p232s3.C7811e) r10
            int r11 = r1.mo14760c(r8)
            V r10 = r10.f17250a
            java.lang.String r12 = "$this$setPaddingLeft"
            kotlin.jvm.internal.C19383o.m32798h(r10, r12)
            int r12 = r10.getPaddingTop()
            int r13 = r10.getPaddingRight()
            int r14 = r10.getPaddingBottom()
            r10.setPadding(r11, r12, r13, r14)
        L_0x0294:
            boolean r10 = r1.mo14771n(r7)
            if (r10 == 0) goto L_0x02b8
            P r10 = r0.f11060a
            s3.e r10 = (p232s3.C7811e) r10
            int r11 = r1.mo14760c(r7)
            V r10 = r10.f17250a
            java.lang.String r12 = "$this$setPaddingRight"
            kotlin.jvm.internal.C19383o.m32798h(r10, r12)
            int r12 = r10.getPaddingLeft()
            int r13 = r10.getPaddingTop()
            int r14 = r10.getPaddingBottom()
            r10.setPadding(r12, r13, r11, r14)
        L_0x02b8:
            r10 = 4
            boolean r11 = r1.mo14771n(r10)
            if (r11 == 0) goto L_0x02cc
            P r11 = r0.f11060a
            s3.e r11 = (p232s3.C7811e) r11
            int r12 = r1.mo14760c(r10)
            V r11 = r11.f17250a
            kotlin.reflect.C19421p.m32938f0(r12, r11)
        L_0x02cc:
            r11 = 33
            boolean r12 = r1.mo14771n(r11)
            if (r12 == 0) goto L_0x02ee
            P r12 = r0.f11060a
            s3.e r12 = (p232s3.C7811e) r12
            int r11 = r1.mo14760c(r11)
            V r12 = r12.f17250a
            java.lang.String r13 = "$this$setPaddingHorizontal"
            kotlin.jvm.internal.C19383o.m32798h(r12, r13)
            int r13 = r12.getPaddingTop()
            int r14 = r12.getPaddingBottom()
            r12.setPadding(r11, r13, r11, r14)
        L_0x02ee:
            r11 = 34
            boolean r12 = r1.mo14771n(r11)
            if (r12 == 0) goto L_0x0310
            P r12 = r0.f11060a
            s3.e r12 = (p232s3.C7811e) r12
            int r11 = r1.mo14760c(r11)
            V r12 = r12.f17250a
            java.lang.String r13 = "$this$setPaddingVertical"
            kotlin.jvm.internal.C19383o.m32798h(r12, r13)
            int r13 = r12.getPaddingLeft()
            int r14 = r12.getPaddingRight()
            r12.setPadding(r13, r11, r14, r11)
        L_0x0310:
            r11 = 2
            boolean r12 = r1.mo14771n(r11)
            if (r12 == 0) goto L_0x0324
            P r12 = r0.f11060a
            s3.e r12 = (p232s3.C7811e) r12
            int r13 = r1.mo14760c(r11)
            V r12 = r12.f17250a
            r12.setPadding(r13, r13, r13, r13)
        L_0x0324:
            r12 = 24
            boolean r13 = r1.mo14771n(r12)
            if (r13 == 0) goto L_0x0339
            P r13 = r0.f11060a
            s3.e r13 = (p232s3.C7811e) r13
            int r12 = r1.mo14760c(r12)
            V r13 = r13.f17250a
            kotlin.reflect.C19421p.m32937e0(r12, r13)
        L_0x0339:
            r12 = 23
            boolean r13 = r1.mo14771n(r12)
            if (r13 == 0) goto L_0x035f
            P r13 = r0.f11060a
            s3.e r13 = (p232s3.C7811e) r13
            int r12 = r1.mo14760c(r12)
            V r13 = r13.f17250a
            java.lang.String r14 = "$this$setPaddingStart"
            kotlin.jvm.internal.C19383o.m32798h(r13, r14)
            int r14 = r13.getPaddingTop()
            int r15 = r13.getPaddingEnd()
            int r6 = r13.getPaddingBottom()
            r13.setPaddingRelative(r12, r14, r15, r6)
        L_0x035f:
            r6 = 28
            boolean r12 = r1.mo14771n(r6)
            if (r12 == 0) goto L_0x0382
            P r12 = r0.f11060a
            s3.e r12 = (p232s3.C7811e) r12
            int r6 = r1.mo14768k(r6)
            if (r6 == 0) goto L_0x037c
            V r13 = r12.f17250a
            android.content.Context r13 = r13.getContext()
            android.animation.StateListAnimator r6 = android.animation.AnimatorInflater.loadStateListAnimator(r13, r6)
            goto L_0x037d
        L_0x037c:
            r6 = 0
        L_0x037d:
            V r12 = r12.f17250a
            r12.setStateListAnimator(r6)
        L_0x0382:
            r6 = 8
            boolean r12 = r1.mo14771n(r6)
            if (r12 == 0) goto L_0x039d
            P r12 = r0.f11060a
            s3.e r12 = (p232s3.C7811e) r12
            int r13 = r1.mo14766i(r6)
            V r12 = r12.f17250a
            android.util.SparseIntArray r14 = p232s3.C7811e.f17260n
            int r13 = r14.get(r13)
            r12.setVisibility(r13)
        L_0x039d:
            r12 = 35
            boolean r13 = r1.mo14771n(r12)
            if (r13 == 0) goto L_0x03af
            P r13 = r0.f11060a
            s3.e r13 = (p232s3.C7811e) r13
            boolean r1 = r1.mo14758a(r12)
            r13.f17261b = r1
        L_0x03af:
            P r1 = r0.f11060a
            s3.e r1 = (p232s3.C7811e) r1
            java.lang.Integer[] r9 = new java.lang.Integer[r9]
            java.lang.Integer r12 = r1.f17264e
            r9[r2] = r12
            java.lang.Integer r12 = r1.f17265f
            r9[r3] = r12
            java.lang.Integer r12 = r1.f17266g
            r9[r11] = r12
            java.lang.Integer r11 = r1.f17267h
            r9[r8] = r11
            java.lang.Integer r8 = r1.f17268i
            r9[r10] = r8
            java.lang.Integer r8 = r1.f17269j
            r9[r7] = r8
            java.lang.Integer r7 = r1.f17270k
            r9[r5] = r7
            java.lang.Integer r5 = r1.f17271l
            r9[r4] = r5
            java.lang.Integer r4 = r1.f17272m
            r9[r6] = r4
            java.util.List r4 = p568fn.C17782b.m29865e0(r9)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x03e8
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x03e8
            goto L_0x0401
        L_0x03e8:
            java.util.Iterator r4 = r4.iterator()
        L_0x03ec:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0401
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x03fc
            r5 = r3
            goto L_0x03fd
        L_0x03fc:
            r5 = r2
        L_0x03fd:
            if (r5 == 0) goto L_0x03ec
            r4 = r3
            goto L_0x0402
        L_0x0401:
            r4 = r2
        L_0x0402:
            boolean r5 = r1.f17261b
            if (r5 != 0) goto L_0x045a
            java.lang.Integer r5 = r1.f17262c
            if (r5 == 0) goto L_0x040c
            r6 = r3
            goto L_0x040d
        L_0x040c:
            r6 = r2
        L_0x040d:
            java.lang.Integer r7 = r1.f17263d
            if (r7 == 0) goto L_0x0412
            goto L_0x0413
        L_0x0412:
            r3 = r2
        L_0x0413:
            r3 = r3 ^ r6
            if (r3 != 0) goto L_0x0452
            if (r5 == 0) goto L_0x045a
            if (r7 == 0) goto L_0x045a
            V r3 = r1.f17250a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x0440
            if (r4 == 0) goto L_0x0432
            android.view.ViewGroup$MarginLayoutParams r3 = new android.view.ViewGroup$MarginLayoutParams
            int r5 = r5.intValue()
            int r6 = r7.intValue()
            r3.<init>(r5, r6)
            goto L_0x044c
        L_0x0432:
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            int r5 = r5.intValue()
            int r6 = r7.intValue()
            r3.<init>(r5, r6)
            goto L_0x044c
        L_0x0440:
            int r5 = r5.intValue()
            r3.width = r5
            int r5 = r7.intValue()
            r3.height = r5
        L_0x044c:
            V r5 = r1.f17250a
            r5.setLayoutParams(r3)
            goto L_0x045a
        L_0x0452:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Width and height must either both be set, or not be set at all. It can't be one and not the other."
            r1.<init>(r2)
            throw r1
        L_0x045a:
            if (r4 == 0) goto L_0x04f5
            V r3 = r1.f17250a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x0477
            V r3 = r1.f17250a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x046f
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0486
        L_0x046f:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r1.<init>(r2)
            throw r1
        L_0x0477:
            android.view.ViewGroup$MarginLayoutParams r3 = new android.view.ViewGroup$MarginLayoutParams
            r4 = -2
            r3.<init>(r4, r4)
            V r4 = r1.f17250a
            int r4 = r4.getLayoutDirection()
            r3.setLayoutDirection(r4)
        L_0x0486:
            java.lang.Integer r4 = r1.f17264e
            if (r4 == 0) goto L_0x049e
            int r5 = r4.intValue()
            int r6 = r4.intValue()
            int r7 = r4.intValue()
            int r4 = r4.intValue()
            r3.setMargins(r5, r6, r7, r4)
            goto L_0x04f0
        L_0x049e:
            java.lang.Integer r4 = r1.f17271l
            if (r4 == 0) goto L_0x04a3
            goto L_0x04a5
        L_0x04a3:
            java.lang.Integer r4 = r1.f17267h
        L_0x04a5:
            if (r4 == 0) goto L_0x04ad
            int r4 = r4.intValue()
            r3.leftMargin = r4
        L_0x04ad:
            java.lang.Integer r4 = r1.f17271l
            if (r4 == 0) goto L_0x04b2
            goto L_0x04b4
        L_0x04b2:
            java.lang.Integer r4 = r1.f17268i
        L_0x04b4:
            if (r4 == 0) goto L_0x04bc
            int r4 = r4.intValue()
            r3.rightMargin = r4
        L_0x04bc:
            java.lang.Integer r4 = r1.f17272m
            if (r4 == 0) goto L_0x04c1
            goto L_0x04c3
        L_0x04c1:
            java.lang.Integer r4 = r1.f17265f
        L_0x04c3:
            if (r4 == 0) goto L_0x04cb
            int r4 = r4.intValue()
            r3.bottomMargin = r4
        L_0x04cb:
            java.lang.Integer r4 = r1.f17272m
            if (r4 == 0) goto L_0x04d0
            goto L_0x04d2
        L_0x04d0:
            java.lang.Integer r4 = r1.f17270k
        L_0x04d2:
            if (r4 == 0) goto L_0x04da
            int r4 = r4.intValue()
            r3.topMargin = r4
        L_0x04da:
            java.lang.Integer r4 = r1.f17266g
            if (r4 == 0) goto L_0x04e5
            int r4 = r4.intValue()
            r3.setMarginEnd(r4)
        L_0x04e5:
            java.lang.Integer r4 = r1.f17269j
            if (r4 == 0) goto L_0x04f0
            int r4 = r4.intValue()
            r3.setMarginStart(r4)
        L_0x04f0:
            V r4 = r1.f17250a
            r4.setLayoutParams(r3)
        L_0x04f5:
            r1.f17261b = r2
            r2 = 0
            r1.f17262c = r2
            r1.f17263d = r2
            r1.f17264e = r2
            r1.f17265f = r2
            r1.f17266g = r2
            r1.f17267h = r2
            r1.f17268i = r2
            r1.f17269j = r2
            r1.f17270k = r2
            r1.f17271l = r2
            r1.f17272m = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.ViewStyleApplier.mo843d(t3.f, com.airbnb.paris.typed_array_wrappers.c):void");
    }

    /* renamed from: e */
    public final void mo844e(C7956f fVar, C4870c cVar) {
        this.f11061b.getContext().getResources();
    }
}
