package com.etsy.android.uikit.p331ui.core;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.etsy.android.R;
import com.etsy.android.uikit.nav.TrackingBaseActivity;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.uikit.ui.core.TransparentActivity */
public abstract class TransparentActivity extends TrackingBaseActivity {
    public View mRootView;

    /* renamed from: com.etsy.android.uikit.ui.core.TransparentActivity$Tint */
    public enum Tint {
        LIGHT,
        NORMAL,
        DARK
    }

    /* renamed from: com.etsy.android.uikit.ui.core.TransparentActivity$a */
    public class C11888a extends TrackingOnClickListener {
        public C11888a() {
        }

        public final void onViewClick(View view) {
            if (view.getId() == R.id.window_container) {
                TransparentActivity.this.goBack();
            }
        }
    }

    /* renamed from: com.etsy.android.uikit.ui.core.TransparentActivity$b */
    public class C11889b implements Runnable {
        public C11889b() {
        }

        public final void run() {
            TransparentActivity.this.goBack();
        }
    }

    /* renamed from: com.etsy.android.uikit.ui.core.TransparentActivity$c */
    public static /* synthetic */ class C11890c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26443a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.etsy.android.uikit.ui.core.TransparentActivity$Tint[] r0 = com.etsy.android.uikit.p331ui.core.TransparentActivity.Tint.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26443a = r0
                com.etsy.android.uikit.ui.core.TransparentActivity$Tint r1 = com.etsy.android.uikit.p331ui.core.TransparentActivity.Tint.LIGHT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26443a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.etsy.android.uikit.ui.core.TransparentActivity$Tint r1 = com.etsy.android.uikit.p331ui.core.TransparentActivity.Tint.DARK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.p331ui.core.TransparentActivity.C11890c.<clinit>():void");
        }
    }

    public boolean allowDismiss() {
        return true;
    }

    public void applyExitAnimation() {
        Intent intent = getIntent();
        if (intent != null) {
            overridePendingTransition(intent.getIntExtra("NAV_ANIM_BOTTOM_ENTER", 0), intent.getIntExtra("NAV_ANIM_TOP_EXIT", 0));
        }
    }

    public int getLayoutId() {
        return R.layout.activity_transparent_overlay_frame;
    }

    public void goBack() {
        finish();
        applyExitAnimation();
    }

    public void goBackDelayed() {
        new Handler().postDelayed(new C11889b(), 200);
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT == 26) {
            setRequestedOrientation(-1);
        } else {
            setRequestedOrientation(1);
        }
        setContentView(getLayoutId());
        this.mRootView = findViewById(R.id.window_container);
        if (allowDismiss() && (view = this.mRootView) != null) {
            view.setOnClickListener(new C11888a());
        }
    }

    public void setTint(int i, Tint tint) {
        Drawable background = getWindow().getDecorView().getBackground();
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(i));
        int i2 = C11890c.f26443a[tint.ordinal()];
        if (i2 == 1) {
            background.setAlpha(0);
        } else if (i2 != 2) {
            background.setAlpha(140);
        } else {
            background.setAlpha(255);
        }
    }
}
