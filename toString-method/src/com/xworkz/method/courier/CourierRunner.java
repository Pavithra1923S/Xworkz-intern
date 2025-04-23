package com.xworkz.method.courier;

public class CourierRunner {
    public static void main(String[] args) {
        CourierDto dto = new CourierDto();
        dto.setTrackingId(88122);
        dto.setSenderName("Pavithra");
        dto.setReceiverName("Punya");
        dto.setDeliveryCity("Rajajinagar");
        dto.setWeight(2.5);

        System.out.println(dto.toString());
    }
}
