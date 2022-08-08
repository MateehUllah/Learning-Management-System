import java.io.*;
import java.util.ArrayList;

class AppendObjectOutputStream extends ObjectOutputStream {
    public AppendObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException
    {
        reset();
    }
}

public class Filing {
    public static ArrayList<Student> studentArrayList=new ArrayList<>();
    public static ArrayList<Transcript> transcriptArrayList=new ArrayList<>();
    public static ArrayList<Course> courseArrayList=new ArrayList<>();
    public static ArrayList<Section> sectionArrayList=new ArrayList<>();
    public static ArrayList<Teacher> teacherArrayList=new ArrayList<>();
    public static ArrayList<Registration> registrationArrayList=new ArrayList<>();
    public static ArrayList<AcademicOfficer> academicOfficerArrayList=new ArrayList<>();
    public static ArrayList<Semester> semesterArrayList=new ArrayList<>();
    public static ArrayList<Grade> gradeArrayList=new ArrayList<>();
    public static ArrayList<Attend> attendArrayList=new ArrayList<>();
    public static ArrayList<Marks> marksArrayList=new ArrayList<>();
    public static void setCourseArrayList(ArrayList<Course> courseArrayList) {
        Filing.courseArrayList = courseArrayList;
    }

    public static void setSemesterArrayList(ArrayList<Semester> semesterArrayList) {
        Filing.semesterArrayList = semesterArrayList;
    }

    public static void setAttendArrayList(ArrayList<Attend> attendArrayList) {
        Filing.attendArrayList = attendArrayList;
    }

    public static void setGradeArrayList(ArrayList<Grade> gradeArrayList) {
        Filing.gradeArrayList = gradeArrayList;
    }

    public static void setMarksArrayList(ArrayList<Marks> marksArrayList) {
        Filing.marksArrayList = marksArrayList;
    }

    public static void setSectionArrayList(ArrayList<Section> sectionArrayList) {
        Filing.sectionArrayList = sectionArrayList;
    }

    public static void setRegistrationArrayList(ArrayList<Registration> registrationArrayList) {
        Filing.registrationArrayList = registrationArrayList;
    }

    public static void setStudentArrayList(ArrayList<Student> studentArrayList) {
        Filing.studentArrayList = studentArrayList;
    }

    public static void setTeacherArrayList(ArrayList<Teacher> teacherArrayList) {
        Filing.teacherArrayList = teacherArrayList;
    }

    public static void setTranscriptArrayList(ArrayList<Transcript> transcriptArrayList) {
        Filing.transcriptArrayList = transcriptArrayList;
    }

    public static void write_student() throws IOException {
        for(Student obj: studentArrayList)
        {
            File fileName = new File("Student.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void read_student() throws IOException {
        File temp=new File("Student.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("Student.dat");
        ArrayList<Student> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        Student obj;
        while (true)
        {
            try
            {
                obj = (Student)input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There is no Section");
        }
        setStudentArrayList(objectsList);
    }

    public static void write_transcript() throws IOException {
        for(Transcript obj: transcriptArrayList)
        {
            File fileName = new File("Transcript.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void read_transcript() throws IOException {
        File temp=new File("Transcript.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("Transcript.dat");
        ArrayList<Transcript> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        Transcript obj;
        while (true)
        {
            try
            {
                obj = (Transcript) input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There is no Section");
        }
        setTranscriptArrayList(objectsList);
    }

    public static void write_course() throws IOException {
        for(Course obj: courseArrayList)
        {
            File fileName = new File("Course.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void read_course() throws IOException {
        File temp=new File("Course.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("Course.dat");
        ArrayList<Course> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        Course obj;
        while (true)
        {
            try
            {
                obj = (Course)input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There is no Section");
        }
        setCourseArrayList(objectsList);
    }

    public static void write_section() throws IOException {
        for(Section obj: sectionArrayList)
        {
            File fileName = new File("Section.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void read_section() throws IOException {
        File temp=new File("Section.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("Section.dat");
        ArrayList<Section> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        Section obj;
        while (true)
        {
            try
            {
                obj = (Section) input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There is no Section");
        }
        setSectionArrayList(objectsList);
    }

    public static void write_teacher() throws IOException {
        for(Teacher obj: teacherArrayList)
        {
            File fileName = new File("Teacher.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void read_teacher() throws IOException {
        File temp=new File("Teacher.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("Teacher.dat");
        ArrayList<Teacher> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        Teacher obj;
        while (true)
        {
            try
            {
                obj = (Teacher) input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There is no Teacher");
        }
        setTeacherArrayList(objectsList);
    }

    public static void write_registeration() throws IOException {
        for(Registration obj:registrationArrayList)
        {
            File fileName = new File("Registeration.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void read_registeration() throws IOException {
        File temp=new File("Registeration.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("Registeration.dat");
        ArrayList<Registration> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        Registration obj;
        while (true)
        {
            try
            {
                obj = (Registration) input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There is no Registeration");
        }
        setRegistrationArrayList(objectsList);
    }
    public static void write_academicOfficer() throws IOException {
        for(AcademicOfficer obj: academicOfficerArrayList)
        {
            File fileName = new File("AcademicOfficer.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void read_academicOfficer() throws IOException {
        File temp=new File("AcademicOfficer.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("AcademicOfficer.dat");
        ArrayList<AcademicOfficer> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        AcademicOfficer obj;
        while (true)
        {
            try
            {
                obj = (AcademicOfficer)input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There is no Academic Officer");
        }
        setAcademicOfficerArrayList(objectsList);
    }

    private static void setAcademicOfficerArrayList(ArrayList<AcademicOfficer> objectsList) {
        academicOfficerArrayList = objectsList;
    }
    public static void read_semester() throws IOException {
        File temp=new File("Semester.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("Semester.dat");
        ArrayList<Semester> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        Semester obj;
        while (true)
        {
            try
            {
                obj = (Semester) input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There is no Semester");
        }
        setSemesterArrayList(objectsList);
    }
    public static void view_all_courses(){
        System.out.println("[INFO]\t All Courses");
        for(int i=0; i<Filing.courseArrayList.size(); i++) {
            System.out.println("> Code: " + Filing.courseArrayList.get(i).get_code() + " Course: " + Filing.courseArrayList.get(i).get_name() + "Sections: ");
            Filing.courseArrayList.get(i).displaySections();
        }
    }
    public static void write_semester() throws IOException {
        for(Semester obj:semesterArrayList)
        {
            File fileName = new File("Semester.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void write_Grade() throws IOException {
        for(Grade obj:gradeArrayList)
        {
            File fileName = new File("Grade.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void write_Attend() throws IOException {
        for(Attend obj:attendArrayList)
        {
            File fileName = new File("Attend.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void write_Marks() throws IOException {
        for(Marks obj:marksArrayList)
        {
            File fileName = new File("Marks.dat");
            if (fileName.exists()) {
                AppendObjectOutputStream handle = null;
                handle = new AppendObjectOutputStream(new FileOutputStream(fileName, true));
                handle.writeObject(obj);
                handle.flush();
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(obj);
                oos.flush();
                oos.close();
            }
        }
    }
    public static void read_marks() throws IOException {
        File temp=new File("Marks.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("Marks.dat");
        ArrayList<Marks> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        Marks obj;
        while (true)
        {
            try
            {
                obj = (Marks) input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There are no Marks");
        }
        setMarksArrayList(objectsList);
    }
    public static void read_attend() throws IOException {
        File temp=new File("Attend.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("Attend.dat");
        ArrayList<Attend> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        Attend obj;
        while (true)
        {
            try
            {
                obj = (Attend) input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There is no attendence");
        }
       setAttendArrayList(objectsList);
    }
    public static void read_grade() throws IOException {
        File temp=new File("Grade.dat");
        if(!temp.exists())
        {
            System.out.println("Data doesn't exist");
            return;
        }
        FileInputStream file_obj = new FileInputStream("Grade.dat");
        ArrayList<Grade> objectsList = new ArrayList<>();
        ObjectInputStream input = new ObjectInputStream(file_obj);
        Grade obj;
        while (true)
        {
            try
            {
                obj = (Grade) input.readObject();
                objectsList.add(obj);
            }
            catch (Exception e)
            {
                break;
            }

        }
        if(objectsList.size()==0)
        {
            System.out.println("There are no Grade");
        }
        setGradeArrayList(objectsList);
    }
}
