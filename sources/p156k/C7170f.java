package p156k;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;

/* renamed from: k.f */
public final /* synthetic */ class C7170f implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ CustomTabsService.C0366a f15941a;

    /* renamed from: b */
    public final /* synthetic */ C7172h f15942b;

    public /* synthetic */ C7170f(CustomTabsService.C0366a aVar, C7172h hVar) {
        this.f15941a = aVar;
        this.f15942b = hVar;
    }

    public final void binderDied() {
        CustomTabsService.C0366a aVar = this.f15941a;
        CustomTabsService.this.cleanUpSession(this.f15942b);
    }
}
