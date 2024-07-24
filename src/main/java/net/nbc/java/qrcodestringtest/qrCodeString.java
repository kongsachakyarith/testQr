package net.nbc.java.qrcodestringtest;

import kh.gov.nbc.bakong_khqr.BakongKHQR;
import kh.gov.nbc.bakong_khqr.model.CRCValidation;
import kh.gov.nbc.bakong_khqr.model.KHQRDecodeData;
import kh.gov.nbc.bakong_khqr.model.KHQRResponse;
import org.springframework.boot.SpringApplication;

public class qrCodeString {

    public static void main(String[] args) {

        String qrCode = "00020101021115140110555555555530400014jonhsmith@nbcq01061234560208Dev Bank5204599953031165802KH5910Jonh Smith6010Phnom Penh9924011316873168216090203TTT6304EC18 ";

        KHQRResponse<CRCValidation> responses = BakongKHQR.verify(qrCode);

        KHQRResponse<KHQRDecodeData> response = BakongKHQR.decode(qrCode);

        System.out.println("valid: " + responses.getData().isValid());
        System.out.println(response);
    }


}
