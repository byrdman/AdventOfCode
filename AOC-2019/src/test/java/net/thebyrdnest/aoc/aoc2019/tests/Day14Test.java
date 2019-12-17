package net.thebyrdnest.aoc.aoc2019.tests;

import net.thebyrdnest.aoc.aoc2019.Day14;
import org.junit.jupiter.api.*;

public class Day14Test {


    @BeforeAll
    public static void setupBeforeClass() throws Exception {

    }

    @AfterAll
    public static void teardownAfterClass() throws Exception {

    }

    @BeforeEach
    public void setupBeforeEach() throws Exception {

    }

    @AfterEach
    public void tearDownAfterEach() throws Exception {

    }

    String[] myInput = ("5 HLJD, 1 QHSZD, 13 SKZX => 8 MQPH\n" +
            "10 LSLV => 4 JNJHW\n" +
            "1 MQGF, 4 ZWXDQ, 1 GNSZ => 9 DGDH\n" +
            "1 SKZX, 3 DJSP => 1 MCHV\n" +
            "6 TWSR, 10 ZHDFS, 10 LQZXQ => 9 LXQNX\n" +
            "1 FRVW, 1 CJTW => 9 BRCB\n" +
            "20 ZHVNP => 8 XMXL\n" +
            "7 JQJXP => 1 ZGZDW\n" +
            "13 KRCM => 6 KXPQ\n" +
            "4 ZWXDQ, 4 KFKQF, 1 DZDX => 2 MQGF\n" +
            "8 DZDX, 2 ZKGM => 3 KFKQF\n" +
            "3 FXFTB => 8 KVDGP\n" +
            "10 MVGLF, 3 MWFBW, 13 XMXL, 1 CJTW, 2 ZSXJZ, 2 TNCZH, 3 MPFKN, 6 LXQNX => 2 MZMZQ\n" +
            "5 FRVW => 3 NWBTP\n" +
            "1 MVGLF, 2 NLXD, 6 KVDGP, 2 MQPH, 4 FXTJ, 10 TKXKF, 2 FRWV => 2 CSNS\n" +
            "13 TWSR => 9 BNWT\n" +
            "2 KRCM => 7 LSLV\n" +
            "1 ZHDFS, 11 NTVZD, 1 JQJXP => 6 ZHVNP\n" +
            "2 MCHV, 1 JNJHW => 6 NDQNH\n" +
            "32 SMHJH, 6 KXPQ => 1 CJTW\n" +
            "15 FXFTB, 1 MVGLF => 9 MPFKN\n" +
            "119 ORE => 9 KRCM\n" +
            "3 TNCZH => 9 BFQLT\n" +
            "5 MPFKN, 7 TKXKF, 6 JQJXP, 2 DZDX, 16 LCQJ, 4 DGDH, 4 ZGZDW => 7 WVXW\n" +
            "1 ZHDFS, 1 LXQNX => 3 TNCZH\n" +
            "4 ZMVKM, 1 BRQT => 3 QHSZD\n" +
            "24 FRVW, 1 KVDGP, 2 ZLNM => 3 FGLNK\n" +
            "2 KXPQ, 1 LSLV, 22 HNRQ => 5 ZWXDQ\n" +
            "6 ZWXDQ => 1 FRVW\n" +
            "1 FXFTB, 2 MWFBW => 6 ZHDFS\n" +
            "32 FRVW => 5 FRWV\n" +
            "6 FXFTB, 6 NDQNH, 2 MWFBW => 1 JQJXP\n" +
            "9 ZMVKM, 6 QHSZD, 5 LSLV => 4 SMHJH\n" +
            "3 CHKZ => 6 HLJD\n" +
            "21 BFQLT => 6 FXTJ\n" +
            "1 SMHJH, 4 FXFTB => 6 CHKZ\n" +
            "13 FRVW, 13 JQJXP, 1 GNSZ => 8 ZSXJZ\n" +
            "2 NDQNH => 8 NTVZD\n" +
            "3 KRCM => 2 ZKGM\n" +
            "13 ZHDFS, 14 ZWXDQ, 1 CHKZ => 7 LQZXQ\n" +
            "2 BNWT, 3 CHKZ => 7 ZLNM\n" +
            "167 ORE => 1 BRQT\n" +
            "1 LSLV => 3 DZDX\n" +
            "8 MZMZQ, 7 NWBTP, 3 WVXW, 44 MQPH, 3 DJSP, 1 CSNS, 3 BRCB, 32 LQZXQ => 1 FUEL\n" +
            "8 ZLNM => 2 NLXD\n" +
            "30 JQJXP, 9 FGLNK => 7 LCQJ\n" +
            "1 ZKGM, 19 KXPQ => 8 DJSP\n" +
            "4 DJSP => 6 FXFTB\n" +
            "25 NFTPZ => 6 ZMVKM\n" +
            "14 ZHVNP, 1 MVGLF => 9 TKXKF\n" +
            "1 BRQT => 2 SKZX\n" +
            "6 ZKGM => 7 HNRQ\n" +
            "3 DZDX => 5 TWSR\n" +
            "1 SMHJH => 7 MVGLF\n" +
            "3 NDQNH => 1 GNSZ\n" +
            "153 ORE => 9 NFTPZ\n" +
            "14 MCHV, 4 JNJHW, 2 DJSP => 4 MWFBW").split("\n");
}