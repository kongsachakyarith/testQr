package net.nbc.java.qrcodestringtest;

import kh.gov.nbc.bakong_khqr.BakongKHQR;
import kh.gov.nbc.bakong_khqr.model.KHQRDecodeData;
import kh.gov.nbc.bakong_khqr.model.KHQRResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class QrCodeStringTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(QrCodeStringTestApplication.class, args);
    }

}
