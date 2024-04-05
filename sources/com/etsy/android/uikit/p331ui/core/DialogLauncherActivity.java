package com.etsy.android.uikit.p331ui.core;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Toast;
import com.etsy.android.R;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.nav.TrackingBaseActivity;
import p260v0.C8184a;

/* renamed from: com.etsy.android.uikit.ui.core.DialogLauncherActivity */
public abstract class DialogLauncherActivity extends TrackingBaseActivity {
    private BaseDialogFragment mDialogFragment;

    /* renamed from: com.etsy.android.uikit.ui.core.DialogLauncherActivity$Tint */
    public enum Tint {
        LIGHT,
        NORMAL,
        DARK
    }

    /* renamed from: com.etsy.android.uikit.ui.core.DialogLauncherActivity$a */
    public static /* synthetic */ class C11886a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26430a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.etsy.android.uikit.ui.core.DialogLauncherActivity$Tint[] r0 = com.etsy.android.uikit.p331ui.core.DialogLauncherActivity.Tint.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26430a = r0
                com.etsy.android.uikit.ui.core.DialogLauncherActivity$Tint r1 = com.etsy.android.uikit.p331ui.core.DialogLauncherActivity.Tint.LIGHT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26430a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.etsy.android.uikit.ui.core.DialogLauncherActivity$Tint r1 = com.etsy.android.uikit.p331ui.core.DialogLauncherActivity.Tint.DARK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.p331ui.core.DialogLauncherActivity.C11886a.<clinit>():void");
        }
    }

    private void applyExitAnimation() {
        Intent intent = getIntent();
        if (intent != null) {
            overridePendingTransition(intent.getIntExtra("NAV_ANIM_BOTTOM_ENTER", 0), intent.getIntExtra("NAV_ANIM_TOP_EXIT", 0));
        }
    }

    public void finish() {
        super.finish();
        applyExitAnimation();
    }

    public void onBackPressed() {
        BaseDialogFragment baseDialogFragment = this.mDialogFragment;
        if (baseDialogFragment == null || !baseDialogFragment.handleBackPressed()) {
            BaseDialogFragment baseDialogFragment2 = this.mDialogFragment;
            if (baseDialogFragment2 != null) {
                baseDialogFragment2.onCancel(baseDialogFragment2.getDialog());
            }
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_transparent_overlay_frame);
        setTitle(getIntent().getStringExtra("title"));
        AppBarHelper appBarHelper = getAppBarHelper();
        Object obj = C8184a.f17966a;
        appBarHelper.setNavigationIcon(C8184a.C8187c.m16466b(this, R.drawable.clg_icon_core_close_v1));
        if (bundle != null) {
            this.mDialogFragment = (BaseDialogFragment) getSupportFragmentManager().mo10353C("dialog");
        }
        if (this.mDialogFragment == null) {
            this.mDialogFragment = onStartDialogFragment(getIntent().getExtras());
        }
        if (this.mDialogFragment == null) {
            Toast.makeText(this, R.string.whoops_somethings_wrong, 0).show();
            finish();
        }
    }

    public BaseDialogFragment onStartDialogFragment(Bundle bundle) {
        return null;
    }

    public void setTint(int i, Tint tint) {
        Drawable background = getWindow().getDecorView().getBackground();
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(i));
        int i2 = C11886a.f26430a[tint.ordinal()];
        if (i2 == 1) {
            background.setAlpha(0);
        } else if (i2 != 2) {
            background.setAlpha(140);
        } else {
            background.setAlpha(255);
        }
    }
}
