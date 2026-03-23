package SpringAssignment1.service;

import SpringAssignment1.model.Course;
import SpringAssignment1.model.Level;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CourseService {
    private final List<Course> courses = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public CourseService() {
        // 2 Foundation
        addCourse(new Course("COS101F", "Introduction to Computer Science", Level.FOUNDATION));
        addCourse(new Course("COS102F", "Programming Fundamentals", Level.FOUNDATION));

        // 5 Undergraduate
        addCourse(new Course("COS201", "Data Structures and Algorithms", Level.UNDERGRADUATE));
        addCourse(new Course("COS202", "Database Management Systems", Level.UNDERGRADUATE));
        addCourse(new Course("COS203", "Object-Oriented Programming", Level.UNDERGRADUATE));
        addCourse(new Course("COS204", "Computer Networks", Level.UNDERGRADUATE));
        addCourse(new Course("COS205", "Software Engineering", Level.UNDERGRADUATE));

        // 4 Honours
        addCourse(new Course("COS401", "Artificial Intelligence", Level.HONOURS));
        addCourse(new Course("COS402", "Machine Learning", Level.HONOURS));
        addCourse(new Course("COS403", "Big Data Analytics", Level.HONOURS));
        addCourse(new Course("COS404", "Cybersecurity", Level.HONOURS));
    }

    private void addCourse(Course course) {
        course.setId(idGenerator.getAndIncrement());
        courses.add(course);
    }

    public Map<String, List<Course>> getCategorizedCourses() {
        Map<String, List<Course>> map = new HashMap<>();
        map.put("Foundation", courses.stream().filter(c -> c.getLevel() == Level.FOUNDATION).toList());
        map.put("Undergraduate", courses.stream().filter(c -> c.getLevel() == Level.UNDERGRADUATE).toList());
        map.put("Honours", courses.stream().filter(c -> c.getLevel() == Level.HONOURS).toList());
        return map;
    }

    public List<Course> getAllCourses() { return new ArrayList<>(courses); }
    public Course getCourseById(Long id) {
        return courses.stream().filter(c -> c.getId().equals(id))
                .findFirst().orElseThrow(() -> new RuntimeException("Course not found"));
    }
    public Course createCourse(Course course) {
        course.setId(idGenerator.getAndIncrement());
        courses.add(course);
        return course;
    }
    public Course updateCourse(Long id, Course updated) {
        Course existing = getCourseById(id);
        existing.setCode(updated.getCode());
        existing.setName(updated.getName());
        existing.setLevel(updated.getLevel());
        return existing;
    }
    public void deleteCourse(Long id) {
        courses.removeIf(c -> c.getId().equals(id));
    }
}