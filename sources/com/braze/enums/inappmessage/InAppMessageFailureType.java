package com.braze.enums.inappmessage;

import kotlin.NoWhenBranchMatchedException;
import p005a4.C0035b;

public enum InAppMessageFailureType implements C0035b<String> {
    IMAGE_DOWNLOAD,
    TEMPLATE_REQUEST,
    ZIP_ASSET_DOWNLOAD,
    DISPLAY_VIEW_GENERATION,
    INTERNAL_TIMEOUT_EXCEEDED,
    UNKNOWN_MESSAGE_TYPE;

    /* renamed from: com.braze.enums.inappmessage.InAppMessageFailureType$a */
    public /* synthetic */ class C5419a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11704a = null;

        static {
            int[] iArr = new int[InAppMessageFailureType.values().length];
            iArr[InAppMessageFailureType.IMAGE_DOWNLOAD.ordinal()] = 1;
            iArr[InAppMessageFailureType.TEMPLATE_REQUEST.ordinal()] = 2;
            iArr[InAppMessageFailureType.ZIP_ASSET_DOWNLOAD.ordinal()] = 3;
            iArr[InAppMessageFailureType.DISPLAY_VIEW_GENERATION.ordinal()] = 4;
            iArr[InAppMessageFailureType.INTERNAL_TIMEOUT_EXCEEDED.ordinal()] = 5;
            iArr[InAppMessageFailureType.UNKNOWN_MESSAGE_TYPE.ordinal()] = 6;
            f11704a = iArr;
        }
    }

    public String forJsonPut() {
        switch (C5419a.f11704a[ordinal()]) {
            case 1:
                return "if";
            case 2:
                return "tf";
            case 3:
                return "zf";
            case 4:
                return "vf";
            case 5:
                return "te";
            case 6:
                return "umt";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
