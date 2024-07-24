package net.nbc.java.qrcodestringtest.controller;

import kh.gov.nbc.bakong_khqr.BakongKHQR;
import kh.gov.nbc.bakong_khqr.model.CRCValidation;
import kh.gov.nbc.bakong_khqr.model.KHQRDecodeData;
import kh.gov.nbc.bakong_khqr.model.KHQRResponse;
import net.nbc.java.qrcodestringtest.model.QRCodeRequest;
import net.nbc.java.qrcodestringtest.model.QRCodeResponse;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "QRCode API", description = "API for verifying and decoding QR codes")
public class APIqrStringCode {

    @PostMapping("/verify-decode")
    @Operation(summary = "Verify and decode QR code", description = "Verifies and decodes a given QR code")
    public QRCodeResponse verifyAndDecodeQRCode(@RequestBody QRCodeRequest qrCodeRequest) {
        String qrCode = qrCodeRequest.getQrCode();

        KHQRResponse<CRCValidation> verifyResponse = BakongKHQR.verify(qrCode);
        KHQRResponse<KHQRDecodeData> decodeResponse = BakongKHQR.decode(qrCode);

        boolean isValid = verifyResponse.getData().isValid();
        KHQRDecodeData decodedData = decodeResponse.getData();

        return new QRCodeResponse(isValid, decodedData);
    }
}
