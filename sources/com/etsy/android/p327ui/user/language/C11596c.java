package com.etsy.android.p327ui.user.language;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageTextView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.language.c */
public final class C11596c extends RecyclerView.C3084b0 {

    /* renamed from: e */
    public static final /* synthetic */ int f25682e = 0;

    /* renamed from: b */
    public final C19846a<Boolean> f25683b;

    /* renamed from: c */
    public final C19857l<C11609i, C19394m> f25684c;

    /* renamed from: d */
    public final CollageTextView f25685d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11596c(View view, C19846a<Boolean> aVar, C19857l<? super C11609i, C19394m> lVar) {
        super(view);
        C19383o.m32797g(aVar, "shouldMatchDeviceLocale");
        C19383o.m32797g(lVar, "onLanguageSelected");
        this.f25683b = aVar;
        this.f25684c = lVar;
        View findViewById = view.findViewById(R.id.language);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.language)");
        this.f25685d = (CollageTextView) findViewById;
    }
}
