/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author pb41483
 */
@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
         response.setContentType("text/html;charset=UTF-8");
        List<Person> osoby = new ArrayList<>();
        Person a1=new Person("Jan","Kowalski","jkowalski@zut.edu.pl");
        Person a2=new Person("Marek","alfabet","malfabet@zut.edu.pl");
        Person a3=new Person("Konrad","komas","kkomas@zut.edu.pl");
        Person a4=new Person("AngELIKA","Chleb","achleb@zut.edu.pl");
        Person a5=new Person("Marian","Domozych","mdomozych@zut.edu.pl");
        
         osoby.add(a1);
        osoby.add(a2);
        osoby.add(a3);
        osoby.add(a4);
        osoby.add(a5);
        
        
        
        
        request.setAttribute("osoby", osoby);
         request.getRequestDispatcher("personList.jsp").forward(request, response);
    }


}
