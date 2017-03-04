package com.aveshcher;

import com.aveshcher.data.model.Book;
import com.aveshcher.data.model.BookDetails;
import com.aveshcher.data.model.Lecture;
import com.aveshcher.data.model.Publisher;
import com.aveshcher.worker.LecturesWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.*;

public class App{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Lecture lecture = new Lecture();
        lecture.setName("Introduction to Spring");
        lecture.setCredits(2.5);
        LecturesWorker worker = (LecturesWorker)context.getBean("worker");
        worker.addLecture(lecture);

        EntityManagerFactory emfactory = (EntityManagerFactory)context.getBean("emf");
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        Publisher publisher1 = new Publisher();
        publisher1.setName("Veselka");
        entitymanager.persist(publisher1);

        Book book1 = new Book();
        book1.setName("Vesna");
        book1.setPublisher(publisher1);
        entitymanager.persist(book1);

        BookDetails bookDetails1 = new BookDetails();
        bookDetails1.setNumberOfPages(451);
        book1.setBookDetails(bookDetails1);
        bookDetails1.setBook(book1);
        entitymanager.persist(bookDetails1);

        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();


    }
}