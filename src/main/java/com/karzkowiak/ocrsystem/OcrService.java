package com.karzkowiak.ocrsystem;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import net.sourceforge.tess4j.*;

import javax.imageio.ImageIO;

public class OcrService {

    public String doOCR(String url) {
        try {
            URL imageURL = new URL(url);
            BufferedImage bufferedImage = ImageIO.read(imageURL);
            ITesseract instance = new Tesseract();
            instance.setDatapath("C:\\Users\\alicj\\Downloads");
            instance.setLanguage("pol");
            return instance.doOCR(bufferedImage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}