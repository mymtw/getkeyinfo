package android.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewStyleApplier;
import com.airbnb.paris.C4864a;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import p221r3.C7739a;
import p232s3.C7808b;
import p242t3.C7953d;
import p242t3.C7956f;
import p628nj.C18263b;

public final class ImageViewStyleApplier extends C4864a<C7808b, ImageView> {

    public static abstract class BaseStyleBuilder<B extends BaseStyleBuilder<B, A>, A extends C4864a<?, ?>> extends ViewStyleApplier.C0089a<B, A> {
        public BaseStyleBuilder(A a) {
            super(a);
        }

        public B applyTo(ImageView imageView) {
            new ImageViewStyleApplier(imageView).mo14737a(build());
            return this;
        }

        public B scaleType(int i) {
            getBuilder().mo20495a(C18263b.f40047K[1], Integer.valueOf(i));
            return this;
        }

        public B scaleTypeRes(int i) {
            getBuilder().mo20497c(C18263b.f40047K[1], i);
            return this;
        }

        public B src(Drawable drawable) {
            getBuilder().mo20495a(C18263b.f40047K[0], drawable);
            return this;
        }

        public B srcRes(int i) {
            getBuilder().mo20497c(C18263b.f40047K[0], i);
            return this;
        }

        public B tint(ColorStateList colorStateList) {
            getBuilder().mo20495a(C18263b.f40047K[2], colorStateList);
            return this;
        }

        public B tintRes(int i) {
            getBuilder().mo20497c(C18263b.f40047K[2], i);
            return this;
        }

        public BaseStyleBuilder() {
        }

        public B tint(int i) {
            C7953d.C7954a builder = getBuilder();
            int i2 = C18263b.f40047K[2];
            builder.getClass();
            builder.mo20495a(i2, new C7739a(i));
            return this;
        }
    }

    public static final class StyleBuilder extends BaseStyleBuilder<StyleBuilder, ImageViewStyleApplier> {
        public StyleBuilder(ImageViewStyleApplier imageViewStyleApplier) {
            super(imageViewStyleApplier);
        }

        public StyleBuilder addDefault() {
            return this;
        }

        public StyleBuilder() {
        }
    }

    public ImageViewStyleApplier(ImageView imageView) {
        super(new C7808b(imageView));
    }

    /* renamed from: b */
    public final void mo841b(C7956f fVar) {
        new ViewStyleApplier(this.f11061b).mo14737a(fVar);
    }

    /* renamed from: c */
    public final int[] mo842c() {
        return C18263b.f40047K;
    }

    /* renamed from: d */
    public final void mo843d(C7956f fVar, C4870c cVar) {
        ((ImageView) this.f11061b).getContext().getResources();
        if (cVar.mo14771n(1)) {
            C7808b bVar = (C7808b) this.f11060a;
            int i = cVar.mo14766i(1);
            if (i >= 0) {
                ((ImageView) bVar.f17250a).setScaleType(C7808b.f17251b[i]);
            } else {
                bVar.getClass();
            }
        }
        if (cVar.mo14771n(2)) {
            ((ImageView) ((C7808b) this.f11060a).f17250a).setImageTintList(cVar.mo14759b(2));
        }
        if (cVar.mo14771n(0)) {
            ((ImageView) ((C7808b) this.f11060a).f17250a).setImageDrawable(cVar.mo14761d(0));
        }
    }

    /* renamed from: e */
    public final void mo844e(C7956f fVar, C4870c cVar) {
        ((ImageView) this.f11061b).getContext().getResources();
    }
}
