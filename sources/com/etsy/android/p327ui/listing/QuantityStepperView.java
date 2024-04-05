package com.etsy.android.p327ui.listing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.QuantityStepperView */
public final class QuantityStepperView extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final Group decrementGroup;
    private final Group incrementGroup;
    private int maxQuantity;
    private int quantity;
    private final TextView quantityLabel;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QuantityStepperView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QuantityStepperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuantityStepperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        this.quantity = 1;
        this.maxQuantity = 1;
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_quantity_stepper, this, true);
        View findViewById = inflate.findViewById(R.id.quantity_stepper_decrement_group);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.q…_stepper_decrement_group)");
        Group group = (Group) findViewById;
        this.decrementGroup = group;
        group.setEnabled(false);
        C19388s.m32890v0(group, false, new C19857l<View, C19394m>(this) {
            public final /* synthetic */ QuantityStepperView this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C19394m.f43287a;
            }

            public final void invoke(View view) {
                this.this$0.decrementQuantity();
            }
        });
        View findViewById2 = inflate.findViewById(R.id.quantity_stepper_increment_group);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.q…_stepper_increment_group)");
        Group group2 = (Group) findViewById2;
        this.incrementGroup = group2;
        C19388s.m32890v0(group2, false, new C19857l<View, C19394m>(this) {
            public final /* synthetic */ QuantityStepperView this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C19394m.f43287a;
            }

            public final void invoke(View view) {
                this.this$0.incrementQuantity();
            }
        });
        View findViewById3 = inflate.findViewById(R.id.quantity_stepper_quantity);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.quantity_stepper_quantity)");
        this.quantityLabel = (TextView) findViewById3;
        fillQuantityLabel();
    }

    /* access modifiers changed from: private */
    public final void decrementQuantity() {
        this.quantity--;
        fillQuantityLabel();
        if (this.quantity == 1) {
            C19388s.m32888u0(this.decrementGroup, false);
        }
        C19388s.m32888u0(this.incrementGroup, true);
    }

    private final void fillQuantityLabel() {
        this.quantityLabel.setText(String.valueOf(this.quantity));
    }

    /* access modifiers changed from: private */
    public final void incrementQuantity() {
        this.quantity++;
        fillQuantityLabel();
        if (this.quantity == this.maxQuantity) {
            C19388s.m32888u0(this.incrementGroup, false);
        }
        C19388s.m32888u0(this.decrementGroup, true);
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

    public final int getQuantity() {
        return this.quantity;
    }

    public void setEnabled(boolean z) {
        if (!z) {
            C19388s.m32888u0(this.decrementGroup, z);
            C19388s.m32888u0(this.incrementGroup, z);
        }
    }

    public final void setQuantity(int i) {
        this.quantity = i;
    }

    public final void setQuantity(int i, int i2) {
        this.quantity = i;
        this.maxQuantity = i2;
        boolean z = false;
        C19388s.m32888u0(this.decrementGroup, i != 1);
        Group group = this.incrementGroup;
        if (i < i2) {
            z = true;
        }
        C19388s.m32888u0(group, z);
        fillQuantityLabel();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QuantityStepperView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
