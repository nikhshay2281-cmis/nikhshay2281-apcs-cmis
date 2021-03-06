package Interface1;

import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)

    {
        MyPhone phone1 = new MyPhone();
        MyPhone phone2 = new MyPhone(8, "Black", "ATT");
        MyPod pod1 = new MyPod();
        MyPod pod2 = new MyPod(16, "White");
        MyCar car1 = new MyCar(50);
        MyCar car2 = new MyCar(4, 100);
        
        ArrayList<Connectable> devices = new ArrayList<Connectable>();
        devices.add(phone1);
        devices.add(phone2);
        devices.add(pod1);
        devices.add(pod2);
        devices.add(car1);
        devices.add(car2);
        
        for(Connectable device: devices)
        {
            System.out.println(device + "\n");
        }
        
        for(Connectable device: devices)
        {
            device.connectToBluetooth();
        }
        
        System.out.println("\n" + car1.discountable());
        System.out.println(car2.discountable());
    }
}