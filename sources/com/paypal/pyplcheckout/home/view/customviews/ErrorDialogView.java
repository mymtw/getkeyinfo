package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.paypal.pyplcheckout.C17165R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ErrorDialogView extends LinearLayout {
    public Map<Integer, View> _$_findViewCache;
    private Button backButton;
    private TextView errorCode;
    private TextView message;
    private TextView title;

    public ErrorDialogView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public ErrorDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public ErrorDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = new LinkedHashMap();
        LayoutInflater.from(context).inflate(C17165R.C17169layout.paypal_error_dialog, this, true);
        setOrientation(1);
        View findViewById = findViewById(C17165R.C17167id.error_dialog_title);
        C19383o.m32796f(findViewById, "findViewById(R.id.error_dialog_title)");
        this.title = (TextView) findViewById;
        View findViewById2 = findViewById(C17165R.C17167id.error_message);
        C19383o.m32796f(findViewById2, "findViewById(R.id.error_message)");
        this.message = (TextView) findViewById2;
        View findViewById3 = findViewById(C17165R.C17167id.error_code);
        C19383o.m32796f(findViewById3, "findViewById(R.id.error_code)");
        this.errorCode = (TextView) findViewById3;
        View findViewById4 = findViewById(C17165R.C17167id.ok_button);
        C19383o.m32796f(findViewById4, "findViewById(R.id.ok_button)");
        this.backButton = (Button) findViewById4;
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

    public final void setButtonAction(View.OnClickListener onClickListener) {
        C19383o.m32797g(onClickListener, "_buttonAction");
        this.backButton.setOnClickListener(onClickListener);
    }

    public final void setErrorCode(String str) {
        C19383o.m32797g(str, "_errorCode");
        this.errorCode.setText(str);
    }

    public final void setMessage(String str) {
        C19383o.m32797g(str, "_message");
        this.message.setText(str);
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "_title");
        this.title.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ErrorDialogView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
