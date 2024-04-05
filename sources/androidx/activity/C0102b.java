package androidx.activity;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.savedstate.C3265b;

/* renamed from: androidx.activity.b */
public final /* synthetic */ class C0102b implements C3265b.C3267b {

    /* renamed from: a */
    public final /* synthetic */ int f148a;

    /* renamed from: b */
    public final /* synthetic */ Object f149b;

    public /* synthetic */ C0102b(Object obj, int i) {
        this.f148a = i;
        this.f149b = obj;
    }

    /* renamed from: a */
    public final Bundle mo1115a() {
        switch (this.f148a) {
            case 0:
                return ((ComponentActivity) this.f149b).lambda$new$0();
            default:
                FragmentManager fragmentManager = (FragmentManager) this.f149b;
                fragmentManager.getClass();
                Bundle bundle = new Bundle();
                Parcelable W = fragmentManager.mo10370W();
                if (W != null) {
                    bundle.putParcelable("android:support:fragments", W);
                }
                return bundle;
        }
    }
}
