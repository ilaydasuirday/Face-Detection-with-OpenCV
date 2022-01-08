import org.opencv.core.*;
import org.opencv.core.Point;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
public class FaceDetection {
    static JFrame frame;
    static JLabel lbl;
    static ImageIcon icon;

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        CascadeClassifier cascadeFaceClassifier = new CascadeClassifier("haarcascade_frontalface_default");
        CascadeClassifier cascadeEyeClassifier = new CascadeClassifier("haarcascade_eye");

        CascadeClassifier cascadeNoseClassifier = new CascadeClassifier("haarcascade_mcs_nose");
        CascadeClassifier cascadeMouthClassifier = new CascadeClassifier("haarcascade_mcs_mouth");
        //Start webcam
        VideoCapture videoDevice = new VideoCapture();
        videoDevice.open(0);

        if (videoDevice.isOpened()) {
            while (true) {
                Mat frameCapture = new Mat();
                videoDevice.read(frameCapture);

                //convert the images and add to frame
                MatOfRect faces = new MatOfRect();
                cascadeFaceClassifier.detectMultiScale(frameCapture, faces);
                //capture faces
                for (Rect rect : faces.toArray()) {
                    Imgproc.putText(frameCapture, "Face", new Point(rect.x, rect.y - 5), 1, 2, new Scalar(0, 0, 255));
                    Imgproc.rectangle(frameCapture, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
                            new Scalar(0, 100, 0), 3);
                }

                //capture eyes
                MatOfRect eyes = new MatOfRect();
                cascadeEyeClassifier.detectMultiScale(frameCapture, eyes);
                for (Rect rect : eyes.toArray()) {
                    Imgproc.putText(frameCapture, "Eye", new Point(rect.x, rect.y - 5), 1, 2, new Scalar(0, 0, 255));
                    Imgproc.rectangle(frameCapture, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
                            new Scalar(200, 200, 100), 2);
                }

               //find noses
                MatOfRect nose = new MatOfRect();
                cascadeNoseClassifier.detectMultiScale(frameCapture, nose);
                for (Rect rect : nose.toArray()) {
                    Imgproc.putText(frameCapture, "Nose", new Point(rect.x, rect.y - 5), 1, 2, new Scalar(0, 0, 255));
                    Imgproc.rectangle(frameCapture, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
                            new Scalar(50, 255, 50), 2);
                }

                //find mouth
			   MatOfRect mouth = new MatOfRect();
				cascadeMouthClassifier.detectMultiScale(frameCapture, mouth);
				for (Rect rect : mouth.toArray()) {
					Imgproc.rectangle(frameCapture, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
							new Scalar(129, 90, 50),2);
				}

                PushImage(ConvertMat2Image(frameCapture));
                System.out.println(String.format("%s face %s eye %s nose %mouth detected.", faces.toArray().length, eyes.toArray().length, nose.toArray().length, mouth.toArray()));
            }
        } else {
            System.out.println("webcam can't started");
            return;
        }
    }


    private static BufferedImage ConvertMat2Image(Mat webcamData) {
        MatOfByte byteWebcamData = new MatOfByte();
        Imgcodecs.imencode(".jpg", webcamData, byteWebcamData);
        byte[] byteArray = byteWebcamData.toArray();
        BufferedImage image = null;
        try {
            InputStream in = new ByteArrayInputStream(byteArray);
            image = ImageIO.read(in);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return image;
    }

    //Bir frame (çerçeve) olu?turur
    public static void createFrame() {
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(700, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void PushImage(Image img2) {
        if (frame == null)
            createFrame();
        if (lbl != null)
            frame.remove(lbl);
        icon = new ImageIcon(img2);
        lbl = new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.revalidate();
    }
}


