package com.paypal.pyplcheckout.interfaces;

import java.lang.Enum;

public interface PageId<E extends Enum<E>> {

    public enum PageIdType implements PageId {
        MAIN_PAYSHEET_PAGE,
        CUSTOM_PAGE
    }
}
