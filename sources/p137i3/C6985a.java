package p137i3;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import p149j3.C7107h;
import p206p3.C7656b;

/* renamed from: i3.a */
public final class C6985a {

    /* renamed from: a */
    public final C7107h f15475a = new C7107h();

    /* renamed from: b */
    public final HashMap f15476b = new HashMap();

    /* renamed from: c */
    public final HashMap f15477c = new HashMap();

    /* renamed from: d */
    public final AssetManager f15478d;

    /* renamed from: e */
    public String f15479e = ".ttf";

    public C6985a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            C7656b.m14695b("LottieDrawable must be inside of a view for images to work.");
            this.f15478d = null;
            return;
        }
        this.f15478d = ((View) callback).getContext().getAssets();
    }
}
