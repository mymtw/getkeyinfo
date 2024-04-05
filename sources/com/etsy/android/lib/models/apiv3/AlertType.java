package com.etsy.android.lib.models.apiv3;

import com.etsy.android.stylekit.views.CollageAlert;

public enum AlertType {
    SUCCESS,
    NEWS,
    INFO,
    INFO_SUBTLE,
    WARNING,
    ERROR,
    UNKNOWN;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] iArr = new int[AlertType.values().length];
            iArr[AlertType.SUCCESS.ordinal()] = 1;
            iArr[AlertType.NEWS.ordinal()] = 2;
            iArr[AlertType.INFO.ordinal()] = 3;
            iArr[AlertType.INFO_SUBTLE.ordinal()] = 4;
            iArr[AlertType.WARNING.ordinal()] = 5;
            iArr[AlertType.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final CollageAlert.AlertType toCollageType() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return CollageAlert.AlertType.SUCCESS;
            case 2:
                return CollageAlert.AlertType.NEWS;
            case 3:
                return CollageAlert.AlertType.INFO;
            case 4:
                return CollageAlert.AlertType.INFO_SUBTLE;
            case 5:
                return CollageAlert.AlertType.WARNING;
            case 6:
                return CollageAlert.AlertType.ERROR;
            default:
                return CollageAlert.AlertType.UNKNOWN;
        }
    }
}
