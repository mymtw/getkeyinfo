package com.etsy.android.p327ui.singleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import com.etsy.android.p327ui.favorites.FavoritesTabsContainerFragment;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.DeeplinkNavigationKey;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.singleactivity.C11318c;
import com.etsy.android.p327ui.user.inappnotifications.C11541a0;
import com.etsy.android.p327ui.user.inappnotifications.InAppNotificationsFragment;
import com.etsy.android.p327ui.you.YouFragment;
import com.etsy.android.uikit.util.C11906j;
import com.zhuinden.simplestack.C17518a;
import com.zhuinden.simplestack.C17527e;
import com.zhuinden.simplestack.C17532i;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.C7091a;
import p310ae.C8510a;
import p310ae.C8511b;
import p310ae.C8512c;
import p323ce.C8583b;
import p346fa.C12703a;
import p357gf.C12794c;
import p456ua.C13461f;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.singleactivity.a */
public final class C11316a implements C11323g, C11318c.C11319a {

    /* renamed from: b */
    public final BOEActivity f24964b;

    /* renamed from: c */
    public final C13461f f24965c;

    /* renamed from: d */
    public final BottomNavStateRepo f24966d;

    /* renamed from: e */
    public final C8511b f24967e;

    /* renamed from: f */
    public final C8618c f24968f;

    /* renamed from: g */
    public final C11320d f24969g;

    /* renamed from: h */
    public final C11541a0 f24970h;

    /* renamed from: i */
    public C11317b f24971i;

    /* renamed from: j */
    public final C7091a f24972j = new C7091a();

    /* renamed from: k */
    public C11318c f24973k;

    public C11316a(BOEActivity bOEActivity, C13461f fVar, BottomNavStateRepo bottomNavStateRepo, C8510a aVar, C8618c cVar, C12703a aVar2, C11320d dVar, C11541a0 a0Var) {
        C19383o.m32797g(bOEActivity, "activity");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(bottomNavStateRepo, "bottomNavStateRepo");
        C19383o.m32797g(cVar, "etsyConfigMap");
        C19383o.m32797g(aVar2, "grafana");
        C19383o.m32797g(dVar, "multistackPrefs");
        C19383o.m32797g(a0Var, "nativeUpdates");
        this.f24964b = bOEActivity;
        this.f24965c = fVar;
        this.f24966d = bottomNavStateRepo;
        this.f24967e = aVar;
        this.f24968f = cVar;
        this.f24969g = dVar;
        this.f24970h = a0Var;
    }

    /* renamed from: a */
    public final void mo37048a() {
        C12794c a = C11906j.m19625a(this.f24964b.getSupportFragmentManager());
        if (a instanceof C11321e) {
            ((C11321e) a).scrollToTop();
        }
        if (a instanceof C11322f) {
            C11322f fVar = (C11322f) a;
            if (fVar.canFocusedScreenScrollUp()) {
                fVar.scrollFocusedScreenToTop();
            } else {
                fVar.focusMainScreen();
            }
        }
    }

    /* renamed from: b */
    public final void mo37049b() {
    }

    /* renamed from: c */
    public final void mo37050c(FragmentNavigationKey fragmentNavigationKey) {
        boolean z;
        Object obj;
        C17518a d = mo37051d().mo37058d();
        d.mo68699d("A backstack must be set up before getting keys from it.");
        C17532i iVar = d.f38326h;
        iVar.getClass();
        ArrayList arrayList = new ArrayList(iVar.f38343b.size());
        for (Object add : iVar.f38343b) {
            arrayList.add(add);
        }
        GenericKey genericKey = new GenericKey(fragmentNavigationKey.getClazzName(), ((MultistackFragmentKey) C19327t.m32638T0(C17527e.m29386a(arrayList).mo68743a())).stackIdentifier(), fragmentNavigationKey.getNavigationParams().mo45608a(), fragmentNavigationKey.isDialog(), fragmentNavigationKey.getAnimationType().ordinal());
        int i = 1;
        if (fragmentNavigationKey.shouldReplaceTop()) {
            d.mo68699d("A backstack must be set up before navigation.");
            C17532i iVar2 = d.f38326h;
            iVar2.getClass();
            iVar2.mo68747a();
            C17527e.C17528a a = C17527e.m29386a(iVar2.mo68751e());
            if (!a.f38338b.isEmpty()) {
                a.mo68744c();
            }
            a.f38338b.add(genericKey);
            iVar2.mo68750d(a.mo68743a(), 0, true, false);
            return;
        }
        d.mo68699d("A backstack must be set up before navigation.");
        C17532i iVar3 = d.f38326h;
        iVar3.getClass();
        iVar3.mo68747a();
        C17527e.C17528a a2 = C17527e.m29386a(iVar3.mo68751e());
        if (a2.f38338b.contains(genericKey)) {
            while (!a2.f38338b.isEmpty()) {
                if (a2.f38338b.isEmpty()) {
                    obj = null;
                } else {
                    ArrayList<Object> arrayList2 = a2.f38338b;
                    obj = arrayList2.get(arrayList2.size() - 1);
                }
                if (obj.equals(genericKey)) {
                    break;
                }
                a2.mo68744c();
            }
            if (!a2.f38338b.isEmpty()) {
                z = true;
                i = -1;
            } else {
                throw new IllegalArgumentException("[" + genericKey + "] was not found in history!");
            }
        } else {
            a2.f38338b.add(genericKey);
            z = false;
        }
        iVar3.mo68750d(a2.mo68743a(), i, z, false);
    }

    /* renamed from: d */
    public final C11317b mo37051d() {
        C11317b bVar = this.f24971i;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("multistack");
        throw null;
    }

    /* renamed from: e */
    public final void mo37052e(DeeplinkNavigationKey deeplinkNavigationKey) {
        MultistackFragmentKey multistackFragmentKey;
        Iterable<FragmentNavigationKey> iterable;
        if (deeplinkNavigationKey.getBackstack().f18678b.size() > 1) {
            C8583b backstack = deeplinkNavigationKey.getBackstack();
            int i = backstack.f18679c;
            if (!backstack.f18678b.isEmpty()) {
                FragmentNavigationKey fragmentNavigationKey = backstack.f18678b.get(0);
                C19383o.m32796f(fragmentNavigationKey, "stack[0]");
                String clazzName = fragmentNavigationKey.getClazzName();
                if (C19383o.m32792b(clazzName, HomePagerFragment.class.getCanonicalName())) {
                    multistackFragmentKey = new HomeKey((Bundle) null, (String) null, 3, (DefaultConstructorMarker) null);
                } else if (C19383o.m32792b(clazzName, FavoritesTabsContainerFragment.class.getCanonicalName())) {
                    multistackFragmentKey = new FavoritesKey((String) null, 1, (DefaultConstructorMarker) null);
                } else if (C19383o.m32792b(clazzName, InAppNotificationsFragment.class.getCanonicalName())) {
                    multistackFragmentKey = new InAppNotificationsKey((String) null, 1, (DefaultConstructorMarker) null);
                } else if (C19383o.m32792b(clazzName, YouFragment.class.getCanonicalName())) {
                    multistackFragmentKey = new YouKey((String) null, 1, (DefaultConstructorMarker) null);
                } else if (C19383o.m32792b(clazzName, CartWithSavedFragment.class.getCanonicalName())) {
                    multistackFragmentKey = new CartKey((String) null, 1, (DefaultConstructorMarker) null);
                } else {
                    throw new IllegalArgumentException(C0326j.m864i("No tab key found for ", clazzName));
                }
                C11317b d = mo37051d();
                String stackIdentifier = multistackFragmentKey.stackIdentifier();
                C19383o.m32797g(stackIdentifier, "identifier");
                C17518a aVar = d.f24974a.get(stackIdentifier);
                C19383o.m32794d(aVar);
                C17518a aVar2 = aVar;
                this.f24966d.mo34415a(i, false);
                ArrayList<FragmentNavigationKey> arrayList = deeplinkNavigationKey.getBackstack().f18678b;
                List d0 = C17782b.m29864d0(multistackFragmentKey);
                C19383o.m32797g(arrayList, "<this>");
                int size = arrayList.size() - 1;
                if (size <= 0) {
                    iterable = EmptyList.INSTANCE;
                } else if (size == 1) {
                    iterable = C17782b.m29864d0(C19327t.m32645a1(arrayList));
                } else {
                    ArrayList arrayList2 = new ArrayList(size);
                    int size2 = arrayList.size();
                    for (int i2 = 1; i2 < size2; i2++) {
                        arrayList2.add(arrayList.get(i2));
                    }
                    iterable = arrayList2;
                }
                ArrayList arrayList3 = new ArrayList(C19322o.m32624F0(iterable));
                for (FragmentNavigationKey fragmentNavigationKey2 : iterable) {
                    Bundle a = fragmentNavigationKey2.getNavigationParams().mo45608a();
                    a.setClassLoader(fragmentNavigationKey2.getClazzName().getClass().getClassLoader());
                    arrayList3.add(new GenericKey(fragmentNavigationKey2.getClazzName(), multistackFragmentKey.stackIdentifier(), a, fragmentNavigationKey2.isDialog(), fragmentNavigationKey2.getAnimationType().ordinal()));
                }
                ArrayList f1 = C19327t.m32650f1(arrayList3, d0);
                aVar2.mo68699d("A backstack must be set up before navigation.");
                C17532i iVar = aVar2.f38326h;
                iVar.getClass();
                if (!f1.isEmpty()) {
                    iVar.mo68747a();
                    iVar.mo68750d(f1, 0, false, true);
                    return;
                }
                throw new IllegalArgumentException("New history cannot be null or empty");
            }
            StringBuilder h = C0072d.m201h("No stack has been generated for ");
            h.append(backstack.f18677a);
            throw new UnsupportedNavigationException(h.toString());
        }
        mo37053f(deeplinkNavigationKey.getDestinationKey());
    }

    /* renamed from: f */
    public final void mo37053f(FragmentNavigationKey fragmentNavigationKey) {
        Integer num;
        String clazzName = fragmentNavigationKey.getClazzName();
        if (C19383o.m32792b(clazzName, HomePagerFragment.class.getCanonicalName())) {
            num = Integer.valueOf(R.id.menu_bottom_nav_home);
        } else if (C19383o.m32792b(clazzName, FavoritesTabsContainerFragment.class.getCanonicalName())) {
            num = Integer.valueOf(R.id.menu_bottom_nav_favorites);
        } else {
            if (C19383o.m32792b(clazzName, InAppNotificationsFragment.class.getCanonicalName())) {
                if (!this.f24970h.mo37551a()) {
                    num = Integer.valueOf(R.id.menu_bottom_nav_updates);
                }
            } else if (C19383o.m32792b(clazzName, YouFragment.class.getCanonicalName())) {
                num = Integer.valueOf(R.id.menu_bottom_nav_you);
            } else if (C19383o.m32792b(clazzName, CartWithSavedFragment.class.getCanonicalName())) {
                num = Integer.valueOf(R.id.menu_bottom_nav_cart);
            }
            num = null;
        }
        if (num == null) {
            mo37050c(fragmentNavigationKey);
        } else if (fragmentNavigationKey.isForciblyAddedToCurrentStack()) {
            mo37050c(fragmentNavigationKey);
        } else {
            this.f24966d.mo34415a(num.intValue(), fragmentNavigationKey.getClearBackstack());
        }
    }

    /* renamed from: g */
    public final void mo37054g(Intent intent, boolean z) {
        C11320d dVar = this.f24969g;
        dVar.getClass();
        C19383o.m32797g(intent, "intent");
        if (dVar.f24983b.mo21132b(C8592b.f18798i0)) {
            Bundle extras = intent.getExtras();
            String str = "keys:";
            if ((extras != null ? extras.keySet() : null) != null) {
                for (String next : extras.keySet()) {
                    str = str + ' ' + next + ": " + extras.get(next);
                }
            }
            dVar.f24984c.getClass();
            String str2 = "NAV_INFO: " + System.currentTimeMillis() + " intent(isnew = " + z + ") " + intent.toUri(0) + ' ' + str;
            LogCatKt.m17045a().mo21310e(str2);
            dVar.mo37062a(str2);
        }
        if (intent.hasExtra("deep_link_key_param")) {
            DeeplinkNavigationKey deeplinkNavigationKey = (DeeplinkNavigationKey) intent.getParcelableExtra("deep_link_key_param");
            if (deeplinkNavigationKey != null) {
                mo37052e(deeplinkNavigationKey);
                return;
            }
            throw new UnsupportedNavigationException("DeeplinkNavigationKey not provided as Intent Extra");
        } else if (intent.hasExtra("fragment_key_param")) {
            FragmentNavigationKey fragmentNavigationKey = (FragmentNavigationKey) intent.getParcelableExtra("fragment_key_param");
            if (fragmentNavigationKey != null) {
                mo37053f(fragmentNavigationKey);
                return;
            }
            throw new UnsupportedNavigationException("ActivityNavigationKey not provided as Intent Extra");
        } else {
            mo37053f(new HomePagerKey(C19421p.m32935c0(this.f24964b), (Bundle) null, false, 6, (DefaultConstructorMarker) null));
        }
    }

    public final void popBackstack() {
        Object obj;
        if (!mo37051d().mo37058d().mo68704i()) {
            List<StackType> list = ((C8510a) this.f24967e).f18527a;
            if (list.size() == 0 || (list.size() == 1 && C19327t.m32638T0(list) == StackType.HOME)) {
                obj = C8512c.C8513a.f18528a;
            } else if (list.size() == 1) {
                list.clear();
                StackType stackType = StackType.HOME;
                list.add(stackType);
                obj = new C8512c.C8514b(stackType.getBottomNavItemId());
            } else {
                list.remove(C17782b.m29859Y(list));
                obj = new C8512c.C8514b(((StackType) C19327t.m32645a1(list)).getBottomNavItemId());
            }
            if (C19383o.m32792b(obj, C8512c.C8513a.f18528a)) {
                this.f24964b.finish();
            } else if (obj instanceof C8512c.C8514b) {
                this.f24966d.mo34415a(((C8512c.C8514b) obj).f18529a, false);
            }
        }
    }
}
