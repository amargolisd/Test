package com.amargolis.attendance.recognition;


import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;

public class CameraService {
    private final OpenCVFrameGrabber grabber;

    public CameraService(OpenCVFrameGrabber grabber) {
        grabber = new OpenCVFrameGrabber(0);
    }

    public void start() throws FrameGrabber.Exception{
        
    }
    public void stop() throws FrameGrabber.Exception{

    }
    public Frame grab() throws FrameGrabber.Exception{
        grabber.frame();
    }
}
