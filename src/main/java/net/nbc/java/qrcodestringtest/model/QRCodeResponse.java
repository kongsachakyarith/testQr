package net.nbc.java.qrcodestringtest.model;

import kh.gov.nbc.bakong_khqr.model.KHQRDecodeData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QRCodeResponse {
    private boolean valid;
    private KHQRDecodeData decodedData;
}
