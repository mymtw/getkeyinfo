package com.etsy.android.p327ui.common.listingreview.redesign;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.util.C8923u;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.a */
public final class C9447a extends RecyclerView.C3084b0 {

    /* renamed from: f */
    public static final /* synthetic */ int f20941f = 0;

    /* renamed from: b */
    public final C19857l<ReviewUiModel, C19394m> f20942b;

    /* renamed from: c */
    public final C19857l<ReviewUiModel, C19394m> f20943c;

    /* renamed from: d */
    public final C19861p<Integer, List<ReviewUiModel>, C19394m> f20944d;

    /* renamed from: e */
    public final C8923u f20945e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9447a(View view, C19857l<? super ReviewUiModel, C19394m> lVar, C19857l<? super ReviewUiModel, C19394m> lVar2, C19861p<? super Integer, ? super List<ReviewUiModel>, C19394m> pVar, C8923u uVar) {
        super(view);
        C19383o.m32797g(uVar, "translationHelper");
        this.f20942b = lVar;
        this.f20943c = lVar2;
        this.f20944d = pVar;
        this.f20945e = uVar;
    }
}
