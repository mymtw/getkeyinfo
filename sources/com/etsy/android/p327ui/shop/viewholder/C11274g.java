package com.etsy.android.p327ui.shop.viewholder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Spanned;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.uikit.text.ClickableSpanTouchListener;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p193o.C7494b;
import p460ue.C13492b;

/* renamed from: com.etsy.android.ui.shop.viewholder.g */
public final class C11274g extends C12086e<C13492b> {

    /* renamed from: c */
    public final TextView f24888c;

    /* renamed from: d */
    public final TextView f24889d;

    /* renamed from: e */
    public final C7494b<CharSequence, Integer> f24890e = new C7494b<>();

    /* renamed from: f */
    public final C11266c f24891f;

    @SuppressLint({"ClickableViewAccessibility"})
    public C11274g(ViewGroup viewGroup, C11266c cVar) {
        super(C0326j.m859c(viewGroup, R.layout.shop_announcement_content, viewGroup, false));
        this.f24891f = cVar;
        TextView textView = (TextView) this.itemView.findViewById(R.id.text);
        textView.setOnTouchListener(new ClickableSpanTouchListener());
        this.f24888c = textView;
        this.f24889d = (TextView) this.itemView.findViewById(R.id.read_more);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13492b bVar = (C13492b) obj;
        TextView textView = this.f24888c;
        CharSequence b = bVar.mo36825b(this.itemView.getContext());
        textView.setText(b);
        TextView textView2 = this.f24889d;
        textView2.setText(bVar.f29523b ? R.string.read_more : R.string.read_less);
        int i = 0;
        textView2.setContentDescription(textView2.getResources().getString(R.string.item_button, new Object[]{textView2.getText()}));
        Integer orDefault = this.f24890e.getOrDefault(b, null);
        if (orDefault == null || orDefault.intValue() == 0) {
            textView.post(new C11268d(this, (Spanned) b, textView, textView2));
        } else {
            if (orDefault.intValue() <= 3) {
                i = 4;
            }
            textView2.setVisibility(i);
        }
        if (bVar.f29523b) {
            textView.setMaxLines(3);
        } else {
            textView.setMaxLines(30000);
        }
        List<String> list = AccessibilityCapabilities.f19885a;
        Context context = textView.getContext();
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Object systemService = context.getSystemService("accessibility");
        C19383o.m32795e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if (((AccessibilityManager) systemService).isEnabled()) {
            this.f24888c.getViewTreeObserver().addOnGlobalLayoutListener(new C11270e(textView));
            textView2.setFocusableInTouchMode(true);
            NavigationExtensionsKt.m17420a(textView2, 100);
        }
        this.f24889d.setOnClickListener(new C11272f(this, bVar));
    }
}
