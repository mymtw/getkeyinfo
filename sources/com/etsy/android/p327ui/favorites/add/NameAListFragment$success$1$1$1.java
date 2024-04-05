package com.etsy.android.p327ui.favorites.add;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.FavoritesTabKey;
import java.lang.ref.WeakReference;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.NameAListFragment$success$1$1$1 */
public final class NameAListFragment$success$1$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ WeakReference<FragmentActivity> $activityWeakRef;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListFragment$success$1$1$1(WeakReference<FragmentActivity> weakReference) {
        super(1);
        this.$activityWeakRef = weakReference;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19383o.m32797g(view, "it");
        C12788a.m20424c(this.$activityWeakRef.get(), new FavoritesTabKey(C19421p.m32935c0(this.$activityWeakRef.get()), (String) null, (String) null, 0, false, (Bundle) null, 54, (DefaultConstructorMarker) null));
    }
}
