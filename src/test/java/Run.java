/**
 * Copyright @ 2017QIANLONG.
 * All right reserved.
 * Class Name : PACKAGE_NAME
 * Description : weixin-yaavi
 * Author : gaoguoxiang
 * Date : 2016/12/29
 */

public class Run {
    public static void main(String[] args) {
        try {
            SyschronizedObject syschronizedObject = new SyschronizedObject();
            MyThread myThread = new MyThread(syschronizedObject);
            myThread.start();
            Thread.sleep(500);
            myThread.interrupt();
            System.out.println(syschronizedObject.getUsername() + " " + syschronizedObject.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> System.out.println());

    }
}
