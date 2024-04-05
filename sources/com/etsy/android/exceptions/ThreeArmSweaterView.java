package com.etsy.android.exceptions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.etsy.android.exceptions.ThreeArmSweaterException;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

public final class ThreeArmSweaterView extends AppCompatImageView {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeArmSweaterView(Context context) {
        super(context);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
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

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (z) {
            ThreeArmSweaterException.Companion companion = ThreeArmSweaterException.Companion;
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            companion.getClass();
            ThreeArmSweaterException.Companion.m12856a(context);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeArmSweaterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeArmSweaterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
    }
}
