package com;

import java.util.logging.Logger;

/**
 * @ProjectName: testlog
 * @Package: com
 * @ClassName: JULlog
 * @Description:
 * @Author: tbf
 * @CreateDate: 2020-09-12 14:43
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-09-12 14:43
 * @UpdateRemark:
 * @Version: 1.0
 */

public class JULlog {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("lavasoft");
        logger.info("aaa");

    }
}
