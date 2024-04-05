package com.etsy.android.lib.models.enums;

public enum SalesChannels {
    RETAIL(1),
    IPP(2),
    WHOLESALE(3),
    CRAFT(4),
    CUSTOM_SHOPS(5),
    MANUFACTURING(6);
    
    public final int channelInt;

    private SalesChannels(int i) {
        this.channelInt = i;
    }

    public static SalesChannels resolve(int i) {
        switch (i) {
            case 1:
                return RETAIL;
            case 2:
                return IPP;
            case 3:
                return WHOLESALE;
            case 4:
                return CRAFT;
            case 5:
                return CRAFT;
            case 6:
                return MANUFACTURING;
            default:
                return RETAIL;
        }
    }
}
