package edu.ucsb.cs56.projects.scrapers.ucsb_curriculum;
import java.util.ArrayList;




import java.net.*;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;
import java.io.*;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;


public class saveLect{
   
	UCSBCurriculumSearch Courses; //loads the courses from a specific (one) department 


    ArrayList<UCSBCurriculumSearch> allClasses = new ArrayList<UCSBCurriculumSearch>(); //an Arraylist of UCSBCurriculumSearches, each item will contain an arrayList of classes from one dept.
    

    String [] subject = {"ANTH" , "ART", "ART CS", "ARTHI", "ARTST", "AS AM", "ASTRO", "BIOL",
				"BIOL CS", "BMSE","BL ST", "CH E", "CHEM CS", "CHEM", "CH ST", "CHIN", "CLASS",
	       		"COMM", "C LIT", "CMPSC", "CMPSCCS", "CMPTG", "CMPTGCS", "CNCSP", "DANCE", "DYNS",
		     	"EARTH", "EACS", "EEMB", "ECON", "ED", "ECE", "ENGR", "ENGL", "ESM", "ENV S", "ESS",
				"ES", "FEMST", "FAMST", "FLMST", "FR", "GEN S", "GEN SCS", "GEOG", "GER", "GPS", "GLOBL",
				"GREEK", "HEB", "HIST", "INT", "INT CS", "ITAL", "JAPAN", "KOR", "LATIN", "LAIS", "LING",
				"LIT", "LIT CS", "MARSC", "MATRL", "MATH", "MATH CS", "ME", "MAT", "ME ST", "MES",
		     "MS", "MCDB", "MUS", "MUS CS", "MUS A", "PHIL", "PHYS", "PHYS CS", "POL S", "PORT", "PSY", "RG ST",
		     "RENST", "SLAV", "SOC", "SPAN", "SHS", "PSTAT", "TMP", "THTR", "WRIT", "W&L", "W&L CS"};



   
    public  void getDeptCourses(){
	try{
	    Courses =  new UCSBCurriculumSearch();
		for(int i=0; i<subject.length;i++){
		    String input = subject[i];
		    Courses.loadCourses(input, "20162", "Undergraduate");
		    allClasses.add(Courses);
		}
	}    catch (Exception e){
	    System.err.println(e);
	    e.printStackTrace();
	}
    }
    

    public void print(){
	for(int i = 0; i < allClasses.size(); i++){
	   allClasses.get(i).printLectures();
	}
    }

}		
				     
