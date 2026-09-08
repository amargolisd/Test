package com.amargolis.attendance.recognition;

import org.bytedeco.javacv.Frame;

public class CameraTest {

    public static void main(String[] args) throws Exception{

        CameraService camera = new CameraService();

        camera.start();

        Frame frame = camera.grab();

        System.out.println(frame);

        camera.stop();

    }
}
