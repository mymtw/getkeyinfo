package com.facebook.login.widget;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.activity.result.C0126g;
import androidx.fragment.app.Fragment;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookButtonBase;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.login.C12308b;
import com.facebook.login.C12311e;
import com.facebook.login.C12321f;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginTargetApp;
import com.facebook.login.widget.ToolTipPopup;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p075d.C6614a;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p365hg.C12882n;
import p365hg.C12903s;
import p401mg.C13080a;
import p453tf.C13412e;
import p453tf.C13415g;
import p453tf.C13417i;
import p453tf.C13418j;
import p453tf.C13442y;
import p461uf.C13511h;
import p772tq.C20203a;

public class LoginButton extends FacebookButtonBase {
    private static final int MAX_BUTTON_TRANSPARENCY = 255;
    private static final int MIN_BUTTON_TRANSPARENCY = 0;
    private static final String TAG = LoginButton.class.getName();
    private C13412e accessTokenTracker;
    /* access modifiers changed from: private */
    public C13415g callbackManager = null;
    /* access modifiers changed from: private */
    public boolean confirmLogout;
    private Float customButtonRadius;
    private int customButtonTransparency = 255;
    private final String loggerID = UUID.randomUUID().toString();
    /* access modifiers changed from: private */
    public String loginLogoutEventName = "fb_login_view_usage";
    private C12311e loginManager;
    private String loginText;
    private String logoutText;
    public C12329d properties = new C12329d();
    private boolean toolTipChecked;
    private long toolTipDisplayTime = 6000;
    private ToolTipMode toolTipMode;
    private ToolTipPopup toolTipPopup;
    private ToolTipPopup.Style toolTipStyle = ToolTipPopup.Style.BLUE;

    public class LoginClickListener implements View.OnClickListener {

        /* renamed from: com.facebook.login.widget.LoginButton$LoginClickListener$a */
        public class C12324a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            public final /* synthetic */ C12311e f27464b;

            public C12324a(C12311e eVar) {
                this.f27464b = eVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C12311e eVar = this.f27464b;
                eVar.getClass();
                AccessToken.setCurrentAccessToken((AccessToken) null);
                AuthenticationToken.setCurrentAuthenticationToken((AuthenticationToken) null);
                Profile.setCurrentProfile((Profile) null);
                SharedPreferences.Editor edit = eVar.f27441c.edit();
                edit.putBoolean("express_login_allowed", false);
                edit.apply();
            }
        }

        public LoginClickListener() {
        }

        public C12311e getLoginManager() {
            if (C13080a.m20762b(this)) {
                return null;
            }
            try {
                C12311e b = C12311e.m20139b();
                b.f27440b = LoginButton.this.getDefaultAudience();
                b.f27439a = LoginButton.this.getLoginBehavior();
                b.f27445g = getLoginTargetApp();
                b.f27442d = LoginButton.this.getAuthType();
                b.f27446h = isFamilyLogin();
                b.f27447i = LoginButton.this.getShouldSkipAccountDeduplication();
                b.f27443e = LoginButton.this.getMessengerPageId();
                b.f27444f = LoginButton.this.getResetMessengerState();
                return b;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return null;
            }
        }

        public LoginTargetApp getLoginTargetApp() {
            if (C13080a.m20762b(this)) {
                return null;
            }
            try {
                return LoginTargetApp.FACEBOOK;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return null;
            }
        }

        public boolean isFamilyLogin() {
            C13080a.m20762b(this);
            return false;
        }

        public void onClick(View view) {
            if (!C13080a.m20762b(this)) {
                try {
                    LoginButton.this.callExternalOnClickListener(view);
                    AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
                    if (AccessToken.isCurrentAccessTokenActive()) {
                        performLogout(LoginButton.this.getContext());
                    } else {
                        performLogin();
                    }
                    C13511h hVar = new C13511h(LoginButton.this.getContext(), (String) null);
                    Bundle bundle = new Bundle();
                    int i = 0;
                    if (currentAccessToken == null) {
                        i = 1;
                    }
                    bundle.putInt("logging_in", i);
                    bundle.putInt("access_token_expired", AccessToken.isCurrentAccessTokenActive() ? 1 : 0);
                    String access$300 = LoginButton.this.loginLogoutEventName;
                    String str = C13418j.f29381a;
                    if (C13442y.m21140c()) {
                        hVar.mo46170f(access$300, bundle);
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }

        public void performLogin() {
            if (!C13080a.m20762b(this)) {
                try {
                    C12311e loginManager = getLoginManager();
                    if (LoginButton.this.getAndroidxActivityResultRegistryOwner() != null) {
                        C13415g access$400 = LoginButton.this.callbackManager != null ? LoginButton.this.callbackManager : new CallbackManagerImpl();
                        C0126g androidxActivityResultRegistryOwner = LoginButton.this.getAndroidxActivityResultRegistryOwner();
                        LoginButton loginButton = LoginButton.this;
                        List<String> list = loginButton.properties.f27472b;
                        String loggerID = loginButton.getLoggerID();
                        loginManager.getClass();
                        LoginClient.Request a = loginManager.mo39615a(new C12308b(list));
                        a.setAuthId(loggerID);
                        loginManager.mo39618g(new C12311e.C12315d(androidxActivityResultRegistryOwner, access$400), a);
                    } else if (LoginButton.this.getFragment() != null) {
                        Fragment fragment = LoginButton.this.getFragment();
                        LoginButton loginButton2 = LoginButton.this;
                        List<String> list2 = loginButton2.properties.f27472b;
                        String loggerID2 = loginButton2.getLoggerID();
                        loginManager.getClass();
                        C12903s sVar = new C12903s(fragment);
                        LoginClient.Request a2 = loginManager.mo39615a(new C12308b(list2));
                        a2.setAuthId(loggerID2);
                        loginManager.mo39618g(new C12311e.C12319e(sVar), a2);
                    } else if (LoginButton.this.getNativeFragment() != null) {
                        android.app.Fragment nativeFragment = LoginButton.this.getNativeFragment();
                        LoginButton loginButton3 = LoginButton.this;
                        List<String> list3 = loginButton3.properties.f27472b;
                        String loggerID3 = loginButton3.getLoggerID();
                        loginManager.getClass();
                        C12903s sVar2 = new C12903s(nativeFragment);
                        LoginClient.Request a3 = loginManager.mo39615a(new C12308b(list3));
                        a3.setAuthId(loggerID3);
                        loginManager.mo39618g(new C12311e.C12319e(sVar2), a3);
                    } else {
                        Activity access$600 = LoginButton.this.getActivity();
                        LoginButton loginButton4 = LoginButton.this;
                        List<String> list4 = loginButton4.properties.f27472b;
                        String loggerID4 = loginButton4.getLoggerID();
                        loginManager.getClass();
                        LoginClient.Request a4 = loginManager.mo39615a(new C12308b(list4));
                        a4.setAuthId(loggerID4);
                        loginManager.mo39618g(new C12311e.C12314c(access$600), a4);
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }

        public void performLogout(Context context) {
            String str;
            if (!C13080a.m20762b(this)) {
                try {
                    C12311e loginManager = getLoginManager();
                    if (LoginButton.this.confirmLogout) {
                        String string = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_log_out_action);
                        String string2 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_cancel_action);
                        Profile currentProfile = Profile.getCurrentProfile();
                        if (currentProfile == null || currentProfile.getName() == null) {
                            str = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
                        } else {
                            str = String.format(LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_as), new Object[]{currentProfile.getName()});
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setMessage(str).setCancelable(true).setPositiveButton(string, new C12324a(loginManager)).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
                        builder.create().show();
                        return;
                    }
                    loginManager.getClass();
                    AccessToken.setCurrentAccessToken((AccessToken) null);
                    AuthenticationToken.setCurrentAuthenticationToken((AuthenticationToken) null);
                    Profile.setCurrentProfile((Profile) null);
                    SharedPreferences.Editor edit = loginManager.f27441c.edit();
                    edit.putBoolean("express_login_allowed", false);
                    edit.apply();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    public enum ToolTipMode {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        public static ToolTipMode DEFAULT;
        private int intValue;
        private String stringValue;

        /* access modifiers changed from: public */
        static {
            ToolTipMode toolTipMode;
            DEFAULT = toolTipMode;
        }

        private ToolTipMode(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static ToolTipMode fromInt(int i) {
            for (ToolTipMode toolTipMode : values()) {
                if (toolTipMode.getValue() == i) {
                    return toolTipMode;
                }
            }
            return null;
        }

        public int getValue() {
            return this.intValue;
        }

        public String toString() {
            return this.stringValue;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$a */
    public class C12325a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f27465b;

        /* renamed from: com.facebook.login.widget.LoginButton$a$a */
        public class C12326a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ C12882n f27467b;

            public C12326a(C12882n nVar) {
                this.f27467b = nVar;
            }

            public final void run() {
                if (!C13080a.m20762b(this)) {
                    try {
                        LoginButton.this.showToolTipPerSettings(this.f27467b);
                    } catch (Throwable th) {
                        C13080a.m20761a(this, th);
                    }
                }
            }
        }

        public C12325a(String str) {
            this.f27465b = str;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    LoginButton.this.getActivity().runOnUiThread(new C12326a(FetchedAppSettingsManager.m20107f(this.f27465b, false)));
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$b */
    public class C12327b extends C13412e {
        public C12327b() {
        }

        /* renamed from: a */
        public final void mo39685a(AccessToken accessToken) {
            LoginButton.this.setButtonText();
            LoginButton.this.setButtonIcon();
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$c */
    public static /* synthetic */ class C12328c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27470a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.login.widget.LoginButton$ToolTipMode[] r0 = com.facebook.login.widget.LoginButton.ToolTipMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27470a = r0
                com.facebook.login.widget.LoginButton$ToolTipMode r1 = com.facebook.login.widget.LoginButton.ToolTipMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27470a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.login.widget.LoginButton$ToolTipMode r1 = com.facebook.login.widget.LoginButton.ToolTipMode.DISPLAY_ALWAYS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27470a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.login.widget.LoginButton$ToolTipMode r1 = com.facebook.login.widget.LoginButton.ToolTipMode.NEVER_DISPLAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.widget.LoginButton.C12328c.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$d */
    public static class C12329d {

        /* renamed from: a */
        public DefaultAudience f27471a = DefaultAudience.FRIENDS;

        /* renamed from: b */
        public List<String> f27472b = Collections.emptyList();

        /* renamed from: c */
        public LoginBehavior f27473c = LoginBehavior.NATIVE_WITH_FALLBACK;

        /* renamed from: d */
        public String f27474d = "rerequest";

        /* renamed from: e */
        public LoginTargetApp f27475e = LoginTargetApp.FACEBOOK;

        /* renamed from: f */
        public String f27476f;

        /* renamed from: g */
        public boolean f27477g;
    }

    public LoginButton(Context context) {
        super(context, (AttributeSet) null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    private void checkToolTipSettings() {
        if (!C13080a.m20762b(this)) {
            try {
                int i = C12328c.f27470a[this.toolTipMode.ordinal()];
                if (i == 1) {
                    Context context = getContext();
                    int i2 = C12869i0.f28368a;
                    C12879l0.m20601e(context, ResponseConstants.CONTEXT);
                    C13418j.m21108d().execute(new C12325a(C13418j.m21107c()));
                } else if (i == 2) {
                    displayToolTip(getResources().getString(R.string.com_facebook_tooltip_default));
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private void displayToolTip(String str) {
        ToolTipPopup toolTipPopup2;
        if (!C13080a.m20762b(this)) {
            try {
                toolTipPopup2 = new ToolTipPopup(this, str);
                this.toolTipPopup = toolTipPopup2;
                ToolTipPopup.Style style = this.toolTipStyle;
                if (!C13080a.m20762b(toolTipPopup2)) {
                    toolTipPopup2.f27485f = style;
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return;
            }
            ToolTipPopup toolTipPopup3 = this.toolTipPopup;
            long j = this.toolTipDisplayTime;
            toolTipPopup3.getClass();
            if (!C13080a.m20762b(toolTipPopup3)) {
                try {
                    toolTipPopup3.f27486g = j;
                } catch (Throwable th2) {
                    C13080a.m20761a(toolTipPopup3, th2);
                }
            }
            this.toolTipPopup.mo39704c();
        }
    }

    private int measureButtonWidth(String str) {
        if (C13080a.m20762b(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + measureTextWidth(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public void showToolTipPerSettings(C12882n nVar) {
        if (!C13080a.m20762b(this) && nVar != null) {
            try {
                if (nVar.f28399c && getVisibility() == 0) {
                    displayToolTip(nVar.f28398b);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void clearPermissions() {
        this.properties.f27472b = null;
    }

    public void configureButton(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!C13080a.m20762b(this)) {
            try {
                super.configureButton(context, attributeSet, i, i2);
                setInternalOnClickListener(getNewLoginClickListener());
                parseLoginButtonAttributes(context, attributeSet, i, i2);
                if (isInEditMode()) {
                    setBackgroundColor(getResources().getColor(R.color.com_facebook_blue));
                    this.loginText = "Continue with Facebook";
                } else {
                    this.accessTokenTracker = new C12327b();
                }
                setButtonText();
                setButtonRadius();
                setButtonTransparency();
                setButtonIcon();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void dismissToolTip() {
        ToolTipPopup toolTipPopup2 = this.toolTipPopup;
        if (toolTipPopup2 != null) {
            toolTipPopup2.mo39703b();
            this.toolTipPopup = null;
        }
    }

    public String getAuthType() {
        return this.properties.f27474d;
    }

    public C13415g getCallbackManager() {
        return this.callbackManager;
    }

    public DefaultAudience getDefaultAudience() {
        return this.properties.f27471a;
    }

    public int getDefaultRequestCode() {
        if (C13080a.m20762b(this)) {
            return 0;
        }
        try {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return 0;
        }
    }

    public int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    public String getLoggerID() {
        return this.loggerID;
    }

    public LoginBehavior getLoginBehavior() {
        return this.properties.f27473c;
    }

    public int getLoginButtonContinueLabel() {
        return R.string.com_facebook_loginview_log_in_button_continue;
    }

    public int getLoginButtonWidth(int i) {
        if (C13080a.m20762b(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String str = this.loginText;
            if (str == null) {
                str = resources.getString(R.string.com_facebook_loginview_log_in_button_continue);
                int measureButtonWidth = measureButtonWidth(str);
                if (View.resolveSize(measureButtonWidth, i) < measureButtonWidth) {
                    str = resources.getString(R.string.com_facebook_loginview_log_in_button);
                }
            }
            return measureButtonWidth(str);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return 0;
        }
    }

    public C12311e getLoginManager() {
        if (this.loginManager == null) {
            this.loginManager = C12311e.m20139b();
        }
        return this.loginManager;
    }

    public LoginTargetApp getLoginTargetApp() {
        return this.properties.f27475e;
    }

    public String getMessengerPageId() {
        return this.properties.f27476f;
    }

    public LoginClickListener getNewLoginClickListener() {
        return new LoginClickListener();
    }

    public List<String> getPermissions() {
        return this.properties.f27472b;
    }

    public boolean getResetMessengerState() {
        return this.properties.f27477g;
    }

    public boolean getShouldSkipAccountDeduplication() {
        this.properties.getClass();
        return false;
    }

    public long getToolTipDisplayTime() {
        return this.toolTipDisplayTime;
    }

    public ToolTipMode getToolTipMode() {
        return this.toolTipMode;
    }

    public void onAttachedToWindow() {
        boolean z;
        if (!C13080a.m20762b(this)) {
            try {
                super.onAttachedToWindow();
                C13412e eVar = this.accessTokenTracker;
                if (eVar != null && !(z = eVar.f29377c)) {
                    if (!z) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                        eVar.f29376b.mo20708b(eVar.f29375a, intentFilter);
                        eVar.f29377c = true;
                    }
                    setButtonText();
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void onDetachedFromWindow() {
        if (!C13080a.m20762b(this)) {
            try {
                super.onDetachedFromWindow();
                C13412e eVar = this.accessTokenTracker;
                if (eVar != null) {
                    if (eVar.f29377c) {
                        eVar.f29376b.mo20710d(eVar.f29375a);
                        eVar.f29377c = false;
                    }
                }
                dismissToolTip();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        if (!C13080a.m20762b(this)) {
            try {
                super.onDraw(canvas);
                if (!this.toolTipChecked && !isInEditMode()) {
                    this.toolTipChecked = true;
                    checkToolTipSettings();
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!C13080a.m20762b(this)) {
            try {
                super.onLayout(z, i, i2, i3, i4);
                setButtonText();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (!C13080a.m20762b(this)) {
            try {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
                Resources resources = getResources();
                int loginButtonWidth = getLoginButtonWidth(i);
                String str = this.logoutText;
                if (str == null) {
                    str = resources.getString(R.string.com_facebook_loginview_log_out_button);
                }
                setMeasuredDimension(View.resolveSize(Math.max(loginButtonWidth, measureButtonWidth(str)), i), compoundPaddingTop);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void onVisibilityChanged(View view, int i) {
        if (!C13080a.m20762b(this)) {
            try {
                super.onVisibilityChanged(view, i);
                if (i != 0) {
                    dismissToolTip();
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void parseLoginButtonAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes;
        if (!C13080a.m20762b(this)) {
            try {
                this.toolTipMode = ToolTipMode.DEFAULT;
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C20203a.f44775e, i, i2);
                this.confirmLogout = obtainStyledAttributes.getBoolean(0, true);
                this.loginText = obtainStyledAttributes.getString(3);
                this.logoutText = obtainStyledAttributes.getString(4);
                this.toolTipMode = ToolTipMode.fromInt(obtainStyledAttributes.getInt(5, ToolTipMode.DEFAULT.getValue()));
                if (obtainStyledAttributes.hasValue(1)) {
                    this.customButtonRadius = Float.valueOf(obtainStyledAttributes.getDimension(1, 0.0f));
                }
                int integer = obtainStyledAttributes.getInteger(2, 255);
                this.customButtonTransparency = integer;
                if (integer < 0) {
                    this.customButtonTransparency = 0;
                }
                if (this.customButtonTransparency > 255) {
                    this.customButtonTransparency = 255;
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void registerCallback(C13415g gVar, C13417i<C12321f> iVar) {
        getLoginManager().mo39617f(gVar, iVar);
        C13415g gVar2 = this.callbackManager;
        if (gVar2 == null) {
            this.callbackManager = gVar;
        } else if (gVar2 != gVar) {
            Log.w(TAG, "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public void setAuthType(String str) {
        this.properties.f27474d = str;
    }

    public void setButtonIcon() {
        if (!C13080a.m20762b(this)) {
            try {
                setCompoundDrawablesWithIntrinsicBounds(C6614a.m12981a(getContext(), R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    @TargetApi(29)
    public void setButtonRadius() {
        if (!C13080a.m20762b(this)) {
            try {
                if (this.customButtonRadius != null) {
                    Drawable background = getBackground();
                    if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                        StateListDrawable stateListDrawable = (StateListDrawable) background;
                        for (int i = 0; i < stateListDrawable.getStateCount(); i++) {
                            GradientDrawable gradientDrawable = (GradientDrawable) stateListDrawable.getStateDrawable(i);
                            if (gradientDrawable != null) {
                                gradientDrawable.setCornerRadius(this.customButtonRadius.floatValue());
                            }
                        }
                    }
                    if (background instanceof GradientDrawable) {
                        ((GradientDrawable) background).setCornerRadius(this.customButtonRadius.floatValue());
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void setButtonText() {
        if (!C13080a.m20762b(this)) {
            try {
                Resources resources = getResources();
                if (isInEditMode() || !AccessToken.isCurrentAccessTokenActive()) {
                    String str = this.loginText;
                    if (str != null) {
                        setText(str);
                        return;
                    }
                    String string = resources.getString(getLoginButtonContinueLabel());
                    int width = getWidth();
                    if (width != 0 && measureButtonWidth(string) > width) {
                        string = resources.getString(R.string.com_facebook_loginview_log_in_button);
                    }
                    setText(string);
                    return;
                }
                String str2 = this.logoutText;
                if (str2 == null) {
                    str2 = resources.getString(R.string.com_facebook_loginview_log_out_button);
                }
                setText(str2);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void setButtonTransparency() {
        if (!C13080a.m20762b(this)) {
            try {
                getBackground().setAlpha(this.customButtonTransparency);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void setDefaultAudience(DefaultAudience defaultAudience) {
        this.properties.f27471a = defaultAudience;
    }

    public void setLoginBehavior(LoginBehavior loginBehavior) {
        this.properties.f27473c = loginBehavior;
    }

    public void setLoginManager(C12311e eVar) {
        this.loginManager = eVar;
    }

    public void setLoginTargetApp(LoginTargetApp loginTargetApp) {
        this.properties.f27475e = loginTargetApp;
    }

    public void setLoginText(String str) {
        this.loginText = str;
        setButtonText();
    }

    public void setLogoutText(String str) {
        this.logoutText = str;
        setButtonText();
    }

    public void setMessengerPageId(String str) {
        this.properties.f27476f = str;
    }

    public void setPermissions(List<String> list) {
        this.properties.f27472b = list;
    }

    public void setProperties(C12329d dVar) {
        this.properties = dVar;
    }

    public void setPublishPermissions(List<String> list) {
        this.properties.f27472b = list;
    }

    public void setReadPermissions(List<String> list) {
        this.properties.f27472b = list;
    }

    public void setResetMessengerState(boolean z) {
        this.properties.f27477g = z;
    }

    public void setToolTipDisplayTime(long j) {
        this.toolTipDisplayTime = j;
    }

    public void setToolTipMode(ToolTipMode toolTipMode2) {
        this.toolTipMode = toolTipMode2;
    }

    public void setToolTipStyle(ToolTipPopup.Style style) {
        this.toolTipStyle = style;
    }

    public void unregisterCallback(C13415g gVar) {
        getLoginManager().getClass();
        C12311e.m20142h(gVar);
    }

    public void setPermissions(String... strArr) {
        this.properties.f27472b = Arrays.asList(strArr);
    }

    public void setPublishPermissions(String... strArr) {
        this.properties.f27472b = Arrays.asList(strArr);
    }

    public void setReadPermissions(String... strArr) {
        this.properties.f27472b = Arrays.asList(strArr);
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, i, i2, str, str2);
    }
}
