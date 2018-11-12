import java.util.Arrays;

public class TestGenericSorts {
  
  public static void main(String[] args) {

    String [] strings = {"one", "two", "three", "four", "five", "six", 
                         "seven", "eight", "nine", "ten"};

    String [] stuff = Arrays.copyOf(strings, strings.length);
    GenericSorts.selectionSort(stuff);
    GenericSorts.printArray(stuff);

    stuff = Arrays.copyOf(strings, strings.length);
    GenericSorts.insertionSort(stuff);
    GenericSorts.printArray(stuff);

    stuff = Arrays.copyOf(strings, strings.length);
    GenericSorts.bubbleSort(stuff);
    GenericSorts.printArray(stuff);

    stuff = Arrays.copyOf(strings, strings.length);
    GenericSorts.mergeSort(stuff);
    GenericSorts.printArray(stuff);

    stuff = Arrays.copyOf(strings, strings.length);
    GenericSorts.quickSort(stuff);
    GenericSorts.printArray(stuff); 

    Student [] students = new Student[10];
    students[0] = new Student("Bob", "12345");
    students[1] = new Student("Bill", "24567");
    students[2] = new Student("Brenda", "31232");
    students[3] = new Student("Hank", "12356");
    students[4] = new Student("Fred", "27815");
    students[5] = new Student("Jill", "19789");
    students[6] = new Student("Jane", "25345");
    students[7] = new Student("Bob", "45671");
    students[8] = new Student("Hannah", "26175");
    students[9] = new Student("Jill", "18765");

    GenericSorts.quickSort(students);
    GenericSorts.printArray(students);

  }
}