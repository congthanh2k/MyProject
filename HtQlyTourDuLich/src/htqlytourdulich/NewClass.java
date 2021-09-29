/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htqlytourdulich;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Thanh
 */
public class NewClass {

    public static void main(String[] args) throws FileNotFoundException {
        Document document = new Document();
        try {
            PdfWriter instance = PdfWriter.getInstance(document,new FileOutputStream("D:\\HelloWorld.pdf"));
        } catch (DocumentException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
            document.open();
            PdfPTable table = new PdfPTable(6);
            PdfPCell header1 = new PdfPCell(new Paragraph("Header 1"));
            PdfPCell header2 = new PdfPCell(new Paragraph("Header 2"));
            PdfPCell header3 = new PdfPCell(new Paragraph("Header 3"));
            PdfPCell header4 = new PdfPCell(new Paragraph("Header 4"));
            PdfPCell header5 = new PdfPCell(new Paragraph("Header 5"));
            PdfPCell header6 = new PdfPCell(new Paragraph("Header 6"));
            table.addCell(header1);
            table.addCell(header2);
            table.addCell(header3);
            table.addCell(header4);
            table.addCell(header5);
            table.addCell(header6);
            table.addCell("1");
            table.addCell("2");
            table.addCell("3");
            table.addCell("1");
            table.addCell("2");
            table.addCell("3");
            document.add(table);
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        
    }
}
