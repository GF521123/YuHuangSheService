package com.gwf.yuhuangshe.serviceImpl;

import com.gwf.yuhuangshe.service.PDF2OtherService;
import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;
import com.sun.org.slf4j.internal.Logger;
import org.springframework.stereotype.Service;

@Service
public class PDF2OtherServiceImpl implements PDF2OtherService {

    public void PDF2Word(){
        PdfDocument pdf = new PdfDocument();
        pdf.loadFromFile("F:\\1.pdf");
        pdf.saveToFile("F:\\1.docx", FileFormat.DOCX);
        System.out.println("转换over");
    }
}
