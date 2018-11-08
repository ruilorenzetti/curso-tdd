/*
 * This class is part of the book "iText in Action - 2nd Edition"
 * written by Bruno Lowagie (ISBN: 9781935182610)
 * For more info, go to: http://itextpdf.com/examples/
 * This example only works with the AGPL version of iText.
 */

package part3.chapter10;

import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;import com.itextpdf.text.pdf.BarcodePDF417;
import com.itextpdf.text.pdf.BarcodeQRCode;

public class Barcodes {

    /** The resulting PDF. */
    private static final String RESULT = "barcodes.pdf";

    /**
     * Generates a PDF file with different types of barcodes.
     * 
     * @param args
     *            no arguments needed here
     * @throws DocumentException
     * @throws IOException
     */
    public static void main(String[] args) throws IOException,
            DocumentException {
        new Barcodes().createPdf(RESULT);
    }

    /**
     * Creates a PDF document.
     * @param filename the path to the new PDF document
     * @throws    DocumentException 
     * @throws    IOException
     */
    public void createPdf(String filename) throws IOException, DocumentException {
        // step 1
        Document document = new Document(new Rectangle(340, 842));
       
        // step 3
        document.open();
        

        

        // PDF417
        
        BarcodePDF417 pdf417 = new BarcodePDF417();
        
        String text = "Call me Ishmael. Some years ago--never mind how long "
            + "precisely --having little or no money in my purse, and nothing "
            + "particular to interest me on shore, I thought I would sail about "
            + "a little and see the watery part of the world.";
        pdf417.setText(text);
        
        Image img = pdf417.getImage();
        img.scalePercent(50, 50 * pdf417.getYHeight());
               
        document.add(new Paragraph("Barcode QRCode"));
        BarcodeQRCode qrcode = new BarcodeQRCode("Moby Dick by Herman Melville", 1, 1, null);
        img = qrcode.getImage();
        document.add(img);
        
        // step 5
        document.close();
    }
}
