package com.etsy.android.uikit.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseModelImageCompat;
import com.etsy.android.lib.util.C8914m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p213q2.C7717a;
import p455u9.C13448b;
import p487ya.C13895a;

/* renamed from: com.etsy.android.uikit.adapter.k */
public class C11840k<T extends BaseModelImageCompat> extends C7717a {

    /* renamed from: d */
    public WeakReference f26321d;

    /* renamed from: e */
    public ArrayList<T> f26322e;

    /* renamed from: f */
    public C11841a f26323f;

    /* renamed from: g */
    public C13895a f26324g;

    /* renamed from: h */
    public boolean f26325h;

    /* renamed from: i */
    public int f26326i;

    /* renamed from: j */
    public int f26327j;

    /* renamed from: k */
    public int f26328k = 0;

    /* renamed from: com.etsy.android.uikit.adapter.k$a */
    public interface C11841a {
        /* renamed from: a */
        void mo34360a(int i) {
        }

        /* renamed from: b */
        void mo34361b(int i);

        /* renamed from: c */
        void mo34362c(Boolean bool);

        /* renamed from: d */
        void mo34363d();

        /* renamed from: e */
        void mo34364e(int i);
    }

    public C11840k(Activity activity, C13895a aVar) {
        this.f26321d = new WeakReference(activity);
        this.f26322e = new ArrayList<>();
        this.f26324g = aVar;
        this.f26325h = false;
    }

    /* renamed from: h */
    public void mo10623h(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: j */
    public int mo20184j() {
        return this.f26322e.size();
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: n */
    public Object mo10625n(ViewGroup viewGroup, int i) {
        return mo38318z(viewGroup, i);
    }

    /* renamed from: o */
    public final boolean mo10626o(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: u */
    public final void mo38313u(int i, View view) {
        view.setOnTouchListener(new C11835f(0, new GestureDetector((Context) this.f26321d.get(), new C11838i()), new ScaleGestureDetector((Context) this.f26321d.get(), new C11839j(this, i))));
    }

    /* renamed from: v */
    public String mo38314v(T t) {
        int i = this.f26326i;
        return i > 0 ? t.getImageUrlForPixelWidth(i) : t.getImageUrl();
    }

    /* renamed from: w */
    public ImageView mo38315w(int i, View view) {
        return (ImageView) view.findViewById(R.id.image);
    }

    /* renamed from: x */
    public View mo38316x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.imageview_loading, viewGroup, false);
    }

    /* renamed from: y */
    public int mo38317y(T t) {
        return t.getImageColor();
    }

    /* renamed from: z */
    public final View mo38318z(ViewGroup viewGroup, int i) {
        int i2 = 0;
        boolean z = this.f26325h && i == 0;
        View x = mo38316x(LayoutInflater.from((Context) this.f26321d.get()), viewGroup);
        x.setOnClickListener(new C11836g(this, i));
        mo38313u(i, x);
        View findViewById = x.findViewById(R.id.activity_indicator);
        ImageView w = mo38315w(i, x);
        View findViewById2 = x.findViewById(R.id.play_video_icon);
        if (findViewById2 != null) {
            if (!z) {
                i2 = 8;
            }
            findViewById2.setVisibility(i2);
        }
        if (z) {
            w.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        BaseModelImageCompat baseModelImageCompat = (BaseModelImageCompat) this.f26322e.get(i);
        String v = mo38314v(baseModelImageCompat);
        this.f26324g.getClass();
        if (C13895a.m21420c(v)) {
            C13448b g0 = C0114h.m272C0(w).load(v).mo17160t(new ColorDrawable(mo38317y(baseModelImageCompat))).mo16818O(new C11837h(findViewById));
            if (this.f26326i > 0 && this.f26327j > 0) {
                int i3 = C8914m.m17347e(w.getContext()) ? this.f26327j : this.f26326i;
                C13448b bVar = (C13448b) g0.mo17158r(i3, i3);
            }
            g0.mo16816M(w);
        } else {
            findViewById.setVisibility(8);
        }
        viewGroup.addView(x);
        return x;
    }
}
