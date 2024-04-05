package com.etsy.android.p327ui.singleactivity;

import android.support.p013v4.media.C0070b;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.C2751c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.zhuinden.simplestack.C17527e;
import com.zhuinden.simplestack.C17531h;
import com.zhuinden.simplestack.C17545o;
import com.zhuinden.simplestack.C17546p;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p356ge.C12790b;

/* renamed from: com.etsy.android.ui.singleactivity.c */
public final class C11318c implements C17546p {

    /* renamed from: a */
    public final int f24977a = R.id.nav_content_frame;

    /* renamed from: b */
    public final int f24978b = R.id.root_container;

    /* renamed from: c */
    public final FragmentManager f24979c;

    /* renamed from: d */
    public final C11319a f24980d;

    /* renamed from: e */
    public final C8618c f24981e;

    /* renamed from: com.etsy.android.ui.singleactivity.c$a */
    public interface C11319a {
        /* renamed from: a */
        void mo37048a();

        /* renamed from: b */
        void mo37049b();
    }

    public C11318c(FragmentManager fragmentManager, C11316a aVar, C8618c cVar) {
        C19383o.m32797g(cVar, "etsyConfigMap");
        this.f24979c = fragmentManager;
        this.f24980d = aVar;
        this.f24981e = cVar;
    }

    /* renamed from: a */
    public final void mo37061a(C17545o oVar, C17531h hVar) {
        Object obj;
        Fragment fragment;
        int i;
        int i2;
        boolean z;
        C17545o oVar2 = oVar;
        List<Object> list = oVar2.f38379b;
        Object obj2 = list.get(list.size() - 1);
        Object obj3 = null;
        if (oVar2.f38378a.size() > 0) {
            List<Object> list2 = oVar2.f38378a;
            obj = list2.get(list2.size() - 1);
        } else {
            obj = null;
        }
        if (obj2.equals(obj)) {
            C11319a aVar = this.f24980d;
            if (aVar != null) {
                aVar.mo37048a();
            }
            hVar.mo68746a();
            C11319a aVar2 = this.f24980d;
            if (aVar2 != null) {
                aVar2.mo37049b();
                return;
            }
            return;
        }
        C17527e a = C17545o.m29420a(oVar2.f38378a);
        C17527e a2 = C17545o.m29420a(oVar2.f38379b);
        FragmentManager fragmentManager = this.f24979c;
        C2740a c = C0070b.m182c(fragmentManager, fragmentManager);
        List<Fragment> H = this.f24979c.mo10358H();
        C19383o.m32796f(H, "fragmentManager.fragments");
        int size = H.size() - 1;
        while (true) {
            if (-1 < size) {
                fragment = H.get(size);
                if (fragment != null && fragment.getId() == this.f24977a && fragment.isAdded() && fragment.getView() != null && !fragment.isDetached() && !fragment.isHidden()) {
                    break;
                }
                size--;
            } else {
                fragment = null;
                break;
            }
        }
        if (fragment != null) {
            Iterator it = a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (fragment == this.f24979c.mo10353C(((MultistackFragmentKey) it.next()).getFragmentTag())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                Iterator it2 = a2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (fragment == this.f24979c.mo10353C(((MultistackFragmentKey) it2.next()).getFragmentTag())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z) {
                c.mo10484f(fragment);
            }
        }
        if (oVar2.f38378a.size() > 0) {
            List<Object> list3 = oVar2.f38378a;
            obj3 = list3.get(list3.size() - 1);
        }
        MultistackFragmentKey multistackFragmentKey = (MultistackFragmentKey) obj3;
        MultistackFragmentKey multistackFragmentKey2 = (MultistackFragmentKey) C19327t.m32646b1(a2);
        boolean isDialog = multistackFragmentKey2 != null ? multistackFragmentKey2.isDialog() : false;
        boolean isDialog2 = multistackFragmentKey != null ? multistackFragmentKey.isDialog() : false;
        Iterator it3 = a.iterator();
        while (it3.hasNext()) {
            MultistackFragmentKey multistackFragmentKey3 = (MultistackFragmentKey) it3.next();
            Fragment C = this.f24979c.mo10353C(multistackFragmentKey3.getFragmentTag());
            if (C != null) {
                if (!a2.contains(multistackFragmentKey3)) {
                    c.mo10490n(C);
                } else if (!C.isDetached() && !isDialog && !isDialog2) {
                    c.mo10484f(C);
                }
            }
        }
        Iterator it4 = a2.iterator();
        while (it4.hasNext()) {
            MultistackFragmentKey multistackFragmentKey4 = (MultistackFragmentKey) it4.next();
            int i3 = multistackFragmentKey4.isDialog() ? this.f24978b : this.f24977a;
            Fragment C2 = this.f24979c.mo10353C(multistackFragmentKey4.getFragmentTag());
            List<Object> list4 = oVar2.f38379b;
            if (C19383o.m32792b(multistackFragmentKey4, list4.get(list4.size() - 1))) {
                if (!(C2 != null && C2.isHidden())) {
                    if (!(C2 != null && C2.isDetached()) && (C2 == null || !isDialog2)) {
                        c.mo10531h(i3, multistackFragmentKey4.newFragment(this.f24979c, multistackFragmentKey4.getArguments(), this.f24981e.mo21132b(C8592b.f18795h0)), multistackFragmentKey4.getFragmentTag());
                    }
                }
                if (C2.isDetached()) {
                    c.mo10528b(new C2751c0.C2752a(C2, 7));
                }
            } else if (!isDialog && !isDialog2) {
                if (C2 != null && !C2.isDetached()) {
                    c.mo10484f(C2);
                }
            }
        }
        int i4 = oVar2.f38380c;
        if (i4 == -1) {
            if (multistackFragmentKey != null) {
                i = multistackFragmentKey.animationModeOrdinal();
            } else {
                MultistackFragmentKey.Companion.getClass();
                i = MultistackFragmentKey.DEFAULT_ANIMATION_ORDINAL;
            }
            C12790b.m20429a(c, FragmentAnimationMode.values()[i]);
        } else if (i4 == 0) {
            c.f6251h = 4099;
        } else if (i4 == 1) {
            if (multistackFragmentKey2 != null) {
                i2 = multistackFragmentKey2.animationModeOrdinal();
            } else {
                MultistackFragmentKey.Companion.getClass();
                i2 = MultistackFragmentKey.DEFAULT_ANIMATION_ORDINAL;
            }
            C12790b.m20429a(c, FragmentAnimationMode.values()[i2]);
        }
        c.mo10487k();
        hVar.mo68746a();
        C11319a aVar3 = this.f24980d;
        if (aVar3 != null) {
            aVar3.mo37049b();
        }
    }
}
