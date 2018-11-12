public class Student implements Comparable<Student> {
  
  private String name;
  private String id;

  public Student(String name, String id) {
    this.name = name;
    this.id = id;
  }

  @Override  
  public int compareTo(Student other) {
    if (name.compareTo(other.name) < 0) return -1;
    if (name.compareTo(other.name) > 0) return 1;
    return id.compareTo(other.id);
  }

  @Override
  public int hashCode() {
    int hash = 11;
    hash = 23 * hash + name.hashCode();
    hash = 23 * hash + id.hashCode();
    return hash;
  }

  @Override 
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Student s = (Student) obj;
    return name.equals(s.name) && id.equals(s.id);
  }


  @Override
  public String toString() {
    return "Student Name: " + name + "\tStudent ID: " + id + "\n";
  }
}