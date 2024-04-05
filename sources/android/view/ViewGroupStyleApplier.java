package android.view;

import android.animation.LayoutTransition;
import android.view.ViewStyleApplier;
import com.airbnb.paris.C4864a;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import p232s3.C7810d;
import p242t3.C7956f;
import p628nj.C18263b;

public final class ViewGroupStyleApplier extends C4864a<C7810d, ViewGroup> {

    public static abstract class BaseStyleBuilder<B extends BaseStyleBuilder<B, A>, A extends C4864a<?, ?>> extends ViewStyleApplier.C0089a<B, A> {
        public BaseStyleBuilder(A a) {
            super(a);
        }

        public B animateLayoutChanges(boolean z) {
            getBuilder().mo20495a(C18263b.f40050N[2], Boolean.valueOf(z));
            return this;
        }

        public B animateLayoutChangesRes(int i) {
            getBuilder().mo20497c(C18263b.f40050N[2], i);
            return this;
        }

        public B applyTo(ViewGroup viewGroup) {
            new ViewGroupStyleApplier(viewGroup).mo14737a(build());
            return this;
        }

        public B clipChildren(boolean z) {
            getBuilder().mo20495a(C18263b.f40050N[0], Boolean.valueOf(z));
            return this;
        }

        public B clipChildrenRes(int i) {
            getBuilder().mo20497c(C18263b.f40050N[0], i);
            return this;
        }

        public B clipToPadding(boolean z) {
            getBuilder().mo20495a(C18263b.f40050N[1], Boolean.valueOf(z));
            return this;
        }

        public B clipToPaddingRes(int i) {
            getBuilder().mo20497c(C18263b.f40050N[1], i);
            return this;
        }

        public BaseStyleBuilder() {
        }
    }

    public static final class StyleBuilder extends BaseStyleBuilder<StyleBuilder, ViewGroupStyleApplier> {
        public StyleBuilder(ViewGroupStyleApplier viewGroupStyleApplier) {
            super(viewGroupStyleApplier);
        }

        public StyleBuilder addDefault() {
            return this;
        }

        public StyleBuilder() {
        }
    }

    public ViewGroupStyleApplier(ViewGroup viewGroup) {
        super(new C7810d(viewGroup));
    }

    /* renamed from: b */
    public final void mo841b(C7956f fVar) {
        new ViewStyleApplier(this.f11061b).mo14737a(fVar);
    }

    /* renamed from: c */
    public final int[] mo842c() {
        return C18263b.f40050N;
    }

    /* renamed from: d */
    public final void mo843d(C7956f fVar, C4870c cVar) {
        ((ViewGroup) this.f11061b).getContext().getResources();
        if (cVar.mo14771n(2)) {
            ((ViewGroup) ((C7810d) this.f11060a).f17250a).setLayoutTransition(cVar.mo14758a(2) ? new LayoutTransition() : null);
        }
        if (cVar.mo14771n(0)) {
            ((ViewGroup) ((C7810d) this.f11060a).f17250a).setClipChildren(cVar.mo14758a(0));
        }
        if (cVar.mo14771n(1)) {
            ((ViewGroup) ((C7810d) this.f11060a).f17250a).setClipToPadding(cVar.mo14758a(1));
        }
    }

    /* renamed from: e */
    public final void mo844e(C7956f fVar, C4870c cVar) {
        ((ViewGroup) this.f11061b).getContext().getResources();
    }
}
