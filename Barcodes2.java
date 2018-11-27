/*
 * This class is part of the book "iText in Action - 2nd Edition"
 * written by Bruno Lowagie (ISBN: 9781935182610)
 * For more info, go to: http://itextpdf.com/examples/
 * This example only works with the AGPL version of iText.
 */

package part3.chapter10;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.BarcodeCodabar;
import com.itextpdf.text.pdf.BarcodeDatamatrix;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.BarcodeEANSUPP;
import com.itextpdf.text.pdf.BarcodeInter25;
import com.itextpdf.text.pdf.BarcodePDF417;
import com.itextpdf.text.pdf.BarcodePostnet;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class Barcodes2 {

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
	public static void main(String[] args) throws IOException, DocumentException {
		new Barcodes2().createPdf(RESULT);
	}

	/**
	 * Creates a PDF document.
	 * 
	 * @param filename
	 *            the path to the new PDF document
	 * @throws DocumentException
	 * @throws IOException
	 */
	public void createPdf(String filename) throws IOException, DocumentException {
		// step 1
		Document document =
				new Document(PageSize.A4);		// step 2
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
		// step 3
		document.open();


		document.add(new Paragraph("Barcode QRCode"));
		BarcodeQRCode qrcode = new BarcodeQRCode("Moby Dick by Herman Melville", 1, 1, null);
		Image img = qrcode.getImage();
		img.setAbsolutePosition(0, 0);
		document.add(img);

		// step 5
		document.close();
	}
}
