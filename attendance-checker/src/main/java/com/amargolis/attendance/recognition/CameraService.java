package com.amargolis.attendance.recognition;


import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;

public class CameraService {
    private final OpenCVFrameGrabber grabber;

    public CameraService() {
        this.grabber = new OpenCVFrameGrabber(0);
    }

    public void start() throws FrameGrabber.Exception{
        grabber.start();
        
    }
    public void stop() throws FrameGrabber.Exception{
        grabber.stop();
    }
    public Frame grab() throws FrameGrabber.Exception{
        return grabber.grabFrame();
    }
    //gitHub branch test
}
