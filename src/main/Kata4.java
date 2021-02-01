package main;
/**
 * @author -_R.S.C_-
 */
import java.io.FileNotFoundException;
import view.MailListReader;
import java.io.IOException;
import view.HistogramDisplay;
import model.Histogram;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mail;

public class Kata4 {
      public static void main(String[] args) {
        //crear new histogram
        Kata4 histograma = new Kata4();
        try {
            histograma.execute();
        } catch (IOException ex) {
            Logger.getLogger(Kata4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //variables aux
    private List<Mail> list;
    private Histogram<String> histogram;
    //execution
    private void execute() throws IOException {
        input();
        process();
        output();
    }
    
    private void input() throws IOException {
        list = MailListReader.read("email.txt");
    }
    
    private void process() throws IOException {
        histogram = view.MailHistogramBuilder.build(list);
    }
    //output
    private void output() throws IOException {
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAM", histogram);
        histo.execute();
    }
}
