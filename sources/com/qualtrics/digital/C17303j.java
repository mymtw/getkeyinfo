package com.qualtrics.digital;

import p771sr.C20180c;
import p771sr.C20182e;
import p771sr.C20183f;
import p771sr.C20192o;
import p771sr.C20197t;
import retrofit2.C20089b;

/* renamed from: com.qualtrics.digital.j */
interface C17303j {
    @C20183f("SIE/")
    /* renamed from: a */
    C20089b<Void> mo68214a(@C20197t("Q_PageView") int i, @C20197t("Q_BID") String str, @C20197t("Q_SIID") String str2, @C20197t("Q_CID") String str3, @C20197t("Q_ASID") String str4, @C20197t("Q_LOC") String str5, @C20197t("r") String str6, @C20197t("Q_CLIENTTYPE") String str7, @C20197t("Q_CLIENTVERSION") String str8, @C20197t("Q_DEVICEOS") String str9, @C20197t("Q_DEVICETYPE") String str10);

    @C20192o("SIE/Ajax.php")
    @C20182e
    /* renamed from: b */
    C20089b<Void> mo68215b(@C20180c("LevelName") String str, @C20180c("Message") String str2, @C20197t("action") String str3, @C20197t("Q_CLIENTTYPE") String str4, @C20197t("Q_CLIENTVERSION") String str5, @C20197t("Q_DEVICEOS") String str6, @C20197t("Q_DEVICETYPE") String str7);

    @C20183f("SIE/AssetVersions.php")
    /* renamed from: c */
    C20089b<C17313s> mo68216c(@C20197t("Q_InterceptID") String str, @C20197t("Q_CLIENTTYPE") String str2, @C20197t("Q_CLIENTVERSION") String str3, @C20197t("Q_DEVICEOS") String str4, @C20197t("Q_DEVICETYPE") String str5);

    @C20183f("SIE/")
    /* renamed from: d */
    C20089b<Void> mo68217d(@C20197t("Q_Click") int i, @C20197t("Q_BID") String str, @C20197t("Q_SIID") String str2, @C20197t("Q_CID") String str3, @C20197t("Q_ASID") String str4, @C20197t("Q_LOC") String str5, @C20197t("r") String str6, @C20197t("Q_CLIENTTYPE") String str7, @C20197t("Q_CLIENTVERSION") String str8, @C20197t("Q_DEVICEOS") String str9, @C20197t("Q_DEVICETYPE") String str10);
}
