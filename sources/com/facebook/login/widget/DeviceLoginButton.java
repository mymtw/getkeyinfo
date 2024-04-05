package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.C12307a;
import com.facebook.login.C12311e;
import com.facebook.login.LoginBehavior;
import com.facebook.login.widget.LoginButton;
import p401mg.C13080a;

public class DeviceLoginButton extends LoginButton {
    private Uri deviceRedirectUri;

    /* renamed from: com.facebook.login.widget.DeviceLoginButton$a */
    public class C12323a extends LoginButton.LoginClickListener {
        public C12323a() {
            super();
        }

        public final C12311e getLoginManager() {
            C12307a aVar;
            if (C13080a.m20762b(this)) {
                return null;
            }
            try {
                C12307a aVar2 = C12307a.f27427m;
                Class<C12307a> cls = C12307a.class;
                if (!C13080a.m20762b(cls)) {
                    try {
                        if (C12307a.f27427m == null) {
                            synchronized (cls) {
                                if (C12307a.f27427m == null) {
                                    C12307a.f27427m = new C12307a();
                                }
                            }
                        }
                        aVar = C12307a.f27427m;
                    } catch (Throwable th) {
                        C13080a.m20761a(cls, th);
                    }
                    aVar.f27440b = DeviceLoginButton.this.getDefaultAudience();
                    aVar.f27439a = LoginBehavior.DEVICE_AUTH;
                    DeviceLoginButton.this.getDeviceRedirectUri();
                    C13080a.m20762b(aVar);
                    return aVar;
                }
                aVar = null;
                aVar.f27440b = DeviceLoginButton.this.getDefaultAudience();
                aVar.f27439a = LoginBehavior.DEVICE_AUTH;
                DeviceLoginButton.this.getDeviceRedirectUri();
                C13080a.m20762b(aVar);
                return aVar;
            } catch (Throwable th2) {
                C13080a.m20761a(this, th2);
                return null;
            }
        }
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Uri getDeviceRedirectUri() {
        return this.deviceRedirectUri;
    }

    public LoginButton.LoginClickListener getNewLoginClickListener() {
        return new C12323a();
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.deviceRedirectUri = uri;
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceLoginButton(Context context) {
        super(context);
    }
}
