package com.etsy.android.lib.models.apiv3.vespa;

import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import kotlin.jvm.internal.C19383o;

public final class ServerDrivenActionParcelableKt {
    public static final ServerDrivenAction toServerDrivenAction(ServerDrivenActionParcelable serverDrivenActionParcelable) {
        C19383o.m32797g(serverDrivenActionParcelable, "<this>");
        ServerDrivenAction build = new ServerDrivenAction.ServerDrivenActionBuilder().requestMethod(serverDrivenActionParcelable.getRequestMethod()).path(serverDrivenActionParcelable.getPath()).params(serverDrivenActionParcelable.getParams()).authNeeded(Boolean.valueOf(serverDrivenActionParcelable.getAuthNeeded())).refreshNeeded(Boolean.valueOf(serverDrivenActionParcelable.getRefreshNeeded())).icon(serverDrivenActionParcelable.getIcon()).deepLink(serverDrivenActionParcelable.getDeepLink()).fromSignIn(Boolean.valueOf(serverDrivenActionParcelable.getFromSignIn())).build();
        C19383o.m32796f(build, "ServerDrivenActionBuilde…mSignIn)\n        .build()");
        return build;
    }

    public static final ServerDrivenActionParcelable toServerDrivenActionParcelable(ServerDrivenAction serverDrivenAction) {
        C19383o.m32797g(serverDrivenAction, "<this>");
        String str = serverDrivenAction.mRequestMethod;
        C19383o.m32796f(str, "this.mRequestMethod");
        String str2 = serverDrivenAction.mPath;
        EtsyAssociativeArray etsyAssociativeArray = serverDrivenAction.mParams;
        boolean z = serverDrivenAction.mAuthNeeded;
        boolean z2 = serverDrivenAction.mRefreshNeeded;
        String str3 = serverDrivenAction.icon;
        C19383o.m32796f(str3, "this.icon");
        String str4 = serverDrivenAction.deepLink;
        C19383o.m32796f(str4, "this.deepLink");
        return new ServerDrivenActionParcelable(str, str2, etsyAssociativeArray, z, z2, str3, str4, serverDrivenAction.fromSignIn);
    }

    public static final ServerDrivenActionParcelable toServerDrivenActionParcelable(IServerDrivenAction iServerDrivenAction) {
        C19383o.m32797g(iServerDrivenAction, "<this>");
        return new ServerDrivenActionParcelable(iServerDrivenAction.getRequestMethod(), iServerDrivenAction.getPath(), iServerDrivenAction.getParams(), iServerDrivenAction.getAuthNeeded(), iServerDrivenAction.getRefreshNeeded(), iServerDrivenAction.getIcon(), iServerDrivenAction.getDeepLink(), iServerDrivenAction.isFromSignIn());
    }
}
