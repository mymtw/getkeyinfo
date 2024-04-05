package p656qk;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import com.etsy.android.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import kotlin.jvm.internal.C19388s;
import p515bl.C14091a;
import p550dl.C17578d;
import p550dl.C17583i;
import p610kp.C18161c;

/* renamed from: qk.b */
public final class C18465b {

    /* renamed from: s */
    public static final double f40650s = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public final MaterialCardView f40651a;

    /* renamed from: b */
    public final Rect f40652b = new Rect();

    /* renamed from: c */
    public final MaterialShapeDrawable f40653c;

    /* renamed from: d */
    public final MaterialShapeDrawable f40654d;

    /* renamed from: e */
    public int f40655e;

    /* renamed from: f */
    public int f40656f;

    /* renamed from: g */
    public int f40657g;

    /* renamed from: h */
    public Drawable f40658h;

    /* renamed from: i */
    public Drawable f40659i;

    /* renamed from: j */
    public ColorStateList f40660j;

    /* renamed from: k */
    public ColorStateList f40661k;

    /* renamed from: l */
    public C15401a f40662l;

    /* renamed from: m */
    public ColorStateList f40663m;

    /* renamed from: n */
    public RippleDrawable f40664n;

    /* renamed from: o */
    public LayerDrawable f40665o;

    /* renamed from: p */
    public MaterialShapeDrawable f40666p;

    /* renamed from: q */
    public boolean f40667q = false;

    /* renamed from: r */
    public boolean f40668r;

    public C18465b(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f40651a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.f40653c = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(materialCardView.getContext());
        materialShapeDrawable.setShadowColor(-12303292);
        C15401a shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        shapeAppearanceModel.getClass();
        C15401a.C15402a aVar = new C15401a.C15402a(shapeAppearanceModel);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C18161c.f39691j, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            aVar.mo54617c(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f40654d = new MaterialShapeDrawable();
        mo69980f(new C15401a(aVar));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static float m31155b(C19388s sVar, float f) {
        if (sVar instanceof C17583i) {
            return (float) ((1.0d - f40650s) * ((double) f));
        }
        if (sVar instanceof C17578d) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final float mo69976a() {
        return Math.max(Math.max(m31155b(this.f40662l.f34571a, this.f40653c.getTopLeftCornerResolvedSize()), m31155b(this.f40662l.f34572b, this.f40653c.getTopRightCornerResolvedSize())), Math.max(m31155b(this.f40662l.f34573c, this.f40653c.getBottomRightCornerResolvedSize()), m31155b(this.f40662l.f34574d, this.f40653c.getBottomLeftCornerResolvedSize())));
    }

    /* renamed from: c */
    public final LayerDrawable mo69977c() {
        if (this.f40664n == null) {
            int[] iArr = C14091a.f31044a;
            this.f40666p = new MaterialShapeDrawable(this.f40662l);
            this.f40664n = new RippleDrawable(this.f40660j, (Drawable) null, this.f40666p);
        }
        if (this.f40665o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f40664n, this.f40654d, this.f40659i});
            this.f40665o = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f40665o;
    }

    /* renamed from: d */
    public final C18464a mo69978d(Drawable drawable) {
        int i;
        int i2;
        if (this.f40651a.getUseCompatPadding()) {
            float f = 0.0f;
            int ceil = (int) Math.ceil((double) ((this.f40651a.getMaxCardElevation() * 1.5f) + (mo69981g() ? mo69976a() : 0.0f)));
            float maxCardElevation = this.f40651a.getMaxCardElevation();
            if (mo69981g()) {
                f = mo69976a();
            }
            i2 = (int) Math.ceil((double) (maxCardElevation + f));
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new C18464a(drawable, i2, i, i2, i);
    }

    /* renamed from: e */
    public final void mo69979e(Drawable drawable) {
        this.f40659i = drawable;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f40659i = mutate;
            mutate.setTintList(this.f40661k);
            boolean isChecked = this.f40651a.isChecked();
            Drawable drawable2 = this.f40659i;
            if (drawable2 != null) {
                drawable2.setAlpha(isChecked ? 255 : 0);
            }
        }
        LayerDrawable layerDrawable = this.f40665o;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f40659i);
        }
    }

    /* renamed from: f */
    public final void mo69980f(C15401a aVar) {
        this.f40662l = aVar;
        this.f40653c.setShapeAppearanceModel(aVar);
        MaterialShapeDrawable materialShapeDrawable = this.f40653c;
        materialShapeDrawable.setShadowBitmapDrawingEnable(!materialShapeDrawable.isRoundRect());
        MaterialShapeDrawable materialShapeDrawable2 = this.f40654d;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(aVar);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.f40666p;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(aVar);
        }
    }

    /* renamed from: g */
    public final boolean mo69981g() {
        return this.f40651a.getPreventCornerOverlap() && this.f40653c.isRoundRect() && this.f40651a.getUseCompatPadding();
    }

    /* renamed from: h */
    public final void mo69982h() {
        boolean z = true;
        if (!(this.f40651a.getPreventCornerOverlap() && !this.f40653c.isRoundRect()) && !mo69981g()) {
            z = false;
        }
        float f = 0.0f;
        float a = z ? mo69976a() : 0.0f;
        if (this.f40651a.getPreventCornerOverlap() && this.f40651a.getUseCompatPadding()) {
            f = (float) ((1.0d - f40650s) * ((double) this.f40651a.getCardViewRadius()));
        }
        int i = (int) (a - f);
        MaterialCardView materialCardView = this.f40651a;
        Rect rect = this.f40652b;
        materialCardView.setAncestorContentPadding(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
    }

    /* renamed from: i */
    public final void mo69983i() {
        if (!this.f40667q) {
            this.f40651a.setBackgroundInternal(mo69978d(this.f40653c));
        }
        this.f40651a.setForeground(mo69978d(this.f40658h));
    }
}
