package com.law.constitution;

import com.law.constitution.constitution.Constitution;

public class ConstitutionRunner {
    public static void main(String[] args) {
        Constitution constitution1 = new Constitution();
        constitution1.setCountry("India");
        constitution1.setArticles(448);
        constitution1.setSchedules(12);
        constitution1.setAmendments(105);
        constitution1.setAdoptedDate("26 November 1949");
        constitution1.setEffectiveDate("26 January 1950");
        constitution1.setWritten(true);

        Constitution constitution2 = new Constitution();
        constitution2.setCountry("USA");
        constitution2.setArticles(7);
        constitution2.setSchedules(0);
        constitution2.setAmendments(27);
        constitution2.setAdoptedDate("17 September 1787");
        constitution2.setEffectiveDate("4 March 1789");
        constitution2.setWritten(true);

        Constitution constitution3 = new Constitution();
        constitution3.setCountry("UK");
        constitution3.setArticles(0);
        constitution3.setSchedules(0);
        constitution3.setAmendments(0);
        constitution3.setAdoptedDate("Uncodified");
        constitution3.setEffectiveDate("Evolving");
        constitution3.setWritten(false);

        Constitution constitution4 = new Constitution();
        constitution4.setCountry("Germany");
        constitution4.setArticles(146);
        constitution4.setSchedules(0);
        constitution4.setAmendments(62);
        constitution4.setAdoptedDate("23 May 1949");
        constitution4.setEffectiveDate("23 May 1949");
        constitution4.setWritten(true);

        Constitution constitution5 = new Constitution();
        constitution5.setCountry("France");
        constitution5.setArticles(89);
        constitution5.setSchedules(0);
        constitution5.setAmendments(24);
        constitution5.setAdoptedDate("4 October 1958");
        constitution5.setEffectiveDate("4 October 1958");
        constitution5.setWritten(true);

        constitution1.details();
        constitution2.details();
        constitution3.details();
        constitution4.details();
        constitution5.details();
    }
}