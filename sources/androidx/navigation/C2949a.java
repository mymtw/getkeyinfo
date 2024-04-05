package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.C2990p;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C19388s;

@C2990p.C2991a("activity")
/* renamed from: androidx.navigation.a */
public final class C2949a extends C2990p<C2950a> {

    /* renamed from: a */
    public Context f6680a;

    /* renamed from: b */
    public Activity f6681b;

    /* renamed from: androidx.navigation.a$a */
    public static class C2950a extends C2964h {

        /* renamed from: j */
        public Intent f6682j;

        /* renamed from: k */
        public String f6683k;

        public C2950a(C2990p<? extends C2950a> pVar) {
            super(pVar);
        }

        /* renamed from: g */
        public final void mo10954g(Context context, AttributeSet attributeSet) {
            super.mo10954g(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19388s.f43272c);
            String string = obtainAttributes.getString(4);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            if (this.f6682j == null) {
                this.f6682j = new Intent();
            }
            this.f6682j.setPackage(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f6682j == null) {
                    this.f6682j = new Intent();
                }
                this.f6682j.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.f6682j == null) {
                this.f6682j = new Intent();
            }
            this.f6682j.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.f6682j == null) {
                    this.f6682j = new Intent();
                }
                this.f6682j.setData(parse);
            }
            this.f6683k = obtainAttributes.getString(3);
            obtainAttributes.recycle();
        }

        public final String toString() {
            Intent intent = this.f6682j;
            String str = null;
            ComponentName component = intent == null ? null : intent.getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                Intent intent2 = this.f6682j;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
            }
            return sb.toString();
        }
    }

    public C2949a(Context context) {
        this.f6680a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f6681b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    /* renamed from: a */
    public final C2964h mo10951a() {
        return new C2950a(this);
    }

    /* renamed from: b */
    public final C2964h mo10952b(C2964h hVar, Bundle bundle, C2971m mVar) {
        Intent intent;
        int intExtra;
        C2950a aVar = (C2950a) hVar;
        if (aVar.f6682j != null) {
            Intent intent2 = new Intent(aVar.f6682j);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = aVar.f6683k;
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            if (!(this.f6680a instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (mVar != null && mVar.f6749a) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f6681b;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar.f6728d);
            Resources resources = this.f6680a.getResources();
            if (mVar != null) {
                int i = mVar.f6754f;
                int i2 = mVar.f6755g;
                if ((i <= 0 || !resources.getResourceTypeName(i).equals("animator")) && (i2 <= 0 || !resources.getResourceTypeName(i2).equals("animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
                } else {
                    StringBuilder h = C0072d.m201h("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                    h.append(resources.getResourceName(i));
                    h.append(" and popExit resource ");
                    h.append(resources.getResourceName(i2));
                    h.append("when launching ");
                    h.append(aVar);
                    Log.w("ActivityNavigator", h.toString());
                }
            }
            this.f6680a.startActivity(intent2);
            if (mVar == null || this.f6681b == null) {
                return null;
            }
            int i3 = mVar.f6752d;
            int i4 = mVar.f6753e;
            if ((i3 > 0 && resources.getResourceTypeName(i3).equals("animator")) || (i4 > 0 && resources.getResourceTypeName(i4).equals("animator"))) {
                StringBuilder h2 = C0072d.m201h("Activity destinations do not support Animator resource. Ignoring enter resource ");
                h2.append(resources.getResourceName(i3));
                h2.append(" and exit resource ");
                h2.append(resources.getResourceName(i4));
                h2.append("when launching ");
                h2.append(aVar);
                Log.w("ActivityNavigator", h2.toString());
                return null;
            } else if (i3 < 0 && i4 < 0) {
                return null;
            } else {
                this.f6681b.overridePendingTransition(Math.max(i3, 0), Math.max(i4, 0));
                return null;
            }
        } else {
            throw new IllegalStateException(C0071c.m191c(C0072d.m201h("Destination "), aVar.f6728d, " does not have an Intent set."));
        }
    }

    /* renamed from: e */
    public final boolean mo10953e() {
        Activity activity = this.f6681b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
