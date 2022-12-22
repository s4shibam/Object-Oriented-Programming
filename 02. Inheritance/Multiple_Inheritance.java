/*
Multiple Inheritance

Multiple Inheritance is the process in which a subclass inherits more than one superclass.
*/

interface YouTuber {

    // Public Static Final
    String subs = "25M";

    // Public Abstract
    // Must be defined where YouTuber has been implemented
    void makeVideo();
}

interface Entrepreneur {

    // Public Static Final
    String domain = "FMCG";

    // Public Abstract
    // Must be defined where Entrepreneur has been implemented
    void doBusiness();
}

// Inherited 2 Super Class
class Technical_Guruji implements YouTuber, Entrepreneur {

    String realName = "Gaurav Chaudhary";

    // Defining Interface Abstract method
    public void makeVideo() {

        System.out.println("I make 2 Videos a day!");
    }

    // Defining Interface Abstract method
    public void doBusiness() {

        System.out.println("I handle family business!");
    }

    void show() {

        System.out.println("Name: " + realName);
        makeVideo();
        System.out.println("Subscribers: " + subs);
        doBusiness();
        System.out.println("Business Domain: " + domain);
    }
}

public class Multiple_Inheritance {

    public static void main(String[] args) {

        Technical_Guruji tg = new Technical_Guruji();
        tg.show();
    }
}

/*
 * Output:
 * 
 * Name: Gaurav Chaudhary
 * I make 2 Videos a day!
 * Subscribers: 25M
 * I handle family business!
 * Business Domain: FMCG
 */