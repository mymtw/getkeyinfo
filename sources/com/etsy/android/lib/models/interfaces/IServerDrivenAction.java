package com.etsy.android.lib.models.interfaces;

import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import kotlin.jvm.internal.C19383o;

public interface IServerDrivenAction {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String ICON_HELP = "help";

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ICON_HELP = "help";

        private Companion() {
        }
    }

    public static final class DefaultImpls {
        public static EtsyAssociativeArray getParams(IServerDrivenAction iServerDrivenAction) {
            return null;
        }

        public static boolean isFromSignIn(IServerDrivenAction iServerDrivenAction) {
            return false;
        }

        public static boolean isImmediatelyRemovable(IServerDrivenAction iServerDrivenAction) {
            return !iServerDrivenAction.getRefreshNeeded() && C19383o.m32792b(iServerDrivenAction.getType(), ServerDrivenAction.TYPE_DISMISS);
        }

        public static void setFromSignIn(IServerDrivenAction iServerDrivenAction, boolean z) {
        }

        public static void setParams(IServerDrivenAction iServerDrivenAction, EtsyAssociativeArray etsyAssociativeArray) {
        }
    }

    boolean getAuthNeeded();

    String getDeepLink();

    String getDisplayName();

    String getIcon();

    EtsyAssociativeArray getParams();

    String getPath();

    boolean getRefreshNeeded();

    String getRequestMethod();

    String getType();

    boolean isFromSignIn();

    boolean isImmediatelyRemovable();

    void setFromSignIn(boolean z);

    void setParams(EtsyAssociativeArray etsyAssociativeArray);
}
