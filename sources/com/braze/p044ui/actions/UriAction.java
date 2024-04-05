package com.braze.p044ui.actions;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.appboy.Constants;
import com.appboy.enums.Channel;
import com.appsflyer.AppsFlyerProperties;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.p044ui.BrazeDeeplinkHandler;
import com.braze.p044ui.BrazeWebViewActivity;
import com.braze.p044ui.actions.brazeactions.BrazeActionParser;
import com.braze.p044ui.support.UriUtils;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: com.braze.ui.actions.UriAction */
public final class UriAction implements C5623a {

    /* renamed from: a */
    public final Bundle f12014a;

    /* renamed from: b */
    public final Channel f12015b;

    /* renamed from: c */
    public Uri f12016c;

    /* renamed from: d */
    public boolean f12017d;

    public UriAction(Uri uri, Bundle bundle, boolean z, Channel channel) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C19383o.m32797g(channel, AppsFlyerProperties.CHANNEL);
        this.f12016c = uri;
        this.f12014a = bundle;
        this.f12017d = z;
        this.f12015b = channel;
    }

    /* renamed from: a */
    public final void mo16178a(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (BrazeFileUtils.m11240d(this.f12016c)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new UriAction$execute$1(this), 7);
            return;
        }
        BrazeActionParser brazeActionParser = BrazeActionParser.f12018a;
        Uri uri = this.f12016c;
        if (C19383o.m32792b(uri == null ? null : uri.getScheme(), "brazeActions")) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new UriAction$execute$2(this), 6);
            brazeActionParser.mo16182a(context, this.f12016c, this.f12015b);
            return;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new UriAction$execute$3(this), 7);
        int i = 268435456;
        if (this.f12017d) {
            if (C19327t.m32634P0(this.f12016c.getScheme(), BrazeFileUtils.f11886b)) {
                if (this.f12015b == Channel.PUSH) {
                    Uri uri2 = this.f12016c;
                    Bundle bundle = this.f12014a;
                    C19383o.m32797g(uri2, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                    try {
                        context.startActivities(mo16180c(context, bundle, mo16181d(context, uri2, bundle), new BrazeConfigurationProvider(context)));
                        return;
                    } catch (Exception e) {
                        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, UriAction$openUriWithWebViewActivityFromPush$1.INSTANCE, 4);
                        return;
                    }
                } else {
                    Uri uri3 = this.f12016c;
                    Bundle bundle2 = this.f12014a;
                    C19383o.m32797g(uri3, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                    Intent d = mo16181d(context, uri3, bundle2);
                    IBrazeDeeplinkHandler.IntentFlagPurpose intentFlagPurpose = IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY;
                    C19383o.m32797g(intentFlagPurpose, "intentFlagPurpose");
                    switch (BrazeDeeplinkHandler.C5622a.f12012a[intentFlagPurpose.ordinal()]) {
                        case 1:
                        case 2:
                            i = 1073741824;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            i = 872415232;
                            break;
                        case 6:
                        case 7:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    d.setFlags(i);
                    try {
                        context.startActivity(d);
                        return;
                    } catch (Exception e2) {
                        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e2, UriAction$openUriWithWebViewActivity$1.INSTANCE, 4);
                        return;
                    }
                }
            }
        }
        if (this.f12015b == Channel.PUSH) {
            Uri uri4 = this.f12016c;
            Bundle bundle3 = this.f12014a;
            C19383o.m32797g(uri4, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            try {
                context.startActivities(mo16180c(context, bundle3, mo16179b(context, uri4, bundle3), new BrazeConfigurationProvider(context)));
            } catch (ActivityNotFoundException e3) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e3, new UriAction$openUriWithActionViewFromPush$1(uri4), 4);
            }
        } else {
            Uri uri5 = this.f12016c;
            Bundle bundle4 = this.f12014a;
            C19383o.m32797g(uri5, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            Intent b = mo16179b(context, uri5, bundle4);
            IBrazeDeeplinkHandler.IntentFlagPurpose intentFlagPurpose2 = IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW;
            C19383o.m32797g(intentFlagPurpose2, "intentFlagPurpose");
            switch (BrazeDeeplinkHandler.C5622a.f12012a[intentFlagPurpose2.ordinal()]) {
                case 1:
                case 2:
                    i = 1073741824;
                    break;
                case 3:
                case 4:
                case 5:
                    i = 872415232;
                    break;
                case 6:
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            b.setFlags(i);
            try {
                context.startActivity(b);
            } catch (Exception e4) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e4, new UriAction$openUriWithActionView$1(uri5, bundle4), 4);
            }
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    /* renamed from: b */
    public final Intent mo16179b(Context context, Uri uri, Bundle bundle) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        List<ResolveInfo> queryIntentActivities = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : context.getPackageManager().queryIntentActivities(intent, 0);
        C19383o.m32796f(queryIntentActivities, "if (Build.VERSION.SDK_IN…ties(intent, 0)\n        }");
        if (queryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (C19383o.m32792b(next.activityInfo.packageName, context.getPackageName())) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new UriAction$getActionViewIntent$1(next), 7);
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent[] mo16180c(android.content.Context r23, android.os.Bundle r24, android.content.Intent r25, com.braze.configuration.BrazeConfigurationProvider r26) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.String r3 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            boolean r3 = r26.isPushDeepLinkBackStackActivityEnabled()
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r5 = 872415232(0x34000000, float:1.1920929E-7)
            r6 = 1073741824(0x40000000, float:2.0)
            java.lang.String r7 = "intentFlagPurpose"
            r8 = 0
            r9 = 1
            if (r3 == 0) goto L_0x0099
            java.lang.String r3 = r26.getPushDeepLinkBackStackActivityClassName()
            if (r3 == 0) goto L_0x002a
            boolean r10 = kotlin.text.C19457k.m33020X0(r3)
            if (r10 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r10 = r8
            goto L_0x002b
        L_0x002a:
            r10 = r9
        L_0x002b:
            if (r10 == 0) goto L_0x0041
            com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.I
            r14 = 0
            com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$1 r15 = com.braze.p044ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$1.INSTANCE
            r16 = 6
            r12 = r22
            com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
            android.content.Intent r0 = com.braze.p044ui.support.UriUtils.m11472a(r23, r24)
            goto L_0x00a9
        L_0x0041:
            boolean r10 = com.braze.p044ui.support.UriUtils.m11474c(r0, r3)
            if (r10 == 0) goto L_0x0088
            com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.I
            r14 = 0
            com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$2 r15 = new com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$2
            r15.<init>(r3)
            r16 = 6
            r12 = r22
            com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
            if (r1 != 0) goto L_0x005b
            goto L_0x00a8
        L_0x005b:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            android.content.Intent r0 = r10.setClassName(r0, r3)
            com.braze.IBrazeDeeplinkHandler$IntentFlagPurpose r3 = com.braze.IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT
            kotlin.jvm.internal.C19383o.m32797g(r3, r7)
            int[] r10 = com.braze.p044ui.BrazeDeeplinkHandler.C5622a.f12012a
            int r3 = r3.ordinal()
            r3 = r10[r3]
            switch(r3) {
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007c;
                case 4: goto L_0x007c;
                case 5: goto L_0x007c;
                case 6: goto L_0x007a;
                case 7: goto L_0x007a;
                default: goto L_0x0074;
            }
        L_0x0074:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x007a:
            r3 = r4
            goto L_0x007f
        L_0x007c:
            r3 = r5
            goto L_0x007f
        L_0x007e:
            r3 = r6
        L_0x007f:
            android.content.Intent r0 = r0.setFlags(r3)
            android.content.Intent r0 = r0.putExtras(r1)
            goto L_0x00a9
        L_0x0088:
            com.braze.support.BrazeLogger r10 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r12 = com.braze.support.BrazeLogger.Priority.I
            r13 = 0
            com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$4 r14 = new com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$4
            r14.<init>(r3)
            r15 = 6
            r11 = r22
            com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
            goto L_0x00a8
        L_0x0099:
            com.braze.support.BrazeLogger r16 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r18 = com.braze.support.BrazeLogger.Priority.I
            r19 = 0
            com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$5 r20 = com.braze.p044ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$5.INSTANCE
            r21 = 6
            r17 = r22
            com.braze.support.BrazeLogger.m11282d(r16, r17, r18, r19, r20, r21)
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            if (r0 != 0) goto L_0x00cc
            com.braze.IBrazeDeeplinkHandler$IntentFlagPurpose r0 = com.braze.IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT
            kotlin.jvm.internal.C19383o.m32797g(r0, r7)
            int[] r1 = com.braze.p044ui.BrazeDeeplinkHandler.C5622a.f12012a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00c4;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00c1:
            r4 = r5
            goto L_0x00c4
        L_0x00c3:
            r4 = r6
        L_0x00c4:
            r2.setFlags(r4)
            android.content.Intent[] r0 = new android.content.Intent[r9]
            r0[r8] = r2
            goto L_0x00d4
        L_0x00cc:
            r1 = 2
            android.content.Intent[] r1 = new android.content.Intent[r1]
            r1[r8] = r0
            r1[r9] = r2
            r0 = r1
        L_0x00d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.p044ui.actions.UriAction.mo16180c(android.content.Context, android.os.Bundle, android.content.Intent, com.braze.configuration.BrazeConfigurationProvider):android.content.Intent[]");
    }

    /* renamed from: d */
    public final Intent mo16181d(Context context, Uri uri, Bundle bundle) {
        Intent intent;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        String customHtmlWebViewActivityClassName = new BrazeConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        if ((customHtmlWebViewActivityClassName == null || C19457k.m33020X0(customHtmlWebViewActivityClassName)) || !UriUtils.m11474c(context, customHtmlWebViewActivityClassName)) {
            intent = new Intent(context, BrazeWebViewActivity.class);
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new UriAction$getWebViewActivityIntent$webViewActivityIntent$1(customHtmlWebViewActivityClassName), 7);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            C19383o.m32796f(intent, "val customWebViewActivit…ivityClassName)\n        }");
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }
}
