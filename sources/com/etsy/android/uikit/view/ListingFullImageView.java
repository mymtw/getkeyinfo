package com.etsy.android.uikit.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.C0114h;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.C6127f;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p302z4.C8448i;
import p455u9.C13448b;
import p504ai.C13983i;

public final class ListingFullImageView extends FullImageView {
    public static final int $stable = 8;
    public static final float ASPECT_RATIO_SQUARE = 1.0f;
    public static final float ASPECT_RATIO_STANDARD = 0.75f;
    public static final C11920a Companion = new C11920a();
    public Map<Integer, View> _$_findViewCache;
    private C11929c imageViewTransformation;
    /* access modifiers changed from: private */
    public boolean isLoaded;
    /* access modifiers changed from: private */
    public C11950e loadListener;
    private boolean loadProgressiveJpegs;
    private final C11921b requestListener;

    /* renamed from: com.etsy.android.uikit.view.ListingFullImageView$a */
    public static final class C11920a {
    }

    /* renamed from: com.etsy.android.uikit.view.ListingFullImageView$b */
    public static final class C11921b implements C6127f<Drawable> {

        /* renamed from: b */
        public final /* synthetic */ ListingFullImageView f26486b;

        public C11921b(ListingFullImageView listingFullImageView) {
            this.f26486b = listingFullImageView;
        }

        /* renamed from: f */
        public final boolean mo17169f(GlideException glideException, Object obj, C8448i iVar) {
            C11950e access$getLoadListener$p = this.f26486b.loadListener;
            if (access$getLoadListener$p == null) {
                return false;
            }
            access$getLoadListener$p.onFailed();
            return false;
        }

        /* renamed from: h */
        public final boolean mo17172h(Object obj, Object obj2, C8448i iVar, DataSource dataSource) {
            Drawable drawable = (Drawable) obj;
            C11950e access$getLoadListener$p = this.f26486b.loadListener;
            if (access$getLoadListener$p != null) {
                access$getLoadListener$p.mo38325b();
            }
            this.f26486b.isLoaded = true;
            return false;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListingFullImageView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListingFullImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingFullImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        this.requestListener = new C11921b(this);
    }

    private final void load(String str) {
        C13448b g0 = C0114h.m270B0(getContext()).load(str).mo17160t(new ColorDrawable(this.mLoadingColor)).mo16818O(this.requestListener);
        C19383o.m32796f(g0, "with(context)\n          …listener(requestListener)");
        C11929c cVar = this.imageViewTransformation;
        if (cVar != null) {
            cVar.mo38657a(g0);
        }
        g0.mo16816M(this);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.etsy.android.uikit.image.glide.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void loadProgressive(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000e
            boolean r0 = p628nj.C18263b.m30835b0(r3)
            if (r0 == 0) goto L_0x000e
            com.etsy.android.uikit.image.glide.g r0 = new com.etsy.android.uikit.image.glide.g
            r0.<init>(r3, r2)
            r3 = r0
        L_0x000e:
            android.content.Context r0 = r2.getContext()
            com.etsy.android.lib.core.img.GlideRequests r0 = androidx.activity.C0114h.m270B0(r0)
            u9.b r3 = r0.load((java.lang.Object) r3)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            int r1 = r2.mLoadingColor
            r0.<init>(r1)
            u9.b r3 = r3.mo17160t(r0)
            com.etsy.android.uikit.view.ListingFullImageView$b r0 = r2.requestListener
            u9.b r3 = r3.mo16818O(r0)
            java.lang.String r0 = "with(context)\n          …listener(requestListener)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r0)
            com.etsy.android.uikit.view.c r0 = r2.imageViewTransformation
            if (r0 == 0) goto L_0x0037
            r0.mo38657a(r3)
        L_0x0037:
            r3.mo16816M(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.view.ListingFullImageView.loadProgressive(java.lang.String):void");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C11929c getImageViewTransformation() {
        return this.imageViewTransformation;
    }

    public final boolean getLoadProgressiveJpegs() {
        return this.loadProgressiveJpegs;
    }

    public final boolean isLoaded() {
        return this.isLoaded;
    }

    public void loadImage() {
        String str;
        boolean z = false;
        this.isLoaded = false;
        C11950e eVar = this.loadListener;
        if (eVar == null || (str = eVar.mo38324a(getMeasuredWidth(), getMeasuredHeight())) == null) {
            if (Math.abs(this.mAspectRatio - 0.75f) < 1.0E-7f) {
                z = true;
            }
            int measuredWidth = getMeasuredWidth();
            str = z ? this.mImage.get4to3ImageUrlForPixelWidth(measuredWidth) : this.mImage.getFullHeightImageUrlForPixelWidth(measuredWidth);
        }
        if (this.loadProgressiveJpegs) {
            loadProgressive(str);
        } else {
            load(str);
        }
    }

    public final void setAspectRatio(float f) {
        this.mAspectRatio = f;
    }

    public final void setImageLoadedListener(C11950e eVar) {
        C19383o.m32797g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.loadListener = eVar;
    }

    public final void setImageViewTransformation(C11929c cVar) {
        this.imageViewTransformation = cVar;
    }

    public final void setLoadProgressiveJpegs(boolean z) {
        this.loadProgressiveJpegs = z;
    }

    public final void setUseStandardRatio(boolean z) {
        this.mAspectRatio = z ? 0.75f : 0.0f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingFullImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
