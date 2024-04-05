package p591im;

import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.selfuser.C8851b;
import com.etsy.android.p327ui.navigation.bottom.C10680b;
import com.etsy.android.p327ui.user.addresses.C11463z;
import com.etsy.android.p327ui.you.C11800a;
import com.etsy.android.uikit.util.C11908l;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p287xp.C8339g;
import p649pm.C18400e;
import p649pm.C18415r;

/* renamed from: im.b */
public final /* synthetic */ class C17868b implements C18400e, C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f38793b;

    public /* synthetic */ C17868b(int i) {
        this.f38793b = i;
    }

    public Object apply(Object obj) {
        switch (this.f38793b) {
            case 0:
                return Boolean.valueOf(!((C8618c) obj).mo21132b(C8592b.C8595c.f18859c));
            case 1:
                return C8851b.m17248a((Throwable) obj);
            case 2:
                C11800a aVar = (C11800a) obj;
                C19383o.m32797g(aVar, "it");
                return new C10680b(R.id.menu_bottom_nav_you, aVar, "menu_bottom_nav_you");
            case 3:
                List list = (List) obj;
                C19383o.m32797g(list, "it");
                return new C11463z.C11471h(list);
            default:
                C11908l lVar = (C11908l) obj;
                C19383o.m32797g(lVar, "it");
                return Boolean.valueOf(lVar.f26468a);
        }
    }

    /* renamed from: f */
    public Object mo56f(C18415r rVar) {
        switch (this.f38793b) {
            case 0:
                return AbtRegistrar.lambda$getComponents$0(rVar);
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(rVar);
        }
    }
}
