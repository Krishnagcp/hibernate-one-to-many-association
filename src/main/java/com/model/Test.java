package com.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		Transaction tr=null;
		try(Session ses = HBUtil.getSessionFactory().openSession()) {
			tr = ses.beginTransaction();
			Question q1 = new Question();
			q1.setQuestion("What is you favourite food ? ");
			List<Answer> li1= new ArrayList<Answer>();
			Answer a = new Answer(1,"Biriyani","Krish");
			Answer b = new Answer(2,"Mutton fry","Abi");
			Answer c = new Answer(3,"Fish","kavi");
			Answer d = new Answer(4,"Tomato Rice","Hema");
			li1.add(a);
			li1.add(b);
			li1.add(c);
			li1.add(d);
			q1.setAnswers(li1);
			ses.merge(q1);
			
			Question q2 = new Question();
			q2.setQuestion("What is your favourite place?");
			List <Answer> li2 = new ArrayList<>();
			Answer x = new Answer(1,"kangayem","kavi");
			Answer y = new Answer(2,"theni","abhi");
			Answer z = new Answer(3,"paris","Hema");
			li2.add(x); li2.add(y); li2.add(z);
			q2.setAnswers(li2);
			ses.merge(q2);
			tr.commit();
			ses.close();
			

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
