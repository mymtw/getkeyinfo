package com.etsy.android.shophome;

import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import com.etsy.android.p327ui.user.inappnotifications.UpdatesFeed;
import com.etsy.android.shophome.C8994h;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p287xp.C8339g;
import p514bk.C14088a;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.shophome.g */
public final /* synthetic */ class C8993g implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19850b;

    public /* synthetic */ C8993g(int i) {
        this.f19850b = i;
    }

    public final Object apply(Object obj) {
        List<CheckableListingCollection> list;
        switch (this.f19850b) {
            case 0:
                Throwable th = (Throwable) obj;
                C19383o.m32797g(th, "it");
                return new C8994h.C8995a.C8996a(th);
            case 1:
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(vVar, "it");
                C19928a0 a0Var = (C19928a0) vVar.f44615b;
                if (a0Var == null || (list = MoshiModelFactory.createListFromByteArray(a0Var.mo72841a(), CheckableListingCollection.class)) == null) {
                    list = EmptyList.INSTANCE;
                }
                return C19327t.m32661q1(list);
            default:
                UpdatesFeed updatesFeed = (UpdatesFeed) obj;
                C19383o.m32797g(updatesFeed, "it");
                return C14088a.m21782g(updatesFeed);
        }
    }
}
