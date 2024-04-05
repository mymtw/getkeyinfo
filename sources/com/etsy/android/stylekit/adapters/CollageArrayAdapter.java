package com.etsy.android.stylekit.adapters;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

public class CollageArrayAdapter<T> extends ArrayAdapter<T> {
    public static final int $stable = 8;
    private final CollageArrayAdapter$a11yFocusOnAttachStateChangeListener$1 a11yFocusOnAttachStateChangeListener = new CollageArrayAdapter$a11yFocusOnAttachStateChangeListener$1();
    private View currentItemWithA11yFocus;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageArrayAdapter(Context context, int i) {
        super(context, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    public final void setA11yFocus(View view) {
        C19383o.m32797g(view, "view");
        View view2 = this.currentItemWithA11yFocus;
        if (view2 != null) {
            C19383o.m32794d(view2);
            view2.removeOnAttachStateChangeListener(this.a11yFocusOnAttachStateChangeListener);
        }
        view.addOnAttachStateChangeListener(this.a11yFocusOnAttachStateChangeListener);
        this.currentItemWithA11yFocus = view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageArrayAdapter(Context context, int i, int i2) {
        super(context, i, i2);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageArrayAdapter(Context context, int i, T[] tArr) {
        super(context, i, tArr);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(tArr, "objects");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageArrayAdapter(Context context, int i, int i2, T[] tArr) {
        super(context, i, i2, tArr);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(tArr, "objects");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageArrayAdapter(Context context, int i, List<? extends T> list) {
        super(context, i, list);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(list, "objects");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageArrayAdapter(Context context, int i, int i2, List<? extends T> list) {
        super(context, i, i2, C19327t.m32661q1(list));
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(list, "objects");
    }
}
