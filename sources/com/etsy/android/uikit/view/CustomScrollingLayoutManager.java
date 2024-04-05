package com.etsy.android.uikit.view;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;

public final class CustomScrollingLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public final Context f26477E;

    /* renamed from: F */
    public final int f26478F;

    public CustomScrollingLayoutManager(int i, Context context) {
        super(0, false);
        this.f26477E = context;
        this.f26478F = i;
    }

    /* renamed from: E0 */
    public final void mo11270E0(RecyclerView recyclerView, int i) {
        C11928b bVar = new C11928b(this, this.f26477E);
        bVar.f7107a = i;
        mo11650F0(bVar);
    }

    /* renamed from: c1 */
    public final int mo11295c1(RecyclerView.C3117y yVar) {
        C19383o.m32797g(yVar, "state");
        return this.f26478F;
    }
}
