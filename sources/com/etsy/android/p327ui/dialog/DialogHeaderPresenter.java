package com.etsy.android.p327ui.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.dialog.DialogHeaderPresenter */
public final class DialogHeaderPresenter {

    /* renamed from: a */
    public final TextView f21512a;

    /* renamed from: b */
    public final Button f21513b;

    /* renamed from: c */
    public final ImageView f21514c;

    public DialogHeaderPresenter(View view) {
        View findViewById = view.findViewById(R.id.txt_title);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.txt_title)");
        TextView textView = (TextView) findViewById;
        this.f21512a = textView;
        View findViewById2 = view.findViewById(R.id.txt_title_sans);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.txt_title_sans)");
        View findViewById3 = view.findViewById(R.id.btn_ok);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.btn_ok)");
        Button button = (Button) findViewById3;
        this.f21513b = button;
        View findViewById4 = view.findViewById(R.id.btn_x);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.btn_x)");
        ImageView imageView = (ImageView) findViewById4;
        this.f21514c = imageView;
        View findViewById5 = view.findViewById(R.id.btn_secondary);
        C19383o.m32796f(findViewById5, "view.findViewById(R.id.btn_secondary)");
        ViewExtensions.m12869m(textView);
        ViewExtensions.m12860d((TextView) findViewById2);
        ViewExtensions.m12869m(button);
        ViewExtensions.m12860d(imageView);
        ViewExtensions.m12860d((Button) findViewById5);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            public final /* synthetic */ DialogHeaderPresenter this$0;

            {
                this.this$0 = r1;
            }

            public void onViewAttachedToWindow(View view) {
                C19383o.m32797g(view, "v");
                NavigationExtensionsKt.m17420a(this.this$0.f21512a, 500);
            }

            public void onViewDetachedFromWindow(View view) {
                C19383o.m32797g(view, "v");
            }
        });
    }
}
