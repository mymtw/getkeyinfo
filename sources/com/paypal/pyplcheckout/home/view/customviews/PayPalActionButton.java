package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.paypal.pyplcheckout.C17165R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;

public final class PayPalActionButton extends LinearLayout {
    public Map<Integer, View> _$_findViewCache;
    private int alignment;
    private ActionButtonColor color;
    private MaterialShapeDrawable materialShapeDrawable;
    private ActionButtonShape shape;
    private C15401a shapeAppearanceModel;
    private boolean shapeHasChanged;
    private ActionButtonSize size;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ActionButtonShape.values().length];
            iArr[ActionButtonShape.ROUNDED.ordinal()] = 1;
            iArr[ActionButtonShape.PILL.ordinal()] = 2;
            iArr[ActionButtonShape.RECTANGLE.ordinal()] = 3;
            iArr[ActionButtonShape.MATERIAL_DESIGN.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActionButtonColor.values().length];
            iArr2[ActionButtonColor.GRAY.ordinal()] = 1;
            iArr2[ActionButtonColor.BLUE.ordinal()] = 2;
            iArr2[ActionButtonColor.WHITE.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalActionButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalActionButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void initAttributes(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C17165R.styleable.PayPalActionButton);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…eable.PayPalActionButton)");
        updateColorFrom(obtainStyledAttributes);
        updateSizeFrom(obtainStyledAttributes);
        updateShapeFrom(obtainStyledAttributes, attributeSet, i);
        C19394m mVar = C19394m.f43287a;
        obtainStyledAttributes.recycle();
    }

    private final void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable2) {
        this.materialShapeDrawable = materialShapeDrawable2;
        setBackground(materialShapeDrawable2);
    }

    private final void setShapeAppearanceModel(C15401a aVar) {
        this.shapeAppearanceModel = aVar;
        MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
        materialShapeDrawable2.setShapeAppearanceModel(aVar);
        setMaterialShapeDrawable(materialShapeDrawable2);
    }

    private final void updateButtonStroke() {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        int a = C8184a.C8188d.m16468a(context, 17170445);
        MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
        materialShapeDrawable2.setStroke(0.0f, a);
        setMaterialShapeDrawable(materialShapeDrawable2);
    }

    private final void updateButtonTextColor() {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$1[this.color.ordinal()];
        if (i2 == 1) {
            Context context = getContext();
            int i3 = C17165R.color.blue_color_600;
            Object obj = C8184a.f17966a;
            i = C8184a.C8188d.m16468a(context, i3);
        } else if (i2 == 2) {
            Context context2 = getContext();
            int i4 = C17165R.color.white_color;
            Object obj2 = C8184a.f17966a;
            i = C8184a.C8188d.m16468a(context2, i4);
        } else if (i2 == 3) {
            Context context3 = getContext();
            int i5 = C17165R.color.blue_color_600;
            Object obj3 = C8184a.f17966a;
            i = C8184a.C8188d.m16468a(context3, i5);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ((TextView) _$_findCachedViewById(C17165R.C17167id.buttonText)).setTextColor(i);
    }

    private final void updateColorFrom(TypedArray typedArray) {
        setColor(ActionButtonColor.Companion.invoke(typedArray.getInt(C17165R.styleable.PayPalActionButton_paypal_checkout_button_color, ActionButtonColor.BLUE.ordinal())));
    }

    private final void updateShapeFrom(TypedArray typedArray, AttributeSet attributeSet, int i) {
        int i2 = C17165R.styleable.PayPalActionButton_paypal_checkout_button_shape;
        if (typedArray.hasValue(i2)) {
            setShape(ActionButtonShape.Companion.invoke(typedArray.getInt(i2, ActionButtonShape.RECTANGLE.ordinal())));
            return;
        }
        useThemeShapeAppearance(attributeSet, i);
    }

    private final void updateSizeFrom(TypedArray typedArray) {
        setSize(ActionButtonSize.Companion.invoke(typedArray.getInt(C17165R.styleable.PayPalActionButton_paypal_checkout_button_size, ActionButtonSize.MEDIUM.ordinal())));
    }

    private final void useThemeShapeAppearance(AttributeSet attributeSet, int i) {
        setShapeAppearanceModel(C15401a.m24981b(getContext(), attributeSet, i, C17165R.C17171style.Widget_MaterialComponents_Button).mo54616a());
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final ActionButtonColor getColor() {
        return this.color;
    }

    public final ActionButtonShape getShape() {
        return this.shape;
    }

    public final ActionButtonSize getSize() {
        return this.size;
    }

    public void onDraw(Canvas canvas) {
        ActionButtonShape actionButtonShape = this.shape;
        ActionButtonShape actionButtonShape2 = ActionButtonShape.PILL;
        if (actionButtonShape == actionButtonShape2 && this.shapeHasChanged) {
            setShape(actionButtonShape2);
        }
        super.onDraw(canvas);
    }

    public final void setAlignment(int i) {
        setGravity(i);
        this.alignment = i;
        int dimension = (int) getResources().getDimension(C17165R.dimen.padding_24x);
        setPadding(dimension, dimension, getPaddingRight(), dimension);
        ((TextView) _$_findCachedViewById(C17165R.C17167id.buttonText)).setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(C17165R.C17166drawable.plus, (Resources.Theme) null), (Drawable) null, (Drawable) null, (Drawable) null);
        setElevation(getResources().getDimension(C17165R.dimen.margin_48x));
        setBackground(getResources().getDrawable(C17165R.C17166drawable.action_button, (Resources.Theme) null));
    }

    public final void setColor(ActionButtonColor actionButtonColor) {
        C19383o.m32797g(actionButtonColor, "value");
        this.color = actionButtonColor;
        MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        materialShapeDrawable2.setFillColor(actionButtonColor.retrieveColorResource(context));
        updateButtonStroke();
        setMaterialShapeDrawable(materialShapeDrawable2);
        updateButtonTextColor();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setShape(com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape r7) {
        /*
            r6 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape r0 = r6.shape
            r1 = 1
            if (r0 == r7) goto L_0x000c
            r0 = r1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r6.shapeHasChanged = r0
            r6.shape = r7
            int[] r0 = com.paypal.pyplcheckout.home.view.customviews.PayPalActionButton.WhenMappings.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r2 = 4
            r3 = 3
            r4 = 2
            if (r7 == r1) goto L_0x0046
            if (r7 == r4) goto L_0x0040
            if (r7 == r3) goto L_0x0035
            if (r7 != r2) goto L_0x002f
            android.content.res.Resources r7 = r6.getResources()
            int r5 = com.paypal.pyplcheckout.C17165R.dimen.paypal_payment_button_corner_radius_material
            float r7 = r7.getDimension(r5)
            goto L_0x0050
        L_0x002f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0035:
            android.content.res.Resources r7 = r6.getResources()
            int r5 = com.paypal.pyplcheckout.C17165R.dimen.paypal_payment_button_corner_radius_square
            float r7 = r7.getDimension(r5)
            goto L_0x0050
        L_0x0040:
            int r7 = r6.getHeight()
            float r7 = (float) r7
            goto L_0x0050
        L_0x0046:
            android.content.res.Resources r7 = r6.getResources()
            int r5 = com.paypal.pyplcheckout.C17165R.dimen.paypal_payment_button_corner_radius_rounded
            float r7 = r7.getDimension(r5)
        L_0x0050:
            com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape r5 = r6.shape
            int r5 = r5.ordinal()
            r0 = r0[r5]
            if (r0 == r1) goto L_0x006d
            if (r0 == r4) goto L_0x006d
            if (r0 == r3) goto L_0x0067
            if (r0 != r2) goto L_0x0061
            goto L_0x006d
        L_0x0061:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0067:
            dl.d r0 = new dl.d
            r0.<init>()
            goto L_0x0072
        L_0x006d:
            dl.i r0 = new dl.i
            r0.<init>()
        L_0x0072:
            com.google.android.material.shape.a$a r1 = new com.google.android.material.shape.a$a
            r1.<init>()
            r1.mo54617c(r7)
            r1.f34583a = r0
            float r7 = com.google.android.material.shape.C15401a.C15402a.m24987b(r0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0089
            r1.mo54620f(r7)
        L_0x0089:
            r1.f34584b = r0
            float r7 = com.google.android.material.shape.C15401a.C15402a.m24987b(r0)
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0096
            r1.mo54621g(r7)
        L_0x0096:
            r1.f34585c = r0
            float r7 = com.google.android.material.shape.C15401a.C15402a.m24987b(r0)
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x00a3
            r1.mo54619e(r7)
        L_0x00a3:
            r1.f34586d = r0
            float r7 = com.google.android.material.shape.C15401a.C15402a.m24987b(r0)
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b0
            r1.mo54618d(r7)
        L_0x00b0:
            com.google.android.material.shape.a r7 = new com.google.android.material.shape.a
            r7.<init>(r1)
            r6.setShapeAppearanceModel(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.view.customviews.PayPalActionButton.setShape(com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape):void");
    }

    public final void setSize(ActionButtonSize actionButtonSize) {
        C19383o.m32797g(actionButtonSize, "value");
        this.size = actionButtonSize;
        setMinimumHeight((int) getResources().getDimension(this.size.getMinHeightResId()));
        int dimension = (int) getResources().getDimension(this.size.getVerticalPaddingResId());
        setPadding(getPaddingLeft(), dimension, getPaddingRight(), dimension);
        ((TextView) _$_findCachedViewById(C17165R.C17167id.buttonText)).setTextSize(0, getResources().getDimension(this.size.getLabelTextSizeResId()));
    }

    public final void updateButtonText(String str) {
        int i = C17165R.C17167id.buttonText;
        ((TextView) _$_findCachedViewById(i)).setText(str);
        ((TextView) _$_findCachedViewById(i)).setContentDescription(str);
        updateButtonTextColor();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.shapeAppearanceModel = new C15401a();
        this.materialShapeDrawable = new MaterialShapeDrawable();
        this.color = ActionButtonColor.BLUE;
        this.size = ActionButtonSize.MEDIUM;
        this.shape = ActionButtonShape.MATERIAL_DESIGN;
        LayoutInflater.from(context).inflate(C17165R.C17169layout.paypal_action_button_view, this, true);
        setOrientation(0);
        setGravity(17);
        initAttributes(attributeSet, i);
    }
}
