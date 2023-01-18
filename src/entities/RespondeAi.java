package entities;

import java.util.ArrayList;
import java.util.List;

public class RespondeAi {
    private String owner;
    private List<Course> courses = new ArrayList<>();

    public RespondeAi(List<Course> courses) {
        this.owner = "Michel";
        this.courses = courses;
    }

    public String getOwner() {
        return owner;
    }


    public List<Course> getCourses() {
        return courses;
    }

   public void addCourse(Course course) {
        this.courses.add(course);
   }

   public void removeCourse(Integer id) {
        for (Course c : courses) {
            if(c.getId() == id) {
                courses.remove(courses.indexOf(c));
                c.getStudents().clear();
            }
        }
   }

   @Override
    public String toString() {
        return "Bem vindo ao respondeAi\n" +
                "Fundador " + owner + "\n";
   }
}
