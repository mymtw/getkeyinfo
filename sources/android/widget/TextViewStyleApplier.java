package android.widget;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.ViewStyleApplier;
import androidx.core.widget.C2404h;
import com.airbnb.paris.C4864a;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p221r3.C7739a;
import p232s3.C7809c;
import p242t3.C7953d;
import p242t3.C7956f;
import p628nj.C18263b;

public final class TextViewStyleApplier extends C4864a<C7809c, TextView> {

    public static abstract class BaseStyleBuilder<B extends BaseStyleBuilder<B, A>, A extends C4864a<?, ?>> extends ViewStyleApplier.C0089a<B, A> {
        public BaseStyleBuilder(A a) {
            super(a);
        }

        public B applyTo(TextView textView) {
            new TextViewStyleApplier(textView).mo14737a(build());
            return this;
        }

        public B drawableBottom(Drawable drawable) {
            getBuilder().mo20495a(C18263b.f40048L[16], drawable);
            return this;
        }

        public B drawableBottomRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[16], i);
            return this;
        }

        public B drawableLeft(Drawable drawable) {
            getBuilder().mo20495a(C18263b.f40048L[17], drawable);
            return this;
        }

        public B drawableLeftRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[17], i);
            return this;
        }

        public B drawablePadding(int i) {
            getBuilder().mo20495a(C18263b.f40048L[19], Integer.valueOf(i));
            return this;
        }

        public B drawablePaddingDp(int i) {
            getBuilder().mo20496b(C18263b.f40048L[19], i);
            return this;
        }

        public B drawablePaddingRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[19], i);
            return this;
        }

        public B drawableRight(Drawable drawable) {
            getBuilder().mo20495a(C18263b.f40048L[18], drawable);
            return this;
        }

        public B drawableRightRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[18], i);
            return this;
        }

        public B drawableTop(Drawable drawable) {
            getBuilder().mo20495a(C18263b.f40048L[15], drawable);
            return this;
        }

        public B drawableTopRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[15], i);
            return this;
        }

        public B ellipsize(int i) {
            getBuilder().mo20495a(C18263b.f40048L[5], Integer.valueOf(i));
            return this;
        }

        public B ellipsizeRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[5], i);
            return this;
        }

        public B fontFamily(Typeface typeface) {
            getBuilder().mo20495a(C18263b.f40048L[24], typeface);
            return this;
        }

        public B fontFamilyRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[24], i);
            return this;
        }

        public B gravity(int i) {
            getBuilder().mo20495a(C18263b.f40048L[6], Integer.valueOf(i));
            return this;
        }

        public B gravityRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[6], i);
            return this;
        }

        public B hint(CharSequence charSequence) {
            getBuilder().mo20495a(C18263b.f40048L[10], charSequence);
            return this;
        }

        public B hintRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[10], i);
            return this;
        }

        public B inputType(int i) {
            getBuilder().mo20495a(C18263b.f40048L[22], Integer.valueOf(i));
            return this;
        }

        public B inputTypeRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[22], i);
            return this;
        }

        public B letterSpacing(float f) {
            getBuilder().mo20495a(C18263b.f40048L[25], Float.valueOf(f));
            return this;
        }

        public B letterSpacingRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[25], i);
            return this;
        }

        public B lineHeight(int i) {
            getBuilder().mo20495a(C18263b.f40048L[26], Integer.valueOf(i));
            return this;
        }

        public B lineHeightDp(int i) {
            getBuilder().mo20496b(C18263b.f40048L[26], i);
            return this;
        }

        public B lineHeightRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[26], i);
            return this;
        }

        public B lineSpacingExtra(int i) {
            getBuilder().mo20495a(C18263b.f40048L[20], Integer.valueOf(i));
            return this;
        }

        public B lineSpacingExtraDp(int i) {
            getBuilder().mo20496b(C18263b.f40048L[20], i);
            return this;
        }

        public B lineSpacingExtraRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[20], i);
            return this;
        }

        public B lineSpacingMultiplier(float f) {
            getBuilder().mo20495a(C18263b.f40048L[21], Float.valueOf(f));
            return this;
        }

        public B lineSpacingMultiplierRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[21], i);
            return this;
        }

        public B lines(int i) {
            getBuilder().mo20495a(C18263b.f40048L[12], Integer.valueOf(i));
            return this;
        }

        public B linesRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[12], i);
            return this;
        }

        public B maxLines(int i) {
            getBuilder().mo20495a(C18263b.f40048L[11], Integer.valueOf(i));
            return this;
        }

        public B maxLinesRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[11], i);
            return this;
        }

        public B maxWidth(int i) {
            getBuilder().mo20495a(C18263b.f40048L[7], Integer.valueOf(i));
            return this;
        }

        public B maxWidthDp(int i) {
            getBuilder().mo20496b(C18263b.f40048L[7], i);
            return this;
        }

        public B maxWidthRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[7], i);
            return this;
        }

        public B minLines(int i) {
            getBuilder().mo20495a(C18263b.f40048L[13], Integer.valueOf(i));
            return this;
        }

        public B minLinesRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[13], i);
            return this;
        }

        public B singleLine(boolean z) {
            getBuilder().mo20495a(C18263b.f40048L[14], Boolean.valueOf(z));
            return this;
        }

        public B singleLineRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[14], i);
            return this;
        }

        public B text(CharSequence charSequence) {
            getBuilder().mo20495a(C18263b.f40048L[9], charSequence);
            return this;
        }

        public B textAllCaps(boolean z) {
            getBuilder().mo20495a(C18263b.f40048L[23], Boolean.valueOf(z));
            return this;
        }

        public B textAllCapsRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[23], i);
            return this;
        }

        public B textAppearanceRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[0], i);
            return this;
        }

        public B textColor(ColorStateList colorStateList) {
            getBuilder().mo20495a(C18263b.f40048L[3], colorStateList);
            return this;
        }

        public B textColorHint(ColorStateList colorStateList) {
            getBuilder().mo20495a(C18263b.f40048L[4], colorStateList);
            return this;
        }

        public B textColorHintRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[4], i);
            return this;
        }

        public B textColorRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[3], i);
            return this;
        }

        public B textRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[9], i);
            return this;
        }

        public B textSize(int i) {
            getBuilder().mo20495a(C18263b.f40048L[1], Integer.valueOf(i));
            return this;
        }

        public B textSizeDp(int i) {
            getBuilder().mo20496b(C18263b.f40048L[1], i);
            return this;
        }

        public B textSizeRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[1], i);
            return this;
        }

        public B textStyle(int i) {
            getBuilder().mo20495a(C18263b.f40048L[2], Integer.valueOf(i));
            return this;
        }

        public B textStyleRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[2], i);
            return this;
        }

        public BaseStyleBuilder() {
        }

        public B minWidth(int i) {
            getBuilder().mo20495a(C18263b.f40048L[8], Integer.valueOf(i));
            return this;
        }

        public B minWidthDp(int i) {
            getBuilder().mo20496b(C18263b.f40048L[8], i);
            return this;
        }

        public B minWidthRes(int i) {
            getBuilder().mo20497c(C18263b.f40048L[8], i);
            return this;
        }

        public B textColor(int i) {
            C7953d.C7954a builder = getBuilder();
            int i2 = C18263b.f40048L[3];
            builder.getClass();
            builder.mo20495a(i2, new C7739a(i));
            return this;
        }

        public B textColorHint(int i) {
            C7953d.C7954a builder = getBuilder();
            int i2 = C18263b.f40048L[4];
            builder.getClass();
            builder.mo20495a(i2, new C7739a(i));
            return this;
        }
    }

    public static final class StyleBuilder extends BaseStyleBuilder<StyleBuilder, TextViewStyleApplier> {
        public StyleBuilder(TextViewStyleApplier textViewStyleApplier) {
            super(textViewStyleApplier);
        }

        public StyleBuilder addDefault() {
            return this;
        }

        public StyleBuilder() {
        }
    }

    public TextViewStyleApplier(TextView textView) {
        super(new C7809c(textView));
    }

    /* renamed from: b */
    public final void mo841b(C7956f fVar) {
        new ViewStyleApplier(this.f11061b).mo14737a(fVar);
    }

    /* renamed from: c */
    public final int[] mo842c() {
        return C18263b.f40048L;
    }

    /* renamed from: d */
    public final void mo843d(C7956f fVar, C4870c cVar) {
        int i;
        TextUtils.TruncateAt truncateAt;
        ((TextView) this.f11061b).getContext().getResources();
        boolean z = false;
        if (cVar.mo14771n(0)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setTextAppearance(cVar.mo14768k(0));
        }
        if (cVar.mo14771n(16)) {
            ((C7809c) this.f11060a).f17255e = cVar.mo14761d(16);
        }
        if (cVar.mo14771n(17)) {
            ((C7809c) this.f11060a).f17252b = cVar.mo14761d(17);
        }
        if (cVar.mo14771n(18)) {
            ((C7809c) this.f11060a).f17254d = cVar.mo14761d(18);
        }
        if (cVar.mo14771n(15)) {
            ((C7809c) this.f11060a).f17253c = cVar.mo14761d(15);
        }
        if (cVar.mo14771n(19)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setCompoundDrawablePadding(cVar.mo14760c(19));
        }
        if (cVar.mo14771n(5)) {
            int i2 = cVar.mo14766i(5);
            TextView textView = (TextView) ((C7809c) this.f11060a).f17250a;
            if (i2 == 1) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i2 == 2) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else if (i2 == 3) {
                truncateAt = TextUtils.TruncateAt.END;
            } else if (i2 == 4) {
                truncateAt = TextUtils.TruncateAt.MARQUEE;
            } else {
                throw new IllegalStateException(C0015b.m88g("Invalid value for ellipsize. ", i2));
            }
            textView.setEllipsize(truncateAt);
        }
        if (cVar.mo14771n(24)) {
            ((C7809c) this.f11060a).f17258h = cVar.mo14763f();
        }
        if (cVar.mo14771n(10)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setHint(cVar.mo14770m(10));
        }
        if (cVar.mo14771n(22)) {
            C7809c cVar2 = (C7809c) this.f11060a;
            int i3 = cVar.mo14766i(22);
            cVar2.f17257g = Integer.valueOf(i3);
            ((TextView) cVar2.f17250a).setInputType(i3);
        }
        if (cVar.mo14771n(6)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setGravity(cVar.mo14766i(6));
        }
        if (cVar.mo14771n(25)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setLetterSpacing(cVar.mo14762e(25));
        }
        if (cVar.mo14771n(12)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setLines(cVar.mo14766i(12));
        }
        if (cVar.mo14771n(20)) {
            int c = cVar.mo14760c(20);
            TextView textView2 = (TextView) ((C7809c) this.f11060a).f17250a;
            textView2.setLineSpacing((float) c, textView2.getLineSpacingMultiplier());
        }
        if (cVar.mo14771n(21)) {
            float e = cVar.mo14762e(21);
            TextView textView3 = (TextView) ((C7809c) this.f11060a).f17250a;
            textView3.setLineSpacing(textView3.getLineSpacingExtra(), e);
        }
        if (cVar.mo14771n(11)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setMaxLines(cVar.mo14766i(11));
        }
        if (cVar.mo14771n(13)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setMinLines(cVar.mo14766i(13));
        }
        if (cVar.mo14771n(7)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setMaxWidth(cVar.mo14760c(7));
        }
        if (cVar.mo14771n(8)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setMinWidth(cVar.mo14760c(8));
        }
        if (cVar.mo14771n(14)) {
            ((C7809c) this.f11060a).f17256f = Boolean.valueOf(cVar.mo14758a(14));
        }
        if (cVar.mo14771n(9)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setText(cVar.mo14770m(9));
        }
        if (cVar.mo14771n(23)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setAllCaps(cVar.mo14758a(23));
        }
        if (cVar.mo14771n(3)) {
            ColorStateList b = cVar.mo14759b(3);
            TextView textView4 = (TextView) ((C7809c) this.f11060a).f17250a;
            if (b == null) {
                b = ColorStateList.valueOf(-16777216);
            }
            textView4.setTextColor(b);
        }
        if (cVar.mo14771n(4)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setHintTextColor(cVar.mo14759b(4));
        }
        if (cVar.mo14771n(1)) {
            ((TextView) ((C7809c) this.f11060a).f17250a).setTextSize(0, (float) cVar.mo14760c(1));
        }
        if (cVar.mo14771n(2)) {
            ((C7809c) this.f11060a).f17259i = Integer.valueOf(cVar.mo14766i(2));
        }
        if (cVar.mo14771n(26)) {
            C2404h.m5362d((TextView) ((C7809c) this.f11060a).f17250a, cVar.mo14760c(26));
        }
        C7809c cVar3 = (C7809c) this.f11060a;
        Drawable[] compoundDrawables = ((TextView) cVar3.f17250a).getCompoundDrawables();
        TextView textView5 = (TextView) cVar3.f17250a;
        Drawable drawable = cVar3.f17252b;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        Drawable drawable2 = cVar3.f17253c;
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        Drawable drawable3 = cVar3.f17254d;
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        Drawable drawable4 = cVar3.f17255e;
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView5.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        cVar3.f17252b = null;
        cVar3.f17253c = null;
        cVar3.f17254d = null;
        cVar3.f17255e = null;
        if (cVar3.f17256f != null) {
            Integer num = cVar3.f17257g;
            if (num != null) {
                cVar3.f17256f = Boolean.valueOf(!((num.intValue() & 131087) == 131073));
            }
            TextView textView6 = (TextView) cVar3.f17250a;
            Boolean bool = cVar3.f17256f;
            if (bool != null) {
                textView6.setSingleLine(bool.booleanValue());
            } else {
                C19383o.m32803m();
                throw null;
            }
        }
        Integer num2 = cVar3.f17257g;
        if (num2 != null) {
            int intValue = num2.intValue() & 4095;
            if (intValue == 129 || intValue == 225 || intValue == 18) {
                z = true;
            }
            if (z) {
                ((TextView) cVar3.f17250a).setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        cVar3.f17257g = null;
        Typeface typeface = cVar3.f17258h;
        if (typeface != null || cVar3.f17259i != null) {
            if (typeface == null) {
                typeface = ((TextView) cVar3.f17250a).getTypeface();
            }
            Integer num3 = cVar3.f17259i;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                C19383o.m32793c(typeface, "typefaceToSet");
                i = typeface.getStyle();
            }
            ((TextView) cVar3.f17250a).setTypeface(Typeface.create(typeface, i), i);
        }
    }

    /* renamed from: e */
    public final void mo844e(C7956f fVar, C4870c cVar) {
        ((TextView) this.f11061b).getContext().getResources();
    }
}
