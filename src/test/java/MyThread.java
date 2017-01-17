/**
 * Copyright @ 2017QIANLONG.
 * All right reserved.
 * Class Name : PACKAGE_NAME
 * Description : weixin-yaavi
 * Author : gaoguoxiang
 * Date : 2016/12/29
 */

public class MyThread extends Thread {

    private SyschronizedObject object;
    public MyThread(SyschronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
