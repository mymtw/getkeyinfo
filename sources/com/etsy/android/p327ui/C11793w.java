package com.etsy.android.p327ui;

import androidx.fragment.app.C2781q;
import androidx.fragment.app.Fragment;
import com.etsy.android.feedback.C6470o;
import com.etsy.android.feedback.ItemReviewsFragment;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.conversation.list.legacy.C9595c;
import com.etsy.android.p327ui.conversation.list.legacy.LegacyConversationListFragment;
import com.etsy.android.p327ui.home.tabs.C10059i;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.w */
public final class C11793w extends C2781q {

    /* renamed from: b */
    public final C19011a<HomePagerFragment> f26263b;

    /* renamed from: c */
    public final C19011a<LegacyConversationListFragment> f26264c;

    /* renamed from: d */
    public final C19011a<ItemReviewsFragment> f26265d;

    public C11793w(C10059i iVar, C9595c cVar, C6470o oVar) {
        C19383o.m32797g(iVar, "homePagerFragment");
        C19383o.m32797g(cVar, "legacyConversationListFragment");
        C19383o.m32797g(oVar, "itemsReviewsFragment");
        this.f26263b = iVar;
        this.f26264c = cVar;
        this.f26265d = oVar;
    }

    /* renamed from: a */
    public final Fragment mo10411a(ClassLoader classLoader, String str) {
        C19383o.m32797g(classLoader, "classLoader");
        C19383o.m32797g(str, "className");
        if (C19383o.m32792b(str, HomePagerFragment.class.getCanonicalName())) {
            HomePagerFragment homePagerFragment = this.f26263b.get();
            C19383o.m32796f(homePagerFragment, "homePagerFragment.get()");
            return homePagerFragment;
        } else if (C19383o.m32792b(str, LegacyConversationListFragment.class.getCanonicalName())) {
            LegacyConversationListFragment legacyConversationListFragment = this.f26264c.get();
            C19383o.m32796f(legacyConversationListFragment, "legacyConversationListFragment.get()");
            return legacyConversationListFragment;
        } else if (C19383o.m32792b(str, ItemReviewsFragment.class.getCanonicalName())) {
            ItemReviewsFragment itemReviewsFragment = this.f26265d.get();
            C19383o.m32796f(itemReviewsFragment, "itemsReviewsFragment.get()");
            return itemReviewsFragment;
        } else {
            C8694h a = LogCatKt.m17045a();
            a.mo21312f("Instantiating " + str + " Fragment without EtsyFragmentFactory Dagger");
            try {
                Fragment fragment = (Fragment) C2781q.m6663c(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
                C19383o.m32796f(fragment, "{\n                // tod… className)\n            }");
                return fragment;
            } catch (InstantiationException e) {
                throw new Fragment.InstantiationException(C0048b.m163a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (IllegalAccessException e2) {
                throw new Fragment.InstantiationException(C0048b.m163a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new Fragment.InstantiationException(C0048b.m163a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new Fragment.InstantiationException(C0048b.m163a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }
}
