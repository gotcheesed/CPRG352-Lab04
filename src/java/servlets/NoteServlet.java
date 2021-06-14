package servlets;

import domain.Note;
import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // track path to any computer
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to read note.txt
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String title = br.readLine();
        String contents = br.readLine();
        br.close();
        
        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        
        String edit = request.getParameter("edit");
        if (edit != null) {
            
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            
        }
        else {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // track path to any computer
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to write to note.txt
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

        String title = request.getParameter("title");
        String contents = request.getParameter("contents");

        pw.write(title + "\n");
        pw.write(contents + "\n");
        pw.close();
        
        Note note = new Note(title, contents);
        request.setAttribute("note", note);

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        
    }

}
