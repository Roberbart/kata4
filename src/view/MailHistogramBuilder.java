package view;
/**
 * @author -_R.S.C_-
 */
import java.util.List;
import model.Mail;
import model.Histogram;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> list){
    	//def new histogram
        Histogram<String> histogram = new Histogram();
        for (Mail element : list) histogram.increment(element.getDomain());
     
        return histogram;
    }

}
