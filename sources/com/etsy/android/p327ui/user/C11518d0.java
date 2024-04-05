package com.etsy.android.p327ui.user;

import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.push.registration.C8837j;
import java.util.List;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.subjects.C19254a;
import p410oa.C13144d;
import p425q9.C13265p;
import p496za.C13943a;

/* renamed from: com.etsy.android.ui.user.d0 */
public final class C11518d0 extends C2866i0 {

    /* renamed from: b */
    public final C13265p f25407b;

    /* renamed from: c */
    public final C8618c f25408c;

    /* renamed from: d */
    public final C8837j f25409d;

    /* renamed from: e */
    public final C13144d f25410e;

    /* renamed from: f */
    public final C11613o f25411f;

    /* renamed from: g */
    public final C19254a<List<C11489b0>> f25412g = new C19254a<>();

    /* renamed from: h */
    public final C7091a f25413h = new C7091a();

    /* renamed from: com.etsy.android.ui.user.d0$a */
    public /* synthetic */ class C11519a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25414a;

        static {
            int[] iArr = new int[SettingType.values().length];
            iArr[SettingType.SelectCurrency.ordinal()] = 1;
            iArr[SettingType.About.ordinal()] = 2;
            iArr[SettingType.DarkMode.ordinal()] = 3;
            iArr[SettingType.Privacy.ordinal()] = 4;
            iArr[SettingType.ManageAddresses.ordinal()] = 5;
            iArr[SettingType.SelectLanguage.ordinal()] = 6;
            iArr[SettingType.Phablets.ordinal()] = 7;
            iArr[SettingType.VespaDemo.ordinal()] = 8;
            iArr[SettingType.VespaExploreDemo.ordinal()] = 9;
            iArr[SettingType.CustomViewDemo.ordinal()] = 10;
            iArr[SettingType.PushNotifications.ordinal()] = 11;
            iArr[SettingType.PushNotificationFixer.ordinal()] = 12;
            f25414a = iArr;
        }
    }

    public C11518d0(C13265p pVar, C8618c cVar, C8837j jVar, C13144d dVar, C13943a aVar, C11613o oVar) {
        this.f25407b = pVar;
        this.f25408c = cVar;
        this.f25409d = jVar;
        this.f25410e = dVar;
        this.f25411f = oVar;
    }

    public final void onCleared() {
        this.f25413h.mo19405d();
        super.onCleared();
    }
}
