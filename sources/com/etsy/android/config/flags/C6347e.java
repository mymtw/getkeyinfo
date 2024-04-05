package com.etsy.android.config.flags;

import android.app.NotificationManager;
import android.content.Context;
import androidx.compose.foundation.layout.C0761x;
import androidx.room.C3259y;
import com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher;
import com.etsy.android.lib.logger.perf.C8704a;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.persistviewed.PersistViewedRoomDatabase;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.p327ui.util.C11781i;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p040c9.C4479c;
import p405nc.C13110a;
import p453tf.C13423m;
import p458uc.C13467b;
import p459ud.C13486i;
import p514bk.C14088a;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.config.flags.e */
public final class C6347e implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f14141a;

    /* renamed from: b */
    public final C19011a f14142b;

    /* renamed from: c */
    public final Object f14143c;

    public /* synthetic */ C6347e(Object obj, C19011a aVar, int i) {
        this.f14141a = i;
        this.f14143c = obj;
        this.f14142b = aVar;
    }

    public final Object get() {
        switch (this.f14141a) {
            case 0:
                ConfigFlagsFragment configFlagsFragment = (ConfigFlagsFragment) this.f14142b.get();
                ((C19388s) this.f14143c).getClass();
                C19383o.m32797g(configFlagsFragment, "configFlagsFragment");
                ConfigFlagsEventDispatcher configFlagsEventDispatcher = configFlagsFragment.getViewModel().f14130c;
                C17782b.m29841G(configFlagsEventDispatcher);
                return configFlagsEventDispatcher;
            case 1:
                ((C4479c) this.f14143c).getClass();
                NotificationManager notificationManager = (NotificationManager) ((Context) this.f14142b.get()).getSystemService(NotificationManager.class);
                C17782b.m29841G(notificationManager);
                return notificationManager;
            case 2:
                Context context = (Context) this.f14142b.get();
                ((C19382n) this.f14143c).getClass();
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
                return C3259y.m7913a(context.getApplicationContext(), PersistViewedRoomDatabase.class, "persistViewed").mo11987b();
            case 3:
                C8731g gVar = (C8731g) this.f14142b.get();
                ((C13423m) this.f14143c).getClass();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(C13467b.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…laimEndpoint::class.java)");
                return (C13467b) b;
            case 4:
                ListingFragment listingFragment = (ListingFragment) this.f14142b.get();
                ((C14088a) this.f14143c).getClass();
                C19383o.m32797g(listingFragment, "listingFragment");
                C8704a aVar = listingFragment.getViewModel().f22224e;
                C17782b.m29841G(aVar);
                return aVar;
            case 5:
                C8731g gVar2 = (C8731g) this.f14142b.get();
                ((C13110a) this.f14143c).getClass();
                C19383o.m32797g(gVar2, "configuredRetrofit");
                Object b2 = gVar2.f19177a.mo74387b(C13486i.class);
                C19383o.m32796f(b2, "configuredRetrofit.v3mos…ingsEndpoint::class.java)");
                return (C13486i) b2;
            default:
                C8731g gVar3 = (C8731g) this.f14142b.get();
                ((C0761x) this.f14143c).getClass();
                C19383o.m32797g(gVar3, "configuredV3MoshiRetrofit");
                Object b3 = gVar3.f19177a.mo74387b(C11781i.class);
                C19383o.m32796f(b3, "configuredV3MoshiRetrofi…uestEndpoint::class.java)");
                return (C11781i) b3;
        }
    }
}
