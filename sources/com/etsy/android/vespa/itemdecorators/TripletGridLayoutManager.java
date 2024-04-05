package com.etsy.android.vespa.itemdecorators;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p431qf.C13328c;

public final class TripletGridLayoutManager extends GridLayoutManager {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TripletGridLayoutManager(FragmentActivity fragmentActivity) {
        super(2, 0);
        C19383o.m32797g(fragmentActivity, ResponseConstants.CONTEXT);
        this.f7008K = new C13328c();
    }
}
