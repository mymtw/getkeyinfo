package com.paypal.pyplcheckout.home.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"CustomViewStyleable"})
public final class ToggleSwitchView extends ConstraintLayout implements ContentView, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "ToggleSwitchView";
    public Map<Integer, View> _$_findViewCache;
    private boolean isToggleSwitchOn;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private SwitchCompat toggleSwitch;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<ToggleSwitchView> cls = ToggleSwitchView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ToggleSwitchView(Context context) {
        this(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToggleSwitchView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void initToggleSwitch(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C17165R.styleable.toggle_switch_view_attrs, 0, 0);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…iew_attrs, 0, 0\n        )");
        setToggleSwitchOn(obtainStyledAttributes.getBoolean(C17165R.styleable.toggle_switch_view_attrs_is_checked, false));
        obtainStyledAttributes.recycle();
    }

    private final void setOnClickListener() {
        this.toggleSwitch.setOnClickListener(this);
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

    public float getContentViewMinHeight() {
        return 0.0f;
    }

    public boolean getIsAnchoredToBottomSheet() {
        return false;
    }

    public final CompoundButton.OnCheckedChangeListener getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public final boolean isToggleSwitchOn() {
        return this.isToggleSwitchOn;
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        if (view.getId() == C17165R.C17167id.toggle_switch) {
            setToggleSwitchOn(!this.isToggleSwitchOn);
            PLog.d$default(TAG, String.valueOf(this.isToggleSwitchOn), 0, 4, (Object) null);
        }
    }

    public void removeListeners() {
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener2) {
        this.toggleSwitch.setOnCheckedChangeListener(onCheckedChangeListener2);
    }

    public final void setToggleSwitchOn(boolean z) {
        this.isToggleSwitchOn = z;
        this.toggleSwitch.setChecked(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        View.inflate(context, C17165R.C17169layout.toggle_switch_layout, this);
        View findViewById = findViewById(C17165R.C17167id.toggle_switch);
        C19383o.m32796f(findViewById, "findViewById(R.id.toggle_switch)");
        this.toggleSwitch = (SwitchCompat) findViewById;
        if (attributeSet != null) {
            initToggleSwitch(attributeSet);
        }
        setOnClickListener();
    }
}
