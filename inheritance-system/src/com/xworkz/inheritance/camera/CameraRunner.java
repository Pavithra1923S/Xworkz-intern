package com.xworkz.inheritance.camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera cam = new Camera();
        cam.clickPhoto();
        cam.recordVideo();

        DSLR dslr = new DSLR();
        dslr.clickPhoto();
        dslr.recordVideo();

        Camera camera = new DSLR();
        System.out.println(camera);

        DSLR dslr1 =(DSLR) camera;
        System.out.println(dslr1);
    }
}
