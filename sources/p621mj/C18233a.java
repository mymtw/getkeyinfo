package p621mj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import java.util.LinkedList;
import p621mj.C18235b;

@KeepForSdk
/* renamed from: mj.a */
public abstract class C18233a<T extends C18235b> {

    /* renamed from: b */
    public T f39975b;

    /* renamed from: c */
    public Bundle f39976c;

    /* renamed from: d */
    public LinkedList<C18234a> f39977d;

    /* renamed from: e */
    public final C18237d f39978e = new C18237d(this);

    /* renamed from: mj.a$a */
    public interface C18234a {
        int zaa();

        /* renamed from: zaa  reason: collision with other method in class */
        void m35473zaa();
    }

    @KeepForSdk
    /* renamed from: n */
    public static void m30754n(@RecentlyNonNull FrameLayout frameLayout) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        String zac = zac.zac(context, isGooglePlayServicesAvailable);
        String zae = zac.zae(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(zac);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, (String) null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(zae);
            linearLayout.addView(button);
            button.setOnClickListener(new C18240g(context, errorResolutionIntent));
        }
    }

    /* renamed from: o */
    private final void m30755o(int i) {
        while (!this.f39977d.isEmpty() && this.f39977d.getLast().zaa() >= i) {
            this.f39977d.removeLast();
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public abstract void mo51372a(@RecentlyNonNull C18237d dVar);

    @KeepForSdk
    /* renamed from: b */
    public void mo52686b(@RecentlyNonNull FrameLayout frameLayout) {
        m30754n(frameLayout);
    }

    @KeepForSdk
    /* renamed from: c */
    public final void mo69775c(@RecentlyNonNull Bundle bundle) {
        mo69786p(bundle, new C18238e(this, bundle));
    }

    @RecentlyNonNull
    @KeepForSdk
    /* renamed from: d */
    public final FrameLayout mo69776d(@RecentlyNonNull LayoutInflater layoutInflater, @RecentlyNonNull ViewGroup viewGroup, @RecentlyNonNull Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        mo69786p(bundle, new C18241h(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f39975b == null) {
            mo52686b(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    /* renamed from: e */
    public final void mo69777e() {
        T t = this.f39975b;
        if (t != null) {
            t.onDestroy();
        } else {
            m30755o(1);
        }
    }

    @KeepForSdk
    /* renamed from: f */
    public final void mo69778f() {
        T t = this.f39975b;
        if (t != null) {
            t.onDestroyView();
        } else {
            m30755o(2);
        }
    }

    @KeepForSdk
    /* renamed from: g */
    public final void mo69779g(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2) {
        mo69786p(bundle2, new C18239f(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    /* renamed from: h */
    public final void mo69780h() {
        T t = this.f39975b;
        if (t != null) {
            t.onLowMemory();
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public final void mo69781i() {
        T t = this.f39975b;
        if (t != null) {
            t.onPause();
        } else {
            m30755o(5);
        }
    }

    @KeepForSdk
    /* renamed from: j */
    public final void mo69782j() {
        mo69786p((Bundle) null, new C18242i(this));
    }

    @KeepForSdk
    /* renamed from: k */
    public final void mo69783k(@RecentlyNonNull Bundle bundle) {
        T t = this.f39975b;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f39976c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    /* renamed from: l */
    public final void mo69784l() {
        mo69786p((Bundle) null, new C18243j(this));
    }

    @KeepForSdk
    /* renamed from: m */
    public final void mo69785m() {
        T t = this.f39975b;
        if (t != null) {
            t.onStop();
        } else {
            m30755o(4);
        }
    }

    /* renamed from: p */
    public final void mo69786p(Bundle bundle, C18234a aVar) {
        if (this.f39975b != null) {
            aVar.zaa();
            return;
        }
        if (this.f39977d == null) {
            this.f39977d = new LinkedList<>();
        }
        this.f39977d.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.f39976c;
            if (bundle2 == null) {
                this.f39976c = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo51372a(this.f39978e);
    }
}
