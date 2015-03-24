/**
 * @(#)Article.java
 *This is the Article object class for EduPoli. It
 *contains the Article object and data for said object.
 *
 *
 * @version 1.00 2015/1/23
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Article {

		String urlStr;
		String category;
		String range;
		String title;

    public Article(String URLp, String Cat, String ageR, String t1) {


		 urlStr = URLp;
		 category = Cat;
		 range = ageR;
		 title = t1;

    }

    public URL getURL()
    {

    	URL address = null;
    	try{
         address = new URL(urlStr);

    }catch (MalformedURLException e){
        System.err.println("New URL failed");
        System.err.println("exception thrown: " + e.getMessage());
    }

    	return address;

    }

    public String getUrlString()
    {
    	return urlStr;
    }

    public String getTitle(){
    	return title;
    }

    public String getRange()
    {
    	return range;
    }

    public String getCategory()
    {
    	return category;
    }




}